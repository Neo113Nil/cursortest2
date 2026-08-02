package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "p0", "p1", "Landroidx/compose/animation/core/Animations;", "p2", "<init>", "(FFLandroidx/compose/animation/core/Animations;)V", "dampingRatio", "stiffness", "visibilityThreshold", "(FFLandroidx/compose/animation/core/AnimationVector;)V", "initialValue", "targetValue", "initialVelocity", "", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDampingRatio", "()F", "getStiffness", "", "isInfinite", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedSpringSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final /* synthetic */ androidx.compose.animation.core.VectorizedFloatAnimationSpec<V> getHighSpeedVideoFpsRanges;
    private final float stiffness;

    private VectorizedSpringSpec(float f, float f2, androidx.compose.animation.core.Animations animations) {
        this.getHighSpeedVideoFpsRanges = new androidx.compose.animation.core.VectorizedFloatAnimationSpec<>(animations);
        this.dampingRatio = f;
        this.stiffness = f2;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public /* synthetic */ VectorizedSpringSpec(float f, float f2, androidx.compose.animation.core.AnimationVector animationVector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : animationVector);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VectorizedSpringSpec(float f, float f2, V v) {
        this(f, f2, r3);
        androidx.compose.animation.core.Animations highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighSpeedVideoSizes(v, f, f2);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean isInfinite() {
        return this.getHighSpeedVideoFpsRanges.isInfinite();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRanges.getVelocityFromNanos(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRanges.getValueFromNanos(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getEndVelocity(V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRanges.getEndVelocity(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRanges.getDurationNanos(initialValue, targetValue, initialVelocity);
    }
}
