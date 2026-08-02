package io.ktor.client.plugins.cookies;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00060\u0001j\u0002`\u0002:\u0002&%B@\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012-\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR;\u0010\u001e\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "defaults", "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Lio/ktor/http/Url;", "requestUrl", "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "captureHeaderCookies$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCookiesWith$ktor_client_core", "Lio/ktor/client/statement/HttpResponse;", "response", "saveCookiesFrom$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Companion", "Config"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpCookies implements java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.cookies.HttpCookies.Companion INSTANCE = new io.ktor.client.plugins.cookies.HttpCookies.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.cookies.HttpCookies> key;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.client.plugins.cookies.CookiesStorage getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.plugins.cookies.CookiesStorage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage, java.util.List<? extends kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.cookies.CookiesStorage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = cookiesStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getUnconfined(), null, new io.ktor.client.plugins.cookies.HttpCookies$initializer$1(this, null), 2, null);
        this.getHighSpeedVideoFpsRanges = launch$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7.join(r0) != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$get$1 httpCookies$get$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$get$1) {
            httpCookies$get$1 = (io.ktor.client.plugins.cookies.HttpCookies$get$1) continuation;
            if ((httpCookies$get$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                httpCookies$get$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = httpCookies$get$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$get$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRanges;
                    httpCookies$get$1.getHighSpeedVideoFpsRangesFor = url;
                    httpCookies$get$1.getHighSpeedVideoFpsRanges = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    url = (io.ktor.http.Url) httpCookies$get$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.getHighSpeedVideoSizes;
                httpCookies$get$1.getHighSpeedVideoFpsRangesFor = null;
                httpCookies$get$1.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object obj2 = cookiesStorage.get(url, httpCookies$get$1);
                return obj2 != coroutine_suspended ? coroutine_suspended : obj2;
            }
        }
        httpCookies$get$1 = new io.ktor.client.plugins.cookies.HttpCookies$get$1(this, continuation);
        java.lang.Object obj3 = httpCookies$get$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$get$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage2 = this.getHighSpeedVideoSizes;
        httpCookies$get$1.getHighSpeedVideoFpsRangesFor = null;
        httpCookies$get$1.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object obj22 = cookiesStorage2.get(url, httpCookies$get$1);
        if (obj22 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1 httpCookies$captureHeaderCookies$1;
        int i;
        io.ktor.http.Url build;
        java.util.Iterator it;
        org.slf4j.Logger logger;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) {
            httpCookies$captureHeaderCookies$1 = (io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) continuation;
            if ((httpCookies$captureHeaderCookies$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                httpCookies$captureHeaderCookies$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = httpCookies$captureHeaderCookies$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$captureHeaderCookies$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    build = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    java.lang.String str = httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
                    java.util.ArrayList arrayList = null;
                    if (str != null) {
                        logger = io.ktor.client.plugins.cookies.HttpCookiesKt.Camera2StreamConfigurationMap;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Saving cookie ");
                        sb.append(str);
                        sb.append(" for ");
                        sb.append(httpRequestBuilder.getUrl());
                        logger.trace(sb.toString());
                        java.util.Map parseClientCookiesHeader$default = io.ktor.http.CookieKt.parseClientCookiesHeader$default(str, false, 2, null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(parseClientCookiesHeader$default.size());
                        for (java.util.Map.Entry entry : parseClientCookiesHeader$default.entrySet()) {
                            arrayList2.add(new io.ktor.http.Cookie((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), io.ktor.http.CookieEncoding.RAW, (java.lang.Integer) null, (io.ktor.util.date.GMTDate) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.util.Map) null, 1016, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        it = arrayList.iterator();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) httpCookies$captureHeaderCookies$1.getHighSpeedVideoSizes;
                build = (io.ktor.http.Url) httpCookies$captureHeaderCookies$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
                    io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.getHighSpeedVideoSizes;
                    httpCookies$captureHeaderCookies$1.getHighSpeedVideoFpsRanges = build;
                    httpCookies$captureHeaderCookies$1.getHighSpeedVideoSizes = it;
                    httpCookies$captureHeaderCookies$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (cookiesStorage.addCookie(build, cookie, httpCookies$captureHeaderCookies$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCookies$captureHeaderCookies$1 = new io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1(this, continuation);
        java.lang.Object obj2 = httpCookies$captureHeaderCookies$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$captureHeaderCookies$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 httpCookies$sendCookiesWith$1;
        int i;
        java.util.List list;
        java.lang.String joinToString$default;
        org.slf4j.Logger logger;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) {
            httpCookies$sendCookiesWith$1 = (io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) continuation;
            if ((httpCookies$sendCookiesWith$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                httpCookies$sendCookiesWith$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = httpCookies$sendCookiesWith$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$sendCookiesWith$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url build = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    httpCookies$sendCookiesWith$1.getHighSpeedVideoFpsRangesFor = httpRequestBuilder;
                    httpCookies$sendCookiesWith$1.getHighSpeedVideoSizes = 1;
                    obj = get(build, httpCookies$sendCookiesWith$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) httpCookies$sendCookiesWith$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list = (java.util.List) obj;
                if (!list.isEmpty()) {
                    httpRequestBuilder.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
                } else {
                    joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1.getHighSpeedVideoFpsRanges, 30, null);
                    httpRequestBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), joinToString$default);
                    logger = io.ktor.client.plugins.cookies.HttpCookiesKt.Camera2StreamConfigurationMap;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending cookie ");
                    sb.append(joinToString$default);
                    sb.append(" for ");
                    sb.append(httpRequestBuilder.getUrl());
                    logger.trace(sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCookies$sendCookiesWith$1 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1(this, continuation);
        java.lang.Object obj2 = httpCookies$sendCookiesWith$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$sendCookiesWith$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (!list.isEmpty()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 httpCookies$saveCookiesFrom$1;
        int i;
        io.ktor.http.Url url;
        java.util.Iterator it;
        org.slf4j.Logger logger;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) {
            httpCookies$saveCookiesFrom$1 = (io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) continuation;
            if ((httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    url = io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl();
                    java.util.List<java.lang.String> all = httpResponse.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
                    if (all != null) {
                        for (java.lang.String str : all) {
                            logger = io.ktor.client.plugins.cookies.HttpCookiesKt.Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Received cookie ");
                            sb.append(str);
                            sb.append(" in response for ");
                            sb.append(httpResponse.getCall().getRequest().getUrl());
                            logger.trace(sb.toString());
                        }
                    }
                    it = io.ktor.http.HttpMessagePropertiesKt.setCookie(httpResponse).iterator();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) httpCookies$saveCookiesFrom$1.getHighResolutionOutputSizeshNQ4ISI;
                    url = (io.ktor.http.Url) httpCookies$saveCookiesFrom$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
                    io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = this.getHighSpeedVideoSizes;
                    httpCookies$saveCookiesFrom$1.getHighSpeedVideoSizes = url;
                    httpCookies$saveCookiesFrom$1.getHighResolutionOutputSizeshNQ4ISI = it;
                    httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRanges = 1;
                    if (cookiesStorage.addCookie(url, cookie, httpCookies$saveCookiesFrom$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCookies$saveCookiesFrom$1 = new io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1(this, continuation);
        java.lang.Object obj2 = httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$saveCookiesFrom$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoSizes.close();
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR;\u0010\u0012\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(Lkotlin/jvm/functions/Function2;)V", "Lio/ktor/client/plugins/cookies/HttpCookies;", "build$ktor_client_core", "()Lio/ktor/client/plugins/cookies/HttpCookies;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.plugins.cookies.CookiesStorage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> Camera2StreamConfigurationMap = new java.util.ArrayList();
        private io.ktor.client.plugins.cookies.CookiesStorage storage = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage(null, 1, null);

        public final io.ktor.client.plugins.cookies.CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "");
            this.storage = cookiesStorage;
        }

        /* renamed from: default, reason: not valid java name */
        public final void m23267default(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.cookies.CookiesStorage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            this.Camera2StreamConfigurationMap.add(block);
        }

        public final io.ktor.client.plugins.cookies.HttpCookies build$ktor_client_core() {
            return new io.ktor.client.plugins.cookies.HttpCookies(this.storage, this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/cookies/HttpCookies;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lio/ktor/client/plugins/cookies/HttpCookies;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.cookies.HttpCookies.Config, io.ktor.client.plugins.cookies.HttpCookies> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.client.plugins.cookies.HttpCookies prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.cookies.HttpCookies.Config, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            io.ktor.client.plugins.cookies.HttpCookies.Config config = new io.ktor.client.plugins.cookies.HttpCookies.Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.util.AttributeKey<io.ktor.client.plugins.cookies.HttpCookies> getKey() {
            return io.ktor.client.plugins.cookies.HttpCookies.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(io.ktor.client.plugins.cookies.HttpCookies plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3(plugin, null));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
