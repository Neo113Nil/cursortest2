package org.threeten.bp.jdk8;

/* loaded from: classes18.dex */
public abstract class DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.TemporalAccessor {
    @Override // org.threeten.bp.temporal.TemporalAccessor
    public org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (isSupported(temporalField)) {
                return temporalField.range();
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public int get(org.threeten.bp.temporal.TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
