package org.modelmapper.internal.bytebuddy.dynamic.loading;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ClassReloadingStrategy implements ClassLoadingStrategy<ClassLoader> {
    private static final String INSTALLER_TYPE = "org.modelmapper.internal.bytebuddy.agent.Installer";
    private static final String INSTRUMENTATION_GETTER = "getInstrumentation";
    private static final Object STATIC_MEMBER = null;
    private final BootstrapInjection bootstrapInjection;
    private final Instrumentation instrumentation;
    private final Map<String, Class<?>> preregisteredTypes;
    private final Strategy strategy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassReloadingStrategy classReloadingStrategy = (ClassReloadingStrategy) obj;
        return this.instrumentation.equals(classReloadingStrategy.instrumentation) && this.strategy.equals(classReloadingStrategy.strategy) && this.bootstrapInjection.equals(classReloadingStrategy.bootstrapInjection) && this.preregisteredTypes.equals(classReloadingStrategy.preregisteredTypes);
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentation.hashCode()) * 31) + this.strategy.hashCode()) * 31) + this.bootstrapInjection.hashCode()) * 31) + this.preregisteredTypes.hashCode();
    }

    public ClassReloadingStrategy(Instrumentation instrumentation, Strategy strategy) {
        this(instrumentation, strategy, BootstrapInjection.Disabled.INSTANCE, Collections.emptyMap());
    }

    protected ClassReloadingStrategy(Instrumentation instrumentation, Strategy strategy, BootstrapInjection bootstrapInjection, Map<String, Class<?>> map) {
        this.instrumentation = instrumentation;
        this.strategy = strategy.validate(instrumentation);
        this.bootstrapInjection = bootstrapInjection;
        this.preregisteredTypes = map;
    }

    public static ClassReloadingStrategy of(Instrumentation instrumentation) {
        if (instrumentation.isRetransformClassesSupported()) {
            return new ClassReloadingStrategy(instrumentation, Strategy.RETRANSFORMATION);
        }
        if (instrumentation.isRedefineClassesSupported()) {
            return new ClassReloadingStrategy(instrumentation, Strategy.REDEFINITION);
        }
        throw new IllegalArgumentException("Instrumentation does not support reloading of classes: " + instrumentation);
    }

    public static ClassReloadingStrategy fromInstalledAgent() {
        try {
            return of((Instrumentation) ClassLoader.getSystemClassLoader().loadClass(INSTALLER_TYPE).getMethod(INSTRUMENTATION_GETTER, new Class[0]).invoke(STATIC_MEMBER, new Object[0]));
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", e2);
        }
    }

    public static ClassReloadingStrategy fromInstalledAgent(Strategy strategy) {
        try {
            return new ClassReloadingStrategy((Instrumentation) ClassLoader.getSystemClassLoader().loadClass(INSTALLER_TYPE).getMethod(INSTRUMENTATION_GETTER, new Class[0]).invoke(STATIC_MEMBER, new Object[0]), strategy);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", e2);
        }
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
    public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
        HashMap hashMap = new HashMap(this.preregisteredTypes);
        for (Class cls : this.instrumentation.getInitiatedClasses(classLoader)) {
            hashMap.put(TypeDescription.ForLoadedType.getName(cls), cls);
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        HashMap hashMap2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
            Class cls2 = (Class) hashMap.get(entry.getKey().getName());
            if (cls2 != null) {
                concurrentHashMap.put(cls2, new ClassDefinition(cls2, entry.getValue()));
                hashMap2.put(entry.getKey(), cls2);
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            this.strategy.apply(this.instrumentation, concurrentHashMap);
            if (!linkedHashMap.isEmpty()) {
                hashMap2.putAll((classLoader == null ? this.bootstrapInjection.make(this.instrumentation) : new ClassInjector.UsingReflection(classLoader)).inject(linkedHashMap));
            }
            return hashMap2;
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Could not locate classes for redefinition", e);
        } catch (UnmodifiableClassException e2) {
            throw new IllegalStateException("Cannot redefine specified class", e2);
        }
    }

    public ClassReloadingStrategy reset(Class<?>... clsArr) throws IOException {
        return clsArr.length == 0 ? this : reset(ClassFileLocator.ForClassLoader.of(clsArr[0].getClassLoader()), clsArr);
    }

    public ClassReloadingStrategy reset(ClassFileLocator classFileLocator, Class<?>... clsArr) throws IOException {
        if (clsArr.length > 0) {
            try {
                this.strategy.reset(this.instrumentation, classFileLocator, Arrays.asList(clsArr));
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("Cannot locate types " + Arrays.toString(clsArr), e);
            } catch (UnmodifiableClassException e2) {
                throw new IllegalStateException("Cannot reset types " + Arrays.toString(clsArr), e2);
            }
        }
        return this;
    }

    public ClassReloadingStrategy enableBootstrapInjection(File file) {
        return new ClassReloadingStrategy(this.instrumentation, this.strategy, new BootstrapInjection.Enabled(file), this.preregisteredTypes);
    }

    public ClassReloadingStrategy preregistered(Class<?>... clsArr) {
        HashMap hashMap = new HashMap(this.preregisteredTypes);
        for (Class<?> cls : clsArr) {
            hashMap.put(TypeDescription.ForLoadedType.getName(cls), cls);
        }
        return new ClassReloadingStrategy(this.instrumentation, this.strategy, this.bootstrapInjection, hashMap);
    }

    public enum Strategy {
        REDEFINITION(true) { // from class: org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.1
            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy
            protected void apply(Instrumentation instrumentation, Map<Class<?>, ClassDefinition> map) throws UnmodifiableClassException, ClassNotFoundException {
                instrumentation.redefineClasses((ClassDefinition[]) map.values().toArray(new ClassDefinition[map.size()]));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy
            protected Strategy validate(Instrumentation instrumentation) {
                if (instrumentation.isRedefineClassesSupported()) {
                    return this;
                }
                throw new IllegalArgumentException("Does not support redefinition: " + instrumentation);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy
            public void reset(Instrumentation instrumentation, ClassFileLocator classFileLocator, List<Class<?>> list) throws IOException, UnmodifiableClassException, ClassNotFoundException {
                HashMap hashMap = new HashMap(list.size());
                for (Class<?> cls : list) {
                    hashMap.put(cls, new ClassDefinition(cls, classFileLocator.locate(TypeDescription.ForLoadedType.getName(cls)).resolve()));
                }
                apply(instrumentation, hashMap);
            }
        },
        RETRANSFORMATION(0 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.2
            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy
            protected void apply(Instrumentation instrumentation, Map<Class<?>, ClassDefinition> map) throws UnmodifiableClassException {
                ClassRedefinitionTransformer classRedefinitionTransformer = new ClassRedefinitionTransformer(map);
                synchronized (this) {
                    instrumentation.addTransformer(classRedefinitionTransformer, true);
                    try {
                        instrumentation.retransformClasses((Class[]) map.keySet().toArray(new Class[map.size()]));
                    } finally {
                        instrumentation.removeTransformer(classRedefinitionTransformer);
                    }
                }
                classRedefinitionTransformer.assertTransformation();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy
            protected Strategy validate(Instrumentation instrumentation) {
                if (instrumentation.isRetransformClassesSupported()) {
                    return this;
                }
                throw new IllegalArgumentException("Does not support retransformation: " + instrumentation);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy
            public void reset(Instrumentation instrumentation, ClassFileLocator classFileLocator, List<Class<?>> list) throws IOException, UnmodifiableClassException, ClassNotFoundException {
                for (Class<?> cls : list) {
                    if (!instrumentation.isModifiableClass(cls)) {
                        throw new IllegalArgumentException("Cannot modify type: " + cls);
                    }
                }
                instrumentation.addTransformer(ClassResettingTransformer.INSTANCE, true);
                try {
                    instrumentation.retransformClasses((Class[]) list.toArray(new Class[list.size()]));
                } finally {
                    instrumentation.removeTransformer(ClassResettingTransformer.INSTANCE);
                }
            }
        };

        private static final byte[] NO_REDEFINITION = null;
        private static final boolean REDEFINE_CLASSES = true;
        private final boolean redefinition;

        protected abstract void apply(Instrumentation instrumentation, Map<Class<?>, ClassDefinition> map) throws UnmodifiableClassException, ClassNotFoundException;

        public abstract void reset(Instrumentation instrumentation, ClassFileLocator classFileLocator, List<Class<?>> list) throws IOException, UnmodifiableClassException, ClassNotFoundException;

        protected abstract Strategy validate(Instrumentation instrumentation);

        Strategy(boolean z) {
            this.redefinition = z;
        }

        public boolean isRedefinition() {
            return this.redefinition;
        }

        protected static class ClassRedefinitionTransformer implements ClassFileTransformer {
            private final Map<Class<?>, ClassDefinition> redefinedClasses;

            protected ClassRedefinitionTransformer(Map<Class<?>, ClassDefinition> map) {
                this.redefinedClasses = map;
            }

            public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                ClassDefinition remove;
                if (str != null && (remove = this.redefinedClasses.remove(cls)) != null) {
                    return remove.getDefinitionClassFile();
                }
                return Strategy.NO_REDEFINITION;
            }

            public void assertTransformation() {
                if (!this.redefinedClasses.isEmpty()) {
                    throw new IllegalStateException("Could not transform: " + this.redefinedClasses.keySet());
                }
            }
        }

        protected enum ClassResettingTransformer implements ClassFileTransformer {
            INSTANCE;

            public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                return Strategy.NO_REDEFINITION;
            }
        }
    }

    protected interface BootstrapInjection {
        ClassInjector make(Instrumentation instrumentation);

        public enum Disabled implements BootstrapInjection {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection
            public ClassInjector make(Instrumentation instrumentation) {
                throw new IllegalStateException("Bootstrap injection is not enabled");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Enabled implements BootstrapInjection {
            private final File folder;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.folder.equals(((Enabled) obj).folder);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.folder.hashCode();
            }

            protected Enabled(File file) {
                this.folder = file;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection
            public ClassInjector make(Instrumentation instrumentation) {
                return ClassInjector.UsingInstrumentation.of(this.folder, ClassInjector.UsingInstrumentation.Target.BOOTSTRAP, instrumentation);
            }
        }
    }
}
