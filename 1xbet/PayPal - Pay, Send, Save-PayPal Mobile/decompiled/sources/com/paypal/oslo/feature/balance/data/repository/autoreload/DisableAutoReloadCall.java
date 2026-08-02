package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086@¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/DisableAutoReloadCall;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadScheduleType;", "Lcom/paypal/oslo/feature/balance/graphql/type/BalanceAutoReloadScheduleType;", "scheduleType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadDisableResult;", "execute", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadScheduleType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/balance/graphql/DisableBalanceAutoReloadMutation$Data;", "graphQLData", "parseResponse$balance_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisableAutoReloadCall {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DisableAutoReloadCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b A[Catch: all -> 0x0130, RaiseCancellationException -> 0x0139, TryCatch #2 {RaiseCancellationException -> 0x0139, all -> 0x0130, blocks: (B:11:0x004a, B:12:0x00ce, B:17:0x00d8, B:18:0x010a, B:23:0x00ef, B:24:0x0115, B:25:0x011a, B:26:0x011b, B:27:0x012f, B:31:0x0060), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType balanceAutoReloadScheduleType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall$execute$1 disableAutoReloadCall$execute$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult autoReloadDisableResult;
        try {
            if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall$execute$1) {
                disableAutoReloadCall$execute$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall$execute$1) continuation;
                if ((disableAutoReloadCall$execute$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                    disableAutoReloadCall$execute$1.getOutputStallDuration -= 2147483648;
                    java.lang.Object obj = disableAutoReloadCall$execute$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = disableAutoReloadCall$execute$1.getOutputStallDuration;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.balance.graphql.DisableBalanceAutoReloadMutation disableBalanceAutoReloadMutation = new com.paypal.oslo.feature.balance.graphql.DisableBalanceAutoReloadMutation(new com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoReloadInput(balanceAutoReloadScheduleType));
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.mutation(disableBalanceAutoReloadMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("balance_auto_reload_disable", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                        disableAutoReloadCall$execute$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceAutoReloadScheduleType);
                        disableAutoReloadCall$execute$1.getInputFormats = defaultRaise;
                        disableAutoReloadCall$execute$1.getInputSizeshNQ4ISI = defaultRaise2;
                        disableAutoReloadCall$execute$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(disableBalanceAutoReloadMutation);
                        disableAutoReloadCall$execute$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                        disableAutoReloadCall$execute$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                        disableAutoReloadCall$execute$1.getHighSpeedVideoFpsRangesFor = 0;
                        disableAutoReloadCall$execute$1.Camera2StreamConfigurationMap = 0;
                        disableAutoReloadCall$execute$1.getHighSpeedVideoFpsRanges = 0;
                        disableAutoReloadCall$execute$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        disableAutoReloadCall$execute$1.getOutputStallDuration = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, disableAutoReloadCall$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = disableAutoReloadCall$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = disableAutoReloadCall$execute$1.getHighSpeedVideoFpsRanges;
                        int i3 = disableAutoReloadCall$execute$1.Camera2StreamConfigurationMap;
                        int i4 = disableAutoReloadCall$execute$1.getHighSpeedVideoFpsRangesFor;
                        raise = (arrow.core.raise.Raise) disableAutoReloadCall$execute$1.getInputSizeshNQ4ISI;
                        defaultRaise = (arrow.core.raise.DefaultRaise) disableAutoReloadCall$execute$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.toAutoReloadError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        autoReloadDisableResult = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        autoReloadDisableResult = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult) raise.bind(parseResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(autoReloadDisableResult);
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
        disableAutoReloadCall$execute$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall$execute$1(this, continuation);
        java.lang.Object obj2 = disableAutoReloadCall$execute$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = disableAutoReloadCall$execute$1.getOutputStallDuration;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult> parseResponse$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.DisableBalanceAutoReloadMutation.Data> graphQLData) {
        com.paypal.oslo.feature.balance.graphql.DisableBalanceAutoReloadMutation.Data data;
        com.paypal.oslo.feature.balance.graphql.DisableBalanceAutoReloadMutation.DisableBalanceAutoReload disableBalanceAutoReload;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (disableBalanceAutoReload = data.getDisableBalanceAutoReload()) == null) {
                defaultRaise2.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (disableBalanceAutoReload.getSuccess()) {
                com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult autoReloadDisableResult = new com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult(true);
                defaultRaise.complete();
                return new arrow.core.Either.Right(autoReloadDisableResult);
            }
            defaultRaise2.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE);
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
