package com.paypal.oslo.feature.bnplservicing.ui.plandetails.content;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/SnoozeContent;", "", "<init>", "()V", "", "totalAmount", "feeAmount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "newTotalText", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "subtitleText", "getSubtitleText", "disclaimerText", "getDisclaimerText", "continueButtonText", "getContinueButtonText", "confirmTitle", "getConfirmTitle", "paymentDateLabelText", "getPaymentDateLabelText", "newTotalLabelText", "getNewTotalLabelText", "legalConsentText", "getLegalConsentText", "legalConsentLinkText", "getLegalConsentLinkText", "confirmButtonText", "getConfirmButtonText", "successMessage", "getSuccessMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SnoozeContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_schedule_a_new_date, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText subtitleText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_schedule_a_new_date_description, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText disclaimerText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_schedule_new_date_message, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText continueButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_ok, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText confirmTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_confirm_new_payment_date, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText paymentDateLabelText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_new_scheduled_payment_date_label, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText newTotalLabelText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_new_total_label, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText legalConsentText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_new_payment_date_terms_and_conditions_message, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText legalConsentLinkText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("terms and conditions");
    private final com.paypal.oslo.core.commonui.utils.RefText confirmButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_extend_for_fee_label, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText successMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_more_time_to_pay_success_message, new java.lang.Object[0]);

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSubtitleText() {
        return this.subtitleText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDisclaimerText() {
        return this.disclaimerText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getContinueButtonText() {
        return this.continueButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getConfirmTitle() {
        return this.confirmTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPaymentDateLabelText() {
        return this.paymentDateLabelText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getNewTotalLabelText() {
        return this.newTotalLabelText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLegalConsentText() {
        return this.legalConsentText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLegalConsentLinkText() {
        return this.legalConsentLinkText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSuccessMessage() {
        return this.successMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText newTotalText(java.lang.String totalAmount, java.lang.String feeAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeAmount, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_new_total_description, totalAmount, feeAmount);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
