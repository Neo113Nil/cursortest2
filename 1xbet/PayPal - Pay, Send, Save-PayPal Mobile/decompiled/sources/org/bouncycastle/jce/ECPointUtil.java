package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class ECPointUtil {
    public static java.security.spec.ECPoint decodePoint(java.security.spec.EllipticCurve ellipticCurve, byte[] bArr) {
        org.bouncycastle.math.ec.ECCurve f2m;
        if (ellipticCurve.getField() instanceof java.security.spec.ECFieldFp) {
            f2m = new org.bouncycastle.math.ec.ECCurve.Fp(((java.security.spec.ECFieldFp) ellipticCurve.getField()).getP(), ellipticCurve.getA(), ellipticCurve.getB());
        } else {
            int[] midTermsOfReductionPolynomial = ((java.security.spec.ECFieldF2m) ellipticCurve.getField()).getMidTermsOfReductionPolynomial();
            f2m = midTermsOfReductionPolynomial.length == 3 ? new org.bouncycastle.math.ec.ECCurve.F2m(((java.security.spec.ECFieldF2m) ellipticCurve.getField()).getM(), midTermsOfReductionPolynomial[2], midTermsOfReductionPolynomial[1], midTermsOfReductionPolynomial[0], ellipticCurve.getA(), ellipticCurve.getB()) : new org.bouncycastle.math.ec.ECCurve.F2m(((java.security.spec.ECFieldF2m) ellipticCurve.getField()).getM(), midTermsOfReductionPolynomial[0], ellipticCurve.getA(), ellipticCurve.getB());
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(f2m.decodePoint(bArr));
    }
}
