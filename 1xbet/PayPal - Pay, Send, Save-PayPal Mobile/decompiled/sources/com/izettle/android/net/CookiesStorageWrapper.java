package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010!\u001a*\u0012\u0004\u0012\u00020\u001b\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000f0\u001cj\u0002`\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/izettle/android/net/CookiesStorageWrapper;", "Ljava/net/CookieStore;", "Lcom/izettle/android/net/CookiesStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/izettle/android/net/CookiesStorage;)V", "Ljava/net/URI;", "uri", "Ljava/net/HttpCookie;", "cookie", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/net/URI;Ljava/net/HttpCookie;)V", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "()V", "", "get", "(Ljava/net/URI;)Ljava/util/List;", "getCookies", "()Ljava/util/List;", "getURIs", "", "remove", "(Ljava/net/URI;Ljava/net/HttpCookie;)Z", "removeAll", "()Z", "", "", "Lkotlin/Pair;", "Lcom/izettle/android/net/HttpCookie;", "Lcom/izettle/android/net/CookiesUpdate;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/izettle/android/net/CookiesStorage;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CookiesStorageWrapper implements java.net.CookieStore {
    private final com.izettle.android.net.CookiesStorage Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.izettle.android.net.HttpCookie>>> getHighSpeedVideoSizes;

    public CookiesStorageWrapper(com.izettle.android.net.CookiesStorage cookiesStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesStorage, "");
        this.Camera2StreamConfigurationMap = cookiesStorage;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    @Override // java.net.CookieStore
    public final void add(java.net.URI uri, java.net.HttpCookie cookie) {
        long currentTimeMillis;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
        java.util.Map<java.lang.String, kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.izettle.android.net.HttpCookie>>> map = this.getHighSpeedVideoSizes;
        java.lang.String host = uri.getHost();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "");
        kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.izettle.android.net.HttpCookie>> pair = map.get(host);
        if (pair == null) {
            pair = new kotlin.Pair<>(new java.util.ArrayList(), new java.util.ArrayList());
            map.put(host, pair);
        }
        kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.izettle.android.net.HttpCookie>> pair2 = pair;
        if (cookie.hasExpired()) {
            java.util.List<java.lang.String> first = pair2.getFirst();
            java.lang.String name2 = cookie.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            first.add(name2);
            return;
        }
        java.util.List<com.izettle.android.net.HttpCookie> second = pair2.getSecond();
        if (cookie.getMaxAge() <= 0) {
            currentTimeMillis = cookie.getMaxAge();
        } else {
            currentTimeMillis = java.lang.System.currentTimeMillis() + (cookie.getMaxAge() * 1000);
        }
        java.lang.String name3 = cookie.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
        java.lang.String value = cookie.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        second.add(new com.izettle.android.net.HttpCookie(name3, value, currentTimeMillis, cookie.getDomain(), cookie.getPath(), cookie.getSecure()));
    }

    @Override // java.net.CookieStore
    public final java.util.List<java.net.HttpCookie> get(java.net.URI uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        com.izettle.android.net.CookiesStorage cookiesStorage = this.Camera2StreamConfigurationMap;
        java.lang.String host = uri.getHost();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "");
        java.util.List<com.izettle.android.net.HttpCookie> list = cookiesStorage.get(host);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((com.izettle.android.net.HttpCookie) obj).hasExpired()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.izettle.android.net.HttpCookie) it.next()).toNetCookie$net());
        }
        return kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList3);
    }

    public final void commit() {
        for (java.util.Map.Entry<java.lang.String, kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.izettle.android.net.HttpCookie>>> entry : this.getHighSpeedVideoSizes.entrySet()) {
            java.lang.String key = entry.getKey();
            kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.izettle.android.net.HttpCookie>> value = entry.getValue();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.List<com.izettle.android.net.HttpCookie> list = this.Camera2StreamConfigurationMap.get(key);
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
            java.util.Iterator<T> it = value.getFirst().iterator();
            while (it.hasNext()) {
                linkedHashMap.remove((java.lang.String) it.next());
            }
            java.util.List<com.izettle.android.net.HttpCookie> second = value.getSecond();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.izettle.android.net.HttpCookie httpCookie2 : second) {
                kotlin.Pair pair = httpCookie2.hasExpired() ? null : new kotlin.Pair(httpCookie2.getName(), httpCookie2);
                if (pair != null) {
                    arrayList4.add(pair);
                }
            }
            kotlin.collections.MapsKt.toMap(arrayList4, linkedHashMap);
            this.Camera2StreamConfigurationMap.save(key, kotlin.collections.CollectionsKt.toList(linkedHashMap.values()));
        }
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        throw new java.lang.AssertionError("Current implementation should never call this method");
    }

    @Override // java.net.CookieStore
    public final java.util.List<java.net.HttpCookie> getCookies() {
        throw new java.lang.AssertionError("Current implementation should never call this method");
    }

    @Override // java.net.CookieStore
    public final java.util.List<java.net.URI> getURIs() {
        throw new java.lang.AssertionError("Current implementation should never call this method");
    }

    @Override // java.net.CookieStore
    public final boolean remove(java.net.URI uri, java.net.HttpCookie cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
        throw new java.lang.AssertionError("Current implementation should never call this method");
    }
}
