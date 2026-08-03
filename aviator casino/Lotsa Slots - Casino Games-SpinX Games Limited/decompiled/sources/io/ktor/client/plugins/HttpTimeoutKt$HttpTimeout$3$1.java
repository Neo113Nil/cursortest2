package io.ktor.client.plugins;

/* compiled from: HttpTimeout.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1", f = "HttpTimeout.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HttpTimeoutKt$HttpTimeout$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    final /* synthetic */ java.lang.Long $connectTimeoutMillis;
    final /* synthetic */ java.lang.Long $requestTimeoutMillis;
    final /* synthetic */ java.lang.Long $socketTimeoutMillis;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpTimeoutKt$HttpTimeout$3$1(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1> continuation) {
        super(3, continuation);
        this.$requestTimeoutMillis = l;
        this.$connectTimeoutMillis = l2;
        this.$socketTimeoutMillis = l3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1 httpTimeoutKt$HttpTimeout$3$1 = new io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, continuation);
        httpTimeoutKt$HttpTimeout$3$1.L$0 = sender;
        httpTimeoutKt$HttpTimeout$3$1.L$1 = httpRequestBuilder;
        return httpTimeoutKt$HttpTimeout$3$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean supportsRequestTimeout;
        boolean HttpTimeout$lambda$1$hasNotNullTimeouts;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.api.Send.Sender sender = (io.ktor.client.plugins.api.Send.Sender) this.L$0;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            supportsRequestTimeout = io.ktor.client.plugins.HttpTimeoutKt.getSupportsRequestTimeout(httpRequestBuilder);
            io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) httpRequestBuilder.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
            if (httpTimeoutConfig == null) {
                HttpTimeout$lambda$1$hasNotNullTimeouts = io.ktor.client.plugins.HttpTimeoutKt.HttpTimeout$lambda$1$hasNotNullTimeouts(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, supportsRequestTimeout);
                if (HttpTimeout$lambda$1$hasNotNullTimeouts) {
                    httpTimeoutConfig = new io.ktor.client.plugins.HttpTimeoutConfig(null, null, null, 7, null);
                    httpRequestBuilder.setCapability(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE, httpTimeoutConfig);
                }
            }
            if (httpTimeoutConfig != null) {
                java.lang.Long l = this.$connectTimeoutMillis;
                java.lang.Long l2 = this.$socketTimeoutMillis;
                java.lang.Long l3 = this.$requestTimeoutMillis;
                java.lang.Long l4 = httpTimeoutConfig.get_connectTimeoutMillis();
                if (l4 != null) {
                    l = l4;
                }
                httpTimeoutConfig.setConnectTimeoutMillis(l);
                java.lang.Long l5 = httpTimeoutConfig.get_socketTimeoutMillis();
                if (l5 != null) {
                    l2 = l5;
                }
                httpTimeoutConfig.setSocketTimeoutMillis(l2);
                if (supportsRequestTimeout) {
                    java.lang.Long l6 = httpTimeoutConfig.get_requestTimeoutMillis();
                    if (l6 != null) {
                        l3 = l6;
                    }
                    httpTimeoutConfig.setRequestTimeoutMillis(l3);
                    io.ktor.client.plugins.HttpTimeoutKt.applyRequestTimeout(sender, httpRequestBuilder, httpTimeoutConfig.get_requestTimeoutMillis());
                }
            }
            this.L$0 = null;
            this.label = 1;
            obj = sender.proceed(httpRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
