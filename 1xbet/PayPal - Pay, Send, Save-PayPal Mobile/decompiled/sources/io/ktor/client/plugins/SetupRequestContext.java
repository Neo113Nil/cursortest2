package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002@\u0012<\u0012:\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJW\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2>\u0010\f\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/plugins/SetupRequestContext;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function3;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SetupRequestContext implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.SetupRequestContext INSTANCE = new io.ktor.client.plugins.SetupRequestContext();

    private SetupRequestContext() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        client.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getBefore(), new io.ktor.client.plugins.SetupRequestContext$install$1(handler, null));
    }
}
