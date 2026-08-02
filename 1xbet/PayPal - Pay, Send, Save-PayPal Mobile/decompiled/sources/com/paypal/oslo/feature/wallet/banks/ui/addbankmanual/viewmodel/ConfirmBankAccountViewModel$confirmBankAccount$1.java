package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel$confirmBankAccount$1", f = "ConfirmBankAccountViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m = "invokeSuspend", n = {"params"}, nl = {197}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmBankAccountViewModel$confirmBankAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState success;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Loading.INSTANCE);
            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit confirmBankAccountUsingRandomDeposit = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            confirmBankAccountUseCase = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmBankAccountUsingRandomDeposit);
            this.getInputSizeshNQ4ISI = 1;
            obj = confirmBankAccountUseCase.invoke(confirmBankAccountUsingRandomDeposit, this);
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
        mutableStateFlow2 = this.getOutputFormats.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            success = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            success = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            success = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) both.getRightValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mutableStateFlow2.setValue(success);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel$confirmBankAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel$confirmBankAccount$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmBankAccountViewModel$confirmBankAccount$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel$confirmBankAccount$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = confirmBankAccountViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getHighSpeedVideoFpsRanges = str4;
    }
}
