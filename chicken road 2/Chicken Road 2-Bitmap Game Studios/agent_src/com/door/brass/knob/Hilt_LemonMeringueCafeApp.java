package com.door.brass.knob;

import android.app.Application;
import com.door.brass.knob.DaggerLemonMeringueCafeApp_HiltComponents_SingletonC;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public abstract class Hilt_LemonMeringueCafeApp extends Application implements GeneratedComponentManagerHolder {
    public boolean oyjLVtGms9eZwJ0 = false;
    public final ApplicationComponentManager b41X89IqSbKt = new ApplicationComponentManager(new ComponentSupplier() { // from class: com.door.brass.knob.Hilt_LemonMeringueCafeApp.1
        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public final Object get() {
            return new DaggerLemonMeringueCafeApp_HiltComponents_SingletonC.SingletonCImpl(new ApplicationContextModule(Hilt_LemonMeringueCafeApp.this));
        }
    });

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object b41X89IqSbKt() {
        return this.b41X89IqSbKt.b41X89IqSbKt();
    }

    @Override // android.app.Application
    public final void onCreate() {
        if (!this.oyjLVtGms9eZwJ0) {
            this.oyjLVtGms9eZwJ0 = true;
            ((LemonMeringueCafeApp_GeneratedInjector) this.b41X89IqSbKt.b41X89IqSbKt()).getClass();
        }
        super.onCreate();
    }
}
