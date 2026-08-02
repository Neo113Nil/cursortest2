package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.GraphLoop", f = "GraphLoop.kt", i = {0, 1, 1, 1, 2, 2}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, 572, 573}, m = "processShutdown", n = {"commands", "commands", "command", "idx", "commands", "idx"}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class GraphLoop$processShutdown$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.GraphLoop getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphLoop$processShutdown$1(androidx.camera.camera2.pipe.graph.GraphLoop graphLoop, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = graphLoop;
    }
}
