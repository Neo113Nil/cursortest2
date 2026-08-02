package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public interface TemporalUnit {
    <R extends org.threeten.bp.temporal.Temporal> R addTo(R r, long j);

    long between(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.Temporal temporal2);

    org.threeten.bp.Duration getDuration();

    boolean isDateBased();

    boolean isDurationEstimated();

    boolean isSupportedBy(org.threeten.bp.temporal.Temporal temporal);

    boolean isTimeBased();

    java.lang.String toString();
}
