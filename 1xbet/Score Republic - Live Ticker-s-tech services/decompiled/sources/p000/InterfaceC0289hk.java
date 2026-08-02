package p000;

import java.util.Set;

/* JADX INFO: renamed from: hk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0289hk {
    /* JADX INFO: renamed from: a */
    default Object mo2281a(Class cls) {
        return mo2288h(cz0.m1050a(cls));
    }

    /* JADX INFO: renamed from: b */
    default tu0 mo2282b() {
        return mo2286f(cz0.m1050a(InterfaceC0826w3.class));
    }

    /* JADX INFO: renamed from: c */
    my0 mo2283c(cz0 cz0Var);

    /* JADX INFO: renamed from: d */
    default Set mo2284d(cz0 cz0Var) {
        return (Set) mo2283c(cz0Var).get();
    }

    /* JADX INFO: renamed from: e */
    default my0 mo2285e(Class cls) {
        return mo2287g(cz0.m1050a(cls));
    }

    /* JADX INFO: renamed from: f */
    tu0 mo2286f(cz0 cz0Var);

    /* JADX INFO: renamed from: g */
    my0 mo2287g(cz0 cz0Var);

    /* JADX INFO: renamed from: h */
    default Object mo2288h(cz0 cz0Var) {
        my0 my0VarMo2287g = mo2287g(cz0Var);
        if (my0VarMo2287g == null) {
            return null;
        }
        return my0VarMo2287g.get();
    }
}
