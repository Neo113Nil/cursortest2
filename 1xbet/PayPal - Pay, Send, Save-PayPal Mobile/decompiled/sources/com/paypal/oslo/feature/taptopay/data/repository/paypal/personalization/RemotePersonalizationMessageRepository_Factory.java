package com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization;

/* loaded from: classes15.dex */
public final class RemotePersonalizationMessageRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization.RemotePersonalizationMessageRepository_Factory();

        private InstanceHolder() {
        }
    }
}
