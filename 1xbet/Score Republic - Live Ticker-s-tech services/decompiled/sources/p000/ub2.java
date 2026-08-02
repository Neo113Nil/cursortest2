package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ub2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7787a;

    public /* synthetic */ ub2(int i) {
        this.f7787a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m4905a(db2 db2Var, Iterator it, qb2 qb2Var) {
        switch (this.f7787a) {
            case 0:
                break;
            default:
                if (!db2Var.f1615c) {
                    C0270h1.m2191g("non repeating key");
                } else if (db2Var.f1616d && ((un1) un1.f7864k.get()).f7865j > 20) {
                    while (it.hasNext()) {
                        qb2Var.m4053a(it.next(), db2Var.f1613a);
                    }
                } else {
                    db2Var.mo1153a(it, qb2Var);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m4904b(db2 db2Var, Iterator it, qb2 qb2Var) {
    }
}
