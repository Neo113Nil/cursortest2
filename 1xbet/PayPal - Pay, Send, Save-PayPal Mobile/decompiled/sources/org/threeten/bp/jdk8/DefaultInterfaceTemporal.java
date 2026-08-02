package org.threeten.bp.jdk8;

/* loaded from: classes18.dex */
public abstract class DefaultInterfaceTemporal extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.Temporal {
    public org.threeten.bp.temporal.Temporal with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster.adjustInto(this);
    }

    public org.threeten.bp.temporal.Temporal plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return temporalAmount.addTo(this);
    }

    public org.threeten.bp.temporal.Temporal minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return temporalAmount.subtractFrom(this);
    }

    public org.threeten.bp.temporal.Temporal minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }
}
