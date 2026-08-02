package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase$invoke$1", f = "AddCardUseCase.kt", i = {0}, l = {52}, m = "invokeSuspend", n = {"$this$channelFlow"}, nl = {66}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AddCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault Camera2StreamConfigurationMap;
    final /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running add card use case", null, null, 6, null);
            cardRepository = this.getInputFormats.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> addCard = cardRepository.addCard(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
            final com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase = this.getInputFormats;
            final com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault = this.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoFpsRanges = 1;
            if (addCard.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase$invoke$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository2;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase;
                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj2;
                    if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) {
                        cardRepository2 = com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase.this.Camera2StreamConfigurationMap;
                        setDefaultCardUseCase = com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase.this.getHighSpeedVideoSizes;
                        getAllCardsUseCase = com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase.this.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke = new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase(cardRepository2, setDefaultCardUseCase, getAllCardsUseCase).invoke((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) addCardState, setAsDefault);
                        final kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope2 = producerScope;
                        java.lang.Object collect = invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase.invoke.1.1.1
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
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase$invoke$1 addCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase$invoke$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        addCardUseCase$invoke$1.getInputSizeshNQ4ISI = obj;
        return addCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getInputFormats = addCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = cardScheme;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = setAsDefault;
    }
}
