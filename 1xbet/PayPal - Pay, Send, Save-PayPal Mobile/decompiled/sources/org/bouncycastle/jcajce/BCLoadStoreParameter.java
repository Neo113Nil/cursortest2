package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class BCLoadStoreParameter implements java.security.KeyStore.LoadStoreParameter {
    private final java.security.KeyStore.ProtectionParameter Camera2StreamConfigurationMap;
    private final java.io.OutputStream getHighSpeedVideoFpsRangesFor;
    private final java.io.InputStream getHighSpeedVideoSizes;

    @Override // java.security.KeyStore.LoadStoreParameter
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.io.OutputStream getOutputStream() {
        java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRangesFor;
        if (outputStream != null) {
            return outputStream;
        }
        throw new java.lang.UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    public java.io.InputStream getInputStream() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return this.getHighSpeedVideoSizes;
        }
        throw new java.lang.UnsupportedOperationException("parameter configured for storage OutputStream present");
    }

    public BCLoadStoreParameter(java.io.OutputStream outputStream, char[] cArr) {
        this(outputStream, new java.security.KeyStore.PasswordProtection(cArr));
    }

    public BCLoadStoreParameter(java.io.OutputStream outputStream, java.security.KeyStore.ProtectionParameter protectionParameter) {
        this(null, outputStream, protectionParameter);
    }

    public BCLoadStoreParameter(java.io.InputStream inputStream, char[] cArr) {
        this(inputStream, new java.security.KeyStore.PasswordProtection(cArr));
    }

    public BCLoadStoreParameter(java.io.InputStream inputStream, java.security.KeyStore.ProtectionParameter protectionParameter) {
        this(inputStream, null, protectionParameter);
    }

    BCLoadStoreParameter(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.security.KeyStore.ProtectionParameter protectionParameter) {
        this.getHighSpeedVideoSizes = inputStream;
        this.getHighSpeedVideoFpsRangesFor = outputStream;
        this.Camera2StreamConfigurationMap = protectionParameter;
    }
}
