package w1;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class M1 implements K1 {

    /* renamed from: m, reason: collision with root package name */
    public static final HashSet f17449m = new HashSet();

    @Override // w1.K1
    public final C1758x0 a(C2 c22) {
        boolean equals = c22.a().equals(D2.SESSION_PROPERTIES_PARAMS);
        C1758x0 c1758x0 = K1.f17432a;
        if (!equals) {
            return c1758x0;
        }
        String str = ((C1696f2) c22.f17316c).f17712c;
        HashSet hashSet = f17449m;
        if (hashSet.size() < 10 || hashSet.contains(str)) {
            hashSet.add(str);
            return c1758x0;
        }
        AbstractC1706i0.o(5, "MaxSessionPropertiesParams exceeded: 10");
        return K1.f17440i;
    }

    @Override // w1.K1
    public final void a() {
        f17449m.clear();
    }
}
