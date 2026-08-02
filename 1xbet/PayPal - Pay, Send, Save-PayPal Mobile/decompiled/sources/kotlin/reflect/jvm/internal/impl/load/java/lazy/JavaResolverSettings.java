package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes5.dex */
public interface JavaResolverSettings {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Companion Companion = kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Companion.getHighResolutionOutputSizeshNQ4ISI;

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getEnhancePrimitiveArrays();

    boolean getIgnoreNullabilityForErasedValueParameters();

    boolean getTypeEnhancementImprovementsInStrictMode();

    public static final class Default implements kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public final boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public final boolean getEnhancePrimitiveArrays() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public final boolean getIgnoreNullabilityForErasedValueParameters() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public final boolean getTypeEnhancementImprovementsInStrictMode() {
            return false;
        }

        private Default() {
        }
    }

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Companion getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Companion();

        private Companion() {
        }
    }
}
