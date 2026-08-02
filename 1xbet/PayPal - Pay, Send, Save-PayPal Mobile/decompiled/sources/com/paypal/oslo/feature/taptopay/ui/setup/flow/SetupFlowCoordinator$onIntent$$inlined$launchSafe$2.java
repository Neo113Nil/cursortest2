package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator$launchSafe$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$2", f = "SetupFlowCoordinator.kt", i = {0, 0, 1, 1, 1, 1}, l = {897, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR}, m = "invokeSuspend", n = {"$completion", "$i$a$-launchSafe-SetupFlowCoordinator$onIntent$2", "$completion", "entryPoint", "$i$a$-launchSafe-SetupFlowCoordinator$onIntent$2", "shouldShowEducation"}, nl = {898, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
public final class SetupFlowCoordinator$onIntent$$inlined$launchSafe$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.Continuation continuation;
        int i;
        com.paypal.oslo.feature.taptopay.domain.repository.IntroPreferencesRepository introPreferencesRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" failed");
            logger.e(sb.toString(), e2);
            this.getInputSizeshNQ4ISI.getStateHolder().cacheErrorState(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.class), new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, null, null, 0));
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator navigator = this.getInputSizeshNQ4ISI.getNavigator();
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization tokenization = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.INSTANCE;
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(" failed");
            navigator.navigate(tokenization, sb2.toString());
        }
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$2 setupFlowCoordinator$onIntent$$inlined$launchSafe$2 = this;
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = this.getHighSpeedVideoSizesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setupFlowCoordinator$onIntent$$inlined$launchSafe$2);
            this.getHighSpeedVideoFpsRanges = 0;
            this.getInputFormats = 1;
            java.lang.Object access$checkIfShouldShowEducation = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.access$checkIfShouldShowEducation(setupFlowCoordinator, this);
            if (access$checkIfShouldShowEducation != coroutine_suspended) {
                continuation = setupFlowCoordinator$onIntent$$inlined$launchSafe$2;
                obj = access$checkIfShouldShowEducation;
                i = 0;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor.getNavigator().navigate(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro.INSTANCE, "new user needs education");
            return kotlin.Unit.INSTANCE;
        }
        i = this.getHighSpeedVideoFpsRanges;
        continuation = (kotlin.coroutines.Continuation) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Showing setup education screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "new user or demo mode")), null, 4, null);
            com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint = this.getHighSpeedVideoSizesFor.getStateHolder().getEntryPoint();
            if (entryPoint != null) {
                introPreferencesRepository = this.getHighSpeedVideoSizesFor.isOutputSupportedForhNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(continuation);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(entryPoint);
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighSpeedVideoSizes = booleanValue;
                this.getInputFormats = 2;
                if (introPreferencesRepository.setHasSeenIntro(entryPoint, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.getHighSpeedVideoSizesFor.getNavigator().navigate(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro.INSTANCE, "new user needs education");
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoSizesFor.getNavigator().navigate(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE, "screen lock ok - skipping education");
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$onIntent$$inlined$launchSafe$2(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, continuation, this.getHighSpeedVideoSizesFor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupFlowCoordinator$onIntent$$inlined$launchSafe$2(java.lang.String str, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getInputSizeshNQ4ISI = setupFlowCoordinator;
        this.getHighSpeedVideoSizesFor = setupFlowCoordinator2;
    }
}
