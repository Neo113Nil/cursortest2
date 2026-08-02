package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", i = {0, 0}, l = {103, 108}, m = "invokeSuspend", n = {"$this$on", "request"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class HttpRedirectKt$HttpRedirect$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRedirectConfig> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder;
        io.ktor.client.plugins.api.Send.Sender sender;
        java.util.Set set;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.api.Send.Sender sender2 = (io.ktor.client.plugins.api.Send.Sender) this.getInputFormats;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = (io.ktor.client.request.HttpRequestBuilder) this.getHighSpeedVideoFpsRangesFor;
            this.getInputFormats = sender2;
            this.getHighSpeedVideoFpsRangesFor = httpRequestBuilder2;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object proceed = sender2.proceed(httpRequestBuilder2, this);
            if (proceed != coroutine_suspended) {
                httpRequestBuilder = httpRequestBuilder2;
                sender = sender2;
                obj = proceed;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = (io.ktor.client.request.HttpRequestBuilder) this.getHighSpeedVideoFpsRangesFor;
        sender = (io.ktor.client.plugins.api.Send.Sender) this.getInputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        httpRequestBuilder = httpRequestBuilder3;
        io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            set = io.ktor.client.plugins.HttpRedirectKt.getHighSpeedVideoSizes;
            if (!set.contains(httpClientCall.getRequest().getGetHighSpeedVideoSizes())) {
                return httpClientCall;
            }
        }
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object access$HttpRedirect$lambda$2$handleCall = io.ktor.client.plugins.HttpRedirectKt.access$HttpRedirect$lambda$2$handleCall(sender, httpRequestBuilder, httpClientCall, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.getClient(), this);
        return access$HttpRedirect$lambda$2$handleCall == coroutine_suspended ? coroutine_suspended : access$HttpRedirect$lambda$2$handleCall;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        httpRedirectKt$HttpRedirect$2$1.getInputFormats = sender;
        httpRedirectKt$HttpRedirect$2$1.getHighSpeedVideoFpsRangesFor = httpRequestBuilder;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRedirectConfig> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = z2;
        this.Camera2StreamConfigurationMap = clientPluginBuilder;
    }
}
