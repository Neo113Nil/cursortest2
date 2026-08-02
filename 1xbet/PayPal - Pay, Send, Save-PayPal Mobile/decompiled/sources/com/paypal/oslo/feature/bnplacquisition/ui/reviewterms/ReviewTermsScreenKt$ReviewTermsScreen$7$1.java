package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ReviewTermsScreenKt$ReviewTermsScreen$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt.access$ReviewTermsScreen$onSystemBack(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewTermsScreenKt$ReviewTermsScreen$7$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> mutableState, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState> state) {
        super(0, kotlin.jvm.internal.Intrinsics.Kotlin.class, "onSystemBack", "ReviewTermsScreen$onSystemBack(Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/MutableState;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsViewModel;Landroidx/compose/runtime/State;)V", 0);
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.Camera2StreamConfigurationMap = bottomSheetController2;
        this.getHighSpeedVideoSizes = reviewTermsViewModel;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
