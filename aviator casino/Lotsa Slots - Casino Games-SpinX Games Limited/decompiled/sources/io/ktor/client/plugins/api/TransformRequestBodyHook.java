package io.ktor.client.plugins.api;

/* compiled from: KtorCallContexts.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002l\u0012h\u0012f\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\u000e0\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0083\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112j\u0010\u0013\u001af\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/client/plugins/api/TransformRequestBodyHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ParameterName;", "name", "request", "", "content", "Lio/ktor/util/reflect/TypeInfo;", "bodyType", "Lkotlin/coroutines/Continuation;", "Lio/ktor/http/content/OutgoingContent;", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function5;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformRequestBodyHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.TransformRequestBodyHook INSTANCE = new io.ktor.client.plugins.api.TransformRequestBodyHook();

    private TransformRequestBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public /* bridge */ /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function5) {
        install2(httpClient, (kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>) function5);
    }

    /* renamed from: install, reason: avoid collision after fix types in other method */
    public void install2(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.api.TransformRequestBodyHook$install$1(handler, null));
    }
}
