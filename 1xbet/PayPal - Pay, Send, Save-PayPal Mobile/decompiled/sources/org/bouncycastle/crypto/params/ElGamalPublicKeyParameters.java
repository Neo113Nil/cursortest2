package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ElGamalPublicKeyParameters extends org.bouncycastle.crypto.params.ElGamalKeyParameters {
    private java.math.BigInteger getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode() ^ super.hashCode();
    }

    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof org.bouncycastle.crypto.params.ElGamalPublicKeyParameters) && ((org.bouncycastle.crypto.params.ElGamalPublicKeyParameters) obj).getY().equals(this.getHighSpeedVideoFpsRanges) && super.equals(obj);
    }

    public ElGamalPublicKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.getHighSpeedVideoFpsRanges = bigInteger;
    }
}
