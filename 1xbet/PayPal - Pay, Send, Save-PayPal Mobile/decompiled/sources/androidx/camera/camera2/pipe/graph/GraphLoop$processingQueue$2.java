package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class GraphLoop$processingQueue$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.camera.camera2.pipe.graph.GraphLoop.access$process((androidx.camera.camera2.pipe.graph.GraphLoop) this.receiver, list, continuation);
    }

    GraphLoop$processingQueue$2(java.lang.Object obj) {
        super(2, obj, androidx.camera.camera2.pipe.graph.GraphLoop.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
