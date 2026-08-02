package com.paypal.oslo.feature.revolvingcreditservicing.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/RemoteConfigModule;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManagerImpl;", "impl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "bindTestFeature", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManagerImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManagerImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "bindTestDynamicConfig", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManagerImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface RemoteConfigModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager bindTestDynamicConfig(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager bindTestFeature(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl impl);
}
