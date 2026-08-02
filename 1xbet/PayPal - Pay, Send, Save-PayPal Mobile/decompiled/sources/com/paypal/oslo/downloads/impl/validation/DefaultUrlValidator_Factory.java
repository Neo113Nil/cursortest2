package com.paypal.oslo.downloads.impl.validation;

/* loaded from: classes10.dex */
public final class DefaultUrlValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator_Factory create() {
        return com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator newInstance() {
        return new com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator_Factory();

        private InstanceHolder() {
        }
    }
}
