package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1", f = "PushProvisionSetupSideEffectsMiddleware.kt", i = {0}, l = {270}, m = "invokeSuspend", n = {"request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.StarPayClient getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetWalletStatusRequest getWalletStatusRequest = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetWalletStatusRequest(this.getHighSpeedVideoSizes);
            getWalletStatusUseCase = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getWalletStatusRequest);
            this.getOutputMinFrameDuration = 1;
            obj = getWalletStatusUseCase.invoke(getWalletStatusRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.starpay.api.WalletStatus>>) this);
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
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning wallet status check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage()), kotlin.TuplesKt.to("correlationId", error.getCorrelationId())), null, null, 12, null);
            this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE, error.getTag()));
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning wallet status check completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("walletStatus", ((com.paypal.oslo.feature.starpay.api.WalletStatus) success.getData()).name())), null, 4, null);
            int i2 = com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.starpay.api.WalletStatus) success.getData()).ordinal()];
            if (i2 == 1) {
                this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet(this.getHighSpeedVideoSizes));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.starpay.api.WalletStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.starpay.api.WalletStatus.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.starpay.api.WalletStatus.NEEDS_SETUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1(this.getHighSpeedVideoSizes, this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware pushProvisionSetupSideEffectsMiddleware, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = starPayClient;
        this.getOutputFormats = pushProvisionSetupSideEffectsMiddleware;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = debitInstrument;
        this.getHighSpeedVideoFpsRangesFor = managedActivityResultLauncher;
    }
}
