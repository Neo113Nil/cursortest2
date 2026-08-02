package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "phoneNumber", "Landroid/content/Context;", "context", "", "launchPhoneDialer", "(Ljava/lang/String;Landroid/content/Context;)Z", "scheme", "payload", "launchAppToAppVerification", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Z", "launchSecuritySettings", "(Landroid/content/Context;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IntentUtilsKt {
    public static final boolean launchPhoneDialer(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("tel:");
            sb.append(str);
            intent.setData(android.net.Uri.parse(sb.toString()));
            context.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to launch phone dialer: activity not found", null, null, 6, null);
            return false;
        } catch (java.lang.SecurityException unused2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to launch phone dialer: security exception", null, null, 6, null);
            return false;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to launch phone dialer: unexpected error", th);
            return false;
        }
    }

    public static final boolean launchAppToAppVerification(java.lang.String str, java.lang.String str2, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(str2);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            if (intent.resolveActivity(context.getPackageManager()) == null) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to launch app for verification: activity not found", null, null, 6, null);
            return false;
        } catch (java.lang.SecurityException unused2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to launch app for verification: security exception", null, null, 6, null);
            return false;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to launch app for verification: unexpected error", th);
            return false;
        }
    }

    public static final boolean launchSecuritySettings(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.SECURITY_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to launch security settings: activity not found", null, null, 6, null);
            return false;
        } catch (java.lang.SecurityException unused2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to launch security settings: security exception", null, null, 6, null);
            return false;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to launch security settings: unexpected error", th);
            return false;
        }
    }
}
