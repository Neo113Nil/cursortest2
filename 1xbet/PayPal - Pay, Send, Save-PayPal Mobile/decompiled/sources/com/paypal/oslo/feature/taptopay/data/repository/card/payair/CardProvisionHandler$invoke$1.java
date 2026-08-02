package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$invoke$1", f = "CardProvisionHandler.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {51, 55, 61, 70}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "change", "$this$channelFlow", "change", "$this$channelFlow", "e"}, nl = {53, 57, 65, 72}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class CardProvisionHandler$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        if (r2.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed(r14.toString(), null, 2, null), r18) == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r0 != r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0156, code lost:
    
        if (r2.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed("Timeout while waiting for provisioning", null, 2, null), r18) != r3) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object first;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
        } catch (kotlinx.coroutines.TimeoutCancellationException e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Timeout while waiting for card provisioning", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", this.getHighSpeedVideoSizes), kotlin.TuplesKt.to("exception", e.getMessage())), null, 4, null);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
            this.Camera2StreamConfigurationMap = 4;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running CardProvisionHandler", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", this.getHighSpeedVideoSizes)), null, 4, null);
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type type = com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED;
            long j = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizesFor = producerScope;
            this.Camera2StreamConfigurationMap = 1;
            first = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.m24100timeoutHG0u8IE(cardProvisionHandler.getHighSpeedVideoFpsRanges.getCardStateChange(), j), new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$awaitCardStateChange$2(type, null), this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            first = obj;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange cardStateChange = (com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange) first;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cardStateChange.getDigitizedCard().getCardId(), this.getHighSpeedVideoSizes)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card provisioned successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", this.getHighSpeedVideoSizes)), null, 4, null);
            this.getHighSpeedVideoSizesFor = producerScope;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardStateChange);
            this.Camera2StreamConfigurationMap = 2;
            if (producerScope.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated(cardStateChange.getDigitizedCard()), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card provisioned with different ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expectedCardId", this.getHighSpeedVideoSizes), kotlin.TuplesKt.to("actualCardId", cardStateChange.getDigitizedCard().getCardId())), null, 4, null);
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.String cardId = cardStateChange.getDigitizedCard().getCardId();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected: ");
        sb.append(str);
        sb.append(", but got: ");
        sb.append(cardId);
        this.getHighSpeedVideoSizesFor = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardStateChange);
        this.Camera2StreamConfigurationMap = 3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$invoke$1 cardProvisionHandler$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$invoke$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        cardProvisionHandler$invoke$1.getHighSpeedVideoSizesFor = obj;
        return cardProvisionHandler$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardProvisionHandler$invoke$1(java.lang.String str, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, long j, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = cardProvisionHandler;
        this.getHighSpeedVideoFpsRangesFor = j;
    }
}
