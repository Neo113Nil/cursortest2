package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002?\u0012;\u00129\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\t0\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJV\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2=\u0010\u000e\u001a9\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/client/plugins/api/RequestHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function4;", "Lio/ktor/client/plugins/api/OnRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ParameterName;", "", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function4;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function4<? super io.ktor.client.plugins.api.OnRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.RequestHook INSTANCE = new io.ktor.client.plugins.api.RequestHook();

    private RequestHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* bridge */ /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function4<? super io.ktor.client.plugins.api.OnRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4) {
        install2(httpClient, (kotlin.jvm.functions.Function4<? super io.ktor.client.plugins.api.OnRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) function4);
    }

    /* renamed from: install, reason: avoid collision after fix types in other method */
    public final void install2(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function4<? super io.ktor.client.plugins.api.OnRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        client.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getState(), new io.ktor.client.plugins.api.RequestHook$install$1(handler, null));
    }
}
