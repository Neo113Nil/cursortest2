package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {114}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class SnapFlingBehavior$fling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(null, 0.0f, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$1(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = snapFlingBehavior;
    }
}
