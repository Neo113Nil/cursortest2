package com.paypal.oslo.core.i18n.data.implementation;

/* loaded from: classes10.dex */
public final class NameHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl_Factory create() {
        return com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl newInstance() {
        return new com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl_Factory();

        private InstanceHolder() {
        }
    }
}
