package com.paypal.oslo.feature.inappcheckout.ui.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/util/URLUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "", "openUrl", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class URLUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.util.URLUtils INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.util.URLUtils();

    private URLUtils() {
    }

    public final void openUrl(android.content.Context context, java.lang.String url) {
        android.content.pm.ActivityInfo activityInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String str = null;
        if (!kotlin.text.StringsKt.startsWith$default(url, "http://", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(url, "https://", false, 2, (java.lang.Object) null)) {
            url = "https://".concat(java.lang.String.valueOf(url));
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
        android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://")), 65536);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
            str = activityInfo.packageName;
        }
        if (str != null) {
            intent.putExtra("com.android.browser.application_id", str);
            intent.setPackage(str);
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
