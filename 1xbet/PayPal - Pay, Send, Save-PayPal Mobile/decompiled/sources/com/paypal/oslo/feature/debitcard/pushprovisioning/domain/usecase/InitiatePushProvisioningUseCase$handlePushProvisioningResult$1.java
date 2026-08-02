package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$handlePushProvisioningResult$1", f = "InitiatePushProvisioningUseCase.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, nl = {106}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class InitiatePushProvisioningUseCase$handlePushProvisioningResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.coroutines.Continuation<com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.access$processDigitizationData(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.feature.starpay.api.WalletData) ((com.paypal.oslo.feature.starpay.api.Result.Success) this.getHighSpeedVideoFpsRanges).getData(), this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$handlePushProvisioningResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$handlePushProvisioningResult$1(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InitiatePushProvisioningUseCase$handlePushProvisioningResult$1(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus>> continuation, com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData> result, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$handlePushProvisioningResult$1> continuation2) {
        super(2, continuation2);
        this.getOutputMinFrameDuration = initiatePushProvisioningUseCase;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = continuation;
        this.getHighSpeedVideoFpsRanges = result;
        this.getHighSpeedVideoSizes = debitInstrument;
    }
}
