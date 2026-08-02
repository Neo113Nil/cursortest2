package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1", f = "PayairCardRepository.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {"$this$channelFlow"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayairCardRepository$addCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ byte[] getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler tokenizationTimerStateHandler;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.addCard called", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardScheme", this.Camera2StreamConfigurationMap)), null, 4, null);
            this.getHighSpeedVideoSizesFor = producerScope;
            this.getHighSpeedVideoSizes = 1;
            if (producerScope.send(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.AddCardInitiated.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        tokenizationTimerStateHandler = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
        tokenizationTimerStateHandler.startTimer(this.Camera2StreamConfigurationMap);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, producerScope, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1$1", f = "PayairCardRepository.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, nl = {183}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ byte[] getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                cardTokenization = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
                byte[] bArr = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme = this.getHighSpeedVideoFpsRangesFor;
                if (cardScheme == null) {
                    cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.MASTERCARD;
                }
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke = cardTokenization.invoke(bArr, cardScheme, this.getHighResolutionOutputSizeshNQ4ISI);
                final com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository = this.getOutputFormats;
                final kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope = this.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = 1;
                if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository.addCard.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler tokenizationTimerStateHandler;
                        com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj2;
                        tokenizationTimerStateHandler = com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository.this.getOutputFormats;
                        tokenizationTimerStateHandler.onStateChange(addCardState);
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
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1.AnonymousClass1(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String str, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputFormats = payairCardRepository;
            this.getHighSpeedVideoSizes = bArr;
            this.getHighSpeedVideoFpsRangesFor = cardScheme;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1 payairCardRepository$addCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        payairCardRepository$addCard$1.getHighSpeedVideoSizesFor = obj;
        return payairCardRepository$addCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairCardRepository$addCard$1(com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, byte[] bArr, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cardScheme;
        this.getHighResolutionOutputSizeshNQ4ISI = payairCardRepository;
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
