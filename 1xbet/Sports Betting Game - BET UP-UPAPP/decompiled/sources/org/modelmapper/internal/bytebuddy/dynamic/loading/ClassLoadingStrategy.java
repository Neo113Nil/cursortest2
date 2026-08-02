package org.modelmapper.internal.bytebuddy.dynamic.loading;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.lang.ClassLoader;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.Map;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ByteArrayClassLoader;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector;
import org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy;

/* loaded from: classes4.dex */
public interface ClassLoadingStrategy<T extends ClassLoader> {
    public static final ClassLoader BOOTSTRAP_LOADER = null;
    public static final ProtectionDomain NO_PROTECTION_DOMAIN = null;

    public interface Configurable<S extends ClassLoader> extends ClassLoadingStrategy<S> {
        Configurable<S> allowExistingTypes();

        Configurable<S> opened();

        Configurable<S> with(ProtectionDomain protectionDomain);

        Configurable<S> with(PackageDefinitionStrategy packageDefinitionStrategy);
    }

    Map<TypeDescription, Class<?>> load(T t, Map<TypeDescription, byte[]> map);

    public enum Default implements Configurable<ClassLoader> {
        WRAPPER(new WrappingDispatcher(ByteArrayClassLoader.PersistenceHandler.LATENT, false)),
        WRAPPER_PERSISTENT(new WrappingDispatcher(ByteArrayClassLoader.PersistenceHandler.MANIFEST, false)),
        CHILD_FIRST(new WrappingDispatcher(ByteArrayClassLoader.PersistenceHandler.LATENT, true)),
        CHILD_FIRST_PERSISTENT(new WrappingDispatcher(ByteArrayClassLoader.PersistenceHandler.MANIFEST, true)),
        INJECTION(new InjectionDispatcher());

        private static final boolean DEFAULT_FORBID_EXISTING = true;
        private final Configurable<ClassLoader> dispatcher;

