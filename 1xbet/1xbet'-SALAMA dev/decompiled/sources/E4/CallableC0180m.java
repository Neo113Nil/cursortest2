package E4;

import G4.C0279l;
import G4.InterfaceC0268a;
import com.google.firebase.Timestamp;
import java.util.Date;
import java.util.concurrent.Callable;
import p098n4.C0934g;
import p155w1.P2;

/* JADX INFO: renamed from: E4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0180m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
                p072k1.g gVar = ((t) this.f2205b).f2235g.f2996f;
                InterfaceC0268a interfaceC0268a = (InterfaceC0268a) gVar.f14682c;
                H4.h hVar = (H4.h) this.f2206c;
                I4.d dVarE = interfaceC0268a.e(hVar);
                H4.k kVarY = (dVarE == null || (dVarE.f3665b instanceof I4.m)) ? ((G4.D) gVar.f14680a).y(hVar) : H4.k.g(hVar);
                if (dVarE != null) {
                    dVarE.f3665b.a(kVarY, I4.f.f3666b, new Timestamp(new Date()));
                }
                return kVarY;
            case 1:
                C0279l c0279l = ((t) this.f2205b).f2235g;
                C c3 = (C) this.f2206c;
                P2 p2B = c0279l.b(c3, true);
                N n2 = new N(c3, (p075k4.e) p2B.f17515c);
                return (O) n2.a(n2.c((p075k4.c) p2B.f17514b, null), null, false).f17514b;
            default:
                p098n4.D d7 = (p098n4.D) this.f2205b;
                d7.getClass();
                p134s4.h hVar2 = (p134s4.h) this.f2206c;
                C0934g c0934g = hVar2.f16178a;
                p120q4.c cVarZ = d7.f15365a;
                v4.r rVarC = null;
                C0934g c0934gE = c0934g;
                boolean z4 = false;
                while (true) {
                    if (cVarZ.isEmpty()) {
                        p098n4.s sVar = (p098n4.s) d7.f15365a.y(c0934g);
                        if (sVar == null) {
                            sVar = new p098n4.s(d7.f15371g);
                            d7.f15365a = d7.f15365a.D(c0934g, sVar);
                        } else if (rVarC == null) {
                            rVarC = sVar.c(C0934g.f15421d);
                        }
                        p134s4.a aVar = new p134s4.a(new v4.l(rVarC != null ? rVarC : v4.j.f17190e, hVar2.f16179b.f16176g), rVarC != null, false);
                        p098n4.M m7 = d7.f15366b;
                        m7.getClass();
                        return sVar.f(hVar2, new com.google.android.gms.common.internal.w(13, c0934g, m7), aVar).f16182c.C();
                    }
                    p098n4.s sVar2 = (p098n4.s) cVarZ.f15861a;
                    if (sVar2 != null) {
                        if (rVarC == null) {
                            rVarC = sVar2.c(c0934gE);
                        }
                        z4 = z4 || sVar2.g();
                    }
                    cVarZ = cVarZ.z(c0934gE.isEmpty() ? v4.c.b("") : c0934gE.B());
                    c0934gE = c0934gE.E();
                }
                break;
        }
    }
}
