package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JDKPKCS12StoreParameter implements java.security.KeyStore.LoadStoreParameter {
    private java.io.OutputStream Camera2StreamConfigurationMap;
    private java.security.KeyStore.ProtectionParameter getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizes;

    public void setUseDEREncoding(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public void setProtectionParameter(java.security.KeyStore.ProtectionParameter protectionParameter) {
        this.getHighResolutionOutputSizeshNQ4ISI = protectionParameter;
    }

    public void setPassword(char[] cArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.security.KeyStore.PasswordProtection(cArr);
    }

    public void setOutputStream(java.io.OutputStream outputStream) {
        this.Camera2StreamConfigurationMap = outputStream;
    }

    public boolean isUseDEREncoding() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.io.OutputStream getOutputStream() {
        return this.Camera2StreamConfigurationMap;
    }
}
