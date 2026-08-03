package androidx.datastore.core;

/* compiled from: MultiProcessCoordinator.android.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\bH\u0002J\u000e\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J2\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@¢\u0006\u0002\u0010,J8\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0096@¢\u0006\u0002\u00100J:\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2$\b\u0004\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0082H¢\u0006\u0002\u00100J\f\u00102\u001a\u00020\u001d*\u00020\u0005H\u0002J\f\u00103\u001a\u00020\u001d*\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "context", "Lkotlin/coroutines/CoroutineContext;", "file", "Ljava/io/File;", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "LOCK_ERROR_MESSAGE", "", "LOCK_SUFFIX", "VERSION_SUFFIX", "getFile", "()Ljava/io/File;", "inMemoryMutex", "Lkotlinx/coroutines/sync/Mutex;", "lazySharedCounter", "Lkotlin/Lazy;", "Landroidx/datastore/core/SharedCounter;", "lockFile", "getLockFile", "lockFile$delegate", "Lkotlin/Lazy;", "sharedCounter", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "fileWithSuffix", "suffix", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withLazyCounter", "createIfNotExists", "createParentDirectories", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiProcessCoordinator implements androidx.datastore.core.InterProcessCoordinator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.MultiProcessCoordinator.Companion INSTANCE = new androidx.datastore.core.MultiProcessCoordinator.Companion(null);
    private static final java.lang.String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final java.lang.String LOCK_ERROR_MESSAGE;
    private final java.lang.String LOCK_SUFFIX;
    private final java.lang.String VERSION_SUFFIX;
    private final kotlin.coroutines.CoroutineContext context;
    private final java.io.File file;
    private final kotlinx.coroutines.sync.Mutex inMemoryMutex;
    private final kotlin.Lazy<androidx.datastore.core.SharedCounter> lazySharedCounter;

    /* renamed from: lockFile$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy lockFile;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateNotifications;

    public MultiProcessCoordinator(kotlin.coroutines.CoroutineContext context, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = androidx.datastore.core.MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.lockFile = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                java.lang.String str;
                java.io.File fileWithSuffix;
                androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator = androidx.datastore.core.MultiProcessCoordinator.this;
                str = multiProcessCoordinator.LOCK_SUFFIX;
                fileWithSuffix = multiProcessCoordinator.fileWithSuffix(str);
                androidx.datastore.core.MultiProcessCoordinator.this.createIfNotExists(fileWithSuffix);
                return fileWithSuffix;
            }
        });
        this.lazySharedCounter = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.datastore.core.SharedCounter invoke() {
                androidx.datastore.core.SharedCounter.INSTANCE.loadLib();
                androidx.datastore.core.SharedCounter.Companion companion = androidx.datastore.core.SharedCounter.INSTANCE;
                final androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator = androidx.datastore.core.MultiProcessCoordinator.this;
                return companion.create$datastore_core_release(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.io.File invoke() {
                        java.lang.String str;
                        java.io.File fileWithSuffix;
                        androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator2 = androidx.datastore.core.MultiProcessCoordinator.this;
                        str = multiProcessCoordinator2.VERSION_SUFFIX;
                        fileWithSuffix = multiProcessCoordinator2.fileWithSuffix(str);
                        androidx.datastore.core.MultiProcessCoordinator.this.createIfNotExists(fileWithSuffix);
                        return fileWithSuffix;
                    }
                });
            }
        });
    }

    protected final java.io.File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1 A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00df, blocks: (B:16:0x00c1, B:30:0x00db, B:31:0x00e3), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #8 {all -> 0x00df, blocks: (B:16:0x00c1, B:30:0x00db, B:31:0x00e3), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> java.lang.Object lock(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        java.lang.Object coroutine_suspended;
        int i;
        ?? r11;
        java.io.FileOutputStream fileOutputStream;
        androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator;
        java.lang.Throwable th;
        java.lang.Object exclusiveFileLockWithRetryIfDeadlock;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function12;
        java.io.Closeable closeable;
        kotlinx.coroutines.sync.Mutex mutex;
        java.nio.channels.FileLock fileLock;
        java.nio.channels.FileLock fileLock2;
        java.lang.Object invoke;
        java.io.Closeable closeable2;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            try {
                try {
                    try {
                        if (continuation instanceof androidx.datastore.core.MultiProcessCoordinator$lock$1) {
                            multiProcessCoordinator$lock$1 = (androidx.datastore.core.MultiProcessCoordinator$lock$1) continuation;
                            if ((multiProcessCoordinator$lock$1.label & Integer.MIN_VALUE) != 0) {
                                multiProcessCoordinator$lock$1.label -= Integer.MIN_VALUE;
                                java.lang.Object obj = multiProcessCoordinator$lock$1.result;
                                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = multiProcessCoordinator$lock$1.label;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.sync.Mutex mutex3 = this.inMemoryMutex;
                                    multiProcessCoordinator$lock$1.L$0 = this;
                                    multiProcessCoordinator$lock$1.L$1 = function1;
                                    multiProcessCoordinator$lock$1.L$2 = mutex3;
                                    multiProcessCoordinator$lock$1.label = 1;
                                    if (mutex3.lock(null, multiProcessCoordinator$lock$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    multiProcessCoordinator = this;
                                    r11 = mutex3;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            fileLock = (java.nio.channels.FileLock) multiProcessCoordinator$lock$1.L$2;
                                            closeable2 = (java.io.Closeable) multiProcessCoordinator$lock$1.L$1;
                                            mutex2 = (kotlinx.coroutines.sync.Mutex) multiProcessCoordinator$lock$1.L$0;
                                            try {
                                                kotlin.ResultKt.throwOnFailure(obj);
                                                if (fileLock != null) {
                                                    fileLock.release();
                                                }
                                                try {
                                                    kotlin.io.CloseableKt.closeFinally(closeable2, null);
                                                    mutex2.unlock(null);
                                                    return obj;
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    r11 = mutex2;
                                                    r11.unlock(null);
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                if (fileLock != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.L$2;
                                        mutex = (kotlinx.coroutines.sync.Mutex) multiProcessCoordinator$lock$1.L$1;
                                        function12 = (kotlin.jvm.functions.Function1) multiProcessCoordinator$lock$1.L$0;
                                        try {
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            fileLock2 = (java.nio.channels.FileLock) obj;
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            fileLock = null;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            multiProcessCoordinator$lock$1.L$0 = mutex;
                                            multiProcessCoordinator$lock$1.L$1 = closeable;
                                            multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                            multiProcessCoordinator$lock$1.label = 3;
                                            invoke = function12.invoke(multiProcessCoordinator$lock$1);
                                            if (invoke != coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            closeable2 = closeable;
                                            fileLock = fileLock2;
                                            obj = invoke;
                                            mutex2 = mutex;
                                            if (fileLock != null) {
                                            }
                                            kotlin.io.CloseableKt.closeFinally(closeable2, null);
                                            mutex2.unlock(null);
                                            return obj;
                                        } catch (java.lang.Throwable th5) {
                                            fileLock = fileLock2;
                                            th = th5;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) multiProcessCoordinator$lock$1.L$2;
                                    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function13 = (kotlin.jvm.functions.Function1) multiProcessCoordinator$lock$1.L$1;
                                    multiProcessCoordinator = (androidx.datastore.core.MultiProcessCoordinator) multiProcessCoordinator$lock$1.L$0;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    r11 = mutex4;
                                    function1 = function13;
                                }
                                fileOutputStream = new java.io.FileOutputStream(multiProcessCoordinator.getLockFile());
                                java.io.FileOutputStream fileOutputStream2 = fileOutputStream;
                                androidx.datastore.core.MultiProcessCoordinator.Companion companion = INSTANCE;
                                multiProcessCoordinator$lock$1.L$0 = function1;
                                multiProcessCoordinator$lock$1.L$1 = r11;
                                multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                                multiProcessCoordinator$lock$1.label = 2;
                                exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, multiProcessCoordinator$lock$1);
                                if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                function12 = function1;
                                closeable = fileOutputStream;
                                mutex = r11;
                                obj = exclusiveFileLockWithRetryIfDeadlock;
                                fileLock2 = (java.nio.channels.FileLock) obj;
                                multiProcessCoordinator$lock$1.L$0 = mutex;
                                multiProcessCoordinator$lock$1.L$1 = closeable;
                                multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                multiProcessCoordinator$lock$1.label = 3;
                                invoke = function12.invoke(multiProcessCoordinator$lock$1);
                                if (invoke != coroutine_suspended) {
                                }
                            }
                        }
                        androidx.datastore.core.MultiProcessCoordinator.Companion companion2 = INSTANCE;
                        multiProcessCoordinator$lock$1.L$0 = function1;
                        multiProcessCoordinator$lock$1.L$1 = r11;
                        multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                        multiProcessCoordinator$lock$1.label = 2;
                        exclusiveFileLockWithRetryIfDeadlock = companion2.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, multiProcessCoordinator$lock$1);
                        if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        fileLock = null;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                    java.io.FileOutputStream fileOutputStream22 = fileOutputStream;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    try {
                        throw th;
                    } finally {
                    }
                }
                fileOutputStream = new java.io.FileOutputStream(multiProcessCoordinator.getLockFile());
            } catch (java.lang.Throwable th8) {
                th = th8;
                r11.unlock(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            r11 = multiProcessCoordinator$lock$1;
            fileOutputStream = coroutine_suspended;
        }
        multiProcessCoordinator$lock$1 = new androidx.datastore.core.MultiProcessCoordinator$lock$1(this, continuation);
        java.lang.Object obj2 = multiProcessCoordinator$lock$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multiProcessCoordinator$lock$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[Catch: all -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00ff, blocks: (B:15:0x00e6, B:24:0x00fb, B:25:0x0103), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb A[Catch: all -> 0x00ff, TRY_ENTER, TryCatch #8 {all -> 0x00ff, blocks: (B:15:0x00e6, B:24:0x00fb, B:25:0x0103), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> java.lang.Object tryLock(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        ?? r3;
        ?? r5;
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        java.lang.String message;
        java.nio.channels.FileLock fileLock;
        java.nio.channels.FileLock fileLock2;
        kotlinx.coroutines.sync.Mutex mutex;
        boolean z;
        java.io.Closeable closeable;
        kotlinx.coroutines.sync.Mutex mutex2;
        boolean z2;
        kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function22 = function2;
        try {
            try {
                if (continuation instanceof androidx.datastore.core.MultiProcessCoordinator$tryLock$1) {
                    androidx.datastore.core.MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$1 = (androidx.datastore.core.MultiProcessCoordinator$tryLock$1) continuation;
                    if ((multiProcessCoordinator$tryLock$1.label & Integer.MIN_VALUE) != 0) {
                        multiProcessCoordinator$tryLock$1.label -= Integer.MIN_VALUE;
                        r3 = multiProcessCoordinator$tryLock$1;
                        java.lang.Object obj = ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).result;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r5 = ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).label;
                        if (r5 == 0) {
                            if (r5 == 1) {
                                z2 = ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).Z$0;
                                mutex2 = (kotlinx.coroutines.sync.Mutex) ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (z2) {
                                    mutex2.unlock(null);
                                }
                                return obj;
                            }
                            if (r5 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z = ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).Z$0;
                            fileLock2 = (java.nio.channels.FileLock) ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$2;
                            closeable = (java.io.Closeable) ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$1;
                            mutex = (kotlinx.coroutines.sync.Mutex) ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                kotlin.io.CloseableKt.closeFinally(closeable, null);
                                if (z) {
                                    mutex.unlock(null);
                                }
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (fileLock2 != null) {
                                }
                                throw th;
                            }
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex3 = this.inMemoryMutex;
                        boolean tryLock = mutex3.tryLock(null);
                        try {
                            if (!tryLock) {
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$0 = mutex3;
                                ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).Z$0 = tryLock;
                                ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).label = 1;
                                obj = function22.invoke(boxBoolean, (java.lang.Object) r3);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex2 = mutex3;
                                z2 = tryLock ? 1 : 0;
                                if (z2) {
                                }
                                return obj;
                            }
                            fileInputStream = new java.io.FileInputStream(getLockFile());
                            try {
                                try {
                                    try {
                                        fileLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                    } catch (java.io.IOException e) {
                                        java.lang.String message2 = e.getMessage();
                                        if ((message2 == null || !kotlin.text.StringsKt.startsWith$default(message2, this.LOCK_ERROR_MESSAGE, false, 2, (java.lang.Object) null)) && ((message = e.getMessage()) == null || !kotlin.text.StringsKt.startsWith$default(message, DEADLOCK_ERROR_MESSAGE, false, 2, (java.lang.Object) null))) {
                                            throw e;
                                        }
                                        fileLock = null;
                                    }
                                    try {
                                        java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fileLock != null);
                                        ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$0 = mutex3;
                                        ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$1 = fileInputStream;
                                        ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).L$2 = fileLock;
                                        ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).Z$0 = tryLock;
                                        ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).label = 2;
                                        obj = function22.invoke(boxBoolean2, (java.lang.Object) r3);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex = mutex3;
                                        z = tryLock ? 1 : 0;
                                        closeable = fileInputStream;
                                        fileLock2 = fileLock;
                                        if (fileLock2 != null) {
                                        }
                                        kotlin.io.CloseableKt.closeFinally(closeable, null);
                                        if (z) {
                                        }
                                        return obj;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        fileLock2 = fileLock;
                                        if (fileLock2 != null) {
                                            fileLock2.release();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    fileLock2 = null;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                function22 = tryLock ? 1 : 0;
                                r3 = mutex3;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th6) {
                                    kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                                    throw th6;
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            r3 = mutex3;
                            function22 = tryLock ? 1 : 0;
                            if (function22 != null) {
                                r3.unlock(null);
                            }
                            throw th;
                        }
                    }
                }
                if (r5 == 0) {
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            fileInputStream = r5;
            r3 = r3;
        }
        r3 = new androidx.datastore.core.MultiProcessCoordinator$tryLock$1(this, continuation);
        java.lang.Object obj2 = ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = ((androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3).label;
    }

    private final java.io.File getLockFile() {
        return (java.io.File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.datastore.core.SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.io.File fileWithSuffix(java.lang.String suffix) {
        return new java.io.File(this.file.getAbsolutePath() + suffix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(java.io.File file) {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(java.io.File file) {
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new java.io.IOException("Unable to create parent directories of " + file);
        }
    }

    private final <T> java.lang.Object withLazyCounter(kotlin.jvm.functions.Function2<? super androidx.datastore.core.SharedCounter, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        kotlin.coroutines.CoroutineContext coroutineContext = this.context;
        androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2 multiProcessCoordinator$withLazyCounter$2 = new androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2(function2, this, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, multiProcessCoordinator$withLazyCounter$2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return withContext;
    }

    /* compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "()V", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream fileOutputStream, kotlin.coroutines.Continuation<? super java.nio.channels.FileLock> continuation) {
            androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            int i;
            long j;
            if (continuation instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuation;
                if ((multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0;
                        fileOutputStream = (java.io.FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        j *= 2;
                        if (j > androidx.datastore.core.MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                            try {
                            } catch (java.io.IOException e) {
                                java.lang.String message = e.getMessage();
                                if (message == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) androidx.datastore.core.MultiProcessCoordinator.DEADLOCK_ERROR_MESSAGE, false, 2, (java.lang.Object) null)) {
                                    throw e;
                                }
                                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0 = fileOutputStream;
                                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0 = j;
                                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label = 1;
                                if (kotlinx.coroutines.DelayKt.delay(j, multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            java.nio.channels.FileLock lock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                            return lock;
                        }
                        java.nio.channels.FileLock lock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                        return lock2;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    j = androidx.datastore.core.MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
                    if (j > androidx.datastore.core.MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                    }
                }
            }
            multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
            java.lang.Object obj2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
            if (i == 0) {
            }
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return kotlin.coroutines.jvm.internal.Boxing.boxInt(getSharedCounter().getValue());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.context, new androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object incrementAndGetVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return kotlin.coroutines.jvm.internal.Boxing.boxInt(getSharedCounter().incrementAndGetValue());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.context, new androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }
}
