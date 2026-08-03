package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d.a b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d.a(null);
    public static final int c = 8;
    public static final java.lang.String d = "BundleExtractor";

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.text.Regex f7625a = new kotlin.text.Regex("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean a(java.lang.String bundleId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        return this.f7625a.matches(bundleId);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public java.lang.String b(java.lang.String url) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String queryParameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        try {
            android.net.Uri parse = android.net.Uri.parse(url);
            java.lang.String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            java.lang.String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "market")) {
                queryParameter = parse.getQueryParameter("id");
            } else {
                if (str2 == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "play.google.com", false, 2, (java.lang.Object) null)) {
                    return null;
                }
                queryParameter = parse.getQueryParameter("id");
            }
            return queryParameter;
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Failed to parse URL for bundle ID", e, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean c(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        if (str == null) {
            return false;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            java.lang.String scheme = parse.getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            java.lang.String host = parse.getHost();
            if (host != null) {
                str3 = host.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
            } else {
                str3 = null;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, "market")) {
                if (str3 == null) {
                    return false;
                }
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) "play.google.com", false, 2, (java.lang.Object) null)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "Xenoss", "Failed to parse URL for store validation", e, false, 8, null);
            return false;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public java.lang.String d(java.lang.String url) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String queryParameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        try {
            android.net.Uri parse = android.net.Uri.parse(url);
            java.lang.String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            java.lang.String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "market")) {
                queryParameter = parse.getQueryParameter(com.adjust.sdk.Constants.REFERRER);
            } else {
                if (str2 == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "play.google.com", false, 2, (java.lang.Object) null)) {
                    return null;
                }
                queryParameter = parse.getQueryParameter(com.adjust.sdk.Constants.REFERRER);
            }
            return queryParameter;
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Failed to parse URL for referrer", e, false, 8, null);
            return null;
        }
    }
}
