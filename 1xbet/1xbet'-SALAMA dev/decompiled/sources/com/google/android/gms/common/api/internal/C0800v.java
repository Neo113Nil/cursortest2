package com.google.android.gms.common.api.internal;

import G4.C0286t;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import p098n4.C0934g;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0800v implements p068j2.g, p141t4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11197d;

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    @Override // p141t4.b
    public v4.l C(v4.l lVar, v4.l lVar2, C0286t c0286t) {
        v4.l lVar3;
        Iterator it;
        v4.p pVar;
        v4.p pVar2;
        int i7;
        boolean zR = lVar2.f17192a.r();
        v4.k kVar = (v4.k) this.f11197d;
        p072k1.g gVar = (p072k1.g) this.f11196c;
        if (zR) {
            lVar3 = new v4.l(v4.j.f17190e, kVar);
        } else {
            v4.r rVar = lVar2.f17192a;
            if (rVar.isEmpty()) {
                lVar3 = new v4.l(v4.j.f17190e, kVar);
            } else {
                lVar3 = new v4.l(rVar.v(v4.j.f17190e), lVar2.f17194c, lVar2.f17193b);
                if (this.f11195b) {
                    lVar2.l();
                    it = com.google.android.gms.common.internal.D.m(lVar2.f17193b, v4.l.f17191d) ? rVar.w() : new E3.F(lVar2.f17193b.f14781a.w(), 1);
                    pVar = (v4.p) gVar.f14683d;
                    pVar2 = (v4.p) gVar.f14682c;
                    i7 = -1;
                } else {
                    it = lVar2.iterator();
                    pVar = (v4.p) gVar.f14682c;
                    pVar2 = (v4.p) gVar.f14683d;
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
                        lVar3 = lVar3.t(pVar3.f17201a, v4.j.f17190e);
                    } else {
                        i8++;
                    }
                }
            }
        }
        ((p033e3.h) gVar.f14680a).C(lVar, lVar3, c0286t);
        return lVar3;
    }

    @Override // p141t4.b
    public v4.l D(v4.l lVar, v4.c cVar, v4.r rVar, C0934g c0934g, p141t4.a aVar, C0286t c0286t) {
        v4.p pVar;
        v4.p pVar2 = new v4.p(cVar, rVar);
        p072k1.g gVar = (p072k1.g) this.f11196c;
        v4.r rVar2 = !gVar.J(pVar2) ? v4.j.f17190e : rVar;
        if (lVar.f17192a.o(cVar).equals(rVar2)) {
            return lVar;
        }
        v4.r rVar3 = lVar.f17192a;
        int iK = rVar3.k();
        int i7 = this.f11194a;
        if (iK < i7) {
            return ((p033e3.h) gVar.f14680a).D(lVar, cVar, rVar2, c0934g, aVar, c0286t);
        }
        int iCompare = 1;
        p120q4.k.c(rVar3.k() == i7);
        v4.p pVar3 = new v4.p(cVar, rVar2);
        v4.p pVar4 = null;
        boolean z4 = this.f11195b;
        if (z4) {
            if (rVar3 instanceof v4.f) {
                lVar.l();
                if (com.google.android.gms.common.internal.D.m(lVar.f17193b, v4.l.f17191d)) {
                    v4.c cVar2 = (v4.c) ((v4.f) rVar3).f17184a.z();
                    pVar = new v4.p(cVar2, rVar3.o(cVar2));
                    pVar4 = pVar;
                } else {
                    pVar4 = (v4.p) lVar.f17193b.f14781a.z();
                }
            }
        } else if (rVar3 instanceof v4.f) {
            lVar.l();
            if (com.google.android.gms.common.internal.D.m(lVar.f17193b, v4.l.f17191d)) {
                v4.c cVar3 = (v4.c) ((v4.f) rVar3).f17184a.y();
                pVar = new v4.p(cVar3, rVar3.o(cVar3));
                pVar4 = pVar;
            } else {
                pVar4 = (v4.p) lVar.f17193b.f14781a.y();
            }
        }
        v4.p pVar5 = pVar4;
        boolean zJ = gVar.J(pVar3);
        boolean zI = rVar3.i(cVar);
        v4.k kVar = (v4.k) this.f11197d;
        if (!zI) {
            if (!rVar2.isEmpty() && zJ) {
                if ((z4 ? kVar.compare(pVar3, pVar5) : kVar.compare(pVar5, pVar3)) >= 0) {
                    if (c0286t != null) {
                        c0286t.d(new p134s4.c(1, v4.l.m(pVar5.f17202b), pVar5.f17201a, null, null));
                        c0286t.d(new p134s4.c(2, v4.l.m(rVar2), cVar, null, null));
                    }
                    return lVar.t(cVar, rVar2).t(pVar5.f17201a, v4.j.f17190e);
                }
            }
            return lVar;
        }
        v4.r rVarO = rVar3.o(cVar);
        v4.p pVarQ = aVar.q(kVar, pVar5, z4);
        while (pVarQ != null) {
            v4.c cVar4 = pVarQ.f17201a;
            if (!cVar4.equals(cVar) && !rVar3.i(cVar4)) {
                break;
            }
            pVarQ = aVar.q(kVar, pVarQ, z4);
        }
        if (pVarQ != null) {
            iCompare = z4 ? kVar.compare(pVar3, pVarQ) : kVar.compare(pVarQ, pVar3);
        }
        if (zJ && !rVar2.isEmpty() && iCompare >= 0) {
            if (c0286t != null) {
                c0286t.d(new p134s4.c(4, v4.l.m(rVar2), cVar, null, v4.l.m(rVarO)));
            }
            return lVar.t(cVar, rVar2);
        }
        if (c0286t != null) {
            c0286t.d(new p134s4.c(1, v4.l.m(rVarO), cVar, null, null));
        }
        v4.l lVarT = lVar.t(cVar, v4.j.f17190e);
        if (pVarQ == null || !gVar.J(pVarQ)) {
            return lVarT;
        }
        v4.r rVar4 = pVarQ.f17202b;
        v4.c cVar5 = pVarQ.f17201a;
        if (c0286t != null) {
            c0286t.d(new p134s4.c(2, v4.l.m(rVar4), cVar5, null, null));
        }
        return lVarT.t(cVar5, rVar4);
    }

    @Override // p141t4.b
    public v4.k N() {
        return (v4.k) this.f11197d;
    }

    @Override // D1.d
    public p068j2.d b() {
        p151v2.a.h(!this.f11195b);
        if (this.f11194a == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f11197d;
            if (!arrayDeque.isEmpty()) {
                p068j2.d dVar = (p068j2.d) arrayDeque.removeFirst();
                p068j2.j jVar = (p068j2.j) this.f11196c;
                if (jVar.f(4)) {
                    dVar.b(4);
                } else {
                    long j = jVar.f1699f;
                    ByteBuffer byteBuffer = jVar.f1697d;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    dVar.y(jVar.f1699f, new K1.c(j, p151v2.a.o(p068j2.b.f14574J, parcelableArrayList)), 0L);
                }
                jVar.t();
                this.f11194a = 0;
                return dVar;
            }
        }
        return null;
    }

    @Override // D1.d
    public Object c() {
        p151v2.a.h(!this.f11195b);
        if (this.f11194a != 0) {
            return null;
        }
        this.f11194a = 1;
        return (p068j2.j) this.f11196c;
    }

    @Override // D1.d
    public void d(p068j2.j jVar) {
        p151v2.a.h(!this.f11195b);
        p151v2.a.h(this.f11194a == 1);
        p151v2.a.f(((p068j2.j) this.f11196c) == jVar);
        this.f11194a = 2;
    }

    public N e() {
        com.google.android.gms.common.internal.D.a("execute parameter required", ((InterfaceC0797s) this.f11196c) != null);
        return new N(this, (Feature[]) this.f11197d, this.f11195b, this.f11194a);
    }

    @Override // D1.d
    public void flush() {
        p151v2.a.h(!this.f11195b);
        ((p068j2.j) this.f11196c).t();
        this.f11194a = 0;
    }

    @Override // p141t4.b
    public p033e3.h i() {
        return (p033e3.h) ((p072k1.g) this.f11196c).f14680a;
    }

    @Override // p141t4.b
    public boolean l() {
        return true;
    }

    @Override // D1.d
    public void release() {
        this.f11195b = true;
    }

    @Override // p068j2.g
    public void a(long j) {
    }

    @Override // p141t4.b
    public v4.l E(v4.l lVar, v4.r rVar) {
        return lVar;
    }
}
