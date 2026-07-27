package n1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1316c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C1316c f11362e = new ComponentCallbacks2C1316c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11363a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11364b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11365c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f11366d = false;

    public static void a(Application application) {
        ComponentCallbacks2C1316c componentCallbacks2C1316c = f11362e;
        synchronized (componentCallbacks2C1316c) {
            try {
                if (!componentCallbacks2C1316c.f11366d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1316c);
                    application.registerComponentCallbacks(componentCallbacks2C1316c);
                    componentCallbacks2C1316c.f11366d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z) {
        synchronized (f11362e) {
            try {
                Iterator it = this.f11365c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1315b) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f11364b;
        boolean compareAndSet = this.f11363a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f11364b;
        boolean compareAndSet = this.f11363a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f11363a.compareAndSet(false, true)) {
            this.f11364b.set(true);
            b(true);
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
