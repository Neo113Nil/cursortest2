package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ReviewTermsScreenKt$ReviewTermsScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt.access$ReviewTermsScreen$onSystemBack(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewTermsScreenKt$ReviewTermsScreen$2$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> mutableState, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState> state) {
        super(0, kotlin.jvm.internal.Intrinsics.Kotlin.class, "onSystemBack", "ReviewTermsScreen$onSystemBack(Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/MutableState;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsViewModel;Landroidx/compose/runtime/State;)V", 0);
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
        this.getHighSpeedVideoSizes = mutableState;
        this.Camera2StreamConfigurationMap = bottomSheetController2;
        this.getHighResolutionOutputSizeshNQ4ISI = reviewTermsViewModel;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
