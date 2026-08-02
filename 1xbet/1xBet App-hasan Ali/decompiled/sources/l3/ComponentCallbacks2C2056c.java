package l3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.internal.ads.Jt;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C2056c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: o, reason: collision with root package name */
    public static final ComponentCallbacks2C2056c f17777o = new ComponentCallbacks2C2056c();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f17778k = new AtomicBoolean();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f17779l = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f17780m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f17781n = false;

    public final void a(l lVar) {
        synchronized (f17777o) {
            this.f17780m.add(lVar);
        }
    }

    public final void b(boolean z3) {
        synchronized (f17777o) {
            try {
                ArrayList arrayList = this.f17780m;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Jt jt = ((l) obj).f17805a.f17798w;
                    jt.sendMessage(jt.obtainMessage(1, Boolean.valueOf(z3)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f17779l;
        boolean compareAndSet = this.f17778k.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f17779l;
        boolean compareAndSet = this.f17778k.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f17778k.compareAndSet(false, true)) {
            this.f17779l.set(true);
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
