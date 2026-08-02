package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountContentProvider;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;", "availableCpiTypes", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "footerAction", "(Ljava/util/List;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "prequalText", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "validationErrorTooLow", "validationErrorTooHigh", "validationErrorInvalid", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "formattedAmount", "spendingPowerText", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "headerTitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHeaderTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "footerTitle", "getFooterTitle", "continueButtonText", "getContinueButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnterAmountContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
    private final com.paypal.oslo.core.commonui.utils.RefText headerTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_header_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText footerTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_footer_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText continueButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_continue, new java.lang.Object[0]);

    @javax.inject.Inject
    public EnterAmountContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getHeaderTitle() {
        return this.headerTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getFooterTitle() {
        return this.footerTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText footerAction(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> availableCpiTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCpiTypes, "");
        if (availableCpiTypes.contains(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.SHORT_TERM)) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_footer_action_multi_product, new java.lang.Object[0]);
        }
        if (availableCpiTypes.contains(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.LONG_TERM)) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_footer_action_long_term, new java.lang.Object[0]);
        }
        return null;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getContinueButtonText() {
        return this.continueButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText prequalText(java.lang.String max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_prequal_text, max);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText validationErrorTooLow(java.lang.String min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_validation_error_min, min);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText validationErrorTooHigh(java.lang.String max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_validation_error_max, max);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText validationErrorInvalid(java.lang.String min, java.lang.String max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_validation_error, min, max);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText spendingPowerText(java.lang.String formattedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_enter_amount_prequal_text, formattedAmount);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
