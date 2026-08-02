package com.paypal.oslo.feature.cryptocurrency.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/di/CryptocurrencyModule;", "", "Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/gates/FeatureGateManagerImpl;", "impl", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "bindFeatureGateManager", "(Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/gates/FeatureGateManagerImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/values/DynamicConfigurationManagerImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "bindDynamicConfigurationManager", "(Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/values/DynamicConfigurationManagerImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "Lcom/paypal/oslo/feature/cryptocurrency/data/provider/CryptoUserCurrencyProvider;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "bindCurrencyProvider", "(Lcom/paypal/oslo/feature/cryptocurrency/data/provider/CryptoUserCurrencyProvider;)Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "Lcom/paypal/oslo/feature/cryptocurrency/data/provider/DefaultCryptoAmountValidationProvider;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "bindAmountValidationProvider", "(Lcom/paypal/oslo/feature/cryptocurrency/data/provider/DefaultCryptoAmountValidationProvider;)Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface CryptocurrencyModule {
    @dagger.Binds
    com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider bindAmountValidationProvider(com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider impl);

    @dagger.Binds
    com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider bindCurrencyProvider(com.paypal.oslo.feature.cryptocurrency.data.provider.CryptoUserCurrencyProvider impl);

    @dagger.Binds
    com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager bindDynamicConfigurationManager(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager bindFeatureGateManager(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGateManagerImpl impl);
}
