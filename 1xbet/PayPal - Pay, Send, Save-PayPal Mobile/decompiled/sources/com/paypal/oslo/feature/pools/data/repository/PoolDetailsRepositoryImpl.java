package com.paypal.oslo.feature.pools.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/PoolDetailsRepositoryImpl;", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolDetailsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "id", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPool", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolDetailsRepositoryImpl implements com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository {
    public static final int $stable = 8;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PoolDetailsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x0098, B:15:0x00a2, B:16:0x00c7, B:18:0x00d5, B:20:0x00db, B:24:0x00ec, B:25:0x00fa, B:28:0x00ba, B:29:0x00fb, B:30:0x0100), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPool(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.pools.domain.error.PoolError, com.paypal.oslo.feature.pools.domain.models.Pool>> continuation) {
        com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1 poolDetailsRepositoryImpl$getPool$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either.Left left;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data data;
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool;
        if (continuation instanceof com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1) {
            poolDetailsRepositoryImpl$getPool$1 = (com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1) continuation;
            if ((poolDetailsRepositoryImpl$getPool$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                poolDetailsRepositoryImpl$getPool$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1 poolDetailsRepositoryImpl$getPool$12 = poolDetailsRepositoryImpl$getPool$1;
                java.lang.Object obj = poolDetailsRepositoryImpl$getPool$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = poolDetailsRepositoryImpl$getPool$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery getPoolDetailsQuery = new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery(str);
                        poolDetailsRepositoryImpl$getPool$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        poolDetailsRepositoryImpl$getPool$12.getOutputFormats = defaultRaise;
                        poolDetailsRepositoryImpl$getPool$12.getInputFormats = defaultRaise3;
                        poolDetailsRepositoryImpl$getPool$12.getInputSizeshNQ4ISI = defaultRaise3;
                        poolDetailsRepositoryImpl$getPool$12.Camera2StreamConfigurationMap = 0;
                        poolDetailsRepositoryImpl$getPool$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        poolDetailsRepositoryImpl$getPool$12.getHighSpeedVideoFpsRanges = 0;
                        poolDetailsRepositoryImpl$getPool$12.getHighSpeedVideoFpsRangesFor = 0;
                        poolDetailsRepositoryImpl$getPool$12.getOutputMinFrameDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getPoolDetailsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, poolDetailsRepositoryImpl$getPool$12, 2, (java.lang.Object) null);
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
                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        return left.toIor();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = poolDetailsRepositoryImpl$getPool$12.getHighSpeedVideoFpsRangesFor;
                    int i3 = poolDetailsRepositoryImpl$getPool$12.getHighSpeedVideoFpsRanges;
                    int i4 = poolDetailsRepositoryImpl$getPool$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = poolDetailsRepositoryImpl$getPool$12.Camera2StreamConfigurationMap;
                    raise2 = (arrow.core.raise.Raise) poolDetailsRepositoryImpl$getPool$12.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) poolDetailsRepositoryImpl$getPool$12.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) poolDetailsRepositoryImpl$getPool$12.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        return left.toIor();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pools.data.error.PoolErrorMapperKt.toPoolError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null || (moneyPool = data.getMoneyPool()) == null) {
                    raise.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(null, 1, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.pools.domain.models.Pool pool = com.paypal.oslo.feature.pools.data.mapper.PoolDetailMapper.INSTANCE.toPool(moneyPool);
                defaultRaise2.complete();
                left = new arrow.core.Either.Right(pool);
                return left.toIor();
            }
        }
        poolDetailsRepositoryImpl$getPool$1 = new com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1(this, continuation);
        com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1 poolDetailsRepositoryImpl$getPool$122 = poolDetailsRepositoryImpl$getPool$1;
        java.lang.Object obj2 = poolDetailsRepositoryImpl$getPool$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = poolDetailsRepositoryImpl$getPool$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
        raise.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(null, 1, null));
        throw new kotlin.KotlinNothingValueException();
    }
}
