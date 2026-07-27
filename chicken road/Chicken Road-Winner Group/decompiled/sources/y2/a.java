package y2;

import B2.t;
import B2.u;
import B2.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.AbstractC1242v;
import w2.C1227f;
import w2.l0;

/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f10588a = d.f10615p;

    /* renamed from: b, reason: collision with root package name */
    public C1227f f10589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f10590c;

    public a(b bVar) {
        this.f10590c = bVar;
    }

    @Override // w2.l0
    public final void a(t tVar, int i3) {
        C1227f c1227f = this.f10589b;
        if (c1227f != null) {
            c1227f.a(tVar, i3);
        }
    }

    public final Object b(z2.f fVar) {
        j jVar;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f10595g;
        b bVar = this.f10590c;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f10591b.get(bVar), true)) {
                this.f10588a = d.f10611l;
                Throwable m3 = bVar.m();
                if (m3 == null) {
                    return Boolean.FALSE;
                }
                int i3 = u.f182a;
                throw m3;
            }
            long andIncrement = b.f10592c.getAndIncrement(bVar);
            long j3 = d.f10602b;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (jVar2.f181c != j4) {
                jVar = bVar.k(j4, jVar2);
                if (jVar == null) {
                    continue;
                }
            } else {
                jVar = jVar2;
            }
            Object A3 = bVar.A(jVar, i4, andIncrement, null);
            v vVar = d.f10612m;
            if (A3 == vVar) {
                throw new IllegalStateException("unreachable");
            }
            v vVar2 = d.f10614o;
            if (A3 != vVar2) {
                if (A3 != d.f10613n) {
                    jVar.a();
                    this.f10588a = A3;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f10590c;
                C1227f d3 = AbstractC1242v.d(F2.b.y(fVar));
                try {
                    this.f10589b = d3;
                    Object A4 = bVar2.A(jVar, i4, andIncrement, this);
                    if (A4 == vVar) {
                        a(jVar, i4);
                    } else {
                        if (A4 == vVar2) {
                            if (andIncrement < bVar2.p()) {
                                jVar.a();
                            }
                            j jVar3 = (j) b.f10595g.get(bVar2);
                            while (true) {
                                if (bVar2.r(b.f10591b.get(bVar2), true)) {
                                    C1227f c1227f = this.f10589b;
                                    kotlin.jvm.internal.j.b(c1227f);
                                    this.f10589b = null;
                                    this.f10588a = d.f10611l;
                                    Throwable m4 = bVar.m();
                                    if (m4 == null) {
                                        c1227f.e(Boolean.FALSE);
                                    } else {
                                        c1227f.e(X0.a.n(m4));
                                    }
                                } else {
                                    long andIncrement2 = b.f10592c.getAndIncrement(bVar2);
                                    long j5 = d.f10602b;
                                    long j6 = andIncrement2 / j5;
                                    int i5 = (int) (andIncrement2 % j5);
                                    if (jVar3.f181c != j6) {
                                        j k3 = bVar2.k(j6, jVar3);
                                        if (k3 != null) {
                                            jVar3 = k3;
                                        }
                                    }
                                    Object A5 = bVar2.A(jVar3, i5, andIncrement2, this);
                                    if (A5 == d.f10612m) {
                                        a(jVar3, i5);
                                        break;
                                    }
                                    if (A5 == d.f10614o) {
                                        if (andIncrement2 < bVar2.p()) {
                                            jVar3.a();
                                        }
                                    } else {
                                        if (A5 == d.f10613n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar3.a();
                                        this.f10588a = A5;
                                        this.f10589b = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            jVar.a();
                            this.f10588a = A4;
                            this.f10589b = null;
                            bool = Boolean.TRUE;
                        }
                        d3.A(bool, null);
                    }
                    return d3.s();
                } catch (Throwable th) {
                    d3.z();
                    throw th;
                }
            }
            if (andIncrement < bVar.p()) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }
}
