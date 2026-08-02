package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPkcs1VerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    private final com.google.crypto.tink.PublicKeyVerify verify;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.Enums.HashType, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType> HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.Enums.HashType.SHA256, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).add(com.google.crypto.tink.subtle.Enums.HashType.SHA384, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384).add(com.google.crypto.tink.subtle.Enums.HashType.SHA512, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512).build();

    static final class InternalJavaImpl implements com.google.crypto.tink.PublicKeyVerify {
        private static final java.lang.String ASN_PREFIX_SHA256 = "3031300d060960864801650304020105000420";
        private static final java.lang.String ASN_PREFIX_SHA384 = "3041300d060960864801650304020205000430";
        private static final java.lang.String ASN_PREFIX_SHA512 = "3051300d060960864801650304020305000440";
        private final com.google.crypto.tink.subtle.Enums.HashType hash;
        private final byte[] messageSuffix;
        private final byte[] outputPrefix;
        private final java.security.interfaces.RSAPublicKey publicKey;

        /* synthetic */ InternalJavaImpl(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, byte[] bArr, byte[] bArr2, com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1 anonymousClass1) throws java.security.GeneralSecurityException {
            this(rSAPublicKey, hashType, bArr, bArr2);
        }

        private InternalJavaImpl(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
                throw new java.security.GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
            }
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(hashType);
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
            this.publicKey = rSAPublicKey;
            this.hash = hashType;
            this.outputPrefix = bArr;
            this.messageSuffix = bArr2;
        }

        private void noPrefixVerify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            java.math.BigInteger publicExponent = this.publicKey.getPublicExponent();
            java.math.BigInteger modulus = this.publicKey.getModulus();
            int bitLength = (modulus.bitLength() + 7) / 8;
            if (bitLength != bArr.length) {
                throw new java.security.GeneralSecurityException("invalid signature's length");
            }
            java.math.BigInteger bytes2Integer = com.google.crypto.tink.subtle.SubtleUtil.bytes2Integer(bArr);
            if (bytes2Integer.compareTo(modulus) >= 0) {
                throw new java.security.GeneralSecurityException("signature out of range");
            }
            if (!com.google.crypto.tink.subtle.Bytes.equal(com.google.crypto.tink.subtle.SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength), emsaPkcs1(bArr2, bitLength, this.hash))) {
                throw new java.security.GeneralSecurityException("invalid signature");
            }
        }

        private byte[] emsaPkcs1(byte[] bArr, int i, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(hashType);
            java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance(com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(this.hash));
            engineFactory.update(bArr);
            byte[] bArr2 = this.messageSuffix;
            if (bArr2.length != 0) {
                engineFactory.update(bArr2);
            }
            byte[] digest = engineFactory.digest();
            byte[] asnPrefix = toAsnPrefix(hashType);
            if (i < asnPrefix.length + digest.length + 11) {
                throw new java.security.GeneralSecurityException("intended encoded message length too short");
            }
            byte[] bArr3 = new byte[i];
            bArr3[0] = 0;
            bArr3[1] = 1;
            int i2 = 2;
            int i3 = 0;
            while (i3 < (i - r0) - 3) {
                bArr3[i2] = -1;
                i3++;
                i2++;
            }
            int i4 = i2 + 1;
            bArr3[i2] = 0;
            java.lang.System.arraycopy(asnPrefix, 0, bArr3, i4, asnPrefix.length);
            java.lang.System.arraycopy(digest, 0, bArr3, i4 + asnPrefix.length, digest.length);
            return bArr3;
        }

        private byte[] toAsnPrefix(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
            int i = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
            if (i == 1) {
                return com.google.crypto.tink.subtle.Hex.decode(ASN_PREFIX_SHA256);
            }
            if (i == 2) {
                return com.google.crypto.tink.subtle.Hex.decode(ASN_PREFIX_SHA384);
            }
            if (i == 3) {
                return com.google.crypto.tink.subtle.Hex.decode(ASN_PREFIX_SHA512);
            }
            throw new java.security.GeneralSecurityException("Unsupported hash ".concat(java.lang.String.valueOf(hashType)));
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            byte[] bArr3 = this.outputPrefix;
            if (bArr3.length == 0) {
                noPrefixVerify(bArr, bArr2);
            } else {
                if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
                    throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                noPrefixVerify(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length), bArr2);
            }
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce$1, reason: invalid class name */
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

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        byte[] bArr;
        try {
            return com.google.crypto.tink.signature.internal.RsaSsaPkcs1VerifyConscrypt.create(rsaSsaPkcs1PublicKey);
        } catch (java.security.NoSuchProviderException unused) {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(rsaSsaPkcs1PublicKey.getModulus(), rsaSsaPkcs1PublicKey.getParameters().getPublicExponent()));
            com.google.crypto.tink.subtle.Enums.HashType protoEnum = HASH_TYPE_CONVERTER.toProtoEnum(rsaSsaPkcs1PublicKey.getParameters().getHashType());
            byte[] byteArray = rsaSsaPkcs1PublicKey.getOutputPrefix().toByteArray();
            if (rsaSsaPkcs1PublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.LEGACY)) {
                bArr = legacyMessageSuffix;
            } else {
                bArr = EMPTY;
            }
            return new com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.InternalJavaImpl(rSAPublicKey, protoEnum, byteArray, bArr, null);
        }
    }

    private static com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType getHashType(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unsupported hash: ".concat(java.lang.String.valueOf(hashType)));
    }

    private com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey convertKey(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(rSAPublicKey.getModulus().bitLength()).setPublicExponent(rSAPublicKey.getPublicExponent()).setHashType(getHashType(hashType)).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build()).setModulus(rSAPublicKey.getModulus()).build();
    }

    public RsaSsaPkcs1VerifyJce(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        this.verify = create(convertKey(rSAPublicKey, hashType));
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.verify.verify(bArr, bArr2);
    }
}
