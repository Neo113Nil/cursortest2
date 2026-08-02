package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class BCFKSStoreParameter implements java.security.KeyStore.LoadStoreParameter {
    private final org.bouncycastle.crypto.util.PBKDFConfig getHighSpeedVideoFpsRanges;
    private final java.security.KeyStore.ProtectionParameter getHighSpeedVideoFpsRangesFor;
    private java.io.OutputStream getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.util.PBKDFConfig getStorePBKDFConfig() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.io.OutputStream getOutputStream() {
        return this.getHighSpeedVideoSizes;
    }

    public BCFKSStoreParameter(java.io.OutputStream outputStream, org.bouncycastle.crypto.util.PBKDFConfig pBKDFConfig, char[] cArr) {
        this(outputStream, pBKDFConfig, new java.security.KeyStore.PasswordProtection(cArr));
    }

    public BCFKSStoreParameter(java.io.OutputStream outputStream, org.bouncycastle.crypto.util.PBKDFConfig pBKDFConfig, java.security.KeyStore.ProtectionParameter protectionParameter) {
        this.getHighSpeedVideoSizes = outputStream;
        this.getHighSpeedVideoFpsRanges = pBKDFConfig;
        this.getHighSpeedVideoFpsRangesFor = protectionParameter;
    }
}
