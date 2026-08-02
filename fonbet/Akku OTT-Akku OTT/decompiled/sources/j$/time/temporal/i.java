package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes6.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.v(31556952L, 0);
        Duration.v(7889238L, 0);
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m o(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.c(Math.addExact(mVar.f(r0), j), j.c);
        }
        if (i == 2) {
            return mVar.d(j / 4, b.YEARS).d((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
