package financial.atomic.muppet.http;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00060\u0001j\u0002`\u0002:\u0002'&B@\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012-\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR;\u0010\"\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001e\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lfinancial/atomic/muppet/http/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "defaults", "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Lio/ktor/http/Url;", "requestUrl", "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "captureHeaderCookies$core_release", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCookiesWith$core_release", "Lio/ktor/client/statement/HttpResponse;", "response", "saveCookiesFrom$core_release", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Camera2StreamConfigurationMap", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "Companion", "Config"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpCookies implements java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final financial.atomic.muppet.http.HttpCookies.Companion INSTANCE = new financial.atomic.muppet.http.HttpCookies.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<financial.atomic.muppet.http.HttpCookies> key;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.client.plugins.cookies.CookiesStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.plugins.cookies.CookiesStorage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lfinancial/atomic/muppet/http/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lfinancial/atomic/muppet/http/HttpCookies$Config;", "Lfinancial/atomic/muppet/http/HttpCookies;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lfinancial/atomic/muppet/http/HttpCookies;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lfinancial/atomic/muppet/http/HttpCookies;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<financial.atomic.muppet.http.HttpCookies.Config, financial.atomic.muppet.http.HttpCookies> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.util.AttributeKey<financial.atomic.muppet.http.HttpCookies> getKey() {
            return financial.atomic.muppet.http.HttpCookies.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(financial.atomic.muppet.http.HttpCookies plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getState(), new financial.atomic.muppet.http.a(plugin, null));
            scope.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getState(), new financial.atomic.muppet.http.b(plugin, null));
            scope.getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), new financial.atomic.muppet.http.c(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final financial.atomic.muppet.http.HttpCookies prepare(kotlin.jvm.functions.Function1<? super financial.atomic.muppet.http.HttpCookies.Config, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            financial.atomic.muppet.http.HttpCookies.Config config = new financial.atomic.muppet.http.HttpCookies.Config();
            block.invoke(config);
            return config.build$core_release();
        }
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR;\u0010\u0012\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lfinancial/atomic/muppet/http/HttpCookies$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(Lkotlin/jvm/functions/Function2;)V", "Lfinancial/atomic/muppet/http/HttpCookies;", "build$core_release", "()Lfinancial/atomic/muppet/http/HttpCookies;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.plugins.cookies.CookiesStorage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        private io.ktor.client.plugins.cookies.CookiesStorage storage = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage(null, 1, null);

        public final financial.atomic.muppet.http.HttpCookies build$core_release() {
            return new financial.atomic.muppet.http.HttpCookies(this.storage, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        /* renamed from: default, reason: not valid java name */
        public final void m23222default(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.cookies.CookiesStorage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            this.getHighResolutionOutputSizeshNQ4ISI.add(block);
        }

        public final io.ktor.client.plugins.cookies.CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "");
            this.storage = cookiesStorage;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage, java.util.List<? extends kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.cookies.CookiesStorage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = cookiesStorage;
        this.getHighSpeedVideoSizes = list;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getUnconfined(), null, new financial.atomic.muppet.c.g(this, null), 2, null);
        this.Camera2StreamConfigurationMap = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object captureHeaderCookies$core_release(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        financial.atomic.muppet.c.e eVar;
        int i;
        io.ktor.http.Url build;
        java.util.Iterator it;
        org.slf4j.Logger logger;
        if (continuation instanceof financial.atomic.muppet.c.e) {
            eVar = (financial.atomic.muppet.c.e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - 2147483648;
                java.lang.Object obj = eVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    build = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    java.lang.String str = httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
                    java.util.ArrayList arrayList = null;
                    if (str != null) {
                        logger = financial.atomic.muppet.http.HttpCookiesKt.getHighSpeedVideoFpsRanges;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Saving cookie ");
                        sb.append(str);
                        sb.append(" for ");
                        sb.append(httpRequestBuilder.getUrl());
                        logger.trace(sb.toString());
                        java.util.Map parseClientCookiesHeader$default = io.ktor.http.CookieKt.parseClientCookiesHeader$default(str, false, 2, null);
                        arrayList = new java.util.ArrayList(parseClientCookiesHeader$default.size());
                        for (java.util.Map.Entry entry : parseClientCookiesHeader$default.entrySet()) {
                            arrayList.add(new io.ktor.http.Cookie((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), (io.ktor.http.CookieEncoding) null, (java.lang.Integer) null, (io.ktor.util.date.GMTDate) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.util.Map) null, 1020, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        }
                    }
                    if (arrayList != null) {
                        it = arrayList.iterator();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = eVar.b;
                build = eVar.f6842a;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
                    io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.getHighSpeedVideoFpsRangesFor;
                    eVar.f6842a = build;
                    eVar.b = it;
                    eVar.e = 1;
                    if (cookiesStorage.addCookie(build, cookie, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        eVar = new financial.atomic.muppet.c.e(this, continuation);
        java.lang.Object obj2 = eVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.e;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRangesFor.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7.join(r0) != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        financial.atomic.muppet.c.f fVar;
        int i;
        if (continuation instanceof financial.atomic.muppet.c.f) {
            fVar = (financial.atomic.muppet.c.f) continuation;
            int i2 = fVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.d = i2 - 2147483648;
                java.lang.Object obj = fVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
                    fVar.f6843a = url;
                    fVar.d = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    url = fVar.f6843a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.getHighSpeedVideoFpsRangesFor;
                fVar.f6843a = null;
                fVar.d = 2;
                java.lang.Object obj2 = cookiesStorage.get(url, fVar);
                return obj2 != coroutine_suspended ? coroutine_suspended : obj2;
            }
        }
        fVar = new financial.atomic.muppet.c.f(this, continuation);
        java.lang.Object obj3 = fVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fVar.d;
        if (i != 0) {
        }
        io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage2 = this.getHighSpeedVideoFpsRangesFor;
        fVar.f6843a = null;
        fVar.d = 2;
        java.lang.Object obj22 = cookiesStorage2.get(url, fVar);
        if (obj22 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
    
        if (r6.addCookie(r5, r15, r0) != r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x012b -> B:11:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveCookiesFrom$core_release(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        financial.atomic.muppet.c.h hVar;
        int i;
        java.util.Iterator it;
        io.ktor.http.Url url;
        java.lang.Exception e;
        java.lang.String str;
        io.ktor.client.statement.HttpResponse httpResponse2;
        java.lang.String str2;
        final java.lang.Exception e2;
        java.lang.String message;
        java.lang.String lowerCase;
        org.slf4j.Logger logger;
        if (continuation instanceof financial.atomic.muppet.c.h) {
            hVar = (financial.atomic.muppet.c.h) continuation;
            int i2 = hVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.g = i2 - 2147483648;
                java.lang.Object obj = hVar.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hVar.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url url2 = io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl();
                    java.util.List<java.lang.String> all = httpResponse.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
                    if (all != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<T> it2 = all.iterator();
                        while (it2.hasNext()) {
                            kotlin.collections.CollectionsKt.addAll(arrayList, financial.atomic.muppet.http.HttpCookiesKt.splitSetCookieHeader((java.lang.String) it2.next()));
                        }
                        it = arrayList.iterator();
                        url = url2;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 1) {
                    str = hVar.d;
                    it = hVar.c;
                    url = hVar.b;
                    httpResponse2 = hVar.f6845a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        httpResponse = httpResponse2;
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        java.lang.Exception exc = e;
                        str2 = str;
                        httpResponse = httpResponse2;
                        e2 = exc;
                        if ((e2 instanceof java.lang.IllegalStateException) && (message = e2.getMessage()) != null) {
                            lowerCase = message.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            if (lowerCase != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "parse date", false, 2, (java.lang.Object) null)) {
                                financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
                                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.HttpCookies$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return financial.atomic.muppet.http.HttpCookies.$r8$lambda$5j94Mpmwnv51LwLTv5FRWp7yZfE(e2);
                                    }
                                };
                                io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.getHighSpeedVideoFpsRangesFor;
                                io.ktor.http.Cookie parseServerSetCookieHeader = io.ktor.http.CookieKt.parseServerSetCookieHeader(new kotlin.text.Regex("Expires\\s*=[^;]+;?", kotlin.text.RegexOption.IGNORE_CASE).replace(str2, ""));
                                hVar.f6845a = httpResponse;
                                hVar.b = url;
                                hVar.c = it;
                                hVar.d = null;
                                hVar.g = 2;
                            }
                        }
                        throw e2;
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.Iterator it3 = hVar.c;
                    io.ktor.http.Url url3 = hVar.b;
                    io.ktor.client.statement.HttpResponse httpResponse3 = hVar.f6845a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    it = it3;
                    httpResponse = httpResponse3;
                    url = url3;
                }
                while (it.hasNext()) {
                    str2 = (java.lang.String) it.next();
                    logger = financial.atomic.muppet.http.HttpCookiesKt.getHighSpeedVideoFpsRanges;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Received cookie ");
                    sb.append(str2);
                    sb.append(" in response for ");
                    sb.append(httpResponse.getCall().getRequest().getUrl());
                    logger.trace(sb.toString());
                    try {
                    } catch (java.lang.Exception e4) {
                        httpResponse2 = httpResponse;
                        str = str2;
                        e = e4;
                        java.lang.Exception exc2 = e;
                        str2 = str;
                        httpResponse = httpResponse2;
                        e2 = exc2;
                        if (e2 instanceof java.lang.IllegalStateException) {
                            lowerCase = message.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            if (lowerCase != null) {
                                financial.atomic.muppet.g.a aVar2 = financial.atomic.muppet.g.f6869a;
                                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.HttpCookies$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return financial.atomic.muppet.http.HttpCookies.$r8$lambda$5j94Mpmwnv51LwLTv5FRWp7yZfE(e2);
                                    }
                                };
                                io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage2 = this.getHighSpeedVideoFpsRangesFor;
                                io.ktor.http.Cookie parseServerSetCookieHeader2 = io.ktor.http.CookieKt.parseServerSetCookieHeader(new kotlin.text.Regex("Expires\\s*=[^;]+;?", kotlin.text.RegexOption.IGNORE_CASE).replace(str2, ""));
                                hVar.f6845a = httpResponse;
                                hVar.b = url;
                                hVar.c = it;
                                hVar.d = null;
                                hVar.g = 2;
                            }
                        }
                        throw e2;
                    }
                    io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage3 = this.getHighSpeedVideoFpsRangesFor;
                    io.ktor.http.Cookie parseServerSetCookieHeader3 = io.ktor.http.CookieKt.parseServerSetCookieHeader(str2);
                    try {
                    } catch (java.lang.Exception e5) {
                        e2 = e5;
                        if (e2 instanceof java.lang.IllegalStateException) {
                        }
                        throw e2;
                    }
                    hVar.f6845a = httpResponse;
                    hVar.b = url;
                    hVar.c = it;
                    hVar.d = str2;
                    hVar.g = 1;
                    if (cookiesStorage3.addCookie(url, parseServerSetCookieHeader3, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        hVar = new financial.atomic.muppet.c.h(this, continuation);
        java.lang.Object obj2 = hVar.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hVar.g;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendCookiesWith$core_release(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        financial.atomic.muppet.c.i iVar;
        int i;
        java.util.List list;
        java.lang.String joinToString$default;
        org.slf4j.Logger logger;
        if (continuation instanceof financial.atomic.muppet.c.i) {
            iVar = (financial.atomic.muppet.c.i) continuation;
            int i2 = iVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.d = i2 - 2147483648;
                java.lang.Object obj = iVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = iVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url build = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    iVar.f6846a = httpRequestBuilder;
                    iVar.d = 1;
                    obj = get(build, iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpRequestBuilder = iVar.f6846a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list = (java.util.List) obj;
                if (list.isEmpty()) {
                    joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, financial.atomic.muppet.c.l.f6849a, 30, null);
                    httpRequestBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), joinToString$default);
                    logger = financial.atomic.muppet.http.HttpCookiesKt.getHighSpeedVideoFpsRanges;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending cookie ");
                    sb.append(joinToString$default);
                    sb.append(" for ");
                    sb.append(httpRequestBuilder.getUrl());
                    logger.trace(sb.toString());
                } else {
                    httpRequestBuilder.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        iVar = new financial.atomic.muppet.c.i(this, continuation);
        java.lang.Object obj2 = iVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = iVar.d;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list.isEmpty()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(financial.atomic.muppet.http.HttpCookies.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(financial.atomic.muppet.http.HttpCookies.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("HttpCookies", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public static /* synthetic */ java.lang.String $r8$lambda$5j94Mpmwnv51LwLTv5FRWp7yZfE(java.lang.Exception exc) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ignoring invalid cookie date format: ");
        sb.append(exc.getMessage());
        return sb.toString();
    }
}
