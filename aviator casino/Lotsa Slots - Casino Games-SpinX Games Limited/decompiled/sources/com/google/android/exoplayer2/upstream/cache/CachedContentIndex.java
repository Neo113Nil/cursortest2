package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
class CachedContentIndex {
    static final java.lang.String FILE_NAME_ATOMIC = "cached_content_index.exi";
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final android.util.SparseArray<java.lang.String> idToKey;
    private final java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> keyToContent;
    private final android.util.SparseBooleanArray newIds;
    private com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage previousStorage;
    private final android.util.SparseBooleanArray removedIds;
    private com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage storage;

    private interface Storage {
        void delete() throws java.io.IOException;

        boolean exists() throws java.io.IOException;

        void initialize(long j);

        void load(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap, android.util.SparseArray<java.lang.String> sparseArray) throws java.io.IOException;

        void onRemove(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent, boolean z);

        void onUpdate(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent);

        void storeFully(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException;

        void storeIncremental(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException;
    }

    public static boolean isIndexFile(java.lang.String str) {
        return str.startsWith(FILE_NAME_ATOMIC);
    }

    public static void delete(com.google.android.exoplayer2.database.DatabaseProvider databaseProvider, long j) throws com.google.android.exoplayer2.database.DatabaseIOException {
        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.DatabaseStorage.delete(databaseProvider, j);
    }

    public CachedContentIndex(com.google.android.exoplayer2.database.DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }

    public CachedContentIndex(com.google.android.exoplayer2.database.DatabaseProvider databaseProvider, java.io.File file, byte[] bArr, boolean z, boolean z2) {
        com.google.android.exoplayer2.util.Assertions.checkState((databaseProvider == null && file == null) ? false : true);
        this.keyToContent = new java.util.HashMap<>();
        this.idToKey = new android.util.SparseArray<>();
        this.removedIds = new android.util.SparseBooleanArray();
        this.newIds = new android.util.SparseBooleanArray();
        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.DatabaseStorage databaseStorage = databaseProvider != null ? new com.google.android.exoplayer2.upstream.cache.CachedContentIndex.DatabaseStorage(databaseProvider) : null;
        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.LegacyStorage legacyStorage = file != null ? new com.google.android.exoplayer2.upstream.cache.CachedContentIndex.LegacyStorage(new java.io.File(file, FILE_NAME_ATOMIC), bArr, z) : null;
        if (databaseStorage == null || (legacyStorage != null && z2)) {
            this.storage = (com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage) com.google.android.exoplayer2.util.Util.castNonNull(legacyStorage);
            this.previousStorage = databaseStorage;
        } else {
            this.storage = databaseStorage;
            this.previousStorage = legacyStorage;
        }
    }

    public void initialize(long j) throws java.io.IOException {
        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage storage;
        this.storage.initialize(j);
        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage storage2 = this.previousStorage;
        if (storage2 != null) {
            storage2.initialize(j);
        }
        if (!this.storage.exists() && (storage = this.previousStorage) != null && storage.exists()) {
            this.previousStorage.load(this.keyToContent, this.idToKey);
            this.storage.storeFully(this.keyToContent);
        } else {
            this.storage.load(this.keyToContent, this.idToKey);
        }
        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage storage3 = this.previousStorage;
        if (storage3 != null) {
            storage3.delete();
            this.previousStorage = null;
        }
    }

    public void store() throws java.io.IOException {
        this.storage.storeIncremental(this.keyToContent);
        int size = this.removedIds.size();
        for (int i = 0; i < size; i++) {
            this.idToKey.remove(this.removedIds.keyAt(i));
        }
        this.removedIds.clear();
        this.newIds.clear();
    }

    public com.google.android.exoplayer2.upstream.cache.CachedContent getOrAdd(java.lang.String str) {
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = this.keyToContent.get(str);
        return cachedContent == null ? addNew(str) : cachedContent;
    }

    public com.google.android.exoplayer2.upstream.cache.CachedContent get(java.lang.String str) {
        return this.keyToContent.get(str);
    }

    public java.util.Collection<com.google.android.exoplayer2.upstream.cache.CachedContent> getAll() {
        return java.util.Collections.unmodifiableCollection(this.keyToContent.values());
    }

    public int assignIdForKey(java.lang.String str) {
        return getOrAdd(str).id;
    }

    public java.lang.String getKeyForId(int i) {
        return this.idToKey.get(i);
    }

    public void maybeRemove(java.lang.String str) {
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent != null && cachedContent.isEmpty() && cachedContent.isFullyUnlocked()) {
            this.keyToContent.remove(str);
            int i = cachedContent.id;
            boolean z = this.newIds.get(i);
            this.storage.onRemove(cachedContent, z);
            if (z) {
                this.idToKey.remove(i);
                this.newIds.delete(i);
            } else {
                this.idToKey.put(i, null);
                this.removedIds.put(i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEmpty() {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.keyToContent.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((java.lang.String) it.next());
        }
    }

    public java.util.Set<java.lang.String> getKeys() {
        return this.keyToContent.keySet();
    }

    public void applyContentMetadataMutations(java.lang.String str, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations) {
        com.google.android.exoplayer2.upstream.cache.CachedContent orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(contentMetadataMutations)) {
            this.storage.onUpdate(orAdd);
        }
    }

    public com.google.android.exoplayer2.upstream.cache.ContentMetadata getContentMetadata(java.lang.String str) {
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = get(str);
        return cachedContent != null ? cachedContent.getMetadata() : com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.EMPTY;
    }

    private com.google.android.exoplayer2.upstream.cache.CachedContent addNew(java.lang.String str) {
        int newId = getNewId(this.idToKey);
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = new com.google.android.exoplayer2.upstream.cache.CachedContent(newId, str);
        this.keyToContent.put(str, cachedContent);
        this.idToKey.put(newId, str);
        this.newIds.put(newId, true);
        this.storage.onUpdate(cachedContent);
        return cachedContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static javax.crypto.Cipher getCipher() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        if (com.google.android.exoplayer2.util.Util.SDK_INT == 18) {
            try {
                return javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (java.lang.Throwable unused) {
            }
        }
        return javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    static int getNewId(android.util.SparseArray<java.lang.String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata readContentMetadata(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int readInt = dataInputStream.readInt();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < readInt; i++) {
            java.lang.String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new java.io.IOException("Invalid value size: " + readInt2);
            }
            int min = java.lang.Math.min(readInt2, INCREMENTAL_METADATA_READ_LENGTH);
            byte[] bArr = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = java.util.Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = java.lang.Math.min(readInt2 - i3, INCREMENTAL_METADATA_READ_LENGTH);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata defaultContentMetadata, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        java.util.Set<java.util.Map.Entry<java.lang.String, byte[]>> entrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    private static class LegacyStorage implements com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final com.google.android.exoplayer2.util.AtomicFile atomicFile;
        private com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream bufferedOutputStream;
        private boolean changed;
        private final javax.crypto.Cipher cipher;
        private final boolean encrypt;
        private final java.security.SecureRandom random;
        private final javax.crypto.spec.SecretKeySpec secretKeySpec;

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void initialize(long j) {
        }

        public LegacyStorage(java.io.File file, byte[] bArr, boolean z) {
            javax.crypto.Cipher cipher;
            javax.crypto.spec.SecretKeySpec secretKeySpec;
            com.google.android.exoplayer2.util.Assertions.checkState((bArr == null && z) ? false : true);
            if (bArr != null) {
                com.google.android.exoplayer2.util.Assertions.checkArgument(bArr.length == 16);
                try {
                    cipher = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.getCipher();
                    secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
                } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } else {
                com.google.android.exoplayer2.util.Assertions.checkArgument(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.encrypt = z;
            this.cipher = cipher;
            this.secretKeySpec = secretKeySpec;
            this.random = z ? new java.security.SecureRandom() : null;
            this.atomicFile = new com.google.android.exoplayer2.util.AtomicFile(file);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public boolean exists() {
            return this.atomicFile.exists();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void delete() {
            this.atomicFile.delete();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void load(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap, android.util.SparseArray<java.lang.String> sparseArray) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.changed);
            if (readFile(hashMap, sparseArray)) {
                return;
            }
            hashMap.clear();
            sparseArray.clear();
            this.atomicFile.delete();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeFully(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException {
            writeFile(hashMap);
            this.changed = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeIncremental(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException {
            if (this.changed) {
                storeFully(hashMap);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onUpdate(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent) {
            this.changed = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onRemove(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent, boolean z) {
            this.changed = true;
        }

        private boolean readFile(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap, android.util.SparseArray<java.lang.String> sparseArray) {
            java.io.BufferedInputStream bufferedInputStream;
            java.io.DataInputStream dataInputStream;
            if (!this.atomicFile.exists()) {
                return true;
            }
            java.io.DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new java.io.BufferedInputStream(this.atomicFile.openRead());
                dataInputStream = new java.io.DataInputStream(bufferedInputStream);
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                th = th;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.cipher != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream.readFully(bArr);
                            try {
                                this.cipher.init(2, (java.security.Key) com.google.android.exoplayer2.util.Util.castNonNull(this.secretKeySpec), new javax.crypto.spec.IvParameterSpec(bArr));
                                dataInputStream = new java.io.DataInputStream(new javax.crypto.CipherInputStream(bufferedInputStream, this.cipher));
                            } catch (java.security.InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new java.lang.IllegalStateException(e);
                            } catch (java.security.InvalidKeyException e2) {
                                e = e2;
                                throw new java.lang.IllegalStateException(e);
                            }
                        } else {
                            com.google.android.exoplayer2.util.Util.closeQuietly(dataInputStream);
                            return false;
                        }
                    } else if (this.encrypt) {
                        this.changed = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        com.google.android.exoplayer2.upstream.cache.CachedContent readCachedContent = readCachedContent(readInt, dataInputStream);
                        hashMap.put(readCachedContent.key, readCachedContent);
                        sparseArray.put(readCachedContent.id, readCachedContent.key);
                        i += hashCachedContent(readCachedContent, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i && z) {
                        com.google.android.exoplayer2.util.Util.closeQuietly(dataInputStream);
                        return true;
                    }
                    com.google.android.exoplayer2.util.Util.closeQuietly(dataInputStream);
                    return false;
                }
                com.google.android.exoplayer2.util.Util.closeQuietly(dataInputStream);
                return false;
            } catch (java.io.IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    com.google.android.exoplayer2.util.Util.closeQuietly(dataInputStream2);
                }
                return false;
            } catch (java.lang.Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    com.google.android.exoplayer2.util.Util.closeQuietly(dataInputStream2);
                }
                throw th;
            }
        }

        private void writeFile(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException {
            java.io.Closeable closeable = null;
            try {
                java.io.OutputStream startWrite = this.atomicFile.startWrite();
                com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
                if (reusableBufferedOutputStream == null) {
                    this.bufferedOutputStream = new com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream(startWrite);
                } else {
                    reusableBufferedOutputStream.reset(startWrite);
                }
                com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.bufferedOutputStream;
                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(reusableBufferedOutputStream2);
                try {
                    dataOutputStream.writeInt(2);
                    int i = 0;
                    dataOutputStream.writeInt(this.encrypt ? 1 : 0);
                    if (this.encrypt) {
                        byte[] bArr = new byte[16];
                        ((java.security.SecureRandom) com.google.android.exoplayer2.util.Util.castNonNull(this.random)).nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            ((javax.crypto.Cipher) com.google.android.exoplayer2.util.Util.castNonNull(this.cipher)).init(1, (java.security.Key) com.google.android.exoplayer2.util.Util.castNonNull(this.secretKeySpec), new javax.crypto.spec.IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream = new java.io.DataOutputStream(new javax.crypto.CipherOutputStream(reusableBufferedOutputStream2, this.cipher));
                        } catch (java.security.InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new java.lang.IllegalStateException(e);
                        } catch (java.security.InvalidKeyException e2) {
                            e = e2;
                            throw new java.lang.IllegalStateException(e);
                        }
                    }
                    dataOutputStream.writeInt(hashMap.size());
                    for (com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent : hashMap.values()) {
                        writeCachedContent(cachedContent, dataOutputStream);
                        i += hashCachedContent(cachedContent, 2);
                    }
                    dataOutputStream.writeInt(i);
                    this.atomicFile.endWrite(dataOutputStream);
                    com.google.android.exoplayer2.util.Util.closeQuietly(null);
                } catch (java.lang.Throwable th) {
                    th = th;
                    closeable = dataOutputStream;
                    com.google.android.exoplayer2.util.Util.closeQuietly(closeable);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }

        private int hashCachedContent(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent, int i) {
            int hashCode = (cachedContent.id * 31) + cachedContent.key.hashCode();
            if (i < 2) {
                long contentLength = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(cachedContent.getMetadata());
                return (hashCode * 31) + ((int) (contentLength ^ (contentLength >>> 32)));
            }
            return (hashCode * 31) + cachedContent.getMetadata().hashCode();
        }

        private com.google.android.exoplayer2.upstream.cache.CachedContent readCachedContent(int i, java.io.DataInputStream dataInputStream) throws java.io.IOException {
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata readContentMetadata;
            int readInt = dataInputStream.readInt();
            java.lang.String readUTF = dataInputStream.readUTF();
            if (i >= 2) {
                readContentMetadata = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.readContentMetadata(dataInputStream);
            } else {
                long readLong = dataInputStream.readLong();
                com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations();
                com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, readLong);
                readContentMetadata = com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            }
            return new com.google.android.exoplayer2.upstream.cache.CachedContent(readInt, readUTF, readContentMetadata);
        }

        private void writeCachedContent(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
            dataOutputStream.writeInt(cachedContent.id);
            dataOutputStream.writeUTF(cachedContent.key);
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), dataOutputStream);
        }
    }

    private static final class DatabaseStorage implements com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage {
        private static final java.lang.String[] COLUMNS = {"id", "key", "metadata"};
        private static final java.lang.String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final java.lang.String COLUMN_KEY = "key";
        private static final java.lang.String COLUMN_METADATA = "metadata";
        private static final java.lang.String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final java.lang.String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final java.lang.String WHERE_ID_EQUALS = "id = ?";
        private final com.google.android.exoplayer2.database.DatabaseProvider databaseProvider;
        private java.lang.String hexUid;
        private final android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> pendingUpdates = new android.util.SparseArray<>();
        private java.lang.String tableName;

        public static void delete(com.google.android.exoplayer2.database.DatabaseProvider databaseProvider, long j) throws com.google.android.exoplayer2.database.DatabaseIOException {
            delete(databaseProvider, java.lang.Long.toHexString(j));
        }

        public DatabaseStorage(com.google.android.exoplayer2.database.DatabaseProvider databaseProvider) {
            this.databaseProvider = databaseProvider;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void initialize(long j) {
            java.lang.String hexString = java.lang.Long.toHexString(j);
            this.hexUid = hexString;
            this.tableName = getTableName(hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public boolean exists() throws com.google.android.exoplayer2.database.DatabaseIOException {
            return com.google.android.exoplayer2.database.VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.hexUid)) != -1;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void delete() throws com.google.android.exoplayer2.database.DatabaseIOException {
            delete(this.databaseProvider, (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.hexUid));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void load(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap, android.util.SparseArray<java.lang.String> sparseArray) throws java.io.IOException {
            com.google.android.exoplayer2.util.Assertions.checkState(this.pendingUpdates.size() == 0);
            try {
                if (com.google.android.exoplayer2.database.VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.hexUid)) != 1) {
                    android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        initializeTable(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (java.lang.Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                android.database.Cursor cursor = getCursor();
                while (cursor.moveToNext()) {
                    try {
                        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = new com.google.android.exoplayer2.upstream.cache.CachedContent(cursor.getInt(0), (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(cursor.getString(1)), com.google.android.exoplayer2.upstream.cache.CachedContentIndex.readContentMetadata(new java.io.DataInputStream(new java.io.ByteArrayInputStream(cursor.getBlob(2)))));
                        hashMap.put(cachedContent.key, cachedContent);
                        sparseArray.put(cachedContent.id, cachedContent.key);
                    } finally {
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (android.database.sqlite.SQLiteException e) {
                hashMap.clear();
                sparseArray.clear();
                throw new com.google.android.exoplayer2.database.DatabaseIOException(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeFully(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    java.util.Iterator<com.google.android.exoplayer2.upstream.cache.CachedContent> it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.pendingUpdates.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (android.database.SQLException e) {
                throw new com.google.android.exoplayer2.database.DatabaseIOException(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeIncremental(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> hashMap) throws java.io.IOException {
            if (this.pendingUpdates.size() == 0) {
                return;
            }
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.pendingUpdates.size(); i++) {
                    try {
                        com.google.android.exoplayer2.upstream.cache.CachedContent valueAt = this.pendingUpdates.valueAt(i);
                        if (valueAt == null) {
                            deleteRow(writableDatabase, this.pendingUpdates.keyAt(i));
                        } else {
                            addOrUpdateRow(writableDatabase, valueAt);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.pendingUpdates.clear();
            } catch (android.database.SQLException e) {
                throw new com.google.android.exoplayer2.database.DatabaseIOException(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onUpdate(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent) {
            this.pendingUpdates.put(cachedContent.id, cachedContent);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onRemove(com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent, boolean z) {
            if (z) {
                this.pendingUpdates.delete(cachedContent.id);
            } else {
                this.pendingUpdates.put(cachedContent.id, null);
            }
        }

        private android.database.Cursor getCursor() {
            return this.databaseProvider.getReadableDatabase().query((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.tableName), COLUMNS, null, null, null, null, null);
        }

        private void initializeTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws com.google.android.exoplayer2.database.DatabaseIOException {
            com.google.android.exoplayer2.database.VersionTable.setVersion(sQLiteDatabase, 1, (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.hexUid), 1);
            dropTable(sQLiteDatabase, (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.tableName));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.tableName + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        private void deleteRow(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.tableName), WHERE_ID_EQUALS, new java.lang.String[]{java.lang.Integer.toString(i)});
        }

        private void addOrUpdateRow(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent) throws java.io.IOException {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), new java.io.DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("id", java.lang.Integer.valueOf(cachedContent.id));
            contentValues.put("key", cachedContent.key);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.tableName), null, contentValues);
        }

        private static void delete(com.google.android.exoplayer2.database.DatabaseProvider databaseProvider, java.lang.String str) throws com.google.android.exoplayer2.database.DatabaseIOException {
            try {
                java.lang.String tableName = getTableName(str);
                android.database.sqlite.SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    com.google.android.exoplayer2.database.VersionTable.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (android.database.SQLException e) {
                throw new com.google.android.exoplayer2.database.DatabaseIOException(e);
            }
        }

        private static void dropTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private static java.lang.String getTableName(java.lang.String str) {
            return TABLE_PREFIX + str;
        }
    }
}
