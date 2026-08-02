package com.paypal.oslo.feature.pools.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/mock/MockPoolsRepository;", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "poolStatus", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPoolsPaginated", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;)Lkotlinx/coroutines/flow/Flow;", "", "invalidatePoolsList"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockPoolsRepository implements com.paypal.oslo.feature.pools.domain.repository.PoolsRepository {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.pools.domain.repository.PoolsRepository
    public final void invalidatePoolsList() {
    }

    @javax.inject.Inject
    public MockPoolsRepository() {
    }

    @Override // com.paypal.oslo.feature.pools.domain.repository.PoolsRepository
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> getPoolsPaginated(com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
        return kotlinx.coroutines.flow.FlowKt.flowOf(androidx.paging.PagingData.Companion.from$default(androidx.paging.PagingData.INSTANCE, com.paypal.oslo.feature.pools.data.repository.mock.MockPoolData.INSTANCE.getAllPools(), 0, 0, 6, null));
    }
}
