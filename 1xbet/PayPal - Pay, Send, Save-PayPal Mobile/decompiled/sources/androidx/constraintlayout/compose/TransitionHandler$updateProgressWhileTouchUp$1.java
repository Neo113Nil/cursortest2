package androidx.constraintlayout.compose;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.TransitionHandler", f = "TransitionHandler.kt", i = {0}, l = {74}, m = "updateProgressWhileTouchUp", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class TransitionHandler$updateProgressWhileTouchUp$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.TransitionHandler getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.updateProgressWhileTouchUp(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionHandler$updateProgressWhileTouchUp$1(androidx.constraintlayout.compose.TransitionHandler transitionHandler, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = transitionHandler;
    }
}
