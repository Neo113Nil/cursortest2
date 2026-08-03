package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0002/.B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\u001c\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache;", "", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "publicStorage", "privateStorage", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "publicStorageNew", "privateStorageNew", "", "useOldStorage", "isSharedClient", "<init>", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;ZZ)V", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "cacheResponse", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "request", "findAndRefresh", "(Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.ironsource.X3.a.k, "", "", "varyKeys", "Lio/ktor/http/Url;", "url", "findResponse", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Ljava/util/Map;Lio/ktor/http/Url;Lio/ktor/client/request/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "context", "Lio/ktor/http/content/OutgoingContent;", "content", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$ktor_client_core$annotations", "()V", "getPrivateStorage$ktor_client_core", "getPrivateStorage$ktor_client_core$annotations", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Z", "isSharedClient$ktor_client_core", "()Z", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.cache.HttpCache.Companion INSTANCE = new io.ktor.client.plugins.cache.HttpCache.Companion(0 == true ? 1 : 0);
    private static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> HttpResponseFromCache;
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.cache.HttpCache> key;
    private final boolean isSharedClient;
    private final io.ktor.client.plugins.cache.storage.HttpCacheStorage privateStorage;
    private final io.ktor.client.plugins.cache.storage.CacheStorage privateStorageNew;
    private final io.ktor.client.plugins.cache.storage.HttpCacheStorage publicStorage;
    private final io.ktor.client.plugins.cache.storage.CacheStorage publicStorageNew;
    private final boolean useOldStorage;

    public /* synthetic */ HttpCache(io.ktor.client.plugins.cache.storage.HttpCacheStorage httpCacheStorage, io.ktor.client.plugins.cache.storage.HttpCacheStorage httpCacheStorage2, io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage, io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2, boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpCacheStorage, httpCacheStorage2, cacheStorage, cacheStorage2, z, z2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This will become internal")
    public static /* synthetic */ void getPrivateStorage$ktor_client_core$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This will become internal")
    public static /* synthetic */ void getPublicStorage$ktor_client_core$annotations() {
    }

    private HttpCache(io.ktor.client.plugins.cache.storage.HttpCacheStorage httpCacheStorage, io.ktor.client.plugins.cache.storage.HttpCacheStorage httpCacheStorage2, io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage, io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2, boolean z, boolean z2) {
        this.publicStorage = httpCacheStorage;
        this.privateStorage = httpCacheStorage2;
        this.publicStorageNew = cacheStorage;
        this.privateStorageNew = cacheStorage2;
        this.useOldStorage = z;
        this.isSharedClient = z2;
    }

    /* renamed from: getPublicStorage$ktor_client_core, reason: from getter */
    public final io.ktor.client.plugins.cache.storage.HttpCacheStorage getPublicStorage() {
        return this.publicStorage;
    }

    /* renamed from: getPrivateStorage$ktor_client_core, reason: from getter */
    public final io.ktor.client.plugins.cache.storage.HttpCacheStorage getPrivateStorage() {
        return this.privateStorage;
    }

    /* renamed from: isSharedClient$ktor_client_core, reason: from getter */
    public final boolean getIsSharedClient() {
        return this.isSharedClient;
    }

    /* compiled from: HttpCache.kt */
    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\bR\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R0\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u001d\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006&"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Config;", "", "<init>", "()V", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", com.ironsource.X3.a.k, "", "publicStorage", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "privateStorage", "publicStorageNew", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "getPublicStorageNew$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/CacheStorage;", "setPublicStorageNew$ktor_client_core", "privateStorageNew", "getPrivateStorageNew$ktor_client_core", "setPrivateStorageNew$ktor_client_core", "", "useOldStorage", "Z", "getUseOldStorage$ktor_client_core", "()Z", "setUseOldStorage$ktor_client_core", "(Z)V", "isShared", "setShared", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "value", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "setPublicStorage", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;)V", "getPublicStorage$annotations", "getPrivateStorage", "setPrivateStorage", "getPrivateStorage$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private boolean isShared;
        private boolean useOldStorage;
        private io.ktor.client.plugins.cache.storage.CacheStorage publicStorageNew = io.ktor.client.plugins.cache.storage.CacheStorage.INSTANCE.getUnlimited().invoke();
        private io.ktor.client.plugins.cache.storage.CacheStorage privateStorageNew = io.ktor.client.plugins.cache.storage.CacheStorage.INSTANCE.getUnlimited().invoke();
        private io.ktor.client.plugins.cache.storage.HttpCacheStorage publicStorage = io.ktor.client.plugins.cache.storage.HttpCacheStorage.INSTANCE.getUnlimited().invoke();
        private io.ktor.client.plugins.cache.storage.HttpCacheStorage privateStorage = io.ktor.client.plugins.cache.storage.HttpCacheStorage.INSTANCE.getUnlimited().invoke();

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void getPrivateStorage$annotations() {
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void getPublicStorage$annotations() {
        }

        /* renamed from: getPublicStorageNew$ktor_client_core, reason: from getter */
        public final io.ktor.client.plugins.cache.storage.CacheStorage getPublicStorageNew() {
            return this.publicStorageNew;
        }

        public final void setPublicStorageNew$ktor_client_core(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheStorage, "<set-?>");
            this.publicStorageNew = cacheStorage;
        }

        /* renamed from: getPrivateStorageNew$ktor_client_core, reason: from getter */
        public final io.ktor.client.plugins.cache.storage.CacheStorage getPrivateStorageNew() {
            return this.privateStorageNew;
        }

        public final void setPrivateStorageNew$ktor_client_core(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheStorage, "<set-?>");
            this.privateStorageNew = cacheStorage;
        }

        /* renamed from: getUseOldStorage$ktor_client_core, reason: from getter */
        public final boolean getUseOldStorage() {
            return this.useOldStorage;
        }

        public final void setUseOldStorage$ktor_client_core(boolean z) {
            this.useOldStorage = z;
        }

        /* renamed from: isShared, reason: from getter */
        public final boolean getIsShared() {
            return this.isShared;
        }

        public final void setShared(boolean z) {
            this.isShared = z;
        }

        public final io.ktor.client.plugins.cache.storage.HttpCacheStorage getPublicStorage() {
            return this.publicStorage;
        }

        public final void setPublicStorage(io.ktor.client.plugins.cache.storage.HttpCacheStorage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.publicStorage = value;
        }

        public final io.ktor.client.plugins.cache.storage.HttpCacheStorage getPrivateStorage() {
            return this.privateStorage;
        }

        public final void setPrivateStorage(io.ktor.client.plugins.cache.storage.HttpCacheStorage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.privateStorage = value;
        }

        public final void publicStorage(io.ktor.client.plugins.cache.storage.CacheStorage storage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
            this.publicStorageNew = storage;
        }

        public final void privateStorage(io.ktor.client.plugins.cache.storage.CacheStorage storage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
            this.privateStorageNew = storage;
        }
    }

    /* compiled from: HttpCache.kt */
    @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0018\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001d\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010!\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cache/HttpCache$Config;", "Lio/ktor/client/plugins/cache/HttpCache;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/cache/HttpCache;", com.ironsource.M6.L, "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/call/HttpClientCall;", "cachedCall", "proceedWithCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithCache", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "cachedResponse", "Lkotlin/coroutines/CoroutineContext;", "callContext", "proceedWithWarning", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lio/ktor/client/HttpClient;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithMissingCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithMissingCache", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "HttpResponseFromCache", "Lio/ktor/events/EventDefinition;", "getHttpResponseFromCache", "()Lio/ktor/events/EventDefinition;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.cache.HttpCache.Config, io.ktor.client.plugins.cache.HttpCache> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.util.AttributeKey<io.ktor.client.plugins.cache.HttpCache> getKey() {
            return io.ktor.client.plugins.cache.HttpCache.key;
        }

        public final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> getHttpResponseFromCache() {
            return io.ktor.client.plugins.cache.HttpCache.HttpResponseFromCache;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.client.plugins.cache.HttpCache prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.cache.HttpCache.Config, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            io.ktor.client.plugins.cache.HttpCache.Config config = new io.ktor.client.plugins.cache.HttpCache.Config();
            block.invoke(config);
            return new io.ktor.client.plugins.cache.HttpCache(config.getPublicStorage(), config.getPrivateStorage(), config.getPublicStorageNew(), config.getPrivateStorageNew(), config.getUseOldStorage(), config.getIsShared(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(io.ktor.client.plugins.cache.HttpCache plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "plugin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
            io.ktor.util.pipeline.PipelinePhase pipelinePhase = new io.ktor.util.pipeline.PipelinePhase("Cache");
            scope.getSendPipeline().insertPhaseAfter(io.ktor.client.request.HttpSendPipeline.INSTANCE.getState(), pipelinePhase);
            scope.getSendPipeline().intercept(pipelinePhase, new io.ktor.client.plugins.cache.HttpCache$Companion$install$1(plugin, scope, null));
            io.ktor.util.pipeline.PipelinePhase pipelinePhase2 = new io.ktor.util.pipeline.PipelinePhase("Cache");
            scope.getReceivePipeline().insertPhaseAfter(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), pipelinePhase2);
            scope.getReceivePipeline().intercept(pipelinePhase2, new io.ktor.client.plugins.cache.HttpCache$Companion$install$2(plugin, scope, null));
        }

        public final java.lang.Object proceedWithCache$ktor_client_core(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.HttpClient httpClient, io.ktor.client.call.HttpClientCall httpClientCall, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            java.lang.Object proceedWith = pipelineContext.proceedWith(httpClientCall, continuation);
            return proceedWith == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object proceedWithWarning(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, io.ktor.client.HttpClient httpClient, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            io.ktor.client.request.HttpRequestData build = pipelineContext.getContext().build();
            io.ktor.http.HttpStatusCode statusCode = cachedResponseData.getStatusCode();
            io.ktor.util.date.GMTDate requestTime = cachedResponseData.getRequestTime();
            io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
            io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
            headersBuilder.appendAll(cachedResponseData.getHeaders());
            headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getWarning(), "110");
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            io.ktor.client.call.HttpClientCall httpClientCall = new io.ktor.client.call.HttpClientCall(httpClient, build, new io.ktor.client.request.HttpResponseData(statusCode, requestTime, headersBuilder.build(), cachedResponseData.getVersion(), io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(cachedResponseData.getBody(), 0, 0, 6, null), coroutineContext));
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            java.lang.Object proceedWith = pipelineContext.proceedWith(httpClientCall, continuation);
            return proceedWith == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : kotlin.Unit.INSTANCE;
        }

        public final java.lang.Object proceedWithMissingCache$ktor_client_core(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            pipelineContext.finish();
            io.ktor.client.request.HttpRequestData build = pipelineContext.getContext().build();
            java.lang.Object proceedWith = pipelineContext.proceedWith(new io.ktor.client.call.HttpClientCall(httpClient, build, new io.ktor.client.request.HttpResponseData(io.ktor.http.HttpStatusCode.INSTANCE.getGatewayTimeout(), io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null), io.ktor.http.Headers.INSTANCE.getEmpty(), io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_1_1(), io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(new byte[0], 0, 0, 6, null), build.getExecutionContext())), continuation);
            return proceedWith == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object cacheResponse(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage;
        io.ktor.client.request.HttpRequest request = httpResponse.getCall().getRequest();
        java.util.List<io.ktor.http.HeaderValue> cacheControl = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse);
        java.util.List<io.ktor.http.HeaderValue> cacheControl2 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(request);
        boolean contains = cacheControl.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getPRIVATE$ktor_client_core());
        if (contains && this.isSharedClient) {
            return null;
        }
        if (contains) {
            cacheStorage = this.privateStorageNew;
        } else {
            cacheStorage = this.publicStorageNew;
        }
        if (cacheControl.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_STORE$ktor_client_core()) || cacheControl2.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_STORE$ktor_client_core())) {
            return null;
        }
        return io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(cacheStorage, httpResponse, io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse), this.isSharedClient, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object findAndRefresh(io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1 httpCache$findAndRefresh$1;
        int i;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage;
        io.ktor.client.request.HttpRequest httpRequest2;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData2;
        io.ktor.client.request.HttpRequest httpRequest3;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1) {
            httpCache$findAndRefresh$1 = (io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1) continuation;
            if ((httpCache$findAndRefresh$1.label & Integer.MIN_VALUE) != 0) {
                httpCache$findAndRefresh$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCache$findAndRefresh$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCache$findAndRefresh$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url url = httpResponse.getCall().getRequest().getUrl();
                    boolean contains = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getPRIVATE$ktor_client_core());
                    if (contains && this.isSharedClient) {
                        return null;
                    }
                    if (contains) {
                        cacheStorage = this.privateStorageNew;
                    } else {
                        cacheStorage = this.publicStorageNew;
                    }
                    java.util.Map<java.lang.String, java.lang.String> varyKeys = io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse);
                    httpCache$findAndRefresh$1.L$0 = httpRequest;
                    httpCache$findAndRefresh$1.L$1 = httpResponse;
                    httpCache$findAndRefresh$1.L$2 = cacheStorage;
                    httpCache$findAndRefresh$1.label = 1;
                    java.lang.Object findResponse = findResponse(cacheStorage, varyKeys, url, httpRequest, httpCache$findAndRefresh$1);
                    if (findResponse == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpRequest2 = httpRequest;
                    cacheStorage2 = cacheStorage;
                    obj = findResponse;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cachedResponseData2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) httpCache$findAndRefresh$1.L$2;
                        httpResponse = (io.ktor.client.statement.HttpResponse) httpCache$findAndRefresh$1.L$1;
                        httpRequest3 = (io.ktor.client.request.HttpRequest) httpCache$findAndRefresh$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(cachedResponseData2, httpRequest3.getCall().getClient(), httpRequest3, httpResponse.getCoroutineContext());
                    }
                    cacheStorage2 = (io.ktor.client.plugins.cache.storage.CacheStorage) httpCache$findAndRefresh$1.L$2;
                    httpResponse = (io.ktor.client.statement.HttpResponse) httpCache$findAndRefresh$1.L$1;
                    httpRequest2 = (io.ktor.client.request.HttpRequest) httpCache$findAndRefresh$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
                if (cachedResponseData != null) {
                    return null;
                }
                io.ktor.http.Url url2 = httpRequest2.getUrl();
                io.ktor.client.plugins.cache.storage.CachedResponseData copy$ktor_client_core = cachedResponseData.copy$ktor_client_core(cachedResponseData.getVaryKeys(), io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(httpResponse, this.isSharedClient, null, 2, null));
                httpCache$findAndRefresh$1.L$0 = httpRequest2;
                httpCache$findAndRefresh$1.L$1 = httpResponse;
                httpCache$findAndRefresh$1.L$2 = cachedResponseData;
                httpCache$findAndRefresh$1.label = 2;
                if (cacheStorage2.store(url2, copy$ktor_client_core, httpCache$findAndRefresh$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cachedResponseData2 = cachedResponseData;
                httpRequest3 = httpRequest2;
                return io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(cachedResponseData2, httpRequest3.getCall().getClient(), httpRequest3, httpResponse.getCoroutineContext());
            }
        }
        httpCache$findAndRefresh$1 = new io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1(this, continuation);
        java.lang.Object obj2 = httpCache$findAndRefresh$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCache$findAndRefresh$1.label;
        if (i != 0) {
        }
        cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj2;
        if (cachedResponseData != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object findResponse(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage, java.util.Map<java.lang.String, java.lang.String> map, io.ktor.http.Url url, io.ktor.client.request.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.HttpCache$findResponse$1 httpCache$findResponse$1;
        int i;
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> function1;
        java.util.Iterator it;
        java.lang.Object obj;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCache$findResponse$1) {
            httpCache$findResponse$1 = (io.ktor.client.plugins.cache.HttpCache$findResponse$1) continuation;
            if ((httpCache$findResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpCache$findResponse$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj2 = httpCache$findResponse$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCache$findResponse$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (!map.isEmpty()) {
                        httpCache$findResponse$1.label = 1;
                        obj2 = cacheStorage.find(url, map, httpCache$findResponse$1);
                        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
                    }
                    kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1(httpRequest.getHeaders()), new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2(httpRequest.getHeaders()));
                    httpCache$findResponse$1.L$0 = mergedHeadersLookup;
                    httpCache$findResponse$1.label = 2;
                    obj2 = cacheStorage.findAll(url, httpCache$findResponse$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = mergedHeadersLookup;
                    it = kotlin.collections.CollectionsKt.sortedWith((java.lang.Iterable) obj2, new java.util.Comparator() { // from class: io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return kotlin.comparisons.ComparisonsKt.compareValues(((io.ktor.client.plugins.cache.storage.CachedResponseData) t2).getResponseTime(), ((io.ktor.client.plugins.cache.storage.CachedResponseData) t).getResponseTime());
                        }
                    }).iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    return (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (kotlin.jvm.functions.Function1) httpCache$findResponse$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj2);
                it = kotlin.collections.CollectionsKt.sortedWith((java.lang.Iterable) obj2, new java.util.Comparator() { // from class: io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(((io.ktor.client.plugins.cache.storage.CachedResponseData) t2).getResponseTime(), ((io.ktor.client.plugins.cache.storage.CachedResponseData) t).getResponseTime());
                    }
                }).iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        java.util.Map<java.lang.String, java.lang.String> varyKeys = ((io.ktor.client.plugins.cache.storage.CachedResponseData) obj).getVaryKeys();
                        if (!varyKeys.isEmpty()) {
                            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys.entrySet()) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(function1.invoke(entry.getKey()), entry.getValue())) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    obj = null;
                    break;
                }
                return (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
            }
        }
        httpCache$findResponse$1 = new io.ktor.client.plugins.cache.HttpCache$findResponse$1(this, continuation);
        java.lang.Object obj22 = httpCache$findResponse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCache$findResponse$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object findResponse(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.HttpCache$findResponse$4 httpCache$findResponse$4;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup;
        io.ktor.http.Url url;
        java.lang.Object findAll;
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> function1;
        java.util.Set set;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCache$findResponse$4) {
            httpCache$findResponse$4 = (io.ktor.client.plugins.cache.HttpCache$findResponse$4) continuation;
            if ((httpCache$findResponse$4.label & Integer.MIN_VALUE) != 0) {
                httpCache$findResponse$4.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCache$findResponse$4.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCache$findResponse$4.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(httpRequestBuilder.getUrl());
                    mergedHeadersLookup = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(outgoingContent, new io.ktor.client.plugins.cache.HttpCache$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new io.ktor.client.plugins.cache.HttpCache$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
                    io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.privateStorageNew;
                    httpCache$findResponse$4.L$0 = Url;
                    httpCache$findResponse$4.L$1 = mergedHeadersLookup;
                    httpCache$findResponse$4.label = 1;
                    java.lang.Object findAll2 = cacheStorage.findAll(Url, httpCache$findResponse$4);
                    if (findAll2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = findAll2;
                    url = Url;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set = (java.util.Set) httpCache$findResponse$4.L$1;
                        function1 = (kotlin.jvm.functions.Function1) httpCache$findResponse$4.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        for (io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData : kotlin.collections.SetsKt.plus(set, (java.lang.Iterable) obj)) {
                            java.util.Map<java.lang.String, java.lang.String> varyKeys = cachedResponseData.getVaryKeys();
                            if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys.entrySet()) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(function1.invoke(entry.getKey()), entry.getValue())) {
                                        break;
                                    }
                                }
                            }
                            return cachedResponseData;
                        }
                        return null;
                    }
                    mergedHeadersLookup = (kotlin.jvm.functions.Function1) httpCache$findResponse$4.L$1;
                    url = (io.ktor.http.Url) httpCache$findResponse$4.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Set set2 = (java.util.Set) obj;
                io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2 = this.publicStorageNew;
                httpCache$findResponse$4.L$0 = mergedHeadersLookup;
                httpCache$findResponse$4.L$1 = set2;
                httpCache$findResponse$4.label = 2;
                findAll = cacheStorage2.findAll(url, httpCache$findResponse$4);
                if (findAll != coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = mergedHeadersLookup;
                set = set2;
                obj = findAll;
                while (r8.hasNext()) {
                }
                return null;
            }
        }
        httpCache$findResponse$4 = new io.ktor.client.plugins.cache.HttpCache$findResponse$4(this, continuation);
        java.lang.Object obj2 = httpCache$findResponse$4.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCache$findResponse$4.label;
        if (i != 0) {
        }
        java.util.Set set22 = (java.util.Set) obj2;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage22 = this.publicStorageNew;
        httpCache$findResponse$4.L$0 = mergedHeadersLookup;
        httpCache$findResponse$4.L$1 = set22;
        httpCache$findResponse$4.label = 2;
        findAll = cacheStorage22.findAll(url, httpCache$findResponse$4);
        if (findAll != coroutine_suspended) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.cache.HttpCache.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.cache.HttpCache.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("HttpCache", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        HttpResponseFromCache = new io.ktor.events.EventDefinition<>();
    }
}
