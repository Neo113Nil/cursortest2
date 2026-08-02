package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class PrfHmacJce implements com.google.crypto.tink.prf.Prf {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final java.lang.String algorithm;
    private final java.security.Key key;
    private final java.lang.ThreadLocal<javax.crypto.Mac> localMac;
    private final int maxOutputLength;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public PrfHmacJce(java.lang.String str, java.security.Key key) throws java.security.GeneralSecurityException {
        char c;
        java.lang.ThreadLocal<javax.crypto.Mac> threadLocal = new java.lang.ThreadLocal<javax.crypto.Mac>() { // from class: com.google.crypto.tink.subtle.PrfHmacJce.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public javax.crypto.Mac initialValue() {
                try {
                    javax.crypto.Mac engineFactory = com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(com.google.crypto.tink.subtle.PrfHmacJce.this.algorithm);
                    engineFactory.init(com.google.crypto.tink.subtle.PrfHmacJce.this.key);
                    return engineFactory;
                } catch (java.security.GeneralSecurityException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            }
        };
        this.localMac = threadLocal;
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.algorithm = str;
        this.key = key;
        if (key.getEncoded().length < 16) {
            throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.maxOutputLength = 20;
        } else if (c == 1) {
            this.maxOutputLength = 28;
        } else if (c == 2) {
            this.maxOutputLength = 32;
        } else if (c == 3) {
            this.maxOutputLength = 48;
        } else if (c == 4) {
            this.maxOutputLength = 64;
        } else {
            throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(java.lang.String.valueOf(str)));
        }
        threadLocal.get();
    }

    public static com.google.crypto.tink.prf.Prf create(com.google.crypto.tink.prf.HmacPrfKey hmacPrfKey) throws java.security.GeneralSecurityException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(org.jose4j.keys.HmacKey.ALGORITHM);
        sb.append(hmacPrfKey.getParameters().getHashType());
        return new com.google.crypto.tink.subtle.PrfHmacJce(sb.toString(), new javax.crypto.spec.SecretKeySpec(hmacPrfKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), org.jose4j.keys.HmacKey.ALGORITHM));
    }

    @Override // com.google.crypto.tink.prf.Prf
    public final byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (i > this.maxOutputLength) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        this.localMac.get().update(bArr);
        return java.util.Arrays.copyOf(this.localMac.get().doFinal(), i);
    }

    public final int getMaxOutputLength() {
        return this.maxOutputLength;
    }
}
