package com.paypal.oslo.feature.p2p.ui.transfer.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1", f = "TransferViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {147, 148}, m = "invokeSuspend", n = {"$this$launch", "transferAttemptFlow", "transferFlowConfigFlow", "transferAttemptDeferred", "transferFlowConfigDeferred", "$this$launch", "transferAttemptFlow", "transferFlowConfigFlow", "transferAttemptDeferred", "transferFlowConfigDeferred", "transferAttemptResult"}, nl = {148, 150}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes13.dex */
final class TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:19:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0140  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase startTransferAttemptUseCase;
        com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase getPaymentTransferFlowConfigurationUseCase;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt>> flow;
        kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>> flow2;
        kotlinx.coroutines.Deferred deferred;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt startPaymentTransferAttempt;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager;
        com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper startPaymentTransferAttemptToTransferUiStateMapper;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            startTransferAttemptUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt>> invoke = startTransferAttemptUseCase.invoke();
            getPaymentTransferFlowConfigurationUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>> invoke2 = getPaymentTransferFlowConfigurationUseCase.invoke();
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferAttemptDeferred$1(invoke, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1(invoke2, null), 3, null);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke2);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.getHighResolutionOutputSizeshNQ4ISI = async$default2;
            this.getInputFormats = 1;
            java.lang.Object await = async$default.await(this);
            if (await != coroutine_suspended) {
                flow = invoke;
                obj = await;
                flow2 = invoke2;
                deferred = async$default;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ior = (arrow.core.Ior) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Ior ior2 = (arrow.core.Ior) obj;
            startPaymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt) ior.getOrNull();
            obj2 = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ior.leftOrNull();
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration) ior2.getOrNull();
            obj3 = (com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError) ior2.leftOrNull();
            if (startPaymentTransferAttempt == null && paymentTransferFlowConfiguration != null) {
                p2pFeatureGateManager = this.getHighSpeedVideoSizesFor.getOutputFormats;
                com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext paymentTransferAttemptContext = new com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext(startPaymentTransferAttempt, paymentTransferFlowConfiguration, p2pFeatureGateManager.isCryptoPickerEnabled());
                startPaymentTransferAttemptToTransferUiStateMapper = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success map = startPaymentTransferAttemptToTransferUiStateMapper.map(paymentTransferAttemptContext);
                com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel = this.getHighSpeedVideoSizesFor;
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.TRANSFER_AMOUNT_SCREEN_READY, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", startPaymentTransferAttempt.getId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_CONFIG_DATA, "true"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, kotlin.collections.CollectionsKt.joinToString$default(paymentTransferFlowConfiguration.getSupportedIntents(), ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.$r8$lambda$vML974vk2o796m8_8EYjnztZyJc((com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) obj4);
                    }
                }, 30, null))), null, 4, null);
                this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted(map));
            } else if (obj2 == null || obj3 != null) {
                com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel2 = this.getHighSpeedVideoSizesFor;
                if (obj2 == null) {
                    obj2 = obj3;
                }
                com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.access$logTransferAttemptFailed(transferViewModel2, obj2, obj3 != null);
                this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed.INSTANCE);
            } else {
                com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.access$logTransferAttemptFailed(this.getHighSpeedVideoSizesFor, null, false);
                this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed.INSTANCE);
            }
            return kotlin.Unit.INSTANCE;
        }
        async$default2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
        deferred = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
        flow2 = (kotlinx.coroutines.flow.Flow) this.getHighSpeedVideoFpsRangesFor;
        flow = (kotlinx.coroutines.flow.Flow) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior ior3 = (arrow.core.Ior) obj;
        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flow);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flow2);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
        this.getOutputMinFrameDuration = ior3;
        this.getInputFormats = 2;
        java.lang.Object await2 = async$default2.await(this);
        if (await2 != coroutine_suspended) {
            ior = ior3;
            obj = await2;
            arrow.core.Ior ior22 = (arrow.core.Ior) obj;
            startPaymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt) ior.getOrNull();
            obj2 = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ior.leftOrNull();
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration2 = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration) ior22.getOrNull();
            obj3 = (com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError) ior22.leftOrNull();
            if (startPaymentTransferAttempt == null) {
            }
            if (obj2 == null) {
            }
            com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel22 = this.getHighSpeedVideoSizesFor;
            if (obj2 == null) {
            }
            com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.access$logTransferAttemptFailed(transferViewModel22, obj2, obj3 != null);
            this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1 transferViewModel$initializeTransferConfigAndStartTransferAttempt$1 = new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, continuation);
        transferViewModel$initializeTransferConfigAndStartTransferAttempt$1.getInputSizeshNQ4ISI = obj;
        return transferViewModel$initializeTransferConfigAndStartTransferAttempt$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = transferViewModel;
        this.getHighSpeedVideoSizes = function1;
    }
}
