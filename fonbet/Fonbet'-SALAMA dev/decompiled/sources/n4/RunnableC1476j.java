package n4;

import A1.C0011c;
import A1.x0;
import W5.AbstractC0486a1;
import android.content.Context;
import d6.C0977k;
import e3.C1023h;
import g4.C1142o;
import i4.C1267d;
import j4.C1315a;
import j4.C1319e;
import j4.C1321g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import n1.C1450e;
import p4.InterfaceC1538a;
import w1.C1719l1;
import w1.C1726n0;

/* renamed from: n4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1476j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1479m f15429b;

    public /* synthetic */ RunnableC1476j(C1479m c1479m, int i7) {
        this.f15428a = i7;
        this.f15429b = c1479m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1538a yVar;
        switch (this.f15428a) {
            case 0:
                C1479m c1479m = this.f15429b;
                C1480n c1480n = c1479m.f15447a;
                C0011c c0011c = new C0011c(c1480n.f15462a, c1480n.f15464c, c1480n.f15463b, 6);
                C1471e c1471e = c1479m.f15454h;
                C1726n0 d7 = c1471e.d();
                B.v vVar = c1471e.f15400a;
                B1.c cVar = new B1.c(23, c1471e.f15402c, c1471e.b());
                B1.c cVar2 = new B1.c(23, c1471e.f15403d, c1471e.b());
                L4.b b7 = c1471e.b();
                boolean z4 = c1471e.f15408i;
                String str = c1471e.f15406g;
                Y3.i iVar = c1471e.f15409k;
                iVar.b();
                A0.b bVar = new A0.b(vVar, cVar, cVar2, b7, z4, str, iVar.f7665c.f7673b, ((Context) c1471e.d().f17805b).getApplicationContext().getDir("sslcache", 0).getAbsolutePath());
                d7.getClass();
                l4.s sVar = new l4.s(bVar, c0011c, c1479m);
                ((Y3.i) d7.f17807d).a(new C1319e(sVar));
                c1479m.f15449c = sVar;
                C0977k c0977k = c1471e.f15402c;
                L4.b bVar2 = (L4.b) c1471e.f15404e.f8076b;
                C1719l1 c1719l1 = new C1719l1(c1479m);
                c0977k.getClass();
                ((C1142o) c0977k.f12441b).a(new C1315a(bVar2, c1719l1, 2));
                com.google.android.gms.common.internal.w wVar = c1471e.f15403d;
                L4.b bVar3 = (L4.b) c1471e.f15404e.f8076b;
                R4.c cVar3 = new R4.c(c1479m, 21);
                wVar.getClass();
                ((C1142o) wVar.f11335b).a(new C1315a(bVar3, cVar3, 0));
                c1479m.f15449c.q();
                String str2 = c1480n.f15462a;
                if (c1471e.f15408i) {
                    C1726n0 c1726n0 = c1471e.f15411m;
                    c1726n0.getClass();
                    String str3 = c1471e.f15405f;
                    String f7 = e1.k.f(str2, "_", str3);
                    HashSet hashSet = (HashSet) c1726n0.f17806c;
                    if (hashSet.contains(f7)) {
                        throw new C1267d(AbstractC0486a1.h("SessionPersistenceKey '", str3, "' has already been used."));
                    }
                    hashSet.add(f7);
                    C1321g c1321g = new C1321g((Context) c1726n0.f17805b, c1471e, f7);
                    long j = c1471e.j;
                    E4.y yVar2 = new E4.y();
                    yVar2.f2247a = j;
                    yVar = new G4.M(c1471e, c1321g, yVar2);
                } else {
                    yVar = new F1.y();
                }
                C1450e c1450e = new C1450e(18);
                c1450e.f15308b = v4.j.f17184e;
                c1479m.f15450d = c1450e;
                c1479m.f15451e = new r();
                Object obj = null;
                c1479m.f15452f = new C1726n0(obj, obj, new q4.i(), 22);
                c1479m.f15458m = new D(c1471e, new F1.y(), new x0(c1479m, 18));
                c1479m.f15459n = new D(c1471e, yVar, new C1023h(c1479m));
                List<H> o7 = yVar.o();
                HashMap p5 = Y4.D.p(c1479m.f15448b);
                long j3 = Long.MIN_VALUE;
                for (H h6 : o7) {
                    C0977k c0977k2 = new C0977k(10, (Object) c1479m, (Object) h6, false);
                    long j7 = h6.f15369a;
                    if (j3 >= j7) {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                    c1479m.f15457l = 1 + j7;
                    boolean c3 = h6.c();
                    android.support.v4.media.session.t tVar = c1479m.f15455i;
                    long j8 = h6.f15369a;
                    C1473g c1473g = h6.f15370b;
                    if (c3) {
                        if (tVar.r0()) {
                            tVar.W(null, AbstractC0486a1.g("Restoring overwrite with id ", j8), new Object[0]);
                        }
                        c1479m.f15449c.f("p", c1473g.l(), h6.b().u(true), null, c0977k2);
                        v4.r Q6 = Y4.D.Q(h6.b(), new K(c1479m.f15459n, c1473g), p5);
                        c1479m.f15459n.h(h6.f15370b, h6.b(), Q6, h6.f15369a, true, false);
                    } else {
                        if (tVar.r0()) {
                            tVar.W(null, AbstractC0486a1.g("Restoring merge with id ", j8), new Object[0]);
                        }
                        c1479m.f15449c.f("m", c1473g.l(), h6.a().D(), null, c0977k2);
                        C1468b P7 = Y4.D.P(h6.a(), c1479m.f15459n, c1473g, p5);
                        D d8 = c1479m.f15459n;
                        C1468b a2 = h6.a();
                        d8.getClass();
                    }
                    j3 = j7;
                }
                v4.c cVar4 = AbstractC1469c.f15395c;
                Boolean bool = Boolean.FALSE;
                c1479m.t(cVar4, bool);
                c1479m.t(AbstractC1469c.f15396d, bool);
                return;
            case 1:
                this.f15429b.f15449c.d("repo_interrupt");
                return;
            default:
                this.f15429b.f15449c.i("repo_interrupt");
                return;
        }
    }
}
