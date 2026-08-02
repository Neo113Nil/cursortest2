package c2;

import A1.P0;
import A1.Q0;
import A1.R0;

/* renamed from: c2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816w extends AbstractC0812s {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f10413e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f10414c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10415d;

    public C0816w(R0 r02, Object obj, Object obj2) {
        super(r02);
        this.f10414c = obj;
        this.f10415d = obj2;
    }

    @Override // c2.AbstractC0812s, A1.R0
    public final int b(Object obj) {
        Object obj2;
        if (f10413e.equals(obj) && (obj2 = this.f10415d) != null) {
            obj = obj2;
        }
        return this.f10399b.b(obj);
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p02, boolean z4) {
        this.f10399b.f(i7, p02, z4);
        if (v2.t.a(p02.f187b, this.f10415d) && z4) {
            p02.f187b = f10413e;
        }
        return p02;
    }

    @Override // c2.AbstractC0812s, A1.R0
    public final Object l(int i7) {
        Object l7 = this.f10399b.l(i7);
        return v2.t.a(l7, this.f10415d) ? f10413e : l7;
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q02, long j) {
        this.f10399b.m(i7, q02, j);
        if (v2.t.a(q02.f211a, this.f10414c)) {
            q02.f211a = Q0.f200I;
        }
        return q02;
    }
}
