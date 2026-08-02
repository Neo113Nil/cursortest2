package com.google.android.gms.common.api.internal;

import G4.C0286t;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import e3.C1023h;
import j2.C1305b;
import j2.C1307d;
import j2.C1313j;
import j2.InterfaceC1310g;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import n4.C1473g;
import s4.C1595c;
import t4.InterfaceC1609a;
import t4.InterfaceC1610b;
import v2.AbstractC1664a;

/* renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844v implements InterfaceC1310g, InterfaceC1610b {

    /* renamed from: a, reason: collision with root package name */
    public int f11194a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11195b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11196c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11197d;

    @Override // t4.InterfaceC1610b
    public v4.l C(v4.l lVar, v4.l lVar2, C0286t c0286t) {
        v4.l lVar3;
        Iterator it;
        v4.p pVar;
        v4.p pVar2;
        int i7;
        boolean r7 = lVar2.f17186a.r();
        v4.k kVar = (v4.k) this.f11197d;
        k1.g gVar = (k1.g) this.f11196c;
        if (!r7) {
            v4.r rVar = lVar2.f17186a;
            if (!rVar.isEmpty()) {
                lVar3 = new v4.l(rVar.v(v4.j.f17184e), lVar2.f17188c, lVar2.f17187b);
                if (this.f11195b) {
                    lVar2.l();
                    it = com.google.android.gms.common.internal.D.m(lVar2.f17187b, v4.l.f17185d) ? rVar.w() : new E3.F(lVar2.f17187b.f14775a.w(), 1);
                    pVar = (v4.p) gVar.f14677d;
                    pVar2 = (v4.p) gVar.f14676c;
                    i7 = -1;
                } else {
                    it = lVar2.iterator();
                    pVar = (v4.p) gVar.f14676c;
                    pVar2 = (v4.p) gVar.f14677d;
                    i7 = 1;
                }
                boolean z4 = false;
                int i8 = 0;
                while (it.hasNext()) {
                    v4.p pVar3 = (v4.p) it.next();
                    if (!z4 && kVar.compare(pVar, pVar3) * i7 <= 0) {
                        z4 = true;
                    }
                    if (!z4 || i8 >= this.f11194a || kVar.compare(pVar3, pVar2) * i7 > 0) {
                        lVar3 = lVar3.t(pVar3.f17195a, v4.j.f17184e);
                    } else {
                        i8++;
                    }
                }
                ((C1023h) gVar.f14674a).C(lVar, lVar3, c0286t);
                return lVar3;
            }
        }
        lVar3 = new v4.l(v4.j.f17184e, kVar);
        ((C1023h) gVar.f14674a).C(lVar, lVar3, c0286t);
        return lVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    @Override // t4.InterfaceC1610b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v4.l D(v4.l lVar, v4.c cVar, v4.r rVar, C1473g c1473g, InterfaceC1609a interfaceC1609a, C0286t c0286t) {
        v4.p pVar;
        boolean i7;
        v4.p pVar2 = new v4.p(cVar, rVar);
        k1.g gVar = (k1.g) this.f11196c;
        v4.r rVar2 = !gVar.J(pVar2) ? v4.j.f17184e : rVar;
        if (lVar.f17186a.o(cVar).equals(rVar2)) {
            return lVar;
        }
        v4.r rVar3 = lVar.f17186a;
        int k7 = rVar3.k();
        int i8 = this.f11194a;
        if (k7 < i8) {
            return ((C1023h) gVar.f14674a).D(lVar, cVar, rVar2, c1473g, interfaceC1609a, c0286t);
        }
        int i9 = 1;
        q4.k.c(rVar3.k() == i8);
        v4.p pVar3 = new v4.p(cVar, rVar2);
        v4.p pVar4 = null;
        boolean z4 = this.f11195b;
        if (z4) {
            if (rVar3 instanceof v4.f) {
                lVar.l();
                if (com.google.android.gms.common.internal.D.m(lVar.f17187b, v4.l.f17185d)) {
                    v4.c cVar2 = (v4.c) ((v4.f) rVar3).f17178a.z();
                    pVar = new v4.p(cVar2, rVar3.o(cVar2));
                    pVar4 = pVar;
                } else {
                    pVar4 = (v4.p) lVar.f17187b.f14775a.z();
                }
            }
            v4.p pVar5 = pVar4;
            boolean J5 = gVar.J(pVar3);
            i7 = rVar3.i(cVar);
            v4.k kVar = (v4.k) this.f11197d;
            if (i7) {
                if (!rVar2.isEmpty() && J5) {
                    if ((z4 ? kVar.compare(pVar3, pVar5) : kVar.compare(pVar5, pVar3)) >= 0) {
                        if (c0286t != null) {
                            c0286t.d(new C1595c(1, v4.l.m(pVar5.f17196b), pVar5.f17195a, null, null));
                            c0286t.d(new C1595c(2, v4.l.m(rVar2), cVar, null, null));
                        }
                        return lVar.t(cVar, rVar2).t(pVar5.f17195a, v4.j.f17184e);
                    }
                }
                return lVar;
            }
            v4.r o7 = rVar3.o(cVar);
            v4.p q7 = interfaceC1609a.q(kVar, pVar5, z4);
            while (q7 != null) {
                v4.c cVar3 = q7.f17195a;
                if (!cVar3.equals(cVar) && !rVar3.i(cVar3)) {
                    break;
                }
                q7 = interfaceC1609a.q(kVar, q7, z4);
            }
            if (q7 != null) {
                i9 = z4 ? kVar.compare(pVar3, q7) : kVar.compare(q7, pVar3);
            }
            if (J5 && !rVar2.isEmpty() && i9 >= 0) {
                if (c0286t != null) {
                    c0286t.d(new C1595c(4, v4.l.m(rVar2), cVar, null, v4.l.m(o7)));
                }
                return lVar.t(cVar, rVar2);
            }
            if (c0286t != null) {
                c0286t.d(new C1595c(1, v4.l.m(o7), cVar, null, null));
            }
            v4.l t7 = lVar.t(cVar, v4.j.f17184e);
            if (q7 == null || !gVar.J(q7)) {
                return t7;
            }
            v4.r rVar4 = q7.f17196b;
            v4.c cVar4 = q7.f17195a;
            if (c0286t != null) {
                c0286t.d(new C1595c(2, v4.l.m(rVar4), cVar4, null, null));
            }
            return t7.t(cVar4, rVar4);
        }
        if (rVar3 instanceof v4.f) {
            lVar.l();
            if (com.google.android.gms.common.internal.D.m(lVar.f17187b, v4.l.f17185d)) {
                v4.c cVar5 = (v4.c) ((v4.f) rVar3).f17178a.y();
                pVar = new v4.p(cVar5, rVar3.o(cVar5));
                pVar4 = pVar;
            } else {
                pVar4 = (v4.p) lVar.f17187b.f14775a.y();
            }
        }
        v4.p pVar52 = pVar4;
        boolean J52 = gVar.J(pVar3);
        i7 = rVar3.i(cVar);
        v4.k kVar2 = (v4.k) this.f11197d;
        if (i7) {
        }
    }

    @Override // t4.InterfaceC1610b
    public v4.k N() {
        return (v4.k) this.f11197d;
    }

    @Override // D1.d
    public C1307d b() {
        AbstractC1664a.h(!this.f11195b);
        if (this.f11194a == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f11197d;
            if (!arrayDeque.isEmpty()) {
                C1307d c1307d = (C1307d) arrayDeque.removeFirst();
                C1313j c1313j = (C1313j) this.f11196c;
                if (c1313j.f(4)) {
                    c1307d.b(4);
                } else {
                    long j = c1313j.f1699f;
                    ByteBuffer byteBuffer = c1313j.f1697d;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    c1307d.y(c1313j.f1699f, new K1.c(j, AbstractC1664a.o(C1305b.f14568J, parcelableArrayList)), 0L);
                }
                c1313j.t();
                this.f11194a = 0;
                return c1307d;
            }
        }
        return null;
    }

    @Override // D1.d
    public Object c() {
        AbstractC1664a.h(!this.f11195b);
        if (this.f11194a != 0) {
            return null;
        }
        this.f11194a = 1;
        return (C1313j) this.f11196c;
    }

    @Override // D1.d
    public void d(C1313j c1313j) {
        AbstractC1664a.h(!this.f11195b);
        AbstractC1664a.h(this.f11194a == 1);
        AbstractC1664a.f(((C1313j) this.f11196c) == c1313j);
        this.f11194a = 2;
    }

    public N e() {
        com.google.android.gms.common.internal.D.a("execute parameter required", ((InterfaceC0841s) this.f11196c) != null);
        return new N(this, (Feature[]) this.f11197d, this.f11195b, this.f11194a);
    }

    @Override // D1.d
    public void flush() {
        AbstractC1664a.h(!this.f11195b);
        ((C1313j) this.f11196c).t();
        this.f11194a = 0;
    }

    @Override // t4.InterfaceC1610b
    public C1023h i() {
        return (C1023h) ((k1.g) this.f11196c).f14674a;
    }

    @Override // t4.InterfaceC1610b
    public boolean l() {
        return true;
    }

    @Override // D1.d
    public void release() {
        this.f11195b = true;
    }

    @Override // j2.InterfaceC1310g
    public void a(long j) {
    }

    @Override // t4.InterfaceC1610b
    public v4.l E(v4.l lVar, v4.r rVar) {
        return lVar;
    }
}
