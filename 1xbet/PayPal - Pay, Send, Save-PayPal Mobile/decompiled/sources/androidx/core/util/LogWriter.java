package androidx.core.util;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class LogWriter extends java.io.Writer {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.StringBuilder getHighSpeedVideoFpsRanges = new java.lang.StringBuilder(128);

    public LogWriter(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getHighSpeedVideoFpsRanges();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        getHighSpeedVideoFpsRanges();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                getHighSpeedVideoFpsRanges();
            } else {
                this.getHighSpeedVideoFpsRanges.append(c);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges.length() > 0) {
            java.lang.StringBuilder sb = this.getHighSpeedVideoFpsRanges;
            sb.delete(0, sb.length());
        }
    }
}
