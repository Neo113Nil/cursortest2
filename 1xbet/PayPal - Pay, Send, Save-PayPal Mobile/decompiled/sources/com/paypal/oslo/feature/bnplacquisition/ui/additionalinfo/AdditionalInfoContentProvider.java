package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "screenTitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getScreenTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "screenDescription", "getScreenDescription", "continueButtonText", "getContinueButtonText", "incomeGuidanceTitle", "getIncomeGuidanceTitle", "incomeGuidanceBody", "getIncomeGuidanceBody", "incomeGuidanceDoneButtonText", "getIncomeGuidanceDoneButtonText", "nationalIdentificationFieldTitle", "getNationalIdentificationFieldTitle", "nationalIdentificationFieldError", "getNationalIdentificationFieldError", "incomeFieldTitle", "getIncomeFieldTitle", "incomeFieldEmptyError", "getIncomeFieldEmptyError", "incomeFieldInvalidError", "getIncomeFieldInvalidError", "incomeFieldZeroWarning", "getIncomeFieldZeroWarning"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdditionalInfoContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
    private final com.paypal.oslo.core.commonui.utils.RefText screenTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_additional_info_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText screenDescription = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_additional_info_subtitle, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText continueButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_continue, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeGuidanceTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_annual_income_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeGuidanceBody = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_annual_income_description, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeGuidanceDoneButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_done, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText nationalIdentificationFieldTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_ssn_label, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText nationalIdentificationFieldError = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_ssn_error, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeFieldTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_annual_income_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeFieldEmptyError = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_annual_income_error, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeFieldInvalidError = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_annual_income_error_max, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText incomeFieldZeroWarning = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_annual_income_error_min, new java.lang.Object[0]);

    @javax.inject.Inject
    public AdditionalInfoContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getScreenTitle() {
        return this.screenTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getScreenDescription() {
        return this.screenDescription;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getContinueButtonText() {
        return this.continueButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeGuidanceTitle() {
        return this.incomeGuidanceTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeGuidanceBody() {
        return this.incomeGuidanceBody;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeGuidanceDoneButtonText() {
        return this.incomeGuidanceDoneButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getNationalIdentificationFieldTitle() {
        return this.nationalIdentificationFieldTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getNationalIdentificationFieldError() {
        return this.nationalIdentificationFieldError;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeFieldTitle() {
        return this.incomeFieldTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeFieldEmptyError() {
        return this.incomeFieldEmptyError;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeFieldInvalidError() {
        return this.incomeFieldInvalidError;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getIncomeFieldZeroWarning() {
        return this.incomeFieldZeroWarning;
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
