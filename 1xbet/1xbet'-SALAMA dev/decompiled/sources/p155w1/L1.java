package p155w1;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class L1 implements K1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashSet f17451m = new HashSet();

    @Override // p155w1.K1
    public final C1049x0 a(C2 c3) {
        boolean zEquals = c3.a().equals(D2.ORIGIN_ATTRIBUTE);
        C1049x0 c1049x0 = K1.f17438a;
        if (!zEquals) {
            return c1049x0;
        }
        String str = ((v2) c3.f17322c).f17898c;
        HashSet hashSet = f17451m;
        if (hashSet.size() < 10 || hashSet.contains(str)) {
            hashSet.add(str);
            return c1049x0;
        }
        AbstractC0997i0.o(5, "MaxOrigins exceeded: " + hashSet.size());
        return K1.f17445h;
    }

    @Override // p155w1.K1
    public final void a() {
    }
}
