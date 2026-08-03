package com.facebook.internal;

/* compiled from: FileLruCache.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\b'()*+,-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0087\u0002J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0019J\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010 \u001a\u00020\u0017H\u0002J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u000bH\u0002J\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u0003H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/internal/FileLruCache;", "", "tag", "", "limits", "Lcom/facebook/internal/FileLruCache$Limits;", "(Ljava/lang/String;Lcom/facebook/internal/FileLruCache$Limits;)V", "condition", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "directory", "Ljava/io/File;", "isTrimInProgress", "", "isTrimPending", "lastClearCacheTime", "Ljava/util/concurrent/atomic/AtomicLong;", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "getLocation", "()Ljava/lang/String;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "clearCache", "", "get", "Ljava/io/InputStream;", "key", "contentTag", "interceptAndPut", "input", "openPutStream", "Ljava/io/OutputStream;", "postTrim", "renameToTargetAndTrim", "buffer", "sizeInBytesForTest", "", "toString", "trim", "BufferFile", "CloseCallbackOutputStream", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "CopyingInputStream", "Limits", "ModifiedFile", "StreamCloseCallback", "StreamHeader", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileLruCache {
    private static final java.lang.String HEADER_CACHEKEY_KEY = "key";
    private static final java.lang.String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    private final java.util.concurrent.locks.Condition condition;
    private final java.io.File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private final java.util.concurrent.atomic.AtomicLong lastClearCacheTime;
    private final com.facebook.internal.FileLruCache.Limits limits;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final java.lang.String tag;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.FileLruCache.Companion INSTANCE = new com.facebook.internal.FileLruCache.Companion(null);
    private static final java.lang.String TAG = "FileLruCache";
    private static final java.util.concurrent.atomic.AtomicLong bufferIndex = new java.util.concurrent.atomic.AtomicLong();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "", "onClose", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    interface StreamCloseCallback {
        void onClose();
    }

    public final java.io.InputStream get(java.lang.String key) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return get$default(this, key, null, 2, null);
    }

    public final java.io.OutputStream openPutStream(java.lang.String key) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return openPutStream$default(this, key, null, 2, null);
    }

    public FileLruCache(java.lang.String tag, com.facebook.internal.FileLruCache.Limits limits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limits, "limits");
        this.tag = tag;
        this.limits = limits;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.io.File file = new java.io.File(com.facebook.FacebookSdk.getCacheDir(), tag);
        this.directory = file;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new java.util.concurrent.atomic.AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            com.facebook.internal.FileLruCache.BufferFile.INSTANCE.deleteAll(file);
        }
    }

    public final long sizeInBytesForTest() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.isTrimPending && !this.isTrimInProgress) {
                    break;
                }
                try {
                    this.condition.await();
                } catch (java.lang.InterruptedException unused) {
                }
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        reentrantLock.unlock();
        java.io.File[] listFiles = this.directory.listFiles();
        long j = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                java.io.File file = listFiles[i];
                i++;
                j += file.length();
            }
        }
        return j;
    }

    public static /* synthetic */ java.io.InputStream get$default(com.facebook.internal.FileLruCache fileLruCache, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public final java.io.InputStream get(java.lang.String key, java.lang.String contentTag) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.io.File file = this.directory;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        java.io.File file2 = new java.io.File(file, com.facebook.internal.Utility.md5hash(key));
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file2), 8192);
            boolean z = false;
            try {
                org.json.JSONObject readHeader = com.facebook.internal.FileLruCache.StreamHeader.INSTANCE.readHeader(bufferedInputStream);
                if (readHeader == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(readHeader.optString("key"), key)) {
                    bufferedInputStream.close();
                    return null;
                }
                java.lang.String optString = readHeader.optString("tag", null);
                if (contentTag == null && !kotlin.jvm.internal.Intrinsics.areEqual(contentTag, optString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new java.util.Date().getTime();
                com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "Setting lastModified to " + java.lang.Long.valueOf(time) + " for " + ((java.lang.Object) file2.getName()));
                file2.setLastModified(time);
                try {
                    return bufferedInputStream;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        bufferedInputStream.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ java.io.OutputStream openPutStream$default(com.facebook.internal.FileLruCache fileLruCache, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    public final java.io.OutputStream openPutStream(final java.lang.String key, java.lang.String contentTag) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        final java.io.File newFile = com.facebook.internal.FileLruCache.BufferFile.INSTANCE.newFile(this.directory);
        newFile.delete();
        if (!newFile.createNewFile()) {
            throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("Could not create file at ", newFile.getAbsolutePath()));
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(newFile);
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new com.facebook.internal.FileLruCache.CloseCallbackOutputStream(fileOutputStream, new com.facebook.internal.FileLruCache.StreamCloseCallback() { // from class: com.facebook.internal.FileLruCache$openPutStream$renameToTargetCallback$1
                @Override // com.facebook.internal.FileLruCache.StreamCloseCallback
                public void onClose() {
                    java.util.concurrent.atomic.AtomicLong atomicLong;
                    long j = currentTimeMillis;
                    atomicLong = this.lastClearCacheTime;
                    if (j >= atomicLong.get()) {
                        this.renameToTargetAndTrim(key, newFile);
                    } else {
                        newFile.delete();
                    }
                }
            }), 8192);
            boolean z = false;
            try {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("key", key);
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    if (!com.facebook.internal.Utility.isNullOrEmpty(contentTag)) {
                        jSONObject.put("tag", contentTag);
                    }
                    com.facebook.internal.FileLruCache.StreamHeader.INSTANCE.writeHeader(bufferedOutputStream, jSONObject);
                    z = true;
                    return bufferedOutputStream;
                } catch (org.json.JSONException e) {
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
                    java.lang.String TAG2 = TAG;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion.log(loggingBehavior, 5, TAG2, kotlin.jvm.internal.Intrinsics.stringPlus("Error creating JSON header for cache file: ", e));
                    throw new java.io.IOException(e.getMessage());
                }
            } catch (java.lang.Throwable th) {
                if (!z) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e2) {
            com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior2 = com.facebook.LoggingBehavior.CACHE;
            java.lang.String TAG3 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.log(loggingBehavior2, 5, TAG3, kotlin.jvm.internal.Intrinsics.stringPlus("Error creating buffer output stream: ", e2));
            throw new java.io.IOException(e2.getMessage());
        }
    }

    public final void clearCache() {
        final java.io.File[] listFiles = this.directory.listFiles(com.facebook.internal.FileLruCache.BufferFile.INSTANCE.excludeBufferFiles());
        this.lastClearCacheTime.set(java.lang.System.currentTimeMillis());
        if (listFiles != null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.internal.FileLruCache$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.internal.FileLruCache.m5183clearCache$lambda1(listFiles);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearCache$lambda-1, reason: not valid java name */
    public static final void m5183clearCache$lambda1(java.io.File[] filesToDelete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesToDelete, "filesToDelete");
        int length = filesToDelete.length;
        int i = 0;
        while (i < length) {
            java.io.File file = filesToDelete[i];
            i++;
            file.delete();
        }
    }

    public final java.lang.String getLocation() {
        java.lang.String path = this.directory.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "directory.path");
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renameToTargetAndTrim(java.lang.String key, java.io.File buffer) {
        java.io.File file = this.directory;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (!buffer.renameTo(new java.io.File(file, com.facebook.internal.Utility.md5hash(key)))) {
            buffer.delete();
        }
        postTrim();
    }

    public final java.io.InputStream interceptAndPut(java.lang.String key, java.io.InputStream input) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return new com.facebook.internal.FileLruCache.CopyingInputStream(input, openPutStream$default(this, key, null, 2, null));
    }

    public java.lang.String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + ((java.lang.Object) this.directory.getName()) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    private final void postTrim() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.internal.FileLruCache$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.internal.FileLruCache.m5184postTrim$lambda3$lambda2(com.facebook.internal.FileLruCache.this);
                    }
                });
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postTrim$lambda-3$lambda-2, reason: not valid java name */
    public static final void m5184postTrim$lambda3$lambda2(com.facebook.internal.FileLruCache this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trim();
    }

    private final void trim() {
        long j;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            try {
                com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "trim started");
                java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
                java.io.File[] listFiles = this.directory.listFiles(com.facebook.internal.FileLruCache.BufferFile.INSTANCE.excludeBufferFiles());
                long j2 = 0;
                if (listFiles != null) {
                    int length = listFiles.length;
                    j = 0;
                    int i = 0;
                    while (i < length) {
                        java.io.File file = listFiles[i];
                        i++;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "file");
                        com.facebook.internal.FileLruCache.ModifiedFile modifiedFile = new com.facebook.internal.FileLruCache.ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
                        com.facebook.LoggingBehavior loggingBehavior2 = com.facebook.LoggingBehavior.CACHE;
                        java.lang.String TAG3 = TAG;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                        companion2.log(loggingBehavior2, TAG3, "  trim considering time=" + java.lang.Long.valueOf(modifiedFile.getModified()) + " name=" + ((java.lang.Object) modifiedFile.getFile().getName()));
                        j2 += file.length();
                        j++;
                        listFiles = listFiles;
                    }
                } else {
                    j = 0;
                }
                while (true) {
                    if (j2 <= this.limits.getByteCount() && j <= this.limits.getFileCount()) {
                        this.lock.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            return;
                        } finally {
                        }
                    }
                    java.io.File file2 = ((com.facebook.internal.FileLruCache.ModifiedFile) priorityQueue.remove()).getFile();
                    com.facebook.internal.Logger.Companion companion3 = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior3 = com.facebook.LoggingBehavior.CACHE;
                    java.lang.String TAG4 = TAG;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    companion3.log(loggingBehavior3, TAG4, kotlin.jvm.internal.Intrinsics.stringPlus("  trim removing ", file2.getName()));
                    j2 -= file2.length();
                    j--;
                    file2.delete();
                }
            } catch (java.lang.Throwable th) {
                this.lock.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/FileLruCache$BufferFile;", "", "()V", "FILE_NAME_PREFIX", "", "filterExcludeBufferFiles", "Ljava/io/FilenameFilter;", "filterExcludeNonBufferFiles", "deleteAll", "", "root", "Ljava/io/File;", "excludeBufferFiles", "excludeNonBufferFiles", "newFile", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class BufferFile {
        private static final java.lang.String FILE_NAME_PREFIX = "buffer";
        public static final com.facebook.internal.FileLruCache.BufferFile INSTANCE = new com.facebook.internal.FileLruCache.BufferFile();
        private static final java.io.FilenameFilter filterExcludeBufferFiles = new java.io.FilenameFilter() { // from class: com.facebook.internal.FileLruCache$BufferFile$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                boolean m5186filterExcludeBufferFiles$lambda0;
                m5186filterExcludeBufferFiles$lambda0 = com.facebook.internal.FileLruCache.BufferFile.m5186filterExcludeBufferFiles$lambda0(file, str);
                return m5186filterExcludeBufferFiles$lambda0;
            }
        };
        private static final java.io.FilenameFilter filterExcludeNonBufferFiles = new java.io.FilenameFilter() { // from class: com.facebook.internal.FileLruCache$BufferFile$$ExternalSyntheticLambda1
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                boolean m5187filterExcludeNonBufferFiles$lambda1;
                m5187filterExcludeNonBufferFiles$lambda1 = com.facebook.internal.FileLruCache.BufferFile.m5187filterExcludeNonBufferFiles$lambda1(file, str);
                return m5187filterExcludeNonBufferFiles$lambda1;
            }
        };

        private BufferFile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: filterExcludeBufferFiles$lambda-0, reason: not valid java name */
        public static final boolean m5186filterExcludeBufferFiles$lambda0(java.io.File file, java.lang.String filename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filename, "filename");
            return !kotlin.text.StringsKt.startsWith$default(filename, FILE_NAME_PREFIX, false, 2, (java.lang.Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: filterExcludeNonBufferFiles$lambda-1, reason: not valid java name */
        public static final boolean m5187filterExcludeNonBufferFiles$lambda1(java.io.File file, java.lang.String filename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filename, "filename");
            return kotlin.text.StringsKt.startsWith$default(filename, FILE_NAME_PREFIX, false, 2, (java.lang.Object) null);
        }

        public final void deleteAll(java.io.File root) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(root, "root");
            java.io.File[] listFiles = root.listFiles(excludeNonBufferFiles());
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    java.io.File file = listFiles[i];
                    i++;
                    file.delete();
                }
            }
        }

        public final java.io.FilenameFilter excludeBufferFiles() {
            return filterExcludeBufferFiles;
        }

        public final java.io.FilenameFilter excludeNonBufferFiles() {
            return filterExcludeNonBufferFiles;
        }

        public final java.io.File newFile(java.io.File root) {
            return new java.io.File(root, kotlin.jvm.internal.Intrinsics.stringPlus(FILE_NAME_PREFIX, java.lang.Long.valueOf(com.facebook.internal.FileLruCache.bufferIndex.incrementAndGet())));
        }
    }

    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/internal/FileLruCache$StreamHeader;", "", "()V", "HEADER_VERSION", "", "readHeader", "Lorg/json/JSONObject;", "stream", "Ljava/io/InputStream;", "writeHeader", "", "Ljava/io/OutputStream;", "header", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class StreamHeader {
        private static final int HEADER_VERSION = 0;
        public static final com.facebook.internal.FileLruCache.StreamHeader INSTANCE = new com.facebook.internal.FileLruCache.StreamHeader();

        private StreamHeader() {
        }

        public final void writeHeader(java.io.OutputStream stream, org.json.JSONObject header) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "header");
            java.lang.String jSONObject = header.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "header.toString()");
            byte[] bytes = jSONObject.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write(bytes.length & 255);
            stream.write(bytes);
        }

        public final org.json.JSONObject readHeader(java.io.InputStream stream) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
            if (stream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = stream.read();
                if (read == -1) {
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
                    java.lang.String TAG = com.facebook.internal.FileLruCache.INSTANCE.getTAG();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    companion.log(loggingBehavior, TAG, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = stream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior2 = com.facebook.LoggingBehavior.CACHE;
                    java.lang.String TAG2 = com.facebook.internal.FileLruCache.INSTANCE.getTAG();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion2.log(loggingBehavior2, TAG2, "readHeader: stream.read stopped at " + java.lang.Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += read2;
            }
            try {
                java.lang.Object nextValue = new org.json.JSONTokener(new java.lang.String(bArr, kotlin.text.Charsets.UTF_8)).nextValue();
                if (!(nextValue instanceof org.json.JSONObject)) {
                    com.facebook.internal.Logger.Companion companion3 = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior3 = com.facebook.LoggingBehavior.CACHE;
                    java.lang.String TAG3 = com.facebook.internal.FileLruCache.INSTANCE.getTAG();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    companion3.log(loggingBehavior3, TAG3, kotlin.jvm.internal.Intrinsics.stringPlus("readHeader: expected JSONObject, got ", nextValue.getClass().getCanonicalName()));
                    return null;
                }
                return (org.json.JSONObject) nextValue;
            } catch (org.json.JSONException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }
    }

    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;", "Ljava/io/OutputStream;", "innerStream", "callback", "Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V", "getCallback", "()Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "getInnerStream", "()Ljava/io/OutputStream;", "close", "", "flush", "write", "buffer", "", "offset", "", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "oneByte", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class CloseCallbackOutputStream extends java.io.OutputStream {
        private final com.facebook.internal.FileLruCache.StreamCloseCallback callback;
        private final java.io.OutputStream innerStream;

        public CloseCallbackOutputStream(java.io.OutputStream innerStream, com.facebook.internal.FileLruCache.StreamCloseCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerStream, "innerStream");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.innerStream = innerStream;
            this.callback = callback;
        }

        public final com.facebook.internal.FileLruCache.StreamCloseCallback getCallback() {
            return this.callback;
        }

        public final java.io.OutputStream getInnerStream() {
            return this.innerStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
            this.innerStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer, int offset, int count) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.innerStream.write(buffer, offset, count);
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.innerStream.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int oneByte) throws java.io.IOException {
            this.innerStream.write(oneByte);
        }
    }

    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/FileLruCache$CopyingInputStream;", "Ljava/io/InputStream;", "input", "output", "Ljava/io/OutputStream;", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "getInput", "()Ljava/io/InputStream;", "getOutput", "()Ljava/io/OutputStream;", "available", "", "close", "", "mark", "readlimit", "markSupported", "", "read", "buffer", "", "offset", "length", "reset", "skip", "", "byteCount", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class CopyingInputStream extends java.io.InputStream {
        private final java.io.InputStream input;
        private final java.io.OutputStream output;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        public final java.io.InputStream getInput() {
            return this.input;
        }

        public final java.io.OutputStream getOutput() {
            return this.output;
        }

        public CopyingInputStream(java.io.InputStream input, java.io.OutputStream output) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            this.input = input;
            this.output = output;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return this.input.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int readlimit) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = this.input.read(buffer);
            if (read > 0) {
                this.output.write(buffer, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            int read = this.input.read();
            if (read >= 0) {
                this.output.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int offset, int length) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = this.input.read(buffer, offset, length);
            if (read > 0) {
                this.output.write(buffer, offset, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long byteCount) throws java.io.IOException {
            int read;
            byte[] bArr = new byte[1024];
            long j = 0;
            while (j < byteCount && (read = read(bArr, 0, (int) java.lang.Math.min(byteCount - j, 1024))) >= 0) {
                j += read;
            }
            return j;
        }
    }

    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/facebook/internal/FileLruCache$Limits;", "", "()V", "value", "", "byteCount", "getByteCount", "()I", "setByteCount", "(I)V", "fileCount", "getFileCount", "setFileCount", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Limits {
        private int byteCount = 1048576;
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final void setByteCount(int i) {
            if (i < 0) {
                throw new java.security.InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.byteCount = i;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setFileCount(int i) {
            if (i < 0) {
                throw new java.security.InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.fileCount = i;
        }
    }

    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/FileLruCache$ModifiedFile;", "", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "modified", "", "getModified", "()J", "compareTo", "", "another", "equals", "", "", "hashCode", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class ModifiedFile implements java.lang.Comparable<com.facebook.internal.FileLruCache.ModifiedFile> {
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final java.io.File file;
        private final long modified;

        public ModifiedFile(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
            this.modified = file.lastModified();
        }

        public final java.io.File getFile() {
            return this.file;
        }

        public final long getModified() {
            return this.modified;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.facebook.internal.FileLruCache.ModifiedFile another) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(another, "another");
            long j = this.modified;
            long j2 = another.modified;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.file.compareTo(another.file);
        }

        public boolean equals(java.lang.Object another) {
            return (another instanceof com.facebook.internal.FileLruCache.ModifiedFile) && compareTo((com.facebook.internal.FileLruCache.ModifiedFile) another) == 0;
        }

        public int hashCode() {
            return ((1073 + this.file.hashCode()) * 37) + ((int) (this.modified % Integer.MAX_VALUE));
        }
    }

    /* compiled from: FileLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/internal/FileLruCache$Companion;", "", "()V", "HEADER_CACHEKEY_KEY", "", "HEADER_CACHE_CONTENT_TAG_KEY", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "bufferIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getTAG() {
            return com.facebook.internal.FileLruCache.TAG;
        }
    }
}
