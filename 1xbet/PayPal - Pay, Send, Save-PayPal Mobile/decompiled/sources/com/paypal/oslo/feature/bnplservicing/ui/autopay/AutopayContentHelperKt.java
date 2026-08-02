package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;", "model", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayContent;", "getAutopayContent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayContent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutopayContentHelperKt {
    public static final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent getAutopayContent(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent autopayContent;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayUpdatedModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1894575355, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.autopay.getAutopayContent (AutopayContentHelper.kt:18)");
        }
        if (autopayUpdatedModel.getAutopayOnModel() != null) {
            java.lang.String lastNChars = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentKt.getLastNChars(autopayUpdatedModel.getAutopayOnModel().getFundingInstrument());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Your automatic payments will come from the card ending in •••• ");
            sb.append(lastNChars);
            sb.append(".\nThis may take up to 1 day.");
            autopayContent = new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent(true, "Autopay is on", sb.toString(), "Done", java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.drawable.feature_bnpl_servicing_clock_clockwise));
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = autopayUpdatedModel.getAutopayOffModel();
            if ((autopayOffModel != null ? autopayOffModel.getFormattedNextPaymentDueAmount() : null) != null && autopayUpdatedModel.getAutopayOffModel().getNextPaymentDueDate() != null) {
                java.lang.String formattedNextPaymentDueAmount = autopayUpdatedModel.getAutopayOffModel().getFormattedNextPaymentDueAmount();
                java.lang.String nextPaymentDueDate = autopayUpdatedModel.getAutopayOffModel().getNextPaymentDueDate();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Your next payment of ");
                sb2.append(formattedNextPaymentDueAmount);
                sb2.append(" is due on ");
                sb2.append(nextPaymentDueDate);
                sb2.append(". You'll need to make a one-time payment.");
                str = sb2.toString();
            }
            autopayContent = new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent(false, "Autopay is off", str, "Done", java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.drawable.feature_bnpl_servicing_clock_countdown));
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return autopayContent;
    }
}
