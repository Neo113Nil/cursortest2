package org.jose4j.keys;

/* loaded from: classes18.dex */
public class RsaKeyUtil extends org.jose4j.keys.KeyPairUtil {
    public static final java.lang.String RSA = "RSA";

    @Override // org.jose4j.keys.KeyPairUtil
    public /* bridge */ /* synthetic */ java.security.PublicKey fromPemEncoded(java.lang.String str) throws org.jose4j.lang.JoseException, java.security.spec.InvalidKeySpecException {
        return super.fromPemEncoded(str);
    }

    @Override // org.jose4j.keys.KeyPairUtil
    public /* bridge */ /* synthetic */ boolean isAvailable() {
        return super.isAvailable();
    }

    public RsaKeyUtil() {
        this(null, null);
    }

    public RsaKeyUtil(java.lang.String str, java.security.SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    @Override // org.jose4j.keys.KeyPairUtil
    final java.lang.String getHighSpeedVideoFpsRangesFor() {
        return "RSA";
    }

    public java.security.interfaces.RSAPublicKey publicKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.interfaces.RSAPublicKey) getKeyFactory().generatePublic(new java.security.spec.RSAPublicKeySpec(bigInteger, bigInteger2));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public java.security.interfaces.RSAPrivateKey privateKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) throws org.jose4j.lang.JoseException {
        return getRsaPrivateKey(new java.security.spec.RSAPrivateKeySpec(bigInteger, bigInteger2));
    }

    public java.security.interfaces.RSAPrivateKey privateKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.math.BigInteger bigInteger6, java.math.BigInteger bigInteger7, java.math.BigInteger bigInteger8) throws org.jose4j.lang.JoseException {
        return getRsaPrivateKey(new java.security.spec.RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8));
    }

    public java.security.interfaces.RSAPrivateKey getRsaPrivateKey(java.security.spec.RSAPrivateKeySpec rSAPrivateKeySpec) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.interfaces.RSAPrivateKey) getKeyFactory().generatePrivate(rSAPrivateKeySpec);
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public java.security.KeyPair generateKeyPair(int i) throws org.jose4j.lang.JoseException {
        java.security.KeyPairGenerator keyPairGenerator = getKeyPairGenerator();
        if (this.secureRandom == null) {
            keyPairGenerator.initialize(i);
        } else {
            keyPairGenerator.initialize(i, this.secureRandom);
        }
        return keyPairGenerator.generateKeyPair();
    }
}
