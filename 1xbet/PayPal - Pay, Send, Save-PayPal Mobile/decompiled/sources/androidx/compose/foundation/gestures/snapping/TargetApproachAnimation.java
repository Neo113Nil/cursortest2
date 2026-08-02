package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0017\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/TargetApproachAnimation;", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationSpec;", "p0", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "p1", "p2", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "p3", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/AnimationSpec;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TargetApproachAnimation implements androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    public TargetApproachAnimation(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = animationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.ScrollScope scrollScope, java.lang.Float f, java.lang.Float f2, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        return getHighSpeedVideoFpsRanges(scrollScope, f.floatValue(), f2.floatValue(), function1, continuation);
    }

    private java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, float f2, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getHighResolutionOutputSizeshNQ4ISI(scrollScope, java.lang.Math.abs(f) * java.lang.Math.signum(f2), f, androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.getHighResolutionOutputSizeshNQ4ISI, function1, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : (androidx.compose.foundation.gestures.snapping.AnimationResult) highResolutionOutputSizeshNQ4ISI;
    }
}
