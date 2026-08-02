package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1", f = "MockCardRepository.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {"$this$channelFlow", "cardId"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class MockCardRepository$continueAddCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String obj2 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            coroutineScope = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, obj2, producerScope, null), 3, null);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.Camera2StreamConfigurationMap = 1;
            if (launch$default.join(this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1$1", f = "MockCardRepository.kt", i = {1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {"card", "card"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, s = {"L$0", "L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
        
            if (r14.getHighSpeedVideoFpsRanges.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated(r1), r14) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        
            if (r15 != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r15 != r0) goto L14;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
            java.lang.Object highSpeedVideoSizes;
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository.access$digitizeCard(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this);
            } else if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                mutableSharedFlow = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED));
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                this.getHighSpeedVideoFpsRangesFor = 3;
            }
            com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.DigitizedMockCard digitizedMockCard = (com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.DigitizedMockCard) obj;
            digitizedCard = new com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard(this.Camera2StreamConfigurationMap, digitizedMockCard.getLast4(), digitizedMockCard.getLast4dpan(), digitizedMockCard.getExpiry(), digitizedMockCard.isDefault(), digitizedMockCard.getStatus(), (byte[]) null, 64, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.getHighResolutionOutputSizeshNQ4ISI = digitizedCard;
            this.getHighSpeedVideoFpsRangesFor = 2;
            highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository mockCardRepository, java.lang.String str, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = mockCardRepository;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1 mockCardRepository$continueAddCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        mockCardRepository$continueAddCard$1.getHighSpeedVideoSizes = obj;
        return mockCardRepository$continueAddCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardRepository$continueAddCard$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository mockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$continueAddCard$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockCardRepository;
    }
}
