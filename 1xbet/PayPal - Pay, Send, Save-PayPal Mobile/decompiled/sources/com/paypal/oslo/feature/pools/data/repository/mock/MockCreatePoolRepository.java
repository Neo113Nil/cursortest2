package com.paypal.oslo.feature.pools.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/mock/MockCreatePoolRepository;", "Lcom/paypal/oslo/feature/pools/domain/repository/CreatePoolRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/pools/domain/models/CreatePoolInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "createPool", "(Lcom/paypal/oslo/feature/pools/domain/models/CreatePoolInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockCreatePoolRepository implements com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockCreatePoolRepository() {
    }

    @Override // com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository
    public final java.lang.Object createPool(com.paypal.oslo.feature.pools.domain.models.CreatePoolInput createPoolInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.pools.domain.error.PoolError, com.paypal.oslo.feature.pools.domain.models.Pool>> continuation) {
        return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.first((java.util.List) com.paypal.oslo.feature.pools.data.repository.mock.MockPoolData.INSTANCE.getAllPools()));
    }
}
