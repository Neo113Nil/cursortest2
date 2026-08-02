package com.paypal.oslo.feature.revolvingcreditservicing.domain.utils;

/* loaded from: classes14.dex */
public final class CvvLengthValidatorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidatorImpl_Factory();

        private InstanceHolder() {
        }
    }
}
