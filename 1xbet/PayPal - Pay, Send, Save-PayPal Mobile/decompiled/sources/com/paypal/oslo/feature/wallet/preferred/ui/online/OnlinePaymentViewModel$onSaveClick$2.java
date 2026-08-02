package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$onSaveClick$2", f = "OnlinePaymentViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class OnlinePaymentViewModel$onSaveClick$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase updatePaymentPreferenceUseCase;
        com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState copy;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel = this.getHighSpeedVideoSizes;
            java.lang.Object value = onlinePaymentViewModel.getHighSpeedVideoFpsRanges.getValue();
            com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content content = value instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content ? (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content) value : null;
            if (content != null) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = onlinePaymentViewModel.getHighSpeedVideoFpsRanges;
                copy = r3.copy((r18 & 1) != 0 ? r3.paypalBalance : null, (r18 & 2) != 0 ? r3.preferredPaymentMethods : null, (r18 & 4) != 0 ? r3.selectedPaymentMethodId : null, (r18 & 8) != 0 ? r3.selectedFundingType : null, (r18 & 16) != 0 ? r3.selectedDisplayName : null, (r18 & 32) != 0 ? r3.showBalance : false, (r18 & 64) != 0 ? r3.bannerState : null, (r18 & 128) != 0 ? content.getScreenState().isSaving : true);
                mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(copy));
            }
            updatePaymentPreferenceUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(updatePaymentPreferenceUseCase.invoke(this.Camera2StreamConfigurationMap), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel2 = this.getHighSpeedVideoSizes;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            appNavigator = onlinePaymentViewModel2.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithSuccessResult(appNavigator, str, fundingInstrumentType, str2);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError onlinePaymentError = (com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to update online payment preference", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", onlinePaymentError.toString())), null, 4, null);
            if (onlinePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError.Network) {
                onlinePaymentViewModel2.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.access$toErrorUiState(onlinePaymentViewModel2, onlinePaymentError));
            } else {
                onlinePaymentViewModel2.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError(str, fundingInstrumentType, str2));
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$onSaveClick$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$onSaveClick$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnlinePaymentViewModel$onSaveClick$2(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$onSaveClick$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = onlinePaymentViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = fundingInstrumentType;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
