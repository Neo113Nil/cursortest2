package com.google.crypto.tink.hybrid;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EciesPrivateKey extends com.google.crypto.tink.hybrid.HybridPrivateKey {

    @javax.annotation.Nullable
    private final com.google.crypto.tink.util.SecretBigInteger nistPrivateKeyValue;
    private final com.google.crypto.tink.hybrid.EciesPublicKey publicKey;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.util.SecretBytes x25519PrivateKeyBytes;

    private EciesPrivateKey(com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey, @javax.annotation.Nullable com.google.crypto.tink.util.SecretBigInteger secretBigInteger, @javax.annotation.Nullable com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.publicKey = eciesPublicKey;
        this.nistPrivateKeyValue = secretBigInteger;
        this.x25519PrivateKeyBytes = secretBytes;
    }

    private static java.security.spec.ECParameterSpec toParameterSpecNistCurve(com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType) {
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP256Params();
        }
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P384) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP384Params();
        }
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P521) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP521Params();
        }
        throw new java.lang.IllegalArgumentException("Unable to determine NIST curve type for ".concat(java.lang.String.valueOf(curveType)));
    }

    private static void validateNistPrivateKeyValue(java.math.BigInteger bigInteger, java.security.spec.ECPoint eCPoint, com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType) throws java.security.GeneralSecurityException {
        java.math.BigInteger order = toParameterSpecNistCurve(curveType).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new java.security.GeneralSecurityException("Invalid private value");
        }
        if (!com.google.crypto.tink.internal.EllipticCurvesUtil.multiplyByGenerator(bigInteger, toParameterSpecNistCurve(curveType)).equals(eCPoint)) {
            throw new java.security.GeneralSecurityException("Invalid private value");
        }
    }

    private static void validateX25519PrivateKeyBytes(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length != 32) {
            throw new java.security.GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (!java.util.Arrays.equals(com.google.crypto.tink.subtle.X25519.publicFromPrivate(bArr), bArr2)) {
            throw new java.security.GeneralSecurityException("Invalid private key for public key.");
        }
    }

    public static com.google.crypto.tink.hybrid.EciesPrivateKey createForCurveX25519(com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        if (eciesPublicKey == null) {
            throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (eciesPublicKey.getX25519CurvePointBytes() == null) {
            throw new java.security.GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (secretBytes == null) {
            throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        validateX25519PrivateKeyBytes(secretBytes.toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), eciesPublicKey.getX25519CurvePointBytes().toByteArray());
        return new com.google.crypto.tink.hybrid.EciesPrivateKey(eciesPublicKey, null, secretBytes);
    }

    public static com.google.crypto.tink.hybrid.EciesPrivateKey createForNistCurve(com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey, com.google.crypto.tink.util.SecretBigInteger secretBigInteger) throws java.security.GeneralSecurityException {
        if (eciesPublicKey == null) {
            throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (eciesPublicKey.getNistCurvePoint() == null) {
            throw new java.security.GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        if (secretBigInteger == null) {
            throw new java.security.GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        validateNistPrivateKeyValue(secretBigInteger.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), eciesPublicKey.getNistCurvePoint(), eciesPublicKey.getParameters().getCurveType());
        return new com.google.crypto.tink.hybrid.EciesPrivateKey(eciesPublicKey, secretBigInteger, null);
    }

    @javax.annotation.Nullable
    public final com.google.crypto.tink.util.SecretBytes getX25519PrivateKeyBytes() {
        return this.x25519PrivateKeyBytes;
    }

    @javax.annotation.Nullable
    public final com.google.crypto.tink.util.SecretBigInteger getNistPrivateKeyValue() {
        return this.nistPrivateKeyValue;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.hybrid.EciesParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.hybrid.EciesPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.hybrid.EciesPrivateKey)) {
            return false;
        }
        com.google.crypto.tink.hybrid.EciesPrivateKey eciesPrivateKey = (com.google.crypto.tink.hybrid.EciesPrivateKey) key;
        if (!this.publicKey.equalsKey(eciesPrivateKey.publicKey)) {
            return false;
        }
        com.google.crypto.tink.util.SecretBytes secretBytes = this.x25519PrivateKeyBytes;
        if (secretBytes == null && eciesPrivateKey.x25519PrivateKeyBytes == null) {
            return this.nistPrivateKeyValue.equalsSecretBigInteger(eciesPrivateKey.nistPrivateKeyValue);
        }
        return secretBytes.equalsSecretBytes(eciesPrivateKey.x25519PrivateKeyBytes);
    }
}
