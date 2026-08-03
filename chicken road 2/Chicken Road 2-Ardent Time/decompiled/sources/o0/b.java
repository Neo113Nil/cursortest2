package o0;

/* loaded from: classes.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final o0.b f8124e = new o0.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f8125a = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f8126b = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f8127c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f8128d = false;

    public final void a(boolean z2) {
        synchronized (f8124e) {
            try {
                java.util.Iterator it = this.f8127c.iterator();
                while (it.hasNext()) {
                    A0.a aVar = ((o0.k) it.next()).f8150a.f8145m;
                    aVar.sendMessage(aVar.obtainMessage(1, java.lang.Boolean.valueOf(z2)));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f8126b;
        boolean compareAndSet = this.f8125a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f8126b;
        boolean compareAndSet = this.f8125a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f8125a.compareAndSet(false, true)) {
            this.f8126b.set(true);
            a(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
