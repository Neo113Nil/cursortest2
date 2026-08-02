package com.paypal.oslo.feature.debitcard.shared.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/di/DebitCardSharedModule;", "", "Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/gates/FeatureGateManagerImpl;", "impl", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "bindFeatureGateManager", "(Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/gates/FeatureGateManagerImpl;)Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/dynamicconfig/DynamicConfigManagerImpl;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "bindDynamicConfigManager", "(Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/dynamicconfig/DynamicConfigManagerImpl;)Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/fundingoptions/FundingOptionsRepositoryImpl;", "fundingOptionsRepositoryImpl", "Lcom/paypal/oslo/feature/debitcard/shared/domain/repository/fundingoptions/FundingOptionsRepository;", "bindFundingOptionsRepository", "(Lcom/paypal/oslo/feature/debitcard/shared/data/repository/fundingoptions/FundingOptionsRepositoryImpl;)Lcom/paypal/oslo/feature/debitcard/shared/domain/repository/fundingoptions/FundingOptionsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface DebitCardSharedModule {
    @dagger.Binds
    com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager bindDynamicConfigManager(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager bindFeatureGateManager(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGateManagerImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository bindFundingOptionsRepository(com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl fundingOptionsRepositoryImpl);
}
