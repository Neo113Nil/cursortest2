package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class CMPRuntimeException extends java.lang.RuntimeException {
    private java.lang.Throwable Camera2StreamConfigurationMap;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.Camera2StreamConfigurationMap;
    }

    public CMPRuntimeException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
    }
}
