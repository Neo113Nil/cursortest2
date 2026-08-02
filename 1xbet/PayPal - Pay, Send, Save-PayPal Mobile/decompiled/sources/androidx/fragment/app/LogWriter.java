package androidx.fragment.app;

/* loaded from: classes3.dex */
final class LogWriter extends java.io.Writer {
    private final java.lang.String Camera2StreamConfigurationMap;
    private java.lang.StringBuilder getHighResolutionOutputSizeshNQ4ISI = new java.lang.StringBuilder(128);

    LogWriter(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Camera2StreamConfigurationMap();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        Camera2StreamConfigurationMap();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                Camera2StreamConfigurationMap();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.append(c);
            }
        }
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.length() > 0) {
            java.lang.StringBuilder sb = this.getHighResolutionOutputSizeshNQ4ISI;
            sb.delete(0, sb.length());
        }
    }
}
