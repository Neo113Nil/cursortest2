package org.threeten.bp;

/* loaded from: classes18.dex */
public abstract class Clock {
    public abstract org.threeten.bp.ZoneId getZone();

    public abstract org.threeten.bp.Instant instant();

    public abstract org.threeten.bp.Clock withZone(org.threeten.bp.ZoneId zoneId);

    public static org.threeten.bp.Clock systemUTC() {
        return new org.threeten.bp.Clock.SystemClock(org.threeten.bp.ZoneOffset.UTC);
    }

    public static org.threeten.bp.Clock systemDefaultZone() {
        return new org.threeten.bp.Clock.SystemClock(org.threeten.bp.ZoneId.systemDefault());
    }

    public static org.threeten.bp.Clock system(org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return new org.threeten.bp.Clock.SystemClock(zoneId);
    }

    public static org.threeten.bp.Clock tickSeconds(org.threeten.bp.ZoneId zoneId) {
        return new org.threeten.bp.Clock.TickClock(system(zoneId), 1000000000L);
    }

    public static org.threeten.bp.Clock tickMinutes(org.threeten.bp.ZoneId zoneId) {
        return new org.threeten.bp.Clock.TickClock(system(zoneId), kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE);
    }

    public static org.threeten.bp.Clock tick(org.threeten.bp.Clock clock, org.threeten.bp.Duration duration) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "baseClock");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(duration, "tickDuration");
        if (duration.isNegative()) {
            throw new java.lang.IllegalArgumentException("Tick duration must not be negative");
        }
        long nanos = duration.toNanos();
        if (nanos % 1000000 == 0 || 1000000000 % nanos == 0) {
            return nanos <= 1 ? clock : new org.threeten.bp.Clock.TickClock(clock, nanos);
        }
        throw new java.lang.IllegalArgumentException("Invalid tick duration");
    }

    public static org.threeten.bp.Clock fixed(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(instant, "fixedInstant");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return new org.threeten.bp.Clock.FixedClock(instant, zoneId);
    }

    public static org.threeten.bp.Clock offset(org.threeten.bp.Clock clock, org.threeten.bp.Duration duration) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "baseClock");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(duration, "offsetDuration");
        return duration.equals(org.threeten.bp.Duration.ZERO) ? clock : new org.threeten.bp.Clock.OffsetClock(clock, duration);
    }

    protected Clock() {
    }

    public long millis() {
        return instant().toEpochMilli();
    }

    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    static final class SystemClock extends org.threeten.bp.Clock implements java.io.Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final org.threeten.bp.ZoneId getHighSpeedVideoSizes;

        SystemClock(org.threeten.bp.ZoneId zoneId) {
            this.getHighSpeedVideoSizes = zoneId;
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.ZoneId getZone() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Clock withZone(org.threeten.bp.ZoneId zoneId) {
            return zoneId.equals(this.getHighSpeedVideoSizes) ? this : new org.threeten.bp.Clock.SystemClock(zoneId);
        }

        @Override // org.threeten.bp.Clock
        public final long millis() {
            return java.lang.System.currentTimeMillis();
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Instant instant() {
            return org.threeten.bp.Instant.ofEpochMilli(millis());
        }

        @Override // org.threeten.bp.Clock
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof org.threeten.bp.Clock.SystemClock) {
                return this.getHighSpeedVideoSizes.equals(((org.threeten.bp.Clock.SystemClock) obj).getHighSpeedVideoSizes);
            }
            return false;
        }

        @Override // org.threeten.bp.Clock
        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode() + 1;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemClock[");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class FixedClock extends org.threeten.bp.Clock implements java.io.Serializable {
        private static final long serialVersionUID = 7430389292664866958L;
        private final org.threeten.bp.Instant getHighSpeedVideoFpsRanges;
        private final org.threeten.bp.ZoneId getHighSpeedVideoSizes;

        FixedClock(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
            this.getHighSpeedVideoFpsRanges = instant;
            this.getHighSpeedVideoSizes = zoneId;
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.ZoneId getZone() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Clock withZone(org.threeten.bp.ZoneId zoneId) {
            return zoneId.equals(this.getHighSpeedVideoSizes) ? this : new org.threeten.bp.Clock.FixedClock(this.getHighSpeedVideoFpsRanges, zoneId);
        }

        @Override // org.threeten.bp.Clock
        public final long millis() {
            return this.getHighSpeedVideoFpsRanges.toEpochMilli();
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Instant instant() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // org.threeten.bp.Clock
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof org.threeten.bp.Clock.FixedClock)) {
                return false;
            }
            org.threeten.bp.Clock.FixedClock fixedClock = (org.threeten.bp.Clock.FixedClock) obj;
            return this.getHighSpeedVideoFpsRanges.equals(fixedClock.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes.equals(fixedClock.getHighSpeedVideoSizes);
        }

        @Override // org.threeten.bp.Clock
        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode() ^ this.getHighSpeedVideoSizes.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FixedClock[");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(",");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class OffsetClock extends org.threeten.bp.Clock implements java.io.Serializable {
        private static final long serialVersionUID = 2007484719125426256L;
        private final org.threeten.bp.Clock Camera2StreamConfigurationMap;
        private final org.threeten.bp.Duration getHighResolutionOutputSizeshNQ4ISI;

        OffsetClock(org.threeten.bp.Clock clock, org.threeten.bp.Duration duration) {
            this.Camera2StreamConfigurationMap = clock;
            this.getHighResolutionOutputSizeshNQ4ISI = duration;
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.ZoneId getZone() {
            return this.Camera2StreamConfigurationMap.getZone();
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Clock withZone(org.threeten.bp.ZoneId zoneId) {
            return zoneId.equals(this.Camera2StreamConfigurationMap.getZone()) ? this : new org.threeten.bp.Clock.OffsetClock(this.Camera2StreamConfigurationMap.withZone(zoneId), this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.threeten.bp.Clock
        public final long millis() {
            return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.Camera2StreamConfigurationMap.millis(), this.getHighResolutionOutputSizeshNQ4ISI.toMillis());
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Instant instant() {
            return this.Camera2StreamConfigurationMap.instant().plus((org.threeten.bp.temporal.TemporalAmount) this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.threeten.bp.Clock
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof org.threeten.bp.Clock.OffsetClock)) {
                return false;
            }
            org.threeten.bp.Clock.OffsetClock offsetClock = (org.threeten.bp.Clock.OffsetClock) obj;
            return this.Camera2StreamConfigurationMap.equals(offsetClock.Camera2StreamConfigurationMap) && this.getHighResolutionOutputSizeshNQ4ISI.equals(offsetClock.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.threeten.bp.Clock
        public final int hashCode() {
            return this.Camera2StreamConfigurationMap.hashCode() ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OffsetClock[");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(",");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class TickClock extends org.threeten.bp.Clock implements java.io.Serializable {
        private static final long serialVersionUID = 6504659149906368850L;
        private final org.threeten.bp.Clock getHighSpeedVideoFpsRanges;
        private final long getHighSpeedVideoSizes;

        TickClock(org.threeten.bp.Clock clock, long j) {
            this.getHighSpeedVideoFpsRanges = clock;
            this.getHighSpeedVideoSizes = j;
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.ZoneId getZone() {
            return this.getHighSpeedVideoFpsRanges.getZone();
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Clock withZone(org.threeten.bp.ZoneId zoneId) {
            return zoneId.equals(this.getHighSpeedVideoFpsRanges.getZone()) ? this : new org.threeten.bp.Clock.TickClock(this.getHighSpeedVideoFpsRanges.withZone(zoneId), this.getHighSpeedVideoSizes);
        }

        @Override // org.threeten.bp.Clock
        public final long millis() {
            long millis = this.getHighSpeedVideoFpsRanges.millis();
            return millis - org.threeten.bp.jdk8.Jdk8Methods.floorMod(millis, this.getHighSpeedVideoSizes / 1000000);
        }

        @Override // org.threeten.bp.Clock
        public final org.threeten.bp.Instant instant() {
            if (this.getHighSpeedVideoSizes % 1000000 == 0) {
                long millis = this.getHighSpeedVideoFpsRanges.millis();
                return org.threeten.bp.Instant.ofEpochMilli(millis - org.threeten.bp.jdk8.Jdk8Methods.floorMod(millis, this.getHighSpeedVideoSizes / 1000000));
            }
            return this.getHighSpeedVideoFpsRanges.instant().minusNanos(org.threeten.bp.jdk8.Jdk8Methods.floorMod(r0.getNano(), this.getHighSpeedVideoSizes));
        }

        @Override // org.threeten.bp.Clock
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof org.threeten.bp.Clock.TickClock)) {
                return false;
            }
            org.threeten.bp.Clock.TickClock tickClock = (org.threeten.bp.Clock.TickClock) obj;
            return this.getHighSpeedVideoFpsRanges.equals(tickClock.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes == tickClock.getHighSpeedVideoSizes;
        }

        @Override // org.threeten.bp.Clock
        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
            long j = this.getHighSpeedVideoSizes;
            return hashCode ^ ((int) (j ^ (j >>> 32)));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TickClock[");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(",");
            sb.append(org.threeten.bp.Duration.ofNanos(this.getHighSpeedVideoSizes));
            sb.append("]");
            return sb.toString();
        }
    }
}
