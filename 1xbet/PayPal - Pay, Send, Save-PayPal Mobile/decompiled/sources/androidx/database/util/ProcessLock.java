package androidx.database.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/sqlite/util/ProcessLock;", "", "", "name", "Ljava/io/File;", "lockDir", "", "processLock", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "", "lock", "(Z)V", "unlock", "()V", "getHighSpeedVideoFpsRangesFor", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/File;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/locks/Lock;", "Ljava/util/concurrent/locks/Lock;", "getHighSpeedVideoFpsRanges", "Ljava/nio/channels/FileChannel;", "Camera2StreamConfigurationMap", "Ljava/nio/channels/FileChannel;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProcessLock {
    private static final androidx.sqlite.util.ProcessLock.Companion Companion = new androidx.sqlite.util.ProcessLock.Companion(null);
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.nio.channels.FileChannel getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.io.File getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.locks.Lock getHighSpeedVideoFpsRanges;

    public ProcessLock(java.lang.String str, java.io.File file, boolean z) {
        java.io.File file2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = z;
        if (file != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(".lck");
            file2 = new java.io.File(file, sb.toString());
        } else {
            file2 = null;
        }
        this.getHighSpeedVideoSizes = file2;
        this.getHighSpeedVideoFpsRanges = androidx.sqlite.util.ProcessLock.Companion.getHighSpeedVideoFpsRangesFor(str);
    }

    public static /* synthetic */ void lock$default(androidx.database.util.ProcessLock processLock, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = processLock.getHighSpeedVideoFpsRangesFor;
        }
        processLock.lock(z);
    }

    public final void lock(boolean processLock) {
        this.getHighSpeedVideoFpsRanges.lock();
        if (processLock) {
            try {
                java.io.File file = this.getHighSpeedVideoSizes;
                if (file == null) {
                    throw new java.io.IOException("No lock directory was provided.");
                }
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(this.getHighSpeedVideoSizes).getChannel();
                channel.lock();
                this.getHighResolutionOutputSizeshNQ4ISI = channel;
            } catch (java.io.IOException e) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
    }

    public final void unlock() {
        try {
            java.nio.channels.FileChannel fileChannel = this.getHighResolutionOutputSizeshNQ4ISI;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (java.io.IOException unused) {
        }
        this.getHighSpeedVideoFpsRanges.unlock();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/sqlite/util/ProcessLock$Companion;", "", "<init>", "()V", "", "p0", "Ljava/util/concurrent/locks/Lock;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/util/concurrent/locks/Lock;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.concurrent.locks.Lock getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
            java.util.concurrent.locks.Lock lock;
            synchronized (androidx.database.util.ProcessLock.getHighSpeedVideoFpsRanges) {
                java.util.Map map = androidx.database.util.ProcessLock.getHighSpeedVideoFpsRanges;
                java.lang.Object obj = map.get(p0);
                if (obj == null) {
                    obj = (java.util.concurrent.locks.Lock) new java.util.concurrent.locks.ReentrantLock();
                    map.put(p0, obj);
                }
                lock = (java.util.concurrent.locks.Lock) obj;
            }
            return lock;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
