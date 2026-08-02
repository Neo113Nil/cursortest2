package com.paypal.oslo.feature.taptopay.ui.setup.entercvv;

/* loaded from: classes15.dex */
public final class EnterCvvViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighResolutionOutputSizeshNQ4ISI;

    private EnterCvvViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel(localeInformation);
    }
}
