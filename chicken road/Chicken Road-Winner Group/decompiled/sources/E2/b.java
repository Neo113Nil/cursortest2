package E2;

import K.b0;
import d2.C0279i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o2.l;
import w2.C1233l;
import w2.C1235n;
import w2.l0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f342e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        super(1);
        this.f342e = i3;
        this.f = obj;
        this.f343g = obj2;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        Object gVar;
        C0279i c0279i;
        C0279i c0279i2;
        switch (this.f342e) {
            case 0:
                ((c) this.f343g).getClass();
                ((d) this.f).e(null);
                return C0279i.f4852a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f346g;
                ((c) this.f343g).getClass();
                d dVar = (d) this.f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return C0279i.f4852a;
            default:
                Throwable th = (Throwable) obj;
                ((g) this.f).invoke(th);
                D0.a aVar = (D0.a) this.f343g;
                ((y2.b) aVar.f263c).f(th, false);
                do {
                    y2.b bVar = (y2.b) aVar.f263c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = y2.b.f10592c;
                    long j3 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = y2.b.f10591b;
                    long j4 = atomicLongFieldUpdater2.get(bVar);
                    boolean z3 = true;
                    if (bVar.r(j4, true)) {
                        gVar = new y2.g(bVar.m());
                    } else {
                        long j5 = j4 & 1152921504606846975L;
                        y2.h hVar = y2.i.f10623a;
                        if (j3 >= j5) {
                            gVar = hVar;
                        } else {
                            Object obj2 = y2.d.f10610k;
                            y2.j jVar = (y2.j) y2.b.f10595g.get(bVar);
                            while (true) {
                                if (bVar.r(atomicLongFieldUpdater2.get(bVar), z3)) {
                                    gVar = new y2.g(bVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                    long j6 = y2.d.f10602b;
                                    y2.h hVar2 = hVar;
                                    long j7 = andIncrement / j6;
                                    int i3 = (int) (andIncrement % j6);
                                    if (jVar.f181c != j7) {
                                        y2.j k3 = bVar.k(j7, jVar);
                                        if (k3 == null) {
                                            continue;
                                            hVar = hVar2;
                                            z3 = true;
                                        } else {
                                            jVar = k3;
                                        }
                                    }
                                    Object A3 = bVar.A(jVar, i3, andIncrement, obj2);
                                    if (A3 == y2.d.f10612m) {
                                        l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
                                        if (l0Var != null) {
                                            l0Var.a(jVar, i3);
                                        }
                                        bVar.C(andIncrement);
                                        jVar.h();
                                        gVar = hVar2;
                                    } else if (A3 == y2.d.f10614o) {
                                        if (andIncrement < bVar.p()) {
                                            jVar.a();
                                        }
                                        hVar = hVar2;
                                        z3 = true;
                                    } else {
                                        if (A3 == y2.d.f10613n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        gVar = A3;
                                    }
                                }
                            }
                        }
                    }
                    c0279i = null;
                    if (gVar instanceof y2.h) {
                        gVar = null;
                    }
                    c0279i2 = C0279i.f4852a;
                    if (gVar != null) {
                        b0 b0Var = (b0) gVar;
                        Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                        C1233l c1233l = b0Var.f825b;
                        c1233l.getClass();
                        c1233l.I(new C1235n(cancellationException, false));
                        c0279i = c0279i2;
                    }
                } while (c0279i != null);
                return c0279i2;
        }
    }
}
