package com.inmobi.media;

/* renamed from: com.inmobi.media.vo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2840vo {
    public static android.webkit.WebResourceResponse a(android.webkit.WebResourceRequest request, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "<this>");
        if (!kotlin.text.StringsKt.equals("GET", request.getMethod(), true)) {
            return null;
        }
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(uri, interfaceC2772t9);
    }

    public static android.webkit.WebResourceResponse a(java.lang.String urlRaw, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        java.lang.String url;
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlRaw, "urlRaw");
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("IMResourceCacheManager", "shouldInterceptRequest " + urlRaw);
        }
        try {
            url = java.net.URLDecoder.decode(kotlin.text.StringsKt.trim((java.lang.CharSequence) urlRaw).toString(), "UTF-8");
        } catch (java.lang.Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) url, (java.lang.CharSequence) "inmobicache=true", false, 2, (java.lang.Object) null)) {
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2814uo(url, interfaceC2772t9, null), 1, null);
            return (android.webkit.WebResourceResponse) runBlocking$default;
        }
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + url);
        }
        return null;
    }
}
