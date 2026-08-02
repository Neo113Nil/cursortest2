package com.paypal.oslo.app.pds;

/* loaded from: classes10.dex */
public final class PdsHighlightProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.pds.PdsHighlightProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.pds.PdsHighlightProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.pds.PdsHighlightProviderImpl_Factory create() {
        return com.paypal.oslo.app.pds.PdsHighlightProviderImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.app.pds.PdsHighlightProviderImpl newInstance() {
        return new com.paypal.oslo.app.pds.PdsHighlightProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.pds.PdsHighlightProviderImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.app.pds.PdsHighlightProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
