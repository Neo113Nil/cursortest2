package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PBKDF2Key implements org.bouncycastle.jcajce.PBKDFKey {
    private final org.bouncycastle.crypto.CharToByteConverter Camera2StreamConfigurationMap;
    private final char[] getHighSpeedVideoFpsRanges;

    public char[] getPassword() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return this.Camera2StreamConfigurationMap.getType();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.Camera2StreamConfigurationMap.convert(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return org.jose4j.keys.PbkdfKey.ALGORITHM;
    }

    public PBKDF2Key(char[] cArr, org.bouncycastle.crypto.CharToByteConverter charToByteConverter) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(cArr);
        this.Camera2StreamConfigurationMap = charToByteConverter;
    }
}
