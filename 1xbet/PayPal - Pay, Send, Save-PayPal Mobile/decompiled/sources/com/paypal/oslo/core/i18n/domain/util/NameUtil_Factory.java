package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class NameUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.NameUtil> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameValidationHelper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver> getHighSpeedVideoFpsRangesFor;

    private NameUtil_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameValidationHelper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.NameUtil get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.util.NameUtil_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameValidationHelper> provider2) {
        return new com.paypal.oslo.core.i18n.domain.util.NameUtil_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.util.NameUtil newInstance(com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver nameLayoutResolver, com.paypal.oslo.core.i18n.domain.util.NameValidationHelper nameValidationHelper) {
        return new com.paypal.oslo.core.i18n.domain.util.NameUtil(nameLayoutResolver, nameValidationHelper);
    }
}
