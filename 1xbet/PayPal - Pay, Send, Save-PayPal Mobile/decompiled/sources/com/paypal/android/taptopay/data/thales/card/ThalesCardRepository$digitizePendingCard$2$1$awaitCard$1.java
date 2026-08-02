package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1", f = "ThalesCardRepository.kt", i = {}, l = {255, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r1.send(r4, r10) != r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope;
        long j;
        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope2;
        com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed activationFailed;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = this.Camera2StreamConfigurationMap;
            try {
                com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.RESUMED;
                j = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = producerScope;
                this.getHighSpeedVideoFpsRanges = producerScope;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.getHighResolutionOutputSizeshNQ4ISI(thalesCardRepository, type, j, this, 2);
                if (obj != coroutine_suspended) {
                    producerScope2 = producerScope;
                }
            } catch (kotlinx.coroutines.TimeoutCancellationException e) {
                e = e;
                kotlinx.coroutines.TimeoutCancellationException timeoutCancellationException = e;
                com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Did not get a card state change for RESUMED", timeoutCancellationException);
                activationFailed = new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed("Did not get a card state change for RESUMED", timeoutCancellationException);
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoFpsRangesFor = 2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
        } catch (kotlinx.coroutines.TimeoutCancellationException e2) {
            e = e2;
            producerScope = producerScope2;
            kotlinx.coroutines.TimeoutCancellationException timeoutCancellationException2 = e;
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Did not get a card state change for RESUMED", timeoutCancellationException2);
            activationFailed = new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed("Did not get a card state change for RESUMED", timeoutCancellationException2);
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
        }
        activationFailed = new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(((com.paypal.android.taptopay.domain.model.card.CardStateChange) obj).getDigitizedCard());
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = thalesCardRepository;
    }
}
