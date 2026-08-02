package com.paypal.oslo.feature.settings.ui.provider;

/* loaded from: classes14.dex */
public final class SettingsTabContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider_Factory create() {
        return com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider newInstance() {
        return new com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.settings.ui.provider.SettingsTabContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
