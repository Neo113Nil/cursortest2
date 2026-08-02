package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
public final class QTESLAPublicKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    public final int getSecurityCategory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final byte[] getPublicData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public QTESLAPublicKeyParameters(int i, byte[] bArr) {
        super(false);
        if (bArr.length != org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getHighSpeedVideoSizes(i)) {
            throw new java.lang.IllegalArgumentException("invalid key size for security category");
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
