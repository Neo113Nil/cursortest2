package io.ktor.client.plugins.cookies;

/* compiled from: ConstantCookiesStorage.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/client/plugins/cookies/ConstantCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "", "Lio/ktor/http/Cookie;", "cookies", "<init>", "([Lio/ktor/http/Cookie;)V", "Lio/ktor/http/Url;", com.ironsource.mediationsdk.utils.IronSourceConstants.REQUEST_URL, "", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cookie", "", "addCookie", "(Lio/ktor/http/Url;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", com.ironsource.X3.a.k, "Ljava/util/List;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConstantCookiesStorage implements io.ktor.client.plugins.cookies.CookiesStorage {
    private final java.util.List<io.ktor.http.Cookie> storage;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public ConstantCookiesStorage(io.ktor.http.Cookie... cookies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookies, "cookies");
        java.util.ArrayList arrayList = new java.util.ArrayList(cookies.length);
        for (io.ktor.http.Cookie cookie : cookies) {
            arrayList.add(io.ktor.client.plugins.cookies.CookiesStorageKt.fillDefaults(cookie, new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, null).build()));
        }
        this.storage = kotlin.collections.CollectionsKt.toList(arrayList);
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        java.util.List<io.ktor.http.Cookie> list = this.storage;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (io.ktor.client.plugins.cookies.CookiesStorageKt.matches((io.ktor.http.Cookie) obj, url)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public java.lang.Object addCookie(io.ktor.http.Url url, io.ktor.http.Cookie cookie, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
