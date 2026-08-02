package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pj0 {

    /* JADX INFO: renamed from: a */
    public final kw0 f6163a;

    /* JADX INFO: renamed from: b */
    public final List f6164b;

    /* JADX INFO: renamed from: c */
    public final String f6165c;

    public pj0(Class cls, Class cls2, Class cls3, List list, kw0 kw0Var) {
        this.f6163a = kw0Var;
        if (list.isEmpty()) {
            C0270h1.m2190f("Must not be empty.");
            throw null;
        }
        this.f6164b = list;
        this.f6165c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final v11 m3922a(int i, int i2, C0678s3 c0678s3, InterfaceC0847wo interfaceC0847wo, uu0 uu0Var) {
        kw0 kw0Var = this.f6163a;
        List list = (List) kw0Var.mo1367b();
        o80.m3647h(list, "Argument must not be null");
        try {
            List list2 = this.f6164b;
            int size = list2.size();
            v11 v11VarM1492a = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    v11VarM1492a = ((C0183eq) list2.get(i3)).m1492a(i, i2, c0678s3, interfaceC0847wo, uu0Var);
                } catch (t80 e) {
                    list.add(e);
                }
                if (v11VarM1492a != null) {
                    break;
                }
            }
            if (v11VarM1492a == null) {
                throw new t80(this.f6165c, new ArrayList(list));
            }
            kw0Var.mo1366a(list);
            return v11VarM1492a;
        } catch (Throwable th) {
            kw0Var.mo1366a(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6164b.toArray()) + '}';
    }
}
