package com.paypal.oslo.app;

/* loaded from: classes.dex */
public abstract class Hilt_OsloApplication extends android.app.Application implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private boolean getHighSpeedVideoSizes = false;
    private final dagger.hilt.android.internal.managers.ApplicationComponentManager Camera2StreamConfigurationMap = new dagger.hilt.android.internal.managers.ApplicationComponentManager(new dagger.hilt.android.internal.managers.ComponentSupplier() { // from class: com.paypal.oslo.app.Hilt_OsloApplication.1
        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public java.lang.Object get() {
            return com.paypal.oslo.app.DaggerOsloApplication_HiltComponents_SingletonC.builder().applicationContextModule(new dagger.hilt.android.internal.modules.ApplicationContextModule(com.paypal.oslo.app.Hilt_OsloApplication.this)).build();
        }
    });

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final dagger.hilt.android.internal.managers.ApplicationComponentManager componentManager() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    protected void hiltInternalInject() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        ((com.paypal.oslo.app.OsloApplication_GeneratedInjector) generatedComponent()).injectOsloApplication((com.paypal.oslo.app.OsloApplication) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
