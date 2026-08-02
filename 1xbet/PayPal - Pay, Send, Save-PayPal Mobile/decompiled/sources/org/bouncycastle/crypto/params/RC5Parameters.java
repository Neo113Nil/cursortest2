package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class RC5Parameters implements org.bouncycastle.crypto.CipherParameters {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRangesFor;

    public int getRounds() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public RC5Parameters(byte[] bArr, int i) {
        if (bArr.length > 255) {
            throw new java.lang.IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        byte[] bArr2 = new byte[bArr.length];
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        this.Camera2StreamConfigurationMap = i;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
