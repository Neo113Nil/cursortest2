package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentBottomSheetPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentBottomSheetPreviewConfig;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoRepaymentHalfSheetContentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoRepaymentHalfSheetContentProvider;", "Camera2StreamConfigurationMap", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RepaymentBottomSheetPreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoRepaymentHalfSheetContentProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig> getHighSpeedVideoSizes;

    public RepaymentBottomSheetPreviewProvider() {
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoRepaymentHalfSheetContentProvider personalInfoRepaymentHalfSheetContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoRepaymentHalfSheetContentProvider();
        this.Camera2StreamConfigurationMap = personalInfoRepaymentHalfSheetContentProvider;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData repaymentPreviewData = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig repaymentBottomSheetPreviewConfig = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData.getHighSpeedVideoSizes(), "1", false, null, null, 28, null);
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData repaymentPreviewData2 = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig repaymentBottomSheetPreviewConfig2 = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData.getHighSpeedVideoFpsRangesFor()), "1", false, personalInfoRepaymentHalfSheetContentProvider.getRepaymentFiNotFoundErrorMessage(), null, 20, null);
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData repaymentPreviewData3 = com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData.INSTANCE;
        this.getHighSpeedVideoSizes = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig[]{repaymentBottomSheetPreviewConfig, repaymentBottomSheetPreviewConfig2, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData.getHighSpeedVideoFpsRangesFor()), "1", false, personalInfoRepaymentHalfSheetContentProvider.getRepaymentFiPartiallyLinkedErrorMessage(), null, 20, null), new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig(null, null, true, null, null, 24, null), new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig(null, null, false, null, new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Something went wrong"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("We couldn't load your payment methods. Please try again."), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_CLOSE), com.paypal.pds.core.Icon.NoIcon.INSTANCE, false, false, true, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_BACK_BUTTON), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_CLOSE))), 12, null)});
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig> getValues() {
        return this.getHighSpeedVideoSizes;
    }
}
