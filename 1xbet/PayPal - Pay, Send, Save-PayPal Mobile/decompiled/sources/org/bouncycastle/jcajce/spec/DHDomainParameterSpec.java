package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class DHDomainParameterSpec extends javax.crypto.spec.DHParameterSpec {
    private final int Camera2StreamConfigurationMap;
    private final java.math.BigInteger getHighSpeedVideoFpsRanges;
    private final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.DHValidationParameters getHighSpeedVideoSizes;

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getM() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getJ() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.DHParameters getDomainParameters() {
        return new org.bouncycastle.crypto.params.DHParameters(getP(), getG(), this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, getL(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    public DHDomainParameterSpec(org.bouncycastle.crypto.params.DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.getHighSpeedVideoSizes = dHParameters.getValidationParameters();
    }

    public DHDomainParameterSpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, int i, int i2) {
        super(bigInteger, bigInteger3, i2);
        this.getHighSpeedVideoFpsRanges = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger4;
        this.Camera2StreamConfigurationMap = i;
    }

    public DHDomainParameterSpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, int i) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i);
    }

    public DHDomainParameterSpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, null, i);
    }

    public DHDomainParameterSpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }
}
