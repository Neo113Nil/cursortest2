package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/animation/core/VectorizedTweenSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "()I", "getDelayMillis", "Landroidx/compose/animation/core/Easing;", "getEasing", "()Landroidx/compose/animation/core/Easing;", "Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedTweenSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final androidx.compose.animation.core.Easing easing;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.VectorizedFloatAnimationSpec<V> getHighSpeedVideoFpsRangesFor;

    public VectorizedTweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing) {
        this.durationMillis = i;
        this.delayMillis = i2;
        this.easing = easing;
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.VectorizedFloatAnimationSpec<>(new androidx.compose.animation.core.FloatTweenSpec(getDurationMillis(), getDelayMillis(), easing));
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public /* synthetic */ VectorizedTweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing() : easing);
    }

    public final androidx.compose.animation.core.Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRangesFor.getValueFromNanos(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRangesFor.getVelocityFromNanos(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    public VectorizedTweenSpec() {
        this(0, 0, null, 7, null);
    }
}
