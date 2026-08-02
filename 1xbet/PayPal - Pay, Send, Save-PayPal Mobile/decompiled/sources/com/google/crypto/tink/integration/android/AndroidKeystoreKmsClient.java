package com.google.crypto.tink.integration.android;

/* loaded from: classes4.dex */
public final class AndroidKeystoreKmsClient implements com.google.crypto.tink.KmsClient {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 40;
    public static final java.lang.String PREFIX = "android-keystore://";
    private static final java.lang.String TAG = "AndroidKeystoreKmsClient";
    private static final java.lang.Object keystoreLock = new java.lang.Object();
    private final java.lang.String keyUri;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    public AndroidKeystoreKmsClient() throws java.security.GeneralSecurityException {
        this(new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder());
    }

    @java.lang.Deprecated
    public AndroidKeystoreKmsClient(java.lang.String str) {
        this(new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder().setKeyUri(str));
    }

    private AndroidKeystoreKmsClient(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder builder) {
        this.keyUri = builder.keyUri;
    }

    public static final class Builder {
        java.lang.String keyUri = null;

        public Builder() {
            if (!com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.isAtLeastM()) {
                throw new java.lang.IllegalStateException("need Android Keystore on Android M or newer");
            }
        }

        public final com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder setKeyUri(java.lang.String str) {
            if (str == null || !str.toLowerCase(java.util.Locale.US).startsWith(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX)) {
                throw new java.lang.IllegalArgumentException("val must start with android-keystore://");
            }
            this.keyUri = str;
            return this;
        }

        public final com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient build() {
            return new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient(this);
        }
    }

    @Override // com.google.crypto.tink.KmsClient
    public final boolean doesSupport(java.lang.String str) {
        java.lang.String str2 = this.keyUri;
        if (str2 == null || !str2.equals(str)) {
            return this.keyUri == null && str.toLowerCase(java.util.Locale.US).startsWith(PREFIX);
        }
        return true;
    }

    @Override // com.google.crypto.tink.KmsClient
    public final com.google.crypto.tink.KmsClient withCredentials(java.lang.String str) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public final com.google.crypto.tink.KmsClient withDefaultCredentials() throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public final com.google.crypto.tink.Aead getAead(java.lang.String str) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Aead validateAead;
        java.lang.String str2 = this.keyUri;
        if (str2 != null && !str2.equals(str)) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("this client is bound to %s, cannot load keys bound to %s", this.keyUri, str));
        }
        try {
            synchronized (keystoreLock) {
                validateAead = validateAead(new com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm(com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str)));
            }
            return validateAead;
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    public final void deleteKey(java.lang.String str) throws java.security.GeneralSecurityException {
        java.lang.String validateKmsKeyUriAndRemovePrefix = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        synchronized (keystoreLock) {
            com.google.crypto.tink.integration.android.AndroidKeystore.deleteKey(validateKmsKeyUriAndRemovePrefix);
        }
    }

    final boolean hasKey(java.lang.String str) throws java.security.GeneralSecurityException {
        boolean hasKey;
        java.lang.String validateKmsKeyUriAndRemovePrefix = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        try {
            synchronized (keystoreLock) {
                hasKey = com.google.crypto.tink.integration.android.AndroidKeystore.hasKey(validateKmsKeyUriAndRemovePrefix);
            }
            return hasKey;
        } catch (java.lang.NullPointerException unused) {
            sleepRandomAmount();
            synchronized (keystoreLock) {
                return com.google.crypto.tink.integration.android.AndroidKeystore.hasKey(validateKmsKeyUriAndRemovePrefix);
            }
        }
    }

    private static void sleepRandomAmount() {
        try {
            java.lang.Thread.sleep((int) (java.lang.Math.random() * 40.0d));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public static com.google.crypto.tink.Aead getOrGenerateNewAeadKey(java.lang.String str) throws java.security.GeneralSecurityException, java.io.IOException {
        com.google.crypto.tink.Aead validateAead;
        java.lang.String validateKmsKeyUriAndRemovePrefix = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        synchronized (keystoreLock) {
            if (!com.google.crypto.tink.integration.android.AndroidKeystore.hasKey(validateKmsKeyUriAndRemovePrefix)) {
                com.google.crypto.tink.integration.android.AndroidKeystore.generateNewAes256GcmKey(validateKmsKeyUriAndRemovePrefix);
            }
            validateAead = validateAead(new com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm(validateKmsKeyUriAndRemovePrefix));
        }
        return validateAead;
    }

    public static void generateNewAeadKey(java.lang.String str) throws java.security.GeneralSecurityException {
        synchronized (keystoreLock) {
            java.lang.String validateKmsKeyUriAndRemovePrefix = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
            if (com.google.crypto.tink.integration.android.AndroidKeystore.hasKey(validateKmsKeyUriAndRemovePrefix)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
            }
            com.google.crypto.tink.integration.android.AndroidKeystore.generateNewAes256GcmKey(validateKmsKeyUriAndRemovePrefix);
        }
    }

    static boolean generateKeyIfNotExist(java.lang.String str) throws java.security.GeneralSecurityException {
        synchronized (keystoreLock) {
            java.lang.String validateKmsKeyUriAndRemovePrefix = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
            if (com.google.crypto.tink.integration.android.AndroidKeystore.hasKey(validateKmsKeyUriAndRemovePrefix)) {
                return false;
            }
            com.google.crypto.tink.integration.android.AndroidKeystore.generateNewAes256GcmKey(validateKmsKeyUriAndRemovePrefix);
            return true;
        }
    }

    private static com.google.crypto.tink.Aead validateAead(com.google.crypto.tink.Aead aead) throws java.security.GeneralSecurityException {
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(10);
        byte[] bArr = new byte[0];
        if (java.util.Arrays.equals(randBytes, aead.decrypt(aead.encrypt(randBytes, bArr), bArr))) {
            return aead;
        }
        throw new java.security.KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }
}
