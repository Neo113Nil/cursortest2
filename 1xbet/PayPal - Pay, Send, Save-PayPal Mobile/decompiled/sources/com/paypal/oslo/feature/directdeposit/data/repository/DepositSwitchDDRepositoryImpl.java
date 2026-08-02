package com.paypal.oslo.feature.directdeposit.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/data/repository/DepositSwitchDDRepositoryImpl;", "Lcom/paypal/oslo/feature/directdeposit/domain/repository/DepositSwitchDDRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "getPublicToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "directDepositIntegrationId", "bankAccountNumber", "routingNumber", "", "linkAccountToPayrollProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DepositSwitchDDRepositoryImpl implements com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DepositSwitchDDRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPublicToken(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1 depositSwitchDDRepositoryImpl$getPublicToken$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken;
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken2;
        if (continuation instanceof com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1) {
            depositSwitchDDRepositoryImpl$getPublicToken$1 = (com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1) continuation;
            if ((depositSwitchDDRepositoryImpl$getPublicToken$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                depositSwitchDDRepositoryImpl$getPublicToken$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1 depositSwitchDDRepositoryImpl$getPublicToken$12 = depositSwitchDDRepositoryImpl$getPublicToken$1;
                java.lang.Object obj = depositSwitchDDRepositoryImpl$getPublicToken$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = depositSwitchDDRepositoryImpl$getPublicToken$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Fetching Atomic public token from backend via GraphQL", null, null, 6, null);
                    com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery getDirectDepositSwitchAccessTokenQuery = new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery();
                    depositSwitchDDRepositoryImpl$getPublicToken$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getDirectDepositSwitchAccessTokenQuery);
                    depositSwitchDDRepositoryImpl$getPublicToken$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges, getDirectDepositSwitchAccessTokenQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, depositSwitchDDRepositoryImpl$getPublicToken$12, 2, (java.lang.Object) null);
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
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to fetch Atomic token via GraphQL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Either.Left(callError);
                }
                java.lang.String str = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data data = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (directDepositSwitchAccessToken2 = data.getDirectDepositSwitchAccessToken()) != null) {
                        str = directDepositSwitchAccessToken2.getAccessToken();
                    }
                    if (str != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Successfully fetched Atomic token via GraphQL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasToken", "true")), null, 4, null);
                        return new arrow.core.Either.Right(str);
                    }
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("No access token returned from GraphQL");
                    com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("GraphQL response missing access token", illegalStateException);
                    return new arrow.core.Either.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(illegalStateException)));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data data2 = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (directDepositSwitchAccessToken = data2.getDirectDepositSwitchAccessToken()) != null) {
                        str = directDepositSwitchAccessToken.getAccessToken();
                    }
                    if (str != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Received Atomic token with GraphQL errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName())), null, 4, null);
                        return new arrow.core.Either.Right(str);
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to fetch Atomic token via GraphQL (partial error)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Either.Left(callError2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        depositSwitchDDRepositoryImpl$getPublicToken$1 = new com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1(this, continuation);
        com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1 depositSwitchDDRepositoryImpl$getPublicToken$122 = depositSwitchDDRepositoryImpl$getPublicToken$1;
        java.lang.Object obj2 = depositSwitchDDRepositoryImpl$getPublicToken$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = depositSwitchDDRepositoryImpl$getPublicToken$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object linkAccountToPayrollProvider(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1 depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation.LinkDirectDepositAccountToPayrollProvider linkDirectDepositAccountToPayrollProvider;
        com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation.LinkDirectDepositAccountToPayrollProvider linkDirectDepositAccountToPayrollProvider2;
        if (continuation instanceof com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1) {
            depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1 = (com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1) continuation;
            if ((depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1 depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12 = depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1;
                java.lang.Object obj = depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Linking direct deposit account to payroll provider", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasIntegrationId", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str.length() > 0))), null, 4, null);
                    com.apollographql.apollo.api.Optional present = str2.length() > 0 ? new com.apollographql.apollo.api.Optional.Present(str2) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                    com.apollographql.apollo.api.Optional present2 = str3.length() > 0 ? new com.apollographql.apollo.api.Optional.Present(str3) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                    com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput linkDirectDepositAccountToPayrollProviderInput = new com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput(str, present, present2);
                    com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation linkDirectDepositAccountToPayrollProviderMutation = new com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation(linkDirectDepositAccountToPayrollProviderInput);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(present);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(present2);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkDirectDepositAccountToPayrollProviderInput);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkDirectDepositAccountToPayrollProviderMutation);
                    depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges, linkDirectDepositAccountToPayrollProviderMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$12, 2, (java.lang.Object) null);
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
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to link direct deposit account via GraphQL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Either.Left(callError);
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation.Data data = (com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (linkDirectDepositAccountToPayrollProvider2 = data.getLinkDirectDepositAccountToPayrollProvider()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(linkDirectDepositAccountToPayrollProvider2.getSuccess());
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Successfully linked direct deposit account to payroll provider", null, null, 6, null);
                        return new arrow.core.Either.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Link operation returned false or null");
                    com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("GraphQL mutation returned unsuccessful result", illegalStateException);
                    return new arrow.core.Either.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(illegalStateException)));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation.Data data2 = (com.paypal.oslo.feature.directdeposit.graphql.LinkDirectDepositAccountToPayrollProviderMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (linkDirectDepositAccountToPayrollProvider = data2.getLinkDirectDepositAccountToPayrollProvider()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(linkDirectDepositAccountToPayrollProvider.getSuccess());
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Linked direct deposit account with GraphQL errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName())), null, 4, null);
                        return new arrow.core.Either.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to link direct deposit account via GraphQL (partial error)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Either.Left(callError2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1 = new com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1(this, continuation);
        com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1 depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$122 = depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1;
        java.lang.Object obj2 = depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = depositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
