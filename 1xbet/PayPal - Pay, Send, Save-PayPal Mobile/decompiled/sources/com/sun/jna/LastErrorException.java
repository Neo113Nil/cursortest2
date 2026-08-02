package com.sun.jna;

/* loaded from: classes5.dex */
public class LastErrorException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;
    private int getHighSpeedVideoFpsRanges;

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        try {
            int parseInt = java.lang.Integer.parseInt(str);
            if (com.sun.jna.Platform.isWindows()) {
                str = "GetLastError() returned ".concat(java.lang.String.valueOf(parseInt));
            } else {
                str = "errno was ".concat(java.lang.String.valueOf(parseInt));
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return str;
    }

    public int getErrorCode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public LastErrorException(java.lang.String str) {
        super(getHighSpeedVideoSizes(str.trim()));
        try {
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.parseInt(str.startsWith("[") ? str.substring(1, str.indexOf("]")) : str);
        } catch (java.lang.NumberFormatException unused) {
            this.getHighSpeedVideoFpsRanges = -1;
        }
    }

    protected LastErrorException(int i, java.lang.String str) {
        super(str);
        this.getHighSpeedVideoFpsRanges = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LastErrorException(int i) {
        this(i, r0);
        java.lang.String concat;
        if (com.sun.jna.Platform.isWindows()) {
            concat = "GetLastError() returned ".concat(java.lang.String.valueOf(i));
        } else {
            concat = "errno was ".concat(java.lang.String.valueOf(i));
        }
    }
}
