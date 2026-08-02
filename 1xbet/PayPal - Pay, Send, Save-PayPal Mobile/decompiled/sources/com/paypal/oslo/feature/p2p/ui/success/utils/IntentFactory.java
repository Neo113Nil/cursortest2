package com.paypal.oslo.feature.p2p.ui.success.utils;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/utils/IntentFactory;", "", "", "paymentLinkUrl", "Landroid/content/Intent;", "createShareIntent", "(Ljava/lang/String;)Landroid/content/Intent;", "shareIntent", "shareTitle", "createChooserIntent", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface IntentFactory {
    android.content.Intent createChooserIntent(android.content.Intent shareIntent, java.lang.String shareTitle);

    android.content.Intent createShareIntent(java.lang.String paymentLinkUrl);
}
