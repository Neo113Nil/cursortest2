package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$loadFaceScanStatus$1", f = "ManageFaceScanViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, nl = {193}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ManageFaceScanViewModel$loadFaceScanStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase getFaceScanStatusUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Loading.INSTANCE);
            getFaceScanStatusUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = getFaceScanStatusUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError faceScanError = (com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError) ((arrow.core.Ior.Left) ior).getValue();
            mutableStateFlow4 = manageFaceScanViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error(new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, null), faceScanError.getDescription(), false, 4, null));
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus faceScanStatus = (com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus) ((arrow.core.Ior.Right) ior).getValue();
            mutableStateFlow3 = manageFaceScanViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content(faceScanStatus.isEnabled(), null, false, 6, null));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus faceScanStatus2 = (com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus) both.getRightValue();
            mutableStateFlow2 = manageFaceScanViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content(faceScanStatus2.isEnabled(), null, false, 6, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$loadFaceScanStatus$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$loadFaceScanStatus$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageFaceScanViewModel$loadFaceScanStatus$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$loadFaceScanStatus$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = manageFaceScanViewModel;
    }
}
