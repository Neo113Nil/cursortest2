package com.paypal.oslo.feature.pools.data.repository;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00120\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/PoolsRepositoryImpl;", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "poolStatus", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPoolsPaginated", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingSource;", "", "createPagingSource$pools_prodRelease", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;)Landroidx/paging/PagingSource;", "", "invalidatePoolsList", "()V", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsRepositoryImpl implements com.paypal.oslo.feature.pools.domain.repository.PoolsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.paging.PagingSource<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool>> getHighSpeedVideoSizes;
    private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PoolsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(10);
    }

    @Override // com.paypal.oslo.feature.pools.domain.repository.PoolsRepository
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> getPoolsPaginated(final com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole, final com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
        return new androidx.paging.Pager(new androidx.paging.PagingConfig(10, 5, false, 20, 0, 0, 48, null), null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.paging.PagingSource createPagingSource$pools_prodRelease;
                createPagingSource$pools_prodRelease = com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl.this.createPagingSource$pools_prodRelease(userRole, poolStatus);
                return createPagingSource$pools_prodRelease;
            }
        }, 2, null).getFlow();
    }

    public final androidx.paging.PagingSource<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool> createPagingSource$pools_prodRelease(com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
        com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource poolsPagingSource = new com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, userRole, poolStatus, this.getHighSpeedVideoFpsRanges.get(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl.$r8$lambda$ux9Wm98JNXT6QLfYH8LpBh8q2zM(com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl.this, ((java.lang.Integer) obj).intValue());
            }
        });
        this.getHighSpeedVideoSizes.set(poolsPagingSource);
        return poolsPagingSource;
    }

    @Override // com.paypal.oslo.feature.pools.domain.repository.PoolsRepository
    public final void invalidatePoolsList() {
        androidx.paging.PagingSource<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool> andSet = this.getHighSpeedVideoSizes.getAndSet(null);
        if (andSet != null) {
            andSet.invalidate();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ux9Wm98JNXT6QLfYH8LpBh8q2zM(com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl poolsRepositoryImpl, int i) {
        poolsRepositoryImpl.getHighSpeedVideoFpsRanges.set(i);
        return kotlin.Unit.INSTANCE;
    }
}
