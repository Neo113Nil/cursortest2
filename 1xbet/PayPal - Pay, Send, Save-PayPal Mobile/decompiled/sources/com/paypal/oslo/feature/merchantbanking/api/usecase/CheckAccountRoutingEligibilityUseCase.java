package com.paypal.oslo.feature.merchantbanking.api.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", "", "invoke", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CheckAccountRoutingEligibilityUseCase {
    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, java.lang.Boolean>> invoke();
}
