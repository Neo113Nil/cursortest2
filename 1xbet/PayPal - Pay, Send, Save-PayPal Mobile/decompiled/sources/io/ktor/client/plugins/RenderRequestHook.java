package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002,\u0012(\u0012&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2*\u0010\u000b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/plugins/RenderRequestHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/coroutines/Continuation;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function3;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RenderRequestHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.RenderRequestHook INSTANCE = new io.ktor.client.plugins.RenderRequestHook();

    private RenderRequestHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* bridge */ /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function3) {
        install2(httpClient, (kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>) function3);
    }

    /* renamed from: install, reason: avoid collision after fix types in other method */
    public final void install2(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        client.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getRender(), new io.ktor.client.plugins.RenderRequestHook$install$1(handler, null));
    }
}
