package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u000024\u00120\u0012.\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\t0\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f22\u0010\u000e\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/client/plugins/api/ResponseHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/api/OnResponseContext;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function3;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResponseHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.api.OnResponseContext, ? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.ResponseHook INSTANCE = new io.ktor.client.plugins.api.ResponseHook();

    private ResponseHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.api.OnResponseContext, ? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        client.getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), new io.ktor.client.plugins.api.ResponseHook$install$1(handler, null));
    }
}
