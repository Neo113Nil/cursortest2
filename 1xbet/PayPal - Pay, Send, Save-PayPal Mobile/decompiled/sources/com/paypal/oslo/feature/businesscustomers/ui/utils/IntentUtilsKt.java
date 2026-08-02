package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0006"}, d2 = {"", "phone", "Landroid/content/Context;", "context", "", "launchDial", "(Ljava/lang/String;Landroid/content/Context;)V", "email", "launchSendEmail", "launchSendSms"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntentUtilsKt {
    public static final void launchDial(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("tel:");
            sb.append(str);
            intent.setData(android.net.Uri.parse(sb.toString()));
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Failed to launchDial", e);
        }
    }

    public static final void launchSendEmail(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
            intent.setData(android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME));
            intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{str});
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Failed to launchSendEmail", e);
        }
    }

    public static final void launchSendSms(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.fromParts("sms", str, null)));
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Failed to launchSendSms", e);
        }
    }
}
