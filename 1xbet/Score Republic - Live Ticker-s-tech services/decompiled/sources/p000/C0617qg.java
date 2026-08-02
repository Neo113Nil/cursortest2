package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: qg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617qg {

    /* JADX INFO: renamed from: a */
    public final HashMap f6487a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f6488b;

    public C0617qg(HashMap map) {
        this.f6488b = map;
        for (Map.Entry entry : map.entrySet()) {
            ph0 ph0Var = (ph0) entry.getValue();
            List arrayList = (List) this.f6487a.get(ph0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f6487a.put(ph0Var, arrayList);
            }
            arrayList.add((C0654rg) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4096a(List list, yh0 yh0Var, ph0 ph0Var, xh0 xh0Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0654rg c0654rg = (C0654rg) list.get(size);
                Method method = c0654rg.f6838b;
                try {
                    int i = c0654rg.f6837a;
                    if (i == 0) {
                        method.invoke(xh0Var, null);
                    } else if (i == 1) {
                        method.invoke(xh0Var, yh0Var);
                    } else if (i == 2) {
                        method.invoke(xh0Var, yh0Var, ph0Var);
                    }
                } catch (IllegalAccessException e) {
                    dd0.m1163h(e);
                    return;
                } catch (InvocationTargetException e2) {
                    C0270h1.m2189e("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
