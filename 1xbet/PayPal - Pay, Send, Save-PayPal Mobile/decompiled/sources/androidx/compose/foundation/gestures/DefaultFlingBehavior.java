package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00178\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "flingDecay", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "density", "", "updateDensity", "(Landroidx/compose/ui/unit/Density;)V", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/MotionDurationScale;", "getHighSpeedVideoFpsRangesFor", "", "lastAnimationCycleCount", com.visa.cbp.getEncExpo.warmup, "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultFlingBehavior implements androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.MotionDurationScale getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    private int lastAnimationCycleCount;

    public DefaultFlingBehavior(androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.ui.MotionDurationScale motionDurationScale) {
        this.getHighSpeedVideoFpsRanges = decayAnimationSpec;
        this.getHighSpeedVideoFpsRangesFor = motionDurationScale;
    }

    public /* synthetic */ DefaultFlingBehavior(androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, androidx.compose.ui.MotionDurationScale motionDurationScale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i & 2) != 0 ? androidx.compose.foundation.gestures.ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void setLastAnimationCycleCount(int i) {
        this.lastAnimationCycleCount = i;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2(f, this, scrollScope, null), continuation);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public final void updateDensity(androidx.compose.ui.unit.Density density) {
        this.getHighSpeedVideoFpsRanges = androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(density);
    }
}
