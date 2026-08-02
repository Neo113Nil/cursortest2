package com.paypal.oslo.feature.merchantbanking.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/di/MerchantModule;", "", "Lcom/paypal/oslo/feature/merchantbanking/data/repository/MerchantAccountRoutingNumberRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/merchantbanking/domain/repository/MerchantAccountRoutingNumberRepository;", "bindMerchantAccountRoutingNumberRepository", "(Lcom/paypal/oslo/feature/merchantbanking/data/repository/MerchantAccountRoutingNumberRepositoryImpl;)Lcom/paypal/oslo/feature/merchantbanking/domain/repository/MerchantAccountRoutingNumberRepository;", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/CheckAccountRoutingNumberEligibilityUseCase;", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "bindCheckAccountRoutingEligibilityUseCase", "(Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/CheckAccountRoutingNumberEligibilityUseCase;)Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface MerchantModule {
    @dagger.Binds
    com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase bindCheckAccountRoutingEligibilityUseCase(com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase impl);

    @dagger.Binds
    com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository bindMerchantAccountRoutingNumberRepository(com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl impl);
}
