package com.paypal.oslo.feature.cryptocurrency.data.repository.preferences;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/preferences/CryptoPreferencesRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "intent", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/CryptoPreference;", "getCryptoPreferences", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "status", "updateCryptoCurrencyPreference", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPreferencesRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CryptoPreferencesRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0 A[Catch: all -> 0x004f, RaiseCancellationException -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0052, all -> 0x004f, blocks: (B:11:0x004a, B:12:0x00d6, B:15:0x00e0, B:16:0x0105, B:18:0x0113, B:20:0x0119, B:22:0x011f, B:25:0x0134, B:26:0x013e, B:29:0x00f8, B:30:0x013f, B:31:0x0144), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCryptoPreferences(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$getCryptoPreferences$1 cryptoPreferencesRepositoryImpl$getCryptoPreferences$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str3;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        java.lang.String str4;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$getCryptoPreferences$1) {
            cryptoPreferencesRepositoryImpl$getCryptoPreferences$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$getCryptoPreferences$1) continuation;
            if ((cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery getCryptocurrencyAssetPreferenceQuery = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str), com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType.INSTANCE.safeValueOf(str2))), com.apollographql.apollo.api.Optional.INSTANCE.absent()));
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.query(getCryptocurrencyAssetPreferenceQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoSizes = str;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputFormats = str2;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputMinFrameDuration = defaultRaise;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getInputFormats = defaultRaise3;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCryptocurrencyAssetPreferenceQuery);
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputMinFrameDurationlomOqCM = defaultRaise3;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.Camera2StreamConfigurationMap = 0;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoFpsRanges = 0;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputStallDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, cryptoPreferencesRepositoryImpl$getCryptoPreferences$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str2;
                        defaultRaise2 = defaultRaise;
                        obj = execute$default;
                        raise = defaultRaise3;
                        str4 = str;
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
                    int i2 = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoFpsRanges;
                    int i4 = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.Camera2StreamConfigurationMap;
                    raise2 = (arrow.core.raise.Raise) cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputMinFrameDurationlomOqCM;
                    raise = (arrow.core.raise.Raise) cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputMinFrameDuration;
                    str3 = (java.lang.String) cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputFormats;
                    str4 = (java.lang.String) cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getHighSpeedVideoSizes;
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
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null || (cryptocurrencyPreferences = data.getCryptocurrencyPreferences()) == null || (assetPreference = cryptocurrencyPreferences.getAssetPreference()) == null) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference cryptoPreference = (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference) raise.bind(com.paypal.oslo.feature.cryptocurrency.data.mapper.preferences.CryptoPreferencesMapperKt.toDomain(assetPreference, str4, str3));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(cryptoPreference);
            }
        }
        cryptoPreferencesRepositoryImpl$getCryptoPreferences$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$getCryptoPreferences$1(this, continuation);
        java.lang.Object obj2 = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoPreferencesRepositoryImpl$getCryptoPreferences$1.getOutputStallDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
        raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x0053, B:13:0x00ed, B:16:0x00f7, B:17:0x011c, B:19:0x012a, B:21:0x0130, B:23:0x0136, B:26:0x014b, B:27:0x0155, B:30:0x010f, B:31:0x0156, B:32:0x015b), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v21, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r2v10, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCryptoCurrencyPreference(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1 cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object execute$default;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation.Data data;
        com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences;
        com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation.AssetPreference assetPreference;
        java.lang.String str4 = str;
        java.lang.String str5 = str2;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1) {
            cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1) continuation;
            if ((cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1 cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1;
                java.lang.Object obj = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation updateCryptocurrencyAssetPreferenceMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.safeValueOf(str4), com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType.INSTANCE.safeValueOf(str5), com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.INSTANCE.safeValueOf(str3), com.apollographql.apollo.api.Optional.INSTANCE.absent())), com.apollographql.apollo.api.Optional.INSTANCE.absent()));
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoFpsRangesFor = str4;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoSizesFor = str5;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputFormats = defaultRaise;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputMinFrameDuration = defaultRaise2;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCryptocurrencyAssetPreferenceMutation);
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputStallDurationlomOqCM = defaultRaise2;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.Camera2StreamConfigurationMap = 0;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoFpsRanges = 0;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoSizes = 0;
                        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputMinFrameDurationlomOqCM = 1;
                        execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, updateCryptocurrencyAssetPreferenceMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        defaultRaise4 = defaultRaise2;
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
                    int i2 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoSizes;
                    int i3 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoFpsRanges;
                    int i4 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.Camera2StreamConfigurationMap;
                    int i5 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r0 = (arrow.core.raise.Raise) cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputStallDurationlomOqCM;
                    ?? r2 = (arrow.core.raise.Raise) cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputMinFrameDuration;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getOutputFormats;
                    java.lang.String str6 = (java.lang.String) cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoSizesFor;
                    java.lang.String str7 = (java.lang.String) cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$12.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r0;
                        str4 = str7;
                        defaultRaise4 = r2;
                        str5 = str6;
                        execute$default = obj;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) execute$default).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.cryptocurrency.data.error.CryptocurrencyErrorMapperKt.toCryptocurrencyError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) defaultRaise2.bind(right)).getData();
                if (data != null || (updateCryptocurrencyPreferences = data.getUpdateCryptocurrencyPreferences()) == null || (assetPreference = updateCryptocurrencyPreferences.getAssetPreference()) == null) {
                    defaultRaise4.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference cryptoPreference = (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference) defaultRaise4.bind(com.paypal.oslo.feature.cryptocurrency.data.mapper.preferences.CryptoPreferencesMapperKt.toDomain(assetPreference, str4, str5));
                defaultRaise3.complete();
                return new arrow.core.Either.Right(cryptoPreference);
            }
        }
        cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1 cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$122 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1;
        java.lang.Object obj2 = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$122.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) execute$default).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) defaultRaise2.bind(right)).getData();
        if (data != null) {
        }
        defaultRaise4.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }
}
