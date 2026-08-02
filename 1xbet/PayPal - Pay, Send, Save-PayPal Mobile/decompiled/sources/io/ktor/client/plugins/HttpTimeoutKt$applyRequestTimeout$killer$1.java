package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1", f = "HttpTimeout.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpTimeoutKt$applyRequestTimeout$killer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.request.HttpRequestBuilder getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.Job getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.slf4j.Logger logger;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(this.getHighSpeedVideoFpsRanges.longValue(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.ktor.client.plugins.HttpRequestTimeoutException httpRequestTimeoutException = new io.ktor.client.plugins.HttpRequestTimeoutException(this.getHighResolutionOutputSizeshNQ4ISI);
        logger = io.ktor.client.plugins.HttpTimeoutKt.getHighSpeedVideoFpsRanges;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request timeout: ");
            sb.append(httpRequestBuilder.getUrl());
            logger.trace(sb.toString());
        }
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        java.lang.String message = httpRequestTimeoutException.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        kotlinx.coroutines.JobKt.cancel(job, message, httpRequestTimeoutException);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpTimeoutKt$applyRequestTimeout$killer$1(java.lang.Long l, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = l;
        this.getHighResolutionOutputSizeshNQ4ISI = httpRequestBuilder;
        this.getHighSpeedVideoSizes = job;
    }
}
