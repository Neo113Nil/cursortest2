package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$retryFromSaveError$1", f = "OnlinePaymentViewModel.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, nl = {176}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class OnlinePaymentViewModel$retryFromSaveError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase updatePaymentPreferenceUseCase;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Loading.INSTANCE);
            updatePaymentPreferenceUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(updatePaymentPreferenceUseCase.invoke(this.getHighSpeedVideoFpsRanges.getFundingInstrumentId()), this);
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
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError saveError = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            appNavigator = onlinePaymentViewModel.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithSuccessResult(appNavigator, saveError.getFundingInstrumentId(), saveError.getFundingInstrumentType(), saveError.getDisplayName());
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError onlinePaymentError = (com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to retry online payment preference save", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", onlinePaymentError.toString())), null, 4, null);
            if (onlinePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError.Network) {
                onlinePaymentViewModel.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.access$toErrorUiState(onlinePaymentViewModel, onlinePaymentError));
            } else {
                onlinePaymentViewModel.getHighSpeedVideoFpsRanges.setValue(saveError);
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$retryFromSaveError$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$retryFromSaveError$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnlinePaymentViewModel$retryFromSaveError$1(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel, com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError saveError, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$retryFromSaveError$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = onlinePaymentViewModel;
        this.getHighSpeedVideoFpsRanges = saveError;
    }
}
