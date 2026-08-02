package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets;", "", "", "pingIntervalMillis", "maxFrameSize", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "extensionsConfig", "Lio/ktor/serialization/WebsocketContentConverter;", "contentConverter", "<init>", "(JJLio/ktor/websocket/WebSocketExtensionsConfig;Lio/ktor/serialization/WebsocketContentConverter;)V", "(JJ)V", "()V", "Lio/ktor/websocket/WebSocketSession;", "session", "Lio/ktor/websocket/DefaultWebSocketSession;", "convertSessionToDefault$ktor_client_core", "(Lio/ktor/websocket/WebSocketSession;)Lio/ktor/websocket/DefaultWebSocketSession;", "J", "getPingIntervalMillis", "()J", "getMaxFrameSize", "Camera2StreamConfigurationMap", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "getHighSpeedVideoFpsRanges", "Lio/ktor/serialization/WebsocketContentConverter;", "getContentConverter", "()Lio/ktor/serialization/WebsocketContentConverter;", "Plugin", "Config"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSockets {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.websocket.WebSockets.Companion INSTANCE = new io.ktor.client.plugins.websocket.WebSockets.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.websocket.WebSockets> key;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.websocket.WebSocketExtensionsConfig getHighSpeedVideoFpsRanges;
    private final io.ktor.serialization.WebsocketContentConverter contentConverter;
    private final long maxFrameSize;
    private final long pingIntervalMillis;

    public WebSockets(long j, long j2, io.ktor.websocket.WebSocketExtensionsConfig webSocketExtensionsConfig, io.ktor.serialization.WebsocketContentConverter websocketContentConverter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketExtensionsConfig, "");
        this.pingIntervalMillis = j;
        this.maxFrameSize = j2;
        this.getHighSpeedVideoFpsRanges = webSocketExtensionsConfig;
        this.contentConverter = websocketContentConverter;
    }

    public /* synthetic */ WebSockets(long j, long j2, io.ktor.websocket.WebSocketExtensionsConfig webSocketExtensionsConfig, io.ktor.serialization.WebsocketContentConverter websocketContentConverter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, webSocketExtensionsConfig, (i & 8) != 0 ? null : websocketContentConverter);
    }

    public final long getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final io.ktor.serialization.WebsocketContentConverter getContentConverter() {
        return this.contentConverter;
    }

    public /* synthetic */ WebSockets(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? androidx.collection.SieveCacheKt.NodeLinkMask : j2);
    }

    public WebSockets(long j, long j2) {
        this(j, j2, new io.ktor.websocket.WebSocketExtensionsConfig(), null, 8, null);
    }

    public WebSockets() {
        this(0L, androidx.collection.SieveCacheKt.NodeLinkMask, new io.ktor.websocket.WebSocketExtensionsConfig(), null, 8, null);
    }

    public final io.ktor.websocket.DefaultWebSocketSession convertSessionToDefault$ktor_client_core(io.ktor.websocket.WebSocketSession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        if (session instanceof io.ktor.websocket.DefaultWebSocketSession) {
            return (io.ktor.websocket.DefaultWebSocketSession) session;
        }
        long j = this.pingIntervalMillis;
        io.ktor.websocket.DefaultWebSocketSession DefaultWebSocketSession = io.ktor.websocket.DefaultWebSocketSessionKt.DefaultWebSocketSession(session, j, 2 * j);
        DefaultWebSocketSession.setMaxFrameSize(this.maxFrameSize);
        return DefaultWebSocketSession;
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "(Lkotlin/jvm/functions/Function1;)V", "extensionsConfig", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "getExtensionsConfig$ktor_client_core", "()Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "pingIntervalMillis", "J", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "maxFrameSize", "getMaxFrameSize", "setMaxFrameSize", "Lio/ktor/serialization/WebsocketContentConverter;", "contentConverter", "Lio/ktor/serialization/WebsocketContentConverter;", "getContentConverter", "()Lio/ktor/serialization/WebsocketContentConverter;", "setContentConverter", "(Lio/ktor/serialization/WebsocketContentConverter;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private io.ktor.serialization.WebsocketContentConverter contentConverter;
        private final io.ktor.websocket.WebSocketExtensionsConfig extensionsConfig = new io.ktor.websocket.WebSocketExtensionsConfig();
        private long maxFrameSize = androidx.collection.SieveCacheKt.NodeLinkMask;
        private long pingIntervalMillis;

        /* renamed from: getExtensionsConfig$ktor_client_core, reason: from getter */
        public final io.ktor.websocket.WebSocketExtensionsConfig getExtensionsConfig() {
            return this.extensionsConfig;
        }

        public final long getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        public final void setPingIntervalMillis(long j) {
            this.pingIntervalMillis = j;
        }

        public final long getMaxFrameSize() {
            return this.maxFrameSize;
        }

        public final void setMaxFrameSize(long j) {
            this.maxFrameSize = j;
        }

        public final io.ktor.serialization.WebsocketContentConverter getContentConverter() {
            return this.contentConverter;
        }

        public final void setContentConverter(io.ktor.serialization.WebsocketContentConverter websocketContentConverter) {
            this.contentConverter = websocketContentConverter;
        }

        public final void extensions(kotlin.jvm.functions.Function1<? super io.ktor.websocket.WebSocketExtensionsConfig, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            block.invoke(this.extensionsConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "Lio/ktor/client/plugins/websocket/WebSockets;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/websocket/WebSockets;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lio/ktor/client/plugins/websocket/WebSockets;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.websocket.WebSockets$Plugin, reason: from kotlin metadata */
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.websocket.WebSockets.Config, io.ktor.client.plugins.websocket.WebSockets> {
        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.util.AttributeKey<io.ktor.client.plugins.websocket.WebSockets> getKey() {
            return io.ktor.client.plugins.websocket.WebSockets.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.client.plugins.websocket.WebSockets prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.websocket.WebSockets.Config, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            io.ktor.client.plugins.websocket.WebSockets.Config config = new io.ktor.client.plugins.websocket.WebSockets.Config();
            block.invoke(config);
            return new io.ktor.client.plugins.websocket.WebSockets(config.getPingIntervalMillis(), config.getMaxFrameSize(), config.getExtensionsConfig(), config.getContentConverter());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(io.ktor.client.plugins.websocket.WebSockets plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            boolean contains = scope.getEngine().getSupportedCapabilities().contains(io.ktor.client.plugins.websocket.WebSocketExtensionsCapability.INSTANCE);
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getRender(), new io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1(contains, plugin, null));
            scope.getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2(plugin, contains, null));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.WebSockets.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.websocket.WebSockets.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("Websocket", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public static final /* synthetic */ java.util.List access$completeNegotiation(io.ktor.client.plugins.websocket.WebSockets webSockets, io.ktor.client.call.HttpClientCall httpClientCall) {
        java.util.List<io.ktor.websocket.WebSocketExtensionHeader> emptyList;
        io.ktor.util.AttributeKey attributeKey;
        java.lang.String str = httpClientCall.getResponse().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getSecWebSocketExtensions());
        if (str == null || (emptyList = io.ktor.websocket.WebSocketExtensionHeaderKt.parseWebSocketExtensions(str)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        io.ktor.util.Attributes attributes = httpClientCall.getAttributes();
        attributeKey = io.ktor.client.plugins.websocket.WebSocketsKt.getHighSpeedVideoSizes;
        java.util.List list = (java.util.List) attributes.get(attributeKey);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((io.ktor.websocket.WebSocketExtension) obj).clientNegotiation(emptyList)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ void access$installExtensions(io.ktor.client.plugins.websocket.WebSockets webSockets, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        io.ktor.util.AttributeKey attributeKey;
        java.util.List<io.ktor.websocket.WebSocketExtension<?>> build = webSockets.getHighSpeedVideoFpsRanges.build();
        io.ktor.util.Attributes attributes = httpRequestBuilder.getAttributes();
        attributeKey = io.ktor.client.plugins.websocket.WebSocketsKt.getHighSpeedVideoSizes;
        attributes.put(attributeKey, build);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = build.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((io.ktor.websocket.WebSocketExtension) it.next()).getProtocols());
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, io.ktor.http.HttpHeaders.INSTANCE.getSecWebSocketExtensions(), kotlin.collections.CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null));
    }
}
