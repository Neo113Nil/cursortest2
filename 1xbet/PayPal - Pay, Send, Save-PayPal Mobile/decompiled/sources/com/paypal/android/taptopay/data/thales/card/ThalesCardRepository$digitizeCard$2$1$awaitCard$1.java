package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$awaitCard$1", f = "ThalesCardRepository.kt", i = {3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 185, 183, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 192, 215}, m = "invokeSuspend", n = {"card"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class ThalesCardRepository$digitizeCard$2$1$awaitCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getInputFormats;

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard;
        int i;
        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope;
        java.lang.Object highResolutionOutputSizeshNQ4ISI2;
        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope2;
        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope3;
        long j;
        java.lang.Object highResolutionOutputSizeshNQ4ISI3;
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope4;
        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.Camera2StreamConfigurationMap) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Waiting for cardStateChange", null, null, 6, null);
                this.Camera2StreamConfigurationMap = 1;
                highResolutionOutputSizeshNQ4ISI = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED, 0L, this, 6);
                if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                digitizedCard = ((com.paypal.android.taptopay.domain.model.card.CardStateChange) highResolutionOutputSizeshNQ4ISI).getDigitizedCard();
                i = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$awaitCard$1.WhenMappings.$EnumSwitchMapping$0[digitizedCard.getStatus().ordinal()];
                if (i != 1) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling PendingActivation status", null, null, 6, null);
                    producerScope = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRangesFor = producerScope;
                    this.Camera2StreamConfigurationMap = 2;
                    highResolutionOutputSizeshNQ4ISI2 = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.RESUMED, 0L, this, 6);
                    if (highResolutionOutputSizeshNQ4ISI2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.Camera2StreamConfigurationMap = 3;
                    if (producerScope.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(((com.paypal.android.taptopay.domain.model.card.CardStateChange) highResolutionOutputSizeshNQ4ISI2).getDigitizedCard()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling Suspended status", null, null, 6, null);
                    producerScope2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getInputFormats;
                        com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.RESUMED;
                        j = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoFpsRangesFor = digitizedCard;
                        this.getHighSpeedVideoSizes = producerScope2;
                        this.getHighSpeedVideoFpsRanges = producerScope2;
                        this.Camera2StreamConfigurationMap = 4;
                        highResolutionOutputSizeshNQ4ISI3 = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.getHighResolutionOutputSizeshNQ4ISI(thalesCardRepository, type, j, this, 2);
                    } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
                        producerScope3 = producerScope2;
                        com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Emitting CardActivated state for a non-active card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard.getCardId()), kotlin.TuplesKt.to("status", digitizedCard.getStatus())), null, 4, null);
                        cardActivated = new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(digitizedCard);
                        producerScope2 = producerScope3;
                        this.getHighSpeedVideoFpsRangesFor = null;
                        this.getHighSpeedVideoSizes = null;
                        this.getHighSpeedVideoFpsRanges = null;
                        this.Camera2StreamConfigurationMap = 5;
                        if (producerScope2.send(cardActivated, this) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (highResolutionOutputSizeshNQ4ISI3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    digitizedCard2 = digitizedCard;
                    producerScope4 = producerScope2;
                    try {
                        cardActivated = new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(((com.paypal.android.taptopay.domain.model.card.CardStateChange) highResolutionOutputSizeshNQ4ISI3).getDigitizedCard());
                    } catch (kotlinx.coroutines.TimeoutCancellationException unused2) {
                        producerScope3 = producerScope4;
                        digitizedCard = digitizedCard2;
                        com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Emitting CardActivated state for a non-active card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard.getCardId()), kotlin.TuplesKt.to("status", digitizedCard.getStatus())), null, 4, null);
                        cardActivated = new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(digitizedCard);
                        producerScope2 = producerScope3;
                        this.getHighSpeedVideoFpsRangesFor = null;
                        this.getHighSpeedVideoSizes = null;
                        this.getHighSpeedVideoFpsRanges = null;
                        this.Camera2StreamConfigurationMap = 5;
                        if (producerScope2.send(cardActivated, this) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.Camera2StreamConfigurationMap = 5;
                    if (producerScope2.send(cardActivated, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling Activated status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", digitizedCard.getStatus())), null, 4, null);
                this.Camera2StreamConfigurationMap = 6;
                if (this.getHighResolutionOutputSizeshNQ4ISI.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(digitizedCard), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                highResolutionOutputSizeshNQ4ISI = obj;
                digitizedCard = ((com.paypal.android.taptopay.domain.model.card.CardStateChange) highResolutionOutputSizeshNQ4ISI).getDigitizedCard();
                i = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$awaitCard$1.WhenMappings.$EnumSwitchMapping$0[digitizedCard.getStatus().ordinal()];
                if (i != 1) {
                }
                break;
            case 2:
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                highResolutionOutputSizeshNQ4ISI2 = obj;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = 3;
                if (producerScope.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(((com.paypal.android.taptopay.domain.model.card.CardStateChange) highResolutionOutputSizeshNQ4ISI2).getDigitizedCard()), this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            case 3:
            case 5:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
                digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) this.getHighSpeedVideoFpsRangesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    digitizedCard2 = digitizedCard;
                    producerScope4 = producerScope3;
                    highResolutionOutputSizeshNQ4ISI3 = obj;
                    cardActivated = new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(((com.paypal.android.taptopay.domain.model.card.CardStateChange) highResolutionOutputSizeshNQ4ISI3).getDigitizedCard());
                } catch (kotlinx.coroutines.TimeoutCancellationException unused3) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Emitting CardActivated state for a non-active card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard.getCardId()), kotlin.TuplesKt.to("status", digitizedCard.getStatus())), null, 4, null);
                    cardActivated = new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(digitizedCard);
                    producerScope2 = producerScope3;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.Camera2StreamConfigurationMap = 5;
                    if (producerScope2.send(cardActivated, this) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap = 5;
                if (producerScope2.send(cardActivated, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$awaitCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.values().length];
            try {
                iArr[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Suspended.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$awaitCard$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$digitizeCard$2$1$awaitCard$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizeCard$2$1$awaitCard$1> continuation) {
        super(2, continuation);
        this.getInputFormats = thalesCardRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
    }
}
