package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

/* loaded from: classes15.dex */
public final class FiSelectorMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> getHighSpeedVideoSizes;

    private FiSelectorMapper_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider2) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper(localeInformation, payLaterExpiryChecker);
    }
}
