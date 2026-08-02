package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086B¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardTokenSuspender;", "", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ljavax/inject/Provider;)V", "", "deviceWalletServiceCardId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardSuspendError;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljavax/inject/Provider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardTokenSuspender {
    public static final int $stable = 8;
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CardTokenSuspender(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighSpeedVideoFpsRanges = provider;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Suspending card token in device wallet", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str)), null, 4, null);
        return getHighSpeedVideoSizes(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1 cardTokenSuspender$executeSuspendCardMutation$1;
        int i;
        java.lang.Object obj;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation.SuspendDeviceWalletCardToken suspendDeviceWalletCardToken;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1) {
            cardTokenSuspender$executeSuspendCardMutation$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1) continuation;
            if ((cardTokenSuspender$executeSuspendCardMutation$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cardTokenSuspender$executeSuspendCardMutation$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1 cardTokenSuspender$executeSuspendCardMutation$12 = cardTokenSuspender$executeSuspendCardMutation$1;
                java.lang.Object obj2 = cardTokenSuspender$executeSuspendCardMutation$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardTokenSuspender$executeSuspendCardMutation$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Executing suspendDeviceWalletCardToken mutation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str2)), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.SuspendDeviceWalletCardTokenInput suspendDeviceWalletCardTokenInput = new com.paypal.oslo.api.graphql.schema.type.SuspendDeviceWalletCardTokenInput(str, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.api.graphql.schema.type.DeviceWalletCardTokenLifecycleReasonCode.CUSTOMER_INITIATED), null, 4, null);
                    com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation suspendDeviceWalletCardTokenMutation = new com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation(suspendDeviceWalletCardTokenInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    cardTokenSuspender$executeSuspendCardMutation$12.Camera2StreamConfigurationMap = str2;
                    cardTokenSuspender$executeSuspendCardMutation$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(suspendDeviceWalletCardTokenInput);
                    cardTokenSuspender$executeSuspendCardMutation$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(suspendDeviceWalletCardTokenMutation);
                    cardTokenSuspender$executeSuspendCardMutation$12.getHighSpeedVideoSizes = 1;
                    obj = "deviceWalletServiceCardId";
                    obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, suspendDeviceWalletCardTokenMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cardTokenSuspender$executeSuspendCardMutation$12, 2, (java.lang.Object) null);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) cardTokenSuspender$executeSuspendCardMutation$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    str2 = str3;
                    obj = "deviceWalletServiceCardId";
                }
                ior = (arrow.core.Ior) obj2;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logError(callError, "SuspendDeviceWalletCardToken mutation failed");
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError)));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation.Data data = (com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    suspendDeviceWalletCardToken = data != null ? data.getSuspendDeviceWalletCardToken() : null;
                    if (suspendDeviceWalletCardToken != null && suspendDeviceWalletCardToken.getSuccess()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SuspendDeviceWalletCardToken mutation successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, 4, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    if (suspendDeviceWalletCardToken == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SuspendDeviceWalletCardToken mutation returned null result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, null, 12, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "Suspend mutation returned null result")));
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SuspendDeviceWalletCardToken mutation returned success=false", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "Suspend mutation returned success=false")));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logWarning(callError2, "SuspendDeviceWalletCardToken mutation returned partial data with errors");
                    com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.SuspendDeviceWalletCardTokenMutation.Data) graphQLData.getData();
                    suspendDeviceWalletCardToken = data2 != null ? data2.getSuspendDeviceWalletCardToken() : null;
                    if (suspendDeviceWalletCardToken != null && suspendDeviceWalletCardToken.getSuccess()) {
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError2)));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardTokenSuspender$executeSuspendCardMutation$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1 cardTokenSuspender$executeSuspendCardMutation$122 = cardTokenSuspender$executeSuspendCardMutation$1;
        java.lang.Object obj22 = cardTokenSuspender$executeSuspendCardMutation$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardTokenSuspender$executeSuspendCardMutation$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj22;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
