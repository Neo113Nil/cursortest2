package io.ktor.client.plugins.cookies;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/cookies/ConstantCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lio/ktor/http/Cookie;", "cookies", "<init>", "([Lio/ktor/http/Cookie;)V", "Lio/ktor/http/Url;", "requestUrl", "", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cookie", "", "addCookie", "(Lio/ktor/http/Url;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConstantCookiesStorage implements io.ktor.client.plugins.cookies.CookiesStorage {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<io.ktor.http.Cookie> getHighSpeedVideoSizes;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public ConstantCookiesStorage(io.ktor.http.Cookie... cookieArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(cookieArr.length);
        for (io.ktor.http.Cookie cookie : cookieArr) {
            arrayList.add(io.ktor.client.plugins.cookies.CookiesStorageKt.fillDefaults(cookie, new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null).build()));
        }
        this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toList(arrayList);
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public final java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        java.util.List<io.ktor.http.Cookie> list = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (io.ktor.client.plugins.cookies.CookiesStorageKt.matches((io.ktor.http.Cookie) obj, url)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public final java.lang.Object addCookie(io.ktor.http.Url url, io.ktor.http.Cookie cookie, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
