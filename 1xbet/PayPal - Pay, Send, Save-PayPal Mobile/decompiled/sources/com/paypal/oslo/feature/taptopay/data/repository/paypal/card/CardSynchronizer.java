package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;", "", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ljavax/inject/Provider;)V", "", "deviceWalletServiceCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "digitizedCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;", "cardMetadata", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/SynchronizeCardError;", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Ljavax/inject/Provider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardSynchronizer {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CardSynchronizer(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata cardMetadata, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Syncing card info to device wallet started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str)), null, 4, null);
        return getHighSpeedVideoFpsRangesFor(str, digitizedCard, cardMetadata, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata cardMetadata, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1 cardSynchronizer$executeSynchronizeCardMutation$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation.SyncDeviceWalletCardToken syncDeviceWalletCardToken;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1) {
            cardSynchronizer$executeSynchronizeCardMutation$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1) continuation;
            if ((cardSynchronizer$executeSynchronizeCardMutation$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cardSynchronizer$executeSynchronizeCardMutation$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1 cardSynchronizer$executeSynchronizeCardMutation$12 = cardSynchronizer$executeSynchronizeCardMutation$1;
                java.lang.Object obj = cardSynchronizer$executeSynchronizeCardMutation$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardSynchronizer$executeSynchronizeCardMutation$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Executing syncDeviceWalletCardToken mutation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str), kotlin.TuplesKt.to("digitizedCardId", digitizedCard.getCardId()), kotlin.TuplesKt.to("tokenId", cardMetadata.getTokenId())), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.SyncDeviceWalletCardTokenInput syncInput = com.paypal.oslo.feature.taptopay.data.mapper.SyncDeviceWalletCardTokenMapperKt.toSyncInput(cardMetadata, str, cardMetadata.getTokenId());
                    com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation syncDeviceWalletCardTokenMutation = new com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation(syncInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    cardSynchronizer$executeSynchronizeCardMutation$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardSynchronizer$executeSynchronizeCardMutation$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                    cardSynchronizer$executeSynchronizeCardMutation$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardMetadata);
                    cardSynchronizer$executeSynchronizeCardMutation$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(syncInput);
                    cardSynchronizer$executeSynchronizeCardMutation$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(syncDeviceWalletCardTokenMutation);
                    cardSynchronizer$executeSynchronizeCardMutation$12.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, syncDeviceWalletCardTokenMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cardSynchronizer$executeSynchronizeCardMutation$12, 2, (java.lang.Object) null);
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
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logError(callError, "SyncDeviceWalletCardToken mutation failed");
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizerKt.access$toSynchronizeCardError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError)));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation.Data data = (com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    syncDeviceWalletCardToken = data != null ? data.getSyncDeviceWalletCardToken() : null;
                    if (syncDeviceWalletCardToken != null && syncDeviceWalletCardToken.getSuccess()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SyncDeviceWalletCardToken mutation successful", null, null, 6, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    if (syncDeviceWalletCardToken == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SyncDeviceWalletCardToken mutation returned null result", null, null, null, 14, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.DefaultError("Sync mutation returned null result"));
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SyncDeviceWalletCardToken mutation returned success=false", null, null, 6, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.DefaultError("Sync mutation returned success=false"));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logWarning(callError2, "SyncDeviceWalletCardToken mutation returned partial data with errors");
                    com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.SyncDeviceWalletCardTokenMutation.Data) graphQLData.getData();
                    syncDeviceWalletCardToken = data2 != null ? data2.getSyncDeviceWalletCardToken() : null;
                    if (syncDeviceWalletCardToken != null && syncDeviceWalletCardToken.getSuccess()) {
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizerKt.access$toSynchronizeCardError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError2)));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardSynchronizer$executeSynchronizeCardMutation$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1 cardSynchronizer$executeSynchronizeCardMutation$122 = cardSynchronizer$executeSynchronizeCardMutation$1;
        java.lang.Object obj2 = cardSynchronizer$executeSynchronizeCardMutation$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardSynchronizer$executeSynchronizeCardMutation$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
