package io.ktor.client.engine;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/request/HttpResponseData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpClientEngine$executeWithinCallContext$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.engine.HttpClientEngine getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.request.HttpRequestData getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (io.ktor.client.engine.HttpClientEngine.DefaultImpls.access$getClosed(this.getHighResolutionOutputSizeshNQ4ISI)) {
            throw new io.ktor.client.engine.ClientEngineClosedException(null, 1, null);
        }
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object execute = this.getHighResolutionOutputSizeshNQ4ISI.execute(this.getHighSpeedVideoSizes, this);
        return execute == coroutine_suspended ? coroutine_suspended : execute;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        return ((io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientEngine$executeWithinCallContext$2(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = httpClientEngine;
        this.getHighSpeedVideoSizes = httpRequestData;
    }
}
