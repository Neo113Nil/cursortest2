package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ya */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0907ya implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: n */
    public static final ComponentCallbacks2C0907ya f9252n = new ComponentCallbacks2C0907ya();

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f9253j = new AtomicBoolean();

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f9254k = new AtomicBoolean();

    /* JADX INFO: renamed from: l */
    public final ArrayList f9255l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public boolean f9256m = false;

    /* JADX INFO: renamed from: a */
    public static void m5750a(Application application) {
        ComponentCallbacks2C0907ya componentCallbacks2C0907ya = f9252n;
        synchronized (componentCallbacks2C0907ya) {
            try {
                if (!componentCallbacks2C0907ya.f9256m) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0907ya);
                    application.registerComponentCallbacks(componentCallbacks2C0907ya);
                    componentCallbacks2C0907ya.f9256m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5751b(boolean z) {
        synchronized (f9252n) {
            try {
                ArrayList arrayList = this.f9255l;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((InterfaceC0870xa) obj).mo1232a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f9253j.compareAndSet(true, false);
        this.f9254k.set(true);
        if (zCompareAndSet) {
            m5751b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f9253j.compareAndSet(true, false);
        this.f9254k.set(true);
        if (zCompareAndSet) {
            m5751b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f9253j.compareAndSet(false, true)) {
            this.f9254k.set(true);
            m5751b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