        Default(Configurable configurable) {
            this.dispatcher = configurable;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return this.dispatcher.load(classLoader, map);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> with(ProtectionDomain protectionDomain) {
            return this.dispatcher.with(protectionDomain);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> with(PackageDefinitionStrategy packageDefinitionStrategy) {
            return this.dispatcher.with(packageDefinitionStrategy);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> allowExistingTypes() {
            return this.dispatcher.allowExistingTypes();
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> opened() {
            return this.dispatcher.opened();
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class InjectionDispatcher implements Configurable<ClassLoader> {
            private final boolean forbidExisting;
            private final PackageDefinitionStrategy packageDefinitionStrategy;

            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final ProtectionDomain protectionDomain;

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0024, code lost:
            
                if (r2 != null) goto L18;
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
                ProtectionDomain protectionDomain = this.protectionDomain;
                InjectionDispatcher injectionDispatcher = (InjectionDispatcher) obj;
                ProtectionDomain protectionDomain2 = injectionDispatcher.protectionDomain;
                if (protectionDomain2 != null) {
                    if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                        return false;
                    }
                    return this.packageDefinitionStrategy.equals(injectionDispatcher.packageDefinitionStrategy) && this.forbidExisting == injectionDispatcher.forbidExisting;
                }
            }

            public int hashCode() {
                ProtectionDomain protectionDomain = this.protectionDomain;
                int i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
                if (protectionDomain != null) {
                    i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + protectionDomain.hashCode();
                }
                return (((i * 31) + this.packageDefinitionStrategy.hashCode()) * 31) + (this.forbidExisting ? 1 : 0);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> opened() {
                return this;
            }

            protected InjectionDispatcher() {
                this(NO_PROTECTION_DOMAIN, PackageDefinitionStrategy.NoOp.INSTANCE, true);
            }

            private InjectionDispatcher(ProtectionDomain protectionDomain, PackageDefinitionStrategy packageDefinitionStrategy, boolean z) {
                this.protectionDomain = protectionDomain;
                this.packageDefinitionStrategy = packageDefinitionStrategy;
                this.forbidExisting = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
                return new ClassInjector.UsingReflection(classLoader, this.protectionDomain, this.packageDefinitionStrategy, this.forbidExisting).inject(map);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(ProtectionDomain protectionDomain) {
                return new InjectionDispatcher(protectionDomain, this.packageDefinitionStrategy, this.forbidExisting);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(PackageDefinitionStrategy packageDefinitionStrategy) {
                return new InjectionDispatcher(this.protectionDomain, packageDefinitionStrategy, this.forbidExisting);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> allowExistingTypes() {
                return new InjectionDispatcher(this.protectionDomain, this.packageDefinitionStrategy, false);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class WrappingDispatcher implements Configurable<ClassLoader> {
            private static final boolean CHILD_FIRST = true;
            private static final boolean PARENT_FIRST = false;
            private final boolean childFirst;
            private final boolean forbidExisting;
            private final PackageDefinitionStrategy packageDefinitionStrategy;
            private final ByteArrayClassLoader.PersistenceHandler persistenceHandler;

            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final ProtectionDomain protectionDomain;
            private final boolean sealed;

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0024, code lost:
            
                if (r2 != null) goto L18;
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
                ProtectionDomain protectionDomain = this.protectionDomain;
                WrappingDispatcher wrappingDispatcher = (WrappingDispatcher) obj;
                ProtectionDomain protectionDomain2 = wrappingDispatcher.protectionDomain;
                if (protectionDomain2 != null) {
                    if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                        return false;
                    }
                    return this.persistenceHandler.equals(wrappingDispatcher.persistenceHandler) && this.packageDefinitionStrategy.equals(wrappingDispatcher.packageDefinitionStrategy) && this.childFirst == wrappingDispatcher.childFirst && this.forbidExisting == wrappingDispatcher.forbidExisting && this.sealed == wrappingDispatcher.sealed;
                }
            }

            public int hashCode() {
                ProtectionDomain protectionDomain = this.protectionDomain;
                int i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
                if (protectionDomain != null) {
                    i = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + protectionDomain.hashCode();
                }
                return (((((((((i * 31) + this.persistenceHandler.hashCode()) * 31) + this.packageDefinitionStrategy.hashCode()) * 31) + (this.childFirst ? 1 : 0)) * 31) + (this.forbidExisting ? 1 : 0)) * 31) + (this.sealed ? 1 : 0);
            }

            protected WrappingDispatcher(ByteArrayClassLoader.PersistenceHandler persistenceHandler, boolean z) {
                this(NO_PROTECTION_DOMAIN, PackageDefinitionStrategy.Trivial.INSTANCE, persistenceHandler, z, true, true);
            }

            private WrappingDispatcher(ProtectionDomain protectionDomain, PackageDefinitionStrategy packageDefinitionStrategy, ByteArrayClassLoader.PersistenceHandler persistenceHandler, boolean z, boolean z2, boolean z3) {
                this.protectionDomain = protectionDomain;
                this.packageDefinitionStrategy = packageDefinitionStrategy;
                this.persistenceHandler = persistenceHandler;
                this.childFirst = z;
                this.forbidExisting = z2;
                this.sealed = z3;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
                if (this.childFirst) {
                    return ByteArrayClassLoader.ChildFirst.load(classLoader, map, this.protectionDomain, this.persistenceHandler, this.packageDefinitionStrategy, this.forbidExisting, this.sealed);
                }
                return ByteArrayClassLoader.load(classLoader, map, this.protectionDomain, this.persistenceHandler, this.packageDefinitionStrategy, this.forbidExisting, this.sealed);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(ProtectionDomain protectionDomain) {
                return new WrappingDispatcher(protectionDomain, this.packageDefinitionStrategy, this.persistenceHandler, this.childFirst, this.forbidExisting, this.sealed);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(PackageDefinitionStrategy packageDefinitionStrategy) {
                return new WrappingDispatcher(this.protectionDomain, packageDefinitionStrategy, this.persistenceHandler, this.childFirst, this.forbidExisting, this.sealed);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> allowExistingTypes() {
                return new WrappingDispatcher(this.protectionDomain, this.packageDefinitionStrategy, this.persistenceHandler, this.childFirst, false, this.sealed);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> opened() {
                return new WrappingDispatcher(this.protectionDomain, this.packageDefinitionStrategy, this.persistenceHandler, this.childFirst, this.forbidExisting, false);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingLookup implements ClassLoadingStrategy<ClassLoader> {
        private final ClassInjector classInjector;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classInjector.equals(((UsingLookup) obj).classInjector);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classInjector.hashCode();
        }

        protected UsingLookup(ClassInjector classInjector) {
            this.classInjector = classInjector;
        }

        public static ClassLoadingStrategy<ClassLoader> of(Object obj) {
            return new UsingLookup(ClassInjector.UsingLookup.of(obj));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return this.classInjector.inject(map);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForBootstrapInjection implements ClassLoadingStrategy<ClassLoader> {
        private final File folder;
        private final Instrumentation instrumentation;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForBootstrapInjection forBootstrapInjection = (ForBootstrapInjection) obj;
            return this.instrumentation.equals(forBootstrapInjection.instrumentation) && this.folder.equals(forBootstrapInjection.folder);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentation.hashCode()) * 31) + this.folder.hashCode();
        }

        public ForBootstrapInjection(Instrumentation instrumentation, File file) {
            this.instrumentation = instrumentation;
            this.folder = file;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return (classLoader == null ? ClassInjector.UsingInstrumentation.of(this.folder, ClassInjector.UsingInstrumentation.Target.BOOTSTRAP, this.instrumentation) : new ClassInjector.UsingReflection(classLoader)).inject(map);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForUnsafeInjection implements ClassLoadingStrategy<ClassLoader> {

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ProtectionDomain protectionDomain;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[RETURN] */
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
            ProtectionDomain protectionDomain = this.protectionDomain;
            ProtectionDomain protectionDomain2 = ((ForUnsafeInjection) obj).protectionDomain;
            if (protectionDomain2 != null) {
                return protectionDomain != null && protectionDomain.equals(protectionDomain2);
            }
            if (protectionDomain != null) {
                return false;
            }
        }

        public int hashCode() {
            ProtectionDomain protectionDomain = this.protectionDomain;
            return protectionDomain != null ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE + protectionDomain.hashCode() : IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }

        public ForUnsafeInjection() {
            this(NO_PROTECTION_DOMAIN);
        }

        public ForUnsafeInjection(ProtectionDomain protectionDomain) {
            this.protectionDomain = protectionDomain;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return new ClassInjector.UsingUnsafe(classLoader, this.protectionDomain).inject(map);
        }
    }
}
