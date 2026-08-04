package p018c2;

import A1.P0;
import A1.Q0;
import A1.R0;
import p151v2.t;

/* JADX INFO: renamed from: c2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776w extends AbstractC0772s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f10413e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10415d;

    public C0776w(R0 r7, Object obj, Object obj2) {
        super(r7);
        this.f10414c = obj;
        this.f10415d = obj2;
    }

    @Override // p018c2.AbstractC0772s, A1.R0
    public final int b(Object obj) {
        Object obj2;
        if (f10413e.equals(obj) && (obj2 = this.f10415d) != null) {
            obj = obj2;
        }
        return this.f10399b.b(obj);
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p5, boolean z4) {
        this.f10399b.f(i7, p5, z4);
        if (t.a(p5.f187b, this.f10415d) && z4) {
            p5.f187b = f10413e;
        }
        return p5;
    }

    @Override // p018c2.AbstractC0772s, A1.R0
    public final Object l(int i7) {
        Object objL = this.f10399b.l(i7);
        return t.a(objL, this.f10415d) ? f10413e : objL;
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q1, long j) {
        this.f10399b.m(i7, q1, j);
        if (t.a(q1.f211a, this.f10414c)) {
            q1.f211a = Q0.f200I;
        }
        return q1;
    }
}
