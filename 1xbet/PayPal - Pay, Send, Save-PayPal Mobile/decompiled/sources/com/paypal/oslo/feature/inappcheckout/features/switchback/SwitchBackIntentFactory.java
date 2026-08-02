package com.paypal.oslo.feature.inappcheckout.features.switchback;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackIntentFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "isDestinationTheDefaultBrowser", "Landroid/content/Intent;", "buildIntent", "(Landroid/content/Context;Landroid/net/Uri;Z)Landroid/content/Intent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwitchBackIntentFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackIntentFactory INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackIntentFactory();

    private SwitchBackIntentFactory() {
    }

    public static /* synthetic */ android.content.Intent buildIntent$default(com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackIntentFactory switchBackIntentFactory, android.content.Context context, android.net.Uri uri, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return switchBackIntentFactory.buildIntent(context, uri, z);
    }

    public final android.content.Intent buildIntent(android.content.Context context, android.net.Uri uri, boolean isDestinationTheDefaultBrowser) {
        android.content.pm.ActivityInfo activityInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://")), 65536);
        java.lang.String str = (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        if (str != null) {
            intent.putExtra("com.android.browser.application_id", str);
            if (isDestinationTheDefaultBrowser) {
                intent.setPackage(str);
            }
            intent.addFlags(268435456);
        }
        return intent;
    }
}
