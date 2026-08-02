package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryErrorUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "p0", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)V", "errorUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "getErrorUiModel", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "PaymentsDisplayError", "PaymentCancelError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryErrorUiModel {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel PaymentCancelError;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel PaymentsDisplayError;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel[] getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel;

    private PaymentSummaryErrorUiModel(java.lang.String str, int i, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel) {
        this.errorUiModel = errorUiModel;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getErrorUiModel() {
        return this.errorUiModel;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel paymentSummaryErrorUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel("PaymentsDisplayError", 0, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_load_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null));
        PaymentsDisplayError = paymentSummaryErrorUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel paymentSummaryErrorUiModel2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel("PaymentCancelError", 1, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_error_cancel_payment_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null));
        PaymentCancelError = paymentSummaryErrorUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel[] paymentSummaryErrorUiModelArr = {paymentSummaryErrorUiModel, paymentSummaryErrorUiModel2};
        getHighSpeedVideoFpsRanges = paymentSummaryErrorUiModelArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(paymentSummaryErrorUiModelArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryErrorUiModel> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
