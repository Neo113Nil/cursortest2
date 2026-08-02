package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/core/commonui/utils/RefText;", "choosePaymentLabel", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "disclaimerText", "title", "", "amount", "", "numberOfPayments", "startDate", "subtitle", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;Ljava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "continueButtonText", "linkDebitCardText", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "validationErrorNoFi", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getValidationErrorNoFi", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentAuthorizationLinkLabel", "getPaymentAuthorizationLinkLabel", "loanAgreementLinkLabel", "getLoanAgreementLinkLabel", "agreementText", "getAgreementText", "agreeToContinueErrorMessage", "getAgreeToContinueErrorMessage", "skipButtonText", "getSkipButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
    private final com.paypal.oslo.core.commonui.utils.RefText validationErrorNoFi = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_error_no_fi, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText paymentAuthorizationLinkLabel = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_disclaimer_link_label, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText loanAgreementLinkLabel = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_terms_disclaimer_loan_agreement_link_label, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText agreementText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_review_terms_agreement_text, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText agreeToContinueErrorMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_agree_to_continue, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText skipButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_skip_button_text, new java.lang.Object[0]);

    @javax.inject.Inject
    public RepaymentsContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getValidationErrorNoFi() {
        return this.validationErrorNoFi;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPaymentAuthorizationLinkLabel() {
        return this.paymentAuthorizationLinkLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLoanAgreementLinkLabel() {
        return this.loanAgreementLinkLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAgreementText() {
        return this.agreementText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAgreeToContinueErrorMessage() {
        return this.agreeToContinueErrorMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSkipButtonText() {
        return this.skipButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText choosePaymentLabel(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        if (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider.WhenMappings.$EnumSwitchMapping$0[cpi.ordinal()] == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_choose_payment_label, new java.lang.Object[0]);
        }
        return null;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText disclaimerText(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider.WhenMappings.$EnumSwitchMapping$0[cpi.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_disclaimer_text, new java.lang.Object[0]);
        }
        if (i != 2) {
            return null;
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_disclaimer_text_short_term, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText title(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider.WhenMappings.$EnumSwitchMapping$0[cpi.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_title, new java.lang.Object[0]);
        }
        if (i != 2) {
            return null;
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_title_short_term, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText subtitle(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi, java.lang.String amount, int numberOfPayments, java.lang.String startDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider.WhenMappings.$EnumSwitchMapping$0[cpi.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_subtitle, amount, java.lang.Integer.valueOf(numberOfPayments), startDate);
        }
        if (i != 2) {
            return null;
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayments_subtitle_short_term, amount);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText continueButtonText(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider.WhenMappings.$EnumSwitchMapping$0[cpi.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_confirm_and_finish, new java.lang.Object[0]);
        }
        if (i == 2) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_agree_and_continue, new java.lang.Object[0]);
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
    }

    public final com.paypal.oslo.core.commonui.utils.RefText linkDebitCardText(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider.WhenMappings.$EnumSwitchMapping$0[cpi.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_link_debit_card, new java.lang.Object[0]);
        }
        if (i != 2) {
            return null;
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_link_a_card, new java.lang.Object[0]);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
