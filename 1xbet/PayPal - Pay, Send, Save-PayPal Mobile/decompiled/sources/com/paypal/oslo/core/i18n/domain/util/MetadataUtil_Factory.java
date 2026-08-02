package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class MetadataUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.MetadataUtil get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.util.MetadataUtil_Factory create() {
        return com.paypal.oslo.core.i18n.domain.util.MetadataUtil_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.i18n.domain.util.MetadataUtil newInstance() {
        return new com.paypal.oslo.core.i18n.domain.util.MetadataUtil();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.util.MetadataUtil_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.i18n.domain.util.MetadataUtil_Factory();

        private InstanceHolder() {
        }
    }
}
