package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPssSignJce implements com.google.crypto.tink.PublicKeySign {
    private final com.google.crypto.tink.PublicKeySign sign;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};

    static final class InternalImpl implements com.google.crypto.tink.PublicKeySign {
        private static final java.lang.String RAW_RSA_ALGORITHM = "RSA/ECB/NOPADDING";
        private final byte[] messageSuffix;
        private final com.google.crypto.tink.subtle.Enums.HashType mgf1Hash;
        private final byte[] outputPrefix;
        private final java.security.interfaces.RSAPrivateCrtKey privateKey;
        private final java.security.interfaces.RSAPublicKey publicKey;
        private final int saltLength;
        private final com.google.crypto.tink.subtle.Enums.HashType sigHash;

        /* synthetic */ InternalImpl(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i, byte[] bArr, byte[] bArr2, com.google.crypto.tink.subtle.RsaSsaPssSignJce.AnonymousClass1 anonymousClass1) throws java.security.GeneralSecurityException {
            this(rSAPrivateCrtKey, hashType, hashType2, i, bArr, bArr2);
        }

        private InternalImpl(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
                throw new java.security.GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(hashType);
            if (!hashType.equals(hashType2)) {
                throw new java.security.GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
            this.privateKey = rSAPrivateCrtKey;
            this.publicKey = (java.security.interfaces.RSAPublicKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.sigHash = hashType;
            this.mgf1Hash = hashType2;
            this.saltLength = i;
            this.outputPrefix = bArr;
            this.messageSuffix = bArr2;
        }

        private byte[] noPrefixSign(byte[] bArr) throws java.security.GeneralSecurityException {
            return rsasp1(emsaPssEncode(bArr, this.publicKey.getModulus().bitLength() - 1));
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
            byte[] noPrefixSign = noPrefixSign(bArr);
            byte[] bArr2 = this.outputPrefix;
            return bArr2.length == 0 ? noPrefixSign : com.google.crypto.tink.subtle.Bytes.concat(bArr2, noPrefixSign);
        }

        private byte[] rsasp1(byte[] bArr) throws java.security.GeneralSecurityException {
            javax.crypto.Cipher engineFactory = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance(RAW_RSA_ALGORITHM);
            engineFactory.init(2, this.privateKey);
            byte[] doFinal = engineFactory.doFinal(bArr);
            javax.crypto.Cipher engineFactory2 = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance(RAW_RSA_ALGORITHM);
            engineFactory2.init(1, this.publicKey);
            if (new java.math.BigInteger(1, bArr).equals(new java.math.BigInteger(1, engineFactory2.doFinal(doFinal)))) {
                return doFinal;
            }
            throw new java.lang.IllegalStateException("Security bug: RSA signature computation error");
        }

        private byte[] emsaPssEncode(byte[] bArr, int i) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(this.sigHash);
            java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance(com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(this.sigHash));
            engineFactory.update(bArr);
            byte[] bArr2 = this.messageSuffix;
            if (bArr2.length != 0) {
                engineFactory.update(bArr2);
            }
            byte[] digest = engineFactory.digest();
            int digestLength = engineFactory.getDigestLength();
            int i2 = ((i - 1) / 8) + 1;
            int i3 = this.saltLength;
            if (i2 < digestLength + i3 + 2) {
                throw new java.security.GeneralSecurityException("encoding error");
            }
            byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(i3);
            int i4 = digestLength + 8;
            byte[] bArr3 = new byte[this.saltLength + i4];
            java.lang.System.arraycopy(digest, 0, bArr3, 8, digestLength);
            java.lang.System.arraycopy(randBytes, 0, bArr3, i4, randBytes.length);
            byte[] digest2 = engineFactory.digest(bArr3);
            int i5 = (i2 - digestLength) - 1;
            byte[] bArr4 = new byte[i5];
            int i6 = (i2 - this.saltLength) - digestLength;
            bArr4[i6 - 2] = 1;
            java.lang.System.arraycopy(randBytes, 0, bArr4, i6 - 1, randBytes.length);
            byte[] mgf1 = com.google.crypto.tink.subtle.SubtleUtil.mgf1(digest2, i5, this.mgf1Hash);
            byte[] bArr5 = new byte[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                bArr5[i7] = (byte) (bArr4[i7] ^ mgf1[i7]);
            }
            for (int i8 = 0; i8 < (i2 * 8) - i; i8++) {
                int i9 = i8 / 8;
                bArr5[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr5[i9]);
            }
            int i10 = digestLength + i5;
            byte[] bArr6 = new byte[i10 + 1];
            java.lang.System.arraycopy(bArr5, 0, bArr6, 0, i5);
            java.lang.System.arraycopy(digest2, 0, bArr6, i5, digest2.length);
            bArr6[i10] = org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT;
            return bArr6;
        }
    }

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.RsaSsaPssPrivateKey rsaSsaPssPrivateKey) throws java.security.GeneralSecurityException {
        byte[] bArr;
        try {
            return com.google.crypto.tink.signature.internal.RsaSsaPssSignConscrypt.create(rsaSsaPssPrivateKey);
        } catch (java.security.NoSuchProviderException unused) {
            java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("RSA").generatePrivate(new java.security.spec.RSAPrivateCrtKeySpec(rsaSsaPssPrivateKey.getPublicKey().getModulus(), rsaSsaPssPrivateKey.getParameters().getPublicExponent(), rsaSsaPssPrivateKey.getPrivateExponent().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeP().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeQ().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeExponentP().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeExponentQ().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getCrtCoefficient().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get())));
            com.google.crypto.tink.signature.RsaSsaPssParameters parameters = rsaSsaPssPrivateKey.getParameters();
            com.google.crypto.tink.subtle.Enums.HashType protoEnum = com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.HASH_TYPE_CONVERTER.toProtoEnum(parameters.getSigHashType());
            com.google.crypto.tink.subtle.Enums.HashType protoEnum2 = com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.HASH_TYPE_CONVERTER.toProtoEnum(parameters.getMgf1HashType());
            int saltLengthBytes = parameters.getSaltLengthBytes();
            byte[] byteArray = rsaSsaPssPrivateKey.getOutputPrefix().toByteArray();
            if (rsaSsaPssPrivateKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.LEGACY)) {
                bArr = legacyMessageSuffix;
            } else {
                bArr = EMPTY;
            }
            return new com.google.crypto.tink.subtle.RsaSsaPssSignJce.InternalImpl(rSAPrivateCrtKey, protoEnum, protoEnum2, saltLengthBytes, byteArray, bArr, null);
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.RsaSsaPssSignJce$1, reason: invalid class name */
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

    private static com.google.crypto.tink.signature.RsaSsaPssParameters.HashType getHashType(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.subtle.RsaSsaPssSignJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unsupported hash: ".concat(java.lang.String.valueOf(hashType)));
    }

    private com.google.crypto.tink.signature.RsaSsaPssPrivateKey convertKey(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.RsaSsaPssPrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.RsaSsaPssPublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setModulusSizeBits(rSAPrivateCrtKey.getModulus().bitLength()).setPublicExponent(rSAPrivateCrtKey.getPublicExponent()).setSigHashType(getHashType(hashType)).setMgf1HashType(getHashType(hashType2)).setSaltLengthBytes(i).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build()).setModulus(rSAPrivateCrtKey.getModulus()).build()).setPrimes(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrivateExponent(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getCrtCoefficient(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build();
    }

    public RsaSsaPssSignJce(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i) throws java.security.GeneralSecurityException {
        this.sign = create(convertKey(rSAPrivateCrtKey, hashType, hashType2, i));
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        return this.sign.sign(bArr);
    }
}
