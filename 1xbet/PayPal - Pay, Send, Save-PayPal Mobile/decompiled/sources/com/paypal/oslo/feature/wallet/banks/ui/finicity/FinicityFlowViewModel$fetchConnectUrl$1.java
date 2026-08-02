package com.paypal.oslo.feature.wallet.banks.ui.finicity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$fetchConnectUrl$1", f = "FinicityFlowViewModel.kt", i = {0, 0, 0}, l = {175}, m = "invokeSuspend", n = {"aggregator", "redirectUrl", "params"}, nl = {176}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class FinicityFlowViewModel$fetchConnectUrl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj2;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase initiateExternalBankAccessUseCase;
        java.lang.Object invoke;
        java.lang.String str5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel = this.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
                str = finicityFlowViewModel.getInputFormats;
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading(str)));
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> entries = com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.getEntries();
            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel2 = this.Camera2StreamConfigurationMap;
            java.util.Iterator<E> it = entries.iterator();
            while (true) {
                str2 = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                java.lang.String name2 = ((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj2).name();
                str5 = finicityFlowViewModel2.getHighResolutionOutputSizeshNQ4ISI;
                if (kotlin.jvm.internal.Intrinsics.areEqual(name2, str5)) {
                    break;
                }
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj2;
            if (bankAggregator == null) {
                bankAggregator = com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY;
            }
            integrationType = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.lang.String Camera2StreamConfigurationMap = integrationType == com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2 ? this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap() : null;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action = this.Camera2StreamConfigurationMap.getAction();
            java.lang.String instrumentId = this.Camera2StreamConfigurationMap.getInstrumentId();
            if (instrumentId != null && instrumentId.length() != 0) {
                str2 = this.Camera2StreamConfigurationMap.getInstrumentId();
            }
            str3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow = this.Camera2StreamConfigurationMap.getFlow();
            str4 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams initiateExternalBankAccessParams = new com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams(action, bankAggregator, str3, null, str4, str2, Camera2StreamConfigurationMap, flow, false, null, 776, null);
            initiateExternalBankAccessUseCase = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bankAggregator);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateExternalBankAccessParams);
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = initiateExternalBankAccessUseCase.invoke(initiateExternalBankAccessParams, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) invoke;
        if (ior instanceof arrow.core.Ior.Right) {
            java.lang.String connectUrl = ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult) ((arrow.core.Ior.Right) ior).getValue()).getConnectUrl();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Got connect URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))), null, 4, null);
            mutableStateFlow4 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            do {
                value4 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value4, new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl(connectUrl)));
        } else if (ior instanceof arrow.core.Ior.Left) {
            java.lang.String displayMessage = com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessErrorExtKt.toDisplayMessage((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ((arrow.core.Ior.Left) ior).getValue());
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to get connect URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", displayMessage)), null, null, 12, null);
            mutableStateFlow3 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error(displayMessage)));
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.String connectUrl2 = ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult) both.getRightValue()).getConnectUrl();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Partial success getting connect URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) both.getLeftValue()).toString())), null, 4, null);
            mutableStateFlow2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl(connectUrl2)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$fetchConnectUrl$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$fetchConnectUrl$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinicityFlowViewModel$fetchConnectUrl$1(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel$fetchConnectUrl$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = finicityFlowViewModel;
    }
}
