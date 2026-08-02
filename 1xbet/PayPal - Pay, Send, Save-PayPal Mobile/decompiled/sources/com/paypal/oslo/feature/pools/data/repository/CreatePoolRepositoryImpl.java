package com.paypal.oslo.feature.pools.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/CreatePoolRepositoryImpl;", "Lcom/paypal/oslo/feature/pools/domain/repository/CreatePoolRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/pools/domain/models/CreatePoolInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "createPool", "(Lcom/paypal/oslo/feature/pools/domain/models/CreatePoolInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreatePoolRepositoryImpl implements com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CreatePoolRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x011c A[Catch: all -> 0x005b, RaiseCancellationException -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005e, all -> 0x005b, blocks: (B:11:0x0056, B:12:0x0116, B:15:0x011c, B:16:0x015b, B:18:0x0169, B:20:0x016f, B:22:0x0175, B:24:0x017b, B:26:0x018e, B:29:0x0196, B:31:0x019e, B:32:0x01ab, B:33:0x01ac, B:34:0x01b9, B:35:0x01ba, B:36:0x01c7, B:41:0x0139, B:42:0x0155, B:43:0x015a), top: B:10:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPool(com.paypal.oslo.feature.pools.domain.models.CreatePoolInput createPoolInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.pools.domain.error.PoolError, com.paypal.oslo.feature.pools.domain.models.Pool>> continuation) {
        com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1 createPoolRepositoryImpl$createPool$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Data data;
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.CreateMoneyPool createMoneyPool;
        if (continuation instanceof com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1) {
            createPoolRepositoryImpl$createPool$1 = (com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1) continuation;
            if ((createPoolRepositoryImpl$createPool$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                createPoolRepositoryImpl$createPool$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1 createPoolRepositoryImpl$createPool$12 = createPoolRepositoryImpl$createPool$1;
                java.lang.Object obj2 = createPoolRepositoryImpl$createPool$12.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createPoolRepositoryImpl$createPool$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl.m17636$r8$lambda$cQKst_doeOJF2r6hNzzQDz3h8((com.paypal.oslo.feature.pools.domain.error.PoolError) obj3, (com.paypal.oslo.feature.pools.domain.error.PoolError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        java.lang.String name2 = createPoolInput.getName();
                        java.lang.String description = createPoolInput.getDescription();
                        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(createPoolInput.getBackgroundImageUrl());
                        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                        com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount = createPoolInput.getTargetAmount();
                        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation createPoolsMoneyPoolMutation = new com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation(new com.paypal.oslo.api.graphql.schema.type.CreateMoneyPoolInput(name2, description, presentIfNotNull, companion.presentIfNotNull(targetAmount != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(targetAmount.getCurrencyCode(), java.lang.String.valueOf(targetAmount.getValue())) : null), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(createPoolInput.getTargetDate())));
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        createPoolRepositoryImpl$createPool$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createPoolInput);
                        createPoolRepositoryImpl$createPool$12.getHighSpeedVideoSizesFor = function2;
                        createPoolRepositoryImpl$createPool$12.getOutputMinFrameDuration = atomicReference;
                        createPoolRepositoryImpl$createPool$12.getInputFormats = defaultRaise;
                        createPoolRepositoryImpl$createPool$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        createPoolRepositoryImpl$createPool$12.getOutputSizeshNQ4ISI = iorRaise3;
                        createPoolRepositoryImpl$createPool$12.getOutputMinFrameDurationlomOqCM = iorRaise3;
                        createPoolRepositoryImpl$createPool$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createPoolsMoneyPoolMutation);
                        createPoolRepositoryImpl$createPool$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        createPoolRepositoryImpl$createPool$12.getHighSpeedVideoFpsRangesFor = 0;
                        createPoolRepositoryImpl$createPool$12.Camera2StreamConfigurationMap = 0;
                        createPoolRepositoryImpl$createPool$12.getHighSpeedVideoSizes = 0;
                        createPoolRepositoryImpl$createPool$12.getHighSpeedVideoFpsRanges = 0;
                        createPoolRepositoryImpl$createPool$12.getOutputStallDuration = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, createPoolsMoneyPoolMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, createPoolRepositoryImpl$createPool$12, 2, (java.lang.Object) null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = createPoolRepositoryImpl$createPool$12.getHighSpeedVideoFpsRanges;
                    int i3 = createPoolRepositoryImpl$createPool$12.getHighSpeedVideoSizes;
                    int i4 = createPoolRepositoryImpl$createPool$12.Camera2StreamConfigurationMap;
                    int i5 = createPoolRepositoryImpl$createPool$12.getHighSpeedVideoFpsRangesFor;
                    int i6 = createPoolRepositoryImpl$createPool$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) createPoolRepositoryImpl$createPool$12.getOutputMinFrameDurationlomOqCM;
                    iorRaise2 = (arrow.core.raise.IorRaise) createPoolRepositoryImpl$createPool$12.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) createPoolRepositoryImpl$createPool$12.getInputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) createPoolRepositoryImpl$createPool$12.getOutputMinFrameDuration;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) createPoolRepositoryImpl$createPool$12.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = function22;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow2 = function2.invoke(obj, raisedOrRethrow2);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.pools.data.error.PoolErrorMapperKt.toPoolError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.pools.data.error.PoolErrorMapperKt.toPoolError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
                if (data != null || (createMoneyPool = data.getCreateMoneyPool()) == null) {
                    iorRaise2.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(null, 1, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!createMoneyPool.getSuccess()) {
                    iorRaise2.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError(null, 1, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.MoneyPool moneyPool = createMoneyPool.getMoneyPool();
                if (moneyPool == null) {
                    iorRaise2.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(null, 1, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.pools.domain.models.Pool pool = com.paypal.oslo.feature.pools.data.mapper.CreatePoolMapper.INSTANCE.toPool(moneyPool);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(pool) : new arrow.core.Ior.Both(obj3, pool);
            }
        }
        createPoolRepositoryImpl$createPool$1 = new com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1(this, continuation);
        com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1 createPoolRepositoryImpl$createPool$122 = createPoolRepositoryImpl$createPool$1;
        java.lang.Object obj22 = createPoolRepositoryImpl$createPool$122.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createPoolRepositoryImpl$createPool$122.getOutputStallDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
        if (data != null) {
        }
        iorRaise2.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(null, 1, null));
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: $r8$lambda$cQKs-t_do-eOJF2r6hNzzQDz3h8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.pools.domain.error.PoolError m17636$r8$lambda$cQKst_doeOJF2r6hNzzQDz3h8(com.paypal.oslo.feature.pools.domain.error.PoolError poolError, com.paypal.oslo.feature.pools.domain.error.PoolError poolError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolError2, "");
        return poolError;
    }
}
