package androidx.sqlite.util;

/* compiled from: ProcessLock.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/sqlite/util/ProcessLock;", "", "name", "", "lockDir", "Ljava/io/File;", "processLock", "", "(Ljava/lang/String;Ljava/io/File;Z)V", "lockChannel", "Ljava/nio/channels/FileChannel;", "lockFile", "threadLock", "Ljava/util/concurrent/locks/Lock;", "lock", "", "unlock", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProcessLock {
    private static final java.lang.String TAG = "SupportSQLiteLock";
    private java.nio.channels.FileChannel lockChannel;
    private final java.io.File lockFile;
    private final boolean processLock;
    private final java.util.concurrent.locks.Lock threadLock;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.sqlite.util.ProcessLock.Companion INSTANCE = new androidx.sqlite.util.ProcessLock.Companion(null);
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> threadLocksMap = new java.util.HashMap();

    public ProcessLock(java.lang.String name, java.io.File file, boolean z) {
        java.io.File file2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.processLock = z;
        if (file != null) {
            file2 = new java.io.File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.lockFile = file2;
        this.threadLock = INSTANCE.getThreadLock(name);
    }

    public static /* synthetic */ void lock$default(androidx.sqlite.util.ProcessLock processLock, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = processLock.processLock;
        }
        processLock.lock(z);
    }

    public final void lock(boolean processLock) {
        this.threadLock.lock();
        if (processLock) {
            try {
                java.io.File file = this.lockFile;
                if (file == null) {
                    throw new java.io.IOException("No lock directory was provided.");
                }
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(this.lockFile).getChannel();
                channel.lock();
                this.lockChannel = channel;
            } catch (java.io.IOException e) {
                this.lockChannel = null;
                android.util.Log.w(TAG, "Unable to grab file lock.", e);
            }
        }
    }

    public final void unlock() {
        try {
            java.nio.channels.FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (java.io.IOException unused) {
        }
        this.threadLock.unlock();
    }

    /* compiled from: ProcessLock.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/sqlite/util/ProcessLock$Companion;", "", "()V", "TAG", "", "threadLocksMap", "", "Ljava/util/concurrent/locks/Lock;", "getThreadLock", com.ironsource.X3.i.W, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.concurrent.locks.Lock getThreadLock(java.lang.String key) {
            java.util.concurrent.locks.Lock lock;
            synchronized (androidx.sqlite.util.ProcessLock.threadLocksMap) {
                java.util.Map map = androidx.sqlite.util.ProcessLock.threadLocksMap;
                java.lang.Object obj = map.get(key);
                if (obj == null) {
                    obj = (java.util.concurrent.locks.Lock) new java.util.concurrent.locks.ReentrantLock();
                    map.put(key, obj);
                }
                lock = (java.util.concurrent.locks.Lock) obj;
            }
            return lock;
        }
    }
}
