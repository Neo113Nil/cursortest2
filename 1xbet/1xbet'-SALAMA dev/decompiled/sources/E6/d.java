package E6;

import D6.I;
import D6.I0;
import D6.y0;
import F6.h;
import F6.j;
import F6.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function1;
import p010b0.K;
import p072k1.g;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        super(1);
        this.f2418a = i7;
        this.f2419b = obj;
        this.f2420c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object gVar;
        j jVar;
        p044f6.i iVar;
        p044f6.i iVar2;
        switch (this.f2418a) {
            case 0:
                ((e) this.f2419b).f2421c.removeCallbacks((y0) this.f2420c);
                return p044f6.i.f13014a;
            case 1:
                Throwable th = (Throwable) obj;
                ((n) this.f2419b).invoke(th);
                g gVar2 = (g) this.f2420c;
                ((F6.b) gVar2.f14682c).g(false, th);
                do {
                    F6.b bVar = (F6.b) gVar2.f14682c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = F6.b.f2791d;
                    long j = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = F6.b.f2790c;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    boolean z4 = true;
                    if (bVar.q(j3, true)) {
                        gVar = new F6.g(bVar.l());
                    } else {
                        long j7 = j3 & 1152921504606846975L;
                        Object obj2 = F6.i.f2822a;
                        if (j >= j7) {
                            gVar = obj2;
                        } else {
                            Object obj3 = F6.d.f2809k;
                            j jVar2 = (j) F6.b.f2795y.get(bVar);
                            while (true) {
                                if (bVar.q(atomicLongFieldUpdater2.get(bVar), z4)) {
                                    gVar = new F6.g(bVar.l());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                    long j8 = F6.d.f2801b;
                                    Object obj4 = obj2;
                                    long j9 = andIncrement / j8;
                                    int i7 = (int) (andIncrement % j8);
                                    if (jVar2.f3759c != j9) {
                                        j jVarK = bVar.k(j9, jVar2);
                                        if (jVarK == null) {
                                            continue;
                                        } else {
                                            jVar = jVarK;
                                        }
                                        obj2 = obj4;
                                        z4 = true;
                                    } else {
                                        jVar = jVar2;
                                    }
                                    Object objZ = bVar.z(jVar, i7, andIncrement, obj3);
                                    if (objZ == F6.d.f2811m) {
                                        I0 i8 = obj3 instanceof I0 ? (I0) obj3 : null;
                                        if (i8 != null) {
                                            i8.a(jVar, i7);
                                        }
                                        bVar.B(andIncrement);
                                        jVar.h();
                                        obj2 = obj4;
                                    } else if (objZ == F6.d.f2813o) {
                                        if (andIncrement < bVar.o()) {
                                            jVar.a();
                                        }
                                        jVar2 = jVar;
                                        obj2 = obj4;
                                        z4 = true;
                                    } else {
                                        if (objZ == F6.d.f2812n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        obj2 = objZ;
                                    }
                                    gVar = obj2;
                                }
                            }
                        }
                    }
                    iVar = null;
                    if (gVar instanceof h) {
                        gVar = null;
                    }
                    iVar2 = p044f6.i.f13014a;
                    if (gVar != null) {
                        K.f9949a.invoke(gVar, th);
                        iVar = iVar2;
                    }
                } while (iVar != null);
                return iVar2;
            default:
                Throwable th2 = (Throwable) obj;
                p129s.h hVar = (p129s.h) this.f2419b;
                if (th2 == null) {
                    Object objS = ((I) this.f2420c).s();
                    hVar.f16093d = true;
                    p129s.j jVar3 = hVar.f16091b;
                    if (jVar3 != null && jVar3.f16096b.p(objS)) {
                        hVar.f16090a = null;
                        hVar.f16091b = null;
                        hVar.f16092c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    hVar.f16093d = true;
                    p129s.j jVar4 = hVar.f16091b;
                    if (jVar4 != null && jVar4.f16096b.cancel(true)) {
                        hVar.f16090a = null;
                        hVar.f16091b = null;
                        hVar.f16092c = null;
                    }
                } else {
                    hVar.f16093d = true;
                    p129s.j jVar5 = hVar.f16091b;
                    if (jVar5 != null && jVar5.f16096b.t(th2)) {
                        hVar.f16090a = null;
                        hVar.f16091b = null;
                        hVar.f16092c = null;
                    }
                }
                return p044f6.i.f13014a;
        }
    }
}
