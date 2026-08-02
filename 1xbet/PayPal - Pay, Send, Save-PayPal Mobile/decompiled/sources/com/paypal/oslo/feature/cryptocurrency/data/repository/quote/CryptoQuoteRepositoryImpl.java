package com.paypal.oslo.feature.cryptocurrency.data.repository.quote;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/quote/CryptoQuoteRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteFiatAmount", "quoteQuantity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "generateQuote", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoQuoteRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CryptoQuoteRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0156 A[Catch: all -> 0x0063, RaiseCancellationException -> 0x0066, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0066, all -> 0x0063, blocks: (B:11:0x005e, B:12:0x014c, B:15:0x0156, B:16:0x017b, B:18:0x0189, B:23:0x0195, B:26:0x01a8, B:27:0x01ad, B:28:0x01ae, B:29:0x01be, B:30:0x01bf, B:31:0x01c9, B:34:0x016e, B:35:0x01ca, B:36:0x01cf), top: B:10:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0189 A[Catch: all -> 0x0063, RaiseCancellationException -> 0x0066, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0066, all -> 0x0063, blocks: (B:11:0x005e, B:12:0x014c, B:15:0x0156, B:16:0x017b, B:18:0x0189, B:23:0x0195, B:26:0x01a8, B:27:0x01ad, B:28:0x01ae, B:29:0x01be, B:30:0x01bf, B:31:0x01c9, B:34:0x016e, B:35:0x01ca, B:36:0x01cf), top: B:10:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bf A[Catch: all -> 0x0063, RaiseCancellationException -> 0x0066, TryCatch #4 {RaiseCancellationException -> 0x0066, all -> 0x0063, blocks: (B:11:0x005e, B:12:0x014c, B:15:0x0156, B:16:0x017b, B:18:0x0189, B:23:0x0195, B:26:0x01a8, B:27:0x01ad, B:28:0x01ae, B:29:0x01be, B:30:0x01bf, B:31:0x01c9, B:34:0x016e, B:35:0x01ca, B:36:0x01cf), top: B:10:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateQuote(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl$generateQuote$1 cryptoQuoteRepositoryImpl$generateQuote$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl$generateQuote$1) {
            cryptoQuoteRepositoryImpl$generateQuote$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl$generateQuote$1) continuation;
            if ((cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = cryptoQuoteRepositoryImpl$generateQuote$1.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyQuoteAction safeValueOf = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyQuoteAction.INSTANCE.safeValueOf(cryptoTradeAction.name());
                        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str);
                        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(str3);
                        if (str5 == null) {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(str2, str4));
                        } else {
                            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.apollographql.apollo.api.Optional optional = absent;
                        if (str5 != null) {
                            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str), str5));
                        } else {
                            absent2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation generateCryptocurrencyQuoteMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation(new com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput(present, safeValueOf2, str2, optional, safeValueOf, null, absent2, null, null, null, null, null, null, 8096, null));
                        cryptoQuoteRepositoryImpl$generateQuote$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cryptoTradeAction);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDuration = defaultRaise;
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputSizeshNQ4ISI = defaultRaise3;
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(generateCryptocurrencyQuoteMutation);
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputMinFrameDurationlomOqCM = defaultRaise3;
                        cryptoQuoteRepositoryImpl$generateQuote$1.getHighSpeedVideoSizes = 0;
                        cryptoQuoteRepositoryImpl$generateQuote$1.Camera2StreamConfigurationMap = 0;
                        cryptoQuoteRepositoryImpl$generateQuote$1.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoQuoteRepositoryImpl$generateQuote$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, generateCryptocurrencyQuoteMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoQuoteRepositoryImpl$generateQuote$1, 2, (java.lang.Object) null);
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
                    int i2 = cryptoQuoteRepositoryImpl$generateQuote$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = cryptoQuoteRepositoryImpl$generateQuote$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = cryptoQuoteRepositoryImpl$generateQuote$1.Camera2StreamConfigurationMap;
                    int i5 = cryptoQuoteRepositoryImpl$generateQuote$1.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) cryptoQuoteRepositoryImpl$generateQuote$1.getOutputMinFrameDurationlomOqCM;
                    raise = (arrow.core.raise.Raise) cryptoQuoteRepositoryImpl$generateQuote$1.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDuration;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.quote.QuoteMapperKt.toDomain(data);
                if (domain instanceof arrow.core.Either.Left) {
                    raise.raise((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) domain).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (domain instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote cryptoQuote = (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote) ((arrow.core.Either.Right) domain).getValue();
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(cryptoQuote);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cryptoQuoteRepositoryImpl$generateQuote$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl$generateQuote$1(this, continuation);
        java.lang.Object obj2 = cryptoQuoteRepositoryImpl$generateQuote$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoQuoteRepositoryImpl$generateQuote$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }
}
