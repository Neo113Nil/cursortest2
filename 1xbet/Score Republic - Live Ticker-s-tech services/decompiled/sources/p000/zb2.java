package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 extends rm1 {

    /* JADX INFO: renamed from: b */
    public final Map f9730b;

    public zb2(d71 d71Var, d71 d71Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m5872d(linkedHashMap, d71Var);
        m5872d(linkedHashMap, d71Var2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((db2) entry.getKey()).f1615c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f9730b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    public static void m5872d(LinkedHashMap linkedHashMap, d71 d71Var) {
        for (int i = 0; i < d71Var.mo1126s(); i++) {
            db2 db2VarMo1127u = d71Var.mo1127u(i);
            Object obj = linkedHashMap.get(db2VarMo1127u);
            boolean z = db2VarMo1127u.f1615c;
            Class cls = db2VarMo1127u.f1614b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(db2VarMo1127u, arrayList);
                }
                arrayList.add(cls.cast(d71Var.mo1128v(i)));
            } else {
                linkedHashMap.put(db2VarMo1127u, cls.cast(d71Var.mo1128v(i)));
            }
        }
    }

    @Override // p000.rm1
    /* JADX INFO: renamed from: a */
    public final void mo4381a(vb2 vb2Var, qb2 qb2Var) {
        for (Map.Entry entry : this.f9730b.entrySet()) {
            db2 db2Var = (db2) entry.getKey();
            Object value = entry.getValue();
            if (db2Var.f1615c) {
                vb2Var.m5146b(db2Var, ((List) value).iterator(), qb2Var);
            } else {
                vb2Var.m5145a(db2Var, value, qb2Var);
            }
        }
    }

    @Override // p000.rm1
    /* JADX INFO: renamed from: b */
    public final int mo4382b() {
        return this.f9730b.size();
    }

    @Override // p000.rm1
    /* JADX INFO: renamed from: c */
    public final Set mo4383c() {
        return this.f9730b.keySet();
    }
}
