package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public abstract class ChronoPeriod implements org.threeten.bp.temporal.TemporalAmount {
    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract org.threeten.bp.temporal.Temporal addTo(org.threeten.bp.temporal.Temporal temporal);

    public abstract boolean equals(java.lang.Object obj);

    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract long get(org.threeten.bp.temporal.TemporalUnit temporalUnit);

    public abstract org.threeten.bp.chrono.Chronology getChronology();

    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract java.util.List<org.threeten.bp.temporal.TemporalUnit> getUnits();

    public abstract int hashCode();

    public abstract org.threeten.bp.chrono.ChronoPeriod minus(org.threeten.bp.temporal.TemporalAmount temporalAmount);

    public abstract org.threeten.bp.chrono.ChronoPeriod multipliedBy(int i);

    public abstract org.threeten.bp.chrono.ChronoPeriod normalized();

    public abstract org.threeten.bp.chrono.ChronoPeriod plus(org.threeten.bp.temporal.TemporalAmount temporalAmount);

    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract org.threeten.bp.temporal.Temporal subtractFrom(org.threeten.bp.temporal.Temporal temporal);

    public abstract java.lang.String toString();

    public static org.threeten.bp.chrono.ChronoPeriod between(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate, org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate2) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronoLocalDate, "startDateInclusive");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronoLocalDate2, "endDateExclusive");
        return chronoLocalDate.until(chronoLocalDate2);
    }

    public boolean isZero() {
        java.util.Iterator<org.threeten.bp.temporal.TemporalUnit> it = getUnits().iterator();
        while (it.hasNext()) {
            if (get(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isNegative() {
        java.util.Iterator<org.threeten.bp.temporal.TemporalUnit> it = getUnits().iterator();
        while (it.hasNext()) {
            if (get(it.next()) < 0) {
                return true;
            }
        }
        return false;
    }

    public org.threeten.bp.chrono.ChronoPeriod negated() {
        return multipliedBy(-1);
    }
}
