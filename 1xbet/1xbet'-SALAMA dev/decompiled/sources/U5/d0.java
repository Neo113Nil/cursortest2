package U5;

import W5.C0517l;
import W5.C0542t1;
import W5.H0;
import W5.O0;
import W5.S1;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0542t1 f6483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f6484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1 f6485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0 f6486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0517l f6487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H0 f6488g;

    public d0(Integer num, C0542t1 c0542t1, p0 p0Var, S1 s7, O0 o7, C0517l c0517l, H0 h6) {
        this.f6482a = num.intValue();
        p113p3.f.k(c0542t1, "proxyDetector not set");
        this.f6483b = c0542t1;
        this.f6484c = p0Var;
        this.f6485d = s7;
        this.f6486e = o7;
        this.f6487f = c0517l;
        this.f6488g = h6;
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.e("defaultPort", String.valueOf(this.f6482a));
        jVarU0.a(this.f6483b, "proxyDetector");
        jVarU0.a(this.f6484c, "syncContext");
        jVarU0.a(this.f6485d, "serviceConfigParser");
        jVarU0.a(this.f6486e, "scheduledExecutorService");
        jVarU0.a(this.f6487f, "channelLogger");
        jVarU0.a(this.f6488g, "executor");
        jVarU0.a(null, "overrideAuthority");
        return jVarU0.toString();
    }
}
