package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$onActivityResult$1", f = "PushProvisionSetupSideEffectsMiddleware.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PushProvisionSetupSideEffectsMiddleware$onActivityResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Intent Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.StarPayClient getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Intent intent = this.Camera2StreamConfigurationMap;
        if (intent != null) {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            arrow.core.Either<com.paypal.oslo.feature.starpay.api.Error, com.paypal.oslo.feature.starpay.api.PushTokenResult> pushProvisioningResult = starPayClient.getPushProvisioningResult(i, intent);
            if (pushProvisioningResult instanceof arrow.core.Either.Left) {
                arrow.core.Either.Left left = (arrow.core.Either.Left) pushProvisioningResult;
                if (left.getValue() instanceof com.paypal.oslo.feature.starpay.api.Error.Canceled) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push Provisioning flow was cancelled by the user", null, null, 6, null);
                    function1.invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningCancelled.INSTANCE);
                } else {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push Provisioning flow failed with error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", ((com.paypal.oslo.feature.starpay.api.Error) left.getValue()).getMessage()), kotlin.TuplesKt.to("errorCode", ((com.paypal.oslo.feature.starpay.api.Error) left.getValue()).getCode())), null, null, 12, null);
                    function1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL, null, 2, null));
                }
            } else {
                if (!(pushProvisioningResult instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push Provisioning flow completed successfully", null, null, 6, null);
                function1.invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningSuccess.INSTANCE);
            }
        } else {
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push Provisioning flow returned with null data, treating as error", null, null, null, 14, null);
            function12.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL, null, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$onActivityResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$onActivityResult$1 pushProvisionSetupSideEffectsMiddleware$onActivityResult$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$onActivityResult$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        pushProvisionSetupSideEffectsMiddleware$onActivityResult$1.getInputSizeshNQ4ISI = obj;
        return pushProvisionSetupSideEffectsMiddleware$onActivityResult$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushProvisionSetupSideEffectsMiddleware$onActivityResult$1(android.content.Intent intent, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, int i, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware$onActivityResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = intent;
        this.getHighSpeedVideoFpsRanges = starPayClient;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
