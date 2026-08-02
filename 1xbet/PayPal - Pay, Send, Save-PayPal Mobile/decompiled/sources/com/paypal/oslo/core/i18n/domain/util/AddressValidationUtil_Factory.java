package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class AddressValidationUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> Camera2StreamConfigurationMap;

    private AddressValidationUtil_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider) {
        return new com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil newInstance(com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil) {
        return new com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil(fieldExtractionUtil);
    }
}
