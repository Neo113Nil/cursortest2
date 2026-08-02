package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/animation/core/StartDelayAnimationSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "p0", "", "p1", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;J)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/AnimationSpec;", "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class StartDelayAnimationSpec<T> implements androidx.compose.animation.core.AnimationSpec<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;
    private final androidx.compose.animation.core.AnimationSpec<T> getHighSpeedVideoFpsRangesFor;

    public StartDelayAnimationSpec(androidx.compose.animation.core.AnimationSpec<T> animationSpec, long j) {
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> p0) {
        return new androidx.compose.animation.core.StartDelayVectorizedAnimationSpec(this.getHighSpeedVideoFpsRangesFor.vectorize(p0), this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Long.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.animation.core.StartDelayAnimationSpec)) {
            return false;
        }
        androidx.compose.animation.core.StartDelayAnimationSpec startDelayAnimationSpec = (androidx.compose.animation.core.StartDelayAnimationSpec) p0;
        return startDelayAnimationSpec.Camera2StreamConfigurationMap == this.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(startDelayAnimationSpec.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
    }
}
