package io.ktor.client.plugins.cookies;

/* compiled from: HttpCookies.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00060\u0001j\u0002`\u0002:\u0002('B@\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012-\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0018\u0010\u0016J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R;\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010 ¨\u0006)"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", com.ironsource.X3.a.k, "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", com.google.firebase.remoteconfig.RemoteConfigComponent.DEFAULTS_FILE_NAME, "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Lio/ktor/http/Url;", com.ironsource.mediationsdk.utils.IronSourceConstants.REQUEST_URL, "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "captureHeaderCookies$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureHeaderCookies", "sendCookiesWith$ktor_client_core", "sendCookiesWith", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "saveCookiesFrom$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCookiesFrom", "close", "()V", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Ljava/util/List;", "Lkotlinx/coroutines/Job;", "initializer", "Lkotlinx/coroutines/Job;", "getInitializer$annotations", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCookies implements java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.cookies.HttpCookies.Companion INSTANCE = new io.ktor.client.plugins.cookies.HttpCookies.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.cookies.HttpCookies> key;
    private final java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.plugins.cookies.CookiesStorage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> defaults;
    private final kotlinx.coroutines.Job initializer;
    private final io.ktor.client.plugins.cookies.CookiesStorage storage;

    private static /* synthetic */ void getInitializer$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(io.ktor.client.plugins.cookies.CookiesStorage storage, java.util.List<? extends kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.cookies.CookiesStorage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> defaults) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaults, "defaults");
        this.storage = storage;
        this.defaults = defaults;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getUnconfined(), null, new io.ktor.client.plugins.cookies.HttpCookies$initializer$1(this, null), 2, null);
        this.initializer = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[PHI: r7
      0x005b: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0058, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$get$1 httpCookies$get$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$get$1) {
            httpCookies$get$1 = (io.ktor.client.plugins.cookies.HttpCookies$get$1) continuation;
            if ((httpCookies$get$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$get$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCookies$get$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$get$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.initializer;
                    httpCookies$get$1.L$0 = url;
                    httpCookies$get$1.label = 1;
                    if (job.join(httpCookies$get$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (io.ktor.http.Url) httpCookies$get$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.storage;
                httpCookies$get$1.L$0 = null;
                httpCookies$get$1.label = 2;
                obj = cookiesStorage.get(url, httpCookies$get$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        httpCookies$get$1 = new io.ktor.client.plugins.cookies.HttpCookies$get$1(this, continuation);
        java.lang.Object obj2 = httpCookies$get$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$get$1.label;
        if (i != 0) {
        }
        io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage2 = this.storage;
        httpCookies$get$1.L$0 = null;
        httpCookies$get$1.label = 2;
        obj2 = cookiesStorage2.get(url, httpCookies$get$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1 httpCookies$captureHeaderCookies$1;
        int i;
        java.util.Iterator it;
        io.ktor.http.Url url;
        org.slf4j.Logger logger;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) {
            httpCookies$captureHeaderCookies$1 = (io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) continuation;
            if ((httpCookies$captureHeaderCookies$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$captureHeaderCookies$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCookies$captureHeaderCookies$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$captureHeaderCookies$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url build = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    java.lang.String str = httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
                    java.util.ArrayList arrayList = null;
                    if (str != null) {
                        logger = io.ktor.client.plugins.cookies.HttpCookiesKt.LOGGER;
                        logger.trace("Saving cookie " + str + " for " + httpRequestBuilder.getUrl());
                        java.util.Map parseClientCookiesHeader$default = io.ktor.http.CookieKt.parseClientCookiesHeader$default(str, false, 2, null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(parseClientCookiesHeader$default.size());
                        for (java.util.Map.Entry entry : parseClientCookiesHeader$default.entrySet()) {
                            arrayList2.add(new io.ktor.http.Cookie((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), io.ktor.http.CookieEncoding.RAW, (java.lang.Integer) null, (io.ktor.util.date.GMTDate) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.util.Map) null, 1016, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        url = build;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) httpCookies$captureHeaderCookies$1.L$1;
                url = (io.ktor.http.Url) httpCookies$captureHeaderCookies$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
                    io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.storage;
                    httpCookies$captureHeaderCookies$1.L$0 = url;
                    httpCookies$captureHeaderCookies$1.L$1 = it;
                    httpCookies$captureHeaderCookies$1.label = 1;
                    if (cookiesStorage.addCookie(url, cookie, httpCookies$captureHeaderCookies$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCookies$captureHeaderCookies$1 = new io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1(this, continuation);
        java.lang.Object obj2 = httpCookies$captureHeaderCookies$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$captureHeaderCookies$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 httpCookies$sendCookiesWith$1;
        int i;
        java.util.List list;
        java.lang.String renderClientCookies;
        org.slf4j.Logger logger;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) {
            httpCookies$sendCookiesWith$1 = (io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) continuation;
            if ((httpCookies$sendCookiesWith$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$sendCookiesWith$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCookies$sendCookiesWith$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$sendCookiesWith$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url build = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    httpCookies$sendCookiesWith$1.L$0 = httpRequestBuilder;
                    httpCookies$sendCookiesWith$1.label = 1;
                    obj = get(build, httpCookies$sendCookiesWith$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) httpCookies$sendCookiesWith$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list = (java.util.List) obj;
                if (!(!list.isEmpty())) {
                    renderClientCookies = io.ktor.client.plugins.cookies.HttpCookiesKt.renderClientCookies(list);
                    httpRequestBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), renderClientCookies);
                    logger = io.ktor.client.plugins.cookies.HttpCookiesKt.LOGGER;
                    logger.trace("Sending cookie " + renderClientCookies + " for " + httpRequestBuilder.getUrl());
                } else {
                    httpRequestBuilder.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCookies$sendCookiesWith$1 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1(this, continuation);
        java.lang.Object obj2 = httpCookies$sendCookiesWith$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$sendCookiesWith$1.label;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (!(!list.isEmpty())) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 httpCookies$saveCookiesFrom$1;
        int i;
        java.util.Iterator it;
        io.ktor.http.Url url;
        org.slf4j.Logger logger;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) {
            httpCookies$saveCookiesFrom$1 = (io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) continuation;
            if ((httpCookies$saveCookiesFrom$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$saveCookiesFrom$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCookies$saveCookiesFrom$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$saveCookiesFrom$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url url2 = io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl();
                    java.util.List<java.lang.String> all = httpResponse.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
                    if (all != null) {
                        for (java.lang.String str : all) {
                            logger = io.ktor.client.plugins.cookies.HttpCookiesKt.LOGGER;
                            logger.trace("Received cookie " + str + " in response for " + httpResponse.getCall().getRequest().getUrl());
                        }
                    }
                    it = io.ktor.http.HttpMessagePropertiesKt.setCookie(httpResponse).iterator();
                    url = url2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) httpCookies$saveCookiesFrom$1.L$1;
                    url = (io.ktor.http.Url) httpCookies$saveCookiesFrom$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
                    io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.storage;
                    httpCookies$saveCookiesFrom$1.L$0 = url;
                    httpCookies$saveCookiesFrom$1.L$1 = it;
                    httpCookies$saveCookiesFrom$1.label = 1;
                    if (cookiesStorage.addCookie(url, cookie, httpCookies$saveCookiesFrom$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCookies$saveCookiesFrom$1 = new io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1(this, continuation);
        java.lang.Object obj2 = httpCookies$saveCookiesFrom$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$saveCookiesFrom$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.storage.close();
    }

    /* compiled from: HttpCookies.kt */
    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR;\u0010\u0011\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", com.unity3d.ads.BuildConfig.FLAVOR, "(Lkotlin/jvm/functions/Function2;)V", "Lio/ktor/client/plugins/cookies/HttpCookies;", "build$ktor_client_core", "()Lio/ktor/client/plugins/cookies/HttpCookies;", "build", "", com.google.firebase.remoteconfig.RemoteConfigComponent.DEFAULTS_FILE_NAME, "Ljava/util/List;", com.ironsource.X3.a.k, "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private final java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.plugins.cookies.CookiesStorage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> defaults = new java.util.ArrayList();
        private io.ktor.client.plugins.cookies.CookiesStorage storage = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage(null, 1, null);

        public final io.ktor.client.plugins.cookies.CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "<set-?>");
            this.storage = cookiesStorage;
        }

        /* renamed from: default, reason: not valid java name */
        public final void m10612default(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.cookies.CookiesStorage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            this.defaults.add(block);
        }

        public final io.ktor.client.plugins.cookies.HttpCookies build$ktor_client_core() {
            return new io.ktor.client.plugins.cookies.HttpCookies(this.storage, this.defaults);
        }
    }

    /* compiled from: HttpCookies.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/cookies/HttpCookies;", com.ironsource.M6.L, "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/cookies/HttpCookies;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.cookies.HttpCookies.Config, io.ktor.client.plugins.cookies.HttpCookies> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.client.plugins.cookies.HttpCookies prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.cookies.HttpCookies.Config, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            io.ktor.client.plugins.cookies.HttpCookies.Config config = new io.ktor.client.plugins.cookies.HttpCookies.Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.util.AttributeKey<io.ktor.client.plugins.cookies.HttpCookies> getKey() {
            return io.ktor.client.plugins.cookies.HttpCookies.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(io.ktor.client.plugins.cookies.HttpCookies plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "plugin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3(plugin, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.cookies.HttpCookies.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.cookies.HttpCookies.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("HttpCookies", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }
}
