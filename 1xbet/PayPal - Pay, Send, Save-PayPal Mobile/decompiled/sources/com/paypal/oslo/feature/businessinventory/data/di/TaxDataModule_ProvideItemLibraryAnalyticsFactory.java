package com.paypal.oslo.feature.businessinventory.data.di;

/* loaded from: classes11.dex */
public final class TaxDataModule_ProvideItemLibraryAnalyticsFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics> {
    private final com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule getHighSpeedVideoSizes;

    private TaxDataModule_ProvideItemLibraryAnalyticsFactory(com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule taxDataModule) {
        this.getHighSpeedVideoSizes = taxDataModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics get() {
        return provideItemLibraryAnalytics(this.getHighSpeedVideoSizes);
    }

    public static com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule_ProvideItemLibraryAnalyticsFactory create(com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule taxDataModule) {
        return new com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule_ProvideItemLibraryAnalyticsFactory(taxDataModule);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics provideItemLibraryAnalytics(com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule taxDataModule) {
        return (com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics) dagger.internal.Preconditions.checkNotNullFromProvides(taxDataModule.provideItemLibraryAnalytics());
    }
}
