package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 {

    /* JADX INFO: renamed from: c */
    public static final eq1 f2165c = new eq1();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f2167b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final b90 f2166a = new b90(4);

    /* JADX INFO: renamed from: a */
    public final hq1 m1495a(Class cls) {
        hq1 aq1Var;
        ConcurrentHashMap concurrentHashMap = this.f2167b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (hq1) obj;
        }
        b90 b90Var = this.f2166a;
        b90Var.getClass();
        wa0 wa0Var = iq1.f3637a;
        if (!zo1.class.isAssignableFrom(cls)) {
            int i = fo1.f2465a;
        }
        gq1 gq1VarMo304E = ((an0) b90Var.f793k).mo304E(cls);
        if ((gq1VarMo304E.f2852d & 2) == 2) {
            int i2 = fo1.f2465a;
            wa0 wa0Var2 = iq1.f3637a;
            x80 x80Var = to1.f7556a;
            aq1Var = new aq1(wa0Var2, gq1VarMo304E.f2849a);
        } else {
            int i3 = fo1.f2465a;
            int i4 = bq1.f960a;
            int i5 = op1.f5830a;
            wa0 wa0Var3 = iq1.f3637a;
            x80 x80Var2 = gq1VarMo304E.m2140a() + (-1) != 1 ? to1.f7556a : null;
            int i6 = sp1.f7186a;
            aq1Var = zp1.m6001z(gq1VarMo304E, wa0Var3, x80Var2);
        }
        hq1 hq1Var = (hq1) concurrentHashMap.putIfAbsent(cls, aq1Var);
        return hq1Var != null ? hq1Var : aq1Var;
    }
}
