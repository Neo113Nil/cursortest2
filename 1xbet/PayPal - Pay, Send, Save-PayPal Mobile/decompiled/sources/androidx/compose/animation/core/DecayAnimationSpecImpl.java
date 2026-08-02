package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/animation/core/DecayAnimationSpecImpl;", "T", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "p0", "<init>", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DecayAnimationSpecImpl<T> implements androidx.compose.animation.core.DecayAnimationSpec<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.core.FloatDecayAnimationSpec getHighSpeedVideoFpsRangesFor;

    public DecayAnimationSpecImpl(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.getHighSpeedVideoFpsRangesFor = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedDecayAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> p0) {
        return new androidx.compose.animation.core.VectorizedFloatDecaySpec(this.getHighSpeedVideoFpsRangesFor);
    }
}
