package Lf;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/* loaded from: classes10.dex */
final class b extends a implements g {

    /* renamed from: b, reason: collision with root package name */
    static final b f17043b = new b(0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.a, Lf.g
    public final org.joda.time.a W(String str) {
        DateTimeZone g10;
        Calendar calendar = (Calendar) str;
        try {
            g10 = DateTimeZone.f(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            g10 = DateTimeZone.g();
        }
        if (calendar.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.g0(g10);
        }
        if (!(calendar instanceof GregorianCalendar)) {
            return ISOChronology.h0(g10);
        }
        long time = ((GregorianCalendar) calendar).getGregorianChange().getTime();
        return time == Long.MIN_VALUE ? GregorianChronology.K0(g10, 4) : time == Long.MAX_VALUE ? JulianChronology.K0(g10, 4) : GJChronology.j0(time, g10);
    }

    @Override // Lf.a, Lf.g
    public final long X(Object obj, ISOChronology iSOChronology) {
        return ((Calendar) obj).getTime().getTime();
    }

    @Override // Lf.c
    public final Class<?> v() {
        return Calendar.class;
    }
}
