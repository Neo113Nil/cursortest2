package com.paypal.oslo.core.telemetry.vendors.adjust;

/* loaded from: classes10.dex */
public final class AdjustPushTokenListener_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adjust.AdjustPushTokenListener> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private AdjustPushTokenListener_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustPushTokenListener get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adjust.AdjustPushTokenListener_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustPushTokenListener_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adjust.AdjustPushTokenListener newInstance(android.content.Context context) {
        return new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustPushTokenListener(context);
    }
}
