package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1", f = "PayPalAddCardUseCase.kt", i = {0, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5}, l = {83, 88, 136, 96, 125, 140}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "digitizedCardId", "$this$channelFlow", "digitizedCardId", "this_$iv", "payPalDigitizedCard", "$i$f$fold", "$i$a$-fold-PayPalAddCardUseCase$invoke$1$2", "$this$channelFlow", "digitizedCardId", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-PayPalAddCardUseCase$invoke$1$1", "$this$channelFlow", "digitizedCardId", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-PayPalAddCardUseCase$invoke$1$1", "$this$channelFlow", "digitizedCardId"}, nl = {82, 256, 137, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 90, 151}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalAddCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object isOutputSupportedFor;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e2, code lost:
    
        if (r1.send(r3, r23) == r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01dd, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x015e, code lost:
    
        if (r5.collect(r2, r23) == r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019a, code lost:
    
        if (r1.send(r4, r23) == r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r3 == r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005c, code lost:
    
        if (r2 != r13) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase;
        java.lang.Object invoke$default;
        java.lang.Object obj2;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase continueAddCardUseCase;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.isOutputSupportedFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getOutputSizes) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                payPalGetCardIdGroupUseCase = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes;
                this.isOutputSupportedFor = producerScope;
                this.getOutputSizes = 1;
                invoke = payPalGetCardIdGroupUseCase.invoke(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(this.getInputFormats), this);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                invoke = obj;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) invoke;
                digitizedCardId = cardIdGroup != null ? cardIdGroup.getDigitizedCardId() : null;
                if (digitizedCardId != null) {
                    payPalGetCardUseCase = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges;
                    this.isOutputSupportedFor = producerScope;
                    this.getOutputStallDuration = digitizedCardId;
                    this.getOutputSizes = 2;
                    invoke$default = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase.invoke$default(payPalGetCardUseCase, digitizedCardId, false, this, 2, null);
                    break;
                } else {
                    this.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCardId);
                    this.getOutputSizes = 6;
                    if (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase.access$addCard(this.getOutputMinFrameDurationlomOqCM, producerScope, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            case 2:
                digitizedCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId) this.getOutputStallDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                invoke$default = obj;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId2 = digitizedCardId;
                arrow.core.Either either = (arrow.core.Either) invoke$default;
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase = this.getOutputMinFrameDurationlomOqCM;
                com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault = this.getOutputFormats;
                java.lang.String str = this.getInputFormats;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                java.lang.String str3 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint = this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = this.Camera2StreamConfigurationMap;
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card is already tokenized", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated cardActivated = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated(payPalDigitizedCard.getDigitizedCard());
                    this.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCardId2);
                    this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalDigitizedCard);
                    this.getOutputMinFrameDuration = 0;
                    this.getInputSizeshNQ4ISI = 0;
                    this.getOutputSizes = 3;
                    break;
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError payPalGetCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError) ((arrow.core.Either.Left) either).getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(payPalGetCardError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.CardNotFound.INSTANCE)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card not found during PayPal card retrieval", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitized_card_id", digitizedCardId2.getId())), null, 4, null);
                        continueAddCardUseCase = payPalAddCardUseCase.getHighSpeedVideoSizesFor;
                        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke2 = continueAddCardUseCase.invoke(digitizedCardId2.getId(), setAsDefault);
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1 payPalAddCardUseCase$invoke$1$1$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1(payPalAddCardUseCase, str, producerScope, cardType, str2, str3, flowEntryPoint, setAsDefault, cardArtCollection, cardInfo);
                        this.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                        this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCardId2);
                        this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalGetCardError);
                        this.getOutputMinFrameDuration = 0;
                        this.getInputSizeshNQ4ISI = 0;
                        this.getOutputSizes = 4;
                        obj2 = coroutine_suspended;
                        break;
                    } else {
                        obj2 = coroutine_suspended;
                        if (!(payPalGetCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.DefaultError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError("-1", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.DefaultError) payPalGetCardError).getDebugMessage());
                        this.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                        this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCardId2);
                        this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalGetCardError);
                        this.getOutputMinFrameDuration = 0;
                        this.getInputSizeshNQ4ISI = 0;
                        this.getOutputSizes = 5;
                        break;
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1 payPalAddCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1(this.getOutputMinFrameDurationlomOqCM, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        payPalAddCardUseCase$invoke$1.isOutputSupportedFor = obj;
        return payPalAddCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalAddCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = payPalAddCardUseCase;
        this.getInputFormats = str;
        this.getHighResolutionOutputSizeshNQ4ISI = cardType;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighSpeedVideoSizesFor = flowEntryPoint;
        this.getOutputFormats = setAsDefault;
        this.getHighSpeedVideoFpsRangesFor = cardArtCollection;
        this.Camera2StreamConfigurationMap = cardInfo;
    }
}
