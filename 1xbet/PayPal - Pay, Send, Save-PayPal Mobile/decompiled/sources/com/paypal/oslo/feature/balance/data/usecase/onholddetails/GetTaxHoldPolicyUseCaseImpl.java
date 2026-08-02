package com.paypal.oslo.feature.balance.data.usecase.onholddetails;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/onholddetails/GetTaxHoldPolicyUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "balanceRepository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetTaxHoldPolicyUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetTaxHoldPolicyUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceRepository, "");
        this.getHighSpeedVideoSizes = balanceRepository;
    }

    @Override // com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy>> continuation) {
        return this.getHighSpeedVideoSizes.fetchTaxHoldPolicy(continuation);
    }
}
