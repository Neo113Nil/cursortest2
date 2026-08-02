package Lf;

import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
final class l extends a implements g {

    /* renamed from: b, reason: collision with root package name */
    static final l f17058b = new l(0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.a, Lf.g
    public final org.joda.time.a W(String str) {
        org.joda.time.a chronology = ((org.joda.time.h) str).getChronology();
        int i11 = org.joda.time.c.f79052b;
        return chronology == null ? ISOChronology.g0() : chronology;
    }

    @Override // Lf.a, Lf.g
    public final long X(Object obj, ISOChronology iSOChronology) {
        return ((org.joda.time.h) obj).getMillis();
    }

    @Override // Lf.c
    public final Class<?> v() {
        return org.joda.time.h.class;
    }
}
