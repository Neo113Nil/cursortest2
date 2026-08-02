package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class AddressFormattingUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> getHighSpeedVideoFpsRangesFor;

    private AddressFormattingUtil_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider) {
        return new com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil newInstance(com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil) {
        return new com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil(fieldExtractionUtil);
    }
}
