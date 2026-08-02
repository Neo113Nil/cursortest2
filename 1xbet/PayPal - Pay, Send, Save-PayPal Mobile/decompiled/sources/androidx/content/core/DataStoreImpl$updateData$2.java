package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$updateData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.SimpleActor simpleActor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        androidx.content.core.NoValueDataState currentState = ((androidx.content.core.DataStoreImpl) this.getHighResolutionOutputSizeshNQ4ISI).getInputFormats.getCurrentState();
        if (currentState instanceof androidx.content.core.Data) {
            currentState = new androidx.content.core.NoValueDataState(((androidx.content.core.Data) currentState).getVersion());
        }
        androidx.datastore.core.Message.Update update = new androidx.datastore.core.Message.Update(this.getHighSpeedVideoSizes, CompletableDeferred$default, currentState, coroutineScope.getCoroutineContext());
        simpleActor = ((androidx.content.core.DataStoreImpl) this.getHighResolutionOutputSizeshNQ4ISI).getOutputSizes;
        simpleActor.offer(update);
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object await = CompletableDeferred$default.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$updateData$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new androidx.content.core.DataStoreImpl$updateData$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        dataStoreImpl$updateData$2.getHighSpeedVideoFpsRangesFor = obj;
        return dataStoreImpl$updateData$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$updateData$2(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$updateData$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = dataStoreImpl;
        this.getHighSpeedVideoSizes = function2;
    }
}
