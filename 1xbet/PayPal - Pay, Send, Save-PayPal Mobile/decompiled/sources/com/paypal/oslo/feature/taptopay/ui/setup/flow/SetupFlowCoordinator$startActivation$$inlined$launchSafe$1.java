package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator$launchSafe$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startActivation$$inlined$launchSafe$1", f = "SetupFlowCoordinator.kt", i = {0, 0}, l = {899}, m = "invokeSuspend", n = {"$completion", "$i$a$-launchSafe-SetupFlowCoordinator$startActivation$1"}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes15.dex */
public final class SetupFlowCoordinator$startActivation$$inlined$launchSafe$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase payPalActivateCardUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                payPalActivateCardUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> invoke = payPalActivateCardUseCase.invoke(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(this.getHighResolutionOutputSizeshNQ4ISI.getId()));
                final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = this.getHighSpeedVideoSizesFor;
                kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startActivation$1$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.access$processAddCardState(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.this, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                };
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (invoke.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" failed");
            logger.e(sb.toString(), e2);
            this.getOutputMinFrameDuration.getStateHolder().cacheErrorState(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.class), new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, null, null, 0));
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator navigator = this.getOutputMinFrameDuration.getNavigator();
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization tokenization = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.INSTANCE;
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(" failed");
            navigator.navigate(tokenization, sb2.toString());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startActivation$$inlined$launchSafe$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startActivation$$inlined$launchSafe$1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, continuation, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupFlowCoordinator$startActivation$$inlined$launchSafe$1(java.lang.String str, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getOutputMinFrameDuration = setupFlowCoordinator;
        this.getHighSpeedVideoSizesFor = setupFlowCoordinator2;
        this.getHighResolutionOutputSizeshNQ4ISI = setupCardInfo;
    }
}
