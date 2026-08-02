package com.paypal.oslo.app.network.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/network/di/NetworkConfigModule;", "", "<init>", "()V", "Lcom/paypal/oslo/app/network/NetworkConfigSectionResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "provideNetworkSection", "(Lcom/paypal/oslo/app/network/NetworkConfigSectionResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class NetworkConfigModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.network.di.NetworkConfigModule INSTANCE = new com.paypal.oslo.app.network.di.NetworkConfigModule();

    private NetworkConfigModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.companion.domain.ConfigSection provideNetworkSection(com.paypal.oslo.app.network.NetworkConfigSectionResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return com.paypal.oslo.app.network.NetworkSectionFactory.INSTANCE.create(resolver);
    }
}
