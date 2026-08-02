package com.paypal.oslo.feature.cashin.ui.components;

/* loaded from: classes11.dex */
public final class DefaultMapComponent_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent_Factory create() {
        return com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent newInstance() {
        return new com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent_Factory();

        private InstanceHolder() {
        }
    }
}
