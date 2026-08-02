package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class ISODurationParser_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.ISODurationParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.ISODurationParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.util.ISODurationParser_Factory create() {
        return com.paypal.oslo.core.i18n.domain.util.ISODurationParser_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.i18n.domain.util.ISODurationParser newInstance() {
        return new com.paypal.oslo.core.i18n.domain.util.ISODurationParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.util.ISODurationParser_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.i18n.domain.util.ISODurationParser_Factory();

        private InstanceHolder() {
        }
    }
}
