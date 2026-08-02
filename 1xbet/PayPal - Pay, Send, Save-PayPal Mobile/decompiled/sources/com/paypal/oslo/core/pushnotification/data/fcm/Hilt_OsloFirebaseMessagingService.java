package com.paypal.oslo.core.pushnotification.data.fcm;

/* loaded from: classes10.dex */
public abstract class Hilt_OsloFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private volatile dagger.hilt.android.internal.managers.ServiceComponentManager getHighSpeedVideoFpsRanges;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private boolean Camera2StreamConfigurationMap = false;

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
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
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
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
        ((com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService_GeneratedInjector) generatedComponent()).injectOsloFirebaseMessagingService((com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
