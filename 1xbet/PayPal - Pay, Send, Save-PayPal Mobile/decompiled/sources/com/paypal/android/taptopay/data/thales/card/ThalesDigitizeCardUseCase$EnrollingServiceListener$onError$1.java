package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1", f = "ThalesDigitizeCardUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.EnrollingServiceListener Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.SendChannel sendChannel;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sendChannel = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.lang.Object mo9266trySendJP2dKIU = sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error("onError ".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes.getErrorMessage())), null, 2, null));
            if (mo9266trySendJP2dKIU instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
                com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Provisioning service error failed to send ThalesDigitizeCardState.Error", null, null, kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(mo9266trySendJP2dKIU), 6, null);
            }
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(sendChannel, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = enrollingServiceListener;
        this.getHighSpeedVideoSizes = provisioningServiceError;
    }
}
