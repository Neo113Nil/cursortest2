package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/commons/network/InMemoryCookieJar;", "Lcom/zettle/sdk/commons/network/NetworkClient$CookieJar;", "Lcom/izettle/android/net/CookiesStorage;", "<init>", "()V", "", "key", "", "Lcom/izettle/android/net/HttpCookie;", "get", "(Ljava/lang/String;)Ljava/util/List;", "cookies", "", "save", "(Ljava/lang/String;Ljava/util/List;)V", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InMemoryCookieJar implements com.zettle.sdk.commons.network.NetworkClient.CookieJar, com.izettle.android.net.CookiesStorage {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.util.List<com.izettle.android.net.HttpCookie>> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();

    @Override // com.izettle.android.net.CookiesStorage
    public final java.util.List<com.izettle.android.net.HttpCookie> get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.List<com.izettle.android.net.HttpCookie> list = this.getHighSpeedVideoFpsRangesFor.get(key);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    @Override // com.izettle.android.net.CookiesStorage
    public final void save(java.lang.String key, java.util.List<com.izettle.android.net.HttpCookie> cookies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookies, "");
        this.getHighSpeedVideoFpsRangesFor.put(key, cookies);
    }
}
