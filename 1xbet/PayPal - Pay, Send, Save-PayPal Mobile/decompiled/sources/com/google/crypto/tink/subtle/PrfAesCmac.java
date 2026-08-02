package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class PrfAesCmac implements com.google.crypto.tink.prf.Prf {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localAesCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.subtle.PrfAesCmac.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
            try {
                return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
            } catch (java.security.GeneralSecurityException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    };
    private final javax.crypto.SecretKey keySpec;
    private byte[] subKey1;
    private byte[] subKey2;

    private static javax.crypto.Cipher instance() throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        return localAesCipher.get();
    }

    public PrfAesCmac(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(bArr.length);
        this.keySpec = new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
        generateSubKeys();
    }

    public static com.google.crypto.tink.prf.Prf create(com.google.crypto.tink.prf.AesCmacPrfKey aesCmacPrfKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.PrfAesCmac(aesCmacPrfKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()));
    }

    static int calcN(int i) {
        if (i == 0) {
            return 1;
        }
        return ((i - 1) / 16) + 1;
    }

    private static void xorBlock(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // com.google.crypto.tink.prf.Prf
    public final byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        byte[] xor;
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        javax.crypto.Cipher instance = instance();
        instance.init(1, this.keySpec);
        int calcN = calcN(bArr.length);
        if (calcN * 16 == bArr.length) {
            xor = com.google.crypto.tink.subtle.Bytes.xor(bArr, (calcN - 1) * 16, this.subKey1, 0, 16);
        } else {
            xor = com.google.crypto.tink.subtle.Bytes.xor(com.google.crypto.tink.mac.internal.AesUtil.cmacPad(java.util.Arrays.copyOfRange(bArr, (calcN - 1) * 16, bArr.length)), this.subKey2);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < calcN - 1; i2++) {
            xorBlock(bArr2, bArr, i2 * 16, bArr3);
            if (instance.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new java.lang.IllegalStateException("Cipher didn't write full block");
            }
        }
        xorBlock(bArr2, xor, 0, bArr3);
        if (instance.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : java.util.Arrays.copyOf(bArr2, i);
        }
        throw new java.lang.IllegalStateException("Cipher didn't write full block");
    }

    private void generateSubKeys() throws java.security.GeneralSecurityException {
        javax.crypto.Cipher instance = instance();
        instance.init(1, this.keySpec);
        byte[] dbl = com.google.crypto.tink.mac.internal.AesUtil.dbl(instance.doFinal(new byte[16]));
        this.subKey1 = dbl;
        this.subKey2 = com.google.crypto.tink.mac.internal.AesUtil.dbl(dbl);
    }
}
