package com.google.crypto.tink.integration.android;

/* loaded from: classes4.dex */
public final class AndroidKeysetManager {
    private static final java.lang.String TAG = "AndroidKeysetManager";
    private static final java.lang.Object lock = new java.lang.Object();
    private com.google.crypto.tink.KeysetManager keysetManager;
    private final com.google.crypto.tink.Aead masterAead;
    private final com.google.crypto.tink.KeysetWriter writer;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    private AndroidKeysetManager(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder builder) {
        this.writer = new com.google.crypto.tink.integration.android.SharedPrefKeysetWriter(builder.context, builder.keysetName, builder.prefFileName);
        this.masterAead = builder.masterAead;
        this.keysetManager = builder.keysetManager;
    }

    public static final class Builder {
        private com.google.crypto.tink.KeysetManager keysetManager;
        private android.content.Context context = null;
        private java.lang.String keysetName = null;
        private java.lang.String prefFileName = null;
        private java.lang.String masterKeyUri = null;
        private com.google.crypto.tink.Aead masterAead = null;
        private boolean useKeystore = true;
        private com.google.crypto.tink.KeyTemplate keyTemplate = null;
        private com.google.crypto.tink.proto.KeyTemplate keyTemplateProto = null;

        public final com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withSharedPref(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new java.lang.IllegalArgumentException("need a keyset name");
            }
            this.context = context;
            this.keysetName = str;
            this.prefFileName = str2;
            return this;
        }

        public final com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withMasterKeyUri(java.lang.String str) {
            if (!str.startsWith(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX)) {
                throw new java.lang.IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.useKeystore) {
                throw new java.lang.IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.masterKeyUri = str;
            return this;
        }

        public final com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            this.keyTemplateProto = keyTemplate;
            return this;
        }

        public final com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withKeyTemplate(com.google.crypto.tink.KeyTemplate keyTemplate) {
            this.keyTemplate = keyTemplate;
            return this;
        }

