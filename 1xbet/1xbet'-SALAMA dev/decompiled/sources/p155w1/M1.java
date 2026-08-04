package p155w1;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class M1 implements K1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashSet f17455m = new HashSet();

    @Override // p155w1.K1
    public final C1049x0 a(C2 c3) {
        boolean zEquals = c3.a().equals(D2.SESSION_PROPERTIES_PARAMS);
        C1049x0 c1049x0 = K1.f17438a;
        if (!zEquals) {
            return c1049x0;
        }
        String str = ((C0987f2) c3.f17322c).f17718c;
        HashSet hashSet = f17455m;
        if (hashSet.size() < 10 || hashSet.contains(str)) {
            hashSet.add(str);
            return c1049x0;
        }
        AbstractC0997i0.o(5, "MaxSessionPropertiesParams exceeded: 10");
        return K1.f17446i;
    }

    @Override // p155w1.K1
    public final void a() {
        f17455m.clear();
    }
}
