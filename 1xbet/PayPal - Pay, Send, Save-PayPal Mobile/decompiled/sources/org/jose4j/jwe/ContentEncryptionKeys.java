package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class ContentEncryptionKeys {
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public ContentEncryptionKeys(byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoSizes = bArr2 == null ? org.jose4j.lang.ByteUtil.EMPTY_BYTES : bArr2;
    }

    public byte[] getContentEncryptionKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getEncryptedKey() {
        return this.getHighSpeedVideoSizes;
    }
}
