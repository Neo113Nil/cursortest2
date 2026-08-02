package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class SimpleTestResult implements org.bouncycastle.util.test.TestResult {
    private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.util.Strings.lineSeparator();
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // org.bouncycastle.util.test.TestResult
    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public java.lang.Throwable getException() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.util.test.TestResult successful(org.bouncycastle.util.test.Test test, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(test.getName());
        sb.append(": ");
        sb.append(str);
        return new org.bouncycastle.util.test.SimpleTestResult(true, sb.toString());
    }

    public static java.lang.String failedMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        stringBuffer.append(" failing ").append(str2);
        java.lang.String str5 = Camera2StreamConfigurationMap;
        stringBuffer.append(str5).append("    expected: ").append(str3);
        stringBuffer.append(str5).append("    got     : ").append(str4);
        return stringBuffer.toString();
    }

    public static org.bouncycastle.util.test.TestResult failed(org.bouncycastle.util.test.Test test, java.lang.String str, java.lang.Throwable th) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(test.getName());
        sb.append(": ");
        sb.append(str);
        return new org.bouncycastle.util.test.SimpleTestResult(false, sb.toString(), th);
    }

    public static org.bouncycastle.util.test.TestResult failed(org.bouncycastle.util.test.Test test, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.String str2 = Camera2StreamConfigurationMap;
        sb.append(str2);
        sb.append("Expected: ");
        sb.append(obj);
        sb.append(str2);
        sb.append("Found   : ");
        sb.append(obj2);
        return failed(test, sb.toString());
    }

    public static org.bouncycastle.util.test.TestResult failed(org.bouncycastle.util.test.Test test, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(test.getName());
        sb.append(": ");
        sb.append(str);
        return new org.bouncycastle.util.test.SimpleTestResult(false, sb.toString());
    }

    public SimpleTestResult(boolean z, java.lang.String str, java.lang.Throwable th) {
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = th;
    }

    public SimpleTestResult(boolean z, java.lang.String str) {
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
