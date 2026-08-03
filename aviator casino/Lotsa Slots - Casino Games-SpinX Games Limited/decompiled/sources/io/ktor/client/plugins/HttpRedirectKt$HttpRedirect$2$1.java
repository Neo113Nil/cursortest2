package io.ktor.client.plugins;

/* compiled from: HttpRedirect.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", i = {0, 0}, l = {103, 108}, m = "invokeSuspend", n = {"$this$on", "request"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class HttpRedirectKt$HttpRedirect$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRedirectConfig> $this_createClientPlugin;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRedirectConfig> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1> continuation) {
        super(3, continuation);
        this.$checkHttpMethod = z;
        this.$allowHttpsDowngrade = z2;
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, this.$this_createClientPlugin, continuation);
        httpRedirectKt$HttpRedirect$2$1.L$0 = sender;
        httpRedirectKt$HttpRedirect$2$1.L$1 = httpRequestBuilder;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder;
        io.ktor.client.plugins.api.Send.Sender sender;
        java.util.Set set;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.api.Send.Sender sender2 = (io.ktor.client.plugins.api.Send.Sender) this.L$0;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            this.L$0 = sender2;
            this.L$1 = httpRequestBuilder2;
            this.label = 1;
            java.lang.Object proceed = sender2.proceed(httpRequestBuilder2, this);
            if (proceed == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpRequestBuilder = httpRequestBuilder2;
            sender = sender2;
            obj = proceed;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            sender = (io.ktor.client.plugins.api.Send.Sender) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            httpRequestBuilder = httpRequestBuilder3;
        }
        io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
        if (this.$checkHttpMethod) {
            set = io.ktor.client.plugins.HttpRedirectKt.ALLOWED_FOR_REDIRECT;
            if (!set.contains(httpClientCall.getRequest().getMethod())) {
                return httpClientCall;
            }
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = io.ktor.client.plugins.HttpRedirectKt.HttpRedirect$lambda$2$handleCall(sender, httpRequestBuilder, httpClientCall, this.$allowHttpsDowngrade, this.$this_createClientPlugin.getClient(), this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
