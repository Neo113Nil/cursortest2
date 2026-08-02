package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1", f = "HttpTimeout.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpTimeoutKt$HttpTimeout$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    final /* synthetic */ java.lang.Long Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Long getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.Long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.plugins.api.Send.Sender sender = (io.ktor.client.plugins.api.Send.Sender) this.getHighSpeedVideoSizesFor;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.getHighSpeedVideoFpsRanges;
        boolean access$getSupportsRequestTimeout = io.ktor.client.plugins.HttpTimeoutKt.access$getSupportsRequestTimeout(httpRequestBuilder);
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) httpRequestBuilder.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null && io.ktor.client.plugins.HttpTimeoutKt.access$HttpTimeout$lambda$1$hasNotNullTimeouts(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, access$getSupportsRequestTimeout)) {
            httpTimeoutConfig = new io.ktor.client.plugins.HttpTimeoutConfig(null, null, null, 7, null);
            httpRequestBuilder.setCapability(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE, httpTimeoutConfig);
        }
        if (httpTimeoutConfig != null) {
            java.lang.Long l = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Long l2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Long l3 = this.Camera2StreamConfigurationMap;
            java.lang.Long getHighSpeedVideoFpsRangesFor = httpTimeoutConfig.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor != null) {
                l = getHighSpeedVideoFpsRangesFor;
            }
            httpTimeoutConfig.setConnectTimeoutMillis(l);
            java.lang.Long getHighSpeedVideoSizes = httpTimeoutConfig.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes != null) {
                l2 = getHighSpeedVideoSizes;
            }
            httpTimeoutConfig.setSocketTimeoutMillis(l2);
            if (access$getSupportsRequestTimeout) {
                java.lang.Long getHighSpeedVideoFpsRanges = httpTimeoutConfig.getGetHighSpeedVideoFpsRanges();
                if (getHighSpeedVideoFpsRanges != null) {
                    l3 = getHighSpeedVideoFpsRanges;
                }
                httpTimeoutConfig.setRequestTimeoutMillis(l3);
                io.ktor.client.plugins.HttpTimeoutKt.access$applyRequestTimeout(sender, httpRequestBuilder, httpTimeoutConfig.getGetHighSpeedVideoFpsRanges());
            }
        }
        this.getHighSpeedVideoSizesFor = null;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object proceed = sender.proceed(httpRequestBuilder, this);
        return proceed == coroutine_suspended ? coroutine_suspended : proceed;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1 httpTimeoutKt$HttpTimeout$3$1 = new io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        httpTimeoutKt$HttpTimeout$3$1.getHighSpeedVideoSizesFor = sender;
        httpTimeoutKt$HttpTimeout$3$1.getHighSpeedVideoFpsRanges = httpRequestBuilder;
        return httpTimeoutKt$HttpTimeout$3$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpTimeoutKt$HttpTimeout$3$1(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = l;
        this.getHighResolutionOutputSizeshNQ4ISI = l2;
        this.getHighSpeedVideoFpsRangesFor = l3;
    }
}
