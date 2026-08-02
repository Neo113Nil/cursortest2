package P0;

import Sc.C;
import l1.C7807Z;

/* loaded from: classes8.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f21111a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21112b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21113c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21114d;

    /* renamed from: e, reason: collision with root package name */
    private final long f21115e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21116f;

    /* renamed from: g, reason: collision with root package name */
    private final long f21117g;

    /* renamed from: h, reason: collision with root package name */
    private final long f21118h;

    /* renamed from: i, reason: collision with root package name */
    private final long f21119i;

    /* renamed from: j, reason: collision with root package name */
    private final long f21120j;

    /* renamed from: k, reason: collision with root package name */
    private final long f21121k;

    /* renamed from: l, reason: collision with root package name */
    private final long f21122l;

    /* renamed from: m, reason: collision with root package name */
    private final long f21123m;

    /* renamed from: n, reason: collision with root package name */
    private final long f21124n;

    /* renamed from: o, reason: collision with root package name */
    private final long f21125o;

    /* renamed from: p, reason: collision with root package name */
    private final long f21126p;

    public j2(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27) {
        this.f21111a = j11;
        this.f21112b = j12;
        this.f21113c = j13;
        this.f21114d = j14;
        this.f21115e = j15;
        this.f21116f = j16;
        this.f21117g = j17;
        this.f21118h = j18;
        this.f21119i = j19;
        this.f21120j = j21;
        this.f21121k = j22;
        this.f21122l = j23;
        this.f21123m = j24;
        this.f21124n = j25;
        this.f21125o = j26;
        this.f21126p = j27;
    }

    public final long a(boolean z11, boolean z12) {
        return z11 ? z12 ? this.f21113c : this.f21117g : z12 ? this.f21121k : this.f21125o;
    }

    public final long b(boolean z11, boolean z12) {
        return z11 ? z12 ? this.f21111a : this.f21115e : z12 ? this.f21119i : this.f21123m;
    }

    public final long c(boolean z11, boolean z12) {
        return z11 ? z12 ? this.f21112b : this.f21116f : z12 ? this.f21120j : this.f21124n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return C7807Z.p(this.f21111a, j2Var.f21111a) && C7807Z.p(this.f21112b, j2Var.f21112b) && C7807Z.p(this.f21113c, j2Var.f21113c) && C7807Z.p(this.f21114d, j2Var.f21114d) && C7807Z.p(this.f21115e, j2Var.f21115e) && C7807Z.p(this.f21116f, j2Var.f21116f) && C7807Z.p(this.f21117g, j2Var.f21117g) && C7807Z.p(this.f21118h, j2Var.f21118h) && C7807Z.p(this.f21119i, j2Var.f21119i) && C7807Z.p(this.f21120j, j2Var.f21120j) && C7807Z.p(this.f21121k, j2Var.f21121k) && C7807Z.p(this.f21122l, j2Var.f21122l) && C7807Z.p(this.f21123m, j2Var.f21123m) && C7807Z.p(this.f21124n, j2Var.f21124n) && C7807Z.p(this.f21125o, j2Var.f21125o) && C7807Z.p(this.f21126p, j2Var.f21126p);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f21126p) + Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Long.hashCode(this.f21111a) * 31, 31, this.f21112b), 31, this.f21113c), 31, this.f21114d), 31, this.f21115e), 31, this.f21116f), 31, this.f21117g), 31, this.f21118h), 31, this.f21119i), 31, this.f21120j), 31, this.f21121k), 31, this.f21122l), 31, this.f21123m), 31, this.f21124n), 31, this.f21125o);
    }
}
