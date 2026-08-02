package org.jose4j.json.internal.json_simple.parser;

/* loaded from: classes18.dex */
public class ParseException extends java.lang.Exception {
    public static final int ERROR_UNEXPECTED_CHAR = 0;
    public static final int ERROR_UNEXPECTED_EXCEPTION = 2;
    public static final int ERROR_UNEXPECTED_TOKEN = 1;
    private static final long serialVersionUID = -7880698968187728547L;
    private int Camera2StreamConfigurationMap;
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;

    public ParseException(int i) {
        this(-1, i, null);
    }

    public ParseException(int i, java.lang.Object obj) {
        this(-1, i, obj);
    }

    public ParseException(int i, int i2, java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    public int getErrorType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setErrorType(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public int getPosition() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setPosition(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public java.lang.Object getUnexpectedObject() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setUnexpectedObject(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            sb.append("Unexpected character (");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(") at position ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(".");
        } else if (i == 1) {
            sb.append("Unexpected token ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" at position ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(".");
        } else if (i == 2) {
            sb.append("Unexpected exception at position ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(": ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            sb.append("Unknown error at position ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(".");
        }
        return sb.toString();
    }
}
