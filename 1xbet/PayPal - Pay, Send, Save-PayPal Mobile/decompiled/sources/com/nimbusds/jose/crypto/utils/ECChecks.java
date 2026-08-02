package com.nimbusds.jose.crypto.utils;

/* loaded from: classes4.dex */
public class ECChecks {
    public static boolean isPointOnCurve(java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey) {
        return isPointOnCurve(eCPublicKey, eCPrivateKey.getParams());
    }

    public static boolean isPointOnCurve(java.security.interfaces.ECPublicKey eCPublicKey, java.security.spec.ECParameterSpec eCParameterSpec) {
        java.security.spec.ECPoint w = eCPublicKey.getW();
        return isPointOnCurve(w.getAffineX(), w.getAffineY(), eCParameterSpec);
    }

    public static boolean isPointOnCurve(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.spec.ECParameterSpec eCParameterSpec) {
        java.security.spec.EllipticCurve curve = eCParameterSpec.getCurve();
        java.math.BigInteger a2 = curve.getA();
        java.math.BigInteger b = curve.getB();
        java.math.BigInteger p = ((java.security.spec.ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a2.multiply(bigInteger)).add(b).mod(p));
    }

    private ECChecks() {
    }
}
