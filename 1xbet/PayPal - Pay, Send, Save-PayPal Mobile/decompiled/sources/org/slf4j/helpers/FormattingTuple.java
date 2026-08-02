package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class FormattingTuple {
    public static org.slf4j.helpers.FormattingTuple NULL = new org.slf4j.helpers.FormattingTuple(null);
    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    public FormattingTuple(java.lang.String str) {
        this(str, null, null);
    }

    public FormattingTuple(java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = th;
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
    }

    public java.lang.String getMessage() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.Object[] getArgArray() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.Throwable getThrowable() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
