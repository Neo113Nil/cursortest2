package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayValidator;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "", "customAmount", "Ljava/math/BigDecimal;", "maxAllowableRepaymentAmount", "", "hasSelectedPaymentMethod", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/ConfirmValidationResult;", "validateOnConfirm", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/lang/String;Ljava/math/BigDecimal;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/ConfirmValidationResult;", "creditLineAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "validateCreditLimitExceeded", "(Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "validateCustomAmount", "validatePaymentMethod", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "validatePaymentAmount", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AutopayValidator() {
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult validateOnConfirm(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption, java.lang.String customAmount, java.math.BigDecimal maxAllowableRepaymentAmount, boolean hasSelectedPaymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult(validatePaymentAmount(selectedOption), selectedOption == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT ? validateCustomAmount(customAmount, maxAllowableRepaymentAmount) : null, validatePaymentMethod(selectedOption, hasSelectedPaymentMethod));
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validateCreditLimitExceeded(java.lang.String customAmount, java.math.BigDecimal creditLineAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
        if (kotlin.text.StringsKt.toBigDecimalOrNull(customAmount) == null) {
            return null;
        }
        java.math.BigDecimal centsStringToDollars = com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.centsStringToDollars(customAmount);
        if (creditLineAmount == null || centsStringToDollars.compareTo(creditLineAmount) <= 0) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_error_exceeds_credit, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validateCustomAmount(java.lang.String customAmount, java.math.BigDecimal creditLineAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
        if (kotlin.text.StringsKt.toBigDecimalOrNull(customAmount) == null) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_error_greater_than_zero, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        java.math.BigDecimal centsStringToDollars = com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.centsStringToDollars(customAmount);
        if (centsStringToDollars.compareTo(java.math.BigDecimal.ZERO) <= 0) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_error_greater_than_zero, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (creditLineAmount == null || centsStringToDollars.compareTo(creditLineAmount) <= 0) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_error_exceeds_credit, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validatePaymentMethod(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption, boolean hasSelectedPaymentMethod) {
        if (selectedOption == null || hasSelectedPaymentMethod) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validatePaymentAmount(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption) {
        if (selectedOption == null) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_select_payment_error_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return null;
    }
}
