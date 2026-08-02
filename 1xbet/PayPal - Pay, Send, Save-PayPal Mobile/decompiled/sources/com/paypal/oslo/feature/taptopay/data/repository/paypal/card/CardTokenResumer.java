package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086B¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardTokenResumer;", "", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ljavax/inject/Provider;)V", "", "deviceWalletServiceCardId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardResumedError;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Ljavax/inject/Provider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardTokenResumer {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CardTokenResumer(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Resuming card token in device wallet", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str)), null, 4, null);
        return getHighSpeedVideoFpsRangesFor(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1 cardTokenResumer$executeResumeCardMutation$1;
        int i;
        java.lang.Object obj;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation.ResumeDeviceWalletCardToken resumeDeviceWalletCardToken;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1) {
            cardTokenResumer$executeResumeCardMutation$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1) continuation;
            if ((cardTokenResumer$executeResumeCardMutation$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardTokenResumer$executeResumeCardMutation$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1 cardTokenResumer$executeResumeCardMutation$12 = cardTokenResumer$executeResumeCardMutation$1;
                java.lang.Object obj2 = cardTokenResumer$executeResumeCardMutation$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardTokenResumer$executeResumeCardMutation$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Executing resumeDeviceWalletCardToken mutation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", str2)), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.ResumeDeviceWalletCardTokenInput resumeDeviceWalletCardTokenInput = new com.paypal.oslo.api.graphql.schema.type.ResumeDeviceWalletCardTokenInput(str, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.api.graphql.schema.type.DeviceWalletCardTokenLifecycleReasonCode.CUSTOMER_INITIATED), null, 4, null);
                    com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation resumeDeviceWalletCardTokenMutation = new com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation(resumeDeviceWalletCardTokenInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    cardTokenResumer$executeResumeCardMutation$12.getHighSpeedVideoSizes = str2;
                    cardTokenResumer$executeResumeCardMutation$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resumeDeviceWalletCardTokenInput);
                    cardTokenResumer$executeResumeCardMutation$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resumeDeviceWalletCardTokenMutation);
                    cardTokenResumer$executeResumeCardMutation$12.Camera2StreamConfigurationMap = 1;
                    obj = "deviceWalletServiceCardId";
                    obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, resumeDeviceWalletCardTokenMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cardTokenResumer$executeResumeCardMutation$12, 2, (java.lang.Object) null);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) cardTokenResumer$executeResumeCardMutation$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    str2 = str3;
                    obj = "deviceWalletServiceCardId";
                }
                ior = (arrow.core.Ior) obj2;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logError(callError, "ResumeDeviceWalletCardToken mutation failed");
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError)));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation.Data data = (com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    resumeDeviceWalletCardToken = data != null ? data.getResumeDeviceWalletCardToken() : null;
                    if (resumeDeviceWalletCardToken != null && resumeDeviceWalletCardToken.getSuccess()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ResumeDeviceWalletCardToken mutation successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, 4, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    if (resumeDeviceWalletCardToken == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ResumeDeviceWalletCardToken mutation returned null result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, null, 12, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "Resume mutation returned null result")));
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ResumeDeviceWalletCardToken mutation returned success=false", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str2)), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "Resume mutation returned success=false")));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logWarning(callError2, "ResumeDeviceWalletCardToken mutation returned partial data with errors");
                    com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.ResumeDeviceWalletCardTokenMutation.Data) graphQLData.getData();
                    resumeDeviceWalletCardToken = data2 != null ? data2.getResumeDeviceWalletCardToken() : null;
                    if (resumeDeviceWalletCardToken != null && resumeDeviceWalletCardToken.getSuccess()) {
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError2)));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardTokenResumer$executeResumeCardMutation$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1 cardTokenResumer$executeResumeCardMutation$122 = cardTokenResumer$executeResumeCardMutation$1;
        java.lang.Object obj22 = cardTokenResumer$executeResumeCardMutation$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardTokenResumer$executeResumeCardMutation$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj22;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
