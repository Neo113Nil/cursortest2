package com.paypal.oslo.feature.merchantbanking.domain.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00030\u0002H&¢\u0006\u0004\b\t\u0010\u0007J!\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H&¢\u0006\u0004\b\n\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/repository/MerchantAccountRoutingNumberRepository;", "", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "getAccountRoutingNumbers", "()Lkotlinx/coroutines/flow/Flow;", "", "checkEligibility", "enrollForAccountRoutingNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MerchantAccountRoutingNumberRepository {
    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, java.lang.Boolean>> checkEligibility();

    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>> enrollForAccountRoutingNumbers();

    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>> getAccountRoutingNumbers();
}
