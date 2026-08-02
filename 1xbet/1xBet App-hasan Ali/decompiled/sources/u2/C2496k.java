package u2;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import s4.C2364a;
import s4.InterfaceC2368e;
import s4.InterfaceC2369f;
import s4.M;

/* renamed from: u2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2496k implements InterfaceC2368e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20004k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f20005l;

    public /* synthetic */ C2496k(M m5, int i) {
        this.f20004k = i;
        this.f20005l = m5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r7v10, types: [c4.i, i4.e] */
    @Override // s4.InterfaceC2368e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        C2364a c2364a;
        int i;
        Throwable th;
        t4.t tVar;
        switch (this.f20004k) {
            case 0:
                ((M) this.f20005l).a(new C2495j(interfaceC2369f, 0), cVar);
                return EnumC0510a.f7289k;
            case 1:
                ((M) this.f20005l).a(new C2495j(interfaceC2369f, 1), cVar);
                return EnumC0510a.f7289k;
            default:
                if (cVar instanceof C2364a) {
                    c2364a = (C2364a) cVar;
                    int i5 = c2364a.f19254n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c2364a.f19254n = i5 - Integer.MIN_VALUE;
                        Object obj = c2364a.f19252l;
                        EnumC0510a enumC0510a = EnumC0510a.f7289k;
                        i = c2364a.f19254n;
                        W3.o oVar = W3.o.f6046a;
                        if (i != 0) {
                            G4.l.N(obj);
                            t4.t tVar2 = new t4.t(interfaceC2369f, c2364a.getContext());
                            try {
                                c2364a.f19251k = tVar2;
                                c2364a.f19254n = 1;
                                Object invoke = ((AbstractC0548i) this.f20005l).invoke(tVar2, c2364a);
                                if (invoke != enumC0510a) {
                                    invoke = oVar;
                                }
                                if (invoke == enumC0510a) {
                                    return enumC0510a;
                                }
                                tVar = tVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                tVar = tVar2;
                                tVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            tVar = c2364a.f19251k;
                            try {
                                G4.l.N(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                tVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        tVar.releaseIntercepted();
                        return oVar;
                    }
                }
                c2364a = new C2364a(this, cVar);
                Object obj2 = c2364a.f19252l;
                EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
                i = c2364a.f19254n;
                W3.o oVar2 = W3.o.f6046a;
                if (i != 0) {
                }
                tVar.releaseIntercepted();
                return oVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2496k(i4.e eVar) {
        this.f20004k = 2;
        this.f20005l = (AbstractC0548i) eVar;
    }
}
