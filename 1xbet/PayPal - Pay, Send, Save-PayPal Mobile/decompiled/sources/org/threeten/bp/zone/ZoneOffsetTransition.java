package org.threeten.bp.zone;

/* loaded from: classes18.dex */
public final class ZoneOffsetTransition implements java.lang.Comparable<org.threeten.bp.zone.ZoneOffsetTransition>, java.io.Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    final org.threeten.bp.ZoneOffset Camera2StreamConfigurationMap;
    private final org.threeten.bp.LocalDateTime getHighResolutionOutputSizeshNQ4ISI;
    final org.threeten.bp.ZoneOffset getHighSpeedVideoFpsRanges;

    public static org.threeten.bp.zone.ZoneOffsetTransition of(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDateTime, "transition");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offsetBefore");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset2, "offsetAfter");
        if (zoneOffset.equals(zoneOffset2)) {
            throw new java.lang.IllegalArgumentException("Offsets must not be equal");
        }
        if (localDateTime.getNano() != 0) {
            throw new java.lang.IllegalArgumentException("Nano-of-second must be zero");
        }
        return new org.threeten.bp.zone.ZoneOffsetTransition(localDateTime, zoneOffset, zoneOffset2);
    }

    ZoneOffsetTransition(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2) {
        this.getHighResolutionOutputSizeshNQ4ISI = localDateTime;
        this.Camera2StreamConfigurationMap = zoneOffset;
        this.getHighSpeedVideoFpsRanges = zoneOffset2;
    }

    ZoneOffsetTransition(long j, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.threeten.bp.LocalDateTime.ofEpochSecond(j, 0, zoneOffset);
        this.Camera2StreamConfigurationMap = zoneOffset;
        this.getHighSpeedVideoFpsRanges = zoneOffset2;
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.zone.Ser((byte) 2, this);
    }

    static org.threeten.bp.zone.ZoneOffsetTransition getHighResolutionOutputSizeshNQ4ISI(java.io.DataInput dataInput) throws java.io.IOException {
        long highResolutionOutputSizeshNQ4ISI = org.threeten.bp.zone.Ser.getHighResolutionOutputSizeshNQ4ISI(dataInput);
        org.threeten.bp.ZoneOffset highSpeedVideoFpsRangesFor = org.threeten.bp.zone.Ser.getHighSpeedVideoFpsRangesFor(dataInput);
        org.threeten.bp.ZoneOffset highSpeedVideoFpsRangesFor2 = org.threeten.bp.zone.Ser.getHighSpeedVideoFpsRangesFor(dataInput);
        if (highSpeedVideoFpsRangesFor.equals(highSpeedVideoFpsRangesFor2)) {
            throw new java.lang.IllegalArgumentException("Offsets must not be equal");
        }
        return new org.threeten.bp.zone.ZoneOffsetTransition(highResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2);
    }

    public final org.threeten.bp.Instant getInstant() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toInstant(this.Camera2StreamConfigurationMap);
    }

    public final long toEpochSecond() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toEpochSecond(this.Camera2StreamConfigurationMap);
    }

    public final org.threeten.bp.LocalDateTime getDateTimeBefore() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final org.threeten.bp.LocalDateTime getDateTimeAfter() {
        return this.getHighResolutionOutputSizeshNQ4ISI.plusSeconds(getOffsetAfter().getTotalSeconds() - getOffsetBefore().getTotalSeconds());
    }

    public final org.threeten.bp.ZoneOffset getOffsetBefore() {
        return this.Camera2StreamConfigurationMap;
    }

    public final org.threeten.bp.ZoneOffset getOffsetAfter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isGap() {
        return getOffsetAfter().getTotalSeconds() > getOffsetBefore().getTotalSeconds();
    }

    public final boolean isOverlap() {
        return getOffsetAfter().getTotalSeconds() < getOffsetBefore().getTotalSeconds();
    }

    public final boolean isValidOffset(org.threeten.bp.ZoneOffset zoneOffset) {
        if (isGap()) {
            return false;
        }
        return getOffsetBefore().equals(zoneOffset) || getOffsetAfter().equals(zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition) {
        return getInstant().compareTo(zoneOffsetTransition.getInstant());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.zone.ZoneOffsetTransition)) {
            return false;
        }
        org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition = (org.threeten.bp.zone.ZoneOffsetTransition) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(zoneOffsetTransition.getHighResolutionOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap.equals(zoneOffsetTransition.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRanges.equals(zoneOffsetTransition.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ this.Camera2StreamConfigurationMap.hashCode()) ^ java.lang.Integer.rotateLeft(this.getHighSpeedVideoFpsRanges.hashCode(), 16);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transition[");
        sb.append(isGap() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" to ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final org.threeten.bp.Duration getDuration() {
        return org.threeten.bp.Duration.ofSeconds(getOffsetAfter().getTotalSeconds() - getOffsetBefore().getTotalSeconds());
    }
}
