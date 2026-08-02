package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1", f = "ReviewTermsScreen.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewTermsScreenKt$ReviewTermsScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel getOutputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect reviewTermsUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect) obj;
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState = this.Camera2StreamConfigurationMap;
            final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> mutableState = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt.access$handleUiEffect(reviewTermsUiEffect, appNavigator, bnplAcquisitionSharedViewModel, bottomSheetController, toastState, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1.AnonymousClass1.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel documentsSheetUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsSheetUiModel, "");
            mutableState.setValue(documentsSheetUiModel);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> mutableState) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = bnplAcquisitionSharedViewModel;
            this.getHighSpeedVideoFpsRanges = bottomSheetController;
            this.Camera2StreamConfigurationMap = toastState;
            this.getHighSpeedVideoSizes = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.getOutputFormats.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTermsScreenKt$ReviewTermsScreen$5$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt$ReviewTermsScreen$5$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = reviewTermsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRanges = bnplAcquisitionSharedViewModel;
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.Camera2StreamConfigurationMap = toastState;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
