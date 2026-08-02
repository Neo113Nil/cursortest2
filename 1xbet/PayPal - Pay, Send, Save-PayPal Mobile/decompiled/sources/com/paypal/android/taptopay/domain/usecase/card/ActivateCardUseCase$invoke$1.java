package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1", f = "ActivateCardUseCase.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ActivateCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.domain.model.card.SetAsDefault getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running activate card use case", null, null, 6, null);
            cardRepository = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> activateCard = cardRepository.activateCard(this.getHighSpeedVideoFpsRangesFor);
            final com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase activateCardUseCase = this.Camera2StreamConfigurationMap;
            final com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (activateCard.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(com.paypal.android.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository2;
                    com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase;
                    com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase;
                    cardRepository2 = com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase.this.Camera2StreamConfigurationMap;
                    setDefaultCardUseCase = com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase.this.getHighSpeedVideoFpsRanges;
                    getAllCardsUseCase = com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase.this.getHighSpeedVideoSizes;
                    com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase = new com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase(cardRepository2, setDefaultCardUseCase, getAllCardsUseCase);
                    if (addCardState instanceof com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) {
                        kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> invoke = setAsDefaultIfNeededUsecase.invoke((com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) addCardState, setAsDefault);
                        final kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope2 = producerScope;
                        java.lang.Object collect = invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase.invoke.1.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                            public final java.lang.Object emit(com.paypal.android.taptopay.domain.model.card.AddCardState addCardState2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                                java.lang.Object send = producerScope2.send(addCardState2, continuation2);
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1 activateCardUseCase$invoke$1 = new com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        activateCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = obj;
        return activateCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivateCardUseCase$invoke$1(com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase activateCardUseCase, java.lang.String str, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = activateCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = setAsDefault;
    }
}
