package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public interface TemporalAccessor {
    int get(org.threeten.bp.temporal.TemporalField temporalField);

    long getLong(org.threeten.bp.temporal.TemporalField temporalField);

    boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField);

    <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery);

    org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField);
}
