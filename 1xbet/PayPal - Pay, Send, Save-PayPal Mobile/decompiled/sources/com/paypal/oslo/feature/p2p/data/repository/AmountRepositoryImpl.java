package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/repository/AmountRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/AmountRepository;", "<init>", "()V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/AmountError;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmount", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AmountRepositoryImpl implements com.paypal.oslo.feature.p2p.domain.repository.AmountRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AmountRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.AmountRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.AmountError, com.paypal.oslo.feature.p2p.domain.model.Amount>> getAmount() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl$getAmount$1(null));
    }
}
