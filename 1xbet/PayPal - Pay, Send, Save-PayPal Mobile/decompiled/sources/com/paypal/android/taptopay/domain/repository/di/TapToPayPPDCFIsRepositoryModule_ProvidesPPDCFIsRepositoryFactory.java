package com.paypal.android.taptopay.domain.repository.di;

/* loaded from: classes10.dex */
public final class TapToPayPPDCFIsRepositoryModule_ProvidesPPDCFIsRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository> {
    private final javax.inject.Provider<java.util.Map<java.lang.String, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository>>> Camera2StreamConfigurationMap;
    private final com.paypal.android.taptopay.domain.repository.di.TapToPayPPDCFIsRepositoryModule getHighSpeedVideoFpsRangesFor;

    public TapToPayPPDCFIsRepositoryModule_ProvidesPPDCFIsRepositoryFactory(com.paypal.android.taptopay.domain.repository.di.TapToPayPPDCFIsRepositoryModule tapToPayPPDCFIsRepositoryModule, javax.inject.Provider<java.util.Map<java.lang.String, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository>>> provider) {
        this.getHighSpeedVideoFpsRangesFor = tapToPayPPDCFIsRepositoryModule;
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository get() {
        return providesPPDCFIsRepository(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.domain.repository.di.TapToPayPPDCFIsRepositoryModule_ProvidesPPDCFIsRepositoryFactory create(com.paypal.android.taptopay.domain.repository.di.TapToPayPPDCFIsRepositoryModule tapToPayPPDCFIsRepositoryModule, javax.inject.Provider<java.util.Map<java.lang.String, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository>>> provider) {
        return new com.paypal.android.taptopay.domain.repository.di.TapToPayPPDCFIsRepositoryModule_ProvidesPPDCFIsRepositoryFactory(tapToPayPPDCFIsRepositoryModule, provider);
    }

    public static com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository providesPPDCFIsRepository(com.paypal.android.taptopay.domain.repository.di.TapToPayPPDCFIsRepositoryModule tapToPayPPDCFIsRepositoryModule, java.util.Map<java.lang.String, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository>> map) {
        return (com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(tapToPayPPDCFIsRepositoryModule.providesPPDCFIsRepository(map));
    }
}
