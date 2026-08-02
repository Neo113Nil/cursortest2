package org.jose4j.jwe.kdf;

/* loaded from: classes18.dex */
public class ConcatKeyDerivationFunction implements org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256 {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRangesFor = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwe.kdf.ConcatKeyDerivationFunction.class);
    private int Camera2StreamConfigurationMap;
    private java.security.MessageDigest getHighSpeedVideoFpsRanges;

    public ConcatKeyDerivationFunction(java.lang.String str) {
        java.security.MessageDigest messageDigest = org.jose4j.lang.HashUtil.getMessageDigest(str);
        this.getHighSpeedVideoFpsRanges = messageDigest;
        this.Camera2StreamConfigurationMap = org.jose4j.lang.ByteUtil.bitLength(messageDigest.getDigestLength());
    }

    public ConcatKeyDerivationFunction(java.lang.String str, java.lang.String str2) {
        java.security.MessageDigest messageDigest = org.jose4j.lang.HashUtil.getMessageDigest(str, str2);
        this.getHighSpeedVideoFpsRanges = messageDigest;
        this.Camera2StreamConfigurationMap = org.jose4j.lang.ByteUtil.bitLength(messageDigest.getDigestLength());
    }

    public byte[] kdf(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return kdf(bArr, i, org.jose4j.lang.ByteUtil.concat(bArr2, bArr3, bArr4, bArr5, bArr6));
    }

    @Override // org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256
    public byte[] kdf(byte[] bArr, int i, byte[] bArr2) {
        long ceil = (int) java.lang.Math.ceil(i / this.Camera2StreamConfigurationMap);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        for (int i2 = 1; i2 <= ceil; i2++) {
            this.getHighSpeedVideoFpsRanges.update(org.jose4j.lang.ByteUtil.getBytes(i2));
            this.getHighSpeedVideoFpsRanges.update(bArr);
            this.getHighSpeedVideoFpsRanges.update(bArr2);
            byte[] digest = this.getHighSpeedVideoFpsRanges.digest();
            byteArrayOutputStream.write(digest, 0, digest.length);
        }
        int byteLength = org.jose4j.lang.ByteUtil.byteLength(i);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return byteArray.length != byteLength ? org.jose4j.lang.ByteUtil.subArray(byteArray, 0, byteLength) : byteArray;
    }
}
