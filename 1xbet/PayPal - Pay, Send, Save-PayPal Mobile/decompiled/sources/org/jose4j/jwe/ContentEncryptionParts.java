package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class ContentEncryptionParts {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;

    public ContentEncryptionParts(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        this.getHighSpeedVideoFpsRanges = bArr3;
    }

    public byte[] getIv() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getCiphertext() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getAuthenticationTag() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
