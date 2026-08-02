package com.paypal.oslo.core.companion.data;

/* loaded from: classes10.dex */
abstract class Hilt_CompanionIpcService extends android.app.Service implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private volatile dagger.hilt.android.internal.managers.ServiceComponentManager getHighSpeedVideoFpsRanges;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private boolean Camera2StreamConfigurationMap = false;

    Hilt_CompanionIpcService() {
    }

    @Override // android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }

    protected dagger.hilt.android.internal.managers.ServiceComponentManager createComponentManager() {
        return new dagger.hilt.android.internal.managers.ServiceComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final dagger.hilt.android.internal.managers.ServiceComponentManager componentManager() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = createComponentManager();
                }
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    protected void inject() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        ((com.paypal.oslo.core.companion.data.CompanionIpcService_GeneratedInjector) generatedComponent()).injectCompanionIpcService((com.paypal.oslo.core.companion.data.CompanionIpcService) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
