package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
public final class QTESLAPrivateKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;

    public final int getSecurityCategory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final byte[] getSecret() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public QTESLAPrivateKeyParameters(int i, byte[] bArr) {
        super(true);
        if (bArr.length != org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getHighResolutionOutputSizeshNQ4ISI(i)) {
            throw new java.lang.IllegalArgumentException("invalid key size for security category");
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
