package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ECNamedCurveSpec extends java.security.spec.ECParameterSpec {
    private java.lang.String getHighSpeedVideoFpsRanges;

    public ECNamedCurveSpec(java.lang.String str, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        super(new java.security.spec.EllipticCurve(getHighSpeedVideoSizes(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), null), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPoint), bigInteger, 1);
        this.getHighSpeedVideoFpsRanges = str;
    }

    public ECNamedCurveSpec(java.lang.String str, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        super(new java.security.spec.EllipticCurve(getHighSpeedVideoSizes(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), null), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPoint), bigInteger, bigInteger2.intValue());
        this.getHighSpeedVideoFpsRanges = str;
    }

    public ECNamedCurveSpec(java.lang.String str, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        super(new java.security.spec.EllipticCurve(getHighSpeedVideoSizes(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), bArr), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPoint), bigInteger, bigInteger2.intValue());
        this.getHighSpeedVideoFpsRanges = str;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private static java.security.spec.ECField getHighSpeedVideoSizes(org.bouncycastle.math.field.FiniteField finiteField) {
        if (org.bouncycastle.math.ec.ECAlgorithms.isFpField(finiteField)) {
            return new java.security.spec.ECFieldFp(finiteField.getCharacteristic());
        }
        org.bouncycastle.math.field.Polynomial minimalPolynomial = ((org.bouncycastle.math.field.PolynomialExtensionField) finiteField).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new java.security.spec.ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.Arrays.reverseInPlace(org.bouncycastle.util.Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public ECNamedCurveSpec(java.lang.String str, java.security.spec.EllipticCurve ellipticCurve, java.security.spec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.getHighSpeedVideoFpsRanges = str;
    }

    public ECNamedCurveSpec(java.lang.String str, java.security.spec.EllipticCurve ellipticCurve, java.security.spec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        super(ellipticCurve, eCPoint, bigInteger, 1);
        this.getHighSpeedVideoFpsRanges = str;
    }
}
