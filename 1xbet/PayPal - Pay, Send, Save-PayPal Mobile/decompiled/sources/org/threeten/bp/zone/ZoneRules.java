package org.threeten.bp.zone;

/* loaded from: classes18.dex */
public abstract class ZoneRules {
    public abstract boolean equals(java.lang.Object obj);

    public abstract org.threeten.bp.Duration getDaylightSavings(org.threeten.bp.Instant instant);

    public abstract org.threeten.bp.ZoneOffset getOffset(org.threeten.bp.Instant instant);

    public abstract org.threeten.bp.ZoneOffset getOffset(org.threeten.bp.LocalDateTime localDateTime);

    public abstract org.threeten.bp.ZoneOffset getStandardOffset(org.threeten.bp.Instant instant);

    public abstract org.threeten.bp.zone.ZoneOffsetTransition getTransition(org.threeten.bp.LocalDateTime localDateTime);

    public abstract java.util.List<org.threeten.bp.zone.ZoneOffsetTransitionRule> getTransitionRules();

    public abstract java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> getTransitions();

    public abstract java.util.List<org.threeten.bp.ZoneOffset> getValidOffsets(org.threeten.bp.LocalDateTime localDateTime);

    public abstract int hashCode();

    public abstract boolean isDaylightSavings(org.threeten.bp.Instant instant);

    public abstract boolean isFixedOffset();

    public abstract boolean isValidOffset(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset);

    public abstract org.threeten.bp.zone.ZoneOffsetTransition nextTransition(org.threeten.bp.Instant instant);

    public abstract org.threeten.bp.zone.ZoneOffsetTransition previousTransition(org.threeten.bp.Instant instant);

    public static org.threeten.bp.zone.ZoneRules of(org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2, java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> list, java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> list2, java.util.List<org.threeten.bp.zone.ZoneOffsetTransitionRule> list3) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "baseStandardOffset");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset2, "baseWallOffset");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(list, "standardOffsetTransitionList");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(list2, "transitionList");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(list3, "lastRules");
        return new org.threeten.bp.zone.StandardZoneRules(zoneOffset, zoneOffset2, list, list2, list3);
    }

    public static org.threeten.bp.zone.ZoneRules of(org.threeten.bp.ZoneOffset zoneOffset) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        return new org.threeten.bp.zone.ZoneRules.Fixed(zoneOffset);
    }

    ZoneRules() {
    }

    static final class Fixed extends org.threeten.bp.zone.ZoneRules implements java.io.Serializable {
        private static final long serialVersionUID = -8733721350312276297L;
        private final org.threeten.bp.ZoneOffset getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.zone.ZoneOffsetTransition getTransition(org.threeten.bp.LocalDateTime localDateTime) {
            return null;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final boolean isDaylightSavings(org.threeten.bp.Instant instant) {
            return false;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final boolean isFixedOffset() {
            return true;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.zone.ZoneOffsetTransition nextTransition(org.threeten.bp.Instant instant) {
            return null;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.zone.ZoneOffsetTransition previousTransition(org.threeten.bp.Instant instant) {
            return null;
        }

        Fixed(org.threeten.bp.ZoneOffset zoneOffset) {
            this.getHighResolutionOutputSizeshNQ4ISI = zoneOffset;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.ZoneOffset getOffset(org.threeten.bp.Instant instant) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.ZoneOffset getOffset(org.threeten.bp.LocalDateTime localDateTime) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final java.util.List<org.threeten.bp.ZoneOffset> getValidOffsets(org.threeten.bp.LocalDateTime localDateTime) {
            return java.util.Collections.singletonList(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final boolean isValidOffset(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(zoneOffset);
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.ZoneOffset getStandardOffset(org.threeten.bp.Instant instant) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final org.threeten.bp.Duration getDaylightSavings(org.threeten.bp.Instant instant) {
            return org.threeten.bp.Duration.ZERO;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> getTransitions() {
            return java.util.Collections.emptyList();
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final java.util.List<org.threeten.bp.zone.ZoneOffsetTransitionRule> getTransitionRules() {
            return java.util.Collections.emptyList();
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof org.threeten.bp.zone.ZoneRules.Fixed) {
                return this.getHighResolutionOutputSizeshNQ4ISI.equals(((org.threeten.bp.zone.ZoneRules.Fixed) obj).getHighResolutionOutputSizeshNQ4ISI);
            }
            if (!(obj instanceof org.threeten.bp.zone.StandardZoneRules)) {
                return false;
            }
            org.threeten.bp.zone.StandardZoneRules standardZoneRules = (org.threeten.bp.zone.StandardZoneRules) obj;
            return standardZoneRules.isFixedOffset() && this.getHighResolutionOutputSizeshNQ4ISI.equals(standardZoneRules.getOffset(org.threeten.bp.Instant.EPOCH));
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public final int hashCode() {
            return ((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() + 31) ^ (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() + 31)) ^ 1;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FixedRules:");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            return sb.toString();
        }
    }
}
