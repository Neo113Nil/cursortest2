package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {}, l = {150}, m = "userScroll", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$userScroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.MouseWheelScrollingLogic getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$userScroll$1(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mouseWheelScrollingLogic;
    }
}
