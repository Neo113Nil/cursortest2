package F4;

import D4.AbstractC0024y;
import D4.C0007g;
import D4.x0;
import G0.C0051a;
import I4.u;
import I4.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class a implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f691a = d.f721p;

    /* renamed from: b, reason: collision with root package name */
    public C0007g f692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f693c;

    public a(b bVar) {
        this.f693c = bVar;
    }

    @Override // D4.x0
    public final void a(u uVar, int i2) {
        C0007g c0007g = this.f692b;
        if (c0007g != null) {
            c0007g.a(uVar, i2);
        }
    }

    public final Object b(G4.f fVar) {
        C0007g c0007g;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f699h;
        b bVar = this.f693c;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.s(b.f694c.get(bVar), true)) {
                this.f691a = d.f717l;
                Throwable n6 = bVar.n();
                if (n6 == null) {
                    return Boolean.FALSE;
                }
                int i2 = v.f1324a;
                throw n6;
            }
            long andIncrement = b.f695d.getAndIncrement(bVar);
            long j2 = d.f707b;
            long j6 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar.f1323c != j6) {
                j m6 = bVar.m(j6, jVar);
                if (m6 == null) {
                    continue;
                } else {
                    jVar = m6;
                }
            }
            Object B5 = bVar.B(jVar, i3, andIncrement, null);
            C0051a c0051a = d.f718m;
            if (B5 == c0051a) {
                throw new IllegalStateException("unreachable");
            }
            C0051a c0051a2 = d.f720o;
            if (B5 == c0051a2) {
                if (andIncrement < bVar.q()) {
                    jVar.a();
                }
            } else {
                if (B5 != d.f719n) {
                    jVar.a();
                    this.f691a = B5;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f693c;
                C0007g i6 = AbstractC0024y.i(B0.f.F(fVar));
                try {
                    this.f692b = i6;
                    c0007g = i6;
                    try {
                        Object B6 = bVar2.B(jVar, i3, andIncrement, this);
                        if (B6 == c0051a) {
                            a(jVar, i3);
                        } else {
                            I4.p pVar = null;
                            InterfaceC1223i interfaceC1223i = c0007g.f512e;
                            InterfaceC1441l interfaceC1441l = bVar2.f704b;
                            if (B6 == c0051a2) {
                                if (andIncrement < bVar2.q()) {
                                    jVar.a();
                                }
                                j jVar2 = (j) b.f699h.get(bVar2);
                                while (true) {
                                    if (bVar2.s(b.f694c.get(bVar2), true)) {
                                        C0007g c0007g2 = this.f692b;
                                        kotlin.jvm.internal.i.b(c0007g2);
                                        this.f692b = null;
                                        this.f691a = d.f717l;
                                        Throwable n7 = bVar.n();
                                        if (n7 == null) {
                                            c0007g2.resumeWith(Boolean.FALSE);
                                        } else {
                                            c0007g2.resumeWith(e5.g.l(n7));
                                        }
                                    } else {
                                        long andIncrement2 = b.f695d.getAndIncrement(bVar2);
                                        long j7 = d.f707b;
                                        long j8 = andIncrement2 / j7;
                                        int i7 = (int) (andIncrement2 % j7);
                                        if (jVar2.f1323c != j8) {
                                            j m7 = bVar2.m(j8, jVar2);
                                            if (m7 != null) {
                                                jVar2 = m7;
                                            }
                                        }
                                        InterfaceC1441l interfaceC1441l2 = interfaceC1441l;
                                        Object B7 = bVar2.B(jVar2, i7, andIncrement2, this);
                                        if (B7 == d.f718m) {
                                            a(jVar2, i7);
                                            break;
                                        }
                                        if (B7 == d.f720o) {
                                            if (andIncrement2 < bVar2.q()) {
                                                jVar2.a();
                                            }
                                            interfaceC1441l = interfaceC1441l2;
                                        } else {
                                            if (B7 == d.f719n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar2.a();
                                            this.f691a = B7;
                                            this.f692b = null;
                                            bool = Boolean.TRUE;
                                            if (interfaceC1441l2 != null) {
                                                pVar = new I4.p(interfaceC1441l2, B7, interfaceC1223i);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f691a = B6;
                                this.f692b = null;
                                bool = Boolean.TRUE;
                                if (interfaceC1441l != null) {
                                    pVar = new I4.p(interfaceC1441l, B6, interfaceC1223i);
                                }
                            }
                            c0007g.f(bool, pVar);
                        }
                        Object r5 = c0007g.r();
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        return r5;
                    } catch (Throwable th) {
                        th = th;
                        c0007g.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0007g = i6;
                }
            }
        }
    }
}
