package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisionSetupSideEffectsMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupState;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;", "getWalletStatusUseCase", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;", "initiatePushProvisioningUseCase", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function1;", "eventDispatcher", "onActivityResult", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;ILandroid/content/Intent;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisionSetupSideEffectsMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase getHighSpeedVideoFpsRanges;

    public PushProvisionSetupSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWalletStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePushProvisioningUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRangesFor = getWalletStatusUseCase;
        this.getHighSpeedVideoFpsRanges = initiatePushProvisioningUseCase;
        this.getHighSpeedVideoSizes = coroutineScope;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent> input) {
        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;
        androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning) {
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning initiatePushProvisioning = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning) event;
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient2 = initiatePushProvisioning.getStarPayClient();
            androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher2 = initiatePushProvisioning.getLauncher();
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2 = initiatePushProvisioning.getDebitInstrument();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Starting push provisioning", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$initiateProvisioning$1(starPayClient2, debitInstrument2, launcher2, this, eventDispatcher, null), 3, null);
            return;
        }
        boolean z = event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck;
        if (z || (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning)) {
            if (z) {
                starPayClient = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck) event).getStarPayClient();
            } else {
                if (!(event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "PushProvisionSetupSideEffectsMiddleware, Unexpected event type: ".concat(java.lang.String.valueOf(event)), null, null, null, 14, null);
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.UNEXCEPTED_EVENT_TYPE.toString());
                }
                starPayClient = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning) event).getStarPayClient();
            }
            if (z) {
                launcher = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck) event).getLauncher();
            } else {
                if (!(event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "PushProvisionSetupSideEffectsMiddleware, Unexpected event type: ".concat(java.lang.String.valueOf(event)), null, null, null, 14, null);
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.UNEXCEPTED_EVENT_TYPE.toString());
                }
                launcher = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning) event).getLauncher();
            }
            if (z) {
                debitInstrument = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck) event).getDebitInstrument();
            } else {
                if (!(event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "PushProvisionSetupSideEffectsMiddleware, Unexpected event type: ".concat(java.lang.String.valueOf(event)), null, null, null, 14, null);
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.UNEXCEPTED_EVENT_TYPE.toString());
                }
                debitInstrument = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning) event).getDebitInstrument();
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument3 = debitInstrument;
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> eventDispatcher2 = input.getEventDispatcher();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning wallet status check started", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$checkWalletStatus$1(starPayClient, this, eventDispatcher2, debitInstrument3, launcher, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet) {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient3 = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet) event).getStarPayClient();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning wallet setup started", null, null, 6, null);
            starPayClient3.setupWallet();
        }
    }

    public final void onActivityResult(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, int resultCode, android.content.Intent data, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("resultCode", java.lang.Integer.valueOf(resultCode));
        pairArr[1] = kotlin.TuplesKt.to("hasData", java.lang.Boolean.valueOf(data != null));
        com.paypal.android.logger.Logger.i$default(logger, "Received activity result from Google Wallet provisioning flow", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$onActivityResult$1(data, starPayClient, resultCode, eventDispatcher, null), 3, null);
    }
}
