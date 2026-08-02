package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vb2 {

    /* JADX INFO: renamed from: e */
    public static final tb2 f8167e;

    /* JADX INFO: renamed from: f */
    public static final ub2 f8168f;

    /* JADX INFO: renamed from: a */
    public final HashMap f8169a;

    /* JADX INFO: renamed from: b */
    public final HashMap f8170b;

    /* JADX INFO: renamed from: c */
    public final tb2 f8171c;

    /* JADX INFO: renamed from: d */
    public ub2 f8172d;

    static {
        int i = 0;
        f8167e = new tb2(i);
        f8168f = new ub2(i);
    }

    public vb2(vb2 vb2Var) {
        HashMap map = new HashMap();
        this.f8169a = map;
        HashMap map2 = new HashMap();
        this.f8170b = map2;
        map.putAll(vb2Var.f8169a);
        map2.putAll(vb2Var.f8170b);
        this.f8171c = vb2Var.f8171c;
        this.f8172d = vb2Var.f8172d;
    }

    /* JADX INFO: renamed from: a */
    public void m5145a(db2 db2Var, Object obj, qb2 qb2Var) {
        tb2 tb2Var = (tb2) this.f8169a.get(db2Var);
        if (tb2Var != null) {
            tb2Var.m4783a(db2Var, obj, qb2Var);
        } else {
            this.f8171c.m4783a(db2Var, obj, qb2Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5146b(db2 db2Var, Iterator it, qb2 qb2Var) {
        ub2 ub2Var = (ub2) this.f8170b.get(db2Var);
        if (ub2Var != null) {
            ub2Var.m4905a(db2Var, it, qb2Var);
            return;
        }
        ub2 ub2Var2 = this.f8172d;
        if (ub2Var2 != null && !this.f8169a.containsKey(db2Var)) {
            ub2Var2.m4905a(db2Var, it, qb2Var);
        } else {
            while (it.hasNext()) {
                m5145a(db2Var, it.next(), qb2Var);
            }
        }
    }

    public /* synthetic */ vb2() {
        tb2 tb2Var = o80.f5664l;
        this.f8169a = new HashMap();
        this.f8170b = new HashMap();
        this.f8172d = null;
        this.f8171c = tb2Var;
    }
}
