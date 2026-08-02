package org.threeten.bp;

/* loaded from: classes18.dex */
public enum DayOfWeek implements org.threeten.bp.temporal.TemporalAccessor, org.threeten.bp.temporal.TemporalAdjuster {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.DayOfWeek> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.DayOfWeek>() { // from class: org.threeten.bp.DayOfWeek.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.DayOfWeek queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.DayOfWeek.from(temporalAccessor);
        }
    };
    private static final org.threeten.bp.DayOfWeek[] Camera2StreamConfigurationMap = values();

    public static org.threeten.bp.DayOfWeek of(int i) {
        if (i <= 0 || i > 7) {
            throw new org.threeten.bp.DateTimeException("Invalid value for DayOfWeek: ".concat(java.lang.String.valueOf(i)));
        }
        return Camera2StreamConfigurationMap[i - 1];
    }

    public static org.threeten.bp.DayOfWeek from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.DayOfWeek) {
            return (org.threeten.bp.DayOfWeek) temporalAccessor;
        }
        try {
            return of(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK));
        } catch (org.threeten.bp.DateTimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain DayOfWeek from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString(), e);
        }
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    public final java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendText(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, textStyle).toFormatter(locale).format(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) {
            return temporalField.range();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) {
            return getValue();
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) {
            return getValue();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.getFrom(this);
    }

    public final org.threeten.bp.DayOfWeek plus(long j) {
        return Camera2StreamConfigurationMap[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    public final org.threeten.bp.DayOfWeek minus(long j) {
        return plus(-(j % 7));
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.DAYS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, getValue());
    }
}
