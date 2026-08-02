package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class NaccacheSternPrivateKeyParameters extends org.bouncycastle.crypto.params.NaccacheSternKeyParameters {
    private java.util.Vector getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    public java.util.Vector getSmallPrimes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getPhi_n() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public NaccacheSternPrivateKeyParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i, java.util.Vector vector, java.math.BigInteger bigInteger3) {
        super(true, bigInteger, bigInteger2, i);
        this.getHighSpeedVideoFpsRanges = vector;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
    }
}
