package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab0 implements h60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f126j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f127k;

    public /* synthetic */ ab0(br0 br0Var, ar0 ar0Var) {
        this.f126j = 1;
        this.f127k = br0Var;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        int i = this.f126j;
        Object obj2 = this.f127k;
        switch (i) {
            case 0:
                db0 db0Var = (db0) obj2;
                zq0 zq0Var = (zq0) obj;
                rw0 rw0Var = db0.f1610c;
                Map mapM6022a = zq0Var.m6022a();
                LinkedHashMap linkedHashMap = zq0Var.f9907a;
                long j = 0;
                for (Map.Entry entry : mapM6022a.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        rw0 rw0Var2 = (rw0) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strM1149b = db0Var.m1149b(System.currentTimeMillis());
                        if (set.contains(strM1149b)) {
                            Object[] objArr = {strM1149b};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                dd0.m1167m(obj3, "duplicate element: ");
                                return null;
                            }
                            zq0Var.m6024c(rw0Var2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            rw0Var2.getClass();
                            zq0Var.m6023b();
                            linkedHashMap.remove(rw0Var2);
                        }
                    }
                }
                if (j == 0) {
                    rw0Var.getClass();
                    zq0Var.m6023b();
                    linkedHashMap.remove(rw0Var);
                } else {
                    zq0Var.m6024c(rw0Var, Long.valueOf(j));
                }
                return null;
            case 1:
                ((br0) obj2).m748g(null);
                return kf1.f4365a;
            default:
                obj.getClass();
                return ((C0124d3) obj2).mo1083a();
        }
    }

    public /* synthetic */ ab0(int i, Object obj) {
        this.f126j = i;
        this.f127k = obj;
    }
}
