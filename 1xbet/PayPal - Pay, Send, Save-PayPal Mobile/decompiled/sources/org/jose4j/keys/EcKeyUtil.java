package org.jose4j.keys;

/* loaded from: classes18.dex */
public class EcKeyUtil extends org.jose4j.keys.KeyPairUtil {
    public static final java.lang.String EC = "EC";

    @Override // org.jose4j.keys.KeyPairUtil
    public /* bridge */ /* synthetic */ java.security.PublicKey fromPemEncoded(java.lang.String str) throws org.jose4j.lang.JoseException, java.security.spec.InvalidKeySpecException {
        return super.fromPemEncoded(str);
    }

    @Override // org.jose4j.keys.KeyPairUtil
    public /* bridge */ /* synthetic */ boolean isAvailable() {
        return super.isAvailable();
    }

    public EcKeyUtil() {
        this(null, null);
    }

    public EcKeyUtil(java.lang.String str, java.security.SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    @Override // org.jose4j.keys.KeyPairUtil
    final java.lang.String getHighSpeedVideoFpsRangesFor() {
        return "EC";
    }

    public java.security.interfaces.ECPublicKey publicKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.spec.ECParameterSpec eCParameterSpec) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.interfaces.ECPublicKey) getKeyFactory().generatePublic(new java.security.spec.ECPublicKeySpec(new java.security.spec.ECPoint(bigInteger, bigInteger2), eCParameterSpec));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public java.security.interfaces.ECPrivateKey privateKey(java.math.BigInteger bigInteger, java.security.spec.ECParameterSpec eCParameterSpec) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.interfaces.ECPrivateKey) getKeyFactory().generatePrivate(new java.security.spec.ECPrivateKeySpec(bigInteger, eCParameterSpec));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public java.security.KeyPair generateKeyPair(java.security.spec.ECParameterSpec eCParameterSpec) throws org.jose4j.lang.JoseException {
        java.security.KeyPairGenerator keyPairGenerator = getKeyPairGenerator();
        try {
            if (this.secureRandom == null) {
                keyPairGenerator.initialize(eCParameterSpec);
            } else {
                keyPairGenerator.initialize(eCParameterSpec, this.secureRandom);
            }
            return keyPairGenerator.generateKeyPair();
        } catch (java.security.InvalidAlgorithmParameterException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create EC key pair. ");
            sb.append(e.getMessage());
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        }
    }
}
