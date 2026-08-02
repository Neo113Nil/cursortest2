package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class Curve implements java.io.Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f4222name;
    private final java.lang.String oid;
    private final java.lang.String stdName;
    public static final com.nimbusds.jose.jwk.Curve P_256 = new com.nimbusds.jose.jwk.Curve(org.jose4j.keys.EllipticCurves.P_256, "secp256r1", "1.2.840.10045.3.1.7");
    public static final com.nimbusds.jose.jwk.Curve SECP256K1 = new com.nimbusds.jose.jwk.Curve(org.jose4j.keys.EllipticCurves.SECP_256K1, org.jose4j.keys.EllipticCurves.SECP_256K1, "1.3.132.0.10");

    @java.lang.Deprecated
    public static final com.nimbusds.jose.jwk.Curve P_256K = new com.nimbusds.jose.jwk.Curve("P-256K", org.jose4j.keys.EllipticCurves.SECP_256K1, "1.3.132.0.10");
    public static final com.nimbusds.jose.jwk.Curve P_384 = new com.nimbusds.jose.jwk.Curve(org.jose4j.keys.EllipticCurves.P_384, "secp384r1", "1.3.132.0.34");
    public static final com.nimbusds.jose.jwk.Curve P_521 = new com.nimbusds.jose.jwk.Curve(org.jose4j.keys.EllipticCurves.P_521, "secp521r1", "1.3.132.0.35");
    public static final com.nimbusds.jose.jwk.Curve Ed25519 = new com.nimbusds.jose.jwk.Curve("Ed25519", "Ed25519", null);
    public static final com.nimbusds.jose.jwk.Curve Ed448 = new com.nimbusds.jose.jwk.Curve("Ed448", "Ed448", null);
    public static final com.nimbusds.jose.jwk.Curve X25519 = new com.nimbusds.jose.jwk.Curve("X25519", "X25519", null);
    public static final com.nimbusds.jose.jwk.Curve X448 = new com.nimbusds.jose.jwk.Curve("X448", "X448", null);

    public Curve(java.lang.String str) {
        this(str, null, null);
    }

    public Curve(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The JOSE cryptographic curve name must not be null");
        }
        this.f4222name = str;
        this.stdName = str2;
        this.oid = str3;
    }

    public final java.lang.String getName() {
        return this.f4222name;
    }

    public final java.lang.String getStdName() {
        return this.stdName;
    }

    public final java.lang.String getOID() {
        return this.oid;
    }

    public final java.security.spec.ECParameterSpec toECParameterSpec() {
        return com.nimbusds.jose.jwk.ECParameterTable.get(this);
    }

    public final java.lang.String toString() {
        return getName();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.jwk.Curve) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return java.util.Objects.hash(getName());
    }

    public static com.nimbusds.jose.jwk.Curve parse(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new java.lang.IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        com.nimbusds.jose.jwk.Curve curve = P_256;
        if (str.equals(curve.getName())) {
            return curve;
        }
        com.nimbusds.jose.jwk.Curve curve2 = P_256K;
        if (str.equals(curve2.getName())) {
            return curve2;
        }
        com.nimbusds.jose.jwk.Curve curve3 = SECP256K1;
        if (str.equals(curve3.getName())) {
            return curve3;
        }
        com.nimbusds.jose.jwk.Curve curve4 = P_384;
        if (str.equals(curve4.getName())) {
            return curve4;
        }
        com.nimbusds.jose.jwk.Curve curve5 = P_521;
        if (str.equals(curve5.getName())) {
            return curve5;
        }
        com.nimbusds.jose.jwk.Curve curve6 = Ed25519;
        if (str.equals(curve6.getName())) {
            return curve6;
        }
        com.nimbusds.jose.jwk.Curve curve7 = Ed448;
        if (str.equals(curve7.getName())) {
            return curve7;
        }
        com.nimbusds.jose.jwk.Curve curve8 = X25519;
        if (str.equals(curve8.getName())) {
            return curve8;
        }
        com.nimbusds.jose.jwk.Curve curve9 = X448;
        return str.equals(curve9.getName()) ? curve9 : new com.nimbusds.jose.jwk.Curve(str);
    }

    public static com.nimbusds.jose.jwk.Curve forStdName(java.lang.String str) {
        if ("secp256r1".equals(str) || "prime256v1".equals(str)) {
            return P_256;
        }
        if (org.jose4j.keys.EllipticCurves.SECP_256K1.equals(str)) {
            return SECP256K1;
        }
        if ("secp384r1".equals(str)) {
            return P_384;
        }
        if ("secp521r1".equals(str)) {
            return P_521;
        }
        com.nimbusds.jose.jwk.Curve curve = Ed25519;
        if (curve.getStdName().equals(str)) {
            return curve;
        }
        com.nimbusds.jose.jwk.Curve curve2 = Ed448;
        if (curve2.getStdName().equals(str)) {
            return curve2;
        }
        com.nimbusds.jose.jwk.Curve curve3 = X25519;
        if (curve3.getStdName().equals(str)) {
            return curve3;
        }
        com.nimbusds.jose.jwk.Curve curve4 = X448;
        if (curve4.getStdName().equals(str)) {
            return curve4;
        }
        return null;
    }

    public static com.nimbusds.jose.jwk.Curve forOID(java.lang.String str) {
        com.nimbusds.jose.jwk.Curve curve = P_256;
        if (curve.getOID().equals(str)) {
            return curve;
        }
        com.nimbusds.jose.jwk.Curve curve2 = SECP256K1;
        if (curve2.getOID().equals(str)) {
            return curve2;
        }
        com.nimbusds.jose.jwk.Curve curve3 = P_384;
        if (curve3.getOID().equals(str)) {
            return curve3;
        }
        com.nimbusds.jose.jwk.Curve curve4 = P_521;
        if (curve4.getOID().equals(str)) {
            return curve4;
        }
        return null;
    }

    public static java.util.Set<com.nimbusds.jose.jwk.Curve> forJWSAlgorithm(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) {
        if (com.nimbusds.jose.JWSAlgorithm.ES256.equals(jWSAlgorithm)) {
            return java.util.Collections.singleton(P_256);
        }
        if (com.nimbusds.jose.JWSAlgorithm.ES256K.equals(jWSAlgorithm)) {
            return java.util.Collections.singleton(SECP256K1);
        }
        if (com.nimbusds.jose.JWSAlgorithm.ES384.equals(jWSAlgorithm)) {
            return java.util.Collections.singleton(P_384);
        }
        if (com.nimbusds.jose.JWSAlgorithm.ES512.equals(jWSAlgorithm)) {
            return java.util.Collections.singleton(P_521);
        }
        if (com.nimbusds.jose.JWSAlgorithm.EdDSA.equals(jWSAlgorithm)) {
            return java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(Ed25519, Ed448)));
        }
        return null;
    }

    public static com.nimbusds.jose.jwk.Curve forECParameterSpec(java.security.spec.ECParameterSpec eCParameterSpec) {
        return com.nimbusds.jose.jwk.ECParameterTable.get(eCParameterSpec);
    }
}
