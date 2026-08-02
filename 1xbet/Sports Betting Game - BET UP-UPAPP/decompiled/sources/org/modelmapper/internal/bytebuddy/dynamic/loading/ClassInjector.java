package org.modelmapper.internal.bytebuddy.dynamic.loading;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;
import java.net.URL;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.FixedValue;
import org.modelmapper.internal.bytebuddy.implementation.MethodCall;
import org.modelmapper.internal.bytebuddy.utility.JavaModule;
import org.modelmapper.internal.bytebuddy.utility.JavaType;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

/* loaded from: classes4.dex */
public interface ClassInjector {
    public static final boolean ALLOW_EXISTING_TYPES = false;

    Map<TypeDescription, Class<?>> inject(Map<? extends TypeDescription, byte[]> map);

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingReflection implements ClassInjector {
        private static final Dispatcher.Initializable DISPATCHER = (Dispatcher.Initializable) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        private final ClassLoader classLoader;
        private final boolean forbidExisting;
        private final PackageDefinitionStrategy packageDefinitionStrategy;

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ProtectionDomain protectionDomain;

        /* JADX WARN: Code restructure failed: missing block: B:28:0x002f, code lost:
        
            if (r2 != null) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UsingReflection usingReflection = (UsingReflection) obj;
            if (!this.classLoader.equals(usingReflection.classLoader)) {
                return false;
            }
            ProtectionDomain protectionDomain = this.protectionDomain;
            ProtectionDomain protectionDomain2 = usingReflection.protectionDomain;
            if (protectionDomain2 != null) {
                if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                    return false;
                }
                return this.packageDefinitionStrategy.equals(usingReflection.packageDefinitionStrategy) && this.forbidExisting == usingReflection.forbidExisting;
            }
        }

        public int hashCode() {
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classLoader.hashCode()) * 31;
            ProtectionDomain protectionDomain = this.protectionDomain;
            if (protectionDomain != null) {
                hashCode += protectionDomain.hashCode();
            }
            return (((hashCode * 31) + this.packageDefinitionStrategy.hashCode()) * 31) + (this.forbidExisting ? 1 : 0);
        }

        public UsingReflection(ClassLoader classLoader) {
            this(classLoader, ClassLoadingStrategy.NO_PROTECTION_DOMAIN);
        }

        public UsingReflection(ClassLoader classLoader, ProtectionDomain protectionDomain) {
            this(classLoader, protectionDomain, PackageDefinitionStrategy.Trivial.INSTANCE, false);
        }

        public UsingReflection(ClassLoader classLoader, ProtectionDomain protectionDomain, PackageDefinitionStrategy packageDefinitionStrategy, boolean z) {
            if (classLoader == null) {
                throw new IllegalArgumentException("Cannot inject classes into the bootstrap class loader");
            }
            this.classLoader = classLoader;
            this.protectionDomain = protectionDomain;
            this.packageDefinitionStrategy = packageDefinitionStrategy;
            this.forbidExisting = z;
        }

        public static boolean isAvailable() {
            return DISPATCHER.isAvailable();
        }

        public static ClassInjector ofSystemClassLoader() {
            return new UsingReflection(ClassLoader.getSystemClassLoader());
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector
        public Map<TypeDescription, Class<?>> inject(Map<? extends TypeDescription, byte[]> map) {
            Dispatcher initialize = DISPATCHER.initialize();
            HashMap hashMap = new HashMap();
            for (Map.Entry<? extends TypeDescription, byte[]> entry : map.entrySet()) {
                String name = entry.getKey().getName();
                synchronized (initialize.getClassLoadingLock(this.classLoader, name)) {
                    Class<?> findClass = initialize.findClass(this.classLoader, name);
                    if (findClass == null) {
                        int lastIndexOf = name.lastIndexOf(46);
                        if (lastIndexOf != -1) {
                            String substring = name.substring(0, lastIndexOf);
                            PackageDefinitionStrategy.Definition define = this.packageDefinitionStrategy.define(this.classLoader, substring, name);
                            if (define.isDefined()) {
                                Package r3 = initialize.getPackage(this.classLoader, substring);
                                if (r3 == null) {
                                    initialize.definePackage(this.classLoader, substring, define.getSpecificationTitle(), define.getSpecificationVersion(), define.getSpecificationVendor(), define.getImplementationTitle(), define.getImplementationVersion(), define.getImplementationVendor(), define.getSealBase());
                                } else if (!define.isCompatibleTo(r3)) {
                                    throw new SecurityException("Sealing violation for package " + substring);
                                }
                            }
                        }
                        findClass = initialize.defineClass(this.classLoader, name, entry.getValue(), this.protectionDomain);
                    } else if (this.forbidExisting) {
                        throw new IllegalStateException("Cannot inject already loaded type: " + findClass);
                    }
                    hashMap.put(entry.getKey(), findClass);
                }
            }
            return hashMap;
        }

        protected interface Dispatcher {
            public static final Class<?> UNDEFINED = null;

            Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain);

            Package definePackage(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url);

            Class<?> findClass(ClassLoader classLoader, String str);

            Object getClassLoadingLock(ClassLoader classLoader, String str);

            Package getPackage(ClassLoader classLoader, String str);

            public interface Initializable {
                public static final Permission ACCESS_PERMISSION = new ReflectPermission("suppressAccessChecks");

                Dispatcher initialize();

                boolean isAvailable();

                @HashCodeAndEqualsPlugin.Enhance
                public static class Unavailable implements Dispatcher, Initializable {
                    private final String message;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.message.equals(((Unavailable) obj).message);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                        return classLoader;
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.message.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                    public Dispatcher initialize() {
                        return this;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                    public boolean isAvailable() {
                        return false;
                    }

                    protected Unavailable(String str) {
                        this.message = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Class<?> findClass(ClassLoader classLoader, String str) {
                        try {
                            return classLoader.loadClass(str);
                        } catch (ClassNotFoundException unused) {
                            return UNDEFINED;
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain) {
                        throw new UnsupportedOperationException("Cannot define class using reflection: " + this.message);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Package getPackage(ClassLoader classLoader, String str) {
                        throw new UnsupportedOperationException("Cannot get package using reflection: " + this.message);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Package definePackage(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
                        throw new UnsupportedOperationException("Cannot define package using injection: " + this.message);
                    }
                }
            }

            public enum CreationAction implements PrivilegedAction<Initializable> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Initializable run() {
                    try {
                        if (JavaModule.isSupported()) {
                            if (UsingUnsafe.isAvailable()) {
                                return UsingUnsafeInjection.make();
                            }
                            return UsingUnsafeOverride.make();
                        }
                        return Direct.make();
                    } catch (InvocationTargetException e) {
                        return new Initializable.Unavailable(e.getCause().getMessage());
                    } catch (Exception e2) {
                        return new Initializable.Unavailable(e2.getMessage());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Direct implements Dispatcher, Initializable {
                protected final Method defineClass;
                protected final Method definePackage;
                protected final Method findLoadedClass;
                protected final Method getPackage;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Direct direct = (Direct) obj;
                    return this.findLoadedClass.equals(direct.findLoadedClass) && this.defineClass.equals(direct.defineClass) && this.getPackage.equals(direct.getPackage) && this.definePackage.equals(direct.definePackage);
                }

                public int hashCode() {
                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.findLoadedClass.hashCode()) * 31) + this.defineClass.hashCode()) * 31) + this.getPackage.hashCode()) * 31) + this.definePackage.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public boolean isAvailable() {
                    return true;
                }

                protected abstract void onInitialization();

                protected Direct(Method method, Method method2, Method method3, Method method4) {
                    this.findLoadedClass = method;
                    this.defineClass = method2;
                    this.getPackage = method3;
                    this.definePackage = method4;
                }

                protected static Initializable make() throws Exception {
                    Method declaredMethod;
                    if (JavaModule.isSupported()) {
                        try {
                            declaredMethod = ClassLoader.class.getMethod("getDefinedPackage", String.class);
                        } catch (NoSuchMethodException unused) {
                            declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                        }
                    } else {
                        declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                    }
                    Method declaredMethod2 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
                    Method declaredMethod3 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class);
                    Method declaredMethod4 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
                    try {
                        return new ForJava7CapableVm(declaredMethod2, declaredMethod3, declaredMethod, declaredMethod4, ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class));
                    } catch (NoSuchMethodException unused2) {
                        return new ForLegacyVm(declaredMethod2, declaredMethod3, declaredMethod, declaredMethod4);
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public Dispatcher initialize() {
                    try {
                        this.findLoadedClass.setAccessible(true);
                        this.defineClass.setAccessible(true);
                        this.getPackage.setAccessible(true);
                        this.definePackage.setAccessible(true);
                        onInitialization();
                        return this;
                    } catch (Exception e) {
                        return new Unavailable(e);
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> findClass(ClassLoader classLoader, String str) {
                    try {
                        return (Class) this.findLoadedClass.invoke(classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#findClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#findClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.defineClass.invoke(classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#defineClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#defineClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package getPackage(ClassLoader classLoader, String str) {
                    try {
                        return (Package) this.getPackage.invoke(classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#getPackage", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#getPackage", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package definePackage(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
                    try {
                        return (Package) this.definePackage.invoke(classLoader, str, str2, str3, str4, str5, str6, str7, url);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#definePackage", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#definePackage", e2.getCause());
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForJava7CapableVm extends Direct {
                    private final Method getClassLoadingLock;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.getClassLoadingLock.equals(((ForJava7CapableVm) obj).getClassLoadingLock);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.getClassLoadingLock.hashCode();
                    }

                    protected ForJava7CapableVm(Method method, Method method2, Method method3, Method method4, Method method5) {
                        super(method, method2, method3, method4);
                        this.getClassLoadingLock = method5;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                        try {
                            return this.getClassLoadingLock.invoke(classLoader, str);
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Could not access java.lang.ClassLoader#getClassLoadingLock", e);
                        } catch (InvocationTargetException e2) {
                            throw new IllegalStateException("Error invoking java.lang.ClassLoader#getClassLoadingLock", e2.getCause());
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct
                    protected void onInitialization() {
                        this.getClassLoadingLock.setAccessible(true);
                    }
                }

                protected static class ForLegacyVm extends Direct {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                        return classLoader;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct
                    protected void onInitialization() {
                    }

                    protected ForLegacyVm(Method method, Method method2, Method method3, Method method4) {
                        super(method, method2, method3, method4);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class UsingUnsafeInjection implements Dispatcher, Initializable {
                private final Object accessor;
                private final Method defineClass;
                private final Method definePackage;
                private final Method findLoadedClass;
                private final Method getClassLoadingLock;
                private final Method getPackage;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    UsingUnsafeInjection usingUnsafeInjection = (UsingUnsafeInjection) obj;
                    return this.accessor.equals(usingUnsafeInjection.accessor) && this.findLoadedClass.equals(usingUnsafeInjection.findLoadedClass) && this.defineClass.equals(usingUnsafeInjection.defineClass) && this.getPackage.equals(usingUnsafeInjection.getPackage) && this.definePackage.equals(usingUnsafeInjection.definePackage) && this.getClassLoadingLock.equals(usingUnsafeInjection.getClassLoadingLock);
                }

                public int hashCode() {
                    return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.accessor.hashCode()) * 31) + this.findLoadedClass.hashCode()) * 31) + this.defineClass.hashCode()) * 31) + this.getPackage.hashCode()) * 31) + this.definePackage.hashCode()) * 31) + this.getClassLoadingLock.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public boolean isAvailable() {
                    return true;
                }

                protected UsingUnsafeInjection(Object obj, Method method, Method method2, Method method3, Method method4, Method method5) {
                    this.accessor = obj;
                    this.findLoadedClass = method;
                    this.defineClass = method2;
                    this.getPackage = method3;
                    this.definePackage = method4;
                    this.getClassLoadingLock = method5;
                }

                protected static Initializable make() throws Exception {
                    Method declaredMethod;
                    DynamicType.Builder intercept;
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(null);
                    if (JavaModule.isSupported()) {
                        try {
                            declaredMethod = ClassLoader.class.getDeclaredMethod("getDefinedPackage", String.class);
                        } catch (NoSuchMethodException unused) {
                            declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                        }
                    } else {
                        declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                    }
                    DynamicType.Builder intercept2 = new ByteBuddy().with(TypeValidation.DISABLED).subclass(Object.class, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS).name(ClassLoader.class.getName() + "$ByteBuddyAccessor$" + RandomString.make()).defineMethod("findLoadedClass", Class.class, Visibility.PUBLIC).withParameters(ClassLoader.class, String.class).intercept(MethodCall.invoke(ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class)).onArgument(0).withArgument(1)).defineMethod("defineClass", Class.class, Visibility.PUBLIC).withParameters(ClassLoader.class, String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class).intercept(MethodCall.invoke(ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class)).onArgument(0).withArgument(1, 2, 3, 4, 5)).defineMethod("getPackage", Package.class, Visibility.PUBLIC).withParameters(ClassLoader.class, String.class).intercept(MethodCall.invoke(declaredMethod).onArgument(0).withArgument(1)).defineMethod("definePackage", Package.class, Visibility.PUBLIC).withParameters(ClassLoader.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class).intercept(MethodCall.invoke(ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class)).onArgument(0).withArgument(1, 2, 3, 4, 5, 6, 7, 8));
                    try {
                        intercept = intercept2.defineMethod("getClassLoadingLock", Object.class, Visibility.PUBLIC).withParameters(ClassLoader.class, String.class).intercept(MethodCall.invoke(ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class)).onArgument(0).withArgument(1));
                    } catch (NoSuchMethodException unused2) {
                        intercept = intercept2.defineMethod("getClassLoadingLock", Object.class, Visibility.PUBLIC).withParameters(ClassLoader.class, String.class).intercept(FixedValue.argument(0));
                    }
                    Class loaded = intercept.make().load(ClassLoadingStrategy.BOOTSTRAP_LOADER, new ClassLoadingStrategy.ForUnsafeInjection()).getLoaded();
                    return new UsingUnsafeInjection(cls.getDeclaredMethod("allocateInstance", Class.class).invoke(obj, loaded), loaded.getMethod("findLoadedClass", ClassLoader.class, String.class), loaded.getMethod("defineClass", ClassLoader.class, String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class), loaded.getMethod("getPackage", ClassLoader.class, String.class), loaded.getMethod("definePackage", ClassLoader.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class), loaded.getMethod("getClassLoadingLock", ClassLoader.class, String.class));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public Dispatcher initialize() {
                    SecurityManager securityManager = System.getSecurityManager();
                    if (securityManager != null) {
                        securityManager.checkPermission(ACCESS_PERMISSION);
                    }
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                    try {
                        return this.getClassLoadingLock.invoke(this.accessor, classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access (accessor)::getClassLoadingLock", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking (accessor)::getClassLoadingLock", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> findClass(ClassLoader classLoader, String str) {
                    try {
                        return (Class) this.findLoadedClass.invoke(this.accessor, classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access (accessor)::findLoadedClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking (accessor)::findLoadedClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.defineClass.invoke(this.accessor, classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access (accessor)::defineClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking (accessor)::defineClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package getPackage(ClassLoader classLoader, String str) {
                    try {
                        return (Package) this.getPackage.invoke(this.accessor, classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access (accessor)::getPackage", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking (accessor)::getPackage", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package definePackage(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
                    try {
                        return (Package) this.definePackage.invoke(this.accessor, classLoader, str, str2, str3, str4, str5, str6, str7, url);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access (accessor)::definePackage", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking (accessor)::definePackage", e2.getCause());
                    }
                }
            }

            public static abstract class UsingUnsafeOverride implements Dispatcher, Initializable {
                protected final Method defineClass;
                protected final Method definePackage;
                protected final Method findLoadedClass;
                protected final Method getPackage;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public boolean isAvailable() {
                    return true;
                }

                protected UsingUnsafeOverride(Method method, Method method2, Method method3, Method method4) {
                    this.findLoadedClass = method;
                    this.defineClass = method2;
                    this.getPackage = method3;
                    this.definePackage = method4;
                }

                protected static Initializable make() throws Exception {
                    Method declaredMethod;
                    Method method;
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(null);
                    long longValue = ((Long) cls.getMethod("objectFieldOffset", Field.class).invoke(obj, AccessibleObject.class.getDeclaredField("override"))).longValue();
                    Method method2 = cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                    if (JavaModule.isSupported()) {
                        try {
                            declaredMethod = ClassLoader.class.getMethod("getDefinedPackage", String.class);
                        } catch (NoSuchMethodException unused) {
                            declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                            method2.invoke(obj, declaredMethod, Long.valueOf(longValue), true);
                        }
                    } else {
                        declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                        method2.invoke(obj, declaredMethod, Long.valueOf(longValue), true);
                    }
                    Method declaredMethod2 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
                    Method declaredMethod3 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class);
                    Method declaredMethod4 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
                    method2.invoke(obj, declaredMethod3, Long.valueOf(longValue), true);
                    method2.invoke(obj, declaredMethod2, Long.valueOf(longValue), true);
                    method2.invoke(obj, declaredMethod4, Long.valueOf(longValue), true);
                    try {
                        Method declaredMethod5 = ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class);
                        method2.invoke(obj, declaredMethod5, Long.valueOf(longValue), true);
                        method = declaredMethod3;
                        try {
                            return new ForJava7CapableVm(declaredMethod2, declaredMethod3, declaredMethod, declaredMethod4, declaredMethod5);
                        } catch (NoSuchMethodException unused2) {
                            return new ForLegacyVm(declaredMethod2, method, declaredMethod, declaredMethod4);
                        }
                    } catch (NoSuchMethodException unused3) {
                        method = declaredMethod3;
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public Dispatcher initialize() {
                    SecurityManager securityManager = System.getSecurityManager();
                    if (securityManager != null) {
                        securityManager.checkPermission(ACCESS_PERMISSION);
                    }
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> findClass(ClassLoader classLoader, String str) {
                    try {
                        return (Class) this.findLoadedClass.invoke(classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#findClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#findClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.defineClass.invoke(classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#defineClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#defineClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package getPackage(ClassLoader classLoader, String str) {
                    try {
                        return (Package) this.getPackage.invoke(classLoader, str);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#getPackage", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#getPackage", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package definePackage(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
                    try {
                        return (Package) this.definePackage.invoke(classLoader, str, str2, str3, str4, str5, str6, str7, url);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access java.lang.ClassLoader#definePackage", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.ClassLoader#definePackage", e2.getCause());
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForJava7CapableVm extends UsingUnsafeOverride {
                    private final Method getClassLoadingLock;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.getClassLoadingLock.equals(((ForJava7CapableVm) obj).getClassLoadingLock);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getClassLoadingLock.hashCode();
                    }

                    protected ForJava7CapableVm(Method method, Method method2, Method method3, Method method4, Method method5) {
                        super(method, method2, method3, method4);
                        this.getClassLoadingLock = method5;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                        try {
                            return this.getClassLoadingLock.invoke(classLoader, str);
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Could not access java.lang.ClassLoader#getClassLoadingLock", e);
                        } catch (InvocationTargetException e2) {
                            throw new IllegalStateException("Error invoking java.lang.ClassLoader#getClassLoadingLock", e2.getCause());
                        }
                    }
                }

                protected static class ForLegacyVm extends UsingUnsafeOverride {
                    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                        return classLoader;
                    }

                    protected ForLegacyVm(Method method, Method method2, Method method3, Method method4) {
                        super(method, method2, method3, method4);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Unavailable implements Dispatcher {
                private final Exception exception;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.exception.equals(((Unavailable) obj).exception);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Object getClassLoadingLock(ClassLoader classLoader, String str) {
                    return classLoader;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.exception.hashCode();
                }

                protected Unavailable(Exception exc) {
                    this.exception = exc;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> findClass(ClassLoader classLoader, String str) {
                    try {
                        return classLoader.loadClass(str);
                    } catch (ClassNotFoundException unused) {
                        return UNDEFINED;
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain) {
                    throw new UnsupportedOperationException("Cannot define class using reflection", this.exception);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package getPackage(ClassLoader classLoader, String str) {
                    throw new UnsupportedOperationException("Cannot get package using reflection", this.exception);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public Package definePackage(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
                    throw new UnsupportedOperationException("Cannot define package using injection", this.exception);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingLookup implements ClassInjector {
        private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.Creator.INSTANCE);
        private static final int PACKAGE_LOOKUP = 8;
        private final Object lookup;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.lookup.equals(((UsingLookup) obj).lookup);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.lookup.hashCode();
        }

        protected UsingLookup(Object obj) {
            this.lookup = obj;
        }

        public static UsingLookup of(Object obj) {
            Dispatcher dispatcher = DISPATCHER;
            if (!dispatcher.isAlive()) {
                throw new IllegalStateException("The current VM does not support class definition via method handle lookups");
            }
            if (!JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().isInstance(obj)) {
                throw new IllegalArgumentException("Not a method handle lookup: " + obj);
            }
            if ((dispatcher.lookupModes(obj) & 8) == 0) {
                throw new IllegalArgumentException("Lookup does not imply package-access: " + obj);
            }
            return new UsingLookup(dispatcher.dropLookupMode(obj, 2));
        }

        public static boolean isAvailable() {
            return DISPATCHER.isAlive();
        }

        public Class<?> lookupType() {
            return DISPATCHER.lookupType(this.lookup);
        }

        public UsingLookup in(Class<?> cls) {
            return new UsingLookup(DISPATCHER.resolve(this.lookup, cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector
        public Map<TypeDescription, Class<?>> inject(Map<? extends TypeDescription, byte[]> map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<? extends TypeDescription, byte[]> entry : map.entrySet()) {
                if (!entry.getKey().isSamePackage(TypeDescription.ForLoadedType.of(lookupType()))) {
                    throw new IllegalArgumentException(entry.getKey() + " must be defined in the same package as " + this.lookup);
                }
                hashMap.put(entry.getKey(), DISPATCHER.defineClass(this.lookup, entry.getValue()));
            }
            return hashMap;
        }

        protected interface Dispatcher {
            Class<?> defineClass(Object obj, byte[] bArr);

            Object dropLookupMode(Object obj, int i);

            boolean isAlive();

            int lookupModes(Object obj);

            Class<?> lookupType(Object obj);

            Object resolve(Object obj, Class<?> cls);

            public enum Creator implements PrivilegedAction<Dispatcher> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Dispatcher run() {
                    try {
                        Class<?> load = JavaType.METHOD_HANDLES_LOOKUP.load();
                        return new ForJava9CapableVm(JavaType.METHOD_HANDLES.load().getMethod("privateLookupIn", Class.class, load), load.getMethod("lookupClass", new Class[0]), load.getMethod("lookupModes", new Class[0]), load.getMethod("dropLookupMode", Integer.TYPE), load.getMethod("defineClass", byte[].class));
                    } catch (Exception unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
            }

            public enum ForLegacyVm implements Dispatcher {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public boolean isAlive() {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Class<?> lookupType(Object obj) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.invoke.MethodHandles$Lookup");
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public int lookupModes(Object obj) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.invoke.MethodHandles$Lookup");
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Object dropLookupMode(Object obj, int i) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.invoke.MethodHandles$Lookup");
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Object resolve(Object obj, Class<?> cls) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.invoke.MethodHandles");
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Class<?> defineClass(Object obj, byte[] bArr) {
                    throw new IllegalStateException("Cannot dispatch method for java.lang.invoke.MethodHandles$Lookup");
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJava9CapableVm implements Dispatcher {
                private static final Object[] NO_ARGUMENTS = new Object[0];
                private final Method defineClass;
                private final Method dropLookupMode;
                private final Method lookupClass;
                private final Method lookupModes;
                private final Method privateLookupIn;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForJava9CapableVm forJava9CapableVm = (ForJava9CapableVm) obj;
                    return this.privateLookupIn.equals(forJava9CapableVm.privateLookupIn) && this.lookupClass.equals(forJava9CapableVm.lookupClass) && this.lookupModes.equals(forJava9CapableVm.lookupModes) && this.dropLookupMode.equals(forJava9CapableVm.dropLookupMode) && this.defineClass.equals(forJava9CapableVm.defineClass);
                }

                public int hashCode() {
                    return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.privateLookupIn.hashCode()) * 31) + this.lookupClass.hashCode()) * 31) + this.lookupModes.hashCode()) * 31) + this.dropLookupMode.hashCode()) * 31) + this.defineClass.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public boolean isAlive() {
                    return true;
                }

                protected ForJava9CapableVm(Method method, Method method2, Method method3, Method method4, Method method5) {
                    this.privateLookupIn = method;
                    this.lookupClass = method2;
                    this.lookupModes = method3;
                    this.defineClass = method5;
                    this.dropLookupMode = method4;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Class<?> lookupType(Object obj) {
                    try {
                        return (Class) this.lookupClass.invoke(obj, NO_ARGUMENTS);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles$Lookup#lookupClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles$Lookup#lookupClass", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public int lookupModes(Object obj) {
                    try {
                        return ((Integer) this.lookupModes.invoke(obj, NO_ARGUMENTS)).intValue();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles$Lookup#lookupModes", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles$Lookup#lookupModes", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Object dropLookupMode(Object obj, int i) {
                    try {
                        return this.dropLookupMode.invoke(obj, Integer.valueOf(i));
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles$Lookup#lookupModes", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles$Lookup#lookupModes", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Object resolve(Object obj, Class<?> cls) {
                    try {
                        return this.privateLookupIn.invoke(null, cls, obj);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles#privateLookupIn", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles#privateLookupIn", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.Dispatcher
                public Class<?> defineClass(Object obj, byte[] bArr) {
                    try {
                        return (Class) this.defineClass.invoke(obj, bArr);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.invoke.MethodHandles$Lookup#defineClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.invoke.MethodHandles$Lookup#defineClass", e2.getCause());
                    }
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingUnsafe implements ClassInjector {

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ClassLoader classLoader;

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ProtectionDomain protectionDomain;
        private static final Dispatcher.Initializable DISPATCHER = (Dispatcher.Initializable) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        private static final Object BOOTSTRAP_LOADER_LOCK = new Object();

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0024, code lost:
        
            if (r2 != null) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ClassLoader classLoader = this.classLoader;
            UsingUnsafe usingUnsafe = (UsingUnsafe) obj;
            ClassLoader classLoader2 = usingUnsafe.classLoader;
            if (classLoader2 != null) {
                if (classLoader == null || !classLoader.equals(classLoader2)) {
                    return false;
                }
                ProtectionDomain protectionDomain = this.protectionDomain;
                ProtectionDomain protectionDomain2 = usingUnsafe.protectionDomain;
                if (protectionDomain2 != null) {
                    return protectionDomain != null && protectionDomain.equals(protectionDomain2);
                }
                if (protectionDomain != null) {
                    return false;
                }
            }
        }

        public int hashCode() {
            ClassLoader classLoader = this.classLoader;
            int i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            if (classLoader != null) {
                i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + classLoader.hashCode();
            }
            int i2 = i * 31;
            ProtectionDomain protectionDomain = this.protectionDomain;
            return protectionDomain != null ? i2 + protectionDomain.hashCode() : i2;
        }

        public UsingUnsafe(ClassLoader classLoader) {
            this(classLoader, ClassLoadingStrategy.NO_PROTECTION_DOMAIN);
        }

        public UsingUnsafe(ClassLoader classLoader, ProtectionDomain protectionDomain) {
            this.classLoader = classLoader;
            this.protectionDomain = protectionDomain;
        }

        public static boolean isAvailable() {
            return DISPATCHER.isAvailable();
        }

        public static ClassInjector ofBootstrapLoader() {
            return new UsingUnsafe(ClassLoadingStrategy.BOOTSTRAP_LOADER);
        }

        public static ClassInjector ofClassPath() {
            return new UsingUnsafe(ClassLoader.getSystemClassLoader());
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector
        public Map<TypeDescription, Class<?>> inject(Map<? extends TypeDescription, byte[]> map) {
            Dispatcher initialize = DISPATCHER.initialize();
            HashMap hashMap = new HashMap();
            Object obj = this.classLoader;
            if (obj == null) {
                obj = BOOTSTRAP_LOADER_LOCK;
            }
            synchronized (obj) {
                for (Map.Entry<? extends TypeDescription, byte[]> entry : map.entrySet()) {
                    try {
                        hashMap.put(entry.getKey(), Class.forName(entry.getKey().getName(), false, this.classLoader));
                    } catch (ClassNotFoundException unused) {
                        hashMap.put(entry.getKey(), initialize.defineClass(this.classLoader, entry.getKey().getName(), entry.getValue(), this.protectionDomain));
                    }
                }
            }
            return hashMap;
        }

        protected interface Dispatcher {

            public interface Initializable {
                Dispatcher initialize();

                boolean isAvailable();
            }

            Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain);

            public enum CreationAction implements PrivilegedAction<Initializable> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Initializable run() {
                    try {
                        Class<?> cls = Class.forName("sun.misc.Unsafe");
                        return new Enabled(cls.getDeclaredField("theUnsafe"), cls.getMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE, ClassLoader.class, ProtectionDomain.class));
                    } catch (Exception e) {
                        return new Disabled(e.getMessage());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements Dispatcher, Initializable {
                private final Method defineClass;
                private final Field theUnsafe;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Enabled enabled = (Enabled) obj;
                    return this.theUnsafe.equals(enabled.theUnsafe) && this.defineClass.equals(enabled.defineClass);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.theUnsafe.hashCode()) * 31) + this.defineClass.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public boolean isAvailable() {
                    return true;
                }

                protected Enabled(Field field, Method method) {
                    this.theUnsafe = field;
                    this.defineClass = method;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public Dispatcher initialize() {
                    this.theUnsafe.setAccessible(true);
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher
                public Class<?> defineClass(ClassLoader classLoader, String str, byte[] bArr, ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.defineClass.invoke(this.theUnsafe.get(null), str, bArr, 0, Integer.valueOf(bArr.length), classLoader, protectionDomain);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access Unsafe::defineClass", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking Unsafe::defineClass", e2.getCause());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Disabled implements Initializable {
                private final String message;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.message.equals(((Disabled) obj).message);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.message.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public boolean isAvailable() {
                    return false;
                }

                protected Disabled(String str) {
                    this.message = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public Dispatcher initialize() {
                    throw new IllegalStateException("Could not find sun.misc.Unsafe");
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingInstrumentation implements ClassInjector {
        private static final String CLASS_FILE_EXTENSION = ".class";
        private static final String JAR = "jar";
        private final File folder;
        private final Instrumentation instrumentation;
        private final RandomString randomString;
        private final Target target;

        public enum Target {
            BOOTSTRAP { // from class: org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.1
                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target
                protected void inject(Instrumentation instrumentation, JarFile jarFile) {
                    instrumentation.appendToBootstrapClassLoaderSearch(jarFile);
                }
            },
            SYSTEM { // from class: org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.2
                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target
                protected void inject(Instrumentation instrumentation, JarFile jarFile) {
                    instrumentation.appendToSystemClassLoaderSearch(jarFile);
                }
            };

            protected abstract void inject(Instrumentation instrumentation, JarFile jarFile);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UsingInstrumentation usingInstrumentation = (UsingInstrumentation) obj;
            return this.instrumentation.equals(usingInstrumentation.instrumentation) && this.target.equals(usingInstrumentation.target) && this.folder.equals(usingInstrumentation.folder) && this.randomString.equals(usingInstrumentation.randomString);
        }

        public int hashCode() {
            return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentation.hashCode()) * 31) + this.target.hashCode()) * 31) + this.folder.hashCode()) * 31) + this.randomString.hashCode();
        }

        public static ClassInjector of(File file, Target target, Instrumentation instrumentation) {
            return new UsingInstrumentation(file, target, instrumentation, new RandomString());
        }

        protected UsingInstrumentation(File file, Target target, Instrumentation instrumentation, RandomString randomString) {
            this.folder = file;
            this.target = target;
            this.instrumentation = instrumentation;
            this.randomString = randomString;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector
        public Map<TypeDescription, Class<?>> inject(Map<? extends TypeDescription, byte[]> map) {
            File file = new File(this.folder, JAR + this.randomString.nextString() + ".jar");
            try {
                if (!file.createNewFile()) {
                    throw new IllegalStateException("Cannot create file " + file);
                }
                JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file));
                try {
                    for (Map.Entry<? extends TypeDescription, byte[]> entry : map.entrySet()) {
                        jarOutputStream.putNextEntry(new JarEntry(entry.getKey().getInternalName() + ".class"));
                        jarOutputStream.write(entry.getValue());
                    }
                    jarOutputStream.close();
                    this.target.inject(this.instrumentation, new JarFile(file));
                    HashMap hashMap = new HashMap();
                    for (TypeDescription typeDescription : map.keySet()) {
                        hashMap.put(typeDescription, Class.forName(typeDescription.getName(), false, ClassLoader.getSystemClassLoader()));
                    }
                    return hashMap;
                } catch (Throwable th) {
                    jarOutputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                throw new IllegalStateException("Cannot write jar file to disk", e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Cannot load injected class", e2);
            }
        }
    }
}
