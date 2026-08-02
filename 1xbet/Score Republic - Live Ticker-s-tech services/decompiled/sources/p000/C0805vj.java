package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: vj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0805vj {

    /* JADX INFO: renamed from: a */
    public final String f8198a;

    /* JADX INFO: renamed from: b */
    public final Set f8199b;

    /* JADX INFO: renamed from: c */
    public final Set f8200c;

    /* JADX INFO: renamed from: d */
    public final int f8201d;

    /* JADX INFO: renamed from: e */
    public final int f8202e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0436lk f8203f;

    /* JADX INFO: renamed from: g */
    public final Set f8204g;

    public C0805vj(String str, Set set, Set set2, int i, int i2, InterfaceC0436lk interfaceC0436lk, Set set3) {
        this.f8198a = str;
        this.f8199b = Collections.unmodifiableSet(set);
        this.f8200c = Collections.unmodifiableSet(set2);
        this.f8201d = i;
        this.f8202e = i2;
        this.f8203f = interfaceC0436lk;
        this.f8204g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static C0768uj m5163a(cz0 cz0Var) {
        return new C0768uj(cz0Var, new cz0[0]);
    }

    /* JADX INFO: renamed from: b */
    public static C0768uj m5164b(Class cls) {
        return new C0768uj(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: c */
    public static C0805vj m5165c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cz0.m1050a(cls));
        for (Class cls2 : clsArr) {
            kd0.m3010f(cls2, "Null interface");
            hashSet.add(cz0.m1050a(cls2));
        }
        return new C0805vj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0731tj(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8199b.toArray()) + ">{" + this.f8201d + ", type=" + this.f8202e + ", deps=" + Arrays.toString(this.f8200c.toArray()) + "}";
    }
}
