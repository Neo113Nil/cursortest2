package com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$handleAgreeAndContinue$1", f = "InstantVaultViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, nl = {132}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class InstantVaultViewModel$handleAgreeAndContinue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase authorizeBillingAgreementUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            authorizeBillingAgreementUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1;
            obj = authorizeBillingAgreementUseCase.invoke(((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow.getValue()).getSelectedInstrumentId(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel.access$handleAuthorizeBACreationResponse(this.Camera2StreamConfigurationMap, (arrow.core.Either) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$handleAgreeAndContinue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$handleAgreeAndContinue$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantVaultViewModel$handleAgreeAndContinue$1(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$handleAgreeAndContinue$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = instantVaultViewModel;
    }
}
