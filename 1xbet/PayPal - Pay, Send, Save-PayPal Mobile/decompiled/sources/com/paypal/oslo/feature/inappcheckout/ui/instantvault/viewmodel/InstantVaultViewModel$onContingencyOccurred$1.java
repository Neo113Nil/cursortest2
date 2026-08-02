package com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$onContingencyOccurred$1", f = "InstantVaultViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class InstantVaultViewModel$onContingencyOccurred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoFpsRangesFor instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency) {
            com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel = this.Camera2StreamConfigurationMap;
            mutableStateFlow4 = instantVaultViewModel.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow4.getValue()).getInitializeCheckoutEntity();
            mutableStateFlow5 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow5.getValue()).getBuyerInfoEntity();
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity copy$default = buyerInfoEntity != null ? com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity.copy$default(buyerInfoEntity, null, null, null, kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor), null, 23, null) : null;
            mutableStateFlow6 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(instantVaultViewModel), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(instantVaultViewModel, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent(new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(initializeCheckoutEntity, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow6.getValue()).getFundingSelectionEntity(), copy$default)), null), 3, null);
        } else {
            com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel2 = this.Camera2StreamConfigurationMap;
            mutableStateFlow = instantVaultViewModel2.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity2 = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow.getValue()).getInitializeCheckoutEntity();
            mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity2 = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow2.getValue()).getBuyerInfoEntity();
            mutableStateFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) mutableStateFlow3.getValue()).getFundingSelectionEntity();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(instantVaultViewModel2), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(instantVaultViewModel2, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp(new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(initializeCheckoutEntity2, fundingSelectionEntity != null ? com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity.copy$default(fundingSelectionEntity, null, null, this.getHighSpeedVideoFpsRangesFor, false, 11, null) : null, buyerInfoEntity2)), null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$onContingencyOccurred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$onContingencyOccurred$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantVaultViewModel$onContingencyOccurred$1(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$onContingencyOccurred$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = contingencyEntity;
        this.Camera2StreamConfigurationMap = instantVaultViewModel;
    }
}
