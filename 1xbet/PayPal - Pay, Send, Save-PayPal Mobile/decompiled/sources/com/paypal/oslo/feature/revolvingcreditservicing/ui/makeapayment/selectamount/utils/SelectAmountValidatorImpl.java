package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/SelectAmountValidatorImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/SelectAmountValidator;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/AmountValidationData;", "validationData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getValidationErrorMessage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/AmountValidationData;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "", "hasValidSelectedAmount", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/AmountValidationData;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectAmountValidatorImpl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.SelectAmountValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SelectAmountValidatorImpl() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.SelectAmountValidator
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getValidationErrorMessage(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData validationData) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationData, "");
        if (validationData.getAmount().compareTo(java.math.BigDecimal.ZERO) <= 0) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_enter_amount_greater_than_zero);
        }
        if (validationData.getAmount().compareTo(validationData.getMaxAmount()) <= 0) {
            return null;
        }
        if (validationData.getHasScheduledPayment()) {
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_higher_mara_amount_scheduled_error_message, new java.lang.Object[]{validationData.getFormattedMaxAmount()}, null, false, 12, null);
        } else {
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_higher_mara_amount_error_message, new java.lang.Object[]{validationData.getFormattedMaxAmount()}, null, false, 12, null);
        }
        return stringResWithParameter;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.SelectAmountValidator
    public final boolean hasValidSelectedAmount(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData validationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationData, "");
        return getValidationErrorMessage(validationData) == null;
    }
}
