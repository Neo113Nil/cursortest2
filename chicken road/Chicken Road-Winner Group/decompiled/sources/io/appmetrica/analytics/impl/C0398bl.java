package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398bl {

    /* renamed from: a, reason: collision with root package name */
    public final C0712o f7064a;

    /* renamed from: b, reason: collision with root package name */
    public final C0847t5 f7065b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f7066c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f7067d;

    /* renamed from: e, reason: collision with root package name */
    public final C0764q f7068e;
    public final C0660m f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7069g;

    public C0398bl(C0712o c0712o, C0660m c0660m) {
        this(c0712o, c0660m, new C0847t5(), new C0764q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f7069g) {
                    C0847t5 c0847t5 = this.f7065b;
                    To to = new To(this, activity, 0);
                    c0847t5.getClass();
                    C0587j4.l().f7572c.a().execute(new RunnableC0821s5(c0847t5, to));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f7069g) {
                    C0847t5 c0847t5 = this.f7065b;
                    To to = new To(this, activity, 1);
                    c0847t5.getClass();
                    C0587j4.l().f7572c.a().execute(new RunnableC0821s5(c0847t5, to));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0398bl(C0712o c0712o, C0660m c0660m, C0847t5 c0847t5, C0764q c0764q) {
        this.f7069g = false;
        this.f7064a = c0712o;
        this.f = c0660m;
        this.f7065b = c0847t5;
        this.f7068e = c0764q;
        final int i3 = 0;
        this.f7066c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.Uo

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0398bl f6733b;

            {
                this.f6733b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i3) {
                    case 0:
                        this.f6733b.a(activity, activityEvent);
                        break;
                    default:
                        this.f6733b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f7067d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.Uo

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0398bl f6733b;

            {
                this.f6733b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i4) {
                    case 0:
                        this.f6733b.a(activity, activityEvent);
                        break;
                    default:
                        this.f6733b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final synchronized EnumC0686n a() {
        try {
            if (!this.f7069g) {
                this.f7064a.registerListener(this.f7066c, ActivityEvent.RESUMED);
                this.f7064a.registerListener(this.f7067d, ActivityEvent.PAUSED);
                this.f7069g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7064a.f7970b;
    }

    public final void b(Activity activity, C0725oc c0725oc) {
        if (this.f7068e.a(activity, EnumC0738p.PAUSED)) {
            c0725oc.b(activity);
        }
    }

    public final void a(Activity activity, C0725oc c0725oc) {
        if (this.f7068e.a(activity, EnumC0738p.RESUMED)) {
            c0725oc.a(activity);
        }
    }
}
