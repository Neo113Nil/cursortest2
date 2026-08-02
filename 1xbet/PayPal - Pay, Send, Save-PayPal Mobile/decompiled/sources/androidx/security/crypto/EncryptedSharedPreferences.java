package androidx.security.crypto;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class EncryptedSharedPreferences implements android.content.SharedPreferences {
    final java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences.OnSharedPreferenceChangeListener> Camera2StreamConfigurationMap = new java.util.concurrent.CopyOnWriteArrayList<>();
    final com.google.crypto.tink.DeterministicAead getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final android.content.SharedPreferences getHighSpeedVideoSizes;
    final com.google.crypto.tink.Aead getInputSizeshNQ4ISI;

    private EncryptedSharedPreferences(java.lang.String str, java.lang.String str2, android.content.SharedPreferences sharedPreferences, com.google.crypto.tink.Aead aead, com.google.crypto.tink.DeterministicAead deterministicAead) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = sharedPreferences;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getInputSizeshNQ4ISI = aead;
        this.getHighResolutionOutputSizeshNQ4ISI = deterministicAead;
    }

    @java.lang.Deprecated
    public static android.content.SharedPreferences create(java.lang.String str, java.lang.String str2, android.content.Context context, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme) throws java.security.GeneralSecurityException, java.io.IOException {
        com.google.crypto.tink.daead.DeterministicAeadConfig.register();
        com.google.crypto.tink.aead.AeadConfig.register();
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.crypto.tink.KeysetHandle keysetHandle = new com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder().withKeyTemplate(com.google.crypto.tink.KeyTemplates.get(prefKeyEncryptionScheme.getHighResolutionOutputSizeshNQ4ISI)).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).withMasterKeyUri(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX.concat(java.lang.String.valueOf(str2))).build().getKeysetHandle();
        com.google.crypto.tink.KeysetHandle keysetHandle2 = new com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder().withKeyTemplate(com.google.crypto.tink.KeyTemplates.get(prefValueEncryptionScheme.getHighSpeedVideoFpsRangesFor)).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).withMasterKeyUri(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX.concat(java.lang.String.valueOf(str2))).build().getKeysetHandle();
        com.google.crypto.tink.DeterministicAead deterministicAead = (com.google.crypto.tink.DeterministicAead) keysetHandle.getPrimitive(com.google.crypto.tink.DeterministicAead.class);
        return new androidx.security.crypto.EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (com.google.crypto.tink.Aead) keysetHandle2.getPrimitive(com.google.crypto.tink.Aead.class), deterministicAead);
    }

    @java.lang.Deprecated
    public enum PrefKeyEncryptionScheme {
        AES256_SIV;

        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        PrefKeyEncryptionScheme() {
            this.getHighResolutionOutputSizeshNQ4ISI = r3;
        }
    }

    @java.lang.Deprecated
    public enum PrefValueEncryptionScheme {
        AES256_GCM;

        final java.lang.String getHighSpeedVideoFpsRangesFor;

        PrefValueEncryptionScheme() {
            this.getHighSpeedVideoFpsRangesFor = r3;
        }
    }

    static final class Editor implements android.content.SharedPreferences.Editor {
        private final android.content.SharedPreferences.Editor Camera2StreamConfigurationMap;
        private final androidx.security.crypto.EncryptedSharedPreferences getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final java.util.List<java.lang.String> getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList();

        Editor(androidx.security.crypto.EncryptedSharedPreferences encryptedSharedPreferences, android.content.SharedPreferences.Editor editor) {
            this.getHighSpeedVideoFpsRanges = encryptedSharedPreferences;
            this.Camera2StreamConfigurationMap = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            int length = bytes.length;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length + 8);
            allocate.putInt(androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING.getOutputMinFrameDuration);
            allocate.putInt(length);
            allocate.put(bytes);
            getHighSpeedVideoFpsRangesFor(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
            if (set == null) {
                set = new androidx.collection.ArraySet<>();
                set.add("__NULL__");
            }
            java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList(set.size());
            int size = set.size() * 4;
            java.util.Iterator<java.lang.String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(java.nio.charset.StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(size + 4);
            allocate.putInt(androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET.getOutputMinFrameDuration);
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            getHighSpeedVideoFpsRangesFor(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor putInt(java.lang.String str, int i) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
            allocate.putInt(androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT.getOutputMinFrameDuration);
            allocate.putInt(i);
            getHighSpeedVideoFpsRangesFor(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor putLong(java.lang.String str, long j) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(12);
            allocate.putInt(androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG.getOutputMinFrameDuration);
            allocate.putLong(j);
            getHighSpeedVideoFpsRangesFor(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
            allocate.putInt(androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT.getOutputMinFrameDuration);
            allocate.putFloat(f);
            getHighSpeedVideoFpsRangesFor(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(5);
            allocate.putInt(androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN.getOutputMinFrameDuration);
            allocate.put(z ? (byte) 1 : (byte) 0);
            getHighSpeedVideoFpsRangesFor(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor remove(java.lang.String str) {
            if (androidx.security.crypto.EncryptedSharedPreferences.getHighSpeedVideoFpsRanges(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" is a reserved key for the encryption keyset.");
                throw new java.lang.SecurityException(sb.toString());
            }
            this.Camera2StreamConfigurationMap.remove(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str));
            this.getHighSpeedVideoSizes.add(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final android.content.SharedPreferences.Editor clear() {
            this.getHighResolutionOutputSizeshNQ4ISI.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            Camera2StreamConfigurationMap();
            try {
                return this.Camera2StreamConfigurationMap.commit();
            } finally {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getHighSpeedVideoSizes.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            Camera2StreamConfigurationMap();
            this.Camera2StreamConfigurationMap.apply();
            getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoSizes.clear();
        }

        private void Camera2StreamConfigurationMap() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(false)) {
                for (java.lang.String str : this.getHighSpeedVideoFpsRanges.getAll().keySet()) {
                    if (!this.getHighSpeedVideoSizes.contains(str) && !androidx.security.crypto.EncryptedSharedPreferences.getHighSpeedVideoFpsRanges(str)) {
                        this.Camera2StreamConfigurationMap.remove(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str));
                    }
                }
            }
        }

        private void getHighSpeedVideoFpsRangesFor(java.lang.String str, byte[] bArr) {
            if (androidx.security.crypto.EncryptedSharedPreferences.getHighSpeedVideoFpsRanges(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" is a reserved key for the encryption keyset.");
                throw new java.lang.SecurityException(sb.toString());
            }
            this.getHighSpeedVideoSizes.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                androidx.security.crypto.EncryptedSharedPreferences encryptedSharedPreferences = this.getHighSpeedVideoFpsRanges;
                java.lang.String Camera2StreamConfigurationMap = encryptedSharedPreferences.Camera2StreamConfigurationMap(str);
                android.util.Pair pair = new android.util.Pair(Camera2StreamConfigurationMap, com.google.crypto.tink.subtle.Base64.encode(encryptedSharedPreferences.getInputSizeshNQ4ISI.encrypt(bArr, Camera2StreamConfigurationMap.getBytes(java.nio.charset.StandardCharsets.UTF_8))));
                this.Camera2StreamConfigurationMap.putString((java.lang.String) pair.first, (java.lang.String) pair.second);
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not encrypt data: ");
                sb2.append(e.getMessage());
                throw new java.lang.SecurityException(sb2.toString(), e);
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            java.util.Iterator<android.content.SharedPreferences.OnSharedPreferenceChangeListener> it = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                android.content.SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                java.util.Iterator<java.lang.String> it2 = this.getHighSpeedVideoSizes.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.getHighSpeedVideoFpsRanges, it2.next());
                }
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final java.util.Map<java.lang.String, ?> getAll() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.getHighSpeedVideoSizes.getAll().entrySet()) {
            java.lang.String key = entry.getKey();
            if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(key) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(key)) {
                java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(entry.getKey());
                hashMap.put(highSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        return highSpeedVideoSizes instanceof java.lang.String ? (java.lang.String) highSpeedVideoSizes : str2;
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Set<java.lang.String> arraySet;
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        if (highSpeedVideoSizes instanceof java.util.Set) {
            arraySet = (java.util.Set) highSpeedVideoSizes;
        } else {
            arraySet = new androidx.collection.ArraySet<>();
        }
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String str, int i) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        return highSpeedVideoSizes instanceof java.lang.Integer ? ((java.lang.Integer) highSpeedVideoSizes).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String str, long j) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        return highSpeedVideoSizes instanceof java.lang.Long ? ((java.lang.Long) highSpeedVideoSizes).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String str, float f) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        return highSpeedVideoSizes instanceof java.lang.Float ? ((java.lang.Float) highSpeedVideoSizes).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String str, boolean z) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        return highSpeedVideoSizes instanceof java.lang.Boolean ? ((java.lang.Boolean) highSpeedVideoSizes).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
        return new androidx.security.crypto.EncryptedSharedPreferences.Editor(this, this.getHighSpeedVideoSizes.edit());
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.Camera2StreamConfigurationMap.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.Camera2StreamConfigurationMap.remove(onSharedPreferenceChangeListener);
    }

    enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        final int getOutputMinFrameDuration;

        EncryptedType(int i) {
            this.getOutputMinFrameDuration = i;
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType Camera2StreamConfigurationMap(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }
    }

    final java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return com.google.crypto.tink.subtle.Base64.encode(this.getHighResolutionOutputSizeshNQ4ISI.encryptDeterministically(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), this.getHighSpeedVideoFpsRanges.getBytes()));
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not encrypt key. ");
            sb.append(e.getMessage());
            throw new java.lang.SecurityException(sb.toString(), e);
        }
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            java.lang.String str2 = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI.decryptDeterministically(com.google.crypto.tink.subtle.Base64.decode(str, 0), this.getHighSpeedVideoFpsRanges.getBytes()), java.nio.charset.StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not decrypt key. ");
            sb.append(e.getMessage());
            throw new java.lang.SecurityException(sb.toString(), e);
        }
    }

    static boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public static android.content.SharedPreferences create(android.content.Context context, java.lang.String str, androidx.security.crypto.MasterKey masterKey, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme) throws java.security.GeneralSecurityException, java.io.IOException {
        return create(str, masterKey.getHighSpeedVideoFpsRanges, context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    private java.lang.Object getHighSpeedVideoSizes(java.lang.String str) throws java.lang.SecurityException {
        if ("__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" is a reserved key for the encryption keyset.");
            throw new java.lang.SecurityException(sb.toString());
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str);
            java.lang.String string = this.getHighSpeedVideoSizes.getString(Camera2StreamConfigurationMap, null);
            if (string == null) {
                return null;
            }
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.getInputSizeshNQ4ISI.decrypt(com.google.crypto.tink.subtle.Base64.decode(string, 0), Camera2StreamConfigurationMap.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
            wrap.position(0);
            int i = wrap.getInt();
            androidx.security.crypto.EncryptedSharedPreferences.EncryptedType Camera2StreamConfigurationMap2 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.Camera2StreamConfigurationMap(i);
            if (Camera2StreamConfigurationMap2 == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown type ID for encrypted pref value: ");
                sb2.append(i);
                throw new java.lang.SecurityException(sb2.toString());
            }
            int ordinal = Camera2StreamConfigurationMap2.ordinal();
            if (ordinal == 0) {
                int i2 = wrap.getInt();
                java.nio.ByteBuffer slice = wrap.slice();
                wrap.limit(i2);
                java.lang.String obj = java.nio.charset.StandardCharsets.UTF_8.decode(slice).toString();
                if (obj.equals("__NULL__")) {
                    return null;
                }
                return obj;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return java.lang.Integer.valueOf(wrap.getInt());
                }
                if (ordinal == 3) {
                    return java.lang.Long.valueOf(wrap.getLong());
                }
                if (ordinal == 4) {
                    return java.lang.Float.valueOf(wrap.getFloat());
                }
                if (ordinal == 5) {
                    return java.lang.Boolean.valueOf(wrap.get() != 0);
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unhandled type for encrypted pref value: ");
                sb3.append(Camera2StreamConfigurationMap2);
                throw new java.lang.SecurityException(sb3.toString());
            }
            androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
            while (wrap.hasRemaining()) {
                int i3 = wrap.getInt();
                java.nio.ByteBuffer slice2 = wrap.slice();
                slice2.limit(i3);
                wrap.position(wrap.position() + i3);
                arraySet.add(java.nio.charset.StandardCharsets.UTF_8.decode(slice2).toString());
            }
            if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                return null;
            }
            return arraySet;
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Could not decrypt value. ");
            sb4.append(e.getMessage());
            throw new java.lang.SecurityException(sb4.toString(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String str) {
        if ("__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" is a reserved key for the encryption keyset.");
            throw new java.lang.SecurityException(sb.toString());
        }
        return this.getHighSpeedVideoSizes.contains(Camera2StreamConfigurationMap(str));
    }
}
