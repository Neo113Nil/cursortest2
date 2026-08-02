package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSStreamException extends java.io.IOException {
    private final java.lang.Throwable Camera2StreamConfigurationMap;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.Camera2StreamConfigurationMap;
    }

    public CMSStreamException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
    }
}
