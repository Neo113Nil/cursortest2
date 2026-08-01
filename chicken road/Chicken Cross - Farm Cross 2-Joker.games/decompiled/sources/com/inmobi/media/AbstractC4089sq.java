package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* renamed from: com.inmobi.media.sq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4089sq {
    public static WebResourceResponse a(WebResourceRequest request, Y9 y9) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (!StringsKt.equals("GET", request.getMethod(), true)) {
            return null;
        }
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(uri, y9);
    }

    public static WebResourceResponse a(String urlRaw, Y9 y9) {
        String url;
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(urlRaw, "urlRaw");
        if (y9 != null) {
            ((Z9) y9).c("IMResourceCacheManager", "shouldInterceptRequest " + urlRaw);
        }
        try {
            url = URLDecoder.decode(StringsKt.trim((CharSequence) urlRaw).toString(), "UTF-8");
        } catch (Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "inmobicache=true", false, 2, (Object) null)) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C4061rq(url, y9, null), 1, null);
            return (WebResourceResponse) runBlocking$default;
        }
        if (y9 != null) {
            ((Z9) y9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + url);
        }
        return null;
    }
}
