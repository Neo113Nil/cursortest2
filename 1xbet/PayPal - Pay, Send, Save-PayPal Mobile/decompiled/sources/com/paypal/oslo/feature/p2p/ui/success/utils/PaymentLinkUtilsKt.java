package com.paypal.oslo.feature.p2p.ui.success.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"", "expirationTime", "", "calculateDaysUntilExpiration", "(Ljava/lang/String;)I", "Landroid/content/Context;", "context", "paymentLinkUrl", "shareTitle", "Lcom/paypal/oslo/feature/p2p/ui/success/utils/IntentFactory;", "intentFactory", "", "sharePaymentLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/success/utils/IntentFactory;)V", "DefaultExpirationDays", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentLinkUtilsKt {
    public static final int DefaultExpirationDays = 0;

    public static final int calculateDaysUntilExpiration(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.time.Instant parse = java.time.Instant.parse(str);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Integer.valueOf(java.lang.Math.max((int) java.time.temporal.ChronoUnit.DAYS.between(java.time.Instant.now(), parse), 0)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = 0;
        }
        return ((java.lang.Number) m23436constructorimpl).intValue();
    }

    public static /* synthetic */ void sharePaymentLink$default(android.content.Context context, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.ui.success.utils.IntentFactory intentFactory, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            intentFactory = new com.paypal.oslo.feature.p2p.ui.success.utils.AndroidIntentFactory();
        }
        sharePaymentLink(context, str, str2, intentFactory);
    }

    public static final void sharePaymentLink(android.content.Context context, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.ui.success.utils.IntentFactory intentFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "");
        context.startActivity(intentFactory.createChooserIntent(intentFactory.createShareIntent(str), str2));
    }
}
