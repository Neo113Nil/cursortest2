package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public abstract class ChronoLocalDateTime<D extends org.threeten.bp.chrono.ChronoLocalDate> extends org.threeten.bp.jdk8.DefaultInterfaceTemporal implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.chrono.ChronoLocalDateTime<?>> {
    private static final java.util.Comparator<org.threeten.bp.chrono.ChronoLocalDateTime<?>> getHighSpeedVideoFpsRangesFor = new java.util.Comparator<org.threeten.bp.chrono.ChronoLocalDateTime<?>>() { // from class: org.threeten.bp.chrono.ChronoLocalDateTime.1
        /* JADX WARN: Type inference failed for: r0v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
        /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
        @Override // java.util.Comparator
        public /* synthetic */ int compare(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime, org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime2) {
            org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime3 = chronoLocalDateTime;
            org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime4 = chronoLocalDateTime2;
            int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(chronoLocalDateTime3.toLocalDate().toEpochDay(), chronoLocalDateTime4.toLocalDate().toEpochDay());
            return compareLongs == 0 ? org.threeten.bp.jdk8.Jdk8Methods.compareLongs(chronoLocalDateTime3.toLocalTime().toNanoOfDay(), chronoLocalDateTime4.toLocalTime().toNanoOfDay()) : compareLongs;
        }
    };

    /* renamed from: atZone */
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> atZone2(org.threeten.bp.ZoneId zoneId);

    @Override // org.threeten.bp.temporal.Temporal
    public abstract org.threeten.bp.chrono.ChronoLocalDateTime<D> plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit);

    public abstract D toLocalDate();

    public abstract org.threeten.bp.LocalTime toLocalTime();

    @Override // org.threeten.bp.temporal.Temporal
    public abstract org.threeten.bp.chrono.ChronoLocalDateTime<D> with(org.threeten.bp.temporal.TemporalField temporalField, long j);

    public static java.util.Comparator<org.threeten.bp.chrono.ChronoLocalDateTime<?>> timeLineOrder() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static org.threeten.bp.chrono.ChronoLocalDateTime<?> from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        if (temporalAccessor instanceof org.threeten.bp.chrono.ChronoLocalDateTime) {
            return (org.threeten.bp.chrono.ChronoLocalDateTime) temporalAccessor;
        }
        org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.chronology());
        if (chronology == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Chronology found to create ChronoLocalDateTime: ");
            sb.append(temporalAccessor.getClass());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        return chronology.localDateTime(temporalAccessor);
    }

    public org.threeten.bp.chrono.Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDateTime<D> with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return toLocalDate().getChronology().getHighResolutionOutputSizeshNQ4ISI(super.with(temporalAdjuster));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDateTime<D> plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return toLocalDate().getChronology().getHighResolutionOutputSizeshNQ4ISI(super.plus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDateTime<D> minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return toLocalDate().getChronology().getHighResolutionOutputSizeshNQ4ISI(super.minus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoLocalDateTime<D> minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return toLocalDate().getChronology().getHighResolutionOutputSizeshNQ4ISI(super.minus(j, temporalUnit));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) getChronology();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return (R) org.threeten.bp.LocalDate.ofEpochDay(toLocalDate().toEpochDay());
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return (R) toLocalTime();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    public org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay());
    }

    public java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public org.threeten.bp.Instant toInstant(org.threeten.bp.ZoneOffset zoneOffset) {
        return org.threeten.bp.Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().getNano());
    }

    public long toEpochSecond(org.threeten.bp.ZoneOffset zoneOffset) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    @Override // java.lang.Comparable
    public int compareTo(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        int compareTo = toLocalDate().compareTo(chronoLocalDateTime.toLocalDate());
        return (compareTo == 0 && (compareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? getChronology().compareTo(chronoLocalDateTime.getChronology()) : compareTo;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    public boolean isAfter(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        if (epochDay <= epochDay2) {
            return epochDay == epochDay2 && toLocalTime().toNanoOfDay() > chronoLocalDateTime.toLocalTime().toNanoOfDay();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    public boolean isBefore(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && toLocalTime().toNanoOfDay() < chronoLocalDateTime.toLocalTime().toNanoOfDay();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    public boolean isEqual(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        return toLocalTime().toNanoOfDay() == chronoLocalDateTime.toLocalTime().toNanoOfDay() && toLocalDate().toEpochDay() == chronoLocalDateTime.toLocalDate().toEpochDay();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.chrono.ChronoLocalDateTime) && compareTo((org.threeten.bp.chrono.ChronoLocalDateTime<?>) obj) == 0;
    }

    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(toLocalDate().toString());
        sb.append('T');
        sb.append(toLocalTime().toString());
        return sb.toString();
    }
}
