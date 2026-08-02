package E4;

import G4.C0279l;
import G4.InterfaceC0268a;
import com.google.firebase.Timestamp;
import java.util.Date;
import java.util.concurrent.Callable;
import k4.AbstractC1341c;
import k4.C1343e;
import n4.C1473g;
import s4.C1593a;
import w1.P2;

/* renamed from: E4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC0180m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2206c;

    public /* synthetic */ CallableC0180m(int i7, Object obj, Object obj2) {
        this.f2204a = i7;
        this.f2205b = obj;
        this.f2206c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2204a) {
            case 0:
                k1.g gVar = ((t) this.f2205b).f2235g.f2996f;
                InterfaceC0268a interfaceC0268a = (InterfaceC0268a) gVar.f14676c;
                H4.h hVar = (H4.h) this.f2206c;
                I4.d e7 = interfaceC0268a.e(hVar);
                H4.k y4 = (e7 == null || (e7.f3665b instanceof I4.m)) ? ((G4.D) gVar.f14674a).y(hVar) : H4.k.g(hVar);
                if (e7 != null) {
                    e7.f3665b.a(y4, I4.f.f3666b, new Timestamp(new Date()));
                }
                return y4;
            case 1:
                C0279l c0279l = ((t) this.f2205b).f2235g;
                C c3 = (C) this.f2206c;
                P2 b7 = c0279l.b(c3, true);
                N n2 = new N(c3, (C1343e) b7.f17509c);
                return (O) n2.a(n2.c((AbstractC1341c) b7.f17508b, null), null, false).f17508b;
            default:
                n4.D d7 = (n4.D) this.f2205b;
                d7.getClass();
                s4.h hVar2 = (s4.h) this.f2206c;
                C1473g c1473g = hVar2.f16172a;
                q4.c cVar = d7.f15359a;
                v4.r rVar = null;
                C1473g c1473g2 = c1473g;
                boolean z4 = false;
                while (true) {
                    if (cVar.isEmpty()) {
                        n4.s sVar = (n4.s) d7.f15359a.y(c1473g);
                        if (sVar == null) {
                            sVar = new n4.s(d7.f15365g);
                            d7.f15359a = d7.f15359a.D(c1473g, sVar);
                        } else if (rVar == null) {
                            rVar = sVar.c(C1473g.f15415d);
                        }
                        C1593a c1593a = new C1593a(new v4.l(rVar != null ? rVar : v4.j.f17184e, hVar2.f16173b.f16170g), rVar != null, false);
                        n4.M m7 = d7.f15360b;
                        m7.getClass();
                        return sVar.f(hVar2, new com.google.android.gms.common.internal.w(13, c1473g, m7), c1593a).f16176c.C();
                    }
                    n4.s sVar2 = (n4.s) cVar.f15855a;
                    if (sVar2 != null) {
                        if (rVar == null) {
                            rVar = sVar2.c(c1473g2);
                        }
                        z4 = z4 || sVar2.g();
                    }
                    cVar = cVar.z(c1473g2.isEmpty() ? v4.c.b("") : c1473g2.B());
                    c1473g2 = c1473g2.E();
                }
                break;
        }
    }
}
