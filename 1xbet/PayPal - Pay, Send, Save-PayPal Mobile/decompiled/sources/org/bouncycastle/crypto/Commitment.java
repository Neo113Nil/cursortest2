package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class Commitment {
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoSizes;

    public byte[] getSecret() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getCommitment() {
        return this.Camera2StreamConfigurationMap;
    }

    public Commitment(byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoSizes = bArr;
        this.Camera2StreamConfigurationMap = bArr2;
    }
}
