package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PBKDF2KeyWithParameters extends org.bouncycastle.jcajce.PBKDF2Key implements javax.crypto.interfaces.PBEKey {
    private final int Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.Camera2StreamConfigurationMap;
    }

    public PBKDF2KeyWithParameters(char[] cArr, org.bouncycastle.crypto.CharToByteConverter charToByteConverter, byte[] bArr, int i) {
        super(cArr, charToByteConverter);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.Camera2StreamConfigurationMap = i;
    }
}
