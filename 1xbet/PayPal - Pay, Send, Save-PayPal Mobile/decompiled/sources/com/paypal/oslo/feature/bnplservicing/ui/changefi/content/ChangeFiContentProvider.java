package com.paypal.oslo.feature.bnplservicing.ui.changefi.content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b#\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/ChangeFiContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "buttonText", "getButtonText", "agreementText", "getAgreementText", "agreementTextLink", "getAgreementTextLink", "autopayIsOnTitle", "getAutopayIsOnTitle", "autopayOnMessage", "getAutopayOnMessage", "turnAutopayOffTitle", "getTurnAutopayOffTitle", "autopayIsOffTitle", "getAutopayIsOffTitle", "missingFundingInstrumentMessage", "getMissingFundingInstrumentMessage", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/FundingInstrumentContent;", "fundingInstrumentContent", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/FundingInstrumentContent;", "getFundingInstrumentContent", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/FundingInstrumentContent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/ChangeFiContentProvider$UpdatePaymentSuccessContentProvider;", "successContent", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/ChangeFiContentProvider$UpdatePaymentSuccessContentProvider;", "getSuccessContent", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/ChangeFiContentProvider$UpdatePaymentSuccessContentProvider;", "getIneligibleFiMessage", "ineligibleFiMessage", "UpdatePaymentSuccessContentProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeFiContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_change_fi_sheet_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText buttonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_confirm_payment_method, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText agreementText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_change_fi_agreement_text, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText agreementTextLink = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_authorization_link_text, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText autopayIsOnTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_autopay_is_on_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText autopayOnMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_autopay_on_message, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText turnAutopayOffTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_turn_autopay_off_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText autopayIsOffTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_autopay_is_off_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText missingFundingInstrumentMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_missing_fi, new java.lang.Object[0]);
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.content.FundingInstrumentContent fundingInstrumentContent = new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.FundingInstrumentContent();
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider.UpdatePaymentSuccessContentProvider successContent = new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider.UpdatePaymentSuccessContentProvider();

    @javax.inject.Inject
    public ChangeFiContentProvider() {
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getButtonText() {
        return this.buttonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAgreementText() {
        return this.agreementText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAgreementTextLink() {
        return this.agreementTextLink;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAutopayIsOnTitle() {
        return this.autopayIsOnTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAutopayOnMessage() {
        return this.autopayOnMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTurnAutopayOffTitle() {
        return this.turnAutopayOffTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAutopayIsOffTitle() {
        return this.autopayIsOffTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getMissingFundingInstrumentMessage() {
        return this.missingFundingInstrumentMessage;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.content.FundingInstrumentContent getFundingInstrumentContent() {
        return this.fundingInstrumentContent;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider.UpdatePaymentSuccessContentProvider getSuccessContent() {
        return this.successContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIneligibleFiMessage() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_ineligible_fi_alert, new java.lang.Object[0]);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/ChangeFiContentProvider$UpdatePaymentSuccessContentProvider;", "", "<init>", "()V", "", "lastNChars", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "successMessage", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "autopayIsOnTitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getAutopayIsOnTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentMethodUpdatedTitle", "getPaymentMethodUpdatedTitle", "doneButton", "getDoneButton"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdatePaymentSuccessContentProvider {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText autopayIsOnTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_autopay_is_on_title, new java.lang.Object[0]);
        private final com.paypal.oslo.core.commonui.utils.RefText paymentMethodUpdatedTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_update_payment_method_success_title, new java.lang.Object[0]);
        private final com.paypal.oslo.core.commonui.utils.RefText doneButton = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_done, new java.lang.Object[0]);

        public final com.paypal.oslo.core.commonui.utils.RefText getAutopayIsOnTitle() {
            return this.autopayIsOnTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPaymentMethodUpdatedTitle() {
            return this.paymentMethodUpdatedTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDoneButton() {
            return this.doneButton;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText successMessage(java.lang.String lastNChars) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_update_payment_method_success_message, lastNChars);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
