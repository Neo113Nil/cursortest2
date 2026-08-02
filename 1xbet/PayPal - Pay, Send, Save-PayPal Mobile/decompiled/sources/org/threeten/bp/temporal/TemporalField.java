package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public interface TemporalField {
    <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j);

    org.threeten.bp.temporal.TemporalUnit getBaseUnit();

    java.lang.String getDisplayName(java.util.Locale locale);

    long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor);

    org.threeten.bp.temporal.TemporalUnit getRangeUnit();

    boolean isDateBased();

    boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor);

    boolean isTimeBased();

    org.threeten.bp.temporal.ValueRange range();

    org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor);

    org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle);
}
