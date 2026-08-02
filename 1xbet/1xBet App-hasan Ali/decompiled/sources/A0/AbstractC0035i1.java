package A0;

import G.C0128e;
import P.AbstractC0329z;
import c4.AbstractC0542c;
import z0.AbstractC2749f;

/* renamed from: A0.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0035i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final P.e1 f513a = new P.e1(C0026f1.f500m);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(G.x xVar, C0128e c0128e, AbstractC0542c abstractC0542c) {
        C0029g1 c0029g1;
        int i;
        if (abstractC0542c instanceof C0029g1) {
            c0029g1 = (C0029g1) abstractC0542c;
            int i5 = c0029g1.f507l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0029g1.f507l = i5 - Integer.MIN_VALUE;
                Object obj = c0029g1.f506k;
                i = c0029g1.f507l;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                    throw new D2.e();
                }
                G4.l.N(obj);
                if (!xVar.f7162k.f7175x) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                z0.n0 w5 = AbstractC2749f.w(xVar);
                X.i iVar = (X.i) AbstractC2749f.v(xVar).K;
                iVar.getClass();
                if (AbstractC0329z.u(iVar, f513a) != null) {
                    throw new ClassCastException();
                }
                c0029g1.f507l = 1;
                b(w5, c0128e, c0029g1);
                return;
            }
        }
        c0029g1 = new C0029g1(abstractC0542c);
        Object obj2 = c0029g1.f506k;
        i = c0029g1.f507l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(z0.n0 n0Var, C0128e c0128e, AbstractC0542c abstractC0542c) {
        C0032h1 c0032h1;
        int i;
        if (abstractC0542c instanceof C0032h1) {
            c0032h1 = (C0032h1) abstractC0542c;
            int i5 = c0032h1.f511l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0032h1.f511l = i5 - Integer.MIN_VALUE;
                Object obj = c0032h1.f510k;
                i = c0032h1.f511l;
                if (i != 0) {
                    G4.l.N(obj);
                    c0032h1.f511l = 1;
                    ((F) n0Var).M(c0128e, c0032h1);
                    return;
                } else {
                    if (i == 1) {
                        G4.l.N(obj);
                        throw new D2.e();
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                    throw new D2.e();
                }
            }
        }
        c0032h1 = new C0032h1(abstractC0542c);
        Object obj2 = c0032h1.f510k;
        i = c0032h1.f511l;
        if (i != 0) {
        }
    }
}
