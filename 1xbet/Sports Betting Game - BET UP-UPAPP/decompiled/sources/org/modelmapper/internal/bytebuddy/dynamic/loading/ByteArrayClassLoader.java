package org.modelmapper.internal.bytebuddy.dynamic.loading;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.JavaModule;

/* loaded from: classes4.dex */
public class ByteArrayClassLoader extends InjectionClassLoader {
    private static final int FROM_BEGINNING = 0;
    private static final URL NO_URL = null;
    private static final PackageLookupStrategy PACKAGE_LOOKUP_STRATEGY = (PackageLookupStrategy) AccessController.doPrivileged(PackageLookupStrategy.CreationAction.INSTANCE);
    protected static final SynchronizationStrategy.Initializable SYNCHRONIZATION_STRATEGY = (SynchronizationStrategy.Initializable) AccessController.doPrivileged(SynchronizationStrategy.CreationAction.INSTANCE);
    private static final Class<?> UNLOADED_TYPE = null;
    public static final String URL_SCHEMA = "bytebuddy";
    protected final AccessControlContext accessControlContext;
    protected final ClassFileTransformer classFileTransformer;
    protected final PackageDefinitionStrategy packageDefinitionStrategy;
    protected final PersistenceHandler persistenceHandler;
    protected final ProtectionDomain protectionDomain;
    protected final ConcurrentMap<String, byte[]> typeDefinitions;

    public ByteArrayClassLoader(ClassLoader classLoader, Map<String, byte[]> map) {
        this(classLoader, true, map);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, boolean z, Map<String, byte[]> map) {
        this(classLoader, z, map, PersistenceHandler.LATENT);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, Map<String, byte[]> map, PersistenceHandler persistenceHandler) {
        this(classLoader, true, map, persistenceHandler);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, boolean z, Map<String, byte[]> map, PersistenceHandler persistenceHandler) {
        this(classLoader, z, map, ClassLoadingStrategy.NO_PROTECTION_DOMAIN, persistenceHandler, PackageDefinitionStrategy.Trivial.INSTANCE);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy) {
        this(classLoader, true, map, protectionDomain, persistenceHandler, packageDefinitionStrategy);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, boolean z, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy) {
        this(classLoader, z, map, protectionDomain, persistenceHandler, packageDefinitionStrategy, NoOpClassFileTransformer.INSTANCE);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy, ClassFileTransformer classFileTransformer) {
        this(classLoader, true, map, protectionDomain, persistenceHandler, packageDefinitionStrategy, classFileTransformer);
    }

    public ByteArrayClassLoader(ClassLoader classLoader, boolean z, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy, ClassFileTransformer classFileTransformer) {
        super(classLoader, z);
        this.typeDefinitions = new ConcurrentHashMap(map);
        this.protectionDomain = protectionDomain;
        this.persistenceHandler = persistenceHandler;
        this.packageDefinitionStrategy = packageDefinitionStrategy;
        this.classFileTransformer = classFileTransformer;
        this.accessControlContext = AccessController.getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object methodHandle() throws Exception {
        return Class.forName("java.lang.invoke.MethodHandles").getMethod("lookup", new Class[0]).invoke(null, new Object[0]);
    }

    public static Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
        return load(classLoader, map, ClassLoadingStrategy.NO_PROTECTION_DOMAIN, PersistenceHandler.LATENT, PackageDefinitionStrategy.Trivial.INSTANCE, false, true);
    }

