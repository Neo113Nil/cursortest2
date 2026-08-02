package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public final class TemporalAdjusters {
    private TemporalAdjusters() {
    }

    public static org.threeten.bp.temporal.TemporalAdjuster firstDayOfMonth() {
        return org.threeten.bp.temporal.TemporalAdjusters.Impl.Camera2StreamConfigurationMap;
    }

    public static org.threeten.bp.temporal.TemporalAdjuster lastDayOfMonth() {
        return org.threeten.bp.temporal.TemporalAdjusters.Impl.getHighSpeedVideoFpsRangesFor;
    }

    public static org.threeten.bp.temporal.TemporalAdjuster firstDayOfNextMonth() {
        return org.threeten.bp.temporal.TemporalAdjusters.Impl.getHighSpeedVideoFpsRanges;
    }

    public static org.threeten.bp.temporal.TemporalAdjuster firstDayOfYear() {
        return org.threeten.bp.temporal.TemporalAdjusters.Impl.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.threeten.bp.temporal.TemporalAdjuster lastDayOfYear() {
        return org.threeten.bp.temporal.TemporalAdjusters.Impl.getHighSpeedVideoSizesFor;
    }

    public static org.threeten.bp.temporal.TemporalAdjuster firstDayOfNextYear() {
        return org.threeten.bp.temporal.TemporalAdjusters.Impl.getHighSpeedVideoSizes;
    }

    static class Impl implements org.threeten.bp.temporal.TemporalAdjuster {
        private final int getOutputFormats;
        private static final org.threeten.bp.temporal.TemporalAdjusters.Impl Camera2StreamConfigurationMap = new org.threeten.bp.temporal.TemporalAdjusters.Impl(0);
        private static final org.threeten.bp.temporal.TemporalAdjusters.Impl getHighSpeedVideoFpsRangesFor = new org.threeten.bp.temporal.TemporalAdjusters.Impl(1);
        private static final org.threeten.bp.temporal.TemporalAdjusters.Impl getHighSpeedVideoFpsRanges = new org.threeten.bp.temporal.TemporalAdjusters.Impl(2);
        private static final org.threeten.bp.temporal.TemporalAdjusters.Impl getHighResolutionOutputSizeshNQ4ISI = new org.threeten.bp.temporal.TemporalAdjusters.Impl(3);
        private static final org.threeten.bp.temporal.TemporalAdjusters.Impl getHighSpeedVideoSizesFor = new org.threeten.bp.temporal.TemporalAdjusters.Impl(4);
        private static final org.threeten.bp.temporal.TemporalAdjusters.Impl getHighSpeedVideoSizes = new org.threeten.bp.temporal.TemporalAdjusters.Impl(5);

        private Impl(int i) {
            this.getOutputFormats = i;
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
            int i = this.getOutputFormats;
            if (i == 0) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 1L);
            }
            if (i == 1) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, temporal.range(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).getMaximum());
            }
            if (i == 2) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 1L).plus(1L, org.threeten.bp.temporal.ChronoUnit.MONTHS);
            }
            if (i == 3) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR, 1L);
            }
            if (i == 4) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR, temporal.range(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).getMaximum());
            }
            if (i == 5) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR, 1L).plus(1L, org.threeten.bp.temporal.ChronoUnit.YEARS);
            }
            throw new java.lang.IllegalStateException("Unreachable");
        }
    }

    public static org.threeten.bp.temporal.TemporalAdjuster firstInMonth(org.threeten.bp.DayOfWeek dayOfWeek) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new org.threeten.bp.temporal.TemporalAdjusters.DayOfWeekInMonth(1, dayOfWeek, (byte) 0);
    }

    public static org.threeten.bp.temporal.TemporalAdjuster lastInMonth(org.threeten.bp.DayOfWeek dayOfWeek) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new org.threeten.bp.temporal.TemporalAdjusters.DayOfWeekInMonth(-1, dayOfWeek, (byte) 0);
    }

    public static org.threeten.bp.temporal.TemporalAdjuster dayOfWeekInMonth(int i, org.threeten.bp.DayOfWeek dayOfWeek) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new org.threeten.bp.temporal.TemporalAdjusters.DayOfWeekInMonth(i, dayOfWeek, (byte) 0);
    }

    static final class DayOfWeekInMonth implements org.threeten.bp.temporal.TemporalAdjuster {
        private final int Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* synthetic */ DayOfWeekInMonth(int i, org.threeten.bp.DayOfWeek dayOfWeek, byte b) {
            this(i, dayOfWeek);
        }

        private DayOfWeekInMonth(int i, org.threeten.bp.DayOfWeek dayOfWeek) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = dayOfWeek.getValue();
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
            if (this.Camera2StreamConfigurationMap >= 0) {
                return temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 1L).plus((((this.getHighResolutionOutputSizeshNQ4ISI - r10.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) + 7) % 7) + ((this.Camera2StreamConfigurationMap - 1) * 7), org.threeten.bp.temporal.ChronoUnit.DAYS);
            }
            org.threeten.bp.temporal.Temporal with = temporal.with(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, temporal.range(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).getMaximum());
            long j = this.getHighResolutionOutputSizeshNQ4ISI - with.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
            if (j == 0) {
                j = 0;
            } else if (j > 0) {
                j -= 7;
            }
            return with.plus(j - (((-this.Camera2StreamConfigurationMap) - 1) * 7), org.threeten.bp.temporal.ChronoUnit.DAYS);
        }
    }

    public static org.threeten.bp.temporal.TemporalAdjuster next(org.threeten.bp.DayOfWeek dayOfWeek) {
        return new org.threeten.bp.temporal.TemporalAdjusters.RelativeDayOfWeek(2, dayOfWeek, (byte) 0);
    }

    public static org.threeten.bp.temporal.TemporalAdjuster nextOrSame(org.threeten.bp.DayOfWeek dayOfWeek) {
        byte b = 0;
        return new org.threeten.bp.temporal.TemporalAdjusters.RelativeDayOfWeek(b, dayOfWeek, b);
    }

    public static org.threeten.bp.temporal.TemporalAdjuster previous(org.threeten.bp.DayOfWeek dayOfWeek) {
        return new org.threeten.bp.temporal.TemporalAdjusters.RelativeDayOfWeek(3, dayOfWeek, (byte) 0);
    }

    public static org.threeten.bp.temporal.TemporalAdjuster previousOrSame(org.threeten.bp.DayOfWeek dayOfWeek) {
        return new org.threeten.bp.temporal.TemporalAdjusters.RelativeDayOfWeek(1, dayOfWeek, (byte) 0);
    }

    static final class RelativeDayOfWeek implements org.threeten.bp.temporal.TemporalAdjuster {
        private final int Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* synthetic */ RelativeDayOfWeek(int i, org.threeten.bp.DayOfWeek dayOfWeek, byte b) {
            this(i, dayOfWeek);
        }

        private RelativeDayOfWeek(int i, org.threeten.bp.DayOfWeek dayOfWeek) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = dayOfWeek.getValue();
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
            int i = temporal.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 < 2 && i == this.getHighResolutionOutputSizeshNQ4ISI) {
                return temporal;
            }
            if ((i2 & 1) == 0) {
                return temporal.plus(i - this.getHighResolutionOutputSizeshNQ4ISI >= 0 ? 7 - r0 : -r0, org.threeten.bp.temporal.ChronoUnit.DAYS);
            }
            return temporal.minus(this.getHighResolutionOutputSizeshNQ4ISI - i >= 0 ? 7 - r1 : -r1, org.threeten.bp.temporal.ChronoUnit.DAYS);
        }
    }
}
