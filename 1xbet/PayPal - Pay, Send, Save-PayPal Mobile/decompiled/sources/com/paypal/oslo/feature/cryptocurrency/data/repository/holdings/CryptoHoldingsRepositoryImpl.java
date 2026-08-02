package com.paypal.oslo.feature.cryptocurrency.data.repository.holdings;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/holdings/CryptoHoldingsRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "", "currencyCode", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "forceNetwork", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "getCryptoHoldings", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHoldingsRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CryptoHoldingsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0118 A[Catch: all -> 0x0051, RaiseCancellationException -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0054, all -> 0x0051, blocks: (B:11:0x004c, B:12:0x010e, B:15:0x0118, B:16:0x013d, B:18:0x014b, B:20:0x0151, B:23:0x0160, B:24:0x016a, B:27:0x0130, B:28:0x016b, B:29:0x0170), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCryptoHoldings(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl$getCryptoHoldings$1 cryptoHoldingsRepositoryImpl$getCryptoHoldings$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.ApolloCall query;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        com.apollographql.apollo.api.Optional.Present present;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl$getCryptoHoldings$1) {
            cryptoHoldingsRepositoryImpl$getCryptoHoldings$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl$getCryptoHoldings$1) continuation;
            if ((cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(str);
                        com.apollographql.apollo.api.Optional.Present present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRangesFor.isGainsAndLossesEnabled()));
                        if (str2 != null && (present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str2))) != null) {
                            absent = present;
                        } else {
                            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery getCryptocurrencyHoldingsQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput(absent, present2, present3, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRangesFor.isPyusdRewardsEnabled()))));
                        if (z) {
                            query = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.query(getCryptocurrencyHoldingsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        } else {
                            query = this.getHighSpeedVideoSizes.query(getCryptocurrencyHoldingsQuery);
                        }
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getInputSizeshNQ4ISI = defaultRaise;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputMinFrameDuration = defaultRaise3;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCryptocurrencyHoldingsQuery);
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputMinFrameDurationlomOqCM = z;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoSizes = 0;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, cryptoHoldingsRepositoryImpl$getCryptoHoldings$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
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
                    int i2 = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoSizes;
                    int i5 = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoFpsRanges;
                    boolean z2 = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputMinFrameDurationlomOqCM;
                    raise2 = (arrow.core.raise.Raise) cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputMinFrameDuration;
                    raise = (arrow.core.raise.Raise) cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getInputSizeshNQ4ISI;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null || (cryptocurrencyHoldings = data.getCryptocurrencyHoldings()) == null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.holdings.CryptoHoldingsMapperKt.toDomain(cryptocurrencyHoldings);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(domain);
            }
        }
        cryptoHoldingsRepositoryImpl$getCryptoHoldings$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl$getCryptoHoldings$1(this, continuation);
        java.lang.Object obj2 = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoHoldingsRepositoryImpl$getCryptoHoldings$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
        raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }
}
