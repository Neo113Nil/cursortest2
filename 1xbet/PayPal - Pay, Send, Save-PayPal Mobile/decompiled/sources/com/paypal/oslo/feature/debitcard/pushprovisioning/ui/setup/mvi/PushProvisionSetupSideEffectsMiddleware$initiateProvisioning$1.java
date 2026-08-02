package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1", f = "PushProvisionSetupSideEffectsMiddleware.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.StarPayClient getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.getHighSpeedVideoFpsRangesFor;
            androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.getHighResolutionOutputSizeshNQ4ISI;
            coroutineScope = this.getOutputFormats.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningRequest initiatePushProvisioningRequest = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningRequest(starPayClient, debitInstrument, managedActivityResultLauncher, coroutineScope);
            initiatePushProvisioningUseCase = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiatePushProvisioningRequest);
            this.getHighSpeedVideoSizesFor = 1;
            obj = initiatePushProvisioningUseCase.invoke(initiatePushProvisioningRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning initiation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage()), kotlin.TuplesKt.to("correlationId", error.getCorrelationId())), null, null, 12, null);
            this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), error.getTag()));
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning initiated successfully", null, null, 6, null);
            this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatedPushProvisioning.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware pushProvisionSetupSideEffectsMiddleware, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = starPayClient;
        this.getHighSpeedVideoFpsRangesFor = debitInstrument;
        this.getHighResolutionOutputSizeshNQ4ISI = managedActivityResultLauncher;
        this.getOutputFormats = pushProvisionSetupSideEffectsMiddleware;
        this.getHighSpeedVideoSizes = function1;
    }
}
