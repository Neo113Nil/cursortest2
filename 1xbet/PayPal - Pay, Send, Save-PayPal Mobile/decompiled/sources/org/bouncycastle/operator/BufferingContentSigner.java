package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public class BufferingContentSigner implements org.bouncycastle.operator.ContentSigner {
    private final org.bouncycastle.operator.ContentSigner Camera2StreamConfigurationMap;
    private final java.io.OutputStream getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.operator.ContentSigner
    public byte[] getSignature() {
        return this.Camera2StreamConfigurationMap.getSignature();
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public java.io.OutputStream getOutputStream() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.Camera2StreamConfigurationMap.getAlgorithmIdentifier();
    }

    public BufferingContentSigner(org.bouncycastle.operator.ContentSigner contentSigner, int i) {
        this.Camera2StreamConfigurationMap = contentSigner;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.util.io.BufferingOutputStream(contentSigner.getOutputStream(), i);
    }

    public BufferingContentSigner(org.bouncycastle.operator.ContentSigner contentSigner) {
        this.Camera2StreamConfigurationMap = contentSigner;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.util.io.BufferingOutputStream(contentSigner.getOutputStream());
    }
}
