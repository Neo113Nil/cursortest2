package org.threeten.bp.jdk8;

/* loaded from: classes18.dex */
public abstract class DefaultInterfaceEra extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.chrono.Era {
    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
            return getValue();
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.getFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.ERA, getValue());
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.ERAS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.chrono.Era
    public java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendText(org.threeten.bp.temporal.ChronoField.ERA, textStyle).toFormatter(locale).format(this);
    }
}
