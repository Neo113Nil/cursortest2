package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
public class SPHINCSPlusPublicKeyParameters extends org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusKeyParameters {
    private final org.bouncycastle.pqc.crypto.sphincsplus.PK getHighResolutionOutputSizeshNQ4ISI;

    public SPHINCSPlusPublicKeyParameters(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int i = sPHINCSPlusParameters.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        int i2 = i * 2;
        if (bArr.length != i2) {
            throw new java.lang.IllegalArgumentException("public key encoding does not match parameters");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.sphincsplus.PK(org.bouncycastle.util.Arrays.copyOfRange(bArr, 0, i), org.bouncycastle.util.Arrays.copyOfRange(bArr, i, i2));
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes);
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.concatenate(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes);
    }

    SPHINCSPlusPublicKeyParameters(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters sPHINCSPlusParameters, org.bouncycastle.pqc.crypto.sphincsplus.PK pk) {
        super(false, sPHINCSPlusParameters);
        this.getHighResolutionOutputSizeshNQ4ISI = pk;
    }
}
