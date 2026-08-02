package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$2", f = "PruningProcessingQueue.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PruningProcessingQueue$processingLoop$2$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Deferred<kotlin.Unit>> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.element = null;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$2) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningProcessingQueue$processingLoop$2$1$2(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Deferred<kotlin.Unit>> objectRef, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = objectRef;
    }
}
