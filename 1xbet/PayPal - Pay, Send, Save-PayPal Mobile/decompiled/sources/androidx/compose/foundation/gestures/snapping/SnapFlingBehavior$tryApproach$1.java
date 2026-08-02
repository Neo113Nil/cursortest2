package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {174}, m = "tryApproach", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SnapFlingBehavior$tryApproach$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(null, 0.0f, 0.0f, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$tryApproach$1(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = snapFlingBehavior;
    }
}
