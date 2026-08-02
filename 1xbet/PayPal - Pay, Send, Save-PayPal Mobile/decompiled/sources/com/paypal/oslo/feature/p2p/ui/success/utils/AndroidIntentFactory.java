package com.paypal.oslo.feature.p2p.ui.success.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/utils/AndroidIntentFactory;", "Lcom/paypal/oslo/feature/p2p/ui/success/utils/IntentFactory;", "<init>", "()V", "", "paymentLinkUrl", "Landroid/content/Intent;", "createShareIntent", "(Ljava/lang/String;)Landroid/content/Intent;", "shareIntent", "shareTitle", "createChooserIntent", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidIntentFactory implements com.paypal.oslo.feature.p2p.ui.success.utils.IntentFactory {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.p2p.ui.success.utils.IntentFactory
    public final android.content.Intent createShareIntent(java.lang.String paymentLinkUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkUrl, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", paymentLinkUrl);
        return intent;
    }

    @Override // com.paypal.oslo.feature.p2p.ui.success.utils.IntentFactory
    public final android.content.Intent createChooserIntent(android.content.Intent shareIntent, java.lang.String shareTitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareTitle, "");
        android.content.Intent createChooser = android.content.Intent.createChooser(shareIntent, shareTitle);
        createChooser.addFlags(268435456);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createChooser, "");
        return createChooser;
    }
}
