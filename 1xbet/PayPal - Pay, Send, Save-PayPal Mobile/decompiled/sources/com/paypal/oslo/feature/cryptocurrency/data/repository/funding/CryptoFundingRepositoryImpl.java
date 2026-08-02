package com.paypal.oslo.feature.cryptocurrency.data.repository.funding;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JL\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/funding/CryptoFundingRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/funding/CryptoFundingRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "currencyCode", "quoteQuantity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingOption;", "evaluateEligibleFundingOptions", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFundingRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CryptoFundingRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x012e A[Catch: all -> 0x0181, RaiseCancellationException -> 0x018a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x018a, all -> 0x0181, blocks: (B:11:0x0058, B:12:0x0124, B:15:0x012e, B:16:0x0153, B:18:0x0161, B:21:0x0170, B:22:0x017a, B:25:0x0146, B:26:0x017b, B:27:0x0180, B:31:0x006e, B:33:0x0077, B:34:0x0091, B:37:0x00a9, B:42:0x0089), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0161 A[Catch: all -> 0x0181, RaiseCancellationException -> 0x018a, TryCatch #2 {RaiseCancellationException -> 0x018a, all -> 0x0181, blocks: (B:11:0x0058, B:12:0x0124, B:15:0x012e, B:16:0x0153, B:18:0x0161, B:21:0x0170, B:22:0x017a, B:25:0x0146, B:26:0x017b, B:27:0x0180, B:31:0x006e, B:33:0x0077, B:34:0x0091, B:37:0x00a9, B:42:0x0089), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0170 A[Catch: all -> 0x0181, RaiseCancellationException -> 0x018a, TryCatch #2 {RaiseCancellationException -> 0x018a, all -> 0x0181, blocks: (B:11:0x0058, B:12:0x0124, B:15:0x012e, B:16:0x0153, B:18:0x0161, B:21:0x0170, B:22:0x017a, B:25:0x0146, B:26:0x017b, B:27:0x0180, B:31:0x006e, B:33:0x0077, B:34:0x0091, B:37:0x00a9, B:42:0x0089), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r5v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object evaluateEligibleFundingOptions(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption>>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1 cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1;
        ?? r5;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.api.Optional.Absent absent;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.Data data;
        try {
            if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1) {
                cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1) continuation;
                if ((cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDurationlomOqCM;
                    if (r5 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        if (str4 == null) {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(str3, str2));
                        } else {
                            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation evaluateCryptocurrencyEligibleFundingOptionsMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation(new com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyEligibleFundingOptionsInput(null, absent, com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImplKt.access$toGraphQL(cryptoTradeAction), com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str), str4 == null ? "0" : str4)), str3, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str), null, null, null, null, 961, null));
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cryptoTradeAction);
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputMinFrameDuration = defaultRaise;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputSizes = defaultRaise2;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateCryptocurrencyEligibleFundingOptionsMutation);
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputMinFrameDurationlomOqCM = defaultRaise2;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.Camera2StreamConfigurationMap = 0;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighSpeedVideoSizes = 0;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, evaluateCryptocurrencyEligibleFundingOptionsMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1, 2, (java.lang.Object) null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                        raise2 = raise;
                    } else {
                        if (r5 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighSpeedVideoFpsRanges;
                        int i2 = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighSpeedVideoSizes;
                        int i3 = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputMinFrameDurationlomOqCM;
                        raise2 = (arrow.core.raise.Raise) cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputSizes;
                        defaultRaise = (arrow.core.raise.DefaultRaise) cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputMinFrameDuration;
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
                    data = (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
                    if (data != null) {
                        raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.funding.FundingOptionsMapperKt.toDomain(data);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(domain);
                }
            }
            if (r5 != 0) {
            }
            either = ((arrow.core.Ior) obj).toEither();
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            data = (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
            if (data != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r5.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r5));
        } catch (java.lang.Throwable th) {
            r5.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1(this, continuation);
        java.lang.Object obj2 = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = cryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1.getOutputStallDurationlomOqCM;
    }
}
