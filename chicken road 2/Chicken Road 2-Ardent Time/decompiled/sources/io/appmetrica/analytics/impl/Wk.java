package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0575o f5223a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0529m5 f5224b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener f5225c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener f5226d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0627q f5227e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0523m f5228f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5229g;

    public Wk(io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.impl.C0523m c0523m) {
        this(c0575o, c0523m, new io.appmetrica.analytics.impl.C0529m5(), new io.appmetrica.analytics.impl.C0627q());
    }

    public final void a(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        synchronized (this) {
            io.appmetrica.analytics.impl.C0529m5 c0529m5 = this.f5224b;
            io.appmetrica.analytics.impl.Vo vo = new io.appmetrica.analytics.impl.Vo(this, activity, 0);
            c0529m5.getClass();
            io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0503l5(c0529m5, vo));
        }
    }

    public final void b(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        synchronized (this) {
            io.appmetrica.analytics.impl.C0529m5 c0529m5 = this.f5224b;
            io.appmetrica.analytics.impl.Vo vo = new io.appmetrica.analytics.impl.Vo(this, activity, 1);
            c0529m5.getClass();
            io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0503l5(c0529m5, vo));
        }
    }

    public Wk(io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.impl.C0523m c0523m, io.appmetrica.analytics.impl.C0529m5 c0529m5, io.appmetrica.analytics.impl.C0627q c0627q) {
        this.f5229g = false;
        this.f5223a = c0575o;
        this.f5228f = c0523m;
        this.f5224b = c0529m5;
        this.f5227e = c0627q;
        final int i2 = 0;
        this.f5225c = new io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.Uo

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.appmetrica.analytics.impl.Wk f5095b;

            {
                this.f5095b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
                switch (i2) {
                    case 0:
                        this.f5095b.a(activity, activityEvent);
                        break;
                    default:
                        this.f5095b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f5226d = new io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.Uo

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.appmetrica.analytics.impl.Wk f5095b;

            {
                this.f5095b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
                switch (i3) {
                    case 0:
                        this.f5095b.a(activity, activityEvent);
                        break;
                    default:
                        this.f5095b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final void a(android.app.Activity activity, io.appmetrica.analytics.impl.C0407hc c0407hc) {
        if (this.f5229g && this.f5227e.a(activity, io.appmetrica.analytics.impl.EnumC0601p.RESUMED)) {
            c0407hc.a(activity);
        }
    }

    public final void b(android.app.Activity activity, io.appmetrica.analytics.impl.C0407hc c0407hc) {
        if (this.f5229g && this.f5227e.a(activity, io.appmetrica.analytics.impl.EnumC0601p.PAUSED)) {
            c0407hc.b(activity);
        }
    }

    public final synchronized io.appmetrica.analytics.impl.EnumC0549n a() {
        try {
            if (!this.f5229g) {
                this.f5223a.registerListener(this.f5225c, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.RESUMED);
                this.f5223a.registerListener(this.f5226d, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.PAUSED);
                this.f5229g = true;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f5223a.f6547b;
    }
}
