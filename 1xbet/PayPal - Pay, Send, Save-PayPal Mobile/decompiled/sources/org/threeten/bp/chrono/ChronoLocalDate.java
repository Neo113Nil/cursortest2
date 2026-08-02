package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public abstract class ChronoLocalDate extends org.threeten.bp.jdk8.DefaultInterfaceTemporal implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.chrono.ChronoLocalDate> {
    private static final java.util.Comparator<org.threeten.bp.chrono.ChronoLocalDate> getHighResolutionOutputSizeshNQ4ISI = new java.util.Comparator<org.threeten.bp.chrono.ChronoLocalDate>() { // from class: org.threeten.bp.chrono.ChronoLocalDate.1
        @Override // java.util.Comparator
        public /* synthetic */ int compare(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate, org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate2) {
            return org.threeten.bp.jdk8.Jdk8Methods.compareLongs(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        }
    };

    public abstract org.threeten.bp.chrono.Chronology getChronology();

    public abstract int lengthOfMonth();

    @Override // org.threeten.bp.temporal.Temporal
    public abstract org.threeten.bp.chrono.ChronoLocalDate plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit);

    public abstract org.threeten.bp.chrono.ChronoPeriod until(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate);

    @Override // org.threeten.bp.temporal.Temporal
    public abstract org.threeten.bp.chrono.ChronoLocalDate with(org.threeten.bp.temporal.TemporalField temporalField, long j);

    public static java.util.Comparator<org.threeten.bp.chrono.ChronoLocalDate> timeLineOrder() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.threeten.bp.chrono.ChronoLocalDate from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        if (temporalAccessor instanceof org.threeten.bp.chrono.ChronoLocalDate) {
            return (org.threeten.bp.chrono.ChronoLocalDate) temporalAccessor;
        }
        org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.chronology());
        if (chronology == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Chronology found to create ChronoLocalDate: ");
            sb.append(temporalAccessor.getClass());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        return chronology.date(temporalAccessor);
    }

    public org.threeten.bp.chrono.Era getEra() {
        return getChronology().eraOf(get(org.threeten.bp.temporal.ChronoField.ERA));
    }

    public boolean isLeapYear() {
        return getChronology().isLeapYear(getLong(org.threeten.bp.temporal.ChronoField.YEAR));
    }

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return temporalField.isDateBased();
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return temporalUnit.isDateBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDate with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return getChronology().getHighSpeedVideoFpsRangesFor(super.with(temporalAdjuster));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDate plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return getChronology().getHighSpeedVideoFpsRangesFor(super.plus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDate minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return getChronology().getHighSpeedVideoFpsRangesFor(super.minus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDate minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return getChronology().getHighSpeedVideoFpsRangesFor(super.minus(j, temporalUnit));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) getChronology();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.DAYS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return (R) org.threeten.bp.LocalDate.ofEpochDay(toEpochDay());
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    public org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.EPOCH_DAY, toEpochDay());
    }

    public java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public org.threeten.bp.chrono.ChronoLocalDateTime<?> atTime(org.threeten.bp.LocalTime localTime) {
        return org.threeten.bp.chrono.ChronoLocalDateTimeImpl.getHighSpeedVideoFpsRangesFor(this, localTime);
    }

    public long toEpochDay() {
        return getLong(org.threeten.bp.temporal.ChronoField.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    public int compareTo(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(toEpochDay(), chronoLocalDate.toEpochDay());
        return compareLongs == 0 ? getChronology().compareTo(chronoLocalDate.getChronology()) : compareLongs;
    }

    public boolean isAfter(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        return toEpochDay() > chronoLocalDate.toEpochDay();
    }

    public boolean isBefore(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    public boolean isEqual(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        return toEpochDay() == chronoLocalDate.toEpochDay();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.chrono.ChronoLocalDate) && compareTo((org.threeten.bp.chrono.ChronoLocalDate) obj) == 0;
    }

    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    public java.lang.String toString() {
        long j = getLong(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
        long j2 = getLong(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 < 10 ? "-0" : "-");
        sb.append(j3);
        return sb.toString();
    }
}
