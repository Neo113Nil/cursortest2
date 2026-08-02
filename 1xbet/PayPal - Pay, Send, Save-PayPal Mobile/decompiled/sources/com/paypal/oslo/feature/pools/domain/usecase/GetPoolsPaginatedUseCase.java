package com.paypal.oslo.feature.pools.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/usecase/GetPoolsPaginatedUseCase;", "", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;)V", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "poolStatus", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "invoke", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPoolsPaginatedUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pools.domain.repository.PoolsRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetPoolsPaginatedUseCase(com.paypal.oslo.feature.pools.domain.repository.PoolsRepository poolsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolsRepository, "");
        this.Camera2StreamConfigurationMap = poolsRepository;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> invoke(com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
        return this.Camera2StreamConfigurationMap.getPoolsPaginated(userRole, poolStatus);
    }
}
