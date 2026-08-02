package com.paypal.oslo.feature.balance.ui.autoReload;

/* loaded from: classes11.dex */
public final class AutoReloadReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer_Factory create() {
        return com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer newInstance() {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer_Factory();

        private InstanceHolder() {
        }
    }
}
