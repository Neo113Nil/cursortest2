package U5;

import W5.C0517l;
import W5.C0542t1;
import W5.H0;
import W5.O0;
import W5.S1;
import a.AbstractC0603a;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6482a;

    /* renamed from: b, reason: collision with root package name */
    public final C0542t1 f6483b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f6484c;

    /* renamed from: d, reason: collision with root package name */
    public final S1 f6485d;

    /* renamed from: e, reason: collision with root package name */
    public final O0 f6486e;

    /* renamed from: f, reason: collision with root package name */
    public final C0517l f6487f;

    /* renamed from: g, reason: collision with root package name */
    public final H0 f6488g;

    public d0(Integer num, C0542t1 c0542t1, p0 p0Var, S1 s12, O0 o02, C0517l c0517l, H0 h02) {
        this.f6482a = num.intValue();
        p3.f.k(c0542t1, "proxyDetector not set");
        this.f6483b = c0542t1;
        this.f6484c = p0Var;
        this.f6485d = s12;
        this.f6486e = o02;
        this.f6487f = c0517l;
        this.f6488g = h02;
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.e("defaultPort", String.valueOf(this.f6482a));
        u02.a(this.f6483b, "proxyDetector");
        u02.a(this.f6484c, "syncContext");
        u02.a(this.f6485d, "serviceConfigParser");
        u02.a(this.f6486e, "scheduledExecutorService");
        u02.a(this.f6487f, "channelLogger");
        u02.a(this.f6488g, "executor");
        u02.a(null, "overrideAuthority");
        return u02.toString();
    }
}
