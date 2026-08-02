package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gx0 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f2957a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f2958b;

    static {
        HashMap map = new HashMap();
        f2958b = map;
        map.put(dx0.f1868j, 0);
        map.put(dx0.f1869k, 1);
        map.put(dx0.f1870l, 2);
        for (dx0 dx0Var : map.keySet()) {
            f2957a.append(((Integer) f2958b.get(dx0Var)).intValue(), dx0Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m2162a(dx0 dx0Var) {
        Integer num = (Integer) f2958b.get(dx0Var);
        if (num != null) {
            return num.intValue();
        }
        C0042ay.m531h(dx0Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static dx0 m2163b(int i) {
        dx0 dx0Var = (dx0) f2957a.get(i);
        if (dx0Var != null) {
            return dx0Var;
        }
        C0270h1.m2190f(j11.m2773h("Unknown Priority for value ", i));
        return null;
    }
}
