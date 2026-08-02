package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {312}, m = "awaitCtrlMouseScrollOrNull", n = {"$this$awaitCtrlMouseScrollOrNull", "scrollConfig"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class TransformableKt$awaitCtrlMouseScrollOrNull$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = androidx.compose.foundation.gestures.TransformableKt.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    TransformableKt$awaitCtrlMouseScrollOrNull$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1> continuation) {
        super(continuation);
    }
}
