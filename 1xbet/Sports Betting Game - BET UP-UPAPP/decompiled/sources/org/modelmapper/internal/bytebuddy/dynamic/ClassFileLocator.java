package org.modelmapper.internal.bytebuddy.dynamic;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.sentry.SentryEvent;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.JavaModule;
import org.modelmapper.internal.bytebuddy.utility.JavaType;
import org.modelmapper.internal.bytebuddy.utility.StreamDrainer;

/* loaded from: classes4.dex */
public interface ClassFileLocator extends Closeable {
    public static final String CLASS_FILE_EXTENSION = ".class";

    Resolution locate(String str) throws IOException;

    public interface Resolution {
        boolean isResolved();

        byte[] resolve();

        @HashCodeAndEqualsPlugin.Enhance
        public static class Illegal implements Resolution {
            private final String typeName;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeName.equals(((Illegal) obj).typeName);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeName.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.Resolution
            public boolean isResolved() {
                return false;
            }

            public Illegal(String str) {
                this.typeName = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.Resolution
            public byte[] resolve() {
                throw new IllegalStateException("Could not locate class file for " + this.typeName);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Explicit implements Resolution {
            private final byte[] binaryRepresentation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && Arrays.equals(this.binaryRepresentation, ((Explicit) obj).binaryRepresentation);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.binaryRepresentation);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.Resolution
            public boolean isResolved() {
                return true;
            }

            public Explicit(byte[] bArr) {
                this.binaryRepresentation = bArr;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.Resolution
            public byte[] resolve() {
                return this.binaryRepresentation;
            }
        }
    }

    public enum NoOp implements ClassFileLocator {
        INSTANCE;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) {
            return new Resolution.Illegal(str);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements ClassFileLocator {
        private final Map<String, byte[]> classFiles;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classFiles.equals(((Simple) obj).classFiles);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFiles.hashCode();
        }

        public Simple(Map<String, byte[]> map) {
            this.classFiles = map;
        }

        public static ClassFileLocator of(String str, byte[] bArr) {
            return new Simple(Collections.singletonMap(str, bArr));
        }

        public static ClassFileLocator of(DynamicType dynamicType) {
            return of(dynamicType.getAllTypes());
        }

        public static ClassFileLocator of(Map<TypeDescription, byte[]> map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                hashMap.put(entry.getKey().getName(), entry.getValue());
            }
            return new Simple(hashMap);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) {
            byte[] bArr = this.classFiles.get(str);
            return bArr == null ? new Resolution.Illegal(str) : new Resolution.Explicit(bArr);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForClassLoader implements ClassFileLocator {
        private final ClassLoader classLoader;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classLoader.equals(((ForClassLoader) obj).classLoader);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classLoader.hashCode();
        }

        protected ForClassLoader(ClassLoader classLoader) {
            this.classLoader = classLoader;
        }

        public static ClassFileLocator ofClassPath() {
            return new ForClassLoader(ClassLoader.getSystemClassLoader());
        }

        public static ClassFileLocator of(ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            return new ForClassLoader(classLoader);
        }

        public static Resolution read(Class<?> cls) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = ClassLoader.getSystemClassLoader();
                }
                return locate(classLoader, TypeDescription.ForLoadedType.getName(cls));
            } catch (IOException e) {
                throw new IllegalStateException("Cannot read class file for " + cls, e);
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            return locate(this.classLoader, str);
        }

        protected static Resolution locate(ClassLoader classLoader, String str) throws IOException {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION);
            if (resourceAsStream != null) {
                try {
                    return new Resolution.Explicit(StreamDrainer.DEFAULT.drain(resourceAsStream));
                } finally {
                    resourceAsStream.close();
                }
            }
            return new Resolution.Illegal(str);
        }

        public static class WeaklyReferenced extends WeakReference<ClassLoader> implements ClassFileLocator {
            private final int hashCode;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            protected WeaklyReferenced(ClassLoader classLoader) {
                super(classLoader);
                this.hashCode = System.identityHashCode(classLoader);
            }

