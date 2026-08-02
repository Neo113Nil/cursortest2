package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAPublicKeyParameters extends org.bouncycastle.crypto.params.DSAKeyParameters {
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(2);
    private java.math.BigInteger Camera2StreamConfigurationMap;

    public DSAPublicKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.DSAParameters dSAParameters) {
        super(false, dSAParameters);
        if (dSAParameters != null) {
            java.math.BigInteger bigInteger2 = getHighSpeedVideoFpsRanges;
            if (bigInteger2.compareTo(bigInteger) > 0 || dSAParameters.getP().subtract(bigInteger2).compareTo(bigInteger) < 0 || !getHighResolutionOutputSizeshNQ4ISI.equals(bigInteger.modPow(dSAParameters.getQ(), dSAParameters.getP()))) {
                throw new java.lang.IllegalArgumentException("y value does not appear to be in correct group");
            }
        }
        this.Camera2StreamConfigurationMap = bigInteger;
    }

    public java.math.BigInteger getY() {
        return this.Camera2StreamConfigurationMap;
    }
}
