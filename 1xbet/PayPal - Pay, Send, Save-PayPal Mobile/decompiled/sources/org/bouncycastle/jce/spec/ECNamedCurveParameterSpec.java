package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ECNamedCurveParameterSpec extends org.bouncycastle.jce.spec.ECParameterSpec {
    private java.lang.String getHighSpeedVideoFpsRanges;

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ECNamedCurveParameterSpec(java.lang.String str, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        super(eCCurve, eCPoint, bigInteger, bigInteger2, bArr);
        this.getHighSpeedVideoFpsRanges = str;
    }

    public ECNamedCurveParameterSpec(java.lang.String str, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        super(eCCurve, eCPoint, bigInteger, bigInteger2);
        this.getHighSpeedVideoFpsRanges = str;
    }

    public ECNamedCurveParameterSpec(java.lang.String str, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        super(eCCurve, eCPoint, bigInteger);
        this.getHighSpeedVideoFpsRanges = str;
    }
}
