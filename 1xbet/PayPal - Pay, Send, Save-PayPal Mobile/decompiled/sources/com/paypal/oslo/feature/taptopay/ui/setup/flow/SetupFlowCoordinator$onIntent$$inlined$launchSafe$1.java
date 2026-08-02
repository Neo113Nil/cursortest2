package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator$launchSafe$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$1", f = "SetupFlowCoordinator.kt", i = {0, 0}, l = {897}, m = "invokeSuspend", n = {"$completion", "$i$a$-launchSafe-SetupFlowCoordinator$onIntent$1"}, nl = {898}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes15.dex */
public final class SetupFlowCoordinator$onIntent$$inlined$launchSafe$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase handleDeviceCompromisedUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                handleDeviceCompromisedUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = 1;
                if (handleDeviceCompromisedUseCase.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRanges.getNavigator().navigate(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Terminal.INSTANCE, "device compromised");
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" failed");
            logger.e(sb.toString(), e2);
            this.getOutputFormats.getStateHolder().cacheErrorState(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.class), new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, null, null, 0));
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator navigator = this.getOutputFormats.getNavigator();
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization tokenization = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.INSTANCE;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(" failed");
            navigator.navigate(tokenization, sb2.toString());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, continuation, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupFlowCoordinator$onIntent$$inlined$launchSafe$1(java.lang.String str, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getOutputFormats = setupFlowCoordinator;
        this.getHighSpeedVideoFpsRanges = setupFlowCoordinator2;
    }
}
