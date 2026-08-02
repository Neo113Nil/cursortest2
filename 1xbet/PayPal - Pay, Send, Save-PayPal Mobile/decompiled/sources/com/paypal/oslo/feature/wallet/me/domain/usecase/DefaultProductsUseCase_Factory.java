package com.paypal.oslo.feature.wallet.me.domain.usecase;

/* loaded from: classes16.dex */
public final class DefaultProductsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;

    private DefaultProductsUseCase_Factory(dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase_Factory create(dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider) {
        return new com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase newInstance(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase(coroutineDispatcher);
    }
}
