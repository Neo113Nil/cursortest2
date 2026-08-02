package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000b\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocity", "calculateTargetValue", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "(Landroidx/compose/animation/core/DecayAnimationSpec;FF)F", "frictionMultiplier", "absVelocityThreshold", "exponentialDecay", "(FF)Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "generateDecayAnimationSpec", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)Landroidx/compose/animation/core/DecayAnimationSpec;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> T calculateTargetValue(androidx.compose.animation.core.DecayAnimationSpec<T> decayAnimationSpec, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, T t2) {
        return twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue(twoWayConverter.getConvertToVector().invoke(t), twoWayConverter.getConvertToVector().invoke(t2)));
    }

    public static final float calculateTargetValue(androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, float f, float f2) {
        return ((androidx.compose.animation.core.AnimationVector1D) decayAnimationSpec.vectorize(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE)).getTargetValue(androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(f), androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(f2))).getValue();
    }

    public static /* synthetic */ androidx.compose.animation.core.DecayAnimationSpec exponentialDecay$default(float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.1f;
        }
        return exponentialDecay(f, f2);
    }

    public static final <T> androidx.compose.animation.core.DecayAnimationSpec<T> exponentialDecay(float f, float f2) {
        return generateDecayAnimationSpec(new androidx.compose.animation.core.FloatExponentialDecaySpec(f, f2));
    }

    public static final <T> androidx.compose.animation.core.DecayAnimationSpec<T> generateDecayAnimationSpec(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new androidx.compose.animation.core.DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }
}
