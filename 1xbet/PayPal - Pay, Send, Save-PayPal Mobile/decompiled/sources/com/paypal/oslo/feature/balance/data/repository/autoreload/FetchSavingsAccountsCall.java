package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/SavingsAccountResponse;", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$Data;", "graphQLData", "parseResponse$balance_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchSavingsAccountsCall {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public FetchSavingsAccountsCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8 A[Catch: all -> 0x0042, RaiseCancellationException -> 0x0045, TryCatch #3 {RaiseCancellationException -> 0x0045, all -> 0x0042, blocks: (B:11:0x003e, B:12:0x009b, B:17:0x00a5, B:18:0x00d7, B:23:0x00bc, B:24:0x00e2, B:25:0x00e7, B:26:0x00e8, B:27:0x00fc), top: B:10:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall$execute$1 fetchSavingsAccountsCall$execute$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse savingsAccountResponse;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall$execute$1) {
            fetchSavingsAccountsCall$execute$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall$execute$1) continuation;
            if ((fetchSavingsAccountsCall$execute$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                fetchSavingsAccountsCall$execute$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = fetchSavingsAccountsCall$execute$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchSavingsAccountsCall$execute$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery fetchSavingsAccountsQuery = new com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery();
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.query(fetchSavingsAccountsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                        fetchSavingsAccountsCall$execute$1.Camera2StreamConfigurationMap = defaultRaise;
                        fetchSavingsAccountsCall$execute$1.getOutputMinFrameDuration = defaultRaise3;
                        fetchSavingsAccountsCall$execute$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchSavingsAccountsQuery);
                        fetchSavingsAccountsCall$execute$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                        fetchSavingsAccountsCall$execute$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        fetchSavingsAccountsCall$execute$1.getHighSpeedVideoFpsRanges = 0;
                        fetchSavingsAccountsCall$execute$1.getHighSpeedVideoSizes = 0;
                        fetchSavingsAccountsCall$execute$1.getHighSpeedVideoFpsRangesFor = 0;
                        fetchSavingsAccountsCall$execute$1.getOutputFormats = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, fetchSavingsAccountsCall$execute$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        defaultRaise2 = defaultRaise;
                        obj = execute$default;
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
                    int i2 = fetchSavingsAccountsCall$execute$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = fetchSavingsAccountsCall$execute$1.getHighSpeedVideoSizes;
                    int i4 = fetchSavingsAccountsCall$execute$1.getHighSpeedVideoFpsRanges;
                    int i5 = fetchSavingsAccountsCall$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) fetchSavingsAccountsCall$execute$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) fetchSavingsAccountsCall$execute$1.Camera2StreamConfigurationMap;
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
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    raise.raise(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toAutoReloadFIError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    savingsAccountResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    savingsAccountResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(savingsAccountResponse);
            }
        }
        fetchSavingsAccountsCall$execute$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall$execute$1(this, continuation);
        java.lang.Object obj2 = fetchSavingsAccountsCall$execute$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchSavingsAccountsCall$execute$1.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse> parseResponse$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data> graphQLData) {
        com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Data data;
        java.util.List<com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount> savingsAccounts;
        if (graphQLData != null && (data = graphQLData.getData()) != null && (savingsAccounts = data.getSavingsAccounts()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount savingsAccount : savingsAccounts) {
                com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount savingsAccount2 = savingsAccount != null ? com.paypal.oslo.feature.balance.data.repository.autoreload.SavingsAccountMapperKt.toSavingsAccount(savingsAccount) : null;
                if (savingsAccount2 != null) {
                    arrayList.add(savingsAccount2);
                }
            }
            arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse> right = arrow.core.EitherKt.right(new com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse(arrayList));
            if (right != null) {
                return right;
            }
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse(kotlin.collections.CollectionsKt.emptyList()));
    }
}
