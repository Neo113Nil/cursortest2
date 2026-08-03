package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3463t {
    public static final boolean b(android.content.Context context, java.lang.String str) {
        try {
            androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().setUrlBarHidingEnabled(true).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            build.intent.addFlags(268435456);
            build.launchUrl(context, android.net.Uri.parse(str));
            return true;
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e, false, 8, null);
            return false;
        }
    }
}
