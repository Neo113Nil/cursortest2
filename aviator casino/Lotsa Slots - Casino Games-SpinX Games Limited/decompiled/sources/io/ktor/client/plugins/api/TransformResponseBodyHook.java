package io.ktor.client.plugins.api;

/* compiled from: KtorCallContexts.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002j\u0012f\u0012d\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0002¢\u0006\u0002\b\u000e0\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0081\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112h\u0010\u0013\u001ad\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0002¢\u0006\u0002\b\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/client/plugins/api/TransformResponseBodyHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", com.ironsource.Ve.n, "Lio/ktor/utils/io/ByteReadChannel;", "content", "Lio/ktor/util/reflect/TypeInfo;", "requestedType", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "", "install", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function5;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformResponseBodyHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.api.TransformResponseBodyHook INSTANCE = new io.ktor.client.plugins.api.TransformResponseBodyHook();

    private TransformResponseBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public /* bridge */ /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super java.lang.Object>, ? extends java.lang.Object> function5) {
        install2(httpClient, (kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>) function5);
    }

    /* renamed from: install, reason: avoid collision after fix types in other method */
    public void install2(io.ktor.client.HttpClient client, kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        client.getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.api.TransformResponseBodyHook$install$1(handler, null));
    }
}
