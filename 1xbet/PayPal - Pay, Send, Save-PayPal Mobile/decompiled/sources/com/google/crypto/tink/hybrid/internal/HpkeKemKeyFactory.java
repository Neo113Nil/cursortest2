package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class HpkeKemKeyFactory {
    public static com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey createPrivate(com.google.crypto.tink.hybrid.HpkePrivateKey hpkePrivateKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId = hpkePrivateKey.getParameters().getKemId();
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return new com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey(com.google.crypto.tink.util.Bytes.copyFrom(hpkePrivateKey.getPrivateKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get())), hpkePrivateKey.getPublicKey().getPublicKeyBytes());
        }
        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    private HpkeKemKeyFactory() {
    }
}
