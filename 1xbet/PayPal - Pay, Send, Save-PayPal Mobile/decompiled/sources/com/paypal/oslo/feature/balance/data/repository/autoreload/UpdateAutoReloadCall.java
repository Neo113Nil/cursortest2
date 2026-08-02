package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadResponse;", "execute", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/balance/graphql/UpdateBalanceAutoReloadMutation$Data;", "graphQLData", "parseResponse$balance_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateAutoReloadCall {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdateAutoReloadCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187 A[Catch: all -> 0x019c, RaiseCancellationException -> 0x01a5, TryCatch #2 {RaiseCancellationException -> 0x01a5, all -> 0x019c, blocks: (B:11:0x004a, B:12:0x0115, B:17:0x011f, B:18:0x0157, B:23:0x0136, B:26:0x014f, B:29:0x0166, B:30:0x017a, B:31:0x017b, B:32:0x0180, B:33:0x0181, B:34:0x0186, B:35:0x0187, B:36:0x019b, B:40:0x0060), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest updateAutoReloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall$execute$1 updateAutoReloadCall$execute$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse updateAutoReloadResponse;
        try {
            if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall$execute$1) {
                updateAutoReloadCall$execute$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall$execute$1) continuation;
                if ((updateAutoReloadCall$execute$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    updateAutoReloadCall$execute$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = updateAutoReloadCall$execute$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = updateAutoReloadCall$execute$1.getOutputStallDurationlomOqCM;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation updateBalanceAutoReloadMutation = new com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateBalanceAutoReloadInput(updateAutoReloadRequest.getBalanceId(), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toBalanceAutoReloadScheduleType(updateAutoReloadRequest.getScheduleType()), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toMoneyInput(updateAutoReloadRequest.getReloadAmount()), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toMoneyInput(updateAutoReloadRequest.getThresholdAmount()), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toOptional(updateAutoReloadRequest.getFinancialInstrumentId()), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toOptional(updateAutoReloadRequest.getStartDate()), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toBalanceAutoReloadRecurrence(updateAutoReloadRequest.getRecurrence()), null, null, null, 896, null));
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.mutation(updateBalanceAutoReloadMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("balance_auto_reload_update", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                        updateAutoReloadCall$execute$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateAutoReloadRequest);
                        updateAutoReloadCall$execute$1.getHighSpeedVideoSizesFor = defaultRaise;
                        updateAutoReloadCall$execute$1.getInputSizeshNQ4ISI = defaultRaise2;
                        updateAutoReloadCall$execute$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateBalanceAutoReloadMutation);
                        updateAutoReloadCall$execute$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                        updateAutoReloadCall$execute$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                        updateAutoReloadCall$execute$1.getHighSpeedVideoFpsRanges = 0;
                        updateAutoReloadCall$execute$1.Camera2StreamConfigurationMap = 0;
                        updateAutoReloadCall$execute$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        updateAutoReloadCall$execute$1.getHighSpeedVideoSizes = 0;
                        updateAutoReloadCall$execute$1.getOutputStallDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, updateAutoReloadCall$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = updateAutoReloadCall$execute$1.getHighSpeedVideoSizes;
                        int i2 = updateAutoReloadCall$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = updateAutoReloadCall$execute$1.Camera2StreamConfigurationMap;
                        int i4 = updateAutoReloadCall$execute$1.getHighSpeedVideoFpsRanges;
                        raise = (arrow.core.raise.Raise) updateAutoReloadCall$execute$1.getInputSizeshNQ4ISI;
                        defaultRaise = (arrow.core.raise.DefaultRaise) updateAutoReloadCall$execute$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toAutoReloadError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        updateAutoReloadResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse> parseResponse$balance_prodRelease = parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue());
                        if (!(parseResponse$balance_prodRelease instanceof arrow.core.Either.Right)) {
                            if (parseResponse$balance_prodRelease instanceof arrow.core.Either.Left) {
                                raise.raise(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toAutoReloadError(callError));
                                throw new kotlin.KotlinNothingValueException();
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        updateAutoReloadResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse) ((arrow.core.Either.Right) parseResponse$balance_prodRelease).getValue();
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(updateAutoReloadResponse);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        updateAutoReloadCall$execute$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall$execute$1(this, continuation);
        java.lang.Object obj2 = updateAutoReloadCall$execute$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = updateAutoReloadCall$execute$1.getOutputStallDurationlomOqCM;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse> parseResponse$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data> graphQLData) {
        com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.Data data;
        com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.UpdateBalanceAutoReload updateBalanceAutoReload;
        com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold;
        com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (updateBalanceAutoReload = data.getUpdateBalanceAutoReload()) == null) {
                defaultRaise2.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.balance.graphql.UpdateBalanceAutoReloadMutation.BalanceAutoReload balanceAutoReload = updateBalanceAutoReload.getBalanceAutoReload();
            if (balanceAutoReload != null && (onBalanceAutoReloadThreshold = balanceAutoReload.getOnBalanceAutoReloadThreshold()) != null && (operationStatus = onBalanceAutoReloadThreshold.getOperationStatus()) != null && operationStatus != com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus.SUCCESS) {
                defaultRaise2.raise(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.mapOperationStatus(operationStatus));
                throw new kotlin.KotlinNothingValueException();
            }
            if (updateBalanceAutoReload.getSuccess()) {
                com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse updateAutoReloadResponse = new com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse(true);
                defaultRaise.complete();
                return new arrow.core.Either.Right(updateAutoReloadResponse);
            }
            defaultRaise2.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE);
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