        @java.lang.Deprecated
        public final com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        private static byte[] readKeysetFromPrefs(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException {
            android.content.SharedPreferences sharedPreferences;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("keysetName cannot be null");
            }
            android.content.Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
            }
            try {
                java.lang.String string = sharedPreferences.getString(str, null);
                if (string == null) {
                    return null;
                }
                return com.google.crypto.tink.subtle.Hex.decode(string);
            } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused) {
                throw new java.io.CharConversionException(java.lang.String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private com.google.crypto.tink.KeysetManager readKeysetInCleartext(byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
            return com.google.crypto.tink.KeysetManager.withKeysetHandle(com.google.crypto.tink.LegacyKeysetSerialization.parseKeyset(com.google.crypto.tink.BinaryKeysetReader.withBytes(bArr), com.google.crypto.tink.InsecureSecretKeyAccess.get()));
        }

        public final com.google.crypto.tink.integration.android.AndroidKeysetManager build() throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.integration.android.AndroidKeysetManager androidKeysetManager;
            synchronized (this) {
                if (this.keysetName == null) {
                    throw new java.lang.IllegalArgumentException("keysetName cannot be null");
                }
                com.google.crypto.tink.proto.KeyTemplate keyTemplate = this.keyTemplateProto;
                if (keyTemplate != null && this.keyTemplate == null) {
                    this.keyTemplate = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.TinkProtoParametersFormat.parse(keyTemplate.toByteArray()));
                }
                synchronized (com.google.crypto.tink.integration.android.AndroidKeysetManager.lock) {
                    byte[] readKeysetFromPrefs = readKeysetFromPrefs(this.context, this.keysetName, this.prefFileName);
                    if (readKeysetFromPrefs == null) {
                        if (this.masterKeyUri != null) {
                            this.masterAead = readOrGenerateNewMasterKey();
                        }
                        this.keysetManager = generateKeysetAndWriteToPrefs();
                    } else {
                        if (this.masterKeyUri != null && com.google.crypto.tink.integration.android.AndroidKeysetManager.isAtLeastM()) {
                            this.keysetManager = readMasterkeyDecryptAndParseKeyset(readKeysetFromPrefs);
                        }
                        this.keysetManager = readKeysetInCleartext(readKeysetFromPrefs);
                    }
                    androidKeysetManager = new com.google.crypto.tink.integration.android.AndroidKeysetManager(this);
                }
            }
            return androidKeysetManager;
        }

        private com.google.crypto.tink.Aead readOrGenerateNewMasterKey() throws java.security.GeneralSecurityException {
            if (!com.google.crypto.tink.integration.android.AndroidKeysetManager.isAtLeastM()) {
                java.lang.String unused = com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG;
                return null;
            }
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient androidKeystoreKmsClient = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient();
            try {
                boolean generateKeyIfNotExist = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.generateKeyIfNotExist(this.masterKeyUri);
                try {
                    return androidKeystoreKmsClient.getAead(this.masterKeyUri);
                } catch (java.security.GeneralSecurityException | java.security.ProviderException e) {
                    if (generateKeyIfNotExist) {
                        java.lang.String unused2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG;
                        return null;
                    }
                    throw new java.security.KeyStoreException(java.lang.String.format("the master key %s exists but is unusable", this.masterKeyUri), e);
                }
            } catch (java.security.GeneralSecurityException | java.security.ProviderException unused3) {
                java.lang.String unused4 = com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG;
                return null;
            }
        }

        private com.google.crypto.tink.KeysetManager generateKeysetAndWriteToPrefs() throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.KeyTemplate keyTemplate = this.keyTemplate;
            if (keyTemplate == null) {
                throw new java.security.GeneralSecurityException("cannot read or generate keyset");
            }
            com.google.crypto.tink.KeysetHandle generateNew = com.google.crypto.tink.KeysetHandle.generateNew(keyTemplate);
            com.google.crypto.tink.integration.android.AndroidKeysetManager.write(generateNew, new com.google.crypto.tink.integration.android.SharedPrefKeysetWriter(this.context, this.keysetName, this.prefFileName), this.masterAead);
            return com.google.crypto.tink.KeysetManager.withKeysetHandle(generateNew);
        }

        private com.google.crypto.tink.KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
            try {
                this.masterAead = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient().getAead(this.masterKeyUri);
                try {
                    return com.google.crypto.tink.KeysetManager.withKeysetHandle(com.google.crypto.tink.LegacyKeysetSerialization.parseEncryptedKeyset(com.google.crypto.tink.BinaryKeysetReader.withBytes(bArr), this.masterAead, new byte[0]));
                } catch (java.io.IOException | java.security.GeneralSecurityException e) {
                    try {
                        return readKeysetInCleartext(bArr);
                    } catch (java.io.IOException unused) {
                        throw e;
                    }
                }
            } catch (java.security.GeneralSecurityException | java.security.ProviderException e2) {
                try {
                    com.google.crypto.tink.KeysetManager readKeysetInCleartext = readKeysetInCleartext(bArr);
                    java.lang.String unused2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG;
                    return readKeysetInCleartext;
                } catch (java.io.IOException unused3) {
                    throw e2;
                }
            }
        }
    }

    public final com.google.crypto.tink.KeysetHandle getKeysetHandle() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeysetHandle keysetHandle;
        synchronized (this) {
            keysetHandle = this.keysetManager.getKeysetHandle();
        }
        return keysetHandle;
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.integration.android.AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager rotate = this.keysetManager.rotate(keyTemplate);
            this.keysetManager = rotate;
            write(rotate.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager add = this.keysetManager.add(keyTemplate);
            this.keysetManager = add;
            write(add.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager add(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager add = this.keysetManager.add(keyTemplate);
            this.keysetManager = add;
            write(add.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager setPrimary(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager primary = this.keysetManager.setPrimary(i);
            this.keysetManager = primary;
            write(primary.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.integration.android.AndroidKeysetManager promote(int i) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.integration.android.AndroidKeysetManager primary;
        synchronized (this) {
            primary = setPrimary(i);
        }
        return primary;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager enable(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager enable = this.keysetManager.enable(i);
            this.keysetManager = enable;
            write(enable.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager disable(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager disable = this.keysetManager.disable(i);
            this.keysetManager = disable;
            write(disable.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager delete(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager delete = this.keysetManager.delete(i);
            this.keysetManager = delete;
            write(delete.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final com.google.crypto.tink.integration.android.AndroidKeysetManager destroy(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.KeysetManager destroy = this.keysetManager.destroy(i);
            this.keysetManager = destroy;
            write(destroy.getKeysetHandle(), this.writer, this.masterAead);
        }
        return this;
    }

    public final boolean isUsingKeystore() {
        boolean z;
        synchronized (this) {
            z = this.masterAead != null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.KeysetWriter keysetWriter, com.google.crypto.tink.Aead aead) throws java.security.GeneralSecurityException {
        try {
            if (aead != null) {
                com.google.crypto.tink.LegacyKeysetSerialization.serializeEncryptedKeyset(keysetHandle, keysetWriter, aead, new byte[0]);
            } else {
                com.google.crypto.tink.LegacyKeysetSerialization.serializeKeyset(keysetHandle, keysetWriter, com.google.crypto.tink.InsecureSecretKeyAccess.get());
            }
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }
}
