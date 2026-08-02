package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
public class SPHINCSPublicKeyParameters extends org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters {
    private final byte[] getHighSpeedVideoFpsRanges;

    public byte[] getKeyData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public SPHINCSPublicKeyParameters(byte[] bArr, java.lang.String str) {
        super(false, str);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public SPHINCSPublicKeyParameters(byte[] bArr) {
        super(false, null);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
