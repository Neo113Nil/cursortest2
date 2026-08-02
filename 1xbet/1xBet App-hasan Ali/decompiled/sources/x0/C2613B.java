package x0;

import java.util.List;
import java.util.Map;
import r.C2321G;
import w0.AbstractC2540a;
import z0.C2731G;
import z0.EnumC2727C;

/* renamed from: x0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2613B implements j0, Q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E f20911k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f20912l;

    public C2613B(K k5) {
        this.f20912l = k5;
        this.f20911k = k5.f20948r;
    }

    @Override // x0.j0
    public final List C(i4.e eVar, Object obj) {
        K k5 = this.f20912l;
        C2731G c2731g = (C2731G) k5.f20947q.g(obj);
        C2731G c2731g2 = k5.f20941k;
        if (c2731g != null && ((R.b) c2731g2.o()).f5100k.j(c2731g) < k5.f20944n) {
            return c2731g.m();
        }
        R.e eVar2 = k5.f20953w;
        if (eVar2.f5108m < k5.f20945o) {
            AbstractC2540a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eVar2.f5108m;
        int i5 = k5.f20945o;
        if (i == i5) {
            eVar2.c(obj);
        } else {
            Object[] objArr = eVar2.f5106k;
            Object obj2 = objArr[i5];
            objArr[i5] = obj;
        }
        k5.f20945o++;
        C2321G c2321g = k5.f20950t;
        if (c2321g.b(obj)) {
            C2731G c2731g3 = (C2731G) c2321g.g(obj);
            C2614C c2614c = c2731g3 != null ? (C2614C) k5.f20946p.g(c2731g3) : null;
            if (c2614c != null && c2614c.f20916d) {
                k5.f(c2731g3, obj, eVar);
            }
        } else {
            k5.f20952v.m(obj, k5.d(eVar, obj));
            if (c2731g2.f21613P.f21653d == EnumC2727C.f21587m) {
                c2731g2.T(true);
            } else {
                C2731G.U(c2731g2, true, 6);
            }
        }
        C2731G c2731g4 = (C2731G) c2321g.g(obj);
        if (c2731g4 == null) {
            return X3.v.f6090k;
        }
        List f02 = c2731g4.f21613P.f21663p.f0();
        R.b bVar = (R.b) f02;
        int i6 = bVar.f5100k.f5108m;
        for (int i7 = 0; i7 < i6; i7++) {
            ((z0.Y) bVar.get(i7)).f21750p.f21651b = true;
        }
        return f02;
    }

    @Override // W0.c
    public final float D(long j5) {
        E e3 = this.f20911k;
        e3.getClass();
        return L1.a.c(j5, e3);
    }

    @Override // W0.c
    public final int K(float f) {
        E e3 = this.f20911k;
        e3.getClass();
        return L1.a.b(f, e3);
    }

    @Override // W0.c
    public final long S(long j5) {
        E e3 = this.f20911k;
        e3.getClass();
        return L1.a.f(j5, e3);
    }

    @Override // W0.c
    public final float V(long j5) {
        E e3 = this.f20911k;
        e3.getClass();
        return L1.a.e(j5, e3);
    }

    @Override // W0.c
    public final long b0(float f) {
        return this.f20911k.b0(f);
    }

    @Override // W0.c
    public final float c() {
        return this.f20911k.f20926l;
    }

    @Override // x0.InterfaceC2632s
    public final W0.m getLayoutDirection() {
        return this.f20911k.f20925k;
    }

    @Override // W0.c
    public final float h0(int i) {
        return this.f20911k.h0(i);
    }

    @Override // x0.Q
    public final P i(int i, int i5, Map map, i4.c cVar) {
        return this.f20911k.p(i, i5, map, null, cVar);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / this.f20911k.c();
    }

    @Override // W0.c
    public final float n() {
        return this.f20911k.f20927m;
    }

    @Override // x0.Q
    public final P p(int i, int i5, Map map, i0.K k5, i4.c cVar) {
        return this.f20911k.p(i, i5, map, k5, cVar);
    }

    @Override // x0.InterfaceC2632s
    public final boolean t() {
        return this.f20911k.t();
    }

    @Override // W0.c
    public final long x(long j5) {
        E e3 = this.f20911k;
        e3.getClass();
        return L1.a.d(j5, e3);
    }

    @Override // W0.c
    public final float y(float f) {
        return this.f20911k.c() * f;
    }
}
