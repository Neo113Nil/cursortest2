package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002N\u0012J\u0012H\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u000b\u0012\t\u0018\u00010\u0007¢\u0006\u0002\b\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\n0\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJe\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2L\u0010\u000f\u001aH\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u000b\u0012\t\u0018\u00010\u0007¢\u0006\u0002\b\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/api/TransformRequestBodyHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ParameterName;", "", "Lio/ktor/util/reflect/TypeInfo;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/http/content/OutgoingContent;", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function5;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransformRequestBodyHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.TransformRequestBodyHook INSTANCE = new io.ktor.client.plugins.api.TransformRequestBodyHook();

    private TransformRequestBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* bridge */ /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function5) {
        install2(httpClient, (kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>) function5);
    }

    /* renamed from: install, reason: avoid collision after fix types in other method */
    public final void install2(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        client.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.api.TransformRequestBodyHook$install$1(handler, null));
    }
}
