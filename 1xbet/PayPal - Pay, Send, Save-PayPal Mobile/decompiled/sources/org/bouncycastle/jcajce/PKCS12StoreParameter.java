package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKCS12StoreParameter implements java.security.KeyStore.LoadStoreParameter {
    private final java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.KeyStore.ProtectionParameter getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoSizes;

    public boolean isForDEREncoding() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.io.OutputStream getOutputStream() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public PKCS12StoreParameter(java.io.OutputStream outputStream, char[] cArr, boolean z) {
        this(outputStream, new java.security.KeyStore.PasswordProtection(cArr), z);
    }

    public PKCS12StoreParameter(java.io.OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public PKCS12StoreParameter(java.io.OutputStream outputStream, java.security.KeyStore.ProtectionParameter protectionParameter, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = outputStream;
        this.getHighSpeedVideoFpsRanges = protectionParameter;
        this.getHighSpeedVideoSizes = z;
    }

    public PKCS12StoreParameter(java.io.OutputStream outputStream, java.security.KeyStore.ProtectionParameter protectionParameter) {
        this(outputStream, protectionParameter, false);
    }
}
