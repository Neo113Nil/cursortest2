package io.ktor.client.plugins.cache;

import com.ironsource.L6;
import com.ironsource.Te;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.cache.storage.CacheStorage;
import io.ktor.client.plugins.cache.storage.CachedResponseData;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.plugins.cache.storage.HttpCacheStorageKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.KtorDsl;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: HttpCache.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0002/.B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\u001c\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache;", "", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "publicStorage", "privateStorage", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "publicStorageNew", "privateStorageNew", "", "useOldStorage", "isSharedClient", "<init>", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;ZZ)V", "Lio/ktor/client/statement/HttpResponse;", Te.n, "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "cacheResponse", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "request", "findAndRefresh", "(Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", U3.a.k, "", "", "varyKeys", "Lio/ktor/http/Url;", "url", "findResponse", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Ljava/util/Map;Lio/ktor/http/Url;Lio/ktor/client/request/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "context", "Lio/ktor/http/content/OutgoingContent;", "content", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$ktor_client_core$annotations", "()V", "getPrivateStorage$ktor_client_core", "getPrivateStorage$ktor_client_core$annotations", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Z", "isSharedClient$ktor_client_core", "()Z", k.M, "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final EventDefinition<HttpResponse> HttpResponseFromCache;
    private static final AttributeKey<HttpCache> key;
    private final boolean isSharedClient;
    private final HttpCacheStorage privateStorage;
    private final CacheStorage privateStorageNew;
    private final HttpCacheStorage publicStorage;
    private final CacheStorage publicStorageNew;
    private final boolean useOldStorage;

    public /* synthetic */ HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpCacheStorage, httpCacheStorage2, cacheStorage, cacheStorage2, z, z2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This will become internal")
    public static /* synthetic */ void getPrivateStorage$ktor_client_core$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This will become internal")
    public static /* synthetic */ void getPublicStorage$ktor_client_core$annotations() {
    }

    private HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z, boolean z2) {
        this.publicStorage = httpCacheStorage;
        this.privateStorage = httpCacheStorage2;
        this.publicStorageNew = cacheStorage;
        this.privateStorageNew = cacheStorage2;
        this.useOldStorage = z;
        this.isSharedClient = z2;
    }

    /* renamed from: getPublicStorage$ktor_client_core, reason: from getter */
    public final HttpCacheStorage getPublicStorage() {
        return this.publicStorage;
    }

    /* renamed from: getPrivateStorage$ktor_client_core, reason: from getter */
    public final HttpCacheStorage getPrivateStorage() {
        return this.privateStorage;
    }

    /* renamed from: isSharedClient$ktor_client_core, reason: from getter */
    public final boolean getIsSharedClient() {
        return this.isSharedClient;
    }

    /* compiled from: HttpCache.kt */
    @KtorDsl
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\bR\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R0\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u001d\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006&"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Config;", "", "<init>", "()V", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", U3.a.k, "", "publicStorage", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "privateStorage", "publicStorageNew", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "getPublicStorageNew$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/CacheStorage;", "setPublicStorageNew$ktor_client_core", "privateStorageNew", "getPrivateStorageNew$ktor_client_core", "setPrivateStorageNew$ktor_client_core", "", "useOldStorage", "Z", "getUseOldStorage$ktor_client_core", "()Z", "setUseOldStorage$ktor_client_core", "(Z)V", "isShared", "setShared", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "value", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "setPublicStorage", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;)V", "getPublicStorage$annotations", "getPrivateStorage", "setPrivateStorage", "getPrivateStorage$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private boolean isShared;
        private boolean useOldStorage;
        private CacheStorage publicStorageNew = CacheStorage.INSTANCE.getUnlimited().invoke();
        private CacheStorage privateStorageNew = CacheStorage.INSTANCE.getUnlimited().invoke();
        private HttpCacheStorage publicStorage = HttpCacheStorage.INSTANCE.getUnlimited().invoke();
        private HttpCacheStorage privateStorage = HttpCacheStorage.INSTANCE.getUnlimited().invoke();

        @Deprecated(level = DeprecationLevel.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void getPrivateStorage$annotations() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void getPublicStorage$annotations() {
        }

        /* renamed from: getPublicStorageNew$ktor_client_core, reason: from getter */
        public final CacheStorage getPublicStorageNew() {
            return this.publicStorageNew;
        }

        public final void setPublicStorageNew$ktor_client_core(CacheStorage cacheStorage) {
            Intrinsics.checkNotNullParameter(cacheStorage, "<set-?>");
            this.publicStorageNew = cacheStorage;
        }

        /* renamed from: getPrivateStorageNew$ktor_client_core, reason: from getter */
        public final CacheStorage getPrivateStorageNew() {
            return this.privateStorageNew;
        }

        public final void setPrivateStorageNew$ktor_client_core(CacheStorage cacheStorage) {
            Intrinsics.checkNotNullParameter(cacheStorage, "<set-?>");
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

        public final HttpCacheStorage getPublicStorage() {
            return this.publicStorage;
        }

        public final void setPublicStorage(HttpCacheStorage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.publicStorage = value;
        }

        public final HttpCacheStorage getPrivateStorage() {
            return this.privateStorage;
        }

        public final void setPrivateStorage(HttpCacheStorage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.privateStorage = value;
        }

        public final void publicStorage(CacheStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.publicStorageNew = storage;
        }

        public final void privateStorage(CacheStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.privateStorageNew = storage;
        }
    }

    /* compiled from: HttpCache.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0018\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001d\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010!\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cache/HttpCache$Config;", "Lio/ktor/client/plugins/cache/HttpCache;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/cache/HttpCache;", L6.L, "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/call/HttpClientCall;", "cachedCall", "proceedWithCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithCache", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "cachedResponse", "Lkotlin/coroutines/CoroutineContext;", "callContext", "proceedWithWarning", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lio/ktor/client/HttpClient;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithMissingCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithMissingCache", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "HttpResponseFromCache", "Lio/ktor/events/EventDefinition;", "getHttpResponseFromCache", "()Lio/ktor/events/EventDefinition;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCache> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCache> getKey() {
            return HttpCache.key;
        }

        public final EventDefinition<HttpResponse> getHttpResponseFromCache() {
            return HttpCache.HttpResponseFromCache;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCache prepare(Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpCache(config.getPublicStorage(), config.getPrivateStorage(), config.getPublicStorageNew(), config.getPrivateStorageNew(), config.getUseOldStorage(), config.getIsShared(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCache plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            PipelinePhase pipelinePhase = new PipelinePhase("Cache");
            scope.getSendPipeline().insertPhaseAfter(HttpSendPipeline.INSTANCE.getState(), pipelinePhase);
            scope.getSendPipeline().intercept(pipelinePhase, new HttpCache$Companion$install$1(plugin, scope, null));
            PipelinePhase pipelinePhase2 = new PipelinePhase("Cache");
            scope.getReceivePipeline().insertPhaseAfter(HttpReceivePipeline.INSTANCE.getState(), pipelinePhase2);
            scope.getReceivePipeline().intercept(pipelinePhase2, new HttpCache$Companion$install$2(plugin, scope, null));
        }

        public final Object proceedWithCache$ktor_client_core(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClient httpClient, HttpClientCall httpClientCall, Continuation<? super Unit> continuation) {
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object proceedWith = pipelineContext.proceedWith(httpClientCall, continuation);
            return proceedWith == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, CachedResponseData cachedResponseData, HttpClient httpClient, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
            HttpRequestData build = pipelineContext.getContext().build();
            HttpStatusCode statusCode = cachedResponseData.getStatusCode();
            GMTDate requestTime = cachedResponseData.getRequestTime();
            Headers.Companion companion = Headers.INSTANCE;
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            headersBuilder.appendAll(cachedResponseData.getHeaders());
            headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
            Unit unit = Unit.INSTANCE;
            HttpClientCall httpClientCall = new HttpClientCall(httpClient, build, new HttpResponseData(statusCode, requestTime, headersBuilder.build(), cachedResponseData.getVersion(), ByteChannelCtorKt.ByteReadChannel$default(cachedResponseData.getBody(), 0, 0, 6, null), coroutineContext));
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object proceedWith = pipelineContext.proceedWith(httpClientCall, continuation);
            return proceedWith == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : Unit.INSTANCE;
        }

        public final Object proceedWithMissingCache$ktor_client_core(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClient httpClient, Continuation<? super Unit> continuation) {
            pipelineContext.finish();
            HttpRequestData build = pipelineContext.getContext().build();
            Object proceedWith = pipelineContext.proceedWith(new HttpClientCall(httpClient, build, new HttpResponseData(HttpStatusCode.INSTANCE.getGatewayTimeout(), DateJvmKt.GMTDate$default(null, 1, null), Headers.INSTANCE.getEmpty(), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), ByteChannelCtorKt.ByteReadChannel$default(new byte[0], 0, 0, 6, null), build.getExecutionContext())), continuation);
            return proceedWith == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cacheResponse(HttpResponse httpResponse, Continuation<? super CachedResponseData> continuation) {
        CacheStorage cacheStorage;
        HttpRequest request = httpResponse.getCall().getRequest();
        List<HeaderValue> cacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
        List<HeaderValue> cacheControl2 = HttpMessagePropertiesKt.cacheControl(request);
        boolean contains = cacheControl.contains(CacheControl.INSTANCE.getPRIVATE$ktor_client_core());
        if (contains && this.isSharedClient) {
            return null;
        }
        if (contains) {
            cacheStorage = this.privateStorageNew;
        } else {
            cacheStorage = this.publicStorageNew;
        }
        if (cacheControl.contains(CacheControl.INSTANCE.getNO_STORE$ktor_client_core()) || cacheControl2.contains(CacheControl.INSTANCE.getNO_STORE$ktor_client_core())) {
            return null;
        }
        return HttpCacheStorageKt.store(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), this.isSharedClient, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findAndRefresh(HttpRequest httpRequest, HttpResponse httpResponse, Continuation<? super HttpResponse> continuation) {
        HttpCache$findAndRefresh$1 httpCache$findAndRefresh$1;
        int i;
        CacheStorage cacheStorage;
        HttpRequest httpRequest2;
        CacheStorage cacheStorage2;
        CachedResponseData cachedResponseData;
        CachedResponseData cachedResponseData2;
        HttpRequest httpRequest3;
        if (continuation instanceof HttpCache$findAndRefresh$1) {
            httpCache$findAndRefresh$1 = (HttpCache$findAndRefresh$1) continuation;
            if ((httpCache$findAndRefresh$1.label & Integer.MIN_VALUE) != 0) {
                httpCache$findAndRefresh$1.label -= Integer.MIN_VALUE;
                Object obj = httpCache$findAndRefresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCache$findAndRefresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Url url = httpResponse.getCall().getRequest().getUrl();
                    boolean contains = HttpMessagePropertiesKt.cacheControl(httpResponse).contains(CacheControl.INSTANCE.getPRIVATE$ktor_client_core());
                    if (contains && this.isSharedClient) {
                        return null;
                    }
                    if (contains) {
                        cacheStorage = this.privateStorageNew;
                    } else {
                        cacheStorage = this.publicStorageNew;
                    }
                    Map<String, String> varyKeys = HttpCacheEntryKt.varyKeys(httpResponse);
                    httpCache$findAndRefresh$1.L$0 = httpRequest;
                    httpCache$findAndRefresh$1.L$1 = httpResponse;
                    httpCache$findAndRefresh$1.L$2 = cacheStorage;
                    httpCache$findAndRefresh$1.label = 1;
                    Object findResponse = findResponse(cacheStorage, varyKeys, url, httpRequest, httpCache$findAndRefresh$1);
                    if (findResponse == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpRequest2 = httpRequest;
                    cacheStorage2 = cacheStorage;
                    obj = findResponse;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cachedResponseData2 = (CachedResponseData) httpCache$findAndRefresh$1.L$2;
                        httpResponse = (HttpResponse) httpCache$findAndRefresh$1.L$1;
                        httpRequest3 = (HttpRequest) httpCache$findAndRefresh$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return HttpCacheStorageKt.createResponse(cachedResponseData2, httpRequest3.getCall().getClient(), httpRequest3, httpResponse.getCoroutineContext());
                    }
                    cacheStorage2 = (CacheStorage) httpCache$findAndRefresh$1.L$2;
                    httpResponse = (HttpResponse) httpCache$findAndRefresh$1.L$1;
                    httpRequest2 = (HttpRequest) httpCache$findAndRefresh$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                cachedResponseData = (CachedResponseData) obj;
                if (cachedResponseData != null) {
                    return null;
                }
                Url url2 = httpRequest2.getUrl();
                CachedResponseData copy$ktor_client_core = cachedResponseData.copy$ktor_client_core(cachedResponseData.getVaryKeys(), HttpCacheEntryKt.cacheExpires$default(httpResponse, this.isSharedClient, null, 2, null));
                httpCache$findAndRefresh$1.L$0 = httpRequest2;
                httpCache$findAndRefresh$1.L$1 = httpResponse;
                httpCache$findAndRefresh$1.L$2 = cachedResponseData;
                httpCache$findAndRefresh$1.label = 2;
                if (cacheStorage2.store(url2, copy$ktor_client_core, httpCache$findAndRefresh$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cachedResponseData2 = cachedResponseData;
                httpRequest3 = httpRequest2;
                return HttpCacheStorageKt.createResponse(cachedResponseData2, httpRequest3.getCall().getClient(), httpRequest3, httpResponse.getCoroutineContext());
            }
        }
        httpCache$findAndRefresh$1 = new HttpCache$findAndRefresh$1(this, continuation);
        Object obj2 = httpCache$findAndRefresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCache$findAndRefresh$1.label;
        if (i != 0) {
        }
        cachedResponseData = (CachedResponseData) obj2;
        if (cachedResponseData != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findResponse(CacheStorage cacheStorage, Map<String, String> map, Url url, HttpRequest httpRequest, Continuation<? super CachedResponseData> continuation) {
        HttpCache$findResponse$1 httpCache$findResponse$1;
        int i;
        Function1<String, String> function1;
        Iterator it;
        Object obj;
        if (continuation instanceof HttpCache$findResponse$1) {
            httpCache$findResponse$1 = (HttpCache$findResponse$1) continuation;
            if ((httpCache$findResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpCache$findResponse$1.label -= Integer.MIN_VALUE;
                Object obj2 = httpCache$findResponse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCache$findResponse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!map.isEmpty()) {
                        httpCache$findResponse$1.label = 1;
                        obj2 = cacheStorage.find(url, map, httpCache$findResponse$1);
                        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
                    }
                    Function1<String, String> mergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new HttpCache$findResponse$requestHeaders$1(httpRequest.getHeaders()), new HttpCache$findResponse$requestHeaders$2(httpRequest.getHeaders()));
                    httpCache$findResponse$1.L$0 = mergedHeadersLookup;
                    httpCache$findResponse$1.label = 2;
                    obj2 = cacheStorage.findAll(url, httpCache$findResponse$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = mergedHeadersLookup;
                    it = CollectionsKt.sortedWith((Iterable) obj2, new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((CachedResponseData) t2).getResponseTime(), ((CachedResponseData) t).getResponseTime());
                        }
                    }).iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    return (CachedResponseData) obj;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj2);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) httpCache$findResponse$1.L$0;
                ResultKt.throwOnFailure(obj2);
                it = CollectionsKt.sortedWith((Iterable) obj2, new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((CachedResponseData) t2).getResponseTime(), ((CachedResponseData) t).getResponseTime());
                    }
                }).iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        Map<String, String> varyKeys = ((CachedResponseData) obj).getVaryKeys();
                        if (!varyKeys.isEmpty()) {
                            for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                                if (!Intrinsics.areEqual(function1.invoke(entry.getKey()), entry.getValue())) {
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
                return (CachedResponseData) obj;
            }
        }
        httpCache$findResponse$1 = new HttpCache$findResponse$1(this, continuation);
        Object obj22 = httpCache$findResponse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public final Object findResponse(HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent, Continuation<? super CachedResponseData> continuation) {
        HttpCache$findResponse$4 httpCache$findResponse$4;
        Object coroutine_suspended;
        int i;
        Function1<String, String> mergedHeadersLookup;
        Url url;
        Object findAll;
        Function1<String, String> function1;
        Set set;
        if (continuation instanceof HttpCache$findResponse$4) {
            httpCache$findResponse$4 = (HttpCache$findResponse$4) continuation;
            if ((httpCache$findResponse$4.label & Integer.MIN_VALUE) != 0) {
                httpCache$findResponse$4.label -= Integer.MIN_VALUE;
                Object obj = httpCache$findResponse$4.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCache$findResponse$4.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Url Url = URLUtilsKt.Url(httpRequestBuilder.getUrl());
                    mergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(outgoingContent, new HttpCache$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new HttpCache$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
                    CacheStorage cacheStorage = this.privateStorageNew;
                    httpCache$findResponse$4.L$0 = Url;
                    httpCache$findResponse$4.L$1 = mergedHeadersLookup;
                    httpCache$findResponse$4.label = 1;
                    Object findAll2 = cacheStorage.findAll(Url, httpCache$findResponse$4);
                    if (findAll2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = findAll2;
                    url = Url;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set = (Set) httpCache$findResponse$4.L$1;
                        function1 = (Function1) httpCache$findResponse$4.L$0;
                        ResultKt.throwOnFailure(obj);
                        for (CachedResponseData cachedResponseData : SetsKt.plus(set, (Iterable) obj)) {
                            Map<String, String> varyKeys = cachedResponseData.getVaryKeys();
                            if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                                    if (!Intrinsics.areEqual(function1.invoke(entry.getKey()), entry.getValue())) {
                                        break;
                                    }
                                }
                            }
                            return cachedResponseData;
                        }
                        return null;
                    }
                    mergedHeadersLookup = (Function1) httpCache$findResponse$4.L$1;
                    url = (Url) httpCache$findResponse$4.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Set set2 = (Set) obj;
                CacheStorage cacheStorage2 = this.publicStorageNew;
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
        httpCache$findResponse$4 = new HttpCache$findResponse$4(this, continuation);
        Object obj2 = httpCache$findResponse$4.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCache$findResponse$4.label;
        if (i != 0) {
        }
        Set set22 = (Set) obj2;
        CacheStorage cacheStorage22 = this.publicStorageNew;
        httpCache$findResponse$4.L$0 = mergedHeadersLookup;
        httpCache$findResponse$4.L$1 = set22;
        httpCache$findResponse$4.label = 2;
        findAll = cacheStorage22.findAll(url, httpCache$findResponse$4);
        if (findAll != coroutine_suspended) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpCache.class);
        try {
            kType = Reflection.typeOf(HttpCache.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("HttpCache", new TypeInfo(orCreateKotlinClass, kType));
        HttpResponseFromCache = new EventDefinition<>();
    }
}
