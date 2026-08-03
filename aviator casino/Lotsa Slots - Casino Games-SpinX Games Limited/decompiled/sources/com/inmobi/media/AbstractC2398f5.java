package com.inmobi.media;

/* renamed from: com.inmobi.media.f5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2398f5 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(android.content.Context context, androidx.browser.customtabs.CustomTabsIntent customTabsIntent, android.net.Uri uri, com.inmobi.media.C2279ai c2279ai, com.inmobi.media.C2431gb c2431gb, com.inmobi.media.InterfaceC2859wh redirectionValidator, java.lang.String api) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        java.lang.String a2 = com.inmobi.media.AbstractC2528k5.a(context);
        try {
            try {
                if (a2 == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("i5", "access$getLOG_TAG$cp(...)");
                    if (c2279ai != null) {
                        java.lang.String url = uri.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
                        c2279ai.f5106a.getLandingPageHandler().a(url, api, c2431gb);
                        return;
                    }
                    return;
                }
                customTabsIntent.intent.setFlags(268435456);
                customTabsIntent.intent.setPackage(a2);
                customTabsIntent.launchUrl(context, uri);
                if (c2431gb != null) {
                    c2431gb.f = "IN_NATIVE";
                }
                if (c2279ai != null) {
                    com.inmobi.media.K2.a(c2279ai, com.inmobi.media.Ua.f, c2431gb);
                }
            } catch (java.lang.Exception unused) {
                java.lang.String uri2 = uri.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                i = com.inmobi.media.B3.a(context, uri2, redirectionValidator, api);
                if (c2431gb != null) {
                    c2431gb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    if (c2279ai == null) {
                        com.inmobi.media.K2.a(c2279ai, com.inmobi.media.Ua.f, c2431gb);
                    }
                } else if (c2279ai != null) {
                    com.inmobi.media.Ua landingPageFunnelState = com.inmobi.media.Ua.g;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                    c2279ai.f5106a.getLandingPageHandler().a(landingPageFunnelState, c2431gb, valueOf);
                }
            }
        } catch (java.lang.Exception unused2) {
            i = 9;
            if (c2431gb != null) {
            }
            if (i != 0) {
            }
            if (c2279ai == null) {
            }
        }
    }
}
