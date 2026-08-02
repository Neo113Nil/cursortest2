package com.paypal.oslo.app.launch;

/* loaded from: classes10.dex */
public final class AppLaunchSourceTracker_Factory implements dagger.internal.Factory<com.paypal.oslo.app.launch.AppLaunchSourceTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.launch.AppLaunchSourceTracker get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.launch.AppLaunchSourceTracker_Factory create() {
        return com.paypal.oslo.app.launch.AppLaunchSourceTracker_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.app.launch.AppLaunchSourceTracker newInstance() {
        return new com.paypal.oslo.app.launch.AppLaunchSourceTracker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.launch.AppLaunchSourceTracker_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.app.launch.AppLaunchSourceTracker_Factory();

        private InstanceHolder() {
        }
    }
}
