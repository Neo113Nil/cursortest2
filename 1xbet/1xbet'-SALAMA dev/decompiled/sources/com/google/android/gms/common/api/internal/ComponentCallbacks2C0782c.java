package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0782c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0782c f11168e = new ComponentCallbacks2C0782c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11169a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11170b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11171c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11172d = false;

    public static void b(Application application) {
        ComponentCallbacks2C0782c componentCallbacks2C0782c = f11168e;
        synchronized (componentCallbacks2C0782c) {
            try {
                if (!componentCallbacks2C0782c.f11172d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0782c);
                    application.registerComponentCallbacks(componentCallbacks2C0782c);
                    componentCallbacks2C0782c.f11172d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0781b interfaceC0781b) {
        synchronized (f11168e) {
            this.f11171c.add(interfaceC0781b);
        }
    }

    public final void c(boolean z4) {
        synchronized (f11168e) {
            try {
                Iterator it = this.f11171c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0781b) it.next()).a(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f11170b;
        boolean zCompareAndSet = this.f11169a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f11170b;
        boolean zCompareAndSet = this.f11169a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
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

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f11169a.compareAndSet(false, true)) {
            this.f11170b.set(true);
            c(true);
        }
    }
}
