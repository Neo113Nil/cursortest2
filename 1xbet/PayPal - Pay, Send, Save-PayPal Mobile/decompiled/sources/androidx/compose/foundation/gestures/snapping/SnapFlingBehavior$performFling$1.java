package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {100}, m = "performFling", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SnapFlingBehavior$performFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.performFling(null, 0.0f, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$performFling$1(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = snapFlingBehavior;
    }
}
