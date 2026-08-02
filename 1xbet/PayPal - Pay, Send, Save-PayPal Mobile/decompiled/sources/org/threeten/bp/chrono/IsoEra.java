package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public enum IsoEra implements org.threeten.bp.chrono.Era {
    BCE,
    CE;

    public static org.threeten.bp.chrono.IsoEra of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new org.threeten.bp.DateTimeException("Invalid era: ".concat(java.lang.String.valueOf(i)));
    }

    @Override // org.threeten.bp.chrono.Era
    public final int getValue() {
        return ordinal();
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
            return temporalField.range();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
            return getValue();
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.getFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.ERA, getValue());
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.ERAS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.chrono.Era
    public final java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendText(org.threeten.bp.temporal.ChronoField.ERA, textStyle).toFormatter(locale).format(this);
    }
}
