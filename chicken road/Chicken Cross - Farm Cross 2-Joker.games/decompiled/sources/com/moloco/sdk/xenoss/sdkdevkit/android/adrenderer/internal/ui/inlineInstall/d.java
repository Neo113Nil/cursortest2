package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class d implements c {
    public static final a b = new a(null);
    public static final int c = 8;
    public static final String d = "BundleExtractor";

    /* renamed from: a, reason: collision with root package name */
    public final Regex f11160a = new Regex("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean a(String bundleId) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        return this.f11160a.matches(bundleId);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public String b(String url) {
        String str;
        String str2;
        String queryParameter;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, "market")) {
                queryParameter = parse.getQueryParameter("id");
            } else {
                if (str2 == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) "play.google.com", false, 2, (Object) null)) {
                    return null;
                }
                queryParameter = parse.getQueryParameter("id");
            }
            return queryParameter;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, d, "Failed to parse URL for bundle ID", e, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean c(String str) {
        String str2;
        String str3;
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            String host = parse.getHost();
            if (host != null) {
                str3 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
            } else {
                str3 = null;
            }
            if (!Intrinsics.areEqual(str2, "market")) {
                if (str3 == null) {
                    return false;
                }
                if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) "play.google.com", false, 2, (Object) null)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "Failed to parse URL for store validation", e, false, 8, null);
            return false;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public String d(String url) {
        String str;
        String str2;
        String queryParameter;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, "market")) {
                queryParameter = parse.getQueryParameter(Constants.REFERRER);
            } else {
                if (str2 == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) "play.google.com", false, 2, (Object) null)) {
                    return null;
                }
                queryParameter = parse.getQueryParameter(Constants.REFERRER);
            }
            return queryParameter;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, d, "Failed to parse URL for referrer", e, false, 8, null);
            return null;
        }
    }
}
