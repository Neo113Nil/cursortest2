package com.paypal.android.taptopay.data.thales.payment;

/* loaded from: classes10.dex */
public abstract class Hilt_ThalesPaymentHCEService extends com.gemalto.mfs.mwsdk.payment.AsyncHCEService implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private volatile dagger.hilt.android.internal.managers.ServiceComponentManager getHighSpeedVideoSizes;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private boolean Camera2StreamConfigurationMap = false;

    Hilt_ThalesPaymentHCEService() {
    }

    @Override // com.gemalto.mfs.mwsdk.payment.AsyncHCEService, util.h.xy.bf.rc, android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }

    protected dagger.hilt.android.internal.managers.ServiceComponentManager createComponentManager() {
        return new dagger.hilt.android.internal.managers.ServiceComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final dagger.hilt.android.internal.managers.ServiceComponentManager componentManager() {
        if (this.getHighSpeedVideoSizes == null) {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = createComponentManager();
                }
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    protected void inject() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        ((com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService_GeneratedInjector) generatedComponent()).injectThalesPaymentHCEService((com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.AsyncHCEService, util.h.xy.bf.rc, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
