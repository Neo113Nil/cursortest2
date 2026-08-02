package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002L\u0012H\u0012F\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002¢\u0006\u0002\b\n0\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJc\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2J\u0010\u000f\u001aF\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002¢\u0006\u0002\b\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/api/TransformResponseBodyHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/util/reflect/TypeInfo;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function5;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransformResponseBodyHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.TransformResponseBodyHook INSTANCE = new io.ktor.client.plugins.api.TransformResponseBodyHook();

    private TransformResponseBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* bridge */ /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object> function5) {
        install2(httpClient, (kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>) function5);
    }

    /* renamed from: install, reason: avoid collision after fix types in other method */
    public final void install2(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        client.getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.api.TransformResponseBodyHook$install$1(handler, null));
    }
}
