package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic2D", f = "Scrollable2D.kt", i = {0}, l = {434}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollingLogic2D$doFlingAnimation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic2D getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.mo1521doFlingAnimationQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic2D$doFlingAnimation$1(androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = scrollingLogic2D;
    }
}
