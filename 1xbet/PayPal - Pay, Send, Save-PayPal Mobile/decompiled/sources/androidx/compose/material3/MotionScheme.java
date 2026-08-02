package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\n\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/MotionScheme;", "", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "defaultSpatialSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "fastEffectsSpec", "slowEffectsSpec", "Companion", "StandardMotionSchemeImpl", "ExpressiveMotionSchemeImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MotionScheme {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.MotionScheme.Companion INSTANCE = androidx.compose.material3.MotionScheme.Companion.getHighResolutionOutputSizeshNQ4ISI;

    <T> androidx.compose.animation.core.FiniteAnimationSpec<T> defaultEffectsSpec();

    <T> androidx.compose.animation.core.FiniteAnimationSpec<T> defaultSpatialSpec();

    <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fastEffectsSpec();

    <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fastSpatialSpec();

    <T> androidx.compose.animation.core.FiniteAnimationSpec<T> slowEffectsSpec();

    <T> androidx.compose.animation.core.FiniteAnimationSpec<T> slowSpatialSpec();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/material3/MotionScheme$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/MotionScheme;", "standard$material3", "()Landroidx/compose/material3/MotionScheme;", "expressive$material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.material3.MotionScheme.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.material3.MotionScheme.Companion();

        private Companion() {
        }

        public final androidx.compose.material3.MotionScheme standard$material3() {
            return androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.INSTANCE;
        }

        public final androidx.compose.material3.MotionScheme expressive$material3() {
            return androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010"}, d2 = {"Landroidx/compose/material3/MotionScheme$StandardMotionSchemeImpl;", "Landroidx/compose/material3/MotionScheme;", "<init>", "()V", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "defaultSpatialSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "fastEffectsSpec", "slowEffectsSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/SpringSpec;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getInputFormats", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class StandardMotionSchemeImpl implements androidx.compose.material3.MotionScheme {
        public static final androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl INSTANCE = new androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringDefaultSpatialDamping(), androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringDefaultSpatialStiffness(), null, 4, null);
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringFastSpatialDamping(), androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringFastSpatialStiffness(), null, 4, null);

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringSlowSpatialDamping(), androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringSlowSpatialStiffness(), null, 4, null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringDefaultEffectsDamping(), androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringDefaultEffectsStiffness(), null, 4, null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringFastEffectsDamping(), androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringFastEffectsStiffness(), null, 4, null);

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getOutputFormats = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringSlowEffectsDamping(), androidx.compose.material3.tokens.StandardMotionTokens.INSTANCE.getSpringSlowEffectsStiffness(), null, 4, null);

        private StandardMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> defaultSpatialSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fastSpatialSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> slowSpatialSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> defaultEffectsSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fastEffectsSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> slowEffectsSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getOutputFormats;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010"}, d2 = {"Landroidx/compose/material3/MotionScheme$ExpressiveMotionSchemeImpl;", "Landroidx/compose/material3/MotionScheme;", "<init>", "()V", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "defaultSpatialSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "fastEffectsSpec", "slowEffectsSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/SpringSpec;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ExpressiveMotionSchemeImpl implements androidx.compose.material3.MotionScheme {
        public static final androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl INSTANCE = new androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringDefaultSpatialDamping(), androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringDefaultSpatialStiffness(), null, 4, null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringFastSpatialDamping(), androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringFastSpatialStiffness(), null, 4, null);

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringSlowSpatialDamping(), androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringSlowSpatialStiffness(), null, 4, null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringDefaultEffectsDamping(), androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringDefaultEffectsStiffness(), null, 4, null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringFastEffectsDamping(), androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringFastEffectsStiffness(), null, 4, null);
        private static final androidx.compose.animation.core.SpringSpec<java.lang.Object> getInputSizeshNQ4ISI = androidx.compose.animation.core.AnimationSpecKt.spring$default(androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringSlowEffectsDamping(), androidx.compose.material3.tokens.ExpressiveMotionTokens.INSTANCE.getSpringSlowEffectsStiffness(), null, 4, null);

        private ExpressiveMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> defaultSpatialSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fastSpatialSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> slowSpatialSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> defaultEffectsSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fastEffectsSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> slowEffectsSpec() {
            androidx.compose.animation.core.SpringSpec<java.lang.Object> springSpec = getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(springSpec, "");
            return springSpec;
        }
    }
}
