package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoRepaymentHalfSheetContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "repaymentSectionTitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getRepaymentSectionTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "repaymentHalfSheetTitle", "getRepaymentHalfSheetTitle", "repaymentDoneButtonText", "getRepaymentDoneButtonText", "repaymentEditButtonText", "getRepaymentEditButtonText", "repaymentLinkDebitCardText", "getRepaymentLinkDebitCardText", "repaymentLinkBankAccountText", "getRepaymentLinkBankAccountText", "repaymentCloseButtonLabel", "getRepaymentCloseButtonLabel", "repaymentFiNotFoundErrorMessage", "getRepaymentFiNotFoundErrorMessage", "repaymentFiPartiallyLinkedErrorMessage", "getRepaymentFiPartiallyLinkedErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoRepaymentHalfSheetContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentSectionTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayment_from_section_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentHalfSheetTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_change_fi_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentDoneButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_done, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentEditButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_repayment_change_button_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentLinkDebitCardText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_link_debit_card, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentLinkBankAccountText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_link_a_bank, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentCloseButtonLabel = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentFiNotFoundErrorMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_personal_info_repayment_inline_error_method_not_found, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText repaymentFiPartiallyLinkedErrorMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_personal_info_repayment_inline_error_method_not_all_loaded, new java.lang.Object[0]);

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentSectionTitle() {
        return this.repaymentSectionTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentHalfSheetTitle() {
        return this.repaymentHalfSheetTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentDoneButtonText() {
        return this.repaymentDoneButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentEditButtonText() {
        return this.repaymentEditButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentLinkDebitCardText() {
        return this.repaymentLinkDebitCardText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentLinkBankAccountText() {
        return this.repaymentLinkBankAccountText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentCloseButtonLabel() {
        return this.repaymentCloseButtonLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentFiNotFoundErrorMessage() {
        return this.repaymentFiNotFoundErrorMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRepaymentFiPartiallyLinkedErrorMessage() {
        return this.repaymentFiPartiallyLinkedErrorMessage;
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
