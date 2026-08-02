package org.threeten.bp.zone;

/* loaded from: classes18.dex */
class ZoneRulesBuilder {
    private java.util.List<org.threeten.bp.zone.ZoneRulesBuilder.TZWindow> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    class TZWindow {
    }

    class TZRule implements java.lang.Comparable<org.threeten.bp.zone.ZoneRulesBuilder.TZRule> {
        private org.threeten.bp.LocalTime Camera2StreamConfigurationMap;
        private org.threeten.bp.Month getHighResolutionOutputSizeshNQ4ISI;
        private org.threeten.bp.DayOfWeek getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getOutputFormats;

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(org.threeten.bp.zone.ZoneRulesBuilder.TZRule tZRule) {
            org.threeten.bp.zone.ZoneRulesBuilder.TZRule tZRule2 = tZRule;
            int i = this.getOutputFormats - tZRule2.getOutputFormats;
            if (i == 0) {
                i = this.getHighResolutionOutputSizeshNQ4ISI.compareTo(tZRule2.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 0) {
                i = getHighSpeedVideoSizes().compareTo((org.threeten.bp.chrono.ChronoLocalDate) tZRule2.getHighSpeedVideoSizes());
            }
            if (i != 0) {
                return i;
            }
            long secondOfDay = this.Camera2StreamConfigurationMap.toSecondOfDay() + (this.getHighSpeedVideoFpsRangesFor * kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY);
            long secondOfDay2 = tZRule2.Camera2StreamConfigurationMap.toSecondOfDay() + (tZRule2.getHighSpeedVideoFpsRangesFor * kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY);
            if (secondOfDay < secondOfDay2) {
                return -1;
            }
            return secondOfDay > secondOfDay2 ? 1 : 0;
        }

        private org.threeten.bp.LocalDate getHighSpeedVideoSizes() {
            int i = this.getHighSpeedVideoSizes;
            if (i < 0) {
                org.threeten.bp.LocalDate of = org.threeten.bp.LocalDate.of(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI.length(org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(this.getOutputFormats)) + 1 + this.getHighSpeedVideoSizes);
                org.threeten.bp.DayOfWeek dayOfWeek = this.getHighSpeedVideoFpsRanges;
                return dayOfWeek != null ? of.with(org.threeten.bp.temporal.TemporalAdjusters.previousOrSame(dayOfWeek)) : of;
            }
            org.threeten.bp.LocalDate of2 = org.threeten.bp.LocalDate.of(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, i);
            org.threeten.bp.DayOfWeek dayOfWeek2 = this.getHighSpeedVideoFpsRanges;
            return dayOfWeek2 != null ? of2.with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(dayOfWeek2)) : of2;
        }
    }
}
