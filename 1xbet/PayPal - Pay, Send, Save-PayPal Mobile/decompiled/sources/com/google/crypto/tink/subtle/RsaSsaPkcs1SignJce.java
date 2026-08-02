package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPkcs1SignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final com.google.crypto.tink.PublicKeySign signer;

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.internal.RsaSsaPkcs1SignJce.create(rsaSsaPkcs1PrivateKey);
    }

    /* renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.subtle.Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.subtle.Enums.HashType.SHA256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType convertHashType(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported hash: ");
        sb.append(hashType.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.PublicKeySign getSigner(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.internal.RsaSsaPkcs1SignJce.create(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(rSAPrivateCrtKey.getModulus().bitLength()).setPublicExponent(rSAPrivateCrtKey.getPublicExponent()).setHashType(convertHashType(hashType)).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build()).setModulus(rSAPrivateCrtKey.getModulus()).build()).setPrimes(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrivateExponent(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getCrtCoefficient(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build());
    }

    public RsaSsaPkcs1SignJce(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        this.signer = getSigner(rSAPrivateCrtKey, hashType);
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        return this.signer.sign(bArr);
    }
}
