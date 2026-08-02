package com.paypal.oslo.feature.bnplacquisition.ui.common;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ErrorContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/ApplicationFailureContent;", "getErrorContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/ApplicationFailureContent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));

    @javax.inject.Inject
    public ErrorContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent getErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        if (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_no_internet_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_no_internet_error_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back_to_previous, new java.lang.Object[0]));
        }
        if ((errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.AddCardFailed)) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_api_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_api_error_description_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back_to_previous, new java.lang.Object[0]));
        }
        if (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_card_provisioning_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_card_provisioning_error_retry_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_card_provisioning_error_retry_action, new java.lang.Object[0]));
        }
        if (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningError) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_card_provisioning_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_card_provisioning_error_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_card_provisioning_error_go_to_card_action, new java.lang.Object[0]));
        }
        if ((errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed)) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_api_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_api_error_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_try_again, new java.lang.Object[0]));
        }
        if (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_make_space_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_make_space_error_description, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_google_wallet, new java.lang.Object[0])), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_make_space_error_action, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_google, new java.lang.Object[0])));
        }
        if (!(errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.PayLaterNotAvailable)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_product_not_available_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_generic_decline_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_done, new java.lang.Object[0]));
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
