package com.paypal.oslo.feature.cryptocurrency.data.repository.prices;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/prices/CryptoMarketPricesRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "currencyCode", "", "forceNetwork", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "getCurrentMarketPrices", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "getCurrentAssetPriceDetails", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "priceTimeRange", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "getAssetPriceHistory", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoMarketPricesRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoMarketPricesRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[Catch: all -> 0x0053, RaiseCancellationException -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x0056, all -> 0x0053, blocks: (B:11:0x004e, B:12:0x00cd, B:15:0x00d7, B:16:0x00fc, B:18:0x010a, B:20:0x0110, B:23:0x011f, B:24:0x0129, B:27:0x00ef, B:28:0x012a, B:29:0x012f, B:33:0x006a, B:35:0x0081, B:36:0x009e, B:40:0x0095), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r5v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCurrentMarketPrices(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1 cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1;
        ?? r5;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.ApolloCall query;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices;
        try {
            if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1) {
                cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1) continuation;
                if ((cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDurationlomOqCM;
                    if (r5 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery getCryptocurrencyMarketPricesQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput(null, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.PRESENT, str, 1, null));
                        if (z) {
                            query = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getCryptocurrencyMarketPricesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        } else {
                            query = this.getHighSpeedVideoFpsRanges.query(getCryptocurrencyMarketPricesQuery);
                        }
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDuration = defaultRaise;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCryptocurrencyMarketPricesQuery);
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getInputSizeshNQ4ISI = defaultRaise2;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputStallDuration = z;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.Camera2StreamConfigurationMap = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoSizes = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                        raise2 = raise;
                    } else {
                        if (r5 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoSizes;
                        int i2 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoFpsRanges;
                        int i3 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.Camera2StreamConfigurationMap;
                        int i4 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z2 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputStallDuration;
                        raise = (arrow.core.raise.Raise) cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getInputSizeshNQ4ISI;
                        raise2 = (arrow.core.raise.Raise) cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
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
                    data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
                    if (data != null || (cryptocurrencyMarketPrices = data.getCryptocurrencyMarketPrices()) == null) {
                        raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.prices.CryptoMarketPricesMapperKt.toDomain(cryptocurrencyMarketPrices);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(domain);
                }
            }
            if (r5 != 0) {
            }
            either = ((arrow.core.Ior) obj).toEither();
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
            if (data != null) {
            }
            raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r5.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r5));
        } catch (java.lang.Throwable th) {
            r5.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1(this, continuation);
        java.lang.Object obj2 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = cryptoMarketPricesRepositoryImpl$getCurrentMarketPrices$1.getOutputMinFrameDurationlomOqCM;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4 A[Catch: all -> 0x0051, RaiseCancellationException -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0054, all -> 0x0051, blocks: (B:11:0x004c, B:12:0x00da, B:15:0x00e4, B:16:0x0109, B:18:0x0117, B:20:0x011d, B:22:0x0123, B:25:0x012e, B:26:0x0138, B:27:0x0139, B:28:0x0143, B:31:0x00fc, B:32:0x0144, B:33:0x0149), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCurrentAssetPriceDetails(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1 cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.ApolloCall query;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1) {
            cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1) continuation;
            if ((cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery getCryptocurrencyMarketPricesQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput(new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str)), com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.PRESENT, str2));
                        if (z) {
                            query = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getCryptocurrencyMarketPricesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        } else {
                            query = this.getHighSpeedVideoFpsRanges.query(getCryptocurrencyMarketPricesQuery);
                        }
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputMinFrameDuration = defaultRaise;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCryptocurrencyMarketPricesQuery);
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputSizeshNQ4ISI = defaultRaise3;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputMinFrameDurationlomOqCM = z;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoSizes = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1, 2, null);
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
                    int i2 = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoSizes;
                    int i5 = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoFpsRanges;
                    boolean z2 = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputMinFrameDurationlomOqCM;
                    raise2 = (arrow.core.raise.Raise) cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputMinFrameDuration;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null || (cryptocurrencyMarketPrices = data.getCryptocurrencyMarketPrices()) == null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails domainAssetPriceDetails = com.paypal.oslo.feature.cryptocurrency.data.mapper.prices.CryptoMarketPricesMapperKt.toDomainAssetPriceDetails(cryptocurrencyMarketPrices);
                if (domainAssetPriceDetails == null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(domainAssetPriceDetails);
            }
        }
        cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1(this, continuation);
        java.lang.Object obj2 = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
        raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100 A[Catch: all -> 0x0171, RaiseCancellationException -> 0x017b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x017b, all -> 0x0171, blocks: (B:13:0x00f6, B:16:0x0100, B:17:0x0125, B:19:0x0133, B:21:0x0139, B:23:0x013f, B:26:0x014a, B:27:0x0154, B:28:0x0155, B:29:0x015f, B:32:0x0118, B:33:0x0160, B:34:0x0165, B:46:0x0080, B:48:0x0089, B:50:0x00a2, B:51:0x00bf, B:55:0x00b6, B:56:0x0166, B:57:0x0170), top: B:45:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v24, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r2v14, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAssetPriceHistory(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1 cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.apollographql.apollo.ApolloCall query;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange2;
        java.lang.Object obj;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1) {
            cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1) continuation;
            if ((cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange graphQLType = com.paypal.oslo.feature.cryptocurrency.data.mapper.prices.CryptoMarketPricesMapperKt.toGraphQLType(priceTimeRange);
                        if (graphQLType == null) {
                            defaultRaise3.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery getCryptocurrencyMarketPricesQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput(new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str3)), graphQLType, str4));
                        if (z) {
                            query = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getCryptocurrencyMarketPricesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        } else {
                            query = this.getHighSpeedVideoFpsRanges.query(getCryptocurrencyMarketPricesQuery);
                        }
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getInputSizeshNQ4ISI = str4;
                        priceTimeRange2 = priceTimeRange;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoSizesFor = priceTimeRange2;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputFormats = defaultRaise;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getInputFormats = defaultRaise3;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCryptocurrencyMarketPricesQuery);
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLType);
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputStallDurationlomOqCM = defaultRaise3;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizeshNQ4ISI = z;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoSizes = 0;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.Camera2StreamConfigurationMap = 0;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizes = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = execute$default;
                        defaultRaise4 = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.Camera2StreamConfigurationMap;
                    int i4 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoFpsRanges;
                    int i5 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoSizes;
                    boolean z2 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizeshNQ4ISI;
                    ?? r0 = (arrow.core.raise.Raise) cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputStallDurationlomOqCM;
                    ?? r2 = (arrow.core.raise.Raise) cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputFormats;
                    com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange3 = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange) cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighSpeedVideoSizesFor;
                    java.lang.String str5 = (java.lang.String) cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getInputSizeshNQ4ISI;
                    java.lang.String str6 = (java.lang.String) cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        defaultRaise3 = r0;
                        str3 = str6;
                        priceTimeRange2 = priceTimeRange3;
                        obj = obj2;
                        defaultRaise = defaultRaise2;
                        defaultRaise4 = r2;
                        str4 = str5;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2.complete();
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) defaultRaise3.bind(right)).getData();
                if (data != null || (cryptocurrencyMarketPrices = data.getCryptocurrencyMarketPrices()) == null) {
                    defaultRaise4.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory domainAssetPriceHistory = com.paypal.oslo.feature.cryptocurrency.data.mapper.prices.CryptoMarketPricesMapperKt.toDomainAssetPriceHistory(cryptocurrencyMarketPrices, str3, priceTimeRange2, str4);
                if (domainAssetPriceHistory == null) {
                    defaultRaise4.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(domainAssetPriceHistory);
            }
        }
        cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1(this, continuation);
        java.lang.Object obj22 = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1.getOutputSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) defaultRaise3.bind(right)).getData();
        if (data != null) {
        }
        defaultRaise4.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }
}
