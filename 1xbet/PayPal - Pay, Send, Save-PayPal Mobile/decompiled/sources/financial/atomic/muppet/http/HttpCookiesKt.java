package financial.atomic.muppet.http;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0005\u0010\t\u001a$\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/http/Url;", "url", "", "Lio/ktor/http/Cookie;", "cookies", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "get", "(Ljava/util/List;Ljava/lang/String;)Lio/ktor/http/Cookie;", "splitSetCookieHeader", "(Ljava/lang/String;)Ljava/util/List;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoFpsRanges", "Lorg/slf4j/Logger;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpCookiesKt {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRanges = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCookies");

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        financial.atomic.muppet.c.j jVar;
        int i;
        java.util.List list;
        if (continuation instanceof financial.atomic.muppet.c.j) {
            jVar = (financial.atomic.muppet.c.j) continuation;
            int i2 = jVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.b = i2 - 2147483648;
                java.lang.Object obj = jVar.f6847a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    financial.atomic.muppet.http.HttpCookies httpCookies = (financial.atomic.muppet.http.HttpCookies) io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(httpClient, financial.atomic.muppet.http.HttpCookies.INSTANCE);
                    if (httpCookies != null) {
                        jVar.b = 1;
                        obj = httpCookies.get(url, jVar);
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
        jVar = new financial.atomic.muppet.c.j(continuation);
        java.lang.Object obj2 = jVar.f6847a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jVar.b;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list != null) {
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final io.ktor.http.Cookie get(java.util.List<io.ktor.http.Cookie> list, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.http.Cookie) obj).getName(), str)) {
                break;
            }
        }
        return (io.ktor.http.Cookie) obj;
    }

    public static final java.util.List<java.lang.String> splitSetCookieHeader(java.lang.String str) {
        int i;
        int indexOf$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default2 == -1) {
            return kotlin.collections.CollectionsKt.listOf(str);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int indexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '=', indexOf$default2, false, 4, (java.lang.Object) null);
        int indexOf$default4 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ';', indexOf$default2, false, 4, (java.lang.Object) null);
        int i2 = 0;
        while (i2 < str.length() && indexOf$default2 > 0) {
            if (indexOf$default3 < indexOf$default2) {
                indexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '=', indexOf$default2, false, 4, (java.lang.Object) null);
            }
            while (true) {
                i = indexOf$default2 + 1;
                indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, i, false, 4, (java.lang.Object) null);
                if (indexOf$default < 0 || indexOf$default >= indexOf$default3) {
                    break;
                }
                indexOf$default2 = indexOf$default;
            }
            if (indexOf$default4 < indexOf$default2) {
                indexOf$default4 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ';', indexOf$default2, false, 4, (java.lang.Object) null);
            }
            if (indexOf$default3 < 0) {
                java.lang.String substring = str.substring(i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                arrayList.add(substring);
                return arrayList;
            }
            if (indexOf$default4 == -1 || indexOf$default4 > indexOf$default3) {
                java.lang.String substring2 = str.substring(i2, indexOf$default2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                arrayList.add(substring2);
                i2 = i;
            }
            indexOf$default2 = indexOf$default;
        }
        if (i2 < str.length()) {
            java.lang.String substring3 = str.substring(i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
            arrayList.add(substring3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        financial.atomic.muppet.c.k kVar;
        int i;
        java.util.List list;
        if (continuation instanceof financial.atomic.muppet.c.k) {
            kVar = (financial.atomic.muppet.c.k) continuation;
            int i2 = kVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.b = i2 - 2147483648;
                java.lang.Object obj = kVar.f6848a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    financial.atomic.muppet.http.HttpCookies httpCookies = (financial.atomic.muppet.http.HttpCookies) io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(httpClient, financial.atomic.muppet.http.HttpCookies.INSTANCE);
                    if (httpCookies != null) {
                        io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(str);
                        kVar.b = 1;
                        obj = httpCookies.get(Url, kVar);
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
        kVar = new financial.atomic.muppet.c.k(continuation);
        java.lang.Object obj2 = kVar.f6848a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kVar.b;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list != null) {
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
