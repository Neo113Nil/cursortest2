package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PBKDF1KeyWithParameters extends org.bouncycastle.jcajce.PBKDF1Key implements javax.crypto.interfaces.PBEKey {
    private final byte[] Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public PBKDF1KeyWithParameters(char[] cArr, org.bouncycastle.crypto.CharToByteConverter charToByteConverter, byte[] bArr, int i) {
        super(cArr, charToByteConverter);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
