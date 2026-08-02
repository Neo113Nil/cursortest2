package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class SignaturePemKeysetReader implements com.google.crypto.tink.KeysetReader {
    private java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> pemKeys;

    SignaturePemKeysetReader(java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> list) {
        this.pemKeys = list;
    }

    public static com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder newBuilder() {
        return new com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder();
    }

    public static final class Builder {
        private java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> pemKeys = new java.util.ArrayList();

        Builder() {
        }

        public final com.google.crypto.tink.KeysetReader build() {
            return new com.google.crypto.tink.signature.SignaturePemKeysetReader(this.pemKeys);
        }

        public final com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder addPem(java.lang.String str, com.google.crypto.tink.PemKeyType pemKeyType) {
            com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey pemKey = new com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey(null);
            pemKey.reader = new java.io.BufferedReader(new java.io.StringReader(str));
            pemKey.type = pemKeyType;
            this.pemKeys.add(pemKey);
            return this;
        }
    }

    static final class PemKey {
        java.io.BufferedReader reader;
        com.google.crypto.tink.PemKeyType type;

        private PemKey() {
        }

        /* synthetic */ PemKey(com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
        com.google.crypto.tink.proto.Keyset.Builder newBuilder = com.google.crypto.tink.proto.Keyset.newBuilder();
        for (com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey pemKey : this.pemKeys) {
            for (com.google.crypto.tink.proto.Keyset.Key readKey = readKey(pemKey.reader, pemKey.type); readKey != null; readKey = readKey(pemKey.reader, pemKey.type)) {
                newBuilder.addKey(readKey);
            }
        }
        if (newBuilder.getKeyCount() == 0) {
            throw new java.io.IOException("cannot find any key");
        }
        newBuilder.setPrimaryKeyId(newBuilder.getKey(0).getKeyId());
        return newBuilder.build();
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
        throw new java.lang.UnsupportedOperationException();
    }

    @javax.annotation.Nullable
    private static com.google.crypto.tink.proto.Keyset.Key readKey(java.io.BufferedReader bufferedReader, com.google.crypto.tink.PemKeyType pemKeyType) throws java.io.IOException {
        com.google.crypto.tink.proto.KeyData convertEcPublicKey;
        java.security.Key readKey = pemKeyType.readKey(bufferedReader);
        if (readKey == null) {
            return null;
        }
        if (readKey instanceof java.security.interfaces.RSAPublicKey) {
            convertEcPublicKey = convertRsaPublicKey(pemKeyType, (java.security.interfaces.RSAPublicKey) readKey);
        } else {
            if (!(readKey instanceof java.security.interfaces.ECPublicKey)) {
                return null;
            }
            convertEcPublicKey = convertEcPublicKey(pemKeyType, (java.security.interfaces.ECPublicKey) readKey);
        }
        return com.google.crypto.tink.proto.Keyset.Key.newBuilder().setKeyData(convertEcPublicKey).setStatus(com.google.crypto.tink.proto.KeyStatusType.ENABLED).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).setKeyId(com.google.crypto.tink.subtle.Random.randInt()).build();
    }

    private static com.google.crypto.tink.proto.KeyData convertRsaPublicKey(com.google.crypto.tink.PemKeyType pemKeyType, java.security.interfaces.RSAPublicKey rSAPublicKey) throws java.io.IOException {
        if (pemKeyType.algorithm.equals("RSASSA-PKCS1-v1_5")) {
            return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager.getKeyType()).setValue(com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.newBuilder().setVersion(0).setParams(com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder().setHashType(getHashType(pemKeyType)).build()).setE(com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(rSAPublicKey.getPublicExponent())).setN(com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(rSAPublicKey.getModulus())).build().toByteString()).setKeyMaterialType(com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        }
        if (pemKeyType.algorithm.equals(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS)) {
            return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager.getKeyType()).setValue(com.google.crypto.tink.proto.RsaSsaPssPublicKey.newBuilder().setVersion(0).setParams(com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder().setSigHash(getHashType(pemKeyType)).setMgf1Hash(getHashType(pemKeyType)).setSaltLength(getDigestSizeInBytes(pemKeyType)).build()).setE(com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(rSAPublicKey.getPublicExponent())).setN(com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(rSAPublicKey.getModulus())).build().toByteString()).setKeyMaterialType(com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported RSA signature algorithm: ");
        sb.append(pemKeyType.algorithm);
        throw new java.io.IOException(sb.toString());
    }

    private static com.google.crypto.tink.proto.KeyData convertEcPublicKey(com.google.crypto.tink.PemKeyType pemKeyType, java.security.interfaces.ECPublicKey eCPublicKey) throws java.io.IOException {
        if (pemKeyType.algorithm.equals("ECDSA")) {
            return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(com.google.crypto.tink.signature.EcdsaVerifyKeyManager.getKeyType()).setValue(com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder().setVersion(0).setParams(com.google.crypto.tink.proto.EcdsaParams.newBuilder().setHashType(getHashType(pemKeyType)).setCurve(getCurveType(pemKeyType)).setEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER).build()).setX(com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(eCPublicKey.getW().getAffineX())).setY(com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(eCPublicKey.getW().getAffineY())).build().toByteString()).setKeyMaterialType(com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported EC signature algorithm: ");
        sb.append(pemKeyType.algorithm);
        throw new java.io.IOException(sb.toString());
    }

    /* renamed from: com.google.crypto.tink.signature.SignaturePemKeysetReader$1, reason: invalid class name */
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

    private static com.google.crypto.tink.proto.HashType getHashType(com.google.crypto.tink.PemKeyType pemKeyType) {
        int i = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[pemKeyType.hash.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.proto.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.proto.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.proto.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported hash type: ");
        sb.append(pemKeyType.hash.name());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static int getDigestSizeInBytes(com.google.crypto.tink.PemKeyType pemKeyType) {
        int i = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[pemKeyType.hash.ordinal()];
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3) {
            return 64;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported hash type: ");
        sb.append(pemKeyType.hash.name());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static com.google.crypto.tink.proto.EllipticCurveType getCurveType(com.google.crypto.tink.PemKeyType pemKeyType) {
        int i = pemKeyType.keySizeInBits;
        if (i == 256) {
            return com.google.crypto.tink.proto.EllipticCurveType.NIST_P256;
        }
        if (i == 384) {
            return com.google.crypto.tink.proto.EllipticCurveType.NIST_P384;
        }
        if (i == 521) {
            return com.google.crypto.tink.proto.EllipticCurveType.NIST_P521;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported curve for key size: ");
        sb.append(pemKeyType.keySizeInBits);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
