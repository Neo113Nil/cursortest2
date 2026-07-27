package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547bl {

    /* renamed from: a, reason: collision with root package name */
    public final C0861o f7950a;

    /* renamed from: b, reason: collision with root package name */
    public final C0996t5 f7951b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f7952c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f7953d;

    /* renamed from: e, reason: collision with root package name */
    public final C0913q f7954e;

    /* renamed from: f, reason: collision with root package name */
    public final C0809m f7955f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7956g;

    public C0547bl(C0861o c0861o, C0809m c0809m) {
        this(c0861o, c0809m, new C0996t5(), new C0913q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f7956g) {
                    C0996t5 c0996t5 = this.f7951b;
                    So so = new So(this, activity, 0);
                    c0996t5.getClass();
                    C0736j4.l().f8484c.a().execute(new RunnableC0970s5(c0996t5, so));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f7956g) {
                    C0996t5 c0996t5 = this.f7951b;
                    So so = new So(this, activity, 1);
                    c0996t5.getClass();
                    C0736j4.l().f8484c.a().execute(new RunnableC0970s5(c0996t5, so));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0547bl(C0861o c0861o, C0809m c0809m, C0996t5 c0996t5, C0913q c0913q) {
        this.f7956g = false;
        this.f7950a = c0861o;
        this.f7955f = c0809m;
        this.f7951b = c0996t5;
        this.f7954e = c0913q;
        final int i2 = 0;
        this.f7952c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.To

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0547bl f7560b;

            {
                this.f7560b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i2) {
                    case 0:
                        this.f7560b.a(activity, activityEvent);
                        break;
                    default:
                        this.f7560b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f7953d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.To

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0547bl f7560b;

            {
                this.f7560b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i3) {
                    case 0:
                        this.f7560b.a(activity, activityEvent);
                        break;
                    default:
                        this.f7560b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final synchronized EnumC0835n a() {
        try {
            if (!this.f7956g) {
                this.f7950a.registerListener(this.f7952c, ActivityEvent.RESUMED);
                this.f7950a.registerListener(this.f7953d, ActivityEvent.PAUSED);
                this.f7956g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7950a.f8901b;
    }

    public final void b(Activity activity, C0874oc c0874oc) {
        if (this.f7954e.a(activity, EnumC0887p.PAUSED)) {
            c0874oc.b(activity);
        }
    }

    public final void a(Activity activity, C0874oc c0874oc) {
        if (this.f7954e.a(activity, EnumC0887p.RESUMED)) {
            c0874oc.a(activity);
        }
    }
}
