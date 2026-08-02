package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes6.dex */
public enum b implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    public final String a;

    static {
        Duration.A(1L);
        Duration.A(1000L);
        Duration.A(1000000L);
        Duration.v(1L, 0);
        Duration.v(60L, 0);
        Duration.v(3600L, 0);
        Duration.v(43200L, 0);
        Duration.v(86400L, 0);
        Duration.v(604800L, 0);
        Duration.v(2629746L, 0);
        Duration.v(31556952L, 0);
        Duration.v(315569520L, 0);
        Duration.v(3155695200L, 0);
        Duration.v(31556952000L, 0);
        Duration.v(31556952000000000L, 0);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m o(m mVar, long j) {
        return mVar.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
