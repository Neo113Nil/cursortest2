package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public interface Temporal extends org.threeten.bp.temporal.TemporalAccessor {
    boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit);

    org.threeten.bp.temporal.Temporal minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit);

    org.threeten.bp.temporal.Temporal minus(org.threeten.bp.temporal.TemporalAmount temporalAmount);

    org.threeten.bp.temporal.Temporal plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit);

    org.threeten.bp.temporal.Temporal plus(org.threeten.bp.temporal.TemporalAmount temporalAmount);

    long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit);

    org.threeten.bp.temporal.Temporal with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster);

    org.threeten.bp.temporal.Temporal with(org.threeten.bp.temporal.TemporalField temporalField, long j);
}
