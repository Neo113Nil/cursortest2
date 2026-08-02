package com.paypal.oslo.app.network.di;

/* loaded from: classes4.dex */
public final class NetworkConfigModule_ProvideNetworkSectionFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.ConfigSection> {
    private final dagger.internal.Provider<com.paypal.oslo.app.network.NetworkConfigSectionResolver> getHighSpeedVideoSizes;

    private NetworkConfigModule_ProvideNetworkSectionFactory(dagger.internal.Provider<com.paypal.oslo.app.network.NetworkConfigSectionResolver> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.ConfigSection get() {
        return provideNetworkSection(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.network.di.NetworkConfigModule_ProvideNetworkSectionFactory create(dagger.internal.Provider<com.paypal.oslo.app.network.NetworkConfigSectionResolver> provider) {
        return new com.paypal.oslo.app.network.di.NetworkConfigModule_ProvideNetworkSectionFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.ConfigSection provideNetworkSection(com.paypal.oslo.app.network.NetworkConfigSectionResolver networkConfigSectionResolver) {
        return (com.paypal.oslo.core.companion.domain.ConfigSection) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.network.di.NetworkConfigModule.INSTANCE.provideNetworkSection(networkConfigSectionResolver));
    }
}
