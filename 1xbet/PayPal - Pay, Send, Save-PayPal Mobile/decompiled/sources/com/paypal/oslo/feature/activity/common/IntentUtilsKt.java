package com.paypal.oslo.feature.activity.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/model/IntentType;", "intentType", "Landroid/content/Context;", "context", "", "launchIntent", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/IntentType;Landroid/content/Context;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IntentUtilsKt {
    public static final boolean launchIntent(com.paypal.oslo.feature.activity.ui.detail.model.IntentType intentType, android.content.Context context) {
        java.lang.String url;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        boolean z = intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.Email;
        if (z) {
            url = ((com.paypal.oslo.feature.activity.ui.detail.model.IntentType.Email) intentType).getEmail();
        } else if (intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.Browser) {
            url = ((com.paypal.oslo.feature.activity.ui.detail.model.IntentType.Browser) intentType).getUrl();
        } else if (intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.PhoneDialer) {
            url = ((com.paypal.oslo.feature.activity.ui.detail.model.IntentType.PhoneDialer) intentType).getPhoneNumber();
        } else {
            if (!(intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.ShareLink)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            url = ((com.paypal.oslo.feature.activity.ui.detail.model.IntentType.ShareLink) intentType).getUrl();
        }
        if (kotlin.text.StringsKt.isBlank(url)) {
            return false;
        }
        if (z) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
            intent.setData(android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME.concat(java.lang.String.valueOf(url))));
            pair = kotlin.TuplesKt.to(intent, "email client");
        } else if (intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.Browser) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            intent2.setData(android.net.Uri.parse(url));
            pair = kotlin.TuplesKt.to(intent2, "browser");
        } else if (intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.PhoneDialer) {
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.DIAL");
            intent3.setData(android.net.Uri.parse("tel:".concat(java.lang.String.valueOf(url))));
            pair = kotlin.TuplesKt.to(intent3, "phone dialer");
        } else {
            if (!(intentType instanceof com.paypal.oslo.feature.activity.ui.detail.model.IntentType.ShareLink)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            android.content.Intent intent4 = new android.content.Intent("android.intent.action.SEND");
            intent4.setType("text/plain");
            intent4.putExtra("android.intent.extra.TEXT", url);
            android.content.Intent createChooser = android.content.Intent.createChooser(intent4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createChooser, "");
            pair = kotlin.TuplesKt.to(createChooser, "share chooser");
        }
        android.content.Intent intent5 = (android.content.Intent) pair.component1();
        java.lang.String str = (java.lang.String) pair.component2();
        try {
            context.startActivity(intent5);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.activity.LoggerKt.log;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No ");
            sb.append(str);
            sb.append(" app available on device");
            com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
            return false;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.feature.activity.LoggerKt.log.e("Failed to launch ".concat(java.lang.String.valueOf(str)), th);
            return false;
        }
    }
}
