package Lf;

import I0.C3173b;
import org.joda.time.Duration;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
final class p extends a implements g, j {

    /* renamed from: b, reason: collision with root package name */
    static final p f17062b = new p(0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.j
    public final void I(org.joda.time.e eVar, Duration duration, org.joda.time.a aVar) {
        String str = (String) duration;
        org.joda.time.format.m e11 = b7.d.e();
        eVar.clear();
        int c11 = e11.c(eVar, str);
        if (c11 < str.length()) {
            if (c11 < 0) {
                e11.f(eVar.getPeriodType()).d(str);
            }
            throw new IllegalArgumentException(C3173b.a('\"', "Invalid format: \"", str));
        }
    }

    @Override // Lf.a, Lf.g
    public final long X(Object obj, ISOChronology iSOChronology) {
        return org.joda.time.format.i.d().l(iSOChronology).f((String) obj);
    }

    @Override // Lf.c
    public final Class<?> v() {
        return String.class;
    }
}
