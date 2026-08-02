package com.paypal.oslo.feature.cryptocurrency.data.repository.trade;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/trade/CryptoTradeRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/trade/CryptoTradeRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteId", "", "pyusdRewardsOptIn", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "executeTrade", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoTradeRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0139 A[Catch: all -> 0x005c, RaiseCancellationException -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005f, all -> 0x005c, blocks: (B:11:0x0057, B:12:0x012f, B:15:0x0139, B:16:0x015e, B:18:0x016c, B:23:0x0178, B:26:0x018b, B:27:0x0190, B:28:0x0191, B:29:0x01a1, B:30:0x01a2, B:31:0x01ac, B:34:0x0151, B:35:0x01ad, B:36:0x01b2), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016c A[Catch: all -> 0x005c, RaiseCancellationException -> 0x005f, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005f, all -> 0x005c, blocks: (B:11:0x0057, B:12:0x012f, B:15:0x0139, B:16:0x015e, B:18:0x016c, B:23:0x0178, B:26:0x018b, B:27:0x0190, B:28:0x0191, B:29:0x01a1, B:30:0x01a2, B:31:0x01ac, B:34:0x0151, B:35:0x01ad, B:36:0x01b2), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a2 A[Catch: all -> 0x005c, RaiseCancellationException -> 0x005f, TryCatch #4 {RaiseCancellationException -> 0x005f, all -> 0x005c, blocks: (B:11:0x0057, B:12:0x012f, B:15:0x0139, B:16:0x015e, B:18:0x016c, B:23:0x0178, B:26:0x018b, B:27:0x0190, B:28:0x0191, B:29:0x01a1, B:30:0x01a2, B:31:0x01ac, B:34:0x0151, B:35:0x01ad, B:36:0x01b2), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeTrade(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1 cryptoTradeRepositoryImpl$executeTrade$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.api.Optional.Absent absent;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1) {
            cryptoTradeRepositoryImpl$executeTrade$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1) continuation;
            if ((cryptoTradeRepositoryImpl$executeTrade$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                cryptoTradeRepositoryImpl$executeTrade$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1 cryptoTradeRepositoryImpl$executeTrade$12 = cryptoTradeRepositoryImpl$executeTrade$1;
                java.lang.Object obj = cryptoTradeRepositoryImpl$executeTrade$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoTradeRepositoryImpl$executeTrade$12.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType.REWARD_APY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_IN));
                        } else {
                            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation executeCryptocurrencyTradeMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation(new com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str), com.apollographql.apollo.api.Optional.INSTANCE.present(str2), com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction.INSTANCE.safeValueOf(cryptoTradeAction.name()), null, null, null, null, null, absent, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null));
                        cryptoTradeRepositoryImpl$executeTrade$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cryptoTradeAction);
                        cryptoTradeRepositoryImpl$executeTrade$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoTradeRepositoryImpl$executeTrade$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                        cryptoTradeRepositoryImpl$executeTrade$12.getOutputFormats = defaultRaise;
                        cryptoTradeRepositoryImpl$executeTrade$12.getInputSizeshNQ4ISI = defaultRaise3;
                        cryptoTradeRepositoryImpl$executeTrade$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(absent);
                        cryptoTradeRepositoryImpl$executeTrade$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(executeCryptocurrencyTradeMutation);
                        cryptoTradeRepositoryImpl$executeTrade$12.getOutputSizeshNQ4ISI = defaultRaise3;
                        cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoSizes = 0;
                        cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoFpsRanges = 0;
                        cryptoTradeRepositoryImpl$executeTrade$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoTradeRepositoryImpl$executeTrade$12.getOutputMinFrameDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges, executeCryptocurrencyTradeMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoTradeRepositoryImpl$executeTrade$12, 2, (java.lang.Object) null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        raise2 = raise;
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
                    int i2 = cryptoTradeRepositoryImpl$executeTrade$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoFpsRanges;
                    int i4 = cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = cryptoTradeRepositoryImpl$executeTrade$12.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) cryptoTradeRepositoryImpl$executeTrade$12.getOutputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) cryptoTradeRepositoryImpl$executeTrade$12.getInputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoTradeRepositoryImpl$executeTrade$12.getOutputFormats;
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
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.cryptocurrency.data.error.CryptocurrencyErrorMapperKt.toCryptocurrencyError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
                if (data != null) {
                    raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.trade.TradeExecutionMapperKt.toDomain(data);
                if (domain instanceof arrow.core.Either.Left) {
                    raise2.raise((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) domain).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (domain instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution cryptoTradeExecution = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution) ((arrow.core.Either.Right) domain).getValue();
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(cryptoTradeExecution);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cryptoTradeRepositoryImpl$executeTrade$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1 cryptoTradeRepositoryImpl$executeTrade$122 = cryptoTradeRepositoryImpl$executeTrade$1;
        java.lang.Object obj2 = cryptoTradeRepositoryImpl$executeTrade$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoTradeRepositoryImpl$executeTrade$122.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
        if (data != null) {
        }
    }
}
