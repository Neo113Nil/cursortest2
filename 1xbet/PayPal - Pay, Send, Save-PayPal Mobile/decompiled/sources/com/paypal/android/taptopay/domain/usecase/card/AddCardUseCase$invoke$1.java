package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1", f = "AddCardUseCase.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class AddCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.domain.model.CardScheme Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.domain.model.card.SetAsDefault getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running add card use case", null, null, 6, null);
            cardRepository = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> addCard = cardRepository.addCard(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
            final com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase = this.getHighSpeedVideoSizesFor;
            final com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (addCard.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(com.paypal.android.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository2;
                    com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase;
                    com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase;
                    if (addCardState instanceof com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) {
                        cardRepository2 = com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase.this.getHighSpeedVideoFpsRanges;
                        setDefaultCardUseCase = com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase.this.getHighSpeedVideoSizes;
                        getAllCardsUseCase = com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase.this.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> invoke = new com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase(cardRepository2, setDefaultCardUseCase, getAllCardsUseCase).invoke((com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) addCardState, setAsDefault);
                        final kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope2 = producerScope;
                        java.lang.Object collect = invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase.invoke.1.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
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
        return ((com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1 addCardUseCase$invoke$1 = new com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        addCardUseCase$invoke$1.getOutputMinFrameDuration = obj;
        return addCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardUseCase$invoke$1(com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase, byte[] bArr, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String str, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = addCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.Camera2StreamConfigurationMap = cardScheme;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = setAsDefault;
    }
}
