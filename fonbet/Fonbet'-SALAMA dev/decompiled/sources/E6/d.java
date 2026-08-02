package E6;

import D6.I;
import D6.I0;
import D6.y0;
import F6.h;
import F6.j;
import F6.n;
import b0.K;
import f6.C1116i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import k1.g;
import kotlin.jvm.functions.Function1;
import t6.i;

/* loaded from: classes2.dex */
public final class d extends i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        super(1);
        this.f2418a = i7;
        this.f2419b = obj;
        this.f2420c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object gVar;
        j jVar;
        C1116i c1116i;
        C1116i c1116i2;
        switch (this.f2418a) {
            case 0:
                ((e) this.f2419b).f2421c.removeCallbacks((y0) this.f2420c);
                return C1116i.f13008a;
            case 1:
                Throwable th = (Throwable) obj;
                ((n) this.f2419b).invoke(th);
                g gVar2 = (g) this.f2420c;
                ((F6.b) gVar2.f14676c).g(false, th);
                do {
                    F6.b bVar = (F6.b) gVar2.f14676c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = F6.b.f2791d;
                    long j = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = F6.b.f2790c;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.q(j3, true)) {
                        gVar = new F6.g(bVar.l());
                    } else {
                        long j7 = j3 & 1152921504606846975L;
                        Object obj2 = F6.i.f2822a;
                        if (j < j7) {
                            Object obj3 = F6.d.f2809k;
                            j jVar2 = (j) F6.b.f2795y.get(bVar);
                            for (boolean z4 = true; !bVar.q(atomicLongFieldUpdater2.get(bVar), z4); z4 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j8 = F6.d.f2801b;
                                Object obj4 = obj2;
                                long j9 = andIncrement / j8;
                                int i7 = (int) (andIncrement % j8);
                                if (jVar2.f3759c != j9) {
                                    j k7 = bVar.k(j9, jVar2);
                                    if (k7 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        jVar = k7;
                                    }
                                } else {
                                    jVar = jVar2;
                                }
                                Object z7 = bVar.z(jVar, i7, andIncrement, obj3);
                                if (z7 == F6.d.f2811m) {
                                    I0 i02 = obj3 instanceof I0 ? (I0) obj3 : null;
                                    if (i02 != null) {
                                        i02.a(jVar, i7);
                                    }
                                    bVar.B(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (z7 == F6.d.f2813o) {
                                    if (andIncrement < bVar.o()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (z7 == F6.d.f2812n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = z7;
                                }
                            }
                            gVar = new F6.g(bVar.l());
                        }
                        gVar = obj2;
                    }
                    c1116i = null;
                    if (gVar instanceof h) {
                        gVar = null;
                    }
                    c1116i2 = C1116i.f13008a;
                    if (gVar != null) {
                        K.f9949a.invoke(gVar, th);
                        c1116i = c1116i2;
                    }
                } while (c1116i != null);
                return c1116i2;
            default:
                Throwable th2 = (Throwable) obj;
                s.h hVar = (s.h) this.f2419b;
                if (th2 == null) {
                    Object s7 = ((I) this.f2420c).s();
                    hVar.f16087d = true;
                    s.j jVar3 = hVar.f16085b;
                    if (jVar3 != null && jVar3.f16090b.p(s7)) {
                        hVar.f16084a = null;
                        hVar.f16085b = null;
                        hVar.f16086c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    hVar.f16087d = true;
                    s.j jVar4 = hVar.f16085b;
                    if (jVar4 != null && jVar4.f16090b.cancel(true)) {
                        hVar.f16084a = null;
                        hVar.f16085b = null;
                        hVar.f16086c = null;
                    }
                } else {
                    hVar.f16087d = true;
                    s.j jVar5 = hVar.f16085b;
                    if (jVar5 != null && jVar5.f16090b.t(th2)) {
                        hVar.f16084a = null;
                        hVar.f16085b = null;
                        hVar.f16086c = null;
                    }
                }
                return C1116i.f13008a;
        }
    }
}
