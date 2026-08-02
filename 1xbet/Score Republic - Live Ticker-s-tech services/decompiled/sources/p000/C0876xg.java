package p000;

import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: xg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0876xg extends AbstractRunnableC0498n8 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f8958l = 1;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ qd0 f8959m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f8960n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0876xg(qd0 qd0Var, np0 np0Var) {
        super(1, ((C0062bh) qd0Var.f6473m).f864i);
        this.f8959m = qd0Var;
        this.f8960n = np0Var;
    }

    @Override // p000.AbstractRunnableC0498n8
    /* JADX INFO: renamed from: b */
    public final void mo3491b() {
        switch (this.f8958l) {
            case 0:
                qd0 qd0Var = this.f8959m;
                nv0.m3597c();
                try {
                    nv0.m3595a();
                    nv0.f5555a.getClass();
                    if (((ja1) qd0Var.f6472l) == null) {
                        try {
                            ((d71) qd0Var.f6471k).mo1122k((np0) this.f8960n);
                        } catch (Throwable th) {
                            ja1 ja1VarM2840h = ja1.f3876f.m2839g(th).m2840h("Failed to read headers");
                            qd0Var.f6472l = ja1VarM2840h;
                            ((C0062bh) qd0Var.f6473m).f868m.mo1604G(ja1VarM2840h);
                        }
                        break;
                    }
                    nv0.f5555a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        nv0.f5555a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                nv0.m3597c();
                try {
                    nv0.m3595a();
                    vc0 vc0Var = nv0.f5555a;
                    vc0Var.getClass();
                    m5660c();
                    vc0Var.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        nv0.f5555a.getClass();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5660c() {
        an0 an0Var = (an0) this.f8960n;
        qd0 qd0Var = this.f8959m;
        C0062bh c0062bh = (C0062bh) qd0Var.f6473m;
        if (((ja1) qd0Var.f6472l) != null) {
            Logger logger = ca0.f1181a;
            while (true) {
                InputStream inputStreamM323v = an0Var.m323v();
                if (inputStreamM323v == null) {
                    return;
                } else {
                    ca0.m907b(inputStreamM323v);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream inputStreamM323v2 = an0Var.m323v();
                    if (inputStreamM323v2 == null) {
                        return;
                    }
                    try {
                        ((d71) qd0Var.f6471k).mo1124m(c0062bh.f860e.m5410b(inputStreamM323v2));
                        inputStreamM323v2.close();
                    } catch (Throwable th) {
                        ca0.m907b(inputStreamM323v2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = ca0.f1181a;
                    while (true) {
                        InputStream inputStreamM323v3 = an0Var.m323v();
                        if (inputStreamM323v3 == null) {
                            ja1 ja1VarM2840h = ja1.f3876f.m2839g(th2).m2840h("Failed to read message.");
                            qd0Var.f6472l = ja1VarM2840h;
                            c0062bh.f868m.mo1604G(ja1VarM2840h);
                            return;
                        }
                        ca0.m907b(inputStreamM323v3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0876xg(qd0 qd0Var, an0 an0Var) {
        super(1, ((C0062bh) qd0Var.f6473m).f864i);
        this.f8959m = qd0Var;
        this.f8960n = an0Var;
    }
}
