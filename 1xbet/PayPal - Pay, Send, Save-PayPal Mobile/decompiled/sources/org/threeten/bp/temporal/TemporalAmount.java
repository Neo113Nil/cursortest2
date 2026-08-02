package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public interface TemporalAmount {
    org.threeten.bp.temporal.Temporal addTo(org.threeten.bp.temporal.Temporal temporal);

    long get(org.threeten.bp.temporal.TemporalUnit temporalUnit);

    java.util.List<org.threeten.bp.temporal.TemporalUnit> getUnits();

    org.threeten.bp.temporal.Temporal subtractFrom(org.threeten.bp.temporal.Temporal temporal);
}
