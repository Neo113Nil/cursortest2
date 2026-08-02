package p000;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u92 extends bs1 {

    /* JADX INFO: renamed from: l */
    public final C0884xo f7718l;

    /* JADX INFO: renamed from: m */
    public final HashMap f7719m;

    public u92(C0884xo c0884xo) {
        super("require");
        this.f7719m = new HashMap();
        this.f7718l = c0884xo;
    }

    @Override // p000.bs1
    /* JADX INFO: renamed from: a */
    public final ht1 mo749a(f71 f71Var, List list) {
        ht1 ht1Var;
        wo1.m5396w("require", 1, list);
        String strMo753f = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(0)).mo753f();
        HashMap map = this.f7719m;
        if (map.containsKey(strMo753f)) {
            return (ht1) map.get(strMo753f);
        }
        HashMap map2 = this.f7718l.f9009a;
        if (map2.containsKey(strMo753f)) {
            try {
                ht1Var = (ht1) ((Callable) map2.get(strMo753f)).call();
            } catch (Exception unused) {
                C0270h1.m2191g("Failed to create API implementation: ".concat(String.valueOf(strMo753f)));
                return null;
            }
        } else {
            ht1Var = ht1.f3330b;
        }
        if (ht1Var instanceof bs1) {
            map.put(strMo753f, (bs1) ht1Var);
        }
        return ht1Var;
    }
}
