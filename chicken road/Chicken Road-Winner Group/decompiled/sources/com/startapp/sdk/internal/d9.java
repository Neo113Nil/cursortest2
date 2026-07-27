package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f3571a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3572b;

    /* renamed from: c, reason: collision with root package name */
    public String f3573c;

    /* renamed from: d, reason: collision with root package name */
    public String f3574d;

    /* renamed from: e, reason: collision with root package name */
    public String f3575e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public String f3576g;

    /* renamed from: h, reason: collision with root package name */
    public Long f3577h;

    /* renamed from: i, reason: collision with root package name */
    public String f3578i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3579j;

    /* renamed from: k, reason: collision with root package name */
    public String f3580k;

    public d9(e9 e9Var) {
        if (e9Var != e9.f) {
            this.f3571a = e9Var;
        } else {
            this.f3571a = e9.f3618e;
        }
        e9 e9Var2 = this.f3571a;
        if (e9Var2 == e9.f3618e || e9Var2 == e9.f3617d) {
            this.f3578i = si.a(si.a(0));
        }
        this.f3572b = 0L;
    }

    public static void a(Throwable th) {
        try {
            new d9(th).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3334U.f4509a;
            if (aVar != null) {
                ((t9) aVar.f3369q.a()).a(this);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, e9 e9Var) {
        try {
            new d9(th, e9Var).a();
        } catch (Throwable unused) {
        }
    }

    public d9(Throwable th) {
        this.f3571a = e9.f;
        this.f3575e = si.b(th);
        this.f3574d = si.a(si.a(th));
        this.f3578i = si.a(si.a(1));
        this.f3572b = 0L;
    }

    public d9(Throwable th, e9 e9Var) {
        boolean z3 = e9Var == e9.f3619g;
        this.f3571a = e9Var;
        this.f3575e = si.b(th);
        this.f3574d = si.a(si.a(th));
        this.f3578i = z3 ? th.getClass().getName() : si.a(si.a(1));
        this.f3572b = 0L;
    }

    public d9(e9 e9Var, long j3) {
        this.f3571a = e9Var;
        this.f3572b = j3;
    }
}
