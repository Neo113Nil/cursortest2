package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1", f = "PruningProcessingQueue.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PruningProcessingQueue$processingLoop$2$1$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.core.PruningProcessingQueue<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.collections.ArrayDeque arrayDeque;
        kotlinx.coroutines.channels.Channel channel;
        kotlin.jvm.functions.Function1 function1;
        kotlin.collections.ArrayDeque arrayDeque2;
        kotlin.collections.ArrayDeque arrayDeque3;
        kotlinx.coroutines.channels.Channel channel2;
        kotlin.collections.ArrayDeque unused;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
            arrayDeque = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.getHighSpeedVideoSizes).getInputFormats;
            arrayDeque.add(obj2);
            channel = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj3 = channel.mo24073tryReceivePtdJZtk();
            while (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj3)) {
                arrayDeque3 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.getHighSpeedVideoSizes).getInputFormats;
                arrayDeque3.add(kotlinx.coroutines.channels.ChannelResult.m24085getOrThrowimpl(obj3));
                channel2 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRangesFor;
                obj3 = channel2.mo24073tryReceivePtdJZtk();
            }
            androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
            androidx.camera.camera2.pipe.core.PruningProcessingQueue<T> pruningProcessingQueue = this.getHighSpeedVideoSizes;
            if (log.getDEBUG_LOGGABLE()) {
                unused = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) pruningProcessingQueue).getInputFormats;
            }
            function1 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap;
            arrayDeque2 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.getHighSpeedVideoSizes).getInputFormats;
            function1.invoke(arrayDeque2);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1 pruningProcessingQueue$processingLoop$2$1$1 = new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1(this.getHighSpeedVideoSizes, continuation);
        pruningProcessingQueue$processingLoop$2$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return pruningProcessingQueue$processingLoop$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningProcessingQueue$processingLoop$2$1$1(androidx.camera.camera2.pipe.core.PruningProcessingQueue<T> pruningProcessingQueue, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = pruningProcessingQueue;
    }
}
