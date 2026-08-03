package com.vungle.ads.internal.util;

/* compiled from: ExternalRouter.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\nJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002JE\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/util/ExternalRouter;", "", "()V", "TAG", "", "getIntentFromUrl", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "getIntentFromUrl$vungle_ads_release", "contextIsNotActivity", "", "launch", "deeplinkUrl", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "launch$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalRouter {
    public static final com.vungle.ads.internal.util.ExternalRouter INSTANCE = new com.vungle.ads.internal.util.ExternalRouter();
    private static final java.lang.String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    public final boolean launch$vungle_ads_release(java.lang.String deeplinkUrl, java.lang.String url, android.content.Context context, com.vungle.ads.internal.util.LogEntry logEntry, com.vungle.ads.internal.ui.PresenterAdOpenCallback adOpenCallback) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String str2 = deeplinkUrl;
        if ((str2 != null && str2.length() != 0) || ((str = url) != null && str.length() != 0)) {
            boolean z = !(context instanceof android.app.Activity);
            try {
                return com.vungle.ads.internal.util.ActivityManager.INSTANCE.startWhenForeground(context, getIntentFromUrl(deeplinkUrl, z), getIntentFromUrl(url, z), adOpenCallback);
            } catch (java.lang.Exception e) {
                if (str2 != null && str2.length() != 0) {
                    new com.vungle.ads.LinkError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new com.vungle.ads.LinkError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, "Fail to open " + url).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                }
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error while opening url" + e.getLocalizedMessage());
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Cannot open url " + url);
            }
        }
        return false;
    }

    public static /* synthetic */ android.content.Intent getIntentFromUrl$vungle_ads_release$default(com.vungle.ads.internal.util.ExternalRouter externalRouter, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public final android.content.Intent getIntentFromUrl$vungle_ads_release(android.content.Context context, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return getIntentFromUrl(url, !(context instanceof android.app.Activity));
    }

    static /* synthetic */ android.content.Intent getIntentFromUrl$default(com.vungle.ads.internal.util.ExternalRouter externalRouter, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        r0.setFlags(268435456);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.content.Intent getIntentFromUrl(java.lang.String url, boolean contextIsNotActivity) {
        android.content.Intent intent = null;
        try {
            java.lang.String str = url;
            if (str != null && str.length() != 0) {
                intent = android.content.Intent.parseUri(url, 0);
            }
        } catch (java.net.URISyntaxException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "url format is not correct " + e.getLocalizedMessage());
        }
        return intent;
    }
}
