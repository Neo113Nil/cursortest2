package p000;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: uj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0768uj {

    /* JADX INFO: renamed from: a */
    public String f7821a = null;

    /* JADX INFO: renamed from: b */
    public final HashSet f7822b;

    /* JADX INFO: renamed from: c */
    public final HashSet f7823c;

    /* JADX INFO: renamed from: d */
    public int f7824d;

    /* JADX INFO: renamed from: e */
    public int f7825e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0436lk f7826f;

    /* JADX INFO: renamed from: g */
    public final HashSet f7827g;

    public C0768uj(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f7822b = hashSet;
        this.f7823c = new HashSet();
        this.f7824d = 0;
        this.f7825e = 0;
        this.f7827g = new HashSet();
        hashSet.add(cz0.m1050a(cls));
        for (Class cls2 : clsArr) {
            kd0.m3010f(cls2, "Null interface");
            this.f7822b.add(cz0.m1050a(cls2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4926a(C0481ms c0481ms) {
        if (this.f7822b.contains(c0481ms.f5152a)) {
            C0270h1.m2190f("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.f7823c.add(c0481ms);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0805vj m4927b() {
        if (this.f7826f != null) {
            return new C0805vj(this.f7821a, new HashSet(this.f7822b), new HashSet(this.f7823c), this.f7824d, this.f7825e, this.f7826f, this.f7827g);
        }
        C0270h1.m2191g("Missing required property: factory.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4928c(int i) {
        if (this.f7824d == 0) {
            this.f7824d = i;
        } else {
            C0270h1.m2191g("Instantiation type has already been set.");
        }
    }

    public C0768uj(cz0 cz0Var, cz0[] cz0VarArr) {
        HashSet hashSet = new HashSet();
        this.f7822b = hashSet;
        this.f7823c = new HashSet();
        this.f7824d = 0;
        this.f7825e = 0;
        this.f7827g = new HashSet();
        hashSet.add(cz0Var);
        for (cz0 cz0Var2 : cz0VarArr) {
            kd0.m3010f(cz0Var2, "Null interface");
        }
        Collections.addAll(this.f7822b, cz0VarArr);
    }
}
