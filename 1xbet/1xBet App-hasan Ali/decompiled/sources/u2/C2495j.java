package u2;

import a.AbstractC0444a;
import b4.EnumC0510a;
import h0.C1991e;
import k4.AbstractC2036a;
import s4.InterfaceC2369f;

/* renamed from: u2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2495j implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20002k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2369f f20003l;

    public /* synthetic */ C2495j(InterfaceC2369f interfaceC2369f, int i) {
        this.f20002k = i;
        this.f20003l = interfaceC2369f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // s4.InterfaceC2369f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, a4.c cVar) {
        C2494i c2494i;
        int i;
        q qVar;
        int i5;
        W3.o oVar = W3.o.f6046a;
        InterfaceC2369f interfaceC2369f = this.f20003l;
        AbstractC0444a abstractC0444a = F2.b.f;
        F2.h hVar = null;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        switch (this.f20002k) {
            case 0:
                if (cVar instanceof C2494i) {
                    c2494i = (C2494i) cVar;
                    int i6 = c2494i.f20000l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c2494i.f20000l = i6 - Integer.MIN_VALUE;
                        Object obj2 = c2494i.f19999k;
                        i = c2494i.f20000l;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            G4.l.N(obj2);
                            return oVar;
                        }
                        G4.l.N(obj2);
                        long j5 = ((C1991e) obj).f17204a;
                        if (j5 == 9205357640488583168L) {
                            hVar = F2.h.f1535c;
                        } else {
                            F2.e eVar = AbstractC2485C.f19986b;
                            if (C1991e.d(j5) >= 0.5d && C1991e.b(j5) >= 0.5d) {
                                float d5 = C1991e.d(j5);
                                AbstractC0444a aVar = (Float.isInfinite(d5) || Float.isNaN(d5)) ? abstractC0444a : new F2.a(AbstractC2036a.U(C1991e.d(j5)));
                                float b3 = C1991e.b(j5);
                                if (!Float.isInfinite(b3) && !Float.isNaN(b3)) {
                                    abstractC0444a = new F2.a(AbstractC2036a.U(C1991e.b(j5)));
                                }
                                hVar = new F2.h(aVar, abstractC0444a);
                            }
                        }
                        if (hVar == null) {
                            return oVar;
                        }
                        c2494i.f20000l = 1;
                        return interfaceC2369f.d(hVar, c2494i) == enumC0510a ? enumC0510a : oVar;
                    }
                }
                c2494i = new C2494i(this, cVar);
                Object obj22 = c2494i.f19999k;
                i = c2494i.f20000l;
                if (i == 0) {
                }
                break;
            default:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i7 = qVar.f20029l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qVar.f20029l = i7 - Integer.MIN_VALUE;
                        Object obj3 = qVar.f20028k;
                        i5 = qVar.f20029l;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            G4.l.N(obj3);
                            return oVar;
                        }
                        G4.l.N(obj3);
                        long j6 = ((W0.a) obj).f6000a;
                        F2.e eVar2 = AbstractC2485C.f19986b;
                        if (!W0.a.k(j6)) {
                            AbstractC0444a aVar2 = W0.a.d(j6) ? new F2.a(W0.a.h(j6)) : abstractC0444a;
                            if (W0.a.c(j6)) {
                                abstractC0444a = new F2.a(W0.a.g(j6));
                            }
                            hVar = new F2.h(aVar2, abstractC0444a);
                        }
                        if (hVar == null) {
                            return oVar;
                        }
                        qVar.f20029l = 1;
                        return interfaceC2369f.d(hVar, qVar) == enumC0510a ? enumC0510a : oVar;
                    }
                }
                qVar = new q(this, cVar);
                Object obj32 = qVar.f20028k;
                i5 = qVar.f20029l;
                if (i5 == 0) {
                }
        }
    }
}
