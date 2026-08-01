package io.ktor.client.plugins.cookies;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ironsource.L6;
import com.ironsource.Te;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.BuildConfig;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.Cookie;
import io.ktor.http.CookieEncoding;
import io.ktor.http.CookieKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.Url;
import io.ktor.util.AttributeKey;
import io.ktor.util.date.GMTDate;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;

/* compiled from: HttpCookies.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00060\u0001j\u0002`\u0002:\u0002('B@\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012-\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0018\u0010\u0016J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R;\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010 ¨\u0006)"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", U3.a.k, "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Lio/ktor/http/Url;", IronSourceConstants.REQUEST_URL, "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "captureHeaderCookies$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureHeaderCookies", "sendCookiesWith$ktor_client_core", "sendCookiesWith", "Lio/ktor/client/statement/HttpResponse;", Te.n, "saveCookiesFrom$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCookiesFrom", "close", "()V", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Ljava/util/List;", "Lkotlinx/coroutines/Job;", "initializer", "Lkotlinx/coroutines/Job;", "getInitializer$annotations", k.M, "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpCookies implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<HttpCookies> key;
    private final List<Function2<CookiesStorage, Continuation<? super Unit>, Object>> defaults;
    private final Job initializer;
    private final CookiesStorage storage;

    private static /* synthetic */ void getInitializer$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(CookiesStorage storage, List<? extends Function2<? super CookiesStorage, ? super Continuation<? super Unit>, ? extends Object>> defaults) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        this.storage = storage;
        this.defaults = defaults;
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new HttpCookies$initializer$1(this, null), 2, null);
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
    public final Object get(Url url, Continuation<? super List<Cookie>> continuation) {
        HttpCookies$get$1 httpCookies$get$1;
        int i;
        if (continuation instanceof HttpCookies$get$1) {
            httpCookies$get$1 = (HttpCookies$get$1) continuation;
            if ((httpCookies$get$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$get$1.label -= Integer.MIN_VALUE;
                Object obj = httpCookies$get$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$get$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = this.initializer;
                    httpCookies$get$1.L$0 = url;
                    httpCookies$get$1.label = 1;
                    if (job.join(httpCookies$get$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (Url) httpCookies$get$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                CookiesStorage cookiesStorage = this.storage;
                httpCookies$get$1.L$0 = null;
                httpCookies$get$1.label = 2;
                obj = cookiesStorage.get(url, httpCookies$get$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        httpCookies$get$1 = new HttpCookies$get$1(this, continuation);
        Object obj2 = httpCookies$get$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$get$1.label;
        if (i != 0) {
        }
        CookiesStorage cookiesStorage2 = this.storage;
        httpCookies$get$1.L$0 = null;
        httpCookies$get$1.label = 2;
        obj2 = cookiesStorage2.get(url, httpCookies$get$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object captureHeaderCookies$ktor_client_core(HttpRequestBuilder httpRequestBuilder, Continuation<? super Unit> continuation) {
        HttpCookies$captureHeaderCookies$1 httpCookies$captureHeaderCookies$1;
        int i;
        Iterator it;
        Url url;
        Logger logger;
        if (continuation instanceof HttpCookies$captureHeaderCookies$1) {
            httpCookies$captureHeaderCookies$1 = (HttpCookies$captureHeaderCookies$1) continuation;
            if ((httpCookies$captureHeaderCookies$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$captureHeaderCookies$1.label -= Integer.MIN_VALUE;
                Object obj = httpCookies$captureHeaderCookies$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$captureHeaderCookies$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Url build = URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    String str = httpRequestBuilder.getHeaders().get(HttpHeaders.INSTANCE.getCookie());
                    ArrayList arrayList = null;
                    if (str != null) {
                        logger = HttpCookiesKt.LOGGER;
                        logger.trace("Saving cookie " + str + " for " + httpRequestBuilder.getUrl());
                        Map parseClientCookiesHeader$default = CookieKt.parseClientCookiesHeader$default(str, false, 2, null);
                        ArrayList arrayList2 = new ArrayList(parseClientCookiesHeader$default.size());
                        for (Map.Entry entry : parseClientCookiesHeader$default.entrySet()) {
                            arrayList2.add(new Cookie((String) entry.getKey(), (String) entry.getValue(), CookieEncoding.RAW, (Integer) null, (GMTDate) null, (String) null, (String) null, false, false, (Map) null, 1016, (DefaultConstructorMarker) null));
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        url = build;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) httpCookies$captureHeaderCookies$1.L$1;
                url = (Url) httpCookies$captureHeaderCookies$1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    Cookie cookie = (Cookie) it.next();
                    CookiesStorage cookiesStorage = this.storage;
                    httpCookies$captureHeaderCookies$1.L$0 = url;
                    httpCookies$captureHeaderCookies$1.L$1 = it;
                    httpCookies$captureHeaderCookies$1.label = 1;
                    if (cookiesStorage.addCookie(url, cookie, httpCookies$captureHeaderCookies$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        httpCookies$captureHeaderCookies$1 = new HttpCookies$captureHeaderCookies$1(this, continuation);
        Object obj2 = httpCookies$captureHeaderCookies$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$captureHeaderCookies$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendCookiesWith$ktor_client_core(HttpRequestBuilder httpRequestBuilder, Continuation<? super Unit> continuation) {
        HttpCookies$sendCookiesWith$1 httpCookies$sendCookiesWith$1;
        int i;
        List list;
        String renderClientCookies;
        Logger logger;
        if (continuation instanceof HttpCookies$sendCookiesWith$1) {
            httpCookies$sendCookiesWith$1 = (HttpCookies$sendCookiesWith$1) continuation;
            if ((httpCookies$sendCookiesWith$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$sendCookiesWith$1.label -= Integer.MIN_VALUE;
                Object obj = httpCookies$sendCookiesWith$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$sendCookiesWith$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Url build = URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
                    httpCookies$sendCookiesWith$1.L$0 = httpRequestBuilder;
                    httpCookies$sendCookiesWith$1.label = 1;
                    obj = get(build, httpCookies$sendCookiesWith$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpRequestBuilder = (HttpRequestBuilder) httpCookies$sendCookiesWith$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list.isEmpty()) {
                    renderClientCookies = HttpCookiesKt.renderClientCookies(list);
                    httpRequestBuilder.getHeaders().set(HttpHeaders.INSTANCE.getCookie(), renderClientCookies);
                    logger = HttpCookiesKt.LOGGER;
                    logger.trace("Sending cookie " + renderClientCookies + " for " + httpRequestBuilder.getUrl());
                } else {
                    httpRequestBuilder.getHeaders().remove(HttpHeaders.INSTANCE.getCookie());
                }
                return Unit.INSTANCE;
            }
        }
        httpCookies$sendCookiesWith$1 = new HttpCookies$sendCookiesWith$1(this, continuation);
        Object obj2 = httpCookies$sendCookiesWith$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$sendCookiesWith$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveCookiesFrom$ktor_client_core(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        HttpCookies$saveCookiesFrom$1 httpCookies$saveCookiesFrom$1;
        int i;
        Iterator it;
        Url url;
        Logger logger;
        if (continuation instanceof HttpCookies$saveCookiesFrom$1) {
            httpCookies$saveCookiesFrom$1 = (HttpCookies$saveCookiesFrom$1) continuation;
            if ((httpCookies$saveCookiesFrom$1.label & Integer.MIN_VALUE) != 0) {
                httpCookies$saveCookiesFrom$1.label -= Integer.MIN_VALUE;
                Object obj = httpCookies$saveCookiesFrom$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookies$saveCookiesFrom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Url url2 = HttpResponseKt.getRequest(httpResponse).getUrl();
                    List<String> all = httpResponse.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
                    if (all != null) {
                        for (String str : all) {
                            logger = HttpCookiesKt.LOGGER;
                            logger.trace("Received cookie " + str + " in response for " + httpResponse.getCall().getRequest().getUrl());
                        }
                    }
                    it = HttpMessagePropertiesKt.setCookie(httpResponse).iterator();
                    url = url2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) httpCookies$saveCookiesFrom$1.L$1;
                    url = (Url) httpCookies$saveCookiesFrom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Cookie cookie = (Cookie) it.next();
                    CookiesStorage cookiesStorage = this.storage;
                    httpCookies$saveCookiesFrom$1.L$0 = url;
                    httpCookies$saveCookiesFrom$1.L$1 = it;
                    httpCookies$saveCookiesFrom$1.label = 1;
                    if (cookiesStorage.addCookie(url, cookie, httpCookies$saveCookiesFrom$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        httpCookies$saveCookiesFrom$1 = new HttpCookies$saveCookiesFrom$1(this, continuation);
        Object obj2 = httpCookies$saveCookiesFrom$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookies$saveCookiesFrom$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.storage.close();
    }

    /* compiled from: HttpCookies.kt */
    @KtorDsl
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR;\u0010\u0011\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", BuildConfig.FLAVOR, "(Lkotlin/jvm/functions/Function2;)V", "Lio/ktor/client/plugins/cookies/HttpCookies;", "build$ktor_client_core", "()Lio/ktor/client/plugins/cookies/HttpCookies;", InAppPurchaseConstants.METHOD_BUILD, "", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Ljava/util/List;", U3.a.k, "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private final List<Function2<CookiesStorage, Continuation<? super Unit>, Object>> defaults = new ArrayList();
        private CookiesStorage storage = new AcceptAllCookiesStorage(null, 1, null);

        public final CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(CookiesStorage cookiesStorage) {
            Intrinsics.checkNotNullParameter(cookiesStorage, "<set-?>");
            this.storage = cookiesStorage;
        }

        /* renamed from: default, reason: not valid java name */
        public final void m7893default(Function2<? super CookiesStorage, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.defaults.add(block);
        }

        public final HttpCookies build$ktor_client_core() {
            return new HttpCookies(this.storage, this.defaults);
        }
    }

    /* compiled from: HttpCookies.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/cookies/HttpCookies;", L6.L, "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/cookies/HttpCookies;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCookies> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCookies prepare(Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCookies> getKey() {
            return HttpCookies.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCookies plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getState(), new HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getState(), new HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getState(), new HttpCookies$Companion$install$3(plugin, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpCookies.class);
        try {
            kType = Reflection.typeOf(HttpCookies.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("HttpCookies", new TypeInfo(orCreateKotlinClass, kType));
    }
}
