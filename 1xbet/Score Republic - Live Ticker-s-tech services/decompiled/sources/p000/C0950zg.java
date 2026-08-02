package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: zg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0950zg extends AbstractRunnableC0498n8 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9753l = 1;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f9754m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950zg(qd0 qd0Var) {
        super(1, ((C0062bh) qd0Var.f6473m).f864i);
        this.f9754m = qd0Var;
    }

    @Override // p000.AbstractRunnableC0498n8
    /* JADX INFO: renamed from: b */
    public final void mo3491b() {
        List list;
        switch (this.f9753l) {
            case 0:
                qd0 qd0Var = (qd0) this.f9754m;
                nv0.m3597c();
                try {
                    nv0.m3595a();
                    nv0.f5555a.getClass();
                    if (((ja1) qd0Var.f6472l) == null) {
                        try {
                            ((d71) qd0Var.f6471k).mo1125n();
                        } catch (Throwable th) {
                            ja1 ja1VarM2840h = ja1.f3876f.m2839g(th).m2840h("Failed to call onReady.");
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
            case 1:
                ((fl0) this.f9754m).m1879t();
                return;
            default:
                C0850wr c0850wr = (C0850wr) this.f9754m;
                c0850wr.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (c0850wr) {
                        try {
                            if (c0850wr.f8647g.isEmpty()) {
                                c0850wr.f8647g = null;
                                c0850wr.f8646f = true;
                                return;
                            } else {
                                list = c0850wr.f8647g;
                                c0850wr.f8647g = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950zg(fl0 fl0Var, C0850wr c0850wr) {
        super(1, fl0Var.f2434g);
        this.f9754m = c0850wr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950zg(fl0 fl0Var, C0697sm c0697sm) {
        super(1, c0697sm);
        this.f9754m = fl0Var;
    }
}
