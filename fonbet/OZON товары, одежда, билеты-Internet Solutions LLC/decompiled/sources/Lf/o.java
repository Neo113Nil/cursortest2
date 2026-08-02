package Lf;

import org.joda.time.Duration;
import org.joda.time.PeriodType;

/* loaded from: classes10.dex */
final class o extends a implements j {

    /* renamed from: b, reason: collision with root package name */
    static final o f17061b = new o(0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.a, Lf.j
    public final PeriodType B(Duration duration) {
        return ((org.joda.time.k) duration).getPeriodType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.j
    public final void I(org.joda.time.e eVar, Duration duration, org.joda.time.a aVar) {
        eVar.b((org.joda.time.k) duration);
    }

    @Override // Lf.c
    public final Class<?> v() {
        return org.joda.time.k.class;
    }
}
