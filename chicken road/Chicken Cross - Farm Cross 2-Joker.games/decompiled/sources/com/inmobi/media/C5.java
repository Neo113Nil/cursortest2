package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class C5 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, CustomTabsIntent customTabsIntent, Uri uri, C3998pj c3998pj, Yb yb, Ji redirectionValidator, String api) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        String a2 = H5.a(context);
        try {
            try {
                if (a2 == null) {
                    Intrinsics.checkNotNullExpressionValue("F5", "access$getLOG_TAG$cp(...)");
                    if (c3998pj != null) {
                        String url = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(api, "api");
                        c3998pj.f7308a.getLandingPageHandler().a(url, api, yb);
                        return;
                    }
                    return;
                }
                if (!(context instanceof Activity)) {
                    customTabsIntent.intent.setFlags(268435456);
                }
                customTabsIntent.intent.setPackage(a2);
                customTabsIntent.launchUrl(context, uri);
                if (yb != null) {
                    yb.f = "IN_NATIVE";
                }
                if (c3998pj != null) {
                    AbstractC3754h3.a(c3998pj, Mb.f, yb);
                }
            } catch (Exception unused) {
                i = 9;
                if (yb != null) {
                    yb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    if (c3998pj == null) {
                        AbstractC3754h3.a(c3998pj, Mb.f, yb);
                    }
                } else if (c3998pj != null) {
                    Mb landingPageFunnelState = Mb.g;
                    Integer valueOf = Integer.valueOf(i);
                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                    c3998pj.f7308a.getLandingPageHandler().a(landingPageFunnelState, yb, valueOf);
                }
            }
        } catch (Exception unused2) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            i = Y3.a(context, uri2, redirectionValidator, api);
            if (yb != null) {
            }
            if (i != 0) {
            }
            if (c3998pj == null) {
            }
        }
    }
}
