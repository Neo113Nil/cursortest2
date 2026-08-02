package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$invoke$1", f = "SetAsDefaultIfNeededUseCase.kt", i = {0, 1, 2, 3}, l = {60, 60, 62, 63}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "$this$channelFlow"}, nl = {60, 62, 63, 65}, s = {"L$0", "L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class SetAsDefaultIfNeededUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00df, code lost:
    
        if (r0.send(r13.getHighSpeedVideoFpsRanges, r13) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (r2.send(r14, r13) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r0.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped("Card not active; status = ".concat(java.lang.String.valueOf(r13.getHighSpeedVideoFpsRanges.getCard().getStatus()))), r13) != r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running SetAsDefaultIfNeeded use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoFpsRanges.getCard().getCardId()), kotlin.TuplesKt.to("setAsDefault", this.getHighSpeedVideoSizes.getClass().getSimpleName())), null, 4, null);
            if (this.getHighSpeedVideoFpsRanges.getCard().getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active) {
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                this.getHighResolutionOutputSizeshNQ4ISI = producerScope2;
                this.Camera2StreamConfigurationMap = 1;
                obj = com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase.access$setAsDefaultIfNeeded(this.getHighSpeedVideoFpsRangesFor, producerScope2, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
                if (obj != coroutine_suspended) {
                    producerScope = producerScope2;
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.Camera2StreamConfigurationMap = 2;
                }
            } else {
                this.getOutputMinFrameDuration = producerScope2;
                this.Camera2StreamConfigurationMap = 3;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.Camera2StreamConfigurationMap = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                    this.Camera2StreamConfigurationMap = 4;
                } else if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$invoke$1 setAsDefaultIfNeededUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$invoke$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        setAsDefaultIfNeededUseCase$invoke$1.getOutputMinFrameDuration = obj;
        return setAsDefaultIfNeededUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultIfNeededUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cardActivated;
        this.getHighSpeedVideoSizes = setAsDefault;
        this.getHighSpeedVideoFpsRangesFor = setAsDefaultIfNeededUseCase;
    }
}
