package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class GraphLoop$processingQueue$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.util.List<? extends androidx.camera.camera2.pipe.graph.GraphCommand>, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends androidx.camera.camera2.pipe.graph.GraphCommand> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.camera.camera2.pipe.graph.GraphLoop.access$finalizeUnprocessedCommands((androidx.camera.camera2.pipe.graph.GraphLoop) this.receiver, list);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.camera.camera2.pipe.graph.GraphCommand> list) {
        getHighResolutionOutputSizeshNQ4ISI(list);
        return kotlin.Unit.INSTANCE;
    }

    GraphLoop$processingQueue$1(java.lang.Object obj) {
        super(1, obj, androidx.camera.camera2.pipe.graph.GraphLoop.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", 0);
    }
}
