package com.paypal.oslo.feature.pools.domain.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "poolStatus", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPoolsPaginated", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;)Lkotlinx/coroutines/flow/Flow;", "", "invalidatePoolsList", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PoolsRepository {
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> getPoolsPaginated(com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus);

    void invalidatePoolsList();
}
