package com.paypal.oslo.feature.wallet.cards.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0012J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000f0\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b \u0010!J*\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000f0\b2\u0006\u0010\u001d\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u001d\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b,\u0010\u001bJ\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/data/repository/CardRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "card", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardError;", "", "Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;", "getCards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardReward;", "getCardRewards", "", "cardId", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetailError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "getCardDetail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/cards/domain/autodetect/model/AutodetectCardRequest;", "request", "Lcom/paypal/oslo/feature/wallet/cards/domain/autodetect/model/AutodetectCardError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "autodetectCard", "(Lcom/paypal/oslo/feature/wallet/cards/domain/autodetect/model/AutodetectCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "getCardDefinitions", "(Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardRequest;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OPERATION_NAME, "(Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemoveError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemove;", "removeCard", "p0", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/CallConfig;", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardRepositoryImpl implements com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addCard(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError, com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$addCard$1 cardRepositoryImpl$addCard$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$addCard$1) {
            cardRepositoryImpl$addCard$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$addCard$1) continuation;
            if ((cardRepositoryImpl$addCard$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$addCard$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$addCard$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$addCard$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError, com.paypal.oslo.api.graphql.schema.type.AddCardInput> addCardInput = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.toAddCardInput(creditCard);
                    if (addCardInput instanceof arrow.core.Either.Left) {
                        return addCardInput;
                    }
                    if (!(addCardInput instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.api.graphql.schema.type.AddCardInput addCardInput2 = (com.paypal.oslo.api.graphql.schema.type.AddCardInput) ((arrow.core.Either.Right) addCardInput).getValue();
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation(addCardInput2)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Wallet.INSTANCE.getAddCard(), null, null, 6, null));
                    com.paypal.oslo.core.network.graphql.CallConfig Camera2StreamConfigurationMap = Camera2StreamConfigurationMap("wallet_add_card");
                    cardRepositoryImpl$addCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditCard);
                    cardRepositoryImpl$addCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardInput2);
                    cardRepositoryImpl$addCard$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, Camera2StreamConfigurationMap, cardRepositoryImpl$addCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toAddCardError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult addCardResult = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toAddCardResult((com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data) data);
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(addCardResult);
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toAddCardError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$addCard$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$addCard$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$addCard$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$addCard$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb A[Catch: all -> 0x0052, RaiseCancellationException -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0055, all -> 0x0052, blocks: (B:11:0x004d, B:12:0x00c5, B:15:0x00cb, B:16:0x010a, B:18:0x0118, B:20:0x011e, B:22:0x0124, B:23:0x0137, B:25:0x013d, B:27:0x015d, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:36:0x018c, B:39:0x0194, B:41:0x017b, B:46:0x00e8, B:47:0x0104, B:48:0x0109), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018c A[Catch: all -> 0x0052, RaiseCancellationException -> 0x0055, TryCatch #3 {RaiseCancellationException -> 0x0055, all -> 0x0052, blocks: (B:11:0x004d, B:12:0x00c5, B:15:0x00cb, B:16:0x010a, B:18:0x0118, B:20:0x011e, B:22:0x0124, B:23:0x0137, B:25:0x013d, B:27:0x015d, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:36:0x018c, B:39:0x0194, B:41:0x017b, B:46:0x00e8, B:47:0x0104, B:48:0x0109), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0194 A[Catch: all -> 0x0052, RaiseCancellationException -> 0x0055, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0055, all -> 0x0052, blocks: (B:11:0x004d, B:12:0x00c5, B:15:0x00cb, B:16:0x010a, B:18:0x0118, B:20:0x011e, B:22:0x0124, B:23:0x0137, B:25:0x013d, B:27:0x015d, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:36:0x018c, B:39:0x0194, B:41:0x017b, B:46:0x00e8, B:47:0x0104, B:48:0x0109), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCards(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.cards.domain.model.CardError, ? extends java.util.List<com.paypal.oslo.feature.wallet.common.model.CardInfo>>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCards$1 cardRepositoryImpl$getCards$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data data;
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Cards cards;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> items;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCards$1) {
            cardRepositoryImpl$getCards$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCards$1) continuation;
            if ((cardRepositoryImpl$getCards$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$getCards$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj2 = cardRepositoryImpl$getCards$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$getCards$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl.$r8$lambda$D1q9OhUdXZ_EEYJYua55b35D0co((com.paypal.oslo.feature.wallet.cards.domain.model.CardError) obj3, (com.paypal.oslo.feature.wallet.cards.domain.model.CardError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise2 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.wallet.graphql.GetCardsQuery(new com.paypal.oslo.api.graphql.schema.type.CardsInput(null, 1, null))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        cardRepositoryImpl$getCards$1.getHighSpeedVideoSizesFor = function2;
                        cardRepositoryImpl$getCards$1.getOutputMinFrameDuration = atomicReference;
                        cardRepositoryImpl$getCards$1.getInputSizeshNQ4ISI = defaultRaise;
                        cardRepositoryImpl$getCards$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        cardRepositoryImpl$getCards$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iorRaise2);
                        cardRepositoryImpl$getCards$1.getOutputSizes = iorRaise2;
                        cardRepositoryImpl$getCards$1.getHighSpeedVideoFpsRanges = 0;
                        cardRepositoryImpl$getCards$1.Camera2StreamConfigurationMap = 0;
                        cardRepositoryImpl$getCards$1.getHighSpeedVideoSizes = 0;
                        cardRepositoryImpl$getCards$1.getHighSpeedVideoFpsRangesFor = 0;
                        cardRepositoryImpl$getCards$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cardRepositoryImpl$getCards$1.getOutputStallDuration = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cardRepositoryImpl$getCards$1, 2, null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise2;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = cardRepositoryImpl$getCards$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = cardRepositoryImpl$getCards$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = cardRepositoryImpl$getCards$1.getHighSpeedVideoSizes;
                    int i5 = cardRepositoryImpl$getCards$1.Camera2StreamConfigurationMap;
                    int i6 = cardRepositoryImpl$getCards$1.getHighSpeedVideoFpsRanges;
                    iorRaise = (arrow.core.raise.IorRaise) cardRepositoryImpl$getCards$1.getOutputSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cardRepositoryImpl$getCards$1.getInputSizeshNQ4ISI;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) cardRepositoryImpl$getCards$1.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = (kotlin.jvm.functions.Function2) cardRepositoryImpl$getCards$1.getHighSpeedVideoSizesFor;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.cards.data.extensions.CallErrorKtKt.toCardError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.cards.data.extensions.CallErrorKtKt.toCardError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
                if (data != null || (cards = data.getCards()) == null || (items = cards.getItems()) == null) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item> list = items;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Item item : list) {
                        java.lang.String id = item.getId();
                        java.lang.String lastNChars = item.getLastNChars();
                        java.lang.String rawValue = item.getBrand().getRawValue();
                        java.lang.String nickName = item.getNickName();
                        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = item.getProductClass();
                        arrayList.add(new com.paypal.oslo.feature.wallet.common.model.CardInfo(id, lastNChars, rawValue, nickName, productClass != null ? productClass.getRawValue() : null, null, null, null, null, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null));
                    }
                    emptyList = arrayList;
                }
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(emptyList) : new arrow.core.Ior.Both(obj3, emptyList);
            }
        }
        cardRepositoryImpl$getCards$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCards$1(this, continuation);
        java.lang.Object obj22 = cardRepositoryImpl$getCards$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$getCards$1.getOutputStallDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.wallet.graphql.GetCardsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
        if (data != null) {
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        defaultRaise2.complete();
        arrow.core.EmptyValue emptyValue32 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj32 = atomicReference2.get();
        if (obj32 != arrow.core.EmptyValue.INSTANCE) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardRewards(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError, ? extends java.util.List<com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardReward>>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardRewards$1 cardRepositoryImpl$getCardRewards$1;
        int i;
        arrow.core.Ior ior;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardRewards$1) {
            cardRepositoryImpl$getCardRewards$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardRewards$1) continuation;
            if ((cardRepositoryImpl$getCardRewards$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$getCardRewards$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$getCardRewards$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$getCardRewards$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    cardRepositoryImpl$getCardRewards$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cardRepositoryImpl$getCardRewards$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardRewardsToDomainKtKt.toCardRewardsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item> items = ((com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Data) data).getCardRewards().getItems();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
                            for (com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Item item : items) {
                                java.lang.String id = item.getId();
                                java.lang.String relatedCardId = item.getRelatedCardId();
                                com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance = item.getBalance();
                                com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance domain = balance != null ? com.paypal.oslo.feature.wallet.cards.data.extensions.CardRewardsToDomainKtKt.toDomain(balance) : null;
                                com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status = item.getStatus();
                                com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus domain2 = status != null ? com.paypal.oslo.feature.wallet.cards.data.extensions.CardRewardsToDomainKtKt.toDomain(status) : null;
                                com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer = item.getIssuer();
                                com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer domain3 = (issuer == null || (walletCardIssuerFragment = issuer.getWalletCardIssuerFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardIssuerFragment);
                                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> institutionImages = item.getInstitutionImages();
                                if (institutionImages != null) {
                                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage> list = institutionImages;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                    java.util.Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(com.paypal.oslo.feature.wallet.cards.data.extensions.CardRewardsToDomainKtKt.toDomain((com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage) it.next()));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardReward(id, relatedCardId, domain, domain2, domain3, arrayList));
                            }
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(arrayList2);
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardRewardsToDomainKtKt.toCardRewardsError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$getCardRewards$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardRewards$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$getCardRewards$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$getCardRewards$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardDetail(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDetail$1 cardRepositoryImpl$getCardDetail$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDetail$1) {
            cardRepositoryImpl$getCardDetail$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDetail$1) continuation;
            if ((cardRepositoryImpl$getCardDetail$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$getCardDetail$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$getCardDetail$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$getCardDetail$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery(str)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    cardRepositoryImpl$getCardDetail$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardRepositoryImpl$getCardDetail$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cardRepositoryImpl$getCardDetail$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toCardDetailError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.Card card = ((com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.Data) data).getCard();
                            if (card != null) {
                                com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail domain = com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(card);
                                defaultRaise.complete();
                                return new arrow.core.Either.Right(domain);
                            }
                            defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.DataNotFound.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toCardDetailError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$getCardDetail$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDetail$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$getCardDetail$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$getCardDetail$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object autodetectCard(com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardRequest autodetectCardRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardError, ? extends java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition>>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$autodetectCard$1 cardRepositoryImpl$autodetectCard$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$autodetectCard$1) {
            cardRepositoryImpl$autodetectCard$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$autodetectCard$1) continuation;
            if ((cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.wallet.graphql.GetWalletAutodetectCardQuery(com.paypal.oslo.feature.wallet.cards.data.extensions.AutodetectCardToDataKtKt.toGraphQL(autodetectCardRequest))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autodetectCardRequest);
                    cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cardRepositoryImpl$autodetectCard$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.AutodetectCardToDomainKtKt.toAutodetectCardError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletAutodetectCardQuery.AutodetectCard> autodetectCards = ((com.paypal.oslo.feature.wallet.graphql.GetWalletAutodetectCardQuery.Data) data).getAutodetectCards();
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(autodetectCards, 10));
                            java.util.Iterator<T> it = autodetectCards.iterator();
                            while (it.hasNext()) {
                                arrayList.add(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDefinitionToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.GetWalletAutodetectCardQuery.AutodetectCard) it.next()).getWalletCardDefinitionFragment()));
                            }
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(arrayList);
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.AutodetectCardToDomainKtKt.toAutodetectCardError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$autodetectCard$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$autodetectCard$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$autodetectCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardDefinitions(com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest cardDefinitionsRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError, ? extends java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition>>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDefinitions$1 cardRepositoryImpl$getCardDefinitions$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDefinitions$1) {
            cardRepositoryImpl$getCardDefinitions$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDefinitions$1) continuation;
            if ((cardRepositoryImpl$getCardDefinitions$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$getCardDefinitions$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$getCardDefinitions$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$getCardDefinitions$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.wallet.graphql.GetWalletCardDefinitionsQuery(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDefinitionsToDataKtKt.toGraphQL(cardDefinitionsRequest))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    cardRepositoryImpl$getCardDefinitions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardDefinitionsRequest);
                    cardRepositoryImpl$getCardDefinitions$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cardRepositoryImpl$getCardDefinitions$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDefinitionsToDomainKtKt.toCardDefinitionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardDefinitionsQuery.CardDefinition> cardDefinitions = ((com.paypal.oslo.feature.wallet.graphql.GetWalletCardDefinitionsQuery.Data) data).getCardDefinitions();
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cardDefinitions, 10));
                            java.util.Iterator<T> it = cardDefinitions.iterator();
                            while (it.hasNext()) {
                                arrayList.add(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDefinitionToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.GetWalletCardDefinitionsQuery.CardDefinition) it.next()).getWalletCardDefinitionFragment()));
                            }
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(arrayList);
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDefinitionsToDomainKtKt.toCardDefinitionsError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$getCardDefinitions$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$getCardDefinitions$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$getCardDefinitions$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$getCardDefinitions$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCard(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$updateCard$1 cardRepositoryImpl$updateCard$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$updateCard$1) {
            cardRepositoryImpl$updateCard$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$updateCard$1) continuation;
            if ((cardRepositoryImpl$updateCard$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCard$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$updateCard$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$updateCard$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, com.paypal.oslo.api.graphql.schema.type.UpdateCardInput> graphQL = com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDataKtKt.toGraphQL(updateCardRequest);
                    if (graphQL instanceof arrow.core.Either.Left) {
                        return graphQL;
                    }
                    if (!(graphQL instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.api.graphql.schema.type.UpdateCardInput updateCardInput = (com.paypal.oslo.api.graphql.schema.type.UpdateCardInput) ((arrow.core.Either.Right) graphQL).getValue();
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation(updateCardInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Wallet.INSTANCE.getUpdateCard(), null, null, 6, null));
                    com.paypal.oslo.core.network.graphql.CallConfig Camera2StreamConfigurationMap = Camera2StreamConfigurationMap("wallet_update_card");
                    cardRepositoryImpl$updateCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardRequest);
                    cardRepositoryImpl$updateCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardInput);
                    cardRepositoryImpl$updateCard$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, Camera2StreamConfigurationMap, cardRepositoryImpl$updateCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDomainKtKt.toUpdateCardError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card = ((com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data) data).getUpdateCard().getCard();
                            if (card != null) {
                                com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail domain = com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDomainKtKt.toDomain(card);
                                defaultRaise.complete();
                                return new arrow.core.Either.Right(domain);
                            }
                            defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError.DataNotFound.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDomainKtKt.toUpdateCardError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$updateCard$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$updateCard$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$updateCard$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$updateCard$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError, com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove>> continuation) {
        com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$removeCard$1 cardRepositoryImpl$removeCard$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$removeCard$1) {
            cardRepositoryImpl$removeCard$1 = (com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$removeCard$1) continuation;
            if ((cardRepositoryImpl$removeCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$removeCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cardRepositoryImpl$removeCard$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardRepositoryImpl$removeCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.wallet.graphql.RemoveWalletCardMutation(str)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Wallet.INSTANCE.getRemoveCard(), null, null, 6, null));
                    com.paypal.oslo.core.network.graphql.CallConfig Camera2StreamConfigurationMap = Camera2StreamConfigurationMap("wallet_remove_card");
                    cardRepositoryImpl$removeCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardRepositoryImpl$removeCard$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, Camera2StreamConfigurationMap, cardRepositoryImpl$removeCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardRemoveToDomainKtKt.toCardRemoveError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.Object data = graphQLData.getData();
                        if (data != null) {
                            com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove domain = com.paypal.oslo.feature.wallet.cards.data.extensions.CardRemoveToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.RemoveWalletCardMutation.Data) data).getRemoveCard());
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(domain);
                        }
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.cards.data.extensions.CardRemoveToDomainKtKt.toCardRemoveError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardRepositoryImpl$removeCard$1 = new com.paypal.oslo.feature.wallet.cards.data.repository.CardRepositoryImpl$removeCard$1(this, continuation);
        java.lang.Object obj2 = cardRepositoryImpl$removeCard$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardRepositoryImpl$removeCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.core.network.graphql.CallConfig Camera2StreamConfigurationMap(java.lang.String p0) {
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(p0, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardError $r8$lambda$D1q9OhUdXZ_EEYJYua55b35D0co(com.paypal.oslo.feature.wallet.cards.domain.model.CardError cardError, com.paypal.oslo.feature.wallet.cards.domain.model.CardError cardError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardError2, "");
        return cardError;
    }
}
