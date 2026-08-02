package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$retryFromSaveError$1", f = "InStorePaymentViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class InStorePaymentViewModel$retryFromSaveError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.SaveError getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase updateInstorePaymentPreferenceUseCase;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.Loading.INSTANCE);
            updateInstorePaymentPreferenceUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(updateInstorePaymentPreferenceUseCase.invoke(this.getHighSpeedVideoFpsRangesFor.getParams()), this);
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
        com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel inStorePaymentViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.SaveError saveError = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            appNavigator = inStorePaymentViewModel.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithSuccessResult(appNavigator, saveError.getParams().getFinancialInstrumentId(), saveError.getFundingInstrumentType(), saveError.getDisplayName());
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError inStorePaymentError = (com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to retry in-store payment preference save", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", inStorePaymentError.toString())), null, 4, null);
            if (inStorePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError.Network) {
                inStorePaymentViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.access$toErrorUiState(inStorePaymentViewModel, inStorePaymentError));
            } else {
                inStorePaymentViewModel.getHighSpeedVideoSizes.setValue(saveError);
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$retryFromSaveError$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$retryFromSaveError$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InStorePaymentViewModel$retryFromSaveError$1(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel inStorePaymentViewModel, com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.UiState.SaveError saveError, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel$retryFromSaveError$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = inStorePaymentViewModel;
        this.getHighSpeedVideoFpsRangesFor = saveError;
    }
}
