package com.paypal.oslo.feature.home.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/di/HomeConfigManagerModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "provideHomeConfigManager$home_prodRelease", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class HomeConfigManagerModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.di.HomeConfigManagerModule INSTANCE = new com.paypal.oslo.feature.home.di.HomeConfigManagerModule();

    private HomeConfigManagerModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.home.featureflags.HomeConfigManager provideHomeConfigManager$home_prodRelease(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        return new com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl(featureGate, dynamicConfiguration);
    }
}
