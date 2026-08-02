package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public class MimeIOException extends java.io.IOException {
    private java.lang.Throwable Camera2StreamConfigurationMap;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.Camera2StreamConfigurationMap;
    }

    public MimeIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
    }

    public MimeIOException(java.lang.String str) {
        super(str);
    }
}
