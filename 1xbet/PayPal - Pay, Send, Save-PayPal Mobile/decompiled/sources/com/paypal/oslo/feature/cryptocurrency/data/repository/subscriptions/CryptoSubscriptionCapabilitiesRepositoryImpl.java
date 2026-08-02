package com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/subscriptions/CryptoSubscriptionCapabilitiesRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/subscriptions/CryptoSubscriptionCapabilitiesRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "getCryptoSubscriptionCapabilities", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSubscriptionCapabilitiesRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoSubscriptionCapabilitiesRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x00a2, B:15:0x00ac, B:16:0x00d1, B:18:0x00df, B:20:0x00e5, B:23:0x00f8, B:24:0x0102, B:27:0x00c4, B:28:0x0103, B:29:0x0108), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCryptoSubscriptionCapabilities(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability>>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1 cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1) {
            cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1) continuation;
            if ((cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery getCryptocurrencySubscriptionCapabilitiesQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery();
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getCryptocurrencySubscriptionCapabilitiesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getInputFormats = defaultRaise3;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCryptocurrencySubscriptionCapabilitiesQuery);
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoSizes = 0;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.Camera2StreamConfigurationMap = 0;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputMinFrameDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        raise2 = raise;
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
                    int i2 = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoFpsRanges;
                    int i3 = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.Camera2StreamConfigurationMap;
                    int i5 = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighSpeedVideoSizesFor;
                    raise2 = (arrow.core.raise.Raise) cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getHighResolutionOutputSizeshNQ4ISI;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
                if (data != null || (cryptocurrencySubscriptions = data.getCryptocurrencySubscriptions()) == null) {
                    raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.subscriptions.SubscriptionCapabilityMapperKt.toDomain(cryptocurrencySubscriptions.getCapabilities());
                defaultRaise2.complete();
                return new arrow.core.Either.Right(domain);
            }
        }
        cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1(this, continuation);
        java.lang.Object obj2 = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
        if (data != null) {
        }
        raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }
}
