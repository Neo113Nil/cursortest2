package w1;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class L1 implements K1 {

    /* renamed from: m, reason: collision with root package name */
    public static final HashSet f17445m = new HashSet();

    @Override // w1.K1
    public final C1758x0 a(C2 c22) {
        boolean equals = c22.a().equals(D2.ORIGIN_ATTRIBUTE);
        C1758x0 c1758x0 = K1.f17432a;
        if (!equals) {
            return c1758x0;
        }
        String str = ((v2) c22.f17316c).f17892c;
        HashSet hashSet = f17445m;
        if (hashSet.size() < 10 || hashSet.contains(str)) {
            hashSet.add(str);
            return c1758x0;
        }
        AbstractC1706i0.o(5, "MaxOrigins exceeded: " + hashSet.size());
        return K1.f17439h;
    }

    @Override // w1.K1
    public final void a() {
    }
}
