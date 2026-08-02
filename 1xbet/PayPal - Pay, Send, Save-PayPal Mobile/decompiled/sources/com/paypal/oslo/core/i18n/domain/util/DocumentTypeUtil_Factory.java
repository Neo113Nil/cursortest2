package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class DocumentTypeUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil_Factory create() {
        return com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil newInstance() {
        return new com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil_Factory getHighSpeedVideoSizes = new com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil_Factory();

        private InstanceHolder() {
        }
    }
}
