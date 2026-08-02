package org.threeten.bp.zone;

/* loaded from: classes18.dex */
public final class ZoneOffsetTransitionRule implements java.io.Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final byte Camera2StreamConfigurationMap;
    private final org.threeten.bp.DayOfWeek getHighResolutionOutputSizeshNQ4ISI;
    private final org.threeten.bp.Month getHighSpeedVideoFpsRanges;
    private final org.threeten.bp.ZoneOffset getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final org.threeten.bp.LocalTime getHighSpeedVideoSizesFor;
    private final org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition getInputSizeshNQ4ISI;
    private final org.threeten.bp.ZoneOffset getOutputFormats;
    private final org.threeten.bp.ZoneOffset getOutputMinFrameDuration;

    public static org.threeten.bp.zone.ZoneOffsetTransitionRule of(org.threeten.bp.Month month, int i, org.threeten.bp.DayOfWeek dayOfWeek, org.threeten.bp.LocalTime localTime, boolean z, org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2, org.threeten.bp.ZoneOffset zoneOffset3) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(month, "month");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localTime, "time");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(timeDefinition, "timeDefnition");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "standardOffset");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset2, "offsetBefore");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new java.lang.IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTime.equals(org.threeten.bp.LocalTime.MIDNIGHT)) {
            throw new java.lang.IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        return new org.threeten.bp.zone.ZoneOffsetTransitionRule(month, i, dayOfWeek, localTime, z ? 1 : 0, timeDefinition, zoneOffset, zoneOffset2, zoneOffset3);
    }

    private ZoneOffsetTransitionRule(org.threeten.bp.Month month, int i, org.threeten.bp.DayOfWeek dayOfWeek, org.threeten.bp.LocalTime localTime, int i2, org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2, org.threeten.bp.ZoneOffset zoneOffset3) {
        this.getHighSpeedVideoFpsRanges = month;
        this.Camera2StreamConfigurationMap = (byte) i;
        this.getHighResolutionOutputSizeshNQ4ISI = dayOfWeek;
        this.getHighSpeedVideoSizesFor = localTime;
        this.getHighSpeedVideoSizes = i2;
        this.getInputSizeshNQ4ISI = timeDefinition;
        this.getOutputMinFrameDuration = zoneOffset;
        this.getOutputFormats = zoneOffset2;
        this.getHighSpeedVideoFpsRangesFor = zoneOffset3;
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.zone.Ser((byte) 3, this);
    }

    final void getHighSpeedVideoFpsRanges(java.io.DataOutput dataOutput) throws java.io.IOException {
        int i;
        int secondOfDay = this.getHighSpeedVideoSizesFor.toSecondOfDay() + (this.getHighSpeedVideoSizes * kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY);
        int totalSeconds = this.getOutputMinFrameDuration.getTotalSeconds();
        int totalSeconds2 = this.getOutputFormats.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.getHighSpeedVideoFpsRangesFor.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 != 0 || secondOfDay > 86400) {
            i = 31;
        } else {
            i = secondOfDay == 86400 ? 24 : this.getHighSpeedVideoSizesFor.getHour();
        }
        int i2 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i3 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i4 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        org.threeten.bp.DayOfWeek dayOfWeek = this.getHighResolutionOutputSizeshNQ4ISI;
        dataOutput.writeInt((this.getHighSpeedVideoFpsRanges.getValue() << 28) + ((this.Camera2StreamConfigurationMap + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (i << 14) + (this.getInputSizeshNQ4ISI.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (i == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i2 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.getOutputFormats.getTotalSeconds());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.getHighSpeedVideoFpsRangesFor.getTotalSeconds());
        }
    }

    static org.threeten.bp.zone.ZoneOffsetTransitionRule getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        int readInt = dataInput.readInt();
        org.threeten.bp.Month of = org.threeten.bp.Month.of(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        org.threeten.bp.DayOfWeek of2 = i2 == 0 ? null : org.threeten.bp.DayOfWeek.of(i2);
        int i3 = (507904 & readInt) >>> 14;
        org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition = org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        int readInt2 = i3 == 31 ? dataInput.readInt() : i3 * 3600;
        org.threeten.bp.ZoneOffset ofTotalSeconds = org.threeten.bp.ZoneOffset.ofTotalSeconds(i4 == 255 ? dataInput.readInt() : (i4 + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * 900);
        org.threeten.bp.ZoneOffset ofTotalSeconds2 = org.threeten.bp.ZoneOffset.ofTotalSeconds(i5 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i5 * 1800));
        org.threeten.bp.ZoneOffset ofTotalSeconds3 = org.threeten.bp.ZoneOffset.ofTotalSeconds(i6 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i6 * 1800));
        if (i < -28 || i > 31 || i == 0) {
            throw new java.lang.IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new org.threeten.bp.zone.ZoneOffsetTransitionRule(of, i, of2, org.threeten.bp.LocalTime.ofSecondOfDay(org.threeten.bp.jdk8.Jdk8Methods.floorMod(readInt2, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY)), org.threeten.bp.jdk8.Jdk8Methods.floorDiv(readInt2, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY), timeDefinition, ofTotalSeconds, ofTotalSeconds2, ofTotalSeconds3);
    }

    public final org.threeten.bp.Month getMonth() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getDayOfMonthIndicator() {
        return this.Camera2StreamConfigurationMap;
    }

    public final org.threeten.bp.DayOfWeek getDayOfWeek() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final org.threeten.bp.LocalTime getLocalTime() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final boolean isMidnightEndOfDay() {
        return this.getHighSpeedVideoSizes == 1 && this.getHighSpeedVideoSizesFor.equals(org.threeten.bp.LocalTime.MIDNIGHT);
    }

    public final org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition getTimeDefinition() {
        return this.getInputSizeshNQ4ISI;
    }

    public final org.threeten.bp.ZoneOffset getStandardOffset() {
        return this.getOutputMinFrameDuration;
    }

    public final org.threeten.bp.ZoneOffset getOffsetBefore() {
        return this.getOutputFormats;
    }

    public final org.threeten.bp.ZoneOffset getOffsetAfter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final org.threeten.bp.zone.ZoneOffsetTransition createTransition(int i) {
        org.threeten.bp.LocalDate of;
        byte b = this.Camera2StreamConfigurationMap;
        if (b < 0) {
            org.threeten.bp.Month month = this.getHighSpeedVideoFpsRanges;
            of = org.threeten.bp.LocalDate.of(i, month, month.length(org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(i)) + 1 + this.Camera2StreamConfigurationMap);
            org.threeten.bp.DayOfWeek dayOfWeek = this.getHighResolutionOutputSizeshNQ4ISI;
            if (dayOfWeek != null) {
                of = of.with(org.threeten.bp.temporal.TemporalAdjusters.previousOrSame(dayOfWeek));
            }
        } else {
            of = org.threeten.bp.LocalDate.of(i, this.getHighSpeedVideoFpsRanges, b);
            org.threeten.bp.DayOfWeek dayOfWeek2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (dayOfWeek2 != null) {
                of = of.with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(dayOfWeek2));
            }
        }
        return new org.threeten.bp.zone.ZoneOffsetTransition(this.getInputSizeshNQ4ISI.createDateTime(org.threeten.bp.LocalDateTime.of(of.plusDays(this.getHighSpeedVideoSizes), this.getHighSpeedVideoSizesFor), this.getOutputMinFrameDuration, this.getOutputFormats), this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.zone.ZoneOffsetTransitionRule)) {
            return false;
        }
        org.threeten.bp.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule = (org.threeten.bp.zone.ZoneOffsetTransitionRule) obj;
        return this.getHighSpeedVideoFpsRanges == zoneOffsetTransitionRule.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == zoneOffsetTransitionRule.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == zoneOffsetTransitionRule.getHighResolutionOutputSizeshNQ4ISI && this.getInputSizeshNQ4ISI == zoneOffsetTransitionRule.getInputSizeshNQ4ISI && this.getHighSpeedVideoSizes == zoneOffsetTransitionRule.getHighSpeedVideoSizes && this.getHighSpeedVideoSizesFor.equals(zoneOffsetTransitionRule.getHighSpeedVideoSizesFor) && this.getOutputMinFrameDuration.equals(zoneOffsetTransitionRule.getOutputMinFrameDuration) && this.getOutputFormats.equals(zoneOffsetTransitionRule.getOutputFormats) && this.getHighSpeedVideoFpsRangesFor.equals(zoneOffsetTransitionRule.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        int secondOfDay = this.getHighSpeedVideoSizesFor.toSecondOfDay();
        int i = this.getHighSpeedVideoSizes;
        int ordinal = this.getHighSpeedVideoFpsRanges.ordinal();
        byte b = this.Camera2StreamConfigurationMap;
        org.threeten.bp.DayOfWeek dayOfWeek = this.getHighResolutionOutputSizeshNQ4ISI;
        int ordinal2 = dayOfWeek == null ? 7 : dayOfWeek.ordinal();
        return ((((((((secondOfDay + i) << 15) + (ordinal << 11)) + ((b + 32) << 5)) + (ordinal2 << 2)) + this.getInputSizeshNQ4ISI.ordinal()) ^ this.getOutputMinFrameDuration.hashCode()) ^ this.getOutputFormats.hashCode()) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.getOutputFormats.compareTo(this.getHighSpeedVideoFpsRangesFor) > 0 ? "Gap " : "Overlap ");
        sb.append(this.getOutputFormats);
        sb.append(" to ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", ");
        org.threeten.bp.DayOfWeek dayOfWeek = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dayOfWeek != null) {
            byte b = this.Camera2StreamConfigurationMap;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.getHighSpeedVideoFpsRanges.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.Camera2StreamConfigurationMap) - 1);
                sb.append(" of ");
                sb.append(this.getHighSpeedVideoFpsRanges.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.getHighSpeedVideoFpsRanges.name());
                sb.append(' ');
                sb.append((int) this.Camera2StreamConfigurationMap);
            }
        } else {
            sb.append(this.getHighSpeedVideoFpsRanges.name());
            sb.append(' ');
            sb.append((int) this.Camera2StreamConfigurationMap);
        }
        sb.append(" at ");
        if (this.getHighSpeedVideoSizes == 0) {
            sb.append(this.getHighSpeedVideoSizesFor);
        } else {
            long secondOfDay = (this.getHighSpeedVideoSizesFor.toSecondOfDay() / 60) + (this.getHighSpeedVideoSizes * com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH);
            long floorDiv = org.threeten.bp.jdk8.Jdk8Methods.floorDiv(secondOfDay, 60L);
            if (floorDiv < 10) {
                sb.append(0);
            }
            sb.append(floorDiv);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            long floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(secondOfDay, 60);
            if (floorMod < 10) {
                sb.append(0);
            }
            sb.append(floorMod);
        }
        sb.append(" ");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", standard offset ");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    /* renamed from: org.threeten.bp.zone.ZoneOffsetTransitionRule$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public final org.threeten.bp.LocalDateTime createDateTime(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2) {
            int i = org.threeten.bp.zone.ZoneOffsetTransitionRule.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[ordinal()];
            if (i != 1) {
                return i != 2 ? localDateTime : localDateTime.plusSeconds(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            return localDateTime.plusSeconds(zoneOffset2.getTotalSeconds() - org.threeten.bp.ZoneOffset.UTC.getTotalSeconds());
        }
    }
}
