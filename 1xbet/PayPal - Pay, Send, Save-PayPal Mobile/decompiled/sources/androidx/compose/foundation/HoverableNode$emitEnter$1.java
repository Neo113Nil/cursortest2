package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {106}, m = "emitEnter", n = {"interaction"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class HoverableNode$emitEnter$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.foundation.HoverableNode getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableNode$emitEnter$1(androidx.compose.foundation.HoverableNode hoverableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.HoverableNode$emitEnter$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = hoverableNode;
    }
}
