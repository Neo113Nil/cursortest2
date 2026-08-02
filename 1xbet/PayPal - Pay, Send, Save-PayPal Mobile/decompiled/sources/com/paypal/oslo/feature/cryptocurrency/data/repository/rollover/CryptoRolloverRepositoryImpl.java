package com.paypal.oslo.feature.cryptocurrency.data.repository.rollover;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/rollover/CryptoRolloverRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "claimCode", "dateOfBirth", "partner", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rollover/ClaimRolloverResult;", "createRollover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoRolloverRepositoryImpl implements com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoRolloverRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117 A[Catch: all -> 0x004c, RaiseCancellationException -> 0x004f, TryCatch #3 {RaiseCancellationException -> 0x004f, all -> 0x004c, blocks: (B:11:0x0047, B:12:0x00c4, B:17:0x00ce, B:19:0x00de, B:22:0x00ed, B:23:0x00f7, B:26:0x00fc, B:27:0x0110, B:28:0x0111, B:29:0x0116, B:30:0x0117, B:31:0x012b), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createRollover(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1 cryptoRolloverRepositoryImpl$createRollover$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1) {
            cryptoRolloverRepositoryImpl$createRollover$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1) continuation;
            if ((cryptoRolloverRepositoryImpl$createRollover$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                cryptoRolloverRepositoryImpl$createRollover$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1 cryptoRolloverRepositoryImpl$createRollover$12 = cryptoRolloverRepositoryImpl$createRollover$1;
                java.lang.Object obj = cryptoRolloverRepositoryImpl$createRollover$12.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoRolloverRepositoryImpl$createRollover$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation createCryptocurrencyRolloverMutation = new com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation(new com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput(str3, new com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimInput(str, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType.DATE_OF_BIRTH, com.apollographql.apollo.api.Optional.INSTANCE.present(str2))))));
                        cryptoRolloverRepositoryImpl$createRollover$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cryptoRolloverRepositoryImpl$createRollover$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cryptoRolloverRepositoryImpl$createRollover$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        cryptoRolloverRepositoryImpl$createRollover$12.getInputSizeshNQ4ISI = defaultRaise;
                        cryptoRolloverRepositoryImpl$createRollover$12.getOutputFormats = defaultRaise3;
                        cryptoRolloverRepositoryImpl$createRollover$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createCryptocurrencyRolloverMutation);
                        cryptoRolloverRepositoryImpl$createRollover$12.getHighSpeedVideoFpsRangesFor = 0;
                        cryptoRolloverRepositoryImpl$createRollover$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cryptoRolloverRepositoryImpl$createRollover$12.getHighSpeedVideoSizes = 0;
                        cryptoRolloverRepositoryImpl$createRollover$12.Camera2StreamConfigurationMap = 0;
                        cryptoRolloverRepositoryImpl$createRollover$12.getOutputStallDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges, createCryptocurrencyRolloverMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, cryptoRolloverRepositoryImpl$createRollover$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = execute$default;
                        raise = defaultRaise3;
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
                    int i2 = cryptoRolloverRepositoryImpl$createRollover$12.Camera2StreamConfigurationMap;
                    int i3 = cryptoRolloverRepositoryImpl$createRollover$12.getHighSpeedVideoSizes;
                    int i4 = cryptoRolloverRepositoryImpl$createRollover$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = cryptoRolloverRepositoryImpl$createRollover$12.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) cryptoRolloverRepositoryImpl$createRollover$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cryptoRolloverRepositoryImpl$createRollover$12.getInputSizeshNQ4ISI;
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
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    raise.raise(com.paypal.oslo.feature.cryptocurrency.data.error.CryptocurrencyErrorMapperKt.toCryptocurrencyError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data data = (com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null) {
                        raise.raise(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult domain = com.paypal.oslo.feature.cryptocurrency.data.mapper.rollover.RolloverMapperKt.toDomain(data);
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(domain);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                raise.raise(com.paypal.oslo.feature.cryptocurrency.data.error.CryptocurrencyErrorMapperKt.toCryptocurrencyError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue()));
                throw new kotlin.KotlinNothingValueException();
            }
        }
        cryptoRolloverRepositoryImpl$createRollover$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1 cryptoRolloverRepositoryImpl$createRollover$122 = cryptoRolloverRepositoryImpl$createRollover$1;
        java.lang.Object obj2 = cryptoRolloverRepositoryImpl$createRollover$122.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoRolloverRepositoryImpl$createRollover$122.getOutputStallDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
