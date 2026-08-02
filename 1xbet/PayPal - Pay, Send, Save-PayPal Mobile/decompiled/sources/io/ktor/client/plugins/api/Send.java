package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002/\u0012+\u0012)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0002\b\b0\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJF\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2-\u0010\r\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/client/plugins/api/Send;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/api/Send$Sender;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/client/call/HttpClientCall;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function3;)V", "Sender"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Send implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.api.Send.Sender, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.Send INSTANCE = new io.ktor.client.plugins.api.Send();

    private Send() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/api/Send$Sender;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/client/plugins/Sender;", "httpSendSender", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/Sender;Lkotlin/coroutines/CoroutineContext;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "requestBuilder", "Lio/ktor/client/call/HttpClientCall;", "proceed", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/client/plugins/Sender;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Sender implements kotlinx.coroutines.CoroutineScope {
        private final kotlin.coroutines.CoroutineContext coroutineContext;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final io.ktor.client.plugins.Sender getHighSpeedVideoSizes;

        public Sender(io.ktor.client.plugins.Sender sender, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            this.getHighSpeedVideoSizes = sender;
            this.coroutineContext = coroutineContext;
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }

        public final java.lang.Object proceed(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
            return this.getHighSpeedVideoSizes.execute(httpRequestBuilder, continuation);
        }
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.api.Send.Sender, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        ((io.ktor.client.plugins.HttpSend) io.ktor.client.plugins.HttpClientPluginKt.plugin(client, io.ktor.client.plugins.HttpSend.INSTANCE)).intercept(new io.ktor.client.plugins.api.Send$install$1(handler, client, null));
    }
}
