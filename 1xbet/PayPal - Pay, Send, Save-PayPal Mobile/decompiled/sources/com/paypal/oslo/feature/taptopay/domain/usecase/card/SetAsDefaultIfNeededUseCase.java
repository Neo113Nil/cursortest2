package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetAsDefaultIfNeededUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "setDefaultCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;", "getCardsUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetDefaultCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$CardActivated;", "state", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;", "setAsDefault", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$CardActivated;Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;)Lkotlinx/coroutines/flow/Flow;", "p0", "Larrow/core/Either;", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetAsDefaultIfNeededUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase getHighSpeedVideoFpsRanges;

    public SetAsDefaultIfNeededUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllCardsUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
        this.getHighSpeedVideoFpsRanges = setDefaultCardUseCase;
        this.Camera2StreamConfigurationMap = getAllCardsUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b0, code lost:
    
        if (r12.send(r14, r3) != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0247, code lost:
    
        r1 = r0;
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01f7, code lost:
    
        if (r12.send(r7, r3) == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0243, code lost:
    
        if (r12.send(r7, r3) == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        if (r9 != r4) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState$Success$CardActivated] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$setAsDefaultIfNeeded(com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase, kotlinx.coroutines.channels.ProducerScope producerScope, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1 setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault2;
        java.lang.Object highSpeedVideoFpsRanges;
        com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        boolean booleanValue;
        com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated3;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        int i;
        int i2;
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault3;
        arrow.core.Either either;
        arrow.core.Either either2;
        T t = cardActivated;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1) {
            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1) continuation;
            if ((setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef.element = t;
                        producerScope2 = producerScope;
                        setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = producerScope2;
                        setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI = t;
                        setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault);
                        setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats = objectRef;
                        setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI = 1;
                        setAsDefault2 = setAsDefault;
                        highSpeedVideoFpsRanges = setAsDefaultIfNeededUseCase.getHighSpeedVideoFpsRanges(setAsDefault2, setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1);
                        cardActivated2 = t;
                        break;
                    case 1:
                        kotlin.jvm.internal.Ref.ObjectRef objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats;
                        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault4 = (com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats;
                        com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated4 = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI;
                        kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        objectRef = objectRef3;
                        cardActivated2 = cardActivated4;
                        setAsDefault2 = setAsDefault4;
                        producerScope2 = producerScope4;
                        highSpeedVideoFpsRanges = obj;
                        arrow.core.Either either3 = (arrow.core.Either) highSpeedVideoFpsRanges;
                        if (either3 instanceof arrow.core.Either.Right) {
                            booleanValue = ((java.lang.Boolean) ((arrow.core.Either.Right) either3).getValue()).booleanValue();
                            if (booleanValue) {
                                com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase = setAsDefaultIfNeededUseCase.getHighSpeedVideoFpsRanges;
                                java.lang.String cardId = cardActivated2.getCard().getCardId();
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = producerScope2;
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardActivated2);
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault2);
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats = objectRef;
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = 0;
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizes = booleanValue;
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = 0;
                                setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI = 2;
                                java.lang.Object invoke = setDefaultCardUseCase.invoke(cardId, setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1);
                                if (invoke != coroutine_suspended) {
                                    cardActivated3 = cardActivated2;
                                    producerScope3 = producerScope2;
                                    i = 0;
                                    i2 = 0;
                                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = objectRef;
                                    obj = invoke;
                                    objectRef2 = objectRef4;
                                    setAsDefault3 = setAsDefault2;
                                    either = either3;
                                    either2 = (arrow.core.Either) obj;
                                    if (!(either2 instanceof arrow.core.Either.Right)) {
                                        objectRef2.element = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.copy$default(((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) objectRef2.element).getCard(), null, null, null, null, true, null, null, 111, null));
                                        objectRef = objectRef2;
                                    } else if (either2 instanceof arrow.core.Either.Left) {
                                        com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError setDefaultCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError) ((arrow.core.Either.Left) either2).getValue();
                                        if (setDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.InitCheckFailed) {
                                            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed("Data layer not initialized", null, 2, null);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardActivated3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats = objectRef2;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDurationlomOqCM = setDefaultCardError;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = i2;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizes = booleanValue;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = i;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor = 0;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI = 3;
                                            break;
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(setDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.CardNotFound.INSTANCE)) {
                                            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed2 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed("Card not found", null, 2, null);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardActivated3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats = objectRef2;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDurationlomOqCM = setDefaultCardError;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = i2;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizes = booleanValue;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = i;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor = 0;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI = 4;
                                            break;
                                        } else {
                                            if (!(setDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.DefaultError)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.DefaultError) setDefaultCardError;
                                            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed3 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed(defaultError.getDebugMessage(), defaultError.getThrowable());
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardActivated3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault3);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats = objectRef2;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDurationlomOqCM = setDefaultCardError;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = i2;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizes = booleanValue;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = i;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor = 0;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI = 5;
                                            break;
                                        }
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultIfNeeded use case failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", r0.getClass().getSimpleName())), null, 4, null);
                                        objectRef2 = r1;
                                        objectRef = objectRef2;
                                    } else {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                }
                            }
                            return objectRef.element;
                        }
                        if (either3 instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) ((arrow.core.Either.Left) either3).getValue();
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardActivated2);
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault2);
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats = objectRef;
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardState);
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = 0;
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = 0;
                            setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI = 6;
                            if (producerScope2.send(addCardState, setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1) != coroutine_suspended) {
                                objectRef2 = objectRef;
                                objectRef = objectRef2;
                                return objectRef.element;
                            }
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return coroutine_suspended;
                    case 2:
                        int i3 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap;
                        boolean z = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizes;
                        i2 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges;
                        either = (arrow.core.Either) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDuration;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats;
                        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault5 = (com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputFormats;
                        cardActivated3 = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputSizeshNQ4ISI;
                        producerScope3 = (kotlinx.coroutines.channels.ProducerScope) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i = i3;
                        objectRef2 = objectRef5;
                        setAsDefault3 = setAsDefault5;
                        booleanValue = z;
                        either2 = (arrow.core.Either) obj;
                        if (!(either2 instanceof arrow.core.Either.Right)) {
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                        int i4 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor;
                        int i6 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap;
                        boolean z2 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizes;
                        int i7 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError setDefaultCardError2 = (com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputMinFrameDurationlomOqCM;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultIfNeeded use case failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", setDefaultCardError2.getClass().getSimpleName())), null, 4, null);
                        objectRef2 = objectRef6;
                        objectRef = objectRef2;
                        return objectRef.element;
                    case 6:
                        int i8 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap;
                        int i9 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        objectRef = objectRef2;
                        return objectRef.element;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1(setAsDefaultIfNeededUseCase, continuation);
        java.lang.Object obj2 = setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (setAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1.getOutputSizeshNQ4ISI) {
        }
    }

    public /* synthetic */ SetAsDefaultIfNeededUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase(cardRepository) : setDefaultCardUseCase, (i & 4) != 0 ? new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase(cardRepository, null, 2, null) : getAllCardsUseCase);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            setAsDefault = com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.NO;
        }
        return setAsDefaultIfNeededUseCase.invoke(cardActivated, setAsDefault);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated state, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefault, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$invoke$1(state, setAsDefault, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[Catch: all -> 0x0044, RaiseCancellationException -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0047, all -> 0x0044, blocks: (B:11:0x0040, B:12:0x00a2, B:15:0x00a8, B:18:0x00b4, B:19:0x00e6, B:22:0x00f2, B:25:0x0115, B:28:0x00fc, B:29:0x0100, B:31:0x0106, B:38:0x00ce, B:39:0x00d3, B:42:0x00d8, B:43:0x0124, B:44:0x0129), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[Catch: all -> 0x0044, RaiseCancellationException -> 0x0047, TryCatch #4 {RaiseCancellationException -> 0x0047, all -> 0x0044, blocks: (B:11:0x0040, B:12:0x00a2, B:15:0x00a8, B:18:0x00b4, B:19:0x00e6, B:22:0x00f2, B:25:0x0115, B:28:0x00fc, B:29:0x0100, B:31:0x0106, B:38:0x00ce, B:39:0x00d3, B:42:0x00d8, B:43:0x0124, B:44:0x0129), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1 setAsDefaultIfNeededUseCase$shouldSetAsDefault$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        java.util.List list;
        java.util.Iterator it;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1) {
            setAsDefaultIfNeededUseCase$shouldSetAsDefault$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1) continuation;
            if ((setAsDefaultIfNeededUseCase$shouldSetAsDefault$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                setAsDefaultIfNeededUseCase$shouldSetAsDefault$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1 setAsDefaultIfNeededUseCase$shouldSetAsDefault$12 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$1;
                java.lang.Object obj = setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getInputSizeshNQ4ISI;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        int i2 = com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase.WhenMappings.$EnumSwitchMapping$0[setAsDefault.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                defaultRaise2 = defaultRaise;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                                defaultRaise2.complete();
                                return new arrow.core.Either.Right(boxBoolean);
                            }
                            if (i2 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            defaultRaise2 = defaultRaise;
                            z = false;
                            java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(boxBoolean2);
                        }
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase = this.Camera2StreamConfigurationMap;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault);
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getOutputMinFrameDuration = defaultRaise;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoSizesFor = defaultRaise3;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoSizes = 0;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoFpsRanges = 0;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.Camera2StreamConfigurationMap = 0;
                        setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getInputSizeshNQ4ISI = 1;
                        java.lang.Object invoke$default = com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase.invoke$default(getAllCardsUseCase, false, false, setAsDefaultIfNeededUseCase$shouldSetAsDefault$12, 3, null);
                        if (invoke$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = invoke$default;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.Camera2StreamConfigurationMap;
                    int i4 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoFpsRanges;
                    int i5 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoSizes;
                    int i6 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighResolutionOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) setAsDefaultIfNeededUseCase$shouldSetAsDefault$12.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError getAllCardsError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError) ((arrow.core.Either.Left) either).getValue();
                    if (!(getAllCardsError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed(((com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError) getAllCardsError).getDebugMessage(), ((com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError) getAllCardsError).getThrowable()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                list = (java.util.List) raise.bind(right);
                if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) it.next()).isDefault()) {
                            defaultRaise = defaultRaise2;
                            defaultRaise2 = defaultRaise;
                            z = false;
                            break;
                        }
                    }
                }
                java.lang.Boolean boxBoolean22 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(boxBoolean22);
            }
        }
        setAsDefaultIfNeededUseCase$shouldSetAsDefault$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1(this, continuation);
        com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1 setAsDefaultIfNeededUseCase$shouldSetAsDefault$122 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$1;
        java.lang.Object obj2 = setAsDefaultIfNeededUseCase$shouldSetAsDefault$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setAsDefaultIfNeededUseCase$shouldSetAsDefault$122.getInputSizeshNQ4ISI;
        boolean z2 = true;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        list = (java.util.List) raise.bind(right);
        if (list instanceof java.util.Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        java.lang.Boolean boxBoolean222 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(boxBoolean222);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.IF_FIRST_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.YES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.NO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
