package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: k, reason: collision with root package name */
    public Activity f11327k;

    /* renamed from: l, reason: collision with root package name */
    public Application f11328l;

    /* renamed from: r, reason: collision with root package name */
    public K4 f11334r;

    /* renamed from: t, reason: collision with root package name */
    public long f11336t;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11329m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f11330n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11331o = false;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f11332p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f11333q = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public boolean f11335s = false;

    public final void a(S5 s5) {
        synchronized (this.f11329m) {
            this.f11332p.add(s5);
        }
    }

    public final void b(S5 s5) {
        synchronized (this.f11329m) {
            this.f11332p.remove(s5);
        }
    }

    public final void c(Activity activity) {
        synchronized (this.f11329m) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f11327k = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f11329m) {
            try {
                Activity activity2 = this.f11327k;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f11327k = null;
                }
                ArrayList arrayList = this.f11333q;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                    } catch (Exception e3) {
                        P2.o.f4767B.f4774g.i("AppActivityTracker.ActivityListener.onActivityDestroyed", e3);
                        U2.j.g("", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity);
        synchronized (this.f11329m) {
            ArrayList arrayList = this.f11333q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (Exception e3) {
                    P2.o.f4767B.f4774g.i("AppActivityTracker.ActivityListener.onActivityPaused", e3);
                    U2.j.g("", e3);
                }
            }
        }
        this.f11331o = true;
        K4 k42 = this.f11334r;
        if (k42 != null) {
            T2.L.f5672l.removeCallbacks(k42);
        }
        T2.H h3 = T2.L.f5672l;
        K4 k43 = new K4(5, this);
        this.f11334r = k43;
        h3.postDelayed(k43, this.f11336t);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
        int i = 0;
        this.f11331o = false;
        boolean z3 = this.f11330n;
        this.f11330n = true;
        K4 k42 = this.f11334r;
        if (k42 != null) {
            T2.L.f5672l.removeCallbacks(k42);
        }
        synchronized (this.f11329m) {
            ArrayList arrayList = this.f11333q;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (Exception e3) {
                    P2.o.f4767B.f4774g.i("AppActivityTracker.ActivityListener.onActivityResumed", e3);
                    U2.j.g("", e3);
                }
            }
            if (z3) {
                U2.j.d("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.f11332p;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        ((S5) obj2).A(true);
                    } catch (Exception e5) {
                        U2.j.g("", e5);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
