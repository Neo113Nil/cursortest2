package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "amount", "currencyCode", "", "isLowBalance", "speed", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsResponse;", "execute", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Data;", "graphQLData", "parseResponse$balance_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchDepositOptionsCall {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FetchDepositOptionsCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    public static /* synthetic */ java.lang.Object execute$default(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return fetchDepositOptionsCall.execute(str, str2, z, str3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e2 A[Catch: all -> 0x01f9, RaiseCancellationException -> 0x01fb, TryCatch #9 {RaiseCancellationException -> 0x01fb, all -> 0x01f9, blocks: (B:22:0x01a5, B:23:0x01d1, B:29:0x01b6, B:30:0x01dc, B:31:0x01e1, B:32:0x01e2, B:33:0x01f8), top: B:16:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall$execute$1 fetchDepositOptionsCall$execute$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse depositOptionsResponse;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall$execute$1) {
                    fetchDepositOptionsCall$execute$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall$execute$1) continuation;
                    if ((fetchDepositOptionsCall$execute$1.isOutputSupportedForhNQ4ISI & Integer.MIN_VALUE) != 0) {
                        fetchDepositOptionsCall$execute$1.isOutputSupportedForhNQ4ISI -= 2147483648;
                        java.lang.Object obj = fetchDepositOptionsCall$execute$1.toString;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = fetchDepositOptionsCall$execute$1.isOutputSupportedForhNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise = new arrow.core.raise.DefaultRaise(false);
                            try {
                                arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                                if (z) {
                                    productFlowIdentifier = com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.AUTO_RELOAD_FUNDS;
                                } else {
                                    productFlowIdentifier = com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.RECURRING_ADD_FUNDS;
                                }
                                com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput depositOptionsInput = new com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput(new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(str2, str)), null, null, 6, null), com.paypal.oslo.api.graphql.schema.type.DepositType.ADD_FUNDS, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str3 != null ? com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.INSTANCE.safeValueOf(str3) : null), null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.ProductFlowInput(productFlowIdentifier, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier.UPDATE_BALANCE_ON_THRESHOLD), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.TransferChannel.MOBILE))), null, null, null, 29, null)), null, 88, null);
                                com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery getDepositOptionsQuery = new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery(depositOptionsInput);
                                com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getDepositOptionsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                                try {
                                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("balance_auto_reload_deposit_options", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                                    fetchDepositOptionsCall$execute$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    fetchDepositOptionsCall$execute$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    fetchDepositOptionsCall$execute$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                    fetchDepositOptionsCall$execute$1.getInputFormats = defaultRaise;
                                    fetchDepositOptionsCall$execute$1.getHighSpeedVideoSizesFor = defaultRaise3;
                                    fetchDepositOptionsCall$execute$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productFlowIdentifier);
                                    fetchDepositOptionsCall$execute$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getDepositOptionsQuery);
                                    fetchDepositOptionsCall$execute$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                                    fetchDepositOptionsCall$execute$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                                    fetchDepositOptionsCall$execute$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsInput);
                                    fetchDepositOptionsCall$execute$1.getOutputSizes = z;
                                    fetchDepositOptionsCall$execute$1.getHighSpeedVideoFpsRangesFor = 0;
                                    fetchDepositOptionsCall$execute$1.getHighSpeedVideoFpsRanges = 0;
                                    fetchDepositOptionsCall$execute$1.Camera2StreamConfigurationMap = 0;
                                    fetchDepositOptionsCall$execute$1.getHighSpeedVideoSizes = 0;
                                    fetchDepositOptionsCall$execute$1.isOutputSupportedForhNQ4ISI = 1;
                                    java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, fetchDepositOptionsCall$execute$1);
                                    if (execute == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    defaultRaise2 = defaultRaise;
                                    obj = execute;
                                    raise = defaultRaise3;
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            } catch (arrow.core.raise.RaiseCancellationException e2) {
                                e = e2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i2 = fetchDepositOptionsCall$execute$1.getHighSpeedVideoSizes;
                            int i3 = fetchDepositOptionsCall$execute$1.Camera2StreamConfigurationMap;
                            int i4 = fetchDepositOptionsCall$execute$1.getHighSpeedVideoFpsRanges;
                            int i5 = fetchDepositOptionsCall$execute$1.getHighSpeedVideoFpsRangesFor;
                            boolean z2 = fetchDepositOptionsCall$execute$1.getOutputSizes;
                            raise = (arrow.core.raise.Raise) fetchDepositOptionsCall$execute$1.getHighSpeedVideoSizesFor;
                            defaultRaise2 = (arrow.core.raise.DefaultRaise) fetchDepositOptionsCall$execute$1.getInputFormats;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                            } catch (arrow.core.raise.RaiseCancellationException e3) {
                                e = e3;
                                defaultRaise = defaultRaise2;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            } catch (java.lang.Throwable th3) {
                                th = th3;
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
                            depositOptionsResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                        } else if (ior instanceof arrow.core.Ior.Both) {
                            depositOptionsResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()));
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(depositOptionsResponse);
                    }
                }
                if (!(ior instanceof arrow.core.Ior.Left)) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e4) {
                e = e4;
                defaultRaise = defaultRaise2;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th4) {
                th = th4;
                defaultRaise = defaultRaise2;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            ior = (arrow.core.Ior) obj;
        } catch (arrow.core.raise.RaiseCancellationException e5) {
            e = e5;
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
        fetchDepositOptionsCall$execute$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall$execute$1(this, continuation);
        java.lang.Object obj2 = fetchDepositOptionsCall$execute$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchDepositOptionsCall$execute$1.isOutputSupportedForhNQ4ISI;
        if (i != 0) {
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse> parseResponse$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data> graphQLData) {
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data data;
        arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse> right;
        return (graphQLData == null || (data = graphQLData.getData()) == null || (right = arrow.core.EitherKt.right(com.paypal.oslo.feature.balance.data.mapper.DepositOptionsMapperKt.toDepositOptionsResponse(data))) == null) ? arrow.core.EitherKt.right(new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse(kotlin.collections.CollectionsKt.emptyList())) : right;
    }
}
