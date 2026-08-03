package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575o extends io.appmetrica.analytics.impl.AbstractC0868z7 implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Application f6546a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.EnumC0549n f6547b = io.appmetrica.analytics.impl.EnumC0549n.f6451d;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0612pa f6548c = new io.appmetrica.analytics.impl.C0612pa(true);

    public final synchronized void a(android.content.Context context) {
        if (this.f6546a == null) {
            try {
                this.f6546a = (android.app.Application) context.getApplicationContext();
            } catch (java.lang.Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        io.appmetrica.analytics.impl.EnumC0549n enumC0549n = this.f6547b;
        io.appmetrica.analytics.impl.EnumC0549n enumC0549n2 = io.appmetrica.analytics.impl.EnumC0549n.f6449b;
        if (enumC0549n != enumC0549n2 && !this.f6548c.f6642a.isEmpty()) {
            if (this.f6546a == null) {
                this.f6547b = io.appmetrica.analytics.impl.EnumC0549n.f6450c;
            } else {
                this.f6547b = enumC0549n2;
                this.f6546a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.f6547b == io.appmetrica.analytics.impl.EnumC0549n.f6449b && this.f6548c.f6642a.isEmpty()) {
            this.f6547b = io.appmetrica.analytics.impl.EnumC0549n.f6451d;
            android.app.Application application = this.f6546a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a(activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        a(activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        a(activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        a(activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        a(activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        a(activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.STOPPED);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, LOOP:0: B:5:0x000f->B:6:0x0011, LOOP_END, TryCatch #0 {all -> 0x0007, blocks: (B:18:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001b, B:3:0x0009), top: B:17:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void registerListener(io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener activityLifecycleListener, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                }
                for (io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent : activityEventArr) {
                    this.f6548c.a(activityEvent, activityLifecycleListener);
                }
                b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        activityEventArr = io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.values();
        while (r1 < r0) {
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:31:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:14:0x002f, B:15:0x0034, B:17:0x0039, B:21:0x003c, B:3:0x0009), top: B:30:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void unregisterListener(io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener activityLifecycleListener, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                }
                for (io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent : activityEventArr) {
                    io.appmetrica.analytics.impl.C0612pa c0612pa = this.f6548c;
                    java.util.Collection collection = (java.util.Collection) c0612pa.f6642a.get(activityEvent);
                    if (collection != null && collection.remove(activityLifecycleListener)) {
                        if (collection.isEmpty() && c0612pa.f6643b) {
                            c0612pa.f6642a.remove(activityEvent);
                        }
                        new java.util.ArrayList(collection);
                    }
                }
                c();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        activityEventArr = io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.values();
        while (r1 < r0) {
        }
        c();
    }

    public final synchronized void a(android.app.Application application) {
        try {
            if (this.f6546a == null) {
                this.f6546a = application;
            }
            b();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final io.appmetrica.analytics.impl.EnumC0549n a() {
        return this.f6547b;
    }

    public final void a(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        java.util.Collection collection;
        synchronized (this) {
            collection = (java.util.Collection) this.f6548c.f6642a.get(activityEvent);
        }
        if (collection != null) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
