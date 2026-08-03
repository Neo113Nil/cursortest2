package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class SimpleCache implements com.google.android.exoplayer2.upstream.cache.Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final java.lang.String TAG = "SimpleCache";
    private static final java.lang.String UID_FILE_SUFFIX = ".uid";
    private static final java.util.HashSet<java.io.File> lockedCacheDirs = new java.util.HashSet<>();
    private final java.io.File cacheDir;
    private final com.google.android.exoplayer2.upstream.cache.CachedContentIndex contentIndex;
    private final com.google.android.exoplayer2.upstream.cache.CacheEvictor evictor;
    private final com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex fileIndex;
    private com.google.android.exoplayer2.upstream.cache.Cache.CacheException initializationException;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener>> listeners;
    private final java.util.Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    public static synchronized boolean isCacheFolderLocked(java.io.File file) {
        boolean contains;
        synchronized (com.google.android.exoplayer2.upstream.cache.SimpleCache.class) {
            contains = lockedCacheDirs.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    public static void delete(java.io.File file, com.google.android.exoplayer2.database.DatabaseProvider databaseProvider) {
        if (file.exists()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long loadUid = loadUid(listFiles);
                if (loadUid != -1) {
                    try {
                        com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex.delete(databaseProvider, loadUid);
                    } catch (com.google.android.exoplayer2.database.DatabaseIOException unused) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to delete file metadata: " + loadUid);
                    }
                    try {
                        com.google.android.exoplayer2.upstream.cache.CachedContentIndex.delete(databaseProvider, loadUid);
                    } catch (com.google.android.exoplayer2.database.DatabaseIOException unused2) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to delete file metadata: " + loadUid);
                    }
                }
            }
            com.google.android.exoplayer2.util.Util.recursiveDelete(file);
        }
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File file, com.google.android.exoplayer2.upstream.cache.CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, (byte[]) null, false);
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File file, com.google.android.exoplayer2.upstream.cache.CacheEvictor cacheEvictor, byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File file, com.google.android.exoplayer2.upstream.cache.CacheEvictor cacheEvictor, byte[] bArr, boolean z) {
        this(file, cacheEvictor, null, bArr, z, true);
    }

    public SimpleCache(java.io.File file, com.google.android.exoplayer2.upstream.cache.CacheEvictor cacheEvictor, com.google.android.exoplayer2.database.DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    public SimpleCache(java.io.File file, com.google.android.exoplayer2.upstream.cache.CacheEvictor cacheEvictor, com.google.android.exoplayer2.database.DatabaseProvider databaseProvider, byte[] bArr, boolean z, boolean z2) {
        this(file, cacheEvictor, new com.google.android.exoplayer2.upstream.cache.CachedContentIndex(databaseProvider, file, bArr, z, z2), (databaseProvider == null || z2) ? null : new com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex(databaseProvider));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.exoplayer2.upstream.cache.SimpleCache$1] */
    SimpleCache(java.io.File file, com.google.android.exoplayer2.upstream.cache.CacheEvictor cacheEvictor, com.google.android.exoplayer2.upstream.cache.CachedContentIndex cachedContentIndex, com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex cacheFileMetadataIndex) {
        if (!lockFolder(file)) {
            throw new java.lang.IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.cacheDir = file;
        this.evictor = cacheEvictor;
        this.contentIndex = cachedContentIndex;
        this.fileIndex = cacheFileMetadataIndex;
        this.listeners = new java.util.HashMap<>();
        this.random = new java.util.Random();
        this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
        this.uid = -1L;
        final android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        new java.lang.Thread("ExoPlayer:SimpleCacheInit") { // from class: com.google.android.exoplayer2.upstream.cache.SimpleCache.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (com.google.android.exoplayer2.upstream.cache.SimpleCache.this) {
                    conditionVariable.open();
                    com.google.android.exoplayer2.upstream.cache.SimpleCache.this.initialize();
                    com.google.android.exoplayer2.upstream.cache.SimpleCache.this.evictor.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    public synchronized void checkInitialization() throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        com.google.android.exoplayer2.upstream.cache.Cache.CacheException cacheException = this.initializationException;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
        return this.uid;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpans();
        try {
            try {
                this.contentIndex.store();
                unlockFolder(this.cacheDir);
            } catch (java.io.IOException e) {
                com.google.android.exoplayer2.util.Log.e(TAG, "Storing index file failed", e);
                unlockFolder(this.cacheDir);
            }
            this.released = true;
        } catch (java.lang.Throwable th) {
            unlockFolder(this.cacheDir);
            this.released = true;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> addListener(java.lang.String str, com.google.android.exoplayer2.upstream.cache.Cache.Listener listener) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(listener);
        java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(java.lang.String str, com.google.android.exoplayer2.upstream.cache.Cache.Listener listener) {
        if (this.released) {
            return;
        }
        java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> getCachedSpans(java.lang.String str) {
        java.util.TreeSet treeSet;
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent != null && !cachedContent.isEmpty()) {
            treeSet = new java.util.TreeSet((java.util.Collection) cachedContent.getSpans());
        }
        treeSet = new java.util.TreeSet();
        return treeSet;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.util.Set<java.lang.String> getKeys() {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        return new java.util.HashSet(this.contentIndex.getKeys());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWrite(java.lang.String str, long j, long j2) throws java.lang.InterruptedException, com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWriteNonBlocking;
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        checkInitialization();
        while (true) {
            startReadWriteNonBlocking = startReadWriteNonBlocking(str, j, j2);
            if (startReadWriteNonBlocking == null) {
                wait();
            }
        }
        return startReadWriteNonBlocking;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWriteNonBlocking(java.lang.String str, long j, long j2) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        checkInitialization();
        com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan span = getSpan(str, j, j2);
        if (span.isCached) {
            return touchSpan(str, span);
        }
        if (this.contentIndex.getOrAdd(str).lockRange(j, span.length)) {
            return span;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.io.File startFile(java.lang.String str, long j, long j2) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent;
        java.io.File file;
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        checkInitialization();
        cachedContent = this.contentIndex.get(str);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(cachedContent);
        com.google.android.exoplayer2.util.Assertions.checkState(cachedContent.isFullyLocked(j, j2));
        if (!this.cacheDir.exists()) {
            createCacheDirectories(this.cacheDir);
            removeStaleSpans();
        }
        this.evictor.onStartFile(this, str, j, j2);
        file = new java.io.File(this.cacheDir, java.lang.Integer.toString(this.random.nextInt(10)));
        if (!file.exists()) {
            createCacheDirectories(file);
        }
        return com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.getCacheFile(file, cachedContent.id, j, java.lang.System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(java.io.File file, long j) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        boolean z = true;
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan simpleCacheSpan = (com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createCacheEntry(file, j, this.contentIndex));
            com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = (com.google.android.exoplayer2.upstream.cache.CachedContent) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.contentIndex.get(simpleCacheSpan.key));
            com.google.android.exoplayer2.util.Assertions.checkState(cachedContent.isFullyLocked(simpleCacheSpan.position, simpleCacheSpan.length));
            long contentLength = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(cachedContent.getMetadata());
            if (contentLength != -1) {
                if (simpleCacheSpan.position + simpleCacheSpan.length > contentLength) {
                    z = false;
                }
                com.google.android.exoplayer2.util.Assertions.checkState(z);
            }
            if (this.fileIndex != null) {
                try {
                    this.fileIndex.set(file.getName(), simpleCacheSpan.length, simpleCacheSpan.lastTouchTimestamp);
                } catch (java.io.IOException e) {
                    throw new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(e);
                }
            }
            addSpan(simpleCacheSpan);
            try {
                this.contentIndex.store();
                notifyAll();
            } catch (java.io.IOException e2) {
                throw new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(e2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = (com.google.android.exoplayer2.upstream.cache.CachedContent) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.contentIndex.get(cacheSpan.key));
        cachedContent.unlockRange(cacheSpan.position);
        this.contentIndex.maybeRemove(cachedContent.key);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeResource(java.lang.String str) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        java.util.Iterator<com.google.android.exoplayer2.upstream.cache.CacheSpan> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        removeSpanInternal(cacheSpan);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r4.getCachedBytesLength(r5, r7) >= r7) goto L10;
     */
    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isCached(java.lang.String str, long j, long j2) {
        boolean z;
        z = true;
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent != null) {
        }
        z = false;
        return z;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(java.lang.String str, long j, long j2) {
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent;
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.contentIndex.get(str);
        return cachedContent != null ? cachedContent.getCachedBytesLength(j, j2) : -j2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedBytes(java.lang.String str, long j, long j2) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        j3 = 0;
        while (j < j5) {
            long cachedLength = getCachedLength(str, j, j5 - j);
            if (cachedLength > 0) {
                j3 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j += cachedLength;
        }
        return j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(java.lang.String str, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        checkInitialization();
        this.contentIndex.applyContentMetadataMutations(str, contentMetadataMutations);
        try {
            this.contentIndex.store();
        } catch (java.io.IOException e) {
            throw new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized com.google.android.exoplayer2.upstream.cache.ContentMetadata getContentMetadata(java.lang.String str) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        return this.contentIndex.getContentMetadata(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (com.google.android.exoplayer2.upstream.cache.Cache.CacheException e) {
                this.initializationException = e;
                return;
            }
        }
        java.io.File[] listFiles = this.cacheDir.listFiles();
        if (listFiles == null) {
            java.lang.String str = "Failed to list cache directory files: " + this.cacheDir;
            com.google.android.exoplayer2.util.Log.e(TAG, str);
            this.initializationException = new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(str);
            return;
        }
        long loadUid = loadUid(listFiles);
        this.uid = loadUid;
        if (loadUid == -1) {
            try {
                this.uid = createUid(this.cacheDir);
            } catch (java.io.IOException e2) {
                java.lang.String str2 = "Failed to create cache UID: " + this.cacheDir;
                com.google.android.exoplayer2.util.Log.e(TAG, str2, e2);
                this.initializationException = new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            this.contentIndex.initialize(this.uid);
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.initialize(this.uid);
                java.util.Map<java.lang.String, com.google.android.exoplayer2.upstream.cache.CacheFileMetadata> all = this.fileIndex.getAll();
                loadDirectory(this.cacheDir, true, listFiles, all);
                this.fileIndex.removeAll(all.keySet());
            } else {
                loadDirectory(this.cacheDir, true, listFiles, null);
            }
            this.contentIndex.removeEmpty();
            try {
                this.contentIndex.store();
            } catch (java.io.IOException e3) {
                com.google.android.exoplayer2.util.Log.e(TAG, "Storing index file failed", e3);
            }
        } catch (java.io.IOException e4) {
            java.lang.String str3 = "Failed to initialize cache indices: " + this.cacheDir;
            com.google.android.exoplayer2.util.Log.e(TAG, str3, e4);
            this.initializationException = new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(str3, e4);
        }
    }

    private void loadDirectory(java.io.File file, boolean z, java.io.File[] fileArr, java.util.Map<java.lang.String, com.google.android.exoplayer2.upstream.cache.CacheFileMetadata> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (java.io.File file2 : fileArr) {
            java.lang.String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z || (!com.google.android.exoplayer2.upstream.cache.CachedContentIndex.isIndexFile(name) && !name.endsWith(UID_FILE_SUFFIX))) {
                com.google.android.exoplayer2.upstream.cache.CacheFileMetadata remove = map != null ? map.remove(name) : null;
                if (remove != null) {
                    j2 = remove.length;
                    j = remove.lastTouchTimestamp;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createCacheEntry = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createCacheEntry(file2, j2, j, this.contentIndex);
                if (createCacheEntry != null) {
                    addSpan(createCacheEntry);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan touchSpan(java.lang.String str, com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan simpleCacheSpan) {
        boolean z;
        if (!this.touchCacheSpans) {
            return simpleCacheSpan;
        }
        java.lang.String name = ((java.io.File) com.google.android.exoplayer2.util.Assertions.checkNotNull(simpleCacheSpan.file)).getName();
        long j = simpleCacheSpan.length;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
        if (cacheFileMetadataIndex != null) {
            try {
                cacheFileMetadataIndex.set(name, j, currentTimeMillis);
            } catch (java.io.IOException unused) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan lastTouchTimestamp = this.contentIndex.get(str).setLastTouchTimestamp(simpleCacheSpan, currentTimeMillis, z);
        notifySpanTouched(simpleCacheSpan, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan getSpan(java.lang.String str, long j, long j2) {
        com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan span;
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent == null) {
            return com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createHole(str, j, j2);
        }
        while (true) {
            span = cachedContent.getSpan(j, j2);
            if (!span.isCached || span.file.length() == span.length) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    private void addSpan(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan simpleCacheSpan) {
        this.contentIndex.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private void removeSpanInternal(com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        com.google.android.exoplayer2.upstream.cache.CachedContent cachedContent = this.contentIndex.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            java.lang.String name = cacheSpan.file.getName();
            try {
                this.fileIndex.remove(name);
            } catch (java.io.IOException unused) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Failed to remove file index entry for: " + name);
            }
        }
        this.contentIndex.maybeRemove(cachedContent.key);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.exoplayer2.upstream.cache.CachedContent> it = this.contentIndex.getAll().iterator();
        while (it.hasNext()) {
            java.util.Iterator<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> it2 = it.next().getSpans().iterator();
            while (it2.hasNext()) {
                com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan next = it2.next();
                if (next.file.length() != next.length) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpanInternal((com.google.android.exoplayer2.upstream.cache.CacheSpan) arrayList.get(i));
        }
    }

    private void notifySpanRemoved(com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanAdded(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan simpleCacheSpan) {
        java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanTouched(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan simpleCacheSpan, com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan) {
        java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static long loadUid(java.io.File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            java.io.File file = fileArr[i];
            java.lang.String name = file.getName();
            if (name.endsWith(UID_FILE_SUFFIX)) {
                try {
                    return parseUid(name);
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static long createUid(java.io.File file) throws java.io.IOException {
        long nextLong = new java.security.SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : java.lang.Math.abs(nextLong);
        java.io.File file2 = new java.io.File(file, java.lang.Long.toString(abs, 16) + UID_FILE_SUFFIX);
        if (file2.createNewFile()) {
            return abs;
        }
        throw new java.io.IOException("Failed to create UID file: " + file2);
    }

    private static long parseUid(java.lang.String str) {
        return java.lang.Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private static void createCacheDirectories(java.io.File file) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        java.lang.String str = "Failed to create cache directory: " + file;
        com.google.android.exoplayer2.util.Log.e(TAG, str);
        throw new com.google.android.exoplayer2.upstream.cache.Cache.CacheException(str);
    }

    private static synchronized boolean lockFolder(java.io.File file) {
        boolean add;
        synchronized (com.google.android.exoplayer2.upstream.cache.SimpleCache.class) {
            add = lockedCacheDirs.add(file.getAbsoluteFile());
        }
        return add;
    }

    private static synchronized void unlockFolder(java.io.File file) {
        synchronized (com.google.android.exoplayer2.upstream.cache.SimpleCache.class) {
            lockedCacheDirs.remove(file.getAbsoluteFile());
        }
    }
}
