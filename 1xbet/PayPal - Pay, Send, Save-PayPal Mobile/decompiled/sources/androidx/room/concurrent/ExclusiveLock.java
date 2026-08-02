package androidx.room.concurrent;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/room/concurrent/ExclusiveLock;", "", "", "filename", "", "useFileLock", "<init>", "(Ljava/lang/String;Z)V", "T", "Lkotlin/Function0;", "onLocked", "Lkotlin/Function1;", "", "", "onLockError", "withLock", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/getHighSpeedVideoFpsRanges;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/FileLock;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/concurrent/FileLock;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExclusiveLock {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.concurrent.ExclusiveLock.Companion INSTANCE = new androidx.room.concurrent.ExclusiveLock.Companion(null);
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.ReentrantLock> getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    private final java.util.concurrent.locks.ReentrantLock getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.room.concurrent.FileLock getHighSpeedVideoFpsRangesFor;

    public ExclusiveLock(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.room.concurrent.ExclusiveLock.Companion companion = INSTANCE;
        this.getHighResolutionOutputSizeshNQ4ISI = companion.getHighSpeedVideoSizes(str);
        this.getHighSpeedVideoFpsRangesFor = z ? androidx.room.concurrent.ExclusiveLock.Companion.access$getFileLock(companion, str) : null;
    }

    public final <T> T withLock(kotlin.jvm.functions.Function0<? extends T> onLocked, kotlin.jvm.functions.Function1 onLockError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLocked, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLockError, "");
        this.getHighResolutionOutputSizeshNQ4ISI.lock();
        boolean z = false;
        try {
            androidx.room.concurrent.FileLock fileLock = this.getHighSpeedVideoFpsRangesFor;
            if (fileLock != null) {
                fileLock.lock();
            }
            z = true;
            try {
                return onLocked.invoke();
            } finally {
                androidx.room.concurrent.FileLock fileLock2 = this.getHighSpeedVideoFpsRangesFor;
                if (fileLock2 != null) {
                    fileLock2.unlock();
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                if (z) {
                    throw th;
                }
                onLockError.invoke(th);
                throw new kotlin.KotlinNothingValueException();
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI.unlock();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\b\u0086\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f"}, d2 = {"Landroidx/room/concurrent/ExclusiveLock$Companion;", "", "Landroidx/room/concurrent/SynchronizedObject;", "<init>", "()V", "", "p0", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;", "", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoSizes(java.lang.String p0) {
            java.util.concurrent.locks.ReentrantLock reentrantLock;
            synchronized (this) {
                java.util.Map map = androidx.room.concurrent.ExclusiveLock.getHighSpeedVideoSizes;
                java.lang.Object obj = map.get(p0);
                if (obj == null) {
                    obj = new java.util.concurrent.locks.ReentrantLock();
                    map.put(p0, obj);
                }
                reentrantLock = (java.util.concurrent.locks.ReentrantLock) obj;
            }
            return reentrantLock;
        }

        public static final /* synthetic */ androidx.room.concurrent.FileLock access$getFileLock(androidx.room.concurrent.ExclusiveLock.Companion companion, java.lang.String str) {
            return new androidx.room.concurrent.FileLock(str);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
