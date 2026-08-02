package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/commons/network/InMemoryCookieJar2;", "Lokhttp3/CookieJar;", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "cookies", "", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InMemoryCookieJar2 implements okhttp3.CookieJar {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.util.List<okhttp3.Cookie>> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(okhttp3.HttpUrl url, java.util.List<okhttp3.Cookie> cookies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookies, "");
        java.util.Map<java.lang.String, java.util.List<okhttp3.Cookie>> map = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String host = url.uri().getHost();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "");
        map.put(host, cookies);
    }

    @Override // okhttp3.CookieJar
    public final java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.util.List<okhttp3.Cookie> list = this.getHighResolutionOutputSizeshNQ4ISI.get(url.uri().getHost());
        return list == null ? new java.util.ArrayList() : list;
    }
}
