package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositPDFViewModelKt {
    public static final /* synthetic */ void access$startActivitySafely(android.app.Activity activity, android.content.Intent intent, java.lang.String str) {
        try {
            activity.startActivity(android.content.Intent.createChooser(intent, str));
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("No activity found to handle PDF intent", e);
        } catch (java.lang.SecurityException e2) {
            com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Security exception when sharing PDF", e2);
        }
    }
}