            public static ClassFileLocator of(ClassLoader classLoader) {
                return (classLoader == null || classLoader == ClassLoader.getSystemClassLoader() || classLoader == ClassLoader.getSystemClassLoader().getParent()) ? ForClassLoader.of(classLoader) : new WeaklyReferenced(classLoader);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
            public Resolution locate(String str) throws IOException {
                ClassLoader classLoader = (ClassLoader) get();
                if (classLoader == null) {
                    return new Resolution.Illegal(str);
                }
                return ForClassLoader.locate(classLoader, str);
            }

            public int hashCode() {
                return this.hashCode;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ClassLoader classLoader = (ClassLoader) ((WeaklyReferenced) obj).get();
                return classLoader != null && get() == classLoader;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForModule implements ClassFileLocator {
        private static final Object[] NO_ARGUMENTS = new Object[0];
        private final JavaModule module;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.module.equals(((ForModule) obj).module);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.module.hashCode();
        }

        protected ForModule(JavaModule javaModule) {
            this.module = javaModule;
        }

        public static ClassFileLocator ofBootLayer() {
            try {
                HashMap hashMap = new HashMap();
                Class<?> cls = Class.forName("java.lang.ModuleLayer");
                Method method = JavaType.MODULE.load().getMethod("getPackages", new Class[0]);
                for (Object obj : (Set) cls.getMethod(SentryEvent.JsonKeys.MODULES, new Class[0]).invoke(cls.getMethod("boot", new Class[0]).invoke(null, new Object[0]), new Object[0])) {
                    ClassFileLocator of = of(JavaModule.of(obj));
                    Iterator it = ((Set) method.invoke(obj, NO_ARGUMENTS)).iterator();
                    while (it.hasNext()) {
                        hashMap.put((String) it.next(), of);
                    }
                }
                return new PackageDiscriminating(hashMap);
            } catch (Exception e) {
                throw new IllegalStateException("Cannot process boot layer", e);
            }
        }

        public static ClassFileLocator of(JavaModule javaModule) {
            return javaModule.isNamed() ? new ForModule(javaModule) : ForClassLoader.of(javaModule.getClassLoader());
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            return locate(this.module, str);
        }

        protected static Resolution locate(JavaModule javaModule, String str) throws IOException {
            InputStream resourceAsStream = javaModule.getResourceAsStream(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION);
            if (resourceAsStream != null) {
                try {
                    return new Resolution.Explicit(StreamDrainer.DEFAULT.drain(resourceAsStream));
                } finally {
                    resourceAsStream.close();
                }
            }
            return new Resolution.Illegal(str);
        }

        public static class WeaklyReferenced extends WeakReference<Object> implements ClassFileLocator {
            private final int hashCode;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            protected WeaklyReferenced(Object obj) {
                super(obj);
                this.hashCode = System.identityHashCode(obj);
            }

            public static ClassFileLocator of(JavaModule javaModule) {
                if (javaModule.isNamed()) {
                    if (javaModule.getClassLoader() == null || javaModule.getClassLoader() == ClassLoader.getSystemClassLoader() || javaModule.getClassLoader() == ClassLoader.getSystemClassLoader().getParent()) {
                        return new ForModule(javaModule);
                    }
                    return new WeaklyReferenced(javaModule.unwrap());
                }
                return ForClassLoader.WeaklyReferenced.of(javaModule.getClassLoader());
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
            public Resolution locate(String str) throws IOException {
                Object obj = get();
                if (obj == null) {
                    return new Resolution.Illegal(str);
                }
                return ForModule.locate(JavaModule.of(obj), str);
            }

            public int hashCode() {
                return this.hashCode;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Object obj2 = ((WeaklyReferenced) obj).get();
                return obj2 != null && get() == obj2;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForJarFile implements ClassFileLocator {
        private static final List<String> RUNTIME_LOCATIONS = Arrays.asList("lib/rt.jar", "../lib/rt.jar", "../Classes/classes.jar");
        private final JarFile jarFile;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.jarFile.equals(((ForJarFile) obj).jarFile);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.jarFile.hashCode();
        }

        public ForJarFile(JarFile jarFile) {
            this.jarFile = jarFile;
        }

        public static ClassFileLocator of(File file) throws IOException {
            return new ForJarFile(new JarFile(file));
        }

        public static ClassFileLocator ofClassPath() throws IOException {
            return ofClassPath(System.getProperty("java.class.path"));
        }

        public static ClassFileLocator ofClassPath(String str) throws IOException {
            ArrayList arrayList = new ArrayList();
            for (String str2 : Pattern.compile(System.getProperty("path.separator"), 16).split(str)) {
                File file = new File(str2);
                if (file.isDirectory()) {
                    arrayList.add(new ForFolder(file));
                } else if (file.isFile()) {
                    arrayList.add(of(file));
                }
            }
            return new Compound(arrayList);
        }

        public static ClassFileLocator ofRuntimeJar() throws IOException {
            File file;
            String replace = System.getProperty("java.home").replace(AbstractJsonLexerKt.STRING_ESC, '/');
            Iterator<String> it = RUNTIME_LOCATIONS.iterator();
            while (true) {
                if (!it.hasNext()) {
                    file = null;
                    break;
                }
                file = new File(replace, it.next());
                if (file.isFile()) {
                    break;
                }
            }
            if (file == null) {
                throw new IllegalStateException("Runtime jar does not exist in " + replace + " for any of " + RUNTIME_LOCATIONS);
            }
            return of(file);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            ZipEntry entry = this.jarFile.getEntry(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION);
            if (entry == null) {
                return new Resolution.Illegal(str);
            }
            InputStream inputStream = this.jarFile.getInputStream(entry);
            try {
                return new Resolution.Explicit(StreamDrainer.DEFAULT.drain(inputStream));
            } finally {
                inputStream.close();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.jarFile.close();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForModuleFile implements ClassFileLocator {
        private static final List<String> BOOT_LOCATIONS = Arrays.asList("jmods", "../jmods");
        private static final String JMOD_FILE_EXTENSION = ".jmod";
        private final ZipFile zipFile;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.zipFile.equals(((ForModuleFile) obj).zipFile);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.zipFile.hashCode();
        }

        public ForModuleFile(ZipFile zipFile) {
            this.zipFile = zipFile;
        }

        public static ClassFileLocator ofBootPath() throws IOException {
            File file;
            String replace = System.getProperty("java.home").replace(AbstractJsonLexerKt.STRING_ESC, '/');
            Iterator<String> it = BOOT_LOCATIONS.iterator();
            while (true) {
                if (!it.hasNext()) {
                    file = null;
                    break;
                }
                file = new File(replace, it.next());
                if (file.isDirectory()) {
                    break;
                }
            }
            if (file == null) {
                throw new IllegalStateException("Boot modules do not exist in " + replace + " for any of " + BOOT_LOCATIONS);
            }
            return ofBootPath(file);
        }

        public static ClassFileLocator ofBootPath(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return NoOp.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(of(file2));
                }
            }
            return new Compound(arrayList);
        }

        public static ClassFileLocator ofModulePath() throws IOException {
            String property = System.getProperty("jdk.module.path");
            if (property == null) {
                return NoOp.INSTANCE;
            }
            return ofModulePath(property);
        }

        public static ClassFileLocator ofModulePath(String str) throws IOException {
            return ofModulePath(str, System.getProperty("user.dir"));
        }

        public static ClassFileLocator ofModulePath(String str, String str2) throws IOException {
            ClassFileLocator of;
            ClassFileLocator of2;
            ArrayList arrayList = new ArrayList();
            for (String str3 : Pattern.compile(System.getProperty("path.separator"), 16).split(str)) {
                File file = new File(str2, str3);
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                arrayList.add(new ForFolder(file2));
                            } else if (file2.isFile()) {
                                if (file2.getName().endsWith(JMOD_FILE_EXTENSION)) {
                                    of2 = of(file2);
                                } else {
                                    of2 = ForJarFile.of(file2);
                                }
                                arrayList.add(of2);
                            }
                        }
                    }
                } else if (file.isFile()) {
                    if (file.getName().endsWith(JMOD_FILE_EXTENSION)) {
                        of = of(file);
                    } else {
                        of = ForJarFile.of(file);
                    }
                    arrayList.add(of);
                }
            }
            return new Compound(arrayList);
        }

        public static ClassFileLocator of(File file) throws IOException {
            return new ForModuleFile(new ZipFile(file));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            ZipEntry entry = this.zipFile.getEntry("classes/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION);
            if (entry == null) {
                return new Resolution.Illegal(str);
            }
            InputStream inputStream = this.zipFile.getInputStream(entry);
            try {
                return new Resolution.Explicit(StreamDrainer.DEFAULT.drain(inputStream));
            } finally {
                inputStream.close();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.zipFile.close();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForFolder implements ClassFileLocator {
        private final File folder;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.folder.equals(((ForFolder) obj).folder);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.folder.hashCode();
        }

        public ForFolder(File file) {
            this.folder = file;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            File file = new File(this.folder, str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, File.separatorChar) + ClassFileLocator.CLASS_FILE_EXTENSION);
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    return new Resolution.Explicit(StreamDrainer.DEFAULT.drain(fileInputStream));
                } finally {
                    fileInputStream.close();
                }
            }
            return new Resolution.Illegal(str);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForUrl implements ClassFileLocator {
        private final ClassLoader classLoader;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classLoader.equals(((ForUrl) obj).classLoader);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classLoader.hashCode();
        }

        public ForUrl(URL... urlArr) {
            this.classLoader = (ClassLoader) AccessController.doPrivileged(new ClassLoaderCreationAction(urlArr));
        }

        public ForUrl(Collection<? extends URL> collection) {
            this((URL[]) collection.toArray(new URL[collection.size()]));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            return ForClassLoader.locate(this.classLoader, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Object obj = this.classLoader;
            if (obj instanceof Closeable) {
                ((Closeable) obj).close();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ClassLoaderCreationAction implements PrivilegedAction<ClassLoader> {
            private final URL[] url;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && Arrays.equals(this.url, ((ClassLoaderCreationAction) obj).url);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.url);
            }

            protected ClassLoaderCreationAction(URL[] urlArr) {
                this.url = urlArr;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return new URLClassLoader(this.url, ClassLoadingStrategy.BOOTSTRAP_LOADER);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class AgentBased implements ClassFileLocator {
        private static final String INSTALLER_TYPE = "org.modelmapper.internal.bytebuddy.agent.Installer";
        private static final String INSTRUMENTATION_GETTER = "getInstrumentation";
        private static final Object STATIC_MEMBER = null;
        private final ClassLoadingDelegate classLoadingDelegate;
        private final Instrumentation instrumentation;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AgentBased agentBased = (AgentBased) obj;
            return this.instrumentation.equals(agentBased.instrumentation) && this.classLoadingDelegate.equals(agentBased.classLoadingDelegate);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentation.hashCode()) * 31) + this.classLoadingDelegate.hashCode();
        }

        public AgentBased(Instrumentation instrumentation, ClassLoader classLoader) {
            this(instrumentation, ClassLoadingDelegate.Default.of(classLoader));
        }

        public AgentBased(Instrumentation instrumentation, ClassLoadingDelegate classLoadingDelegate) {
            if (!instrumentation.isRetransformClassesSupported()) {
                throw new IllegalArgumentException(instrumentation + " does not support retransformation");
            }
            this.instrumentation = instrumentation;
            this.classLoadingDelegate = classLoadingDelegate;
        }

        public static ClassFileLocator fromInstalledAgent(ClassLoader classLoader) {
            try {
                return new AgentBased((Instrumentation) ClassLoader.getSystemClassLoader().loadClass(INSTALLER_TYPE).getMethod(INSTRUMENTATION_GETTER, new Class[0]).invoke(STATIC_MEMBER, new Object[0]), classLoader);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", e2);
            }
        }

        public static ClassFileLocator of(Instrumentation instrumentation, Class<?> cls) {
            return new AgentBased(instrumentation, ClassLoadingDelegate.Explicit.of(cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) {
            try {
                ExtractionClassFileTransformer extractionClassFileTransformer = new ExtractionClassFileTransformer(this.classLoadingDelegate.getClassLoader(), str);
                this.instrumentation.addTransformer(extractionClassFileTransformer, true);
                try {
                    this.instrumentation.retransformClasses(new Class[]{this.classLoadingDelegate.locate(str)});
                    byte[] binaryRepresentation = extractionClassFileTransformer.getBinaryRepresentation();
                    return binaryRepresentation == null ? new Resolution.Illegal(str) : new Resolution.Explicit(binaryRepresentation);
                } finally {
                    this.instrumentation.removeTransformer(extractionClassFileTransformer);
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
                return new Resolution.Illegal(str);
            }
        }

        public interface ClassLoadingDelegate {
            ClassLoader getClassLoader();

            Class<?> locate(String str) throws ClassNotFoundException;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Default implements ClassLoadingDelegate {
                protected final ClassLoader classLoader;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.classLoader.equals(((Default) obj).classLoader);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classLoader.hashCode();
                }

                protected Default(ClassLoader classLoader) {
                    this.classLoader = classLoader;
                }

                public static ClassLoadingDelegate of(ClassLoader classLoader) {
                    if (ForDelegatingClassLoader.isDelegating(classLoader)) {
                        return new ForDelegatingClassLoader(classLoader);
                    }
                    if (classLoader == null) {
                        classLoader = ClassLoader.getSystemClassLoader();
                    }
                    return new Default(classLoader);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate
                public Class<?> locate(String str) throws ClassNotFoundException {
                    return this.classLoader.loadClass(str);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate
                public ClassLoader getClassLoader() {
                    return this.classLoader;
                }
            }

            public static class ForDelegatingClassLoader extends Default {
                private static final String DELEGATING_CLASS_LOADER_NAME = "sun.reflect.DelegatingClassLoader";
                private static final Dispatcher.Initializable DISPATCHER = (Dispatcher.Initializable) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
                private static final int ONLY = 0;

                protected ForDelegatingClassLoader(ClassLoader classLoader) {
                    super(classLoader);
                }

                protected static boolean isDelegating(ClassLoader classLoader) {
                    return classLoader != null && classLoader.getClass().getName().equals(DELEGATING_CLASS_LOADER_NAME);
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate.Default, org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate
                public Class<?> locate(String str) throws ClassNotFoundException {
                    try {
                        Vector<Class<?>> extract = DISPATCHER.initialize().extract(this.classLoader);
                        if (extract.size() != 1) {
                            return super.locate(str);
                        }
                        Class<?> cls = extract.get(0);
                        return TypeDescription.ForLoadedType.getName(cls).equals(str) ? cls : super.locate(str);
                    } catch (RuntimeException unused) {
                        return super.locate(str);
                    }
                }

                protected interface Dispatcher {

                    public interface Initializable {
                        Dispatcher initialize();
                    }

                    Vector<Class<?>> extract(ClassLoader classLoader);

                    public enum CreationAction implements PrivilegedAction<Initializable> {
                        INSTANCE;

                        @Override // java.security.PrivilegedAction
                        public Initializable run() {
                            try {
                                return new Resolved(ClassLoader.class.getDeclaredField("classes"));
                            } catch (Exception e) {
                                return new Unresolved(e.getMessage());
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Resolved implements Dispatcher, Initializable, PrivilegedAction<Dispatcher> {
                        private final Field field;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.field.equals(((Resolved) obj).field);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.field.hashCode();
                        }

                        public Resolved(Field field) {
                            this.field = field;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable
                        public Dispatcher initialize() {
                            return (Dispatcher) AccessController.doPrivileged(this);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher
                        public Vector<Class<?>> extract(ClassLoader classLoader) {
                            try {
                                return (Vector) this.field.get(classLoader);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access field", e);
                            }
                        }

                        @Override // java.security.PrivilegedAction
                        public Dispatcher run() {
                            this.field.setAccessible(true);
                            return this;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Unresolved implements Initializable {
                        private final String message;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.message.equals(((Unresolved) obj).message);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.message.hashCode();
                        }

                        public Unresolved(String str) {
                            this.message = str;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable
                        public Dispatcher initialize() {
                            throw new IllegalStateException("Could not locate classes vector: " + this.message);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements ClassLoadingDelegate {
                private final ClassLoadingDelegate fallbackDelegate;
                private final Map<String, Class<?>> types;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Explicit explicit = (Explicit) obj;
                    return this.fallbackDelegate.equals(explicit.fallbackDelegate) && this.types.equals(explicit.types);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fallbackDelegate.hashCode()) * 31) + this.types.hashCode();
                }

                public Explicit(ClassLoader classLoader, Collection<? extends Class<?>> collection) {
                    this(Default.of(classLoader), collection);
                }

                public Explicit(ClassLoadingDelegate classLoadingDelegate, Collection<? extends Class<?>> collection) {
                    this.fallbackDelegate = classLoadingDelegate;
                    this.types = new HashMap();
                    for (Class<?> cls : collection) {
                        this.types.put(TypeDescription.ForLoadedType.getName(cls), cls);
                    }
                }

                public static ClassLoadingDelegate of(Class<?> cls) {
                    return new Explicit(cls.getClassLoader(), Collections.singleton(cls));
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate
                public Class<?> locate(String str) throws ClassNotFoundException {
                    Class<?> cls = this.types.get(str);
                    return cls == null ? this.fallbackDelegate.locate(str) : cls;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate
                public ClassLoader getClassLoader() {
                    return this.fallbackDelegate.getClassLoader();
                }
            }
        }

        protected static class ExtractionClassFileTransformer implements ClassFileTransformer {
            private static final byte[] DO_NOT_TRANSFORM = null;
            private volatile byte[] binaryRepresentation;
            private final ClassLoader classLoader;
            private final String typeName;

            protected ExtractionClassFileTransformer(ClassLoader classLoader, String str) {
                this.classLoader = classLoader;
                this.typeName = str;
            }

            public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                if (str != null && ElementMatchers.isChildOf(this.classLoader).matches(classLoader) && this.typeName.equals(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH))) {
                    this.binaryRepresentation = (byte[]) bArr.clone();
                }
                return DO_NOT_TRANSFORM;
            }

            protected byte[] getBinaryRepresentation() {
                return this.binaryRepresentation;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class PackageDiscriminating implements ClassFileLocator {
        private final Map<String, ClassFileLocator> classFileLocators;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classFileLocators.equals(((PackageDiscriminating) obj).classFileLocators);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFileLocators.hashCode();
        }

        public PackageDiscriminating(Map<String, ClassFileLocator> map) {
            this.classFileLocators = map;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            int lastIndexOf = str.lastIndexOf(46);
            ClassFileLocator classFileLocator = this.classFileLocators.get(lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf));
            if (classFileLocator == null) {
                return new Resolution.Illegal(str);
            }
            return classFileLocator.locate(str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<ClassFileLocator> it = this.classFileLocators.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements ClassFileLocator, Closeable {
        private final List<ClassFileLocator> classFileLocators;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classFileLocators.equals(((Compound) obj).classFileLocators);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFileLocators.hashCode();
        }

        public Compound(ClassFileLocator... classFileLocatorArr) {
            this((List<? extends ClassFileLocator>) Arrays.asList(classFileLocatorArr));
        }

        public Compound(List<? extends ClassFileLocator> list) {
            this.classFileLocators = new ArrayList();
            for (ClassFileLocator classFileLocator : list) {
                if (classFileLocator instanceof Compound) {
                    this.classFileLocators.addAll(((Compound) classFileLocator).classFileLocators);
                } else if (!(classFileLocator instanceof NoOp)) {
                    this.classFileLocators.add(classFileLocator);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator
        public Resolution locate(String str) throws IOException {
            Iterator<ClassFileLocator> it = this.classFileLocators.iterator();
            while (it.hasNext()) {
                Resolution locate = it.next().locate(str);
                if (locate.isResolved()) {
                    return locate;
                }
            }
            return new Resolution.Illegal(str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<ClassFileLocator> it = this.classFileLocators.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }
}
