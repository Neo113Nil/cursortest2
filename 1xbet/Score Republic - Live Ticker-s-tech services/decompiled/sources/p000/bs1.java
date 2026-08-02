package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bs1 implements ht1, zs1 {

    /* JADX INFO: renamed from: j */
    public final String f974j;

    /* JADX INFO: renamed from: k */
    public final HashMap f975k = new HashMap();

    public bs1(String str) {
        this.f974j = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract ht1 mo749a(f71 f71Var, List list);

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return new ts1(this.f975k.keySet().iterator());
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: c */
    public final void mo751c(String str, ht1 ht1Var) {
        HashMap map = this.f975k;
        if (ht1Var == null) {
            map.remove(str);
        } else {
            map.put(str, ht1Var);
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public final Boolean mo752e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs1)) {
            return false;
        }
        bs1 bs1Var = (bs1) obj;
        String str = this.f974j;
        if (str != null) {
            return str.equals(bs1Var.f974j);
        }
        return false;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        return this.f974j;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        return "toString".equals(str) ? new lt1(this.f974j) : zs1.m6030d(this, new lt1(str), f71Var, arrayList);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.f974j;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: j */
    public final ht1 mo756j(String str) {
        HashMap map = this.f975k;
        return map.containsKey(str) ? (ht1) map.get(str) : ht1.f3330b;
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: l */
    public final boolean mo757l(String str) {
        return this.f975k.containsKey(str);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public ht1 mo758p() {
        return this;
    }
}
