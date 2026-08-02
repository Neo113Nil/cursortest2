package okhttp3.internal.cache;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010)\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004hijgB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u001e\u0010\u001b\u001a\b\u0018\u00010\u001aR\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0018\u00010\u001eR\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u00112\n\u0010#\u001a\u00060\u001eR\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020$2\n\u0010+\u001a\u00060*R\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u0013J\r\u00100\u001a\u00020$¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\u0013J\r\u00103\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u0013J\r\u00104\u001a\u00020\u0011¢\u0006\u0004\b4\u0010\u0013J\r\u00105\u001a\u00020\u0011¢\u0006\u0004\b5\u0010\u0013J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0018H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u000009¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u001a\u0010\n\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010DR*\u0010\f\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010<R\u0014\u0010K\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010<R\u0014\u0010L\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010<R\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010FR\u0018\u0010M\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010NR>\u0010Q\u001a&\u0012\u0004\u0012\u00020\u0018\u0012\b\u0012\u00060*R\u00020\u00000Oj\u0012\u0012\u0004\u0012\u00020\u0018\u0012\b\u0012\u00060*R\u00020\u0000`P8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010?R\u0016\u0010V\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0016\u0010Y\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\"\u0010Z\u001a\u00020$8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bZ\u0010W\u001a\u0004\b[\u00101\"\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010WR\u0016\u0010_\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010WR\u0016\u0010`\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010FR\u0014\u0010b\u001a\u00020a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\be\u0010f"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/concurrent/Lockable;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokio/FileSystem;Lokio/Path;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "", "initialize", "()V", "Lokio/BufferedSink;", "Camera2StreamConfigurationMap", "()Lokio/BufferedSink;", "rebuildJournal$okhttp", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", io.ktor.http.ContentDisposition.Parameters.Size, "()J", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "getHighSpeedVideoFpsRangesFor", "flush", "isClosed", "()Z", "close", "trimToSize", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "evictAll", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)V", "", "snapshots", "()Ljava/util/Iterator;", "Lokio/Path;", "getDirectory", "()Lokio/Path;", com.visa.cbp.getEncExpo.warmup, "getValueCount$okhttp", "()I", "Lokio/FileSystem;", "getFileSystem$okhttp", "()Lokio/FileSystem;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "J", "getMaxSize", "setMaxSize", "(J)V", "journalFile", "journalFileTmp", "journalFileBackup", "journalWriter", "Lokio/BufferedSink;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Companion", "Snapshot", "Editor", "Entry"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable, okhttp3.internal.concurrent.Lockable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.cache.DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final okio.Path directory;
    private final okio.FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final okio.Path journalFile;
    private final okio.Path journalFileBackup;
    private final okio.Path journalFileTmp;
    private okio.BufferedSink journalWriter;
    private final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final java.lang.String JOURNAL_FILE = coil3.disk.DiskLruCache.JOURNAL_FILE;
    public static final java.lang.String JOURNAL_FILE_TEMP = coil3.disk.DiskLruCache.JOURNAL_FILE_TMP;
    public static final java.lang.String JOURNAL_FILE_BACKUP = coil3.disk.DiskLruCache.JOURNAL_FILE_BACKUP;
    public static final java.lang.String MAGIC = coil3.disk.DiskLruCache.MAGIC;
    public static final java.lang.String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final kotlin.text.Regex LEGAL_KEY_PATTERN = new kotlin.text.Regex("[a-z0-9_-]{1,120}");
    public static final java.lang.String CLEAN = "CLEAN";
    public static final java.lang.String DIRTY = "DIRTY";
    public static final java.lang.String REMOVE = "REMOVE";
    public static final java.lang.String READ = "READ";

    /* JADX WARN: Type inference failed for: r3v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(final okio.FileSystem fileSystem, okio.Path path, int i, int i2, long j, okhttp3.internal.concurrent.TaskRunner taskRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        this.directory = path;
        this.appVersion = i;
        this.valueCount = i2;
        this.fileSystem = new okio.ForwardingFileSystem(fileSystem) { // from class: okhttp3.internal.cache.DiskLruCache$fileSystem$1
            @Override // okio.ForwardingFileSystem, okio.FileSystem
            public final okio.Sink sink(okio.Path file, boolean mustCreate) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                okio.Path parent = file.parent();
                if (parent != null) {
                    createDirectories(parent);
                }
                return super.sink(file, mustCreate);
            }
        };
        this.maxSize = j;
        this.lruEntries = new java.util.LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
        sb.append(" Cache");
        final java.lang.String obj = sb.toString();
        this.cleanupTask = new okhttp3.internal.concurrent.Task(obj) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                boolean z;
                okio.BufferedSink bufferedSink;
                okhttp3.internal.cache.DiskLruCache diskLruCache = okhttp3.internal.cache.DiskLruCache.this;
                synchronized (diskLruCache) {
                    z = diskLruCache.initialized;
                    if (!z || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (java.io.IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (okhttp3.internal.cache.DiskLruCache.access$journalRebuildRequired(diskLruCache)) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (java.io.IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        bufferedSink = diskLruCache.journalWriter;
                        if (bufferedSink != null) {
                            okhttp3.internal._UtilCommonKt.closeQuietly(bufferedSink);
                        }
                        diskLruCache.journalWriter = okio.Okio.buffer(okio.Okio.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = path.resolve(JOURNAL_FILE);
        this.journalFileTmp = path.resolve(JOURNAL_FILE_TEMP);
        this.journalFileBackup = path.resolve(JOURNAL_FILE_BACKUP);
    }

    public final okio.Path getDirectory() {
        return this.directory;
    }

    /* renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    /* renamed from: getFileSystem$okhttp, reason: from getter */
    public final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.maxSize = j;
            if (this.initialized) {
                okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    public final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    /* renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a3 A[Catch: IOException -> 0x02a4, all -> 0x02e5, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x02a4, blocks: (B:26:0x0075, B:91:0x0236, B:92:0x0247, B:94:0x024d, B:105:0x025e, B:107:0x0263, B:97:0x0271, B:99:0x0279, B:101:0x029a, B:110:0x029e, B:113:0x02a3, B:133:0x0231), top: B:25:0x0075, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0236 A[Catch: IOException -> 0x02a4, all -> 0x02e5, TryCatch #3 {IOException -> 0x02a4, blocks: (B:26:0x0075, B:91:0x0236, B:92:0x0247, B:94:0x024d, B:105:0x025e, B:107:0x0263, B:97:0x0271, B:99:0x0279, B:101:0x029a, B:110:0x029e, B:113:0x02a3, B:133:0x0231), top: B:25:0x0075, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize() throws java.io.IOException {
        java.lang.Throwable th;
        java.lang.String substring;
        synchronized (this) {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this;
            if (okhttp3.internal._UtilJvmKt.assertionsEnabled && !java.lang.Thread.holdsLock(diskLruCache)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                sb.append(java.lang.Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new java.lang.AssertionError(sb.toString());
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = okhttp3.internal._UtilCommonKt.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    okio.BufferedSource buffer = okio.Okio.buffer(this.fileSystem.source(this.journalFile));
                    try {
                        okio.BufferedSource bufferedSource = buffer;
                        java.lang.String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                        java.lang.String readUtf8LineStrict2 = bufferedSource.readUtf8LineStrict();
                        java.lang.String readUtf8LineStrict3 = bufferedSource.readUtf8LineStrict();
                        java.lang.String readUtf8LineStrict4 = bufferedSource.readUtf8LineStrict();
                        java.lang.String readUtf8LineStrict5 = bufferedSource.readUtf8LineStrict();
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(MAGIC, readUtf8LineStrict) || !kotlin.jvm.internal.Intrinsics.areEqual(VERSION_1, readUtf8LineStrict2) || !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(this.appVersion), readUtf8LineStrict3) || !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(this.valueCount), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unexpected journal header: [");
                            sb2.append(readUtf8LineStrict);
                            sb2.append(", ");
                            sb2.append(readUtf8LineStrict2);
                            sb2.append(", ");
                            sb2.append(readUtf8LineStrict4);
                            sb2.append(", ");
                            sb2.append(readUtf8LineStrict5);
                            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                            throw new java.io.IOException(sb2.toString());
                        }
                        int i = 0;
                        while (true) {
                            try {
                                java.lang.String readUtf8LineStrict6 = bufferedSource.readUtf8LineStrict();
                                java.lang.String str = readUtf8LineStrict6;
                                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ' ', 0, false, 6, (java.lang.Object) null);
                                if (indexOf$default == -1) {
                                    throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(readUtf8LineStrict6)));
                                }
                                int i2 = indexOf$default + 1;
                                int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ' ', i2, false, 4, (java.lang.Object) null);
                                if (indexOf$default2 == -1) {
                                    substring = readUtf8LineStrict6.substring(i2);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                    java.lang.String str2 = REMOVE;
                                    if (indexOf$default == str2.length() && kotlin.text.StringsKt.startsWith$default(readUtf8LineStrict6, str2, false, 2, (java.lang.Object) null)) {
                                        this.lruEntries.remove(substring);
                                        i++;
                                    }
                                } else {
                                    substring = readUtf8LineStrict6.substring(i2, indexOf$default2);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                }
                                okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(substring);
                                if (entry == null) {
                                    entry = new okhttp3.internal.cache.DiskLruCache.Entry(this, substring);
                                    this.lruEntries.put(substring, entry);
                                }
                                if (indexOf$default2 != -1) {
                                    java.lang.String str3 = CLEAN;
                                    if (indexOf$default == str3.length() && kotlin.text.StringsKt.startsWith$default(readUtf8LineStrict6, str3, false, 2, (java.lang.Object) null)) {
                                        java.lang.String substring2 = readUtf8LineStrict6.substring(indexOf$default2 + 1);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                                        java.util.List<java.lang.String> split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring2, new char[]{' '}, false, 0, 6, (java.lang.Object) null);
                                        entry.setReadable$okhttp(true);
                                        entry.setCurrentEditor$okhttp(null);
                                        entry.setLengths$okhttp(split$default);
                                        i++;
                                    }
                                }
                                if (indexOf$default2 == -1) {
                                    java.lang.String str4 = DIRTY;
                                    if (indexOf$default == str4.length() && kotlin.text.StringsKt.startsWith$default(readUtf8LineStrict6, str4, false, 2, (java.lang.Object) null)) {
                                        entry.setCurrentEditor$okhttp(new okhttp3.internal.cache.DiskLruCache.Editor(this, entry));
                                        i++;
                                    }
                                }
                                if (indexOf$default2 != -1) {
                                    break;
                                }
                                java.lang.String str5 = READ;
                                if (indexOf$default != str5.length() || !kotlin.text.StringsKt.startsWith$default(readUtf8LineStrict6, str5, false, 2, (java.lang.Object) null)) {
                                    break;
                                } else {
                                    i++;
                                }
                            } catch (java.io.EOFException unused) {
                                this.redundantOpCount = i - this.lruEntries.size();
                                if (!bufferedSource.exhausted()) {
                                    rebuildJournal$okhttp();
                                } else {
                                    okio.BufferedSink bufferedSink = this.journalWriter;
                                    if (bufferedSink != null) {
                                        okhttp3.internal._UtilCommonKt.closeQuietly(bufferedSink);
                                    }
                                    this.journalWriter = Camera2StreamConfigurationMap();
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                if (buffer != null) {
                                    try {
                                        buffer.close();
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        if (th == null) {
                                            throw th;
                                        }
                                        okhttp3.internal._UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileTmp);
                                        java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> it = this.lruEntries.values().iterator();
                                        while (it.hasNext()) {
                                            okhttp3.internal.cache.DiskLruCache.Entry next = it.next();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "");
                                            okhttp3.internal.cache.DiskLruCache.Entry entry2 = next;
                                            if (entry2.getCurrentEditor() == null) {
                                                int i3 = this.valueCount;
                                                for (int i4 = 0; i4 < i3; i4++) {
                                                    this.size += entry2.getLengths()[i4];
                                                }
                                            } else {
                                                entry2.setCurrentEditor$okhttp(null);
                                                int i5 = this.valueCount;
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    okhttp3.internal._UtilCommonKt.deleteIfExists(this.fileSystem, entry2.getCleanFiles$okhttp().get(i6));
                                                    okhttp3.internal._UtilCommonKt.deleteIfExists(this.fileSystem, entry2.getDirtyFiles$okhttp().get(i6));
                                                }
                                                it.remove();
                                            }
                                        }
                                        this.initialized = true;
                                        return;
                                    }
                                }
                                th = null;
                                if (th == null) {
                                }
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (java.lang.Throwable th4) {
                                kotlin.ExceptionsKt.addSuppressed(th, th4);
                            }
                        }
                    }
                } catch (java.io.IOException e) {
                    okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("DiskLruCache ");
                    sb3.append(this.directory);
                    sb3.append(" is corrupt: ");
                    sb3.append(e.getMessage());
                    sb3.append(", removing");
                    platform.log(sb3.toString(), 5, e);
                    try {
                        delete();
                        this.closed = false;
                    } catch (java.lang.Throwable th5) {
                        this.closed = false;
                        throw th5;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    private final okio.BufferedSink Camera2StreamConfigurationMap() throws java.io.FileNotFoundException {
        return okio.Okio.buffer(new okhttp3.internal.cache.FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new kotlin.jvm.functions.Function1() { // from class: okhttp3.internal.cache.DiskLruCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return okhttp3.internal.cache.DiskLruCache.$r8$lambda$VuSpHTv0MA2f3ewEQIlkNS7IWTk(okhttp3.internal.cache.DiskLruCache.this, (java.io.IOException) obj);
            }
        }));
    }

    public final void rebuildJournal$okhttp() throws java.io.IOException {
        java.lang.Throwable th;
        synchronized (this) {
            okio.BufferedSink bufferedSink = this.journalWriter;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            okio.BufferedSink buffer = okio.Okio.buffer(this.fileSystem.sink(this.journalFileTmp, false));
            try {
                okio.BufferedSink bufferedSink2 = buffer;
                bufferedSink2.writeUtf8(MAGIC).writeByte(10);
                bufferedSink2.writeUtf8(VERSION_1).writeByte(10);
                bufferedSink2.writeDecimalLong(this.appVersion).writeByte(10);
                bufferedSink2.writeDecimalLong(this.valueCount).writeByte(10);
                bufferedSink2.writeByte(10);
                for (okhttp3.internal.cache.DiskLruCache.Entry entry : this.lruEntries.values()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entry, "");
                    okhttp3.internal.cache.DiskLruCache.Entry entry2 = entry;
                    if (entry2.getCurrentEditor() != null) {
                        bufferedSink2.writeUtf8(DIRTY).writeByte(32);
                        bufferedSink2.writeUtf8(entry2.getKey());
                        bufferedSink2.writeByte(10);
                    } else {
                        bufferedSink2.writeUtf8(CLEAN).writeByte(32);
                        bufferedSink2.writeUtf8(entry2.getKey());
                        entry2.writeLengths$okhttp(bufferedSink2);
                        bufferedSink2.writeByte(10);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (java.lang.Throwable th4) {
                        kotlin.ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
            }
            if (th == null) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    okhttp3.internal._UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                }
                okio.BufferedSink bufferedSink3 = this.journalWriter;
                if (bufferedSink3 != null) {
                    okhttp3.internal._UtilCommonKt.closeQuietly(bufferedSink3);
                }
                this.journalWriter = Camera2StreamConfigurationMap();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } else {
                throw th;
            }
        }
    }

    public final okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String key) throws java.io.IOException {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            initialize();
            getHighSpeedVideoFpsRangesFor();
            getHighResolutionOutputSizeshNQ4ISI(key);
            okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(key);
            if (entry == null) {
                return null;
            }
            okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp = entry.snapshot$okhttp();
            if (snapshot$okhttp == null) {
                return null;
            }
            this.redundantOpCount++;
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
            int i = this.redundantOpCount;
            if (i >= 2000 && i >= this.lruEntries.size()) {
                okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
            return snapshot$okhttp;
        }
    }

    public static /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor edit$default(okhttp3.internal.cache.DiskLruCache diskLruCache, java.lang.String str, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    public final okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String key, long expectedSequenceNumber) throws java.io.IOException {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            initialize();
            getHighSpeedVideoFpsRangesFor();
            getHighResolutionOutputSizeshNQ4ISI(key);
            okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(key);
            if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
                return null;
            }
            if ((entry != null ? entry.getCurrentEditor() : null) != null) {
                return null;
            }
            if (entry != null && entry.getLockingSourceCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                okio.BufferedSink bufferedSink = this.journalWriter;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
                bufferedSink.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (entry == null) {
                    entry = new okhttp3.internal.cache.DiskLruCache.Entry(this, key);
                    this.lruEntries.put(key, entry);
                }
                okhttp3.internal.cache.DiskLruCache.Editor editor = new okhttp3.internal.cache.DiskLruCache.Editor(this, entry);
                entry.setCurrentEditor$okhttp(editor);
                return editor;
            }
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return null;
        }
    }

    public final long size() throws java.io.IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    public final void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor editor, boolean success) throws java.io.IOException {
        int i;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editor, "");
            okhttp3.internal.cache.DiskLruCache.Entry entry = editor.getEntry();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (success && !entry.getReadable()) {
                int i2 = this.valueCount;
                for (int i3 = 0; i3 < i2; i3++) {
                    boolean[] written = editor.getWritten();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(written);
                    if (!written[i3]) {
                        editor.abort();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i3);
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i3))) {
                        editor.abort();
                        return;
                    }
                }
            }
            int i4 = this.valueCount;
            for (int i5 = 0; i5 < i4; i5++) {
                okio.Path path = entry.getDirtyFiles$okhttp().get(i5);
                if (success && !entry.getZombie()) {
                    if (this.fileSystem.exists(path)) {
                        okio.Path path2 = entry.getCleanFiles$okhttp().get(i5);
                        this.fileSystem.atomicMove(path, path2);
                        long j = entry.getLengths()[i5];
                        java.lang.Long size = this.fileSystem.metadata(path2).getSize();
                        long longValue = size != null ? size.longValue() : 0L;
                        entry.getLengths()[i5] = longValue;
                        this.size = (this.size - j) + longValue;
                    }
                } else {
                    okhttp3.internal._UtilCommonKt.deleteIfExists(this.fileSystem, path);
                }
            }
            entry.setCurrentEditor$okhttp(null);
            if (entry.getZombie()) {
                removeEntry$okhttp(entry);
                return;
            }
            this.redundantOpCount++;
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            if (entry.getReadable() || success) {
                entry.setReadable$okhttp(true);
                bufferedSink.writeUtf8(CLEAN).writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                entry.writeLengths$okhttp(bufferedSink);
                bufferedSink.writeByte(10);
                if (success) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.setSequenceNumber$okhttp(j2);
                }
            } else {
                this.lruEntries.remove(entry.getKey());
                bufferedSink.writeUtf8(REMOVE).writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                bufferedSink.writeByte(10);
            }
            bufferedSink.flush();
            if (this.size > this.maxSize || ((i = this.redundantOpCount) >= 2000 && i >= this.lruEntries.size())) {
                okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    public final boolean remove(java.lang.String key) throws java.io.IOException {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            initialize();
            getHighSpeedVideoFpsRangesFor();
            getHighResolutionOutputSizeshNQ4ISI(key);
            okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(key);
            if (entry == null) {
                return false;
            }
            boolean removeEntry$okhttp = removeEntry$okhttp(entry);
            if (removeEntry$okhttp && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return removeEntry$okhttp;
        }
    }

    public final boolean removeEntry$okhttp(okhttp3.internal.cache.DiskLruCache.Entry entry) throws java.io.IOException {
        okio.BufferedSink bufferedSink;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (bufferedSink = this.journalWriter) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        okhttp3.internal.cache.DiskLruCache.Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            okhttp3.internal._UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.redundantOpCount++;
        okio.BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        int i3 = this.redundantOpCount;
        if (i3 >= 2000 && i3 >= this.lruEntries.size()) {
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        synchronized (this) {
            if (this.closed) {
                throw new java.lang.IllegalStateException("cache is closed".toString());
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        synchronized (this) {
            if (this.initialized) {
                getHighSpeedVideoFpsRangesFor();
                trimToSize();
                okio.BufferedSink bufferedSink = this.journalWriter;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.flush();
            }
        }
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        okhttp3.internal.cache.DiskLruCache.Editor currentEditor;
        synchronized (this) {
            if (this.initialized && !this.closed) {
                java.util.Collection<okhttp3.internal.cache.DiskLruCache.Entry> values = this.lruEntries.values();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
                for (okhttp3.internal.cache.DiskLruCache.Entry entry : (okhttp3.internal.cache.DiskLruCache.Entry[]) values.toArray(new okhttp3.internal.cache.DiskLruCache.Entry[0])) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(entry);
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.detach$okhttp();
                    }
                }
                trimToSize();
                okio.BufferedSink bufferedSink = this.journalWriter;
                if (bufferedSink != null) {
                    okhttp3.internal._UtilCommonKt.closeQuietly(bufferedSink);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        removeEntry$okhttp(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void trimToSize() throws java.io.IOException {
        while (this.size > this.maxSize) {
            for (okhttp3.internal.cache.DiskLruCache.Entry entry : this.lruEntries.values()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entry, "");
                okhttp3.internal.cache.DiskLruCache.Entry entry2 = entry;
                if (!entry2.getZombie()) {
                    break;
                }
            }
            return;
        }
        this.mostRecentTrimFailed = false;
    }

    public final void delete() throws java.io.IOException {
        close();
        okhttp3.internal._UtilCommonKt.deleteContents(this.fileSystem, this.directory);
    }

    public final void evictAll() throws java.io.IOException {
        synchronized (this) {
            initialize();
            java.util.Collection<okhttp3.internal.cache.DiskLruCache.Entry> values = this.lruEntries.values();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
            for (okhttp3.internal.cache.DiskLruCache.Entry entry : (okhttp3.internal.cache.DiskLruCache.Entry[]) values.toArray(new okhttp3.internal.cache.DiskLruCache.Entry[0])) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(entry);
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        if (LEGAL_KEY_PATTERN.matches(p0)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(p0);
        sb.append('\"');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> snapshots() throws java.io.IOException {
        okhttp3.internal.cache.DiskLruCache$snapshots$1 diskLruCache$snapshots$1;
        synchronized (this) {
            initialize();
            diskLruCache$snapshots$1 = new okhttp3.internal.cache.DiskLruCache$snapshots$1(this);
        }
        return diskLruCache$snapshots$1;
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\rJ\u0013\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lokio/Source;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "getSource", "(I)Lokio/Source;", "getLength", "(I)J", "", "close", "()V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "[J", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Snapshot implements java.io.Closeable {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.List<okio.Source> getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final long[] getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(okhttp3.internal.cache.DiskLruCache diskLruCache, java.lang.String str, long j, java.util.List<? extends okio.Source> list, long[] jArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
            this.getHighSpeedVideoFpsRanges = diskLruCache;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighSpeedVideoSizes = list;
            this.getHighSpeedVideoFpsRanges = jArr;
        }

        /* renamed from: key, reason: from getter */
        public final java.lang.String getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final okhttp3.internal.cache.DiskLruCache.Editor edit() throws java.io.IOException {
            return this.getHighSpeedVideoFpsRanges.edit(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        }

        public final okio.Source getSource(int index) {
            return this.getHighSpeedVideoSizes.get(index);
        }

        public final long getLength(int index) {
            return this.getHighSpeedVideoFpsRanges[index];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            java.util.Iterator<okio.Source> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                okhttp3.internal._UtilCommonKt.closeQuietly(it.next());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "", "detach$okhttp", "()V", "", "index", "Lokio/Source;", "newSource", "(I)Lokio/Source;", "Lokio/Sink;", "newSink", "(I)Lokio/Sink;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.TestTagDone, "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Editor {
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Entry entry;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private final boolean[] written;

        public Editor(okhttp3.internal.cache.DiskLruCache diskLruCache, okhttp3.internal.cache.DiskLruCache.Entry entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        /* renamed from: getEntry$okhttp, reason: from getter */
        public final okhttp3.internal.cache.DiskLruCache.Entry getEntry() {
            return this.entry;
        }

        /* renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final void detach$okhttp() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final okio.Source newSource(int index) {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                okio.Source source = null;
                if (!this.entry.getReadable() || !kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    source = diskLruCache.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                } catch (java.io.FileNotFoundException unused) {
                }
                return source;
            }
        }

        public final okio.Sink newSink(int index) {
            final okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    return okio.Okio.blackhole();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zArr);
                    zArr[index] = true;
                }
                try {
                    return new okhttp3.internal.cache.FaultHidingSink(diskLruCache.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new kotlin.jvm.functions.Function1() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoFpsRangesFor;
                            highSpeedVideoFpsRangesFor = okhttp3.internal.cache.DiskLruCache.Editor.getHighSpeedVideoFpsRangesFor(okhttp3.internal.cache.DiskLruCache.this, this, (java.io.IOException) obj);
                            return highSpeedVideoFpsRangesFor;
                        }
                    });
                } catch (java.io.FileNotFoundException unused) {
                    return okio.Okio.blackhole();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(okhttp3.internal.cache.DiskLruCache diskLruCache, okhttp3.internal.cache.DiskLruCache.Editor editor, java.io.IOException iOException) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
            synchronized (diskLruCache) {
                editor.detach$okhttp();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return kotlin.Unit.INSTANCE;
        }

        public final void commit() throws java.io.IOException {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.done = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public final void abort() throws java.io.IOException {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit$okhttp(this, false);
                }
                this.done = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\"\u0010$\u001a\u00020#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R(\u0010.\u001a\b\u0018\u00010-R\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "key", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "setLengths$okhttp", "(Ljava/util/List;)V", "Lokio/BufferedSink;", "writer", "writeLengths$okhttp", "(Lokio/BufferedSink;)V", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Lokio/Path;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "lockingSourceCount", com.visa.cbp.getEncExpo.warmup, "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final class Entry {
        private final java.util.List<okio.Path> cleanFiles;
        private okhttp3.internal.cache.DiskLruCache.Editor currentEditor;
        private final java.util.List<okio.Path> dirtyFiles;
        private final java.lang.String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private boolean zombie;

        public Entry(okhttp3.internal.cache.DiskLruCache diskLruCache, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new java.util.ArrayList();
            this.dirtyFiles = new java.util.ArrayList();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            int length = sb.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i = 0; i < valueCount; i++) {
                sb.append(i);
                java.util.List<okio.Path> list = this.cleanFiles;
                okio.Path directory = this.this$0.getDirectory();
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                list.add(directory.resolve(obj));
                sb.append(".tmp");
                java.util.List<okio.Path> list2 = this.dirtyFiles;
                okio.Path directory2 = this.this$0.getDirectory();
                java.lang.String obj2 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                list2.add(directory2.resolve(obj2));
                sb.setLength(length);
            }
        }

        /* renamed from: getKey$okhttp, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        /* renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        public final java.util.List<okio.Path> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final java.util.List<okio.Path> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        /* renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        /* renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        /* renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final okhttp3.internal.cache.DiskLruCache.Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final void setCurrentEditor$okhttp(okhttp3.internal.cache.DiskLruCache.Editor editor) {
            this.currentEditor = editor;
        }

        /* renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        /* renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setLengths$okhttp(java.util.List<java.lang.String> strings) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
            if (strings.size() == this.this$0.getValueCount()) {
                try {
                    int size = strings.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = java.lang.Long.parseLong(strings.get(i));
                    }
                    return;
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strings)));
                }
            }
            throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strings)));
        }

        public final void writeLengths$okhttp(okio.BufferedSink writer) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            for (long j : this.lengths) {
                writer.writeByte(32).writeDecimalLong(j);
            }
        }

        public final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp() {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(diskLruCache)) {
                if (!this.readable) {
                    return null;
                }
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount = this.this$0.getValueCount();
                    for (int i = 0; i < valueCount; i++) {
                        java.util.ArrayList arrayList2 = arrayList;
                        final okio.ForwardingSource source = this.this$0.getFileSystem().source(this.cleanFiles.get(i));
                        if (!this.this$0.civilizedFileSystem) {
                            this.lockingSourceCount++;
                            final okhttp3.internal.cache.DiskLruCache diskLruCache2 = this.this$0;
                            source = new okio.ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                                private boolean getHighResolutionOutputSizeshNQ4ISI;

                                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    super.close();
                                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                                        return;
                                    }
                                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                                    okhttp3.internal.cache.DiskLruCache diskLruCache3 = diskLruCache2;
                                    okhttp3.internal.cache.DiskLruCache.Entry entry = this;
                                    synchronized (diskLruCache3) {
                                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                                        if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                                            diskLruCache3.removeEntry$okhttp(entry);
                                        }
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    }
                                }
                            };
                        }
                        arrayList2.add(source);
                    }
                    return new okhttp3.internal.cache.DiskLruCache.Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (java.io.FileNotFoundException unused) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        okhttp3.internal._UtilCommonKt.closeQuietly((okio.Source) it.next());
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (java.io.IOException unused2) {
                    }
                    return null;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST hold lock on ");
            sb.append(diskLruCache);
            throw new java.lang.AssertionError(sb.toString());
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VuSpHTv0MA2f3ewEQIlkNS7IWTk(okhttp3.internal.cache.DiskLruCache diskLruCache, java.io.IOException iOException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
        okhttp3.internal.cache.DiskLruCache diskLruCache2 = diskLruCache;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(diskLruCache2)) {
            diskLruCache.hasJournalErrors = true;
            return kotlin.Unit.INSTANCE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(diskLruCache2);
        throw new java.lang.AssertionError(sb.toString());
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(okhttp3.internal.cache.DiskLruCache diskLruCache) {
        int i = diskLruCache.redundantOpCount;
        return i >= 2000 && i >= diskLruCache.lruEntries.size();
    }

    public final okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String str) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return edit$default(this, str, 0L, 2, null);
    }
}
