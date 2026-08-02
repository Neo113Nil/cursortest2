package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAPrivateKeyParameters extends org.bouncycastle.crypto.params.DSAKeyParameters {
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    public java.math.BigInteger getX() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public DSAPrivateKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.getHighSpeedVideoFpsRangesFor = bigInteger;
    }
}
