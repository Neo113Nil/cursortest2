package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.GraphLoop", f = "GraphLoop.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2}, l = {479, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 488}, m = "processRequestProcessor", n = {"commands", "command", "commandsRemoved", "$this$removeUpTo$iv", "it", "a$iv", "b$iv", "commands", "command", "commandsRemoved", "$this$removeUpTo$iv", "a$iv", "b$iv", "commands", "command", "commandsRemoved"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes6.dex */
final class GraphLoop$processRequestProcessor$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.GraphLoop getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes(null, 0, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphLoop$processRequestProcessor$1(androidx.camera.camera2.pipe.graph.GraphLoop graphLoop, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1> continuation) {
        super(continuation);
        this.getInputFormats = graphLoop;
    }
}
