package com.paypal.oslo.feature.balance.domain.repository.balance;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0002H¦@¢\u0006\u0004\b\n\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "fetchBalance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchBalanceId", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "fetchTaxHoldPolicy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface BalanceRepository {
    java.lang.Object fetchBalance(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.Balance>> continuation);

    java.lang.Object fetchBalanceId(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String>> continuation);

    java.lang.Object fetchTaxHoldPolicy(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy>> continuation);
}
