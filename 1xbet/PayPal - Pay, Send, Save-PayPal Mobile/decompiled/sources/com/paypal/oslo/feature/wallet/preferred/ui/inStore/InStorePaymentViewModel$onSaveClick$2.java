package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$onSaveClick$2", f = "InStorePaymentViewModel.kt", i = {0}, l = {325}, m = "invokeSuspend", n = {"params"}, nl = {327}, s = {"L$0"}, v = 2)
/* loaded from: classes16.dex */
final class InStorePaymentViewModel$onSaveClick$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.inStore.model.InStorePaymentScreenState getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel getHighSpeedVideoSizesFor;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase updateInstorePaymentPreferenceUseCase;
        java.lang.Object first;
        com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams updateInStorePreferenceParams;
        com.paypal.oslo.feature.wallet.preferred.ui.inStore.model.InStorePaymentScreenState copy;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel inStorePaymentViewModel = this.getHighSpeedVideoSizesFor;
            java.lang.Object value = inStorePaymentViewModel.getHighSpeedVideoSizes.getValue();
            com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.Content content = value instanceof com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.Content ? (com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.Content) value : null;
            if (content != null) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = inStorePaymentViewModel.getHighSpeedVideoSizes;
                copy = r5.copy((r20 & 1) != 0 ? r5.paypalBalance : null, (r20 & 2) != 0 ? r5.isUseBalanceEnabled : false, (r20 & 4) != 0 ? r5.preferredPaymentMethods : null, (r20 & 8) != 0 ? r5.selectedPaymentMethodId : null, (r20 & 16) != 0 ? r5.selectedFundingType : null, (r20 & 32) != 0 ? r5.selectedDisplayName : null, (r20 & 64) != 0 ? r5.showBalance : false, (r20 & 128) != 0 ? r5.bannerState : null, (r20 & 256) != 0 ? content.getScreenState().isSaving : true);
                mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.Content(copy));
            }
            com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams updateInStorePreferenceParams2 = new com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.isUseBalanceEnabled());
            updateInstorePaymentPreferenceUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = updateInStorePreferenceParams2;
            this.getOutputFormats = 1;
            first = kotlinx.coroutines.flow.FlowKt.first(updateInstorePaymentPreferenceUseCase.invoke(updateInStorePreferenceParams2), this);
            if (first == coroutine_suspended) {
                return coroutine_suspended;
            }
            updateInStorePreferenceParams = updateInStorePreferenceParams2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            updateInStorePreferenceParams = (com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            first = obj;
        }
        arrow.core.Either either = (arrow.core.Either) first;
        com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel inStorePaymentViewModel2 = this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            appNavigator = inStorePaymentViewModel2.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithSuccessResult(appNavigator, str2, fundingInstrumentType, str);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError inStorePaymentError = (com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to update in-store payment preference", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", inStorePaymentError.toString())), null, 4, null);
            if (inStorePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError.Network) {
                inStorePaymentViewModel2.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.access$toErrorUiState(inStorePaymentViewModel2, inStorePaymentError));
            } else {
                inStorePaymentViewModel2.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.SaveError(updateInStorePreferenceParams, fundingInstrumentType, str));
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$onSaveClick$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$onSaveClick$2(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InStorePaymentViewModel$onSaveClick$2(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel inStorePaymentViewModel, java.lang.String str, com.paypal.oslo.feature.wallet.preferred.ui.inStore.model.InStorePaymentScreenState inStorePaymentScreenState, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$onSaveClick$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = inStorePaymentViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = inStorePaymentScreenState;
        this.getHighSpeedVideoFpsRangesFor = fundingInstrumentType;
        this.Camera2StreamConfigurationMap = str2;
    }
}
