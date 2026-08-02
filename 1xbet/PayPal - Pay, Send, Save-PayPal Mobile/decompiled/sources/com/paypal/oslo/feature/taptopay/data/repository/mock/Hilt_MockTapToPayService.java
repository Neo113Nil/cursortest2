package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public abstract class Hilt_MockTapToPayService extends android.nfc.cardemulation.HostApduService implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private volatile dagger.hilt.android.internal.managers.ServiceComponentManager getHighSpeedVideoFpsRanges;

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
            synchronized (this.Camera2StreamConfigurationMap) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = createComponentManager();
                }
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    protected void inject() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService_GeneratedInjector) generatedComponent()).injectMockTapToPayService((com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
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
