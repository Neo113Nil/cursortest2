package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086B¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardTokenCloser;", "", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ljavax/inject/Provider;)V", "", "deviceWalletServiceCardId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardDeletedError;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljavax/inject/Provider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardTokenCloser {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CardTokenCloser(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.Camera2StreamConfigurationMap = provider;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Closing card token in device wallet", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str)), null, 4, null);
        return Camera2StreamConfigurationMap(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser$executeCloseCardMutation$1 cardTokenCloser$executeCloseCardMutation$1;
        int i;
        java.lang.Object obj;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation.CloseDeviceWalletCardToken closeDeviceWalletCardToken;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser$executeCloseCardMutation$1) {
            cardTokenCloser$executeCloseCardMutation$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser$executeCloseCardMutation$1) continuation;
            if ((cardTokenCloser$executeCloseCardMutation$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cardTokenCloser$executeCloseCardMutation$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser$executeCloseCardMutation$1 cardTokenCloser$executeCloseCardMutation$12 = cardTokenCloser$executeCloseCardMutation$1;
                java.lang.Object obj2 = cardTokenCloser$executeCloseCardMutation$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardTokenCloser$executeCloseCardMutation$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Executing closeDeviceWalletCardToken mutation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str2)), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokenInput closeDeviceWalletCardTokenInput = new com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokenInput(str, com.paypal.oslo.api.graphql.schema.type.DeviceWalletCardTokenLifecycleReasonCode.CUSTOMER_INITIATED, null, 4, null);
                    com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation closeDeviceWalletCardTokenMutation = new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation(closeDeviceWalletCardTokenInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    cardTokenCloser$executeCloseCardMutation$12.getHighResolutionOutputSizeshNQ4ISI = str2;
                    cardTokenCloser$executeCloseCardMutation$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeDeviceWalletCardTokenInput);
                    cardTokenCloser$executeCloseCardMutation$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeDeviceWalletCardTokenMutation);
                    cardTokenCloser$executeCloseCardMutation$12.getHighSpeedVideoFpsRanges = 1;
                    obj = "deviceWalletServiceCardId";
                    obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, closeDeviceWalletCardTokenMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cardTokenCloser$executeCloseCardMutation$12, 2, (java.lang.Object) null);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) cardTokenCloser$executeCloseCardMutation$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    str2 = str3;
                    obj = "deviceWalletServiceCardId";
                }
                ior = (arrow.core.Ior) obj2;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logError(callError, "CloseDeviceWalletCardToken mutation failed");
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError)));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation.Data data = (com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    closeDeviceWalletCardToken = data != null ? data.getCloseDeviceWalletCardToken() : null;
                    if (closeDeviceWalletCardToken != null && closeDeviceWalletCardToken.getSuccess()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CloseDeviceWalletCardToken mutation successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, 4, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    if (closeDeviceWalletCardToken == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CloseDeviceWalletCardToken mutation returned null result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, null, 12, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "Close mutation returned null result")));
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CloseDeviceWalletCardToken mutation returned success=false", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "Close mutation returned success=false")));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logWarning(callError2, "CloseDeviceWalletCardToken mutation returned partial data with errors");
                    com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokenMutation.Data) graphQLData.getData();
                    closeDeviceWalletCardToken = data2 != null ? data2.getCloseDeviceWalletCardToken() : null;
                    if (closeDeviceWalletCardToken != null && closeDeviceWalletCardToken.getSuccess()) {
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError2)));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardTokenCloser$executeCloseCardMutation$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser$executeCloseCardMutation$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser$executeCloseCardMutation$1 cardTokenCloser$executeCloseCardMutation$122 = cardTokenCloser$executeCloseCardMutation$1;
        java.lang.Object obj22 = cardTokenCloser$executeCloseCardMutation$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardTokenCloser$executeCloseCardMutation$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj22;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
