package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class AesSiv implements com.google.crypto.tink.DeterministicAead {
    private final byte[] aesCtrKey;
    private final com.google.crypto.tink.subtle.PrfAesCmac cmacForS2V;
    private final byte[] outputPrefix;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final java.util.Collection<java.lang.Integer> KEY_SIZES = java.util.Arrays.asList(64);
    private static final byte[] BLOCK_ZERO = new byte[16];
    private static final byte[] BLOCK_ONE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localAesCtrCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.subtle.AesSiv.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
            try {
                return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
            } catch (java.security.GeneralSecurityException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    };

    public static com.google.crypto.tink.DeterministicAead create(com.google.crypto.tink.daead.AesSivKey aesSivKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.AesSiv(aesSivKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), aesSivKey.getOutputPrefix());
    }

    private AesSiv(byte[] bArr, com.google.crypto.tink.util.Bytes bytes) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!KEY_SIZES.contains(java.lang.Integer.valueOf(bArr.length))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key size: ");
            sb.append(bArr.length);
            sb.append(" bytes; key must have 64 bytes");
            throw new java.security.InvalidKeyException(sb.toString());
        }
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.aesCtrKey = java.util.Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.cmacForS2V = new com.google.crypto.tink.subtle.PrfAesCmac(copyOfRange);
        this.outputPrefix = bytes.toByteArray();
    }

    public AesSiv(byte[] bArr) throws java.security.GeneralSecurityException {
        this(bArr, com.google.crypto.tink.util.Bytes.copyFrom(new byte[0]));
    }

    private byte[] s2v(byte[]... bArr) throws java.security.GeneralSecurityException {
        byte[] xor;
        if (bArr.length == 0) {
            return this.cmacForS2V.compute(BLOCK_ONE, 16);
        }
        byte[] compute = this.cmacForS2V.compute(BLOCK_ZERO, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            compute = com.google.crypto.tink.subtle.Bytes.xor(com.google.crypto.tink.mac.internal.AesUtil.dbl(compute), this.cmacForS2V.compute(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            xor = com.google.crypto.tink.subtle.Bytes.xorEnd(bArr3, compute);
        } else {
            xor = com.google.crypto.tink.subtle.Bytes.xor(com.google.crypto.tink.mac.internal.AesUtil.cmacPad(bArr3), com.google.crypto.tink.mac.internal.AesUtil.dbl(compute));
        }
        return this.cmacForS2V.compute(xor, 16);
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public final byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length > 2147483631 - this.outputPrefix.length) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        javax.crypto.Cipher cipher = localAesCtrCipher.get();
        byte[] s2v = s2v(bArr2, bArr);
        byte[] bArr3 = (byte[]) s2v.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new javax.crypto.spec.SecretKeySpec(this.aesCtrKey, org.jose4j.keys.AesKey.ALGORITHM), new javax.crypto.spec.IvParameterSpec(bArr3));
        byte[] bArr4 = this.outputPrefix;
        byte[] copyOf = java.util.Arrays.copyOf(bArr4, bArr4.length + s2v.length + bArr.length);
        java.lang.System.arraycopy(s2v, 0, copyOf, this.outputPrefix.length, s2v.length);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, this.outputPrefix.length + s2v.length) == bArr.length) {
            return copyOf;
        }
        throw new java.security.GeneralSecurityException("not enough data written");
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public final byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        if (length < bArr3.length + 16) {
            throw new java.security.GeneralSecurityException("Ciphertext too short.");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        javax.crypto.Cipher cipher = localAesCtrCipher.get();
        byte[] bArr4 = this.outputPrefix;
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) copyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
        bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
        cipher.init(2, new javax.crypto.spec.SecretKeySpec(this.aesCtrKey, org.jose4j.keys.AesKey.ALGORITHM), new javax.crypto.spec.IvParameterSpec(bArr5));
        int length2 = this.outputPrefix.length + 16;
        int length3 = bArr.length - length2;
        byte[] doFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && doFinal == null && com.google.crypto.tink.subtle.SubtleUtil.isAndroid()) {
            doFinal = new byte[0];
        }
        if (com.google.crypto.tink.subtle.Bytes.equal(copyOfRange, s2v(bArr2, doFinal))) {
            return doFinal;
        }
        throw new javax.crypto.AEADBadTagException("Integrity check failed.");
    }
}
