package com.microblink.blinkid.results.date;

/* loaded from: classes10.dex */
public class SimpleDate {
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public SimpleDate(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
    }

    public static com.microblink.blinkid.results.date.SimpleDate parseFromString(java.lang.String str, java.lang.String str2) {
        java.util.Date date;
        try {
            date = new java.text.SimpleDateFormat(str2, java.util.Locale.US).parse(str);
        } catch (java.text.ParseException unused) {
            date = null;
        }
        if (date == null) {
            return null;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return new com.microblink.blinkid.results.date.SimpleDate(calendar.get(5), calendar.get(2) + 1, calendar.get(1));
    }

    public int getDay() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getMonth() {
        return this.getHighSpeedVideoSizes;
    }

    public int getYear() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "%02d.%02d.%d.", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor));
    }
}
