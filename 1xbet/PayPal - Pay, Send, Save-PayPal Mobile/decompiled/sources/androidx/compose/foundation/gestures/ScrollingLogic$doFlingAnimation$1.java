package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {857}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollingLogic$doFlingAnimation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.mo1521doFlingAnimationQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$1(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = scrollingLogic;
    }
}
