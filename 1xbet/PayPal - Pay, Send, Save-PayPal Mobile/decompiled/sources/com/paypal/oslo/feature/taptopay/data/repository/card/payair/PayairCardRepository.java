package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014H\u0096@¢\u0006\u0004\b \u0010!J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b$\u0010\u001eJ$\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b&\u0010\u001eJ$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b)\u0010\u001eJ\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160*H\u0016¢\u0006\u0004\b.\u0010-J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b1\u0010\u001eJ/\u00107\u001a\b\u0012\u0004\u0012\u0002060*2\u0006\u00102\u001a\u00020(2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002060*2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u0010:J$\u0010>\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0\u00142\u0006\u0010;\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b>\u0010\u001eJ*\u0010@\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00160\u00142\u0006\u0010;\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b@\u0010\u001eJ\u001d\u0010A\u001a\b\u0012\u0004\u0012\u0002060*2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u0010:J$\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bC\u0010\u001eJ$\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bE\u0010\u001eJ$\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bG\u0010\u001eJ\u0010\u0010H\u001a\u00020#H\u0096@¢\u0006\u0004\bH\u0010!J\u000f\u0010I\u001a\u00020\u001aH\u0016¢\u0006\u0004\bI\u0010JJ\u0011\u0010K\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bK\u0010JR\u0014\u0010N\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010PR\u0014\u0010S\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010Q\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010W"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/PayairCardRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "sdkTokenManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "cardDataSource", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;", "cardStateDataSource", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardTokenization;", "cardTokenization", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;", "activationCodeRequestHandler", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimerStateHandler;", "timerStateHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardTokenization;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimerStateHandler;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "waitForRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetAllCardsError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getAllCards", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "digitizedCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardError;", "getCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetDefaultCardError;", "getDefaultCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetDefaultCardError;", "", "setDefaultCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IsDefaultCardError;", "isDefaultCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardArtError;", "", "getCardArt", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardStateChange;", "observeCardState", "()Lkotlinx/coroutines/flow/Flow;", "observeCards", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardMetaDataError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;", "getCardMetaData", "encryptedCardInfo", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;", "cardScheme", "consumerEntryMode", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "([BLcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "activateCard", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "p0", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "Lcom/payair/model/TokenDetails;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;", "getHighSpeedVideoFpsRanges", "continueAddCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DeleteCardError;", "deleteCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/ResumeCardError;", "resumeCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SuspendCardError;", "suspendCard", "wipeAllTokens", "getWalletPartner", "()Ljava/lang/String;", "getWalletID", "getInputFormats", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardTokenization;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;", "getOutputFormats", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimerStateHandler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairCardRepository implements com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getInputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler getOutputFormats;
    public static final int $stable = 8;

    @javax.inject.Inject
    public PayairCardRepository(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler tokenizationTimerStateHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStateDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardTokenization, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationCodeRequestHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationTimerStateHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = sdkTokenManager;
        this.getHighResolutionOutputSizeshNQ4ISI = cardDataSource;
        this.getHighSpeedVideoFpsRanges = cardStateDataSource;
        this.getHighSpeedVideoFpsRangesFor = cardTokenization;
        this.Camera2StreamConfigurationMap = activationCodeRequestHandler;
        this.getOutputFormats = tokenizationTimerStateHandler;
        this.getInputSizeshNQ4ISI = coroutineDispatcher;
    }

    public /* synthetic */ PayairCardRepository(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimerStateHandler tokenizationTimerStateHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sdkTokenManager, cardDataSource, cardStateDataSource, cardTokenization, activationCodeRequestHandler, tokenizationTimerStateHandler, (i & 64) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAllCards(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getAllCards$1 payairCardRepository$getAllCards$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> value;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getAllCards$1) {
            payairCardRepository$getAllCards$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getAllCards$1) continuation;
            if ((payairCardRepository$getAllCards$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                payairCardRepository$getAllCards$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = payairCardRepository$getAllCards$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$getAllCards$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayairGetAllCards", null, null, 6, null);
                        if (z) {
                            com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource = this.getHighResolutionOutputSizeshNQ4ISI;
                            payairCardRepository$getAllCards$1.Camera2StreamConfigurationMap = defaultRaise;
                            payairCardRepository$getAllCards$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            payairCardRepository$getAllCards$1.getInputSizeshNQ4ISI = defaultRaise3;
                            payairCardRepository$getAllCards$1.getHighSpeedVideoSizesFor = z;
                            payairCardRepository$getAllCards$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            payairCardRepository$getAllCards$1.getHighSpeedVideoFpsRanges = 0;
                            payairCardRepository$getAllCards$1.getHighSpeedVideoFpsRangesFor = 0;
                            payairCardRepository$getAllCards$1.getHighSpeedVideoSizes = 0;
                            payairCardRepository$getAllCards$1.getOutputFormats = 1;
                            java.lang.Object rehydrateSuspending$taptopay_prodRelease = cardDataSource.rehydrateSuspending$taptopay_prodRelease(payairCardRepository$getAllCards$1);
                            if (rehydrateSuspending$taptopay_prodRelease == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                            obj = rehydrateSuspending$taptopay_prodRelease;
                            raise = defaultRaise3;
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI.rehydrate$taptopay_prodRelease();
                            value = this.getHighResolutionOutputSizeshNQ4ISI.getCards().getValue();
                            defaultRaise2 = defaultRaise;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(value);
                        }
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
                    int i2 = payairCardRepository$getAllCards$1.getHighSpeedVideoSizes;
                    int i3 = payairCardRepository$getAllCards$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = payairCardRepository$getAllCards$1.getHighSpeedVideoFpsRanges;
                    int i5 = payairCardRepository$getAllCards$1.getHighResolutionOutputSizeshNQ4ISI;
                    boolean z2 = payairCardRepository$getAllCards$1.getHighSpeedVideoSizesFor;
                    raise = (arrow.core.raise.Raise) payairCardRepository$getAllCards$1.getInputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) payairCardRepository$getAllCards$1.Camera2StreamConfigurationMap;
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
                value = (java.util.List) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(value);
            }
        }
        payairCardRepository$getAllCards$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getAllCards$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$getAllCards$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$getAllCards$1.getOutputFormats;
        if (i != 0) {
        }
        value = (java.util.List) raise.bind((arrow.core.Either) obj2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0080, B:16:0x0086, B:19:0x00a3, B:20:0x00bf), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0080, B:16:0x0086, B:19:0x00a3, B:20:0x00bf), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v21, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCard$1 payairCardRepository$getCard$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCard$1) {
            payairCardRepository$getCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCard$1) continuation;
            if ((payairCardRepository$getCard$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                payairCardRepository$getCard$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = payairCardRepository$getCard$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$getCard$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayairGetCard", null, null, 6, null);
                        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                        payairCardRepository$getCard$1.Camera2StreamConfigurationMap = str;
                        payairCardRepository$getCard$1.getInputFormats = defaultRaise;
                        payairCardRepository$getCard$1.getOutputFormats = defaultRaise2;
                        payairCardRepository$getCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairCardRepository$getCard$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairCardRepository$getCard$1.getHighSpeedVideoFpsRanges = 0;
                        payairCardRepository$getCard$1.getHighSpeedVideoSizes = 0;
                        payairCardRepository$getCard$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object card = sdkTokenManager.getCard(str, payairCardRepository$getCard$1);
                        if (card == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = card;
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
                    int i2 = payairCardRepository$getCard$1.getHighSpeedVideoSizes;
                    int i3 = payairCardRepository$getCard$1.getHighSpeedVideoFpsRanges;
                    int i4 = payairCardRepository$getCard$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = payairCardRepository$getCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r12 = (arrow.core.raise.Raise) payairCardRepository$getCard$1.getOutputFormats;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) payairCardRepository$getCard$1.getInputFormats;
                    java.lang.String str2 = (java.lang.String) payairCardRepository$getCard$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r12;
                        str = str2;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj;
                if (digitizedCard == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairGetCard was successful", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str)), 2, null);
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(digitizedCard);
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairGetCard failed, card not found", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str)), 2, null);
                defaultRaise2.raise(com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError.CardNotFound.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        payairCardRepository$getCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCard$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$getCard$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$getCard$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj2;
        if (digitizedCard == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDefaultCard(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getDefaultCard$1 payairCardRepository$getDefaultCard$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getDefaultCard$1) {
            payairCardRepository$getDefaultCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getDefaultCard$1) continuation;
            if ((payairCardRepository$getDefaultCard$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payairCardRepository$getDefaultCard$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payairCardRepository$getDefaultCard$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$getDefaultCard$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayairGetDefaultCard", null, null, 6, null);
                        java.lang.String defaultToken = this.getHighSpeedVideoSizes.getDefaultToken();
                        if (defaultToken != null) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairGetDefaultCard was successful", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("defaultCardId", defaultToken)), 2, null);
                            com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                            payairCardRepository$getDefaultCard$1.Camera2StreamConfigurationMap = defaultRaise;
                            payairCardRepository$getDefaultCard$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            payairCardRepository$getDefaultCard$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultToken);
                            payairCardRepository$getDefaultCard$1.getHighSpeedVideoSizes = 0;
                            payairCardRepository$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            payairCardRepository$getDefaultCard$1.getHighSpeedVideoFpsRangesFor = 0;
                            payairCardRepository$getDefaultCard$1.getHighSpeedVideoFpsRanges = 0;
                            payairCardRepository$getDefaultCard$1.getInputSizeshNQ4ISI = 1;
                            java.lang.Object card = sdkTokenManager.getCard(defaultToken, payairCardRepository$getDefaultCard$1);
                            if (card == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                            obj = card;
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairGetDefaultCard failed, no default card set", null, null, 6, null);
                            defaultRaise3.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError.DefaultError("Card not found", null, 2, null));
                            throw new kotlin.KotlinNothingValueException();
                        }
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
                    int i2 = payairCardRepository$getDefaultCard$1.getHighSpeedVideoFpsRanges;
                    int i3 = payairCardRepository$getDefaultCard$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = payairCardRepository$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = payairCardRepository$getDefaultCard$1.getHighSpeedVideoSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) payairCardRepository$getDefaultCard$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise2;
                        e = e2;
                        defaultRaise = defaultRaise4;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise2;
                        th = th2;
                        defaultRaise = defaultRaise5;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right((com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj);
            }
        }
        payairCardRepository$getDefaultCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getDefaultCard$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$getDefaultCard$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$getDefaultCard$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        defaultRaise2.complete();
        return new arrow.core.Either.Right((com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0080, B:15:0x0084, B:18:0x00b3, B:19:0x00d1), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0080, B:15:0x0084, B:18:0x00b3, B:19:0x00d1), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v22, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IsDefaultCardError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$isDefaultCard$1 payairCardRepository$isDefaultCard$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$isDefaultCard$1) {
            payairCardRepository$isDefaultCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$isDefaultCard$1) continuation;
            if ((payairCardRepository$isDefaultCard$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payairCardRepository$isDefaultCard$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payairCardRepository$isDefaultCard$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$isDefaultCard$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayairIsDefaultCard", null, null, 6, null);
                        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                        payairCardRepository$isDefaultCard$1.getHighSpeedVideoSizes = str;
                        payairCardRepository$isDefaultCard$1.getInputFormats = defaultRaise;
                        payairCardRepository$isDefaultCard$1.getOutputFormats = defaultRaise2;
                        payairCardRepository$isDefaultCard$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairCardRepository$isDefaultCard$1.Camera2StreamConfigurationMap = 0;
                        payairCardRepository$isDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairCardRepository$isDefaultCard$1.getHighSpeedVideoFpsRanges = 0;
                        payairCardRepository$isDefaultCard$1.getInputSizeshNQ4ISI = 1;
                        java.lang.Object card = sdkTokenManager.getCard(str, payairCardRepository$isDefaultCard$1);
                        if (card == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = card;
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
                    int i2 = payairCardRepository$isDefaultCard$1.getHighSpeedVideoFpsRanges;
                    int i3 = payairCardRepository$isDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = payairCardRepository$isDefaultCard$1.Camera2StreamConfigurationMap;
                    int i5 = payairCardRepository$isDefaultCard$1.getHighSpeedVideoFpsRangesFor;
                    ?? r12 = (arrow.core.raise.Raise) payairCardRepository$isDefaultCard$1.getOutputFormats;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) payairCardRepository$isDefaultCard$1.getInputFormats;
                    java.lang.String str2 = (java.lang.String) payairCardRepository$isDefaultCard$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r12;
                        str = str2;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj;
                if (digitizedCard == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairIsDefaultCard was successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isDefault", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(digitizedCard.isDefault()))), null, 4, null);
                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(digitizedCard.isDefault());
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(boxBoolean);
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairIsDefaultCard failed, card not found", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str)), 2, null);
                defaultRaise2.raise(com.paypal.oslo.feature.taptopay.domain.model.card.IsDefaultCardError.CardNotFound.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        payairCardRepository$isDefaultCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$isDefaultCard$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$isDefaultCard$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$isDefaultCard$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj2;
        if (digitizedCard == null) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> observeCardState() {
        return this.getHighSpeedVideoFpsRanges.getCardStateChange();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> observeCards() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCards();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0080, B:15:0x0084, B:18:0x0096, B:21:0x00b3, B:22:0x00d8), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0080, B:15:0x0084, B:18:0x0096, B:21:0x00b3, B:22:0x00d8), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v26, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardMetaData(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError, com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCardMetaData$1 payairCardRepository$getCardMetaData$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata cardMetadata;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCardMetaData$1) {
            payairCardRepository$getCardMetaData$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCardMetaData$1) continuation;
            if ((payairCardRepository$getCardMetaData$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                payairCardRepository$getCardMetaData$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = payairCardRepository$getCardMetaData$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$getCardMetaData$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayairGetCardMetaData", null, null, 6, null);
                        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                        payairCardRepository$getCardMetaData$1.getHighSpeedVideoFpsRanges = str;
                        payairCardRepository$getCardMetaData$1.getOutputFormats = defaultRaise;
                        payairCardRepository$getCardMetaData$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        payairCardRepository$getCardMetaData$1.getHighSpeedVideoSizes = 0;
                        payairCardRepository$getCardMetaData$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairCardRepository$getCardMetaData$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairCardRepository$getCardMetaData$1.Camera2StreamConfigurationMap = 0;
                        payairCardRepository$getCardMetaData$1.getOutputMinFrameDuration = 1;
                        java.lang.Object cardMetadata2 = sdkTokenManager.getCardMetadata(str, payairCardRepository$getCardMetaData$1);
                        if (cardMetadata2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = cardMetadata2;
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
                    int i2 = payairCardRepository$getCardMetaData$1.Camera2StreamConfigurationMap;
                    int i3 = payairCardRepository$getCardMetaData$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = payairCardRepository$getCardMetaData$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = payairCardRepository$getCardMetaData$1.getHighSpeedVideoSizes;
                    ?? r12 = (arrow.core.raise.Raise) payairCardRepository$getCardMetaData$1.getHighSpeedVideoSizesFor;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) payairCardRepository$getCardMetaData$1.getOutputFormats;
                    java.lang.String str2 = (java.lang.String) payairCardRepository$getCardMetaData$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r12;
                        str = str2;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                cardMetadata = (com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata) obj;
                if (cardMetadata == null) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardMetadata.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    com.paypal.android.logger.Logger.d$default(logger, "PayairGetCardMetaData was successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardMetadataType", simpleName)), null, 4, null);
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(cardMetadata);
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairGetCardMetaData failed, card metadata not found", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str)), 2, null);
                defaultRaise2.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError.DefaultError("Card Metadata not found", null, 2, null));
                throw new kotlin.KotlinNothingValueException();
            }
        }
        payairCardRepository$getCardMetaData$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$getCardMetaData$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$getCardMetaData$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$getCardMetaData$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        cardMetadata = (com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata) obj2;
        if (cardMetadata == null) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> addCard(byte[] encryptedCardInfo, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCardInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$addCard$1(cardScheme, this, encryptedCardInfo, consumerEntryMode, null));
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> activateCard(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1(digitizedCardId, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0075, B:16:0x007d, B:19:0x0097, B:21:0x009d, B:23:0x00af, B:25:0x00b5, B:27:0x00bd, B:28:0x00df, B:31:0x00e0, B:34:0x00eb, B:35:0x012d), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0075, B:16:0x007d, B:19:0x0097, B:21:0x009d, B:23:0x00af, B:25:0x00b5, B:27:0x00bd, B:28:0x00df, B:31:0x00e0, B:34:0x00eb, B:35:0x012d), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v30, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure, com.payair.model.TokenDetails>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateTokenDetails$1 payairCardRepository$fetchAndValidateTokenDetails$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.payair.model.Response response;
        java.lang.String str2;
        java.lang.Class<?> cls;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateTokenDetails$1) {
            payairCardRepository$fetchAndValidateTokenDetails$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateTokenDetails$1) continuation;
            if ((payairCardRepository$fetchAndValidateTokenDetails$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                payairCardRepository$fetchAndValidateTokenDetails$1.getInputFormats -= 2147483648;
                java.lang.Object obj = payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$fetchAndValidateTokenDetails$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoFpsRanges = str;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getOutputMinFrameDuration = defaultRaise;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getOutputFormats = defaultRaise2;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoSizes = 0;
                        payairCardRepository$fetchAndValidateTokenDetails$1.Camera2StreamConfigurationMap = 0;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairCardRepository$fetchAndValidateTokenDetails$1.getInputFormats = 1;
                        java.lang.Object tokenDetails = sdkTokenManager.getTokenDetails(str, payairCardRepository$fetchAndValidateTokenDetails$1);
                        if (tokenDetails == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = tokenDetails;
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
                    int i2 = payairCardRepository$fetchAndValidateTokenDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = payairCardRepository$fetchAndValidateTokenDetails$1.Camera2StreamConfigurationMap;
                    int i4 = payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoSizes;
                    int i5 = payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoFpsRangesFor;
                    ?? r13 = (arrow.core.raise.Raise) payairCardRepository$fetchAndValidateTokenDetails$1.getOutputFormats;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) payairCardRepository$fetchAndValidateTokenDetails$1.getOutputMinFrameDuration;
                    java.lang.String str3 = (java.lang.String) payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r13;
                        str = str3;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                response = (com.payair.model.Response) obj;
                if (!(response instanceof com.payair.model.Response.Error)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairActivateCard failed when fetching token details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.payair.model.Response.Error) response).getErrorCode()))), null, null, 12, null);
                    int errorCode = ((com.payair.model.Response.Error) response).getErrorCode();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Activate card failed, with error: ");
                    sb.append(errorCode);
                    defaultRaise2.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError("-1", sb.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(response, "");
                com.payair.model.Response.Success success = (com.payair.model.Response.Success) response;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairActivateCard successfully fetched token details", null, null, 6, null);
                java.lang.Object data = success.getData();
                com.payair.model.TokenDetails tokenDetails2 = data instanceof com.payair.model.TokenDetails ? (com.payair.model.TokenDetails) data : null;
                if (tokenDetails2 == null) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str));
                    java.lang.Object data2 = success.getData();
                    if (data2 == null || (cls = data2.getClass()) == null || (str2 = cls.getName()) == null) {
                        str2 = "null";
                    }
                    com.paypal.android.logger.Logger.e$default(logger, "PayairActivateCard received unexpected token details object type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("actualType", str2)), mapOf, null, 8, null);
                    defaultRaise2.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError("-1", "Activate card failed due to invalid token details"));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise3.complete();
                return new arrow.core.Either.Right(tokenDetails2);
            }
        }
        payairCardRepository$fetchAndValidateTokenDetails$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateTokenDetails$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$fetchAndValidateTokenDetails$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$fetchAndValidateTokenDetails$1.getInputFormats;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (!(response instanceof com.payair.model.Response.Error)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0075, B:16:0x007d, B:19:0x0097, B:21:0x009d, B:23:0x00af, B:25:0x00b5, B:27:0x00bd, B:28:0x00df, B:31:0x00e0, B:34:0x00eb, B:35:0x012d), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003a, B:13:0x0075, B:16:0x007d, B:19:0x0097, B:21:0x009d, B:23:0x00af, B:25:0x00b5, B:27:0x00bd, B:28:0x00df, B:31:0x00e0, B:34:0x00eb, B:35:0x012d), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v30, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure, ? extends java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod>>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateAuthMethods$1 payairCardRepository$fetchAndValidateAuthMethods$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.payair.model.Response response;
        java.lang.String str2;
        java.lang.Class<?> cls;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateAuthMethods$1) {
            payairCardRepository$fetchAndValidateAuthMethods$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateAuthMethods$1) continuation;
            if ((payairCardRepository$fetchAndValidateAuthMethods$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payairCardRepository$fetchAndValidateAuthMethods$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$fetchAndValidateAuthMethods$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoFpsRanges = str;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getOutputFormats = defaultRaise;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getInputFormats = defaultRaise2;
                        payairCardRepository$fetchAndValidateAuthMethods$1.Camera2StreamConfigurationMap = 0;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoSizes = 0;
                        payairCardRepository$fetchAndValidateAuthMethods$1.getInputSizeshNQ4ISI = 1;
                        java.lang.Object authenticationMethods = sdkTokenManager.getAuthenticationMethods(str, payairCardRepository$fetchAndValidateAuthMethods$1);
                        if (authenticationMethods == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = authenticationMethods;
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
                    int i2 = payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoSizes;
                    int i3 = payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = payairCardRepository$fetchAndValidateAuthMethods$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = payairCardRepository$fetchAndValidateAuthMethods$1.Camera2StreamConfigurationMap;
                    ?? r13 = (arrow.core.raise.Raise) payairCardRepository$fetchAndValidateAuthMethods$1.getInputFormats;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) payairCardRepository$fetchAndValidateAuthMethods$1.getOutputFormats;
                    java.lang.String str3 = (java.lang.String) payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r13;
                        str = str3;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                response = (com.payair.model.Response) obj;
                if (!(response instanceof com.payair.model.Response.Error)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairActivateCard failed when fetching authentication methods", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.payair.model.Response.Error) response).getErrorCode()))), null, null, 12, null);
                    int errorCode = ((com.payair.model.Response.Error) response).getErrorCode();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Activate card failed, with error: ");
                    sb.append(errorCode);
                    defaultRaise2.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError("-1", sb.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(response, "");
                com.payair.model.Response.Success success = (com.payair.model.Response.Success) response;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairActivateCard successfully fetched authentication methods", null, null, 6, null);
                java.lang.Object data = success.getData();
                java.util.List list = data instanceof java.util.List ? (java.util.List) data : null;
                if (list == null) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str));
                    java.lang.Object data2 = success.getData();
                    if (data2 == null || (cls = data2.getClass()) == null || (str2 = cls.getName()) == null) {
                        str2 = "null";
                    }
                    com.paypal.android.logger.Logger.e$default(logger, "PayairActivateCard received unexpected authentication methods object type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("actualType", str2)), mapOf, null, 8, null);
                    defaultRaise2.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError("-1", "Activate card failed due to invalid authentication methods"));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise3.complete();
                return new arrow.core.Either.Right(list);
            }
        }
        payairCardRepository$fetchAndValidateAuthMethods$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateAuthMethods$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$fetchAndValidateAuthMethods$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$fetchAndValidateAuthMethods$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (!(response instanceof com.payair.model.Response.Error)) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> continueAddCard(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$continueAddCard$1(digitizedCardId, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$1 payairCardRepository$deleteCard$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$1) {
            payairCardRepository$deleteCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$1) continuation;
            if ((payairCardRepository$deleteCard$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                payairCardRepository$deleteCard$1.getInputFormats -= 2147483648;
                java.lang.Object obj = payairCardRepository$deleteCard$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairCardRepository$deleteCard$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.deleteCard called", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), 2, null);
                        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$2$1 payairCardRepository$deleteCard$2$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$2$1(this, str, defaultRaise3, null);
                        payairCardRepository$deleteCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        payairCardRepository$deleteCard$1.getOutputMinFrameDuration = defaultRaise;
                        payairCardRepository$deleteCard$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        payairCardRepository$deleteCard$1.getHighSpeedVideoFpsRanges = 0;
                        payairCardRepository$deleteCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairCardRepository$deleteCard$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairCardRepository$deleteCard$1.Camera2StreamConfigurationMap = 0;
                        payairCardRepository$deleteCard$1.getInputFormats = 1;
                        if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, payairCardRepository$deleteCard$2$1, payairCardRepository$deleteCard$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
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
                    int i2 = payairCardRepository$deleteCard$1.Camera2StreamConfigurationMap;
                    int i3 = payairCardRepository$deleteCard$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = payairCardRepository$deleteCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = payairCardRepository$deleteCard$1.getHighSpeedVideoFpsRanges;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) payairCardRepository$deleteCard$1.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise = defaultRaise2;
                        e = e2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        defaultRaise = defaultRaise2;
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        payairCardRepository$deleteCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$1(this, continuation);
        java.lang.Object obj2 = payairCardRepository$deleteCard$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairCardRepository$deleteCard$1.getInputFormats;
        if (i != 0) {
        }
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        defaultRaise2.complete();
        return new arrow.core.Either.Right(unit2);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object wipeAllTokens(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.wipeAllTokens called", null, null, 6, null);
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getInputSizeshNQ4ISI, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$wipeAllTokens$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.String getWalletPartner() {
        return "PAYPAL";
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.String getWalletID() {
        return this.getHighSpeedVideoSizes.getWalletID();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object setDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError, kotlin.Unit>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayairSetDefaultCard", null, null, 6, null);
            this.getHighSpeedVideoSizes.setDefaultToken(str);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            defaultRaise.complete();
            return new arrow.core.Either.Right(unit);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object getCardArt(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardArtError, byte[]>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.getCardArt called", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), 2, null);
            defaultRaise.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.GetCardArtError.DefaultError("CardArt is not supported", null, 2, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object resumeCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.ResumeCardError, kotlin.Unit>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.resumeCard called", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), 2, null);
            defaultRaise.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.ResumeCardError.DefaultError("Resuming card is not supported", null, 2, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object suspendCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.SuspendCardError, kotlin.Unit>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.suspendCard called", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), 2, null);
            defaultRaise.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.SuspendCardError.DefaultError("Card suspension not supported", null, 2, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
