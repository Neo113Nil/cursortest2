package com.paypal.oslo.feature.cryptocurrency.data.repository.receive;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/receive/CryptoReceiveRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/receive/CryptoReceiveRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "transactionTrackingId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/EvaluationResult;", "evaluateCryptocurrencyTrade", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "blockchain", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/ReceiveAddress;", "generateReceiveAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;", "getAvailableNetworks", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoReceiveRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CryptoReceiveRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00da A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x004b, B:12:0x00d0, B:15:0x00da, B:16:0x00ff, B:18:0x010d, B:23:0x0119, B:26:0x012c, B:27:0x0131, B:28:0x0132, B:29:0x0142, B:30:0x0143, B:31:0x014d, B:34:0x00f2, B:35:0x014e, B:36:0x0153), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010d A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x004b, B:12:0x00d0, B:15:0x00da, B:16:0x00ff, B:18:0x010d, B:23:0x0119, B:26:0x012c, B:27:0x0131, B:28:0x0132, B:29:0x0142, B:30:0x0143, B:31:0x014d, B:34:0x00f2, B:35:0x014e, B:36:0x0153), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143 A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TryCatch #4 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x004b, B:12:0x00d0, B:15:0x00da, B:16:0x00ff, B:18:0x010d, B:23:0x0119, B:26:0x012c, B:27:0x0131, B:28:0x0132, B:29:0x0142, B:30:0x0143, B:31:0x014d, B:34:0x00f2, B:35:0x014e, B:36:0x0153), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object evaluateCryptocurrencyTrade(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1 cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1) {
            cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1) continuation;
            if ((cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1 cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1;
                java.lang.Object obj = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation evaluateCryptocurrencyTradeMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation(new com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str2), null, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction.RECEIVE, null, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluationIntent.ELIGIBILITY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str), null, null, 202, null));
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoSizesFor = defaultRaise;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getInputFormats = defaultRaise3;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateCryptocurrencyTradeMutation);
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getOutputFormats = defaultRaise3;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoSizes = 0;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoFpsRanges = 0;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getOutputStallDuration = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, evaluateCryptocurrencyTradeMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12, 2, (java.lang.Object) null);
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
                    int i2 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoFpsRanges;
                    int i4 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getOutputFormats;
                    raise2 = (arrow.core.raise.Raise) cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$12.getHighSpeedVideoSizesFor;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
                if (data != null) {
                    raise2.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.receive.EvaluationResultMapperKt.toDomain(data);
                if (domain instanceof arrow.core.Either.Left) {
                    raise2.raise((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) domain).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (domain instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult evaluationResult = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult) ((arrow.core.Either.Right) domain).getValue();
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(evaluationResult);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1 cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$122 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1;
        java.lang.Object obj2 = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$122.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$122.getOutputStallDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0127 A[Catch: all -> 0x005c, RaiseCancellationException -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x005f, all -> 0x005c, blocks: (B:11:0x0057, B:12:0x011d, B:15:0x0127, B:16:0x014c, B:18:0x015a, B:23:0x0166, B:26:0x0179, B:27:0x017e, B:28:0x017f, B:29:0x018f, B:30:0x0190, B:31:0x019a, B:34:0x013f, B:35:0x019b, B:36:0x01a0), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015a A[Catch: all -> 0x005c, RaiseCancellationException -> 0x005f, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x005f, all -> 0x005c, blocks: (B:11:0x0057, B:12:0x011d, B:15:0x0127, B:16:0x014c, B:18:0x015a, B:23:0x0166, B:26:0x0179, B:27:0x017e, B:28:0x017f, B:29:0x018f, B:30:0x0190, B:31:0x019a, B:34:0x013f, B:35:0x019b, B:36:0x01a0), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190 A[Catch: all -> 0x005c, RaiseCancellationException -> 0x005f, TryCatch #3 {RaiseCancellationException -> 0x005f, all -> 0x005c, blocks: (B:11:0x0057, B:12:0x011d, B:15:0x0127, B:16:0x014c, B:18:0x015a, B:23:0x0166, B:26:0x0179, B:27:0x017e, B:28:0x017f, B:29:0x018f, B:30:0x0190, B:31:0x019a, B:34:0x013f, B:35:0x019b, B:36:0x01a0), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateReceiveAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$generateReceiveAddress$1 cryptoReceiveRepositoryImpl$generateReceiveAddress$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.api.Optional.Absent absent;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$generateReceiveAddress$1) {
            cryptoReceiveRepositoryImpl$generateReceiveAddress$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$generateReceiveAddress$1) continuation;
            if ((cryptoReceiveRepositoryImpl$generateReceiveAddress$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                cryptoReceiveRepositoryImpl$generateReceiveAddress$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$generateReceiveAddress$1 cryptoReceiveRepositoryImpl$generateReceiveAddress$12 = cryptoReceiveRepositoryImpl$generateReceiveAddress$1;
                java.lang.Object obj = cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol safeValueOf = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str);
                        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction cryptocurrencyTransferAction = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction.RECEIVE;
                        if (str2 != null && str3 != null) {
                            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                            com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.INSTANCE.safeValueOf(str2));
                            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String lowerCase = str3.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            absent = companion.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetworkInput(present, companion2.present(lowerCase)));
                        } else {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                        }
                        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation generateCryptocurrencyAddressMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput(safeValueOf, cryptocurrencyTransferAction, com.apollographql.apollo.api.Optional.INSTANCE.present(str4), null, absent, 8, null));
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoSizesFor = defaultRaise;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputFormats = defaultRaise3;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(generateCryptocurrencyAddressMutation);
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputMinFrameDurationlomOqCM = defaultRaise3;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.Camera2StreamConfigurationMap = 0;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoFpsRanges = 0;
                        cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, generateCryptocurrencyAddressMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoReceiveRepositoryImpl$generateReceiveAddress$12, 2, (java.lang.Object) null);
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
                    int i2 = cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoFpsRanges;
                    int i3 = cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = cryptoReceiveRepositoryImpl$generateReceiveAddress$12.Camera2StreamConfigurationMap;
                    int i5 = cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoFpsRangesFor;
                    raise2 = (arrow.core.raise.Raise) cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputMinFrameDurationlomOqCM;
                    raise = (arrow.core.raise.Raise) cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoReceiveRepositoryImpl$generateReceiveAddress$12.getHighSpeedVideoSizesFor;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.receive.ReceiveAddressMapperKt.toDomain(data);
                if (domain instanceof arrow.core.Either.Left) {
                    raise.raise((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) domain).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (domain instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress receiveAddress = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress) ((arrow.core.Either.Right) domain).getValue();
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(receiveAddress);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cryptoReceiveRepositoryImpl$generateReceiveAddress$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$generateReceiveAddress$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$generateReceiveAddress$1 cryptoReceiveRepositoryImpl$generateReceiveAddress$122 = cryptoReceiveRepositoryImpl$generateReceiveAddress$1;
        java.lang.Object obj2 = cryptoReceiveRepositoryImpl$generateReceiveAddress$122.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoReceiveRepositoryImpl$generateReceiveAddress$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00b7, B:15:0x00c1, B:16:0x00e6, B:18:0x00f4, B:23:0x0100, B:26:0x0113, B:27:0x0118, B:28:0x0119, B:29:0x0129, B:30:0x012a, B:31:0x0134, B:34:0x00d9, B:35:0x0135, B:36:0x013a), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00b7, B:15:0x00c1, B:16:0x00e6, B:18:0x00f4, B:23:0x0100, B:26:0x0113, B:27:0x0118, B:28:0x0119, B:29:0x0129, B:30:0x012a, B:31:0x0134, B:34:0x00d9, B:35:0x0135, B:36:0x013a), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012a A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #4 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00b7, B:15:0x00c1, B:16:0x00e6, B:18:0x00f4, B:23:0x0100, B:26:0x0113, B:27:0x0118, B:28:0x0119, B:29:0x0129, B:30:0x012a, B:31:0x0134, B:34:0x00d9, B:35:0x0135, B:36:0x013a), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAvailableNetworks(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork>>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1 cryptoReceiveRepositoryImpl$getAvailableNetworks$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data data;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1) {
            cryptoReceiveRepositoryImpl$getAvailableNetworks$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1) continuation;
            if ((cryptoReceiveRepositoryImpl$getAvailableNetworks$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cryptoReceiveRepositoryImpl$getAvailableNetworks$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1 cryptoReceiveRepositoryImpl$getAvailableNetworks$12 = cryptoReceiveRepositoryImpl$getAvailableNetworks$1;
                java.lang.Object obj = cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery eligibleCryptocurrencyBlockchainNetworksQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery(new com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction.RECEIVE)));
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getOutputFormats = defaultRaise;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getOutputMinFrameDuration = defaultRaise3;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(eligibleCryptocurrencyBlockchainNetworksQuery);
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getInputFormats = defaultRaise3;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoSizes = 0;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoFpsRanges = 0;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.Camera2StreamConfigurationMap = 0;
                        cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getInputSizeshNQ4ISI = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, eligibleCryptocurrencyBlockchainNetworksQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoReceiveRepositoryImpl$getAvailableNetworks$12, 2, (java.lang.Object) null);
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
                    int i2 = cryptoReceiveRepositoryImpl$getAvailableNetworks$12.Camera2StreamConfigurationMap;
                    int i3 = cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoFpsRanges;
                    int i4 = cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoSizes;
                    int i5 = cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getHighSpeedVideoFpsRangesFor;
                    raise2 = (arrow.core.raise.Raise) cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getInputFormats;
                    raise = (arrow.core.raise.Raise) cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoReceiveRepositoryImpl$getAvailableNetworks$12.getOutputFormats;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork>> domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.receive.EligibleNetworksMapperKt.toDomain(data);
                if (domain instanceof arrow.core.Either.Left) {
                    raise.raise((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) domain).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (domain instanceof arrow.core.Either.Right) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) domain).getValue();
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(list);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cryptoReceiveRepositoryImpl$getAvailableNetworks$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1 cryptoReceiveRepositoryImpl$getAvailableNetworks$122 = cryptoReceiveRepositoryImpl$getAvailableNetworks$1;
        java.lang.Object obj2 = cryptoReceiveRepositoryImpl$getAvailableNetworks$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoReceiveRepositoryImpl$getAvailableNetworks$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }
}
