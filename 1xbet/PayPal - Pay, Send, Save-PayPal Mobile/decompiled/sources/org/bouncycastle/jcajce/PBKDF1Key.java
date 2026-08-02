package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PBKDF1Key implements org.bouncycastle.jcajce.PBKDFKey {
    private final char[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.CharToByteConverter getHighSpeedVideoSizes;

    public char[] getPassword() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return this.getHighSpeedVideoSizes.getType();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.getHighSpeedVideoSizes.convert(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "PBKDF1";
    }

    public PBKDF1Key(char[] cArr, org.bouncycastle.crypto.CharToByteConverter charToByteConverter) {
        char[] cArr2 = new char[cArr.length];
        this.getHighSpeedVideoFpsRangesFor = cArr2;
        this.getHighSpeedVideoSizes = charToByteConverter;
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }
}
