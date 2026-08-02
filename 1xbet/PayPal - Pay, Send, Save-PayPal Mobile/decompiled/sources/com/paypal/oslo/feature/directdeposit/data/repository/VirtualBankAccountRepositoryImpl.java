package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/data/repository/VirtualBankAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/directdeposit/domain/repository/VirtualBankAccountRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/directdeposit/domain/model/VbaItem;", "getVba", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$Data;", "graphQLData", "callError", "errorWithData$directdeposit_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "dataResponse$directdeposit_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Ior;", "", "status", "", "updateDirectDebitStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VirtualBankAccountRepositoryImpl implements com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public VirtualBankAccountRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getVba(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.directdeposit.domain.model.VbaItem>> continuation) {
        com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$getVba$1 virtualBankAccountRepositoryImpl$getVba$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$getVba$1) {
            virtualBankAccountRepositoryImpl$getVba$1 = (com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$getVba$1) continuation;
            if ((virtualBankAccountRepositoryImpl$getVba$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                virtualBankAccountRepositoryImpl$getVba$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = virtualBankAccountRepositoryImpl$getVba$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = virtualBankAccountRepositoryImpl$getVba$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery getVirtualBankAccountsQuery = new com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType.CONSUMER_VIRTUAL_BANK_ACCOUNT, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.ACTIVE)), null, null, null, 28, null));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(getVirtualBankAccountsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    virtualBankAccountRepositoryImpl$getVba$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getVirtualBankAccountsQuery);
                    virtualBankAccountRepositoryImpl$getVba$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, virtualBankAccountRepositoryImpl$getVba$1, 2, null);
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
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Fetch virtual bank accounts failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Left(callError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return dataResponse$directdeposit_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return errorWithData$directdeposit_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue(), (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        virtualBankAccountRepositoryImpl$getVba$1 = new com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$getVba$1(this, continuation);
        java.lang.Object obj2 = virtualBankAccountRepositoryImpl$getVba$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = virtualBankAccountRepositoryImpl$getVba$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.directdeposit.domain.model.VbaItem> errorWithData$directdeposit_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data> graphQLData, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data data;
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts;
        com.paypal.oslo.feature.directdeposit.domain.model.VbaItem vbaItem;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (graphQLData != null && (data = graphQLData.getData()) != null && (virtualBankAccounts = data.getVirtualBankAccounts()) != null && (vbaItem = com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImplKt.toVbaItem(virtualBankAccounts)) != null) {
            return new arrow.core.Ior.Both(callError, vbaItem);
        }
        return new arrow.core.Ior.Left(callError);
    }

    public final arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError.Network, com.paypal.oslo.feature.directdeposit.domain.model.VbaItem> dataResponse$directdeposit_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data> graphQLData) {
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Data data;
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts;
        com.paypal.oslo.feature.directdeposit.domain.model.VbaItem vbaItem;
        if (graphQLData != null && (data = graphQLData.getData()) != null && (virtualBankAccounts = data.getVirtualBankAccounts()) != null && (vbaItem = com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImplKt.toVbaItem(virtualBankAccounts)) != null) {
            return new arrow.core.Ior.Right(vbaItem);
        }
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("No virtual bank accounts data returned");
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "GraphQL response missing virtual bank accounts data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", illegalStateException)), null, null, 12, null);
        return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(illegalStateException)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateDirectDebitStatus(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$updateDirectDebitStatus$1 virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus directDebitStatus;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation.UpdateDirectDebitStatus updateDirectDebitStatus;
        com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation.UpdateDirectDebitStatus updateDirectDebitStatus2;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$updateDirectDebitStatus$1) {
            virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1 = (com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$updateDirectDebitStatus$1) continuation;
            if ((virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$updateDirectDebitStatus$1 virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12 = virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1;
                java.lang.Object obj = virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, com.payair.model.TokenStatusKt.TOKEN_ACTIVE)) {
                        directDebitStatus = com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus.ACTIVE;
                    } else {
                        directDebitStatus = kotlin.jvm.internal.Intrinsics.areEqual(upperCase, com.payair.model.TokenStatusKt.TOKEN_INACTIVE) ? com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus.INACTIVE : com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus.UNKNOWN__;
                    }
                    com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation updateDirectDebitStatusMutation = new com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation(new com.paypal.oslo.api.graphql.schema.type.DirectDebitStatusInput(directDebitStatus));
                    virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.getHighResolutionOutputSizeshNQ4ISI = str2;
                    virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(directDebitStatus);
                    virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateDirectDebitStatusMutation);
                    virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighResolutionOutputSizeshNQ4ISI, updateDirectDebitStatusMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) virtualBankAccountRepositoryImpl$updateDirectDebitStatus$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Update direct debit status failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName()), kotlin.TuplesKt.to("requestedStatus", str2)), null, 4, null);
                    return new arrow.core.Ior.Left(callError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation.Data data = (com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    boolean success = (data == null || (updateDirectDebitStatus2 = data.getUpdateDirectDebitStatus()) == null) ? false : updateDirectDebitStatus2.getSuccess();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Update direct debit status completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(success)), kotlin.TuplesKt.to("requestedStatus", str2)), null, 4, null);
                    return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(success));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation.Data data2 = (com.paypal.oslo.feature.directdeposit.graphql.UpdateDirectDebitStatusMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    boolean success2 = (data2 == null || (updateDirectDebitStatus = data2.getUpdateDirectDebitStatus()) == null) ? false : updateDirectDebitStatus.getSuccess();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Update direct debit status completed with errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(success2)), kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName()), kotlin.TuplesKt.to("requestedStatus", str2)), null, 4, null);
                    return new arrow.core.Ior.Both(callError2, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(success2));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1 = new com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$updateDirectDebitStatus$1(this, continuation);
        com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$updateDirectDebitStatus$1 virtualBankAccountRepositoryImpl$updateDirectDebitStatus$122 = virtualBankAccountRepositoryImpl$updateDirectDebitStatus$1;
        java.lang.Object obj2 = virtualBankAccountRepositoryImpl$updateDirectDebitStatus$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = virtualBankAccountRepositoryImpl$updateDirectDebitStatus$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
