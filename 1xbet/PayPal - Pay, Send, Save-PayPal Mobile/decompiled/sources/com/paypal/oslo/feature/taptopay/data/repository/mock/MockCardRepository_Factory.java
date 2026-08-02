package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockCardRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighResolutionOutputSizeshNQ4ISI;

    private MockCardRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository newInstance(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository(context, coroutineScope);
    }
}
