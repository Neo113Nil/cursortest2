package io.ktor.client.plugins.cookies;

/* compiled from: HttpCookies.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0002\u0010\t\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0002\u0010\u000b\u001a$\u0010\r\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Lio/ktor/http/Cookie;", "cookies", "", "renderClientCookies", "(Ljava/util/List;)Ljava/lang/String;", "Lio/ktor/client/HttpClient;", "Lio/ktor/http/Url;", "url", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "get", "(Ljava/util/List;Ljava/lang/String;)Lio/ktor/http/Cookie;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCookiesKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCookies");

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String renderClientCookies(java.util.List<io.ktor.http.Cookie> list) {
        return kotlin.collections.CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1.INSTANCE, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1 httpCookiesKt$cookies$1;
        int i;
        java.util.List list;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1) {
            httpCookiesKt$cookies$1 = (io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1) continuation;
            if ((httpCookiesKt$cookies$1.label & Integer.MIN_VALUE) != 0) {
                httpCookiesKt$cookies$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCookiesKt$cookies$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookiesKt$cookies$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.plugins.cookies.HttpCookies httpCookies = (io.ktor.client.plugins.cookies.HttpCookies) io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(httpClient, io.ktor.client.plugins.cookies.HttpCookies.INSTANCE);
                    if (httpCookies != null) {
                        httpCookiesKt$cookies$1.label = 1;
                        obj = httpCookies.get(url, httpCookiesKt$cookies$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                list = (java.util.List) obj;
                if (list != null) {
                    return list;
                }
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }
        httpCookiesKt$cookies$1 = new io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1(continuation);
        java.lang.Object obj2 = httpCookiesKt$cookies$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookiesKt$cookies$1.label;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list != null) {
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2 httpCookiesKt$cookies$2;
        int i;
        java.util.List list;
        if (continuation instanceof io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2) {
            httpCookiesKt$cookies$2 = (io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2) continuation;
            if ((httpCookiesKt$cookies$2.label & Integer.MIN_VALUE) != 0) {
                httpCookiesKt$cookies$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCookiesKt$cookies$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookiesKt$cookies$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.plugins.cookies.HttpCookies httpCookies = (io.ktor.client.plugins.cookies.HttpCookies) io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(httpClient, io.ktor.client.plugins.cookies.HttpCookies.INSTANCE);
                    if (httpCookies != null) {
                        io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(str);
                        httpCookiesKt$cookies$2.label = 1;
                        obj = httpCookies.get(Url, httpCookiesKt$cookies$2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                list = (java.util.List) obj;
                if (list != null) {
                    return list;
                }
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }
        httpCookiesKt$cookies$2 = new io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2(continuation);
        java.lang.Object obj2 = httpCookiesKt$cookies$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookiesKt$cookies$2.label;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list != null) {
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final io.ktor.http.Cookie get(java.util.List<io.ktor.http.Cookie> list, java.lang.String name) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.http.Cookie) obj).getName(), name)) {
                break;
            }
        }
        return (io.ktor.http.Cookie) obj;
    }
}
