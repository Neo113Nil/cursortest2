package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class da2 {

    /* JADX INFO: renamed from: d */
    public static final ba2 f1600d = new ba2();

    /* JADX INFO: renamed from: a */
    public final da2 f1601a;

    /* JADX INFO: renamed from: b */
    public final w71 f1602b;

    /* JADX INFO: renamed from: c */
    public boolean f1603c = false;

    public /* synthetic */ da2(da2 da2Var, w71 w71Var) {
        if (da2Var != null) {
            a90.m123g(da2Var.f1603c);
        }
        this.f1601a = da2Var;
        this.f1602b = w71Var;
    }

    /* JADX INFO: renamed from: a */
    public static da2 m1144a(da2 da2Var, da2 da2Var2) {
        da2Var.getClass();
        da2 da2Var3 = ca2.f1207e;
        if (da2Var == da2Var3) {
            return da2Var2;
        }
        da2Var2.getClass();
        if (da2Var2 == da2Var3) {
            return da2Var;
        }
        sc0<da2> sc0VarM4514l = sc0.m4514l(2, da2Var, da2Var2);
        if (sc0VarM4514l.isEmpty()) {
            return da2Var3;
        }
        if (sc0VarM4514l.size() == 1) {
            return (da2) sc0VarM4514l.iterator().next();
        }
        int i = 0;
        for (da2 da2Var4 : sc0VarM4514l) {
            do {
                i += da2Var4.f1602b.f8453l;
                da2Var4 = da2Var4.f1601a;
            } while (da2Var4 != null);
        }
        if (i == 0) {
            return ca2.f1207e;
        }
        w71 w71Var = new w71(i);
        for (da2 da2Var5 : sc0VarM4514l) {
            do {
                int i2 = 0;
                while (true) {
                    w71 w71Var2 = da2Var5.f1602b;
                    if (i2 >= w71Var2.f8453l) {
                        break;
                    }
                    a90.m121e(w71Var2.m5299f(i2), "Duplicate bindings: %s", w71Var.put((ba2) w71Var2.m5299f(i2), w71Var2.m5303j(i2)) == null);
                    i2++;
                }
                da2Var5 = da2Var5.f1601a;
            } while (da2Var5 != null);
        }
        return new ca2(null, w71Var).m1145b();
    }

    /* JADX INFO: renamed from: b */
    public final da2 m1145b() {
        if (this.f1603c) {
            C0270h1.m2191g("Already frozen");
            return null;
        }
        this.f1603c = true;
        da2 da2Var = this.f1601a;
        return (da2Var == null || !this.f1602b.isEmpty()) ? this : da2Var;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1146c() {
        if (this.f1602b.containsKey(f1600d)) {
            return true;
        }
        da2 da2Var = this.f1601a;
        return da2Var != null && da2Var.m1146c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (da2 da2Var = this; da2Var != null; da2Var = da2Var.f1601a) {
            for (int i = 0; i < da2Var.f1602b.f8453l; i++) {
                sb.append("[");
                sb.append(this.f1602b.m5303j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
