package com.paypal.oslo.feature.pools.di;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pools/di/PoolDataModule;", "", "Lcom/paypal/oslo/feature/pools/data/repository/PoolsRepositoryImpl;", "poolsRepositoryImpl", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "bindPoolsRepository", "(Lcom/paypal/oslo/feature/pools/data/repository/PoolsRepositoryImpl;)Lcom/paypal/oslo/feature/pools/domain/repository/PoolsRepository;", "Lcom/paypal/oslo/feature/pools/data/repository/PoolDetailsRepositoryImpl;", "poolDetailsRepositoryImpl", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolDetailsRepository;", "bindPoolDetailsRepository", "(Lcom/paypal/oslo/feature/pools/data/repository/PoolDetailsRepositoryImpl;)Lcom/paypal/oslo/feature/pools/domain/repository/PoolDetailsRepository;", "Lcom/paypal/oslo/feature/pools/data/repository/CreatePoolRepositoryImpl;", "createPoolRepositoryImpl", "Lcom/paypal/oslo/feature/pools/domain/repository/CreatePoolRepository;", "bindCreatePoolRepository", "(Lcom/paypal/oslo/feature/pools/data/repository/CreatePoolRepositoryImpl;)Lcom/paypal/oslo/feature/pools/domain/repository/CreatePoolRepository;", "Lcom/paypal/oslo/feature/pools/extensions/DefaultPoolUiErrorMapper;", "defaultPoolUiErrorMapper", "Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;", "bindPoolUiErrorMapper", "(Lcom/paypal/oslo/feature/pools/extensions/DefaultPoolUiErrorMapper;)Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface PoolDataModule {
    @dagger.Binds
    com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository bindCreatePoolRepository(com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl createPoolRepositoryImpl);

    @dagger.Binds
    com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository bindPoolDetailsRepository(com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl poolDetailsRepositoryImpl);

    @dagger.Binds
    com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper bindPoolUiErrorMapper(com.paypal.oslo.feature.pools.extensions.DefaultPoolUiErrorMapper defaultPoolUiErrorMapper);

    @dagger.Binds
    com.paypal.oslo.feature.pools.domain.repository.PoolsRepository bindPoolsRepository(com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl poolsRepositoryImpl);
}
