package org.jose4j.keys;

/* loaded from: classes18.dex */
public abstract class OctetKeyPairUtil extends org.jose4j.keys.KeyPairUtil {
    public abstract java.security.PrivateKey privateKey(byte[] bArr, java.lang.String str) throws org.jose4j.lang.JoseException;

    public abstract java.security.PublicKey publicKey(byte[] bArr, java.lang.String str) throws org.jose4j.lang.JoseException;

    public abstract byte[] rawPrivateKey(java.security.PrivateKey privateKey);

    public abstract byte[] rawPublicKey(java.security.Key key);

    @Override // org.jose4j.keys.KeyPairUtil
    public /* bridge */ /* synthetic */ java.security.PublicKey fromPemEncoded(java.lang.String str) throws org.jose4j.lang.JoseException, java.security.spec.InvalidKeySpecException {
        return super.fromPemEncoded(str);
    }

    @Override // org.jose4j.keys.KeyPairUtil
    public /* bridge */ /* synthetic */ boolean isAvailable() {
        return super.isAvailable();
    }

    public OctetKeyPairUtil(java.lang.String str, java.security.SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public static org.jose4j.keys.OctetKeyPairUtil getOctetKeyPairUtil(java.lang.String str, java.lang.String str2, java.security.SecureRandom secureRandom) {
        if (str.equals("Ed25519") || str.equals("Ed448")) {
            return new org.jose4j.keys.EdDsaKeyUtil(str2, secureRandom);
        }
        if (str.equals("X25519") || str.equals("X448")) {
            return new org.jose4j.keys.XDHKeyUtil(str2, secureRandom);
        }
        return null;
    }

    public java.security.KeyPair generateKeyPair(java.lang.String str) throws org.jose4j.lang.JoseException {
        java.security.KeyPairGenerator keyPairGenerator = getKeyPairGenerator();
        java.security.spec.NamedParameterSpec dM_ = dM_(str);
        try {
            if (this.secureRandom == null) {
                keyPairGenerator.initialize(dM_);
            } else {
                keyPairGenerator.initialize(dM_, this.secureRandom);
            }
            return keyPairGenerator.generateKeyPair();
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new org.jose4j.lang.JoseException("Unable to create EdDSA key pair: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    static java.security.spec.NamedParameterSpec dM_(java.lang.String str) throws org.jose4j.lang.JoseException {
        try {
            return new java.security.spec.NamedParameterSpec(str);
        } catch (java.lang.NoClassDefFoundError e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" NamedParameterSpec not available. ");
            sb.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
            throw new org.jose4j.lang.JoseException(sb.toString());
        }
    }
}
