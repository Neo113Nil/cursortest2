package org.threeten.bp.format;

/* loaded from: classes18.dex */
public class DateTimeParseException extends org.threeten.bp.DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public DateTimeParseException(java.lang.String str, java.lang.CharSequence charSequence, int i) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = charSequence.toString();
        this.getHighSpeedVideoSizes = i;
    }

    public DateTimeParseException(java.lang.String str, java.lang.CharSequence charSequence, int i, java.lang.Throwable th) {
        super(str, th);
        this.getHighSpeedVideoFpsRangesFor = charSequence.toString();
        this.getHighSpeedVideoSizes = i;
    }

    public java.lang.String getParsedString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getErrorIndex() {
        return this.getHighSpeedVideoSizes;
    }
}
