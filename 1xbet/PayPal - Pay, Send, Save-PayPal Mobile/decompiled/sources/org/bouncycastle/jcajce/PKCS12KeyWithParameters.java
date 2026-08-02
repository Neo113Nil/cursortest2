package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKCS12KeyWithParameters extends org.bouncycastle.jcajce.PKCS12Key implements javax.crypto.interfaces.PBEKey {
    private final int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i) {
        super(cArr);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRanges = i;
    }

    public PKCS12KeyWithParameters(char[] cArr, boolean z, byte[] bArr, int i) {
        super(cArr, z);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRanges = i;
    }
}
