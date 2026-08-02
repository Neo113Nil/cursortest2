package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/SetAsDefaultIfNeededUsecase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "setDefaultCardUseCase", "Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "getCardsUseCase", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;)V", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState$Success$CardActivated;", "state", "Lcom/paypal/android/taptopay/domain/model/card/SetAsDefault;", "setAsDefault", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;", "invoke", "(Lcom/paypal/android/taptopay/domain/model/card/AddCardState$Success$CardActivated;Lcom/paypal/android/taptopay/domain/model/card/SetAsDefault;)Lkotlinx/coroutines/flow/Flow;", "p0", "Lcom/paypal/android/taptopay/domain/Result;", "", "getHighSpeedVideoSizes", "(Lcom/paypal/android/taptopay/domain/model/card/SetAsDefault;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SetAsDefaultIfNeededUsecase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase Camera2StreamConfigurationMap;

    public SetAsDefaultIfNeededUsecase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllCardsUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = setDefaultCardUseCase;
        this.Camera2StreamConfigurationMap = getAllCardsUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        if (r2.send(r5, r3) != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        if (r2.send(r5, r3) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013f, code lost:
    
        if (r2.send(r6, r3) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (r0 != r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$setAsDefaultIfNeeded(com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase, kotlinx.coroutines.channels.ProducerScope producerScope, com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation continuation) {
        com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1 setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object obj;
        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated2;
        com.paypal.android.taptopay.domain.Result result;
        java.lang.Object invoke;
        com.paypal.android.taptopay.domain.Result result2;
        com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase2 = setAsDefaultIfNeededUsecase;
        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated3 = cardActivated;
        if (continuation instanceof com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1) {
            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1 = (com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1) continuation;
            if ((setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj2);
                        setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = setAsDefaultIfNeededUsecase2;
                        producerScope2 = producerScope;
                        setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = producerScope2;
                        setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor = cardActivated3;
                        setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = cardActivated3;
                        setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object highSpeedVideoSizes = setAsDefaultIfNeededUsecase2.getHighSpeedVideoSizes(setAsDefault, setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            obj = highSpeedVideoSizes;
                            cardActivated2 = cardActivated3;
                            result = (com.paypal.android.taptopay.domain.Result) obj;
                            if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
                                if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
                                    java.lang.Object error = ((com.paypal.android.taptopay.domain.Result.Failure) result).getError();
                                    setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = cardActivated3;
                                    setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = null;
                                    setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor = null;
                                    setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = null;
                                    setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 6;
                                    if (producerScope2.send(error, setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1) == coroutine_suspended) {
                                    }
                                }
                                return cardActivated3;
                            }
                            if (((java.lang.Boolean) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult()).booleanValue()) {
                                com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase = setAsDefaultIfNeededUsecase2.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String cardId = cardActivated2.getCard().getCardId();
                                setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = producerScope2;
                                setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = cardActivated3;
                                setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor = null;
                                setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap = null;
                                setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                                invoke = setDefaultCardUseCase.invoke(cardId, setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1);
                                break;
                            }
                            return cardActivated3;
                        }
                        return coroutine_suspended;
                    case 1:
                        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated4 = (com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.Camera2StreamConfigurationMap;
                        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated5 = (com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges;
                        com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase3 = (com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        cardActivated3 = cardActivated4;
                        setAsDefaultIfNeededUsecase2 = setAsDefaultIfNeededUsecase3;
                        obj = obj2;
                        producerScope2 = producerScope3;
                        cardActivated2 = cardActivated5;
                        result = (com.paypal.android.taptopay.domain.Result) obj;
                        if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
                        }
                        break;
                    case 2:
                        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated6 = (com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges;
                        kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        cardActivated3 = cardActivated6;
                        invoke = obj2;
                        producerScope2 = producerScope4;
                        result2 = (com.paypal.android.taptopay.domain.Result) invoke;
                        if (result2 instanceof com.paypal.android.taptopay.domain.Result.Success) {
                            return new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated(com.paypal.android.taptopay.domain.model.card.DigitizedCard.copy$default(cardActivated3.getCard(), null, null, null, null, true, null, null, 111, null));
                        }
                        if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                            return cardActivated3;
                        }
                        com.paypal.android.taptopay.domain.model.card.SetDefaultCardError setDefaultCardError = (com.paypal.android.taptopay.domain.model.card.SetDefaultCardError) ((com.paypal.android.taptopay.domain.Result.Failure) result2).getError();
                        if (setDefaultCardError instanceof com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.InitCheckFailed) {
                            com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed = new com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed("Data layer not initialized", null, 2, null);
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = cardActivated3;
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = result2;
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                            break;
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(setDefaultCardError, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.CardNotFound.INSTANCE)) {
                            com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed2 = new com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed("Card not found", null, 2, null);
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = cardActivated3;
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = result2;
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 4;
                            break;
                        } else {
                            if (!(setDefaultCardError instanceof com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.DefaultError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.DefaultError) setDefaultCardError;
                            com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed3 = new com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed(defaultError.getDebugMessage(), defaultError.getThrowable());
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes = cardActivated3;
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges = result2;
                            setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = 5;
                            break;
                        }
                        return cardActivated3;
                    case 3:
                    case 4:
                    case 5:
                        result2 = (com.paypal.android.taptopay.domain.Result) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoFpsRanges;
                        cardActivated3 = (com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "SetAsDefaultIfNeeded use case failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.android.taptopay.domain.Result.Failure) result2).getError().getClass().getSimpleName())), null, 4, null);
                        return cardActivated3;
                    case 6:
                        com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated7 = (com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated) setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return cardActivated7;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1 = new com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1(setAsDefaultIfNeededUsecase2, continuation);
        java.lang.Object obj22 = setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (setAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI) {
        }
    }

    public /* synthetic */ SetAsDefaultIfNeededUsecase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase(cardRepository) : setDefaultCardUseCase, (i & 4) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase(cardRepository, null, 2, null) : getAllCardsUseCase);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase, com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            setAsDefault = com.paypal.android.taptopay.domain.model.card.SetAsDefault.NO;
        }
        return setAsDefaultIfNeededUsecase.invoke(cardActivated, setAsDefault);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> invoke(com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated state, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefault, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$invoke$1(state, setAsDefault, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.AddCardState>> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1 setAsDefaultIfNeededUsecase$shouldSetAsDefault$1;
        int i;
        com.paypal.android.taptopay.domain.Result result;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1) {
            setAsDefaultIfNeededUsecase$shouldSetAsDefault$1 = (com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1) continuation;
            if ((setAsDefaultIfNeededUsecase$shouldSetAsDefault$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                setAsDefaultIfNeededUsecase$shouldSetAsDefault$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1 setAsDefaultIfNeededUsecase$shouldSetAsDefault$12 = setAsDefaultIfNeededUsecase$shouldSetAsDefault$1;
                java.lang.Object obj2 = setAsDefaultIfNeededUsecase$shouldSetAsDefault$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setAsDefaultIfNeededUsecase$shouldSetAsDefault$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    int i2 = com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase.WhenMappings.$EnumSwitchMapping$0[setAsDefault.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new com.paypal.android.taptopay.domain.Result.Success(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                        }
                        if (i2 == 3) {
                            return new com.paypal.android.taptopay.domain.Result.Success(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase = this.Camera2StreamConfigurationMap;
                    setAsDefaultIfNeededUsecase$shouldSetAsDefault$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj2 = com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase.invoke$default(getAllCardsUseCase, false, false, setAsDefaultIfNeededUsecase$shouldSetAsDefault$12, 3, null);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                result = (com.paypal.android.taptopay.domain.Result) obj2;
                if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
                    if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.taptopay.domain.Result.Failure failure = (com.paypal.android.taptopay.domain.Result.Failure) result;
                    if (!(((com.paypal.android.taptopay.domain.model.card.GetAllCardsError) failure.getError()) instanceof com.paypal.android.taptopay.domain.model.card.GetAllCardsError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.taptopay.domain.model.card.GetAllCardsError.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.card.GetAllCardsError.DefaultError) failure.getError();
                    return new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.AddCardState.GetCardsFailed(defaultError.getDebugMessage(), defaultError.getThrowable()));
                }
                java.util.Iterator it = ((java.lang.Iterable) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.paypal.android.taptopay.domain.model.card.DigitizedCard) obj).isDefault()) {
                        break;
                    }
                }
                return new com.paypal.android.taptopay.domain.Result.Success(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(obj == null));
            }
        }
        setAsDefaultIfNeededUsecase$shouldSetAsDefault$1 = new com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1(this, continuation);
        com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1 setAsDefaultIfNeededUsecase$shouldSetAsDefault$122 = setAsDefaultIfNeededUsecase$shouldSetAsDefault$1;
        java.lang.Object obj22 = setAsDefaultIfNeededUsecase$shouldSetAsDefault$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setAsDefaultIfNeededUsecase$shouldSetAsDefault$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        result = (com.paypal.android.taptopay.domain.Result) obj22;
        if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.android.taptopay.domain.model.card.SetAsDefault.values().length];
            try {
                iArr[com.paypal.android.taptopay.domain.model.card.SetAsDefault.IF_FIRST_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.android.taptopay.domain.model.card.SetAsDefault.YES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.android.taptopay.domain.model.card.SetAsDefault.NO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
