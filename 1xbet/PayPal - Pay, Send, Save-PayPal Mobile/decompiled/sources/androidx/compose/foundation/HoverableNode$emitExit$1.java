package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {}, l = {114}, m = "emitExit", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class HoverableNode$emitExit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.HoverableNode getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableNode$emitExit$1(androidx.compose.foundation.HoverableNode hoverableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.HoverableNode$emitExit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = hoverableNode;
    }
}
