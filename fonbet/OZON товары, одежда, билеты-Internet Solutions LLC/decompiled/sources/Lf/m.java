package Lf;

import org.joda.time.Duration;

/* loaded from: classes10.dex */
final class m extends a implements j {

    /* renamed from: b, reason: collision with root package name */
    static final m f17059b = new m(0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.j
    public final void I(org.joda.time.e eVar, Duration duration, org.joda.time.a aVar) {
        org.joda.time.i iVar = (org.joda.time.i) duration;
        int[] p11 = aVar.p(eVar, iVar.a(), iVar.b());
        for (int i11 = 0; i11 < p11.length; i11++) {
            eVar.a(i11, p11[i11]);
        }
    }

    @Override // Lf.c
    public final Class<?> v() {
        return org.joda.time.i.class;
    }
}
