package com.paypal.oslo.feature.bnplacquisition.ui.common;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/DeclineContentProvider;", "declineContentProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ErrorContentProvider;", "errorContentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/DeclineContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ErrorContentProvider;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "declineType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "toDeclineContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "toErrorContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/DeclineContentProvider;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ErrorContentProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApplicationFailureUiMapper {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.ErrorContentProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ApplicationFailureUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider declineContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ErrorContentProvider errorContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContentProvider, "");
        this.getHighSpeedVideoSizes = declineContentProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = errorContentProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel toDeclineContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType declineType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineType, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent declineContent = this.getHighSpeedVideoSizes.getDeclineContent(declineType);
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel(declineContent.getTitle(), declineContent.getDescription(), declineContent.getButtonText(), declineType.getIcon(), false, true, false, this.getHighSpeedVideoSizes.getToolBarContent());
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent errorContent = this.getHighResolutionOutputSizeshNQ4ISI.getErrorContent(errorType);
        com.paypal.oslo.core.commonui.utils.RefText title = errorContent.getTitle();
        com.paypal.oslo.core.commonui.utils.RefText description = errorContent.getDescription();
        com.paypal.oslo.core.commonui.utils.RefText buttonText = errorContent.getButtonText();
        boolean z = errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound;
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel(title, description, buttonText, errorType.getIcon(), z || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError), false, (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive) || z || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed) || (errorType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError), this.getHighResolutionOutputSizeshNQ4ISI.getToolBarContent());
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
