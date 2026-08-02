package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onContingencyOccurred$1", f = "RypViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {"contingencyInput"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class RypViewModel$onContingencyOccurred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory contingencyInputFactory;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase routeContingencyUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            contingencyInputFactory = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.getHighSpeedVideoSizes;
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            java.lang.String selectedInstrumentId = ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State) mutableStateFlow.getValue()).getSelectedInstrumentId();
            mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State) mutableStateFlow2.getValue()).isBalanceSelected());
            mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput create = contingencyInputFactory.create(new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams(contingencyEntity, selectedInstrumentId, boxBoolean, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State) mutableStateFlow3.getValue()).isLoadComplete()));
            routeContingencyUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(create);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = routeContingencyUseCase.invoke(create, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse contingencyResponse = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse) obj;
        if (contingencyResponse instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse) {
            mutableStateFlow5 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM;
            mutableStateFlow5.setValue(((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse) contingencyResponse).getEntity());
        } else if (contingencyResponse instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse) {
            mutableStateFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
            mutableStateFlow4.setValue(((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse) contingencyResponse).getEntity());
        } else if (contingencyResponse instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse) {
            this.getHighResolutionOutputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError(((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse) contingencyResponse).getError()));
        } else if (contingencyResponse instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NavigateToAddCard) {
            this.getHighResolutionOutputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCardOnContingencyResponse.INSTANCE);
        } else if (contingencyResponse instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NavigateToEConsent) {
            this.getHighResolutionOutputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToEConsentOnContingencyResponse.INSTANCE);
        } else {
            if (!(contingencyResponse instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NotHandled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyNotHandled.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onContingencyOccurred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onContingencyOccurred$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RypViewModel$onContingencyOccurred$1(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onContingencyOccurred$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = rypViewModel;
        this.getHighSpeedVideoSizes = contingencyEntity;
    }
}
