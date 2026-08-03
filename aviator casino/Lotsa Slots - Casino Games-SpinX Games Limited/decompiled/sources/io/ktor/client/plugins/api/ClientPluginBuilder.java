package io.ktor.client.plugins.api;

/* compiled from: ClientPluginBuilder.kt */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ`\u0010\u0016\u001a\u00020\u00132Q\u0010\u0015\u001aM\b\u0001\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u001c\u001a\u00020\u00132<\u0010\u0015\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u001c\u0010\u001dJy\u0010#\u001a\u00020\u00132j\u0010\u0015\u001af\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0004\b#\u0010$Jw\u0010(\u001a\u00020\u00132h\u0010\u0015\u001ad\b\u0001\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110&¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b('\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0004\b(\u0010$J\u001b\u0010*\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130)¢\u0006\u0004\b*\u0010+J)\u00100\u001a\u00020\u0013\"\u0004\b\u0001\u0010,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010/\u001a\u00028\u0001¢\u0006\u0004\b0\u00101R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010:R$\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010+¨\u0006E"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "PluginConfig", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPluginInstance;", com.ironsource.X3.i.W, "Lio/ktor/client/HttpClient;", "client", "pluginConfig", "<init>", "(Lio/ktor/util/AttributeKey;Lio/ktor/client/HttpClient;Ljava/lang/Object;)V", "Lkotlin/Function4;", "Lio/ktor/client/plugins/api/OnRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ParameterName;", "name", "request", "content", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "onRequest", "(Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function3;", "Lio/ktor/client/plugins/api/OnResponseContext;", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "onResponse", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "Lio/ktor/util/reflect/TypeInfo;", "bodyType", "Lio/ktor/http/content/OutgoingContent;", "transformRequestBody", "(Lkotlin/jvm/functions/Function5;)V", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "Lio/ktor/utils/io/ByteReadChannel;", "requestedType", "transformResponseBody", "Lkotlin/Function0;", "onClose", "(Lkotlin/jvm/functions/Function0;)V", "HookHandler", "Lio/ktor/client/plugins/api/ClientHook;", "hook", "handler", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON, "(Lio/ktor/client/plugins/api/ClientHook;Ljava/lang/Object;)V", "Lio/ktor/util/AttributeKey;", "getKey$ktor_client_core", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "Ljava/lang/Object;", "getPluginConfig", "()Ljava/lang/Object;", "", "Lio/ktor/client/plugins/api/HookHandler;", "hooks", "Ljava/util/List;", "getHooks$ktor_client_core", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "getOnClose$ktor_client_core", "()Lkotlin/jvm/functions/Function0;", "setOnClose$ktor_client_core", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClientPluginBuilder<PluginConfig> {
    private final io.ktor.client.HttpClient client;
    private final java.util.List<io.ktor.client.plugins.api.HookHandler<?>> hooks;
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClose;
    private final PluginConfig pluginConfig;

    public ClientPluginBuilder(io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key, io.ktor.client.HttpClient client, PluginConfig pluginConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        this.key = key;
        this.client = client;
        this.pluginConfig = pluginConfig;
        this.hooks = new java.util.ArrayList();
        this.onClose = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.api.ClientPluginBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
    }

    public final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> getKey$ktor_client_core() {
        return this.key;
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final PluginConfig getPluginConfig() {
        return this.pluginConfig;
    }

    public final java.util.List<io.ktor.client.plugins.api.HookHandler<?>> getHooks$ktor_client_core() {
        return this.hooks;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClose$ktor_client_core() {
        return this.onClose;
    }

    public final void setOnClose$ktor_client_core(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClose = function0;
    }

    public final void onRequest(kotlin.jvm.functions.Function4<? super io.ktor.client.plugins.api.OnRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        on(io.ktor.client.plugins.api.RequestHook.INSTANCE, block);
    }

    public final void onResponse(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.api.OnResponseContext, ? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        on(io.ktor.client.plugins.api.ResponseHook.INSTANCE, block);
    }

    public final void transformRequestBody(kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformRequestBodyContext, ? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        on(io.ktor.client.plugins.api.TransformRequestBodyHook.INSTANCE, block);
    }

    public final void transformResponseBody(kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        on(io.ktor.client.plugins.api.TransformResponseBodyHook.INSTANCE, block);
    }

    public final void onClose(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.onClose = block;
    }

    public final <HookHandler> void on(io.ktor.client.plugins.api.ClientHook<HookHandler> hook, HookHandler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hook, "hook");
        this.hooks.add(new io.ktor.client.plugins.api.HookHandler<>(hook, handler));
    }
}
