package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class Random {
    private static final java.lang.ThreadLocal<java.security.SecureRandom> localRandom = new java.lang.ThreadLocal<java.security.SecureRandom>() { // from class: com.google.crypto.tink.internal.Random.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.security.SecureRandom initialValue() {
            return com.google.crypto.tink.internal.Random.newDefaultSecureRandom();
        }
    };

    private static java.security.SecureRandom create() {
        java.security.Provider providerOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        if (providerOrNull != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", providerOrNull);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        java.security.Provider providerWithReflectionOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerWithReflectionOrNull();
        if (providerWithReflectionOrNull != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", providerWithReflectionOrNull);
            } catch (java.security.GeneralSecurityException unused2) {
            }
        }
        return new java.security.SecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.security.SecureRandom newDefaultSecureRandom() {
        java.security.SecureRandom create = create();
        create.nextLong();
        return create;
    }

    public static byte[] randBytes(int i) {
        byte[] bArr = new byte[i];
        localRandom.get().nextBytes(bArr);
        return bArr;
    }

    public static final int randInt(int i) {
        return localRandom.get().nextInt(i);
    }

    public static final int randInt() {
        return localRandom.get().nextInt();
    }

    public static final void validateUsesConscrypt() throws java.security.GeneralSecurityException {
        java.lang.ThreadLocal<java.security.SecureRandom> threadLocal = localRandom;
        if (com.google.crypto.tink.internal.ConscryptUtil.isConscryptProvider(threadLocal.get().getProvider())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Requires GmsCore_OpenSSL, AndroidOpenSSL or Conscrypt to generate randomness, but got ");
        sb.append(threadLocal.get().getProvider().getName());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private Random() {
    }
}
