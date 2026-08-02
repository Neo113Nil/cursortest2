package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

/* loaded from: classes11.dex */
public final class AddressFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> getHighSpeedVideoFpsRangesFor;

    private AddressFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter(formatAddressUseCase);
    }
}
