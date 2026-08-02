package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
final class ChronoPeriodImpl extends org.threeten.bp.chrono.ChronoPeriod implements java.io.Serializable {
    private static final long serialVersionUID = 275618735781L;
    private final org.threeten.bp.chrono.Chronology getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public ChronoPeriodImpl(org.threeten.bp.chrono.Chronology chronology, int i, int i2, int i3) {
        this.getHighResolutionOutputSizeshNQ4ISI = chronology;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final long get(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        int i;
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.YEARS) {
            i = this.getHighSpeedVideoFpsRanges;
        } else if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
            i = this.getHighSpeedVideoSizes;
        } else if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.DAYS) {
            i = this.getHighSpeedVideoFpsRangesFor;
        } else {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
        return i;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final java.util.List<org.threeten.bp.temporal.TemporalUnit> getUnits() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ChronoUnit.MONTHS, org.threeten.bp.temporal.ChronoUnit.DAYS));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.chrono.Chronology getChronology() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.chrono.ChronoPeriod plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        if (temporalAmount instanceof org.threeten.bp.chrono.ChronoPeriodImpl) {
            org.threeten.bp.chrono.ChronoPeriodImpl chronoPeriodImpl = (org.threeten.bp.chrono.ChronoPeriodImpl) temporalAmount;
            if (chronoPeriodImpl.getChronology().equals(getChronology())) {
                return new org.threeten.bp.chrono.ChronoPeriodImpl(this.getHighResolutionOutputSizeshNQ4ISI, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoFpsRanges, chronoPeriodImpl.getHighSpeedVideoFpsRanges), org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoSizes, chronoPeriodImpl.getHighSpeedVideoSizes), org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoFpsRangesFor, chronoPeriodImpl.getHighSpeedVideoFpsRangesFor));
            }
        }
        throw new org.threeten.bp.DateTimeException("Unable to add amount: ".concat(java.lang.String.valueOf(temporalAmount)));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.chrono.ChronoPeriod minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        if (temporalAmount instanceof org.threeten.bp.chrono.ChronoPeriodImpl) {
            org.threeten.bp.chrono.ChronoPeriodImpl chronoPeriodImpl = (org.threeten.bp.chrono.ChronoPeriodImpl) temporalAmount;
            if (chronoPeriodImpl.getChronology().equals(getChronology())) {
                return new org.threeten.bp.chrono.ChronoPeriodImpl(this.getHighResolutionOutputSizeshNQ4ISI, org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(this.getHighSpeedVideoFpsRanges, chronoPeriodImpl.getHighSpeedVideoFpsRanges), org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(this.getHighSpeedVideoSizes, chronoPeriodImpl.getHighSpeedVideoSizes), org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(this.getHighSpeedVideoFpsRangesFor, chronoPeriodImpl.getHighSpeedVideoFpsRangesFor));
            }
        }
        throw new org.threeten.bp.DateTimeException("Unable to subtract amount: ".concat(java.lang.String.valueOf(temporalAmount)));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.chrono.ChronoPeriod multipliedBy(int i) {
        return new org.threeten.bp.chrono.ChronoPeriodImpl(this.getHighResolutionOutputSizeshNQ4ISI, org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoFpsRanges, i), org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoSizes, i), org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoFpsRangesFor, i));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.chrono.ChronoPeriod normalized() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.range(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).isFixed()) {
            return this;
        }
        long maximum = (this.getHighResolutionOutputSizeshNQ4ISI.range(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).getMaximum() - this.getHighResolutionOutputSizeshNQ4ISI.range(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).getMinimum()) + 1;
        long j = (this.getHighSpeedVideoFpsRanges * maximum) + this.getHighSpeedVideoSizes;
        return new org.threeten.bp.chrono.ChronoPeriodImpl(this.getHighResolutionOutputSizeshNQ4ISI, org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j / maximum), org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j % maximum), this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final org.threeten.bp.temporal.Temporal addTo(org.threeten.bp.temporal.Temporal temporal) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporal, "temporal");
        org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) temporal.query(org.threeten.bp.temporal.TemporalQueries.chronology());
        if (chronology != null && !this.getHighResolutionOutputSizeshNQ4ISI.equals(chronology)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid chronology, required: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getId());
            sb.append(", but was: ");
            sb.append(chronology.getId());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            temporal = temporal.plus(i, org.threeten.bp.temporal.ChronoUnit.YEARS);
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 != 0) {
            temporal = temporal.plus(i2, org.threeten.bp.temporal.ChronoUnit.MONTHS);
        }
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        return i3 != 0 ? temporal.plus(i3, org.threeten.bp.temporal.ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final org.threeten.bp.temporal.Temporal subtractFrom(org.threeten.bp.temporal.Temporal temporal) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporal, "temporal");
        org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) temporal.query(org.threeten.bp.temporal.TemporalQueries.chronology());
        if (chronology != null && !this.getHighResolutionOutputSizeshNQ4ISI.equals(chronology)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid chronology, required: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getId());
            sb.append(", but was: ");
            sb.append(chronology.getId());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            temporal = temporal.minus(i, org.threeten.bp.temporal.ChronoUnit.YEARS);
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 != 0) {
            temporal = temporal.minus(i2, org.threeten.bp.temporal.ChronoUnit.MONTHS);
        }
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        return i3 != 0 ? temporal.minus(i3, org.threeten.bp.temporal.ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.chrono.ChronoPeriodImpl)) {
            return false;
        }
        org.threeten.bp.chrono.ChronoPeriodImpl chronoPeriodImpl = (org.threeten.bp.chrono.ChronoPeriodImpl) obj;
        return this.getHighSpeedVideoFpsRanges == chronoPeriodImpl.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == chronoPeriodImpl.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == chronoPeriodImpl.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI.equals(chronoPeriodImpl.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode() + java.lang.Integer.rotateLeft(this.getHighSpeedVideoFpsRanges, 16) + java.lang.Integer.rotateLeft(this.getHighSpeedVideoSizes, 8) + this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final java.lang.String toString() {
        if (isZero()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" P0D");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb2.append(" P");
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            sb2.append(i);
            sb2.append(io.ktor.util.date.GMTDateParser.YEAR);
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 != 0) {
            sb2.append(i2);
            sb2.append(io.ktor.util.date.GMTDateParser.MONTH);
        }
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        if (i3 != 0) {
            sb2.append(i3);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
