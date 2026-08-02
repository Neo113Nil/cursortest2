package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\bJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001cR\u0011\u0010\"\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010$\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0011\u0010&\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b%\u0010\u001cR\u0011\u0010(\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b'\u0010\u001cR\u0011\u0010*\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010,\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b+\u0010\u001cR\u0011\u0010.\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0011\u00100\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0011\u00102\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0011\u00104\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b3\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanContentProvider;", "", "<init>", "()V", "", "installmentValue", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "monthlyInstallments", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "numberOfInstallments", "(I)Lcom/paypal/oslo/core/commonui/utils/RefText;", "interestValue", "fixedInterestRate", "aprValue", "apr", "dueAmount", "paymentDueTitle", "fundingInstrumentName", "fundingInstrumentLastNumber", "repaymentInfo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "subtitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getSubtitle", "getInterestAmountText", "interestAmountText", "getAmountCreditText", "amountCreditText", "getTotalText", "totalText", "getLenderText", "lenderText", "getCardSetupInfo", "cardSetupInfo", "getAgreementText", "agreementText", "getAgreementLink", "agreementLink", "getApplyButtonText", "applyButtonText", "getTransitioningLoadingProgressText", "transitioningLoadingProgressText", "getTransitioningLoadingFooterText", "transitioningLoadingFooterText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
    private final com.paypal.oslo.core.commonui.utils.RefText subtitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_email_sent_subtitle, new java.lang.Object[0]);

    @javax.inject.Inject
    public ReviewPlanContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_approved_title, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSubtitle() {
        return this.subtitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText monthlyInstallments(java.lang.String installmentValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentValue, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_monthly_amount, installmentValue);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText numberOfInstallments(int numberOfInstallments) {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_installments, java.lang.Integer.valueOf(numberOfInstallments));
    }

    public final com.paypal.oslo.core.commonui.utils.RefText fixedInterestRate(java.lang.String interestValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interestValue, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_fixed_interest_rate, interestValue);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText apr(java.lang.String aprValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aprValue, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_annual_percentage_rate, aprValue);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getInterestAmountText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_interest_amount_label, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAmountCreditText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_total_credit_label, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTotalText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_total_amount_label, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLenderText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_lender_info, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText paymentDueTitle(java.lang.String dueAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueAmount, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_due_today_label, dueAmount);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText repaymentInfo(java.lang.String fundingInstrumentName, java.lang.String fundingInstrumentLastNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentLastNumber, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_repayment_info, fundingInstrumentName, fundingInstrumentLastNumber);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCardSetupInfo() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_card_setup_info, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAgreementText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_agreement_prefix, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAgreementLink() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_installment_agreement_link, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getApplyButtonText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_details_apply_button, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTransitioningLoadingProgressText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_tokenization_progress_text, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTransitioningLoadingFooterText() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_tokenization_footer_text, new java.lang.Object[0]);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
