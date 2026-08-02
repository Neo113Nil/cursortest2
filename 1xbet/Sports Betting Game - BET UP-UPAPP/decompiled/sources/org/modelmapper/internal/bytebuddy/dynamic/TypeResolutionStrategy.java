package org.modelmapper.internal.bytebuddy.dynamic;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;

/* loaded from: classes4.dex */
public interface TypeResolutionStrategy {

    public interface Resolved {
        <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, S s, ClassLoadingStrategy<? super S> classLoadingStrategy);

        TypeInitializer injectedInto(TypeInitializer typeInitializer);
    }

    Resolved resolve();

    public enum Passive implements TypeResolutionStrategy, Resolved {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
            return typeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
            Map<TypeDescription, Class<?>> load = classLoadingStrategy.load(s, dynamicType.getAllTypes());
            for (Map.Entry<TypeDescription, LoadedTypeInitializer> entry : dynamicType.getLoadedTypeInitializers().entrySet()) {
                entry.getValue().onLoad(load.get(entry.getKey()));
            }
            return new HashMap(load);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Active implements TypeResolutionStrategy {
        private final NexusAccessor nexusAccessor;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.nexusAccessor.equals(((Active) obj).nexusAccessor);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.nexusAccessor.hashCode();
        }

        public Active() {
            this(new NexusAccessor());
        }

        public Active(NexusAccessor nexusAccessor) {
            this.nexusAccessor = nexusAccessor;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return new Resolved(this.nexusAccessor, new Random().nextInt());
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Resolved implements Resolved {
            private final int identification;
            private final NexusAccessor nexusAccessor;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Resolved resolved = (Resolved) obj;
                return this.nexusAccessor.equals(resolved.nexusAccessor) && this.identification == resolved.identification;
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.nexusAccessor.hashCode()) * 31) + this.identification;
            }

            protected Resolved(NexusAccessor nexusAccessor, int i) {
                this.nexusAccessor = nexusAccessor;
                this.identification = i;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
            public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
                return typeInitializer.expandWith(new NexusAccessor.InitializationAppender(this.identification));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
            public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
                HashMap hashMap = new HashMap(dynamicType.getLoadedTypeInitializers());
                TypeDescription typeDescription = dynamicType.getTypeDescription();
                Map<TypeDescription, Class<?>> load = classLoadingStrategy.load(s, dynamicType.getAllTypes());
                this.nexusAccessor.register(typeDescription.getName(), load.get(typeDescription).getClassLoader(), this.identification, (LoadedTypeInitializer) hashMap.remove(typeDescription));
                for (Map.Entry entry : hashMap.entrySet()) {
                    ((LoadedTypeInitializer) entry.getValue()).onLoad(load.get(entry.getKey()));
                }
                return load;
            }
        }
    }

    public enum Lazy implements TypeResolutionStrategy, Resolved {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
            return typeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
            return classLoadingStrategy.load(s, dynamicType.getAllTypes());
        }
    }

    public enum Disabled implements TypeResolutionStrategy, Resolved {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
            return typeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
            throw new IllegalStateException("Cannot initialize a dynamic type for a disabled type resolution strategy");
        }
    }
}
