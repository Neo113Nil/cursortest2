package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSValidityPeriod {
    private final org.bouncycastle.its.ITSValidityPeriod.Unit Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.oer.its.ValidityPeriod toASN1Structure() {
        return org.bouncycastle.oer.its.ValidityPeriod.builder().setTime32(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges / 1000)).setDuration(new org.bouncycastle.oer.its.Duration(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap)).createValidityPeriod();
    }

    public static class Builder {
        private final long getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.its.ITSValidityPeriod plusYears(int i) {
            return new org.bouncycastle.its.ITSValidityPeriod(this.getHighSpeedVideoFpsRangesFor, i, org.bouncycastle.its.ITSValidityPeriod.Unit.years);
        }

        public org.bouncycastle.its.ITSValidityPeriod plusSixtyHours(int i) {
            return new org.bouncycastle.its.ITSValidityPeriod(this.getHighSpeedVideoFpsRangesFor, i, org.bouncycastle.its.ITSValidityPeriod.Unit.sixtyHours);
        }

        Builder(java.util.Date date) {
            this.getHighSpeedVideoFpsRangesFor = date.getTime();
        }
    }

    public enum Unit {
        microseconds(0),
        milliseconds(1),
        seconds(2),
        minutes(3),
        hours(4),
        sixtyHours(5),
        years(6);

        private final int Camera2StreamConfigurationMap;

        Unit(int i) {
            this.Camera2StreamConfigurationMap = i;
        }
    }

    public java.util.Date getStartDate() {
        return new java.util.Date(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.its.ITSValidityPeriod.Builder from(java.util.Date date) {
        return new org.bouncycastle.its.ITSValidityPeriod.Builder(date);
    }

    public ITSValidityPeriod(org.bouncycastle.oer.its.ValidityPeriod validityPeriod) {
        this.getHighSpeedVideoFpsRanges = validityPeriod.getTime32().longValueExact();
        org.bouncycastle.oer.its.Duration duration = validityPeriod.getDuration();
        this.getHighSpeedVideoFpsRangesFor = duration.getValue();
        this.Camera2StreamConfigurationMap = org.bouncycastle.its.ITSValidityPeriod.Unit.values()[duration.getTag()];
    }

    ITSValidityPeriod(long j, int i, org.bouncycastle.its.ITSValidityPeriod.Unit unit) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = unit;
    }
}
