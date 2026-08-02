package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public enum ChronoUnit implements org.threeten.bp.temporal.TemporalUnit {
    NANOS("Nanos", org.threeten.bp.Duration.ofNanos(1)),
    MICROS("Micros", org.threeten.bp.Duration.ofNanos(1000)),
    MILLIS("Millis", org.threeten.bp.Duration.ofNanos(1000000)),
    SECONDS("Seconds", org.threeten.bp.Duration.ofSeconds(1)),
    MINUTES("Minutes", org.threeten.bp.Duration.ofSeconds(60)),
    HOURS("Hours", org.threeten.bp.Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", org.threeten.bp.Duration.ofSeconds(43200)),
    DAYS("Days", org.threeten.bp.Duration.ofSeconds(86400)),
    WEEKS("Weeks", org.threeten.bp.Duration.ofSeconds(604800)),
    MONTHS("Months", org.threeten.bp.Duration.ofSeconds(2629746)),
    YEARS("Years", org.threeten.bp.Duration.ofSeconds(31556952)),
    DECADES("Decades", org.threeten.bp.Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", org.threeten.bp.Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", org.threeten.bp.Duration.ofSeconds(31556952000L)),
    ERAS("Eras", org.threeten.bp.Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", org.threeten.bp.Duration.ofSeconds(Long.MAX_VALUE, 999999999));

    private final org.threeten.bp.Duration getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    ChronoUnit(java.lang.String str, org.threeten.bp.Duration duration) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = duration;
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final org.threeten.bp.Duration getDuration() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final boolean isSupportedBy(org.threeten.bp.temporal.Temporal temporal) {
        if (this == FOREVER) {
            return false;
        }
        if (temporal instanceof org.threeten.bp.chrono.ChronoLocalDate) {
            return isDateBased();
        }
        if ((temporal instanceof org.threeten.bp.chrono.ChronoLocalDateTime) || (temporal instanceof org.threeten.bp.chrono.ChronoZonedDateTime)) {
            return true;
        }
        try {
            temporal.plus(1L, this);
            return true;
        } catch (java.lang.RuntimeException unused) {
            try {
                temporal.plus(-1L, this);
                return true;
            } catch (java.lang.RuntimeException unused2) {
                return false;
            }
        }
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final <R extends org.threeten.bp.temporal.Temporal> R addTo(R r, long j) {
        return (R) r.plus(j, this);
    }

    @Override // org.threeten.bp.temporal.TemporalUnit
    public final long between(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // java.lang.Enum, org.threeten.bp.temporal.TemporalUnit
    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes;
    }
}
