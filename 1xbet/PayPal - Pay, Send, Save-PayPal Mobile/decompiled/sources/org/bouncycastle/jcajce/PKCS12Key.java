package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKCS12Key implements org.bouncycastle.jcajce.PBKDFKey {
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final char[] getHighSpeedVideoSizes;

    public char[] getPassword() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (this.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes.length == 0) ? new byte[2] : org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(this.getHighSpeedVideoSizes);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "PKCS12";
    }

    public PKCS12Key(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.getHighSpeedVideoSizes = cArr2;
        this.getHighSpeedVideoFpsRangesFor = z;
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public PKCS12Key(char[] cArr) {
        this(cArr, false);
    }
}
