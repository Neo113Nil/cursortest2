package com.izettle.android.auth.okhttp;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014"}, d2 = {"Lcom/izettle/android/auth/okhttp/CookiesJarWrapper;", "Lokhttp3/CookieJar;", "Lcom/izettle/android/net/CookiesStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/izettle/android/net/CookiesStorage;)V", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "", "cookies", "", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "Lcom/izettle/android/net/HttpCookie;", "toHttpCookie", "(Lokhttp3/Cookie;)Lcom/izettle/android/net/HttpCookie;", "Lcom/izettle/android/net/CookiesStorage;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CookiesJarWrapper implements okhttp3.CookieJar {
    private final com.izettle.android.net.CookiesStorage storage;

    public CookiesJarWrapper(com.izettle.android.net.CookiesStorage cookiesStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "");
        this.storage = cookiesStorage;
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(okhttp3.HttpUrl url, java.util.List<okhttp3.Cookie> cookies) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookies, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<com.izettle.android.net.HttpCookie> list = this.storage.get(url.host());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((com.izettle.android.net.HttpCookie) obj).hasExpired()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<com.izettle.android.net.HttpCookie> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (com.izettle.android.net.HttpCookie httpCookie : arrayList2) {
            arrayList3.add(new kotlin.Pair(httpCookie.getName(), httpCookie));
        }
        kotlin.collections.MapsKt.toMap(arrayList3, linkedHashMap);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (okhttp3.Cookie cookie : cookies) {
            if (cookie.expiresAt() < java.lang.System.currentTimeMillis()) {
                linkedHashMap.remove(cookie.name());
                pair = null;
            } else {
                pair = new kotlin.Pair(cookie.name(), toHttpCookie(cookie));
            }
            if (pair != null) {
                arrayList4.add(pair);
            }
        }
        kotlin.collections.MapsKt.toMap(arrayList4, linkedHashMap);
        this.storage.save(url.host(), kotlin.collections.CollectionsKt.toList(linkedHashMap.values()));
    }

    @Override // okhttp3.CookieJar
    public final java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.util.List<com.izettle.android.net.HttpCookie> list = this.storage.get(url.host());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((com.izettle.android.net.HttpCookie) obj).hasExpired()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<com.izettle.android.net.HttpCookie> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (com.izettle.android.net.HttpCookie httpCookie : arrayList2) {
            okhttp3.Cookie.Builder value = new okhttp3.Cookie.Builder().name(httpCookie.getName()).value(httpCookie.getValue());
            if (httpCookie.getExpiresAt() > 0) {
                value.expiresAt(httpCookie.getExpiresAt());
            }
            java.lang.String domain = httpCookie.getDomain();
            if (domain != null) {
                value.domain(domain);
            }
            java.lang.String path = httpCookie.getPath();
            if (path != null) {
                value.path(path);
            }
            if (httpCookie.getSecure()) {
                value.secure();
            }
            arrayList3.add(value.build());
        }
        return kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList3);
    }

    private final com.izettle.android.net.HttpCookie toHttpCookie(okhttp3.Cookie cookie) {
        return new com.izettle.android.net.HttpCookie(cookie.name(), cookie.value(), cookie.expiresAt(), cookie.domain(), cookie.path(), cookie.secure());
    }
}
