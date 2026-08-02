package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1", f = "RandomDepositsConfirmationRoute.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState access$RandomDepositsConfirmationRoute$lambda$0 = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.access$RandomDepositsConfirmationRoute$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI);
        if (access$RandomDepositsConfirmationRoute$lambda$0 instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success) {
            if (((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success) access$RandomDepositsConfirmationRoute$lambda$0).getResult().getSuccess()) {
                this.getHighSpeedVideoFpsRangesFor.onConfirmSuccess(this.getHighSpeedVideoSizes);
            } else {
                intValue3 = this.getHighSpeedVideoFpsRanges.getIntValue();
                this.getHighSpeedVideoFpsRanges.setIntValue(intValue3 + 1);
                androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.Camera2StreamConfigurationMap;
                intValue4 = this.getHighSpeedVideoFpsRanges.getIntValue();
                mutableState.setValue(java.lang.Boolean.valueOf(intValue4 < 3));
            }
        } else if (!(access$RandomDepositsConfirmationRoute$lambda$0 instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error)) {
            if (!(access$RandomDepositsConfirmationRoute$lambda$0 instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Loading) && !(access$RandomDepositsConfirmationRoute$lambda$0 instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Idle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            intValue = this.getHighSpeedVideoFpsRanges.getIntValue();
            this.getHighSpeedVideoFpsRanges.setIntValue(intValue + 1);
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.Camera2StreamConfigurationMap;
            intValue2 = this.getHighSpeedVideoFpsRanges.getIntValue();
            mutableState2.setValue(java.lang.Boolean.valueOf(intValue2 < 3));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState> state, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = confirmBankAccountViewModel;
        this.getHighSpeedVideoSizes = bankAccountDetails;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRanges = mutableIntState;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
