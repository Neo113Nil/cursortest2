package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "ensureNegativeAmount", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RepaymentActivityKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity ensureNegativeAmount(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        if (repaymentActivity.getCamera2StreamConfigurationMap() != null) {
            currencyAmount = kotlin.text.StringsKt.startsWith$default(repaymentActivity.getCamera2StreamConfigurationMap().getValue(), "-", false, 2, (java.lang.Object) null) ? repaymentActivity.getCamera2StreamConfigurationMap() : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount.copy$default(repaymentActivity.getCamera2StreamConfigurationMap(), null, "-".concat(java.lang.String.valueOf(repaymentActivity.getCamera2StreamConfigurationMap().getValue())), 1, null);
        }
        copy = repaymentActivity.copy((r20 & 1) != 0 ? repaymentActivity.id : null, (r20 & 2) != 0 ? repaymentActivity.repaymentType : null, (r20 & 4) != 0 ? repaymentActivity.cancelable : null, (r20 & 8) != 0 ? repaymentActivity.status : null, (r20 & 16) != 0 ? repaymentActivity.amount : currencyAmount, (r20 & 32) != 0 ? repaymentActivity.creationDate : null, (r20 & 64) != 0 ? repaymentActivity.paymentTime : null, (r20 & 128) != 0 ? repaymentActivity.paymentChannel : null, (r20 & 256) != 0 ? repaymentActivity.fundingInstruments : null);
        return copy;
    }
}
