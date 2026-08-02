package com.paypal.oslo.feature.checkcapture.ui.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/util/UrlUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "", "openUrl", "(Landroid/content/Context;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UrlUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.checkcapture.ui.util.UrlUtils INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.util.UrlUtils();

    private UrlUtils() {
    }

    public final boolean openUrl(android.content.Context context, java.lang.String url) {
        java.lang.String str;
        android.content.pm.ActivityInfo activityInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String str2 = null;
        if (kotlin.text.StringsKt.startsWith$default(url, "https://", false, 2, (java.lang.Object) null)) {
            str = url;
        } else {
            str = kotlin.text.StringsKt.startsWith$default(url, "http://", false, 2, (java.lang.Object) null) ? kotlin.text.StringsKt.replaceFirst$default(url, "http://", "https://", false, 4, (java.lang.Object) null) : "https://".concat(java.lang.String.valueOf(url));
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://")), 65536);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
            str2 = activityInfo.packageName;
        }
        if (str2 != null) {
            intent.putExtra("com.android.browser.application_id", str2);
            intent.setPackage(str2);
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.checkcapture.LoggerKt.log;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Opened URL in browser: ");
            sb.append(url);
            com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.checkcapture.LoggerKt.log.e("Failed to open URL - no browser available: ".concat(java.lang.String.valueOf(url)), e);
            return false;
        }
    }
}
