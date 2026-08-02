package s4;

import b4.EnumC0510a;

/* renamed from: s4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2373j implements InterfaceC2368e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2365b f19276k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.g f19277l;

    public C2373j(C2365b c2365b, d.g gVar) {
        this.f19276k = c2365b;
        this.f19277l = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // s4.InterfaceC2368e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        C2372i c2372i;
        EnumC0510a enumC0510a;
        int i;
        W3.o oVar;
        C2373j c2373j;
        O o5;
        d.g gVar;
        t4.t tVar;
        Throwable th;
        t4.t tVar2;
        try {
            if (cVar instanceof C2372i) {
                c2372i = (C2372i) cVar;
                int i5 = c2372i.f19272l;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c2372i.f19272l = i5 - Integer.MIN_VALUE;
                    Object obj = c2372i.f19271k;
                    enumC0510a = EnumC0510a.f7289k;
                    i = c2372i.f19272l;
                    oVar = W3.o.f6046a;
                    if (i != 0) {
                        G4.l.N(obj);
                        try {
                            C2365b c2365b = this.f19276k;
                            c2372i.f19274n = this;
                            c2372i.f19275o = interfaceC2369f;
                            c2372i.f19272l = 1;
                            if (c2365b.a(interfaceC2369f, c2372i) != enumC0510a) {
                                c2373j = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c2373j = this;
                            o5 = new O(th);
                            gVar = c2373j.f19277l;
                            c2372i.f19274n = th;
                            c2372i.f19275o = null;
                            c2372i.f19272l = 2;
                            if (C.c(o5, gVar, th, c2372i) != enumC0510a) {
                            }
                        }
                        return enumC0510a;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) c2372i.f19274n;
                            G4.l.N(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tVar2 = (t4.t) c2372i.f19274n;
                        try {
                            G4.l.N(obj);
                            tVar2.releaseIntercepted();
                            return oVar;
                        } catch (Throwable th4) {
                            th = th4;
                            tVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    interfaceC2369f = c2372i.f19275o;
                    c2373j = (C2373j) c2372i.f19274n;
                    try {
                        G4.l.N(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        o5 = new O(th);
                        gVar = c2373j.f19277l;
                        c2372i.f19274n = th;
                        c2372i.f19275o = null;
                        c2372i.f19272l = 2;
                        if (C.c(o5, gVar, th, c2372i) != enumC0510a) {
                            return enumC0510a;
                        }
                        throw th;
                    }
                    tVar = new t4.t(interfaceC2369f, c2372i.getContext());
                    d.g gVar2 = c2373j.f19277l;
                    c2372i.f19274n = tVar;
                    c2372i.f19275o = null;
                    c2372i.f19272l = 3;
                    gVar2.b(tVar, null, c2372i);
                    if (oVar != enumC0510a) {
                        tVar2 = tVar;
                        tVar2.releaseIntercepted();
                        return oVar;
                    }
                    return enumC0510a;
                }
            }
            d.g gVar22 = c2373j.f19277l;
            c2372i.f19274n = tVar;
            c2372i.f19275o = null;
            c2372i.f19272l = 3;
            gVar22.b(tVar, null, c2372i);
            if (oVar != enumC0510a) {
            }
            return enumC0510a;
        } catch (Throwable th6) {
            th = th6;
            tVar2 = tVar;
            tVar2.releaseIntercepted();
            throw th;
        }
        c2372i = new C2372i(this, cVar);
        Object obj2 = c2372i.f19271k;
        enumC0510a = EnumC0510a.f7289k;
        i = c2372i.f19272l;
        oVar = W3.o.f6046a;
        if (i != 0) {
        }
        tVar = new t4.t(interfaceC2369f, c2372i.getContext());
    }
}
