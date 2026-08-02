package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1", f = "ActivateCardUseCase.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$channelFlow"}, nl = {67}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ActivateCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running activate card use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("setAsDefault", this.getHighSpeedVideoFpsRanges.getClass().getSimpleName())), null, 4, null);
            cardRepository = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> activateCard = cardRepository.activateCard(this.Camera2StreamConfigurationMap);
            final com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase activateCardUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (activateCard.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository2;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase;
                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj2;
                    cardRepository2 = com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase.this.getHighSpeedVideoSizes;
                    setDefaultCardUseCase = com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase.this.getHighSpeedVideoFpsRangesFor;
                    getAllCardsUseCase = com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase.this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase = new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase(cardRepository2, setDefaultCardUseCase, getAllCardsUseCase);
                    if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) {
                        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke = setAsDefaultIfNeededUseCase.invoke((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) addCardState, setAsDefault);
                        final kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope2 = producerScope;
                        java.lang.Object collect = invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase.invoke.1.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj3, kotlin.coroutines.Continuation continuation2) {
                                java.lang.Object send = producerScope2.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj3, continuation2);
                                return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                            }
                        }, continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                    java.lang.Object send = producerScope.send(addCardState, continuation);
                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1 activateCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        activateCardUseCase$invoke$1.getHighSpeedVideoSizes = obj;
        return activateCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivateCardUseCase$invoke$1(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase activateCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = setAsDefault;
        this.getHighResolutionOutputSizeshNQ4ISI = activateCardUseCase;
    }
}
