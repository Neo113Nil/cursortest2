package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ct1 implements ht1, zs1 {

    /* JADX INFO: renamed from: j */
    public final HashMap f1452j = new HashMap();

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return new ts1(this.f1452j.keySet().iterator());
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: c */
    public final void mo751c(String str, ht1 ht1Var) {
        HashMap map = this.f1452j;
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
        if (obj instanceof ct1) {
            return this.f1452j.equals(((ct1) obj).f1452j);
        }
        return false;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        return "[object Object]";
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    public ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        return "toString".equals(str) ? new lt1(toString()) : zs1.m6030d(this, new lt1(str), f71Var, arrayList);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f1452j.hashCode();
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: j */
    public final ht1 mo756j(String str) {
        HashMap map = this.f1452j;
        return map.containsKey(str) ? (ht1) map.get(str) : ht1.f3330b;
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: l */
    public final boolean mo757l(String str) {
        return this.f1452j.containsKey(str);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        ct1 ct1Var = new ct1();
        for (Map.Entry entry : this.f1452j.entrySet()) {
            boolean z = entry.getValue() instanceof zs1;
            HashMap map = ct1Var.f1452j;
            if (z) {
                map.put((String) entry.getKey(), (ht1) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((ht1) entry.getValue()).mo758p());
            }
        }
        return ct1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f1452j;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
