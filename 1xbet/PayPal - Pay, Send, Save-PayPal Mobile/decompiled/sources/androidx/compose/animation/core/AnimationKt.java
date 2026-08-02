package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010\u001d\u001a\u00020\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b \u0010\u001f"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "", "playTimeNanos", "getVelocityFromNanos", "(Landroidx/compose/animation/core/Animation;J)Ljava/lang/Object;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/TargetBasedAnimation;", "createAnimation", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/TargetBasedAnimation;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "TargetBasedAnimation", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/TargetBasedAnimation;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "Landroidx/compose/animation/core/DecayAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "DecayAnimation", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;FF)Landroidx/compose/animation/core/DecayAnimation;", "getDurationMillis", "(Landroidx/compose/animation/core/Animation;)J", "durationMillis", "MillisToNanos", "J", "SecondsToMillis"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector Camera2StreamConfigurationMap(androidx.compose.animation.core.AnimationVector animationVector) {
        return animationVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector getHighSpeedVideoFpsRanges(androidx.compose.animation.core.AnimationVector animationVector) {
        return animationVector;
    }

    public static final long getDurationMillis(androidx.compose.animation.core.Animation<?, ?> animation) {
        return animation.getDurationNanos() / 1000000;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> T getVelocityFromNanos(androidx.compose.animation.core.Animation<T, V> animation, long j) {
        return animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j));
    }

    public static final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.TargetBasedAnimation<V, V> createAnimation(androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        return new androidx.compose.animation.core.TargetBasedAnimation<>(vectorizedAnimationSpec, (androidx.compose.animation.core.TwoWayConverter<V, V>) androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.AnimationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.animation.core.AnimationVector highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationKt.getHighSpeedVideoFpsRanges((androidx.compose.animation.core.AnimationVector) obj);
                return highSpeedVideoFpsRanges;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.AnimationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.animation.core.AnimationVector Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationKt.Camera2StreamConfigurationMap((androidx.compose.animation.core.AnimationVector) obj);
                return Camera2StreamConfigurationMap;
            }
        }), v, v2, v3);
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.TargetBasedAnimation<T, V> TargetBasedAnimation(androidx.compose.animation.core.AnimationSpec<T> animationSpec, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3) {
        return new androidx.compose.animation.core.TargetBasedAnimation<>(animationSpec, twoWayConverter, t, t2, twoWayConverter.getConvertToVector().invoke(t3));
    }

    public static /* synthetic */ androidx.compose.animation.core.DecayAnimation DecayAnimation$default(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f, f2);
    }

    public static final androidx.compose.animation.core.DecayAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> DecayAnimation(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2) {
        return new androidx.compose.animation.core.DecayAnimation<>((androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float>) androidx.compose.animation.core.DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), java.lang.Float.valueOf(f), androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(f2));
    }
}