    public static Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
            hashMap.put(entry.getKey().getName(), entry.getValue());
        }
        ByteArrayClassLoader byteArrayClassLoader = new ByteArrayClassLoader(classLoader, z2, hashMap, protectionDomain, persistenceHandler, packageDefinitionStrategy, NoOpClassFileTransformer.INSTANCE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TypeDescription typeDescription : map.keySet()) {
            try {
                Class<?> cls = Class.forName(typeDescription.getName(), false, byteArrayClassLoader);
                if (z && cls.getClassLoader() != byteArrayClassLoader) {
                    throw new IllegalStateException("Class already loaded: " + cls);
                }
                linkedHashMap.put(typeDescription, cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Cannot load class " + typeDescription, e);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader
    protected Map<String, Class<?>> doDefineClasses(Map<String, byte[]> map) throws ClassNotFoundException {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), this.typeDefinitions.putIfAbsent(entry.getKey(), entry.getValue()));
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : map.keySet()) {
                synchronized (SYNCHRONIZATION_STRATEGY.initialize().getClassLoadingLock(this, str)) {
                    linkedHashMap.put(str, loadClass(str));
                }
            }
            return linkedHashMap;
        } finally {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (entry2.getValue() == null) {
                    this.persistenceHandler.release((String) entry2.getKey(), this.typeDefinitions);
                } else {
                    this.typeDefinitions.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
    }

    @Override // java.lang.ClassLoader
    protected Class<?> findClass(String str) throws ClassNotFoundException {
        byte[] lookup = this.persistenceHandler.lookup(str, this.typeDefinitions);
        if (lookup == null) {
            throw new ClassNotFoundException(str);
        }
        try {
            byte[] transform = this.classFileTransformer.transform(this, str, UNLOADED_TYPE, this.protectionDomain, lookup);
            if (transform != null) {
                lookup = transform;
            }
            return (Class) AccessController.doPrivileged(new ClassDefinitionAction(str, lookup), this.accessControlContext);
        } catch (IllegalClassFormatException e) {
            throw new IllegalStateException("The class file for " + str + " is not legal", e);
        }
    }

    @Override // java.lang.ClassLoader
    protected URL findResource(String str) {
        return this.persistenceHandler.url(str, this.typeDefinitions);
    }

    @Override // java.lang.ClassLoader
    protected Enumeration<URL> findResources(String str) {
        URL url = this.persistenceHandler.url(str, this.typeDefinitions);
        return url == null ? EmptyEnumeration.INSTANCE : new SingletonEnumeration(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Package doGetPackage(String str) {
        return getPackage(str);
    }

    protected interface SynchronizationStrategy {

        public enum ForLegacyVm implements SynchronizationStrategy, Initializable {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public Object getClassLoadingLock(ByteArrayClassLoader byteArrayClassLoader, String str) {
                return byteArrayClassLoader;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable
            public SynchronizationStrategy initialize() {
                return this;
            }
        }

        public interface Initializable {
            SynchronizationStrategy initialize();
        }

        Object getClassLoadingLock(ByteArrayClassLoader byteArrayClassLoader, String str);

        public enum CreationAction implements PrivilegedAction<Initializable> {
            INSTANCE;

            @Override // java.security.PrivilegedAction
            public Initializable run() {
                try {
                    try {
                        Class<?> cls = Class.forName("java.lang.invoke.MethodType");
                        Class<?> cls2 = Class.forName("java.lang.invoke.MethodHandle");
                        return new ForJava8CapableVm(Class.forName("java.lang.invoke.MethodHandles$Lookup").getMethod("findVirtual", Class.class, String.class, cls).invoke(ByteArrayClassLoader.methodHandle(), ClassLoader.class, "getClassLoadingLock", cls.getMethod("methodType", Class.class, Class[].class).invoke(null, Object.class, new Class[]{String.class})), cls2.getMethod("bindTo", Object.class), cls2.getMethod("invokeWithArguments", Object[].class));
                    } catch (Exception unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                } catch (Exception unused2) {
                    return new ForJava7CapableVm(ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForJava7CapableVm implements SynchronizationStrategy, Initializable {
            private final Method method;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.method.equals(((ForJava7CapableVm) obj).method);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.method.hashCode();
            }

            protected ForJava7CapableVm(Method method) {
                this.method = method;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public Object getClassLoadingLock(ByteArrayClassLoader byteArrayClassLoader, String str) {
                try {
                    return this.method.invoke(byteArrayClassLoader, str);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access class loading lock for " + str + " on " + byteArrayClassLoader, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Error when getting " + str + " on " + byteArrayClassLoader, e2);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable
            public SynchronizationStrategy initialize() {
                try {
                    this.method.setAccessible(true);
                    return this;
                } catch (Exception unused) {
                    return ForLegacyVm.INSTANCE;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForJava8CapableVm implements SynchronizationStrategy, Initializable {
            private final Method bindTo;
            private final Method invokeWithArguments;
            private final Object methodHandle;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForJava8CapableVm forJava8CapableVm = (ForJava8CapableVm) obj;
                return this.methodHandle.equals(forJava8CapableVm.methodHandle) && this.bindTo.equals(forJava8CapableVm.bindTo) && this.invokeWithArguments.equals(forJava8CapableVm.invokeWithArguments);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodHandle.hashCode()) * 31) + this.bindTo.hashCode()) * 31) + this.invokeWithArguments.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable
            public SynchronizationStrategy initialize() {
                return this;
            }

            protected ForJava8CapableVm(Object obj, Method method, Method method2) {
                this.methodHandle = obj;
                this.bindTo = method;
                this.invokeWithArguments = method2;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public Object getClassLoadingLock(ByteArrayClassLoader byteArrayClassLoader, String str) {
                try {
                    return this.invokeWithArguments.invoke(this.bindTo.invoke(this.methodHandle, byteArrayClassLoader), new Object[]{str});
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access class loading lock for " + str + " on " + byteArrayClassLoader, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Error when getting " + str + " on " + byteArrayClassLoader, e2);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class ClassDefinitionAction implements PrivilegedAction<Class<?>> {
        private final byte[] binaryRepresentation;
        private final String name;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ClassDefinitionAction classDefinitionAction = (ClassDefinitionAction) obj;
            return this.name.equals(classDefinitionAction.name) && Arrays.equals(this.binaryRepresentation, classDefinitionAction.binaryRepresentation) && ByteArrayClassLoader.this.equals(ByteArrayClassLoader.this);
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation)) * 31) + ByteArrayClassLoader.this.hashCode();
        }

        protected ClassDefinitionAction(String str, byte[] bArr) {
            this.name = str;
            this.binaryRepresentation = bArr;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.security.PrivilegedAction
        public Class<?> run() {
            int lastIndexOf = this.name.lastIndexOf(46);
            if (lastIndexOf != -1) {
                String substring = this.name.substring(0, lastIndexOf);
                PackageDefinitionStrategy.Definition define = ByteArrayClassLoader.this.packageDefinitionStrategy.define(ByteArrayClassLoader.this, substring, this.name);
                if (define.isDefined()) {
                    Package apply = ByteArrayClassLoader.PACKAGE_LOOKUP_STRATEGY.apply(ByteArrayClassLoader.this, substring);
                    if (apply == null) {
                        ByteArrayClassLoader.this.definePackage(substring, define.getSpecificationTitle(), define.getSpecificationVersion(), define.getSpecificationVendor(), define.getImplementationTitle(), define.getImplementationVersion(), define.getImplementationVendor(), define.getSealBase());
                    } else if (!define.isCompatibleTo(apply)) {
                        throw new SecurityException("Sealing violation for package " + substring);
                    }
                }
            }
            ByteArrayClassLoader byteArrayClassLoader = ByteArrayClassLoader.this;
            String str = this.name;
            byte[] bArr = this.binaryRepresentation;
            return byteArrayClassLoader.defineClass(str, bArr, 0, bArr.length, byteArrayClassLoader.protectionDomain);
        }
    }

    protected interface PackageLookupStrategy {
        Package apply(ByteArrayClassLoader byteArrayClassLoader, String str);

        public enum CreationAction implements PrivilegedAction<PackageLookupStrategy> {
            INSTANCE;

            @Override // java.security.PrivilegedAction
            public PackageLookupStrategy run() {
                if (JavaModule.isSupported()) {
                    try {
                        return new ForJava9CapableVm(ClassLoader.class.getMethod("getDefinedPackage", String.class));
                    } catch (Exception unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
                return ForLegacyVm.INSTANCE;
            }
        }

        public enum ForLegacyVm implements PackageLookupStrategy {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy
            public Package apply(ByteArrayClassLoader byteArrayClassLoader, String str) {
                return byteArrayClassLoader.doGetPackage(str);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForJava9CapableVm implements PackageLookupStrategy {
            private final Method getDefinedPackage;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.getDefinedPackage.equals(((ForJava9CapableVm) obj).getDefinedPackage);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getDefinedPackage.hashCode();
            }

            protected ForJava9CapableVm(Method method) {
                this.getDefinedPackage = method;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy
            public Package apply(ByteArrayClassLoader byteArrayClassLoader, String str) {
                try {
                    return (Package) this.getDefinedPackage.invoke(byteArrayClassLoader, str);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Cannot access " + this.getDefinedPackage, e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Cannot invoke " + this.getDefinedPackage, e2.getCause());
                }
            }
        }
    }

    public enum PersistenceHandler {
        MANIFEST(true) { // from class: org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.1
            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            protected void release(String str, ConcurrentMap<String, byte[]> concurrentMap) {
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            protected byte[] lookup(String str, ConcurrentMap<String, byte[]> concurrentMap) {
                return concurrentMap.get(str);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            protected URL url(String str, ConcurrentMap<String, byte[]> concurrentMap) {
                if (!str.endsWith(".class")) {
                    return ByteArrayClassLoader.NO_URL;
                }
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                byte[] bArr = concurrentMap.get(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).substring(0, str.length() - ".class".length()));
                if (bArr == null) {
                    return ByteArrayClassLoader.NO_URL;
                }
                return (URL) AccessController.doPrivileged(new UrlDefinitionAction(str, bArr));
            }
        },
        LATENT(0 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.2
            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            protected byte[] lookup(String str, ConcurrentMap<String, byte[]> concurrentMap) {
                return concurrentMap.remove(str);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            protected URL url(String str, ConcurrentMap<String, byte[]> concurrentMap) {
                return ByteArrayClassLoader.NO_URL;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            protected void release(String str, ConcurrentMap<String, byte[]> concurrentMap) {
                concurrentMap.remove(str);
            }
        };

        private static final String CLASS_FILE_SUFFIX = ".class";
        private final boolean manifest;

        protected abstract byte[] lookup(String str, ConcurrentMap<String, byte[]> concurrentMap);

        protected abstract void release(String str, ConcurrentMap<String, byte[]> concurrentMap);

        protected abstract URL url(String str, ConcurrentMap<String, byte[]> concurrentMap);

        PersistenceHandler(boolean z) {
            this.manifest = z;
        }

        public boolean isManifest() {
            return this.manifest;
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class UrlDefinitionAction implements PrivilegedAction<URL> {
            private static final String ENCODING = "UTF-8";
            private static final String NO_FILE = "";
            private static final int NO_PORT = -1;
            private final byte[] binaryRepresentation;
            private final String typeName;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UrlDefinitionAction urlDefinitionAction = (UrlDefinitionAction) obj;
                return this.typeName.equals(urlDefinitionAction.typeName) && Arrays.equals(this.binaryRepresentation, urlDefinitionAction.binaryRepresentation);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeName.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation);
            }

            protected UrlDefinitionAction(String str, byte[] bArr) {
                this.typeName = str;
                this.binaryRepresentation = bArr;
            }

            @Override // java.security.PrivilegedAction
            public URL run() {
                try {
                    return new URL(ByteArrayClassLoader.URL_SCHEMA, URLEncoder.encode(this.typeName.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), "UTF-8"), -1, "", new ByteArrayUrlStreamHandler(this.binaryRepresentation));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException("Could not find encoding: UTF-8", e);
                } catch (MalformedURLException e2) {
                    throw new IllegalStateException("Cannot create URL for " + this.typeName, e2);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class ByteArrayUrlStreamHandler extends URLStreamHandler {
                private final byte[] binaryRepresentation;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && Arrays.equals(this.binaryRepresentation, ((ByteArrayUrlStreamHandler) obj).binaryRepresentation);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.binaryRepresentation);
                }

                protected ByteArrayUrlStreamHandler(byte[] bArr) {
                    this.binaryRepresentation = bArr;
                }

                @Override // java.net.URLStreamHandler
                protected URLConnection openConnection(URL url) {
                    return new ByteArrayUrlConnection(url, new ByteArrayInputStream(this.binaryRepresentation));
                }

                protected static class ByteArrayUrlConnection extends URLConnection {
                    private final InputStream inputStream;

                    protected ByteArrayUrlConnection(URL url, InputStream inputStream) {
                        super(url);
                        this.inputStream = inputStream;
                    }

                    @Override // java.net.URLConnection
                    public void connect() {
                        this.connected = true;
                    }

                    @Override // java.net.URLConnection
                    public InputStream getInputStream() {
                        connect();
                        return this.inputStream;
                    }
                }
            }
        }
    }

    public static class ChildFirst extends ByteArrayClassLoader {
        private static final String CLASS_FILE_SUFFIX = ".class";

        public ChildFirst(ClassLoader classLoader, Map<String, byte[]> map) {
            super(classLoader, map);
        }

        public ChildFirst(ClassLoader classLoader, boolean z, Map<String, byte[]> map) {
            super(classLoader, z, map);
        }

        public ChildFirst(ClassLoader classLoader, Map<String, byte[]> map, PersistenceHandler persistenceHandler) {
            super(classLoader, map, persistenceHandler);
        }

        public ChildFirst(ClassLoader classLoader, boolean z, Map<String, byte[]> map, PersistenceHandler persistenceHandler) {
            super(classLoader, z, map, persistenceHandler);
        }

        public ChildFirst(ClassLoader classLoader, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy) {
            super(classLoader, map, protectionDomain, persistenceHandler, packageDefinitionStrategy);
        }

        public ChildFirst(ClassLoader classLoader, boolean z, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy) {
            super(classLoader, z, map, protectionDomain, persistenceHandler, packageDefinitionStrategy);
        }

        public ChildFirst(ClassLoader classLoader, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy, ClassFileTransformer classFileTransformer) {
            super(classLoader, map, protectionDomain, persistenceHandler, packageDefinitionStrategy, classFileTransformer);
        }

        public ChildFirst(ClassLoader classLoader, boolean z, Map<String, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy, ClassFileTransformer classFileTransformer) {
            super(classLoader, z, map, protectionDomain, persistenceHandler, packageDefinitionStrategy, classFileTransformer);
        }

        public static Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return load(classLoader, map, ClassLoadingStrategy.NO_PROTECTION_DOMAIN, PersistenceHandler.LATENT, PackageDefinitionStrategy.Trivial.INSTANCE, false, true);
        }

        public static Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map, ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy packageDefinitionStrategy, boolean z, boolean z2) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                hashMap.put(entry.getKey().getName(), entry.getValue());
            }
            ChildFirst childFirst = new ChildFirst(classLoader, z2, hashMap, protectionDomain, persistenceHandler, packageDefinitionStrategy, NoOpClassFileTransformer.INSTANCE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (TypeDescription typeDescription : map.keySet()) {
                try {
                    Class<?> cls = Class.forName(typeDescription.getName(), false, childFirst);
                    if (z && cls.getClassLoader() != childFirst) {
                        throw new IllegalStateException("Class already loaded: " + cls);
                    }
                    linkedHashMap.put(typeDescription, cls);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Cannot load class " + typeDescription, e);
                }
            }
            return linkedHashMap;
        }

        @Override // java.lang.ClassLoader
        protected Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            synchronized (SYNCHRONIZATION_STRATEGY.initialize().getClassLoadingLock(this, str)) {
                Class<?> findLoadedClass = findLoadedClass(str);
                if (findLoadedClass != null) {
                    return findLoadedClass;
                }
                try {
                    Class<?> findClass = findClass(str);
                    if (z) {
                        resolveClass(findClass);
                    }
                    return findClass;
                } catch (ClassNotFoundException unused) {
                    return super.loadClass(str, z);
                }
            }
        }

        @Override // java.lang.ClassLoader
        public URL getResource(String str) {
            URL url = this.persistenceHandler.url(str, this.typeDefinitions);
            return (url != null || isShadowed(str)) ? url : super.getResource(str);
        }

        @Override // java.lang.ClassLoader
        public Enumeration<URL> getResources(String str) throws IOException {
            URL url = this.persistenceHandler.url(str, this.typeDefinitions);
            if (url == null) {
                return super.getResources(str);
            }
            return new PrependingEnumeration(url, super.getResources(str));
        }

        private boolean isShadowed(String str) {
            boolean z = false;
            if (this.persistenceHandler.isManifest() || !str.endsWith(".class")) {
                return false;
            }
            synchronized (this) {
                String substring = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).substring(0, str.length() - ".class".length());
                if (this.typeDefinitions.containsKey(substring)) {
                    return true;
                }
                Class findLoadedClass = findLoadedClass(substring);
                if (findLoadedClass != null && findLoadedClass.getClassLoader() == this) {
                    z = true;
                }
                return z;
            }
        }

        protected static class PrependingEnumeration implements Enumeration<URL> {
            private final Enumeration<URL> enumeration;
            private URL nextElement;

            protected PrependingEnumeration(URL url, Enumeration<URL> enumeration) {
                this.nextElement = url;
                this.enumeration = enumeration;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.nextElement != null && this.enumeration.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public URL nextElement() {
                if (this.nextElement != null && this.enumeration.hasMoreElements()) {
                    try {
                        return this.nextElement;
                    } finally {
                        this.nextElement = this.enumeration.nextElement();
                    }
                }
                throw new NoSuchElementException();
            }
        }
    }

    protected enum EmptyEnumeration implements Enumeration<URL> {
        INSTANCE;

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public URL nextElement() {
            throw new NoSuchElementException();
        }
    }

    protected static class SingletonEnumeration implements Enumeration<URL> {
        private URL element;

        protected SingletonEnumeration(URL url) {
            this.element = url;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.element != null;
        }

        @Override // java.util.Enumeration
        public URL nextElement() {
            URL url = this.element;
            if (url == null) {
                throw new NoSuchElementException();
            }
            this.element = null;
            return url;
        }
    }
}
