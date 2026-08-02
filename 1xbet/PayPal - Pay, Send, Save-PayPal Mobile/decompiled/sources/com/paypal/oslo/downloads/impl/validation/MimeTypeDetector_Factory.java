package com.paypal.oslo.downloads.impl.validation;

/* loaded from: classes10.dex */
public final class MimeTypeDetector_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.validation.MimeTypeDetector get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.validation.MimeTypeDetector_Factory create() {
        return com.paypal.oslo.downloads.impl.validation.MimeTypeDetector_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.downloads.impl.validation.MimeTypeDetector newInstance() {
        return new com.paypal.oslo.downloads.impl.validation.MimeTypeDetector();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.validation.MimeTypeDetector_Factory getHighSpeedVideoSizes = new com.paypal.oslo.downloads.impl.validation.MimeTypeDetector_Factory();

        private InstanceHolder() {
        }
    }
}
