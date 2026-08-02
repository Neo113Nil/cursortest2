package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public enum ChronoField implements org.threeten.bp.temporal.TemporalField {
    NANO_OF_SECOND("NanoOfSecond", org.threeten.bp.temporal.ChronoUnit.NANOS, org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ValueRange.of(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", org.threeten.bp.temporal.ChronoUnit.NANOS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", org.threeten.bp.temporal.ChronoUnit.MICROS, org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ValueRange.of(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", org.threeten.bp.temporal.ChronoUnit.MICROS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", org.threeten.bp.temporal.ChronoUnit.MILLIS, org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ValueRange.of(0, 999)),
    MILLI_OF_DAY("MilliOfDay", org.threeten.bp.temporal.ChronoUnit.MILLIS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ChronoUnit.MINUTES, org.threeten.bp.temporal.ValueRange.of(0, 59)),
    SECOND_OF_DAY("SecondOfDay", org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", org.threeten.bp.temporal.ChronoUnit.MINUTES, org.threeten.bp.temporal.ChronoUnit.HOURS, org.threeten.bp.temporal.ValueRange.of(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", org.threeten.bp.temporal.ChronoUnit.MINUTES, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", org.threeten.bp.temporal.ChronoUnit.HOURS, org.threeten.bp.temporal.ChronoUnit.HALF_DAYS, org.threeten.bp.temporal.ValueRange.of(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", org.threeten.bp.temporal.ChronoUnit.HOURS, org.threeten.bp.temporal.ChronoUnit.HALF_DAYS, org.threeten.bp.temporal.ValueRange.of(1, 12)),
    HOUR_OF_DAY("HourOfDay", org.threeten.bp.temporal.ChronoUnit.HOURS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", org.threeten.bp.temporal.ChronoUnit.HOURS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", org.threeten.bp.temporal.ChronoUnit.HALF_DAYS, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ValueRange.of(0, 1)),
    DAY_OF_WEEK("DayOfWeek", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ValueRange.of(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ValueRange.of(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ValueRange.of(1, 7)),
    DAY_OF_MONTH("DayOfMonth", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.MONTHS, org.threeten.bp.temporal.ValueRange.of(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ValueRange.of(1, 365, 366)),
    EPOCH_DAY("EpochDay", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ChronoUnit.MONTHS, org.threeten.bp.temporal.ValueRange.of(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ValueRange.of(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", org.threeten.bp.temporal.ChronoUnit.MONTHS, org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ValueRange.of(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", org.threeten.bp.temporal.ChronoUnit.MONTHS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(1, 999999999, 1000000000)),
    YEAR("Year", org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(-999999999, 999999999)),
    ERA("Era", org.threeten.bp.temporal.ChronoUnit.ERAS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(0, 1)),
    INSTANT_SECONDS("InstantSeconds", org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ChronoUnit.FOREVER, org.threeten.bp.temporal.ValueRange.of(-64800, 64800));

    private final org.threeten.bp.temporal.TemporalUnit getHighResolutionOutputSizeshNQ4ISI;
    private final org.threeten.bp.temporal.ValueRange getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final org.threeten.bp.temporal.TemporalUnit getHighSpeedVideoSizes;

    @Override // org.threeten.bp.temporal.TemporalField
    public final org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle) {
        return null;
    }

    ChronoField(java.lang.String str, org.threeten.bp.temporal.TemporalUnit temporalUnit, org.threeten.bp.temporal.TemporalUnit temporalUnit2, org.threeten.bp.temporal.ValueRange valueRange) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = temporalUnit;
        this.getHighSpeedVideoSizes = temporalUnit2;
        this.getHighSpeedVideoFpsRanges = valueRange;
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final org.threeten.bp.temporal.ValueRange range() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final long checkValidValue(long j) {
        return range().checkValidValue(j, this);
    }

    public final int checkValidIntValue(long j) {
        return range().checkValidIntValue(j, this);
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.isSupported(this);
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.range(this);
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(this);
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
        return (R) r.with(this, j);
    }

    @Override // org.threeten.bp.temporal.TemporalField
    public final java.lang.String getDisplayName(java.util.Locale locale) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        return toString();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
