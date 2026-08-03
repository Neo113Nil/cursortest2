package coil.disk;

/* compiled from: DiskLruCache.kt */
@kotlin.Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001$\b\u0000\u0018\u0000 F2\u00060\u0002j\u0002`\u00012\u00020\u0003:\u0004CDEFB7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0002J\u0017\u0010.\u001a\b\u0018\u00010/R\u00020\u00002\u0006\u00100\u001a\u00020\u0016H\u0086\u0002J\u0014\u00101\u001a\b\u0018\u000102R\u00020\u00002\u0006\u00100\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u000bJ\u001c\u00103\u001a\u00020'2\n\u00104\u001a\u000602R\u00020\u00002\u0006\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u000e\u00107\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0016J\u0014\u00108\u001a\u00020\u001f2\n\u00109\u001a\u00060\u0017R\u00020\u0000H\u0002J\b\u0010:\u001a\u00020'H\u0002J\b\u0010;\u001a\u00020'H\u0016J\b\u0010<\u001a\u00020'H\u0016J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020'H\u0002J\u0006\u0010@\u001a\u00020'J\b\u0010A\u001a\u00020'H\u0002J\u0010\u0010B\u001a\u00020'2\u0006\u00100\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060\u0017R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%¨\u0006G"}, d2 = {"Lcoil/disk/DiskLruCache;", "Lokio/Closeable;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokio/FileSystem;", "directory", "Lokio/Path;", "cleanupDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "maxSize", "", "appVersion", "", "valueCount", "<init>", "(Lokio/FileSystem;Lokio/Path;Lkotlinx/coroutines/CoroutineDispatcher;JII)V", "journalFile", "journalFileTmp", "journalFileBackup", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lcoil/disk/DiskLruCache$Entry;", "cleanupScope", "Lkotlinx/coroutines/CoroutineScope;", "size", "operationsSinceRewrite", "journalWriter", "Lokio/BufferedSink;", "hasJournalErrors", "", "initialized", "closed", "mostRecentTrimFailed", "mostRecentRebuildFailed", "coil/disk/DiskLruCache$fileSystem$1", "Lcoil/disk/DiskLruCache$fileSystem$1;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "readJournal", "newJournalWriter", "readJournalLine", "line", "processJournal", "writeJournal", "get", "Lcoil/disk/DiskLruCache$Snapshot;", com.ironsource.X3.i.W, "edit", "Lcoil/disk/DiskLruCache$Editor;", "completeEdit", "editor", "success", "journalRewriteRequired", "remove", "removeEntry", "entry", "checkNotClosed", "close", "flush", "trimToSize", "removeOldestEntry", "delete", "evictAll", "launchCleanup", "validateKey", "Snapshot", "Editor", "Entry", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable {
    private static final java.lang.String CLEAN = "CLEAN";
    private static final java.lang.String DIRTY = "DIRTY";
    public static final java.lang.String JOURNAL_FILE = "journal";
    public static final java.lang.String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final java.lang.String JOURNAL_FILE_TMP = "journal.tmp";
    public static final java.lang.String MAGIC = "libcore.io.DiskLruCache";
    private static final java.lang.String READ = "READ";
    private static final java.lang.String REMOVE = "REMOVE";
    public static final java.lang.String VERSION = "1";
    private final int appVersion;
    private final kotlinx.coroutines.CoroutineScope cleanupScope;
    private boolean closed;
    private final okio.Path directory;
    private final coil.disk.DiskLruCache$fileSystem$1 fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final okio.Path journalFile;
    private final okio.Path journalFileBackup;
    private final okio.Path journalFileTmp;
    private okio.BufferedSink journalWriter;
    private final java.util.LinkedHashMap<java.lang.String, coil.disk.DiskLruCache.Entry> lruEntries;
    private final long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private int operationsSinceRewrite;
    private long size;
    private final int valueCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.disk.DiskLruCache.Companion INSTANCE = new coil.disk.DiskLruCache.Companion(null);
    private static final kotlin.text.Regex LEGAL_KEY_PATTERN = new kotlin.text.Regex("[a-z0-9_-]{1,120}");

    /* JADX WARN: Type inference failed for: r4v11, types: [coil.disk.DiskLruCache$fileSystem$1] */
    public DiskLruCache(final okio.FileSystem fileSystem, okio.Path path, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, long j, int i, int i2) {
        this.directory = path;
        this.maxSize = j;
        this.appVersion = i;
        this.valueCount = i2;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = path.resolve(JOURNAL_FILE);
        this.journalFileTmp = path.resolve(JOURNAL_FILE_TMP);
        this.journalFileBackup = path.resolve(JOURNAL_FILE_BACKUP);
        this.lruEntries = new java.util.LinkedHashMap<>(0, 0.75f, true);
        this.cleanupScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.fileSystem = new okio.ForwardingFileSystem(fileSystem) { // from class: coil.disk.DiskLruCache$fileSystem$1
            @Override // okio.ForwardingFileSystem, okio.FileSystem
            public okio.Sink sink(okio.Path file, boolean mustCreate) {
                okio.Path parent = file.parent();
                if (parent != null) {
                    createDirectories(parent);
                }
                return super.sink(file, mustCreate);
            }
        };
    }

    public final synchronized void initialize() {
        if (this.initialized) {
            return;
        }
        delete(this.journalFileTmp);
        if (exists(this.journalFileBackup)) {
            if (exists(this.journalFile)) {
                delete(this.journalFileBackup);
            } else {
                atomicMove(this.journalFileBackup, this.journalFile);
            }
        }
        if (exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (java.io.IOException unused) {
                try {
                    delete();
                    this.closed = false;
                } catch (java.lang.Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        writeJournal();
        this.initialized = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void readJournal() {
        okio.BufferedSource buffer = okio.Okio.buffer(source(this.journalFile));
        try {
            okio.BufferedSource bufferedSource = buffer;
            java.lang.String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            java.lang.String readUtf8LineStrict2 = bufferedSource.readUtf8LineStrict();
            java.lang.String readUtf8LineStrict3 = bufferedSource.readUtf8LineStrict();
            java.lang.String readUtf8LineStrict4 = bufferedSource.readUtf8LineStrict();
            java.lang.String readUtf8LineStrict5 = bufferedSource.readUtf8LineStrict();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(MAGIC, readUtf8LineStrict) || !kotlin.jvm.internal.Intrinsics.areEqual("1", readUtf8LineStrict2) || !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(this.appVersion), readUtf8LineStrict3) || !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(this.valueCount), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                throw new java.io.IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict3 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(bufferedSource.readUtf8LineStrict());
                    i++;
                } catch (java.io.EOFException unused) {
                    this.operationsSinceRewrite = i - this.lruEntries.size();
                    if (bufferedSource.exhausted()) {
                        this.journalWriter = newJournalWriter();
                    } else {
                        writeJournal();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (th == null) {
                                throw th;
                            }
                            return;
                        }
                    }
                    th = null;
                    if (th == null) {
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (java.lang.Throwable th3) {
                    kotlin.ExceptionsKt.addSuppressed(th, th3);
                }
            }
        }
    }

    private final okio.BufferedSink newJournalWriter() {
        return okio.Okio.buffer(new coil.disk.FaultHidingSink(appendingSink(this.journalFile), new kotlin.jvm.functions.Function1() { // from class: coil.disk.DiskLruCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit newJournalWriter$lambda$3;
                newJournalWriter$lambda$3 = coil.disk.DiskLruCache.newJournalWriter$lambda$3(coil.disk.DiskLruCache.this, (java.io.IOException) obj);
                return newJournalWriter$lambda$3;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit newJournalWriter$lambda$3(coil.disk.DiskLruCache diskLruCache, java.io.IOException iOException) {
        diskLruCache.hasJournalErrors = true;
        return kotlin.Unit.INSTANCE;
    }

    private final void readJournalLine(java.lang.String line) {
        java.lang.String substring;
        java.lang.String str = line;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ' ', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            throw new java.io.IOException("unexpected journal line: " + line);
        }
        int i = indexOf$default + 1;
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ' ', i, false, 4, (java.lang.Object) null);
        if (indexOf$default2 == -1) {
            substring = line.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (indexOf$default == 6 && kotlin.text.StringsKt.startsWith$default(line, REMOVE, false, 2, (java.lang.Object) null)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            substring = line.substring(i, indexOf$default2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        java.util.LinkedHashMap<java.lang.String, coil.disk.DiskLruCache.Entry> linkedHashMap = this.lruEntries;
        coil.disk.DiskLruCache.Entry entry = linkedHashMap.get(substring);
        if (entry == null) {
            entry = new coil.disk.DiskLruCache.Entry(substring);
            linkedHashMap.put(substring, entry);
        }
        coil.disk.DiskLruCache.Entry entry2 = entry;
        if (indexOf$default2 != -1 && indexOf$default == 5 && kotlin.text.StringsKt.startsWith$default(line, CLEAN, false, 2, (java.lang.Object) null)) {
            java.lang.String substring2 = line.substring(indexOf$default2 + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            java.util.List<java.lang.String> split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring2, new char[]{' '}, false, 0, 6, (java.lang.Object) null);
            entry2.setReadable(true);
            entry2.setCurrentEditor(null);
            entry2.setLengths(split$default);
            return;
        }
        if (indexOf$default2 == -1 && indexOf$default == 5 && kotlin.text.StringsKt.startsWith$default(line, DIRTY, false, 2, (java.lang.Object) null)) {
            entry2.setCurrentEditor(new coil.disk.DiskLruCache.Editor(entry2));
        } else {
            if (indexOf$default2 == -1 && indexOf$default == 4 && kotlin.text.StringsKt.startsWith$default(line, READ, false, 2, (java.lang.Object) null)) {
                return;
            }
            throw new java.io.IOException("unexpected journal line: " + line);
        }
    }

    private final void processJournal() {
        java.util.Iterator<coil.disk.DiskLruCache.Entry> it = this.lruEntries.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            coil.disk.DiskLruCache.Entry next = it.next();
            int i = 0;
            if (next.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    j += next.getLengths()[i];
                    i++;
                }
            } else {
                next.setCurrentEditor(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    delete(next.getCleanFiles().get(i));
                    delete(next.getDirtyFiles().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.size = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void writeJournal() {
        java.lang.Throwable th;
        okio.BufferedSink bufferedSink = this.journalWriter;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        okio.BufferedSink buffer = okio.Okio.buffer(sink(this.journalFileTmp, false));
        try {
            okio.BufferedSink bufferedSink2 = buffer;
            bufferedSink2.writeUtf8(MAGIC).writeByte(10);
            bufferedSink2.writeUtf8("1").writeByte(10);
            bufferedSink2.writeDecimalLong(this.appVersion).writeByte(10);
            bufferedSink2.writeDecimalLong(this.valueCount).writeByte(10);
            bufferedSink2.writeByte(10);
            for (coil.disk.DiskLruCache.Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor() != null) {
                    bufferedSink2.writeUtf8(DIRTY);
                    bufferedSink2.writeByte(32);
                    bufferedSink2.writeUtf8(entry.getKey());
                    bufferedSink2.writeByte(10);
                } else {
                    bufferedSink2.writeUtf8(CLEAN);
                    bufferedSink2.writeByte(32);
                    bufferedSink2.writeUtf8(entry.getKey());
                    entry.writeLengths(bufferedSink2);
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
            if (exists(this.journalFile)) {
                atomicMove(this.journalFile, this.journalFileBackup);
                atomicMove(this.journalFileTmp, this.journalFile);
                delete(this.journalFileBackup);
            } else {
                atomicMove(this.journalFileTmp, this.journalFile);
            }
            this.journalWriter = newJournalWriter();
            this.operationsSinceRewrite = 0;
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } else {
            throw th;
        }
    }

    public final synchronized coil.disk.DiskLruCache.Snapshot get(java.lang.String key) {
        coil.disk.DiskLruCache.Snapshot snapshot;
        checkNotClosed();
        validateKey(key);
        initialize();
        coil.disk.DiskLruCache.Entry entry = this.lruEntries.get(key);
        if (entry != null && (snapshot = entry.snapshot()) != null) {
            this.operationsSinceRewrite++;
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8(READ);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(key);
            bufferedSink.writeByte(10);
            if (journalRewriteRequired()) {
                launchCleanup();
            }
            return snapshot;
        }
        return null;
    }

    public final synchronized coil.disk.DiskLruCache.Editor edit(java.lang.String key) {
        checkNotClosed();
        validateKey(key);
        initialize();
        coil.disk.DiskLruCache.Entry entry = this.lruEntries.get(key);
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSnapshotCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8(DIRTY);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(key);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new coil.disk.DiskLruCache.Entry(key);
                this.lruEntries.put(key, entry);
            }
            coil.disk.DiskLruCache.Editor editor = new coil.disk.DiskLruCache.Editor(entry);
            entry.setCurrentEditor(editor);
            return editor;
        }
        launchCleanup();
        return null;
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void completeEdit(coil.disk.DiskLruCache.Editor editor, boolean success) {
        coil.disk.DiskLruCache.Entry entry = editor.getEntry();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i = 0;
        if (success && !entry.getZombie()) {
            int i2 = this.valueCount;
            for (int i3 = 0; i3 < i2; i3++) {
                if (editor.getWritten()[i3] && !exists(entry.getDirtyFiles().get(i3))) {
                    editor.abort();
                    return;
                }
            }
            int i4 = this.valueCount;
            while (i < i4) {
                okio.Path path = entry.getDirtyFiles().get(i);
                okio.Path path2 = entry.getCleanFiles().get(i);
                if (exists(path)) {
                    atomicMove(path, path2);
                } else {
                    coil.util.FileSystems.createFile(this.fileSystem, entry.getCleanFiles().get(i));
                }
                long j = entry.getLengths()[i];
                java.lang.Long size = metadata(path2).getSize();
                long longValue = size != null ? size.longValue() : 0L;
                entry.getLengths()[i] = longValue;
                this.size = (this.size - j) + longValue;
                i++;
            }
        } else {
            int i5 = this.valueCount;
            while (i < i5) {
                delete(entry.getDirtyFiles().get(i));
                i++;
            }
        }
        entry.setCurrentEditor(null);
        if (entry.getZombie()) {
            removeEntry(entry);
            return;
        }
        this.operationsSinceRewrite++;
        okio.BufferedSink bufferedSink = this.journalWriter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
        if (!success && !entry.getReadable()) {
            this.lruEntries.remove(entry.getKey());
            bufferedSink.writeUtf8(REMOVE);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.size <= this.maxSize || journalRewriteRequired()) {
                launchCleanup();
            }
        }
        entry.setReadable(true);
        bufferedSink.writeUtf8(CLEAN);
        bufferedSink.writeByte(32);
        bufferedSink.writeUtf8(entry.getKey());
        entry.writeLengths(bufferedSink);
        bufferedSink.writeByte(10);
        bufferedSink.flush();
        if (this.size <= this.maxSize) {
        }
        launchCleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRewriteRequired() {
        return this.operationsSinceRewrite >= 2000;
    }

    public final synchronized boolean remove(java.lang.String key) {
        checkNotClosed();
        validateKey(key);
        initialize();
        coil.disk.DiskLruCache.Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean removeEntry = removeEntry(entry);
        if (removeEntry && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeEntry(coil.disk.DiskLruCache.Entry entry) {
        okio.BufferedSink bufferedSink;
        if (entry.getLockingSnapshotCount() > 0 && (bufferedSink = this.journalWriter) != null) {
            bufferedSink.writeUtf8(DIRTY);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.setZombie(true);
            return true;
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            delete(entry.getCleanFiles().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.operationsSinceRewrite++;
        okio.BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRewriteRequired()) {
            launchCleanup();
        }
        return true;
    }

    private final void checkNotClosed() {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.initialized && !this.closed) {
            for (coil.disk.DiskLruCache.Entry entry : (coil.disk.DiskLruCache.Entry[]) this.lruEntries.values().toArray(new coil.disk.DiskLruCache.Entry[0])) {
                coil.disk.DiskLruCache.Editor currentEditor = entry.getCurrentEditor();
                if (currentEditor != null) {
                    currentEditor.detach();
                }
            }
            trimToSize();
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.cleanupScope, null, 1, null);
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final boolean removeOldestEntry() {
        for (coil.disk.DiskLruCache.Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie()) {
                removeEntry(entry);
                return true;
            }
        }
        return false;
    }

    private final void delete() {
        close();
        coil.util.FileSystems.deleteContents(this.fileSystem, this.directory);
    }

    public final synchronized void evictAll() {
        initialize();
        for (coil.disk.DiskLruCache.Entry entry : (coil.disk.DiskLruCache.Entry[]) this.lruEntries.values().toArray(new coil.disk.DiskLruCache.Entry[0])) {
            removeEntry(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    private final void launchCleanup() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.cleanupScope, null, null, new coil.disk.DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    private final void validateKey(java.lang.String key) {
        if (LEGAL_KEY_PATTERN.matches(key)) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    /* compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0005R\u0015\u0010\u0003\u001a\u00060\u0004R\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcoil/disk/DiskLruCache$Snapshot;", "Lokio/Closeable;", "Ljava/io/Closeable;", "entry", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "closed", "", "file", "Lokio/Path;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "close", "", "closeAndEdit", "Lcoil/disk/DiskLruCache$Editor;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Snapshot implements java.io.Closeable {
        private boolean closed;
        private final coil.disk.DiskLruCache.Entry entry;

        public Snapshot(coil.disk.DiskLruCache.Entry entry) {
            this.entry = entry;
        }

        public final coil.disk.DiskLruCache.Entry getEntry() {
            return this.entry;
        }

        public final okio.Path file(int index) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("snapshot is closed".toString());
            }
            return this.entry.getCleanFiles().get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            coil.disk.DiskLruCache diskLruCache = coil.disk.DiskLruCache.this;
            synchronized (diskLruCache) {
                this.entry.setLockingSnapshotCount(r1.getLockingSnapshotCount() - 1);
                if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                    diskLruCache.removeEntry(this.entry);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public final coil.disk.DiskLruCache.Editor closeAndEdit() {
            coil.disk.DiskLruCache.Editor edit;
            coil.disk.DiskLruCache diskLruCache = coil.disk.DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                edit = diskLruCache.edit(this.entry.getKey());
            }
            return edit;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\f\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\nH\u0002R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcoil/disk/DiskLruCache$Editor;", "", "entry", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "closed", "", "written", "", "getWritten", "()[Z", "file", "Lokio/Path;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "detach", "", "commit", "commitAndGet", "Lcoil/disk/DiskLruCache$Snapshot;", "abort", "complete", "success", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Editor {
        private boolean closed;
        private final coil.disk.DiskLruCache.Entry entry;
        private final boolean[] written;

        public Editor(coil.disk.DiskLruCache.Entry entry) {
            this.entry = entry;
            this.written = new boolean[coil.disk.DiskLruCache.this.valueCount];
        }

        public final coil.disk.DiskLruCache.Entry getEntry() {
            return this.entry;
        }

        public final boolean[] getWritten() {
            return this.written;
        }

        public final okio.Path file(int index) {
            okio.Path path;
            coil.disk.DiskLruCache diskLruCache = coil.disk.DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!(!this.closed)) {
                    throw new java.lang.IllegalStateException("editor is closed".toString());
                }
                this.written[index] = true;
                okio.Path path2 = this.entry.getDirtyFiles().get(index);
                coil.util.FileSystems.createFile(diskLruCache.fileSystem, path2);
                path = path2;
            }
            return path;
        }

        public final void detach() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                this.entry.setZombie(true);
            }
        }

        public final void commit() {
            complete(true);
        }

        public final coil.disk.DiskLruCache.Snapshot commitAndGet() {
            coil.disk.DiskLruCache.Snapshot snapshot;
            coil.disk.DiskLruCache diskLruCache = coil.disk.DiskLruCache.this;
            synchronized (diskLruCache) {
                commit();
                snapshot = diskLruCache.get(this.entry.getKey());
            }
            return snapshot;
        }

        public final void abort() {
            complete(false);
        }

        private final void complete(boolean success) {
            coil.disk.DiskLruCache diskLruCache = coil.disk.DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!(!this.closed)) {
                    throw new java.lang.IllegalStateException("editor is closed".toString());
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit(this, success);
                }
                this.closed = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,J\u000e\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/J\f\u00100\u001a\b\u0018\u000101R\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcoil/disk/DiskLruCache$Entry;", "", com.ironsource.X3.i.W, "", "<init>", "(Lcoil/disk/DiskLruCache;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "lengths", "", "getLengths", "()[J", "cleanFiles", "Ljava/util/ArrayList;", "Lokio/Path;", "getCleanFiles", "()Ljava/util/ArrayList;", "dirtyFiles", "getDirtyFiles", "readable", "", "getReadable", "()Z", "setReadable", "(Z)V", "zombie", "getZombie", "setZombie", "currentEditor", "Lcoil/disk/DiskLruCache$Editor;", "Lcoil/disk/DiskLruCache;", "getCurrentEditor", "()Lcoil/disk/DiskLruCache$Editor;", "setCurrentEditor", "(Lcoil/disk/DiskLruCache$Editor;)V", "lockingSnapshotCount", "", "getLockingSnapshotCount", "()I", "setLockingSnapshotCount", "(I)V", "setLengths", "", "strings", "", "writeLengths", "writer", "Lokio/BufferedSink;", "snapshot", "Lcoil/disk/DiskLruCache$Snapshot;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Entry {
        private final java.util.ArrayList<okio.Path> cleanFiles;
        private coil.disk.DiskLruCache.Editor currentEditor;
        private final java.util.ArrayList<okio.Path> dirtyFiles;
        private final java.lang.String key;
        private final long[] lengths;
        private int lockingSnapshotCount;
        private boolean readable;
        private boolean zombie;

        public Entry(java.lang.String str) {
            this.key = str;
            this.lengths = new long[coil.disk.DiskLruCache.this.valueCount];
            this.cleanFiles = new java.util.ArrayList<>(coil.disk.DiskLruCache.this.valueCount);
            this.dirtyFiles = new java.util.ArrayList<>(coil.disk.DiskLruCache.this.valueCount);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = coil.disk.DiskLruCache.this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.cleanFiles.add(coil.disk.DiskLruCache.this.directory.resolve(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(coil.disk.DiskLruCache.this.directory.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final long[] getLengths() {
            return this.lengths;
        }

        public final java.util.ArrayList<okio.Path> getCleanFiles() {
            return this.cleanFiles;
        }

        public final java.util.ArrayList<okio.Path> getDirtyFiles() {
            return this.dirtyFiles;
        }

        public final boolean getReadable() {
            return this.readable;
        }

        public final void setReadable(boolean z) {
            this.readable = z;
        }

        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setZombie(boolean z) {
            this.zombie = z;
        }

        public final coil.disk.DiskLruCache.Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final void setCurrentEditor(coil.disk.DiskLruCache.Editor editor) {
            this.currentEditor = editor;
        }

        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        public final void setLockingSnapshotCount(int i) {
            this.lockingSnapshotCount = i;
        }

        public final void setLengths(java.util.List<java.lang.String> strings) {
            if (strings.size() != coil.disk.DiskLruCache.this.valueCount) {
                throw new java.io.IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = java.lang.Long.parseLong(strings.get(i));
                }
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.IOException("unexpected journal line: " + strings);
            }
        }

        public final void writeLengths(okio.BufferedSink writer) {
            for (long j : this.lengths) {
                writer.writeByte(32).writeDecimalLong(j);
            }
        }

        public final coil.disk.DiskLruCache.Snapshot snapshot() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            java.util.ArrayList<okio.Path> arrayList = this.cleanFiles;
            coil.disk.DiskLruCache diskLruCache = coil.disk.DiskLruCache.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!diskLruCache.fileSystem.exists(arrayList.get(i))) {
                    try {
                        diskLruCache.removeEntry(this);
                    } catch (java.io.IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return coil.disk.DiskLruCache.this.new Snapshot(this);
        }
    }

    /* compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcoil/disk/DiskLruCache$Companion;", "", "<init>", "()V", "JOURNAL_FILE", "", "getJOURNAL_FILE$coil_base_release$annotations", "JOURNAL_FILE_TMP", "getJOURNAL_FILE_TMP$coil_base_release$annotations", "JOURNAL_FILE_BACKUP", "getJOURNAL_FILE_BACKUP$coil_base_release$annotations", "MAGIC", "getMAGIC$coil_base_release$annotations", "VERSION", "getVERSION$coil_base_release$annotations", coil.disk.DiskLruCache.CLEAN, coil.disk.DiskLruCache.DIRTY, coil.disk.DiskLruCache.REMOVE, coil.disk.DiskLruCache.READ, "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getJOURNAL_FILE$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_BACKUP$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_TMP$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getMAGIC$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getVERSION$coil_base_release$annotations() {
        }

        private Companion() {
        }
    }
}
