package com.google.crypto.tink.hybrid;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class HpkePrivateKey extends com.google.crypto.tink.hybrid.HybridPrivateKey {
    private final com.google.crypto.tink.util.SecretBytes privateKeyBytes;
    private final com.google.crypto.tink.hybrid.HpkePublicKey publicKey;

    private HpkePrivateKey(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.publicKey = hpkePublicKey;
        this.privateKeyBytes = secretBytes;
    }

    private static void validatePrivateKeyByteLength(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        int size = secretBytes.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Encoded private key byte length for ");
        sb.append(kemId);
        sb.append(" must be %d, not ");
        sb.append(size);
        java.lang.String obj = sb.toString();
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            if (size != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 32));
            }
            return;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            if (size != 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 48));
            }
        } else if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            if (size != 66) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 66));
            }
        } else {
            if (kemId != com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
                throw new java.security.GeneralSecurityException("Unable to validate private key length for ".concat(java.lang.String.valueOf(kemId)));
            }
            if (size != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 32));
            }
        }
    }

    private static boolean isNistKem(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) {
        return kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512;
    }

    private static java.security.spec.ECParameterSpec getNistCurveParams(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP256Params();
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP384Params();
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP521Params();
        }
        throw new java.lang.IllegalArgumentException("Unable to determine NIST curve params for ".concat(java.lang.String.valueOf(kemId)));
    }

    private static void validateKeyPair(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (isNistKem(kemId)) {
            java.security.spec.ECParameterSpec nistCurveParams = getNistCurveParams(kemId);
            java.math.BigInteger order = nistCurveParams.getOrder();
            java.math.BigInteger fromUnsignedBigEndianBytes = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr2);
            if (fromUnsignedBigEndianBytes.signum() <= 0 || fromUnsignedBigEndianBytes.compareTo(order) >= 0) {
                throw new java.security.GeneralSecurityException("Invalid private key.");
            }
            if (!com.google.crypto.tink.internal.EllipticCurvesUtil.multiplyByGenerator(fromUnsignedBigEndianBytes, nistCurveParams).equals(com.google.crypto.tink.subtle.EllipticCurves.pointDecode(nistCurveParams.getCurve(), com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bArr))) {
                throw new java.security.GeneralSecurityException("Invalid private key for public key.");
            }
            return;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
            if (!java.util.Arrays.equals(com.google.crypto.tink.subtle.X25519.publicFromPrivate(bArr2), bArr)) {
                throw new java.security.GeneralSecurityException("Invalid private key for public key.");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Unable to validate key pair for ".concat(java.lang.String.valueOf(kemId)));
    }

    public static com.google.crypto.tink.hybrid.HpkePrivateKey create(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        if (hpkePublicKey == null) {
            throw new java.security.GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (secretBytes == null) {
            throw new java.security.GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        validatePrivateKeyByteLength(hpkePublicKey.getParameters().getKemId(), secretBytes);
        validateKeyPair(hpkePublicKey.getParameters().getKemId(), hpkePublicKey.getPublicKeyBytes().toByteArray(), secretBytes.toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()));
        return new com.google.crypto.tink.hybrid.HpkePrivateKey(hpkePublicKey, secretBytes);
    }

    public final com.google.crypto.tink.util.SecretBytes getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.hybrid.HpkeParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.hybrid.HpkePublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.hybrid.HpkePrivateKey)) {
            return false;
        }
        com.google.crypto.tink.hybrid.HpkePrivateKey hpkePrivateKey = (com.google.crypto.tink.hybrid.HpkePrivateKey) key;
        return this.publicKey.equalsKey(hpkePrivateKey.publicKey) && this.privateKeyBytes.equalsSecretBytes(hpkePrivateKey.privateKeyBytes);
    }
}
