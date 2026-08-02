package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$addBankAccount$1", f = "ManualAddBankViewModel.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, nl = {469}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualAddBankViewModel$addBankAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase addBankManualUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            mutableStateFlow2.setValue(null);
            addBankManualUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = addBankManualUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
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
        if (ior instanceof arrow.core.Ior.Right) {
            mutableStateFlow6 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            mutableStateFlow6.setValue(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModelKt.access$createSuccessOutcome(((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) ((arrow.core.Ior.Right) ior).getValue()).getBankAccountId(), this.getHighSpeedVideoFpsRangesFor));
        } else if (ior instanceof arrow.core.Ior.Left) {
            mutableStateFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            mutableStateFlow4.setValue(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModelKt.access$createErrorOutcome((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError) ((arrow.core.Ior.Left) ior).getValue()));
        } else if (ior instanceof arrow.core.Ior.Both) {
            mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            mutableStateFlow3.setValue(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModelKt.access$createSuccessOutcome(((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) ((arrow.core.Ior.Both) ior).getRightValue()).getBankAccountId(), this.getHighSpeedVideoFpsRangesFor));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mutableStateFlow5 = this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats;
        mutableStateFlow5.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$addBankAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$addBankAccount$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualAddBankViewModel$addBankAccount$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$addBankAccount$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = manualAddBankViewModel;
        this.getHighSpeedVideoFpsRangesFor = addBankManualParams;
    }
}
