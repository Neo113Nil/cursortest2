package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259bj implements io.appmetrica.analytics.impl.InterfaceC0497l {

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ve f5587a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.coreapi.internal.model.ScreenInfo f5588b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5589c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5590d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0233aj f5591e = new io.appmetrica.analytics.impl.C0233aj();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f5592f = new java.lang.ref.WeakReference(null);

    public final synchronized void a(android.app.Activity activity) {
        this.f5592f = new java.lang.ref.WeakReference(activity);
        if (!this.f5590d) {
            this.f5588b = a((android.content.Context) activity).p();
            this.f5589c = a((android.content.Context) activity).t();
            this.f5590d = true;
        }
        if (this.f5588b == null) {
            c(activity);
        }
    }

    public final synchronized io.appmetrica.analytics.coreapi.internal.model.ScreenInfo b(android.content.Context context) {
        try {
            if (!this.f5590d) {
                this.f5588b = a(context).p();
                this.f5589c = a(context).t();
                this.f5590d = true;
            }
            c((android.content.Context) this.f5592f.get());
            if (this.f5588b == null) {
                if (!io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.f5589c) {
                    c(context);
                    this.f5589c = true;
                    a(context).v();
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f5588b;
    }

    public final void c(android.content.Context context) {
        if (context != null) {
            this.f5591e.getClass();
            io.appmetrica.analytics.coreapi.internal.model.ScreenInfo a2 = io.appmetrica.analytics.impl.C0233aj.a(context);
            if (a2 == null || a2.equals(this.f5588b)) {
                return;
            }
            this.f5588b = a2;
            a(context).a(this.f5588b);
        }
    }

    public final io.appmetrica.analytics.impl.Ve a(android.content.Context context) {
        if (this.f5587a == null) {
            this.f5587a = new io.appmetrica.analytics.impl.Ve(io.appmetrica.analytics.impl.C0244b4.l().c(context).a(context));
        }
        io.appmetrica.analytics.impl.Ve ve = this.f5587a;
        kotlin.jvm.internal.i.b(ve);
        return ve;
    }

    public final void a(io.appmetrica.analytics.impl.Ve ve) {
        this.f5587a = ve;
    }
}
