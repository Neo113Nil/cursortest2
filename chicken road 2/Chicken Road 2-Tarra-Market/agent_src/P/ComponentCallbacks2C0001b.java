package P;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0001b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0001b f293e = new ComponentCallbacks2C0001b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f294a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f295b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f296c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f297d = false;

    public final void a(boolean z2) {
        synchronized (f293e) {
            try {
                Iterator it = this.f296c.iterator();
                while (it.hasNext()) {
                    Z.e eVar = ((l) it.next()).f323a.f314m;
                    eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z2)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f295b;
        boolean compareAndSet = this.f294a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f295b;
        boolean compareAndSet = this.f294a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f294a.compareAndSet(false, true)) {
            this.f295b.set(true);
            a(true);
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
