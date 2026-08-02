package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class EncryptionException extends org.bouncycastle.openssl.PEMException {
    private java.lang.Throwable Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.openssl.PEMException, java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.Camera2StreamConfigurationMap;
    }

    public EncryptionException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
    }

    public EncryptionException(java.lang.String str) {
        super(str);
    }
}
