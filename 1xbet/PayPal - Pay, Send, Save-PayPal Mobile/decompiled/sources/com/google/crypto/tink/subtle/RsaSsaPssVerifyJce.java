package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPssVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    private final com.google.crypto.tink.PublicKeyVerify verify;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.Enums.HashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType> HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.Enums.HashType.SHA256, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).add(com.google.crypto.tink.subtle.Enums.HashType.SHA384, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384).add(com.google.crypto.tink.subtle.Enums.HashType.SHA512, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).build();
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};

    static final class InternalImpl implements com.google.crypto.tink.PublicKeyVerify {
        private final byte[] messageSuffix;
        private final com.google.crypto.tink.subtle.Enums.HashType mgf1Hash;
        private final byte[] outputPrefix;
        private final java.security.interfaces.RSAPublicKey publicKey;
        private final int saltLength;
        private final com.google.crypto.tink.subtle.Enums.HashType sigHash;

        /* synthetic */ InternalImpl(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i, byte[] bArr, byte[] bArr2, com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.AnonymousClass1 anonymousClass1) throws java.security.GeneralSecurityException {
            this(rSAPublicKey, hashType, hashType2, i, bArr, bArr2);
        }

        private InternalImpl(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
                throw new java.security.GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(hashType);
            if (!hashType.equals(hashType2)) {
                throw new java.security.GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
            this.publicKey = rSAPublicKey;
            this.sigHash = hashType;
            this.mgf1Hash = hashType2;
            this.saltLength = i;
            this.outputPrefix = bArr;
            this.messageSuffix = bArr2;
        }

        private void noPrefixVerify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            java.math.BigInteger publicExponent = this.publicKey.getPublicExponent();
            java.math.BigInteger modulus = this.publicKey.getModulus();
            int bitLength = (modulus.bitLength() + 7) / 8;
            int bitLength2 = (modulus.bitLength() + 6) / 8;
            if (bitLength != bArr.length) {
                throw new java.security.GeneralSecurityException("invalid signature's length");
            }
            java.math.BigInteger bytes2Integer = com.google.crypto.tink.subtle.SubtleUtil.bytes2Integer(bArr);
            if (bytes2Integer.compareTo(modulus) >= 0) {
                throw new java.security.GeneralSecurityException("signature out of range");
            }
            emsaPssVerify(bArr2, com.google.crypto.tink.subtle.SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
        }

        private void emsaPssVerify(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(this.sigHash);
            java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance(com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(this.sigHash));
            engineFactory.update(bArr);
            byte[] bArr3 = this.messageSuffix;
            if (bArr3.length != 0) {
                engineFactory.update(bArr3);
            }
            byte[] digest = engineFactory.digest();
            int digestLength = engineFactory.getDigestLength();
            int length = bArr2.length;
            if (length < this.saltLength + digestLength + 2) {
                throw new java.security.GeneralSecurityException("inconsistent");
            }
            if (bArr2[bArr2.length - 1] != -68) {
                throw new java.security.GeneralSecurityException("inconsistent");
            }
            int i2 = length - digestLength;
            int i3 = i2 - 1;
            byte[] copyOf = java.util.Arrays.copyOf(bArr2, i3);
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, copyOf.length, copyOf.length + digestLength);
            int i4 = 0;
            while (true) {
                int i5 = i3;
                java.security.MessageDigest messageDigest = engineFactory;
                byte[] bArr4 = digest;
                long j = (length * 8) - i;
                if (i4 < j) {
                    if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                        throw new java.security.GeneralSecurityException("inconsistent");
                    }
                    i4++;
                    i3 = i5;
                    engineFactory = messageDigest;
                    digest = bArr4;
                } else {
                    byte[] mgf1 = com.google.crypto.tink.subtle.SubtleUtil.mgf1(copyOfRange, i5, this.mgf1Hash);
                    int length2 = mgf1.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        bArr5[i6] = (byte) (mgf1[i6] ^ copyOf[i6]);
                    }
                    for (int i7 = 0; i7 <= j; i7++) {
                        int i8 = i7 / 8;
                        bArr5[i8] = (byte) ((~(1 << (7 - (i7 % 8)))) & bArr5[i8]);
                    }
                    int i9 = 0;
                    while (true) {
                        int i10 = this.saltLength;
                        int i11 = (i2 - i10) - 2;
                        if (i9 < i11) {
                            if (bArr5[i9] != 0) {
                                throw new java.security.GeneralSecurityException("inconsistent");
                            }
                            i9++;
                        } else {
                            if (bArr5[i11] != 1) {
                                throw new java.security.GeneralSecurityException("inconsistent");
                            }
                            byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr5, length2 - i10, length2);
                            int i12 = digestLength + 8;
                            byte[] bArr6 = new byte[this.saltLength + i12];
                            java.lang.System.arraycopy(bArr4, 0, bArr6, 8, bArr4.length);
                            java.lang.System.arraycopy(copyOfRange2, 0, bArr6, i12, copyOfRange2.length);
                            if (!com.google.crypto.tink.subtle.Bytes.equal(messageDigest.digest(bArr6), copyOfRange)) {
                                throw new java.security.GeneralSecurityException("inconsistent");
                            }
                            return;
                        }
                    }
                }
            }
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

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        byte[] bArr;
        try {
            return com.google.crypto.tink.signature.internal.RsaSsaPssVerifyConscrypt.create(rsaSsaPssPublicKey);
        } catch (java.security.NoSuchProviderException unused) {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(rsaSsaPssPublicKey.getModulus(), rsaSsaPssPublicKey.getParameters().getPublicExponent()));
            com.google.crypto.tink.signature.RsaSsaPssParameters parameters = rsaSsaPssPublicKey.getParameters();
            com.google.crypto.tink.subtle.Enums.HashType protoEnum = HASH_TYPE_CONVERTER.toProtoEnum(parameters.getSigHashType());
            com.google.crypto.tink.subtle.Enums.HashType protoEnum2 = HASH_TYPE_CONVERTER.toProtoEnum(parameters.getMgf1HashType());
            int saltLengthBytes = parameters.getSaltLengthBytes();
            byte[] byteArray = rsaSsaPssPublicKey.getOutputPrefix().toByteArray();
            if (rsaSsaPssPublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.LEGACY)) {
                bArr = legacyMessageSuffix;
            } else {
                bArr = EMPTY;
            }
            return new com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.InternalImpl(rSAPublicKey, protoEnum, protoEnum2, saltLengthBytes, byteArray, bArr, null);
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.RsaSsaPssVerifyJce$1, reason: invalid class name */
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
        int i = com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
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

    private com.google.crypto.tink.signature.RsaSsaPssPublicKey convertKey(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.RsaSsaPssPublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setModulusSizeBits(rSAPublicKey.getModulus().bitLength()).setPublicExponent(rSAPublicKey.getPublicExponent()).setSigHashType(getHashType(hashType)).setMgf1HashType(getHashType(hashType2)).setSaltLengthBytes(i).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build()).setModulus(rSAPublicKey.getModulus()).build();
    }

    public RsaSsaPssVerifyJce(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i) throws java.security.GeneralSecurityException {
        this.verify = create(convertKey(rSAPublicKey, hashType, hashType2, i));
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.verify.verify(bArr, bArr2);
    }
}
