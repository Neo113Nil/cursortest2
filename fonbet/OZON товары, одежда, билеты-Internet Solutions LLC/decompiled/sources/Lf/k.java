package Lf;

import org.joda.time.Duration;

/* loaded from: classes10.dex */
final class k extends a implements j {

    /* renamed from: b, reason: collision with root package name */
    static final k f17057b = new k(0);

    @Override // Lf.j
    public final void I(org.joda.time.e eVar, Duration duration, org.joda.time.a aVar) {
        int i11 = org.joda.time.c.f79052b;
        int[] n11 = aVar.n(eVar, duration.getMillis());
        for (int i12 = 0; i12 < n11.length; i12++) {
            eVar.a(i12, n11[i12]);
        }
    }

    @Override // Lf.c
    public final Class<?> v() {
        return org.joda.time.g.class;
    }
}
