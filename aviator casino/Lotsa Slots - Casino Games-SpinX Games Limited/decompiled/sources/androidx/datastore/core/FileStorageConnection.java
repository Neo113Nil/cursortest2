package androidx.datastore.core;

/* compiled from: FileStorage.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016JX\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0001\u0010\u00162B\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0018¢\u0006\u0002\b H\u0096@¢\u0006\u0002\u0010!J=\u0010\"\u001a\u00020\u000b2-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0#¢\u0006\u0002\b H\u0096@¢\u0006\u0002\u0010%J\f\u0010&\u001a\u00020\u000b*\u00020\u0004H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "checkNotClosed", "close", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileStorageConnection<T> implements androidx.datastore.core.StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final androidx.datastore.core.InterProcessCoordinator coordinator;
    private final java.io.File file;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClose;
    private final androidx.datastore.core.Serializer<T> serializer;
    private final kotlinx.coroutines.sync.Mutex transactionMutex;

    public FileStorageConnection(java.io.File file, androidx.datastore.core.Serializer<T> serializer, androidx.datastore.core.InterProcessCoordinator coordinator, kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.datastore.core.StorageConnection
    public androidx.datastore.core.InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|14|15|16|(2:(1:19)|20)(1:22)))|52|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[Catch: all -> 0x0091, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:22:0x0081, B:28:0x0090, B:31:0x008d, B:27:0x0088), top: B:7:0x0023, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> java.lang.Object readScope(kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        ?? r0;
        int i;
        androidx.datastore.core.Closeable closeable;
        java.lang.Throwable th;
        androidx.datastore.core.FileStorageConnection<T> fileStorageConnection;
        try {
            if (continuation instanceof androidx.datastore.core.FileStorageConnection$readScope$1) {
                androidx.datastore.core.FileStorageConnection$readScope$1 fileStorageConnection$readScope$1 = (androidx.datastore.core.FileStorageConnection$readScope$1) continuation;
                if ((fileStorageConnection$readScope$1.label & Integer.MIN_VALUE) != 0) {
                    fileStorageConnection$readScope$1.label -= Integer.MIN_VALUE;
                    r0 = fileStorageConnection$readScope$1;
                    java.lang.Object obj = r0.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = r0.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        boolean tryLock$default = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
                        try {
                            androidx.datastore.core.FileReadScope fileReadScope = new androidx.datastore.core.FileReadScope(this.file, this.serializer);
                            try {
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(tryLock$default);
                                r0.L$0 = this;
                                r0.L$1 = fileReadScope;
                                r0.Z$0 = tryLock$default;
                                r0.label = 1;
                                java.lang.Object invoke = function3.invoke(fileReadScope, boxBoolean, r0);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                fileStorageConnection = this;
                                closeable = fileReadScope;
                                obj = invoke;
                                function3 = tryLock$default ? 1 : 0;
                            } catch (java.lang.Throwable th2) {
                                r0 = this;
                                closeable = fileReadScope;
                                th = th2;
                                function3 = tryLock$default ? 1 : 0;
                                closeable.close();
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            r0 = this;
                            th = th3;
                            function3 = tryLock$default ? 1 : 0;
                            if (function3 != null) {
                                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0.transactionMutex, null, 1, null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function3 = (kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>) r0.Z$0;
                        closeable = (androidx.datastore.core.Closeable) r0.L$1;
                        r0 = (androidx.datastore.core.FileStorageConnection) r0.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            fileStorageConnection = r0;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                closeable.close();
                            } catch (java.lang.Throwable th5) {
                                kotlin.ExceptionsKt.addSuppressed(th, th5);
                            }
                            throw th;
                        }
                    }
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (function3 != null) {
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(fileStorageConnection.transactionMutex, null, 1, null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            closeable.close();
            th = null;
            if (th == null) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        r0 = new androidx.datastore.core.FileStorageConnection$readScope$1(this, continuation);
        java.lang.Object obj2 = r0.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(6:(2:3|(10:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(2:24|25)|27|28|29)(1:30))(2:41|42))(1:43))(2:61|(1:63)(1:64))|44|45|46|47|48|(1:50)(6:51|14|15|16|17|(0)(0))))|45|46|47|48|(0)(0))|7|(0)(0)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: IOException -> 0x0109, all -> 0x0117, TRY_ENTER, TryCatch #0 {IOException -> 0x0109, blocks: (B:19:0x00c3, B:21:0x00c9, B:24:0x00d2, B:25:0x00f2, B:30:0x00fb, B:37:0x0108, B:40:0x0105), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: IOException -> 0x0109, all -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0109, blocks: (B:19:0x00c3, B:21:0x00c9, B:24:0x00d2, B:25:0x00f2, B:30:0x00fb, B:37:0x0108, B:40:0x0105), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object writeScope(kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        java.lang.Object coroutine_suspended;
        ?? r3;
        java.io.File file;
        androidx.datastore.core.FileStorageConnection<T> fileStorageConnection;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.datastore.core.FileWriteScope fileWriteScope;
        java.lang.Throwable th;
        androidx.datastore.core.Closeable closeable;
        java.io.File file2;
        androidx.datastore.core.FileStorageConnection<T> fileStorageConnection2;
        try {
            try {
                try {
                    if (continuation instanceof androidx.datastore.core.FileStorageConnection$writeScope$1) {
                        fileStorageConnection$writeScope$1 = (androidx.datastore.core.FileStorageConnection$writeScope$1) continuation;
                        if ((fileStorageConnection$writeScope$1.label & Integer.MIN_VALUE) != 0) {
                            fileStorageConnection$writeScope$1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj = fileStorageConnection$writeScope$1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            r3 = fileStorageConnection$writeScope$1.label;
                            if (r3 != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                checkNotClosed();
                                createParentDirectories(this.file);
                                kotlinx.coroutines.sync.Mutex mutex2 = this.transactionMutex;
                                fileStorageConnection$writeScope$1.L$0 = this;
                                fileStorageConnection$writeScope$1.L$1 = function2;
                                fileStorageConnection$writeScope$1.L$2 = mutex2;
                                fileStorageConnection$writeScope$1.label = 1;
                                if (mutex2.lock(null, fileStorageConnection$writeScope$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                fileStorageConnection = this;
                                mutex = mutex2;
                            } else {
                                if (r3 != 1) {
                                    if (r3 != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    closeable = (androidx.datastore.core.Closeable) fileStorageConnection$writeScope$1.L$3;
                                    file2 = (java.io.File) fileStorageConnection$writeScope$1.L$2;
                                    mutex = (kotlinx.coroutines.sync.Mutex) fileStorageConnection$writeScope$1.L$1;
                                    fileStorageConnection2 = (androidx.datastore.core.FileStorageConnection) fileStorageConnection$writeScope$1.L$0;
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        try {
                                            closeable.close();
                                            th = null;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                        if (th != null) {
                                            if (file2.exists() && !androidx.datastore.core.FileMoves_androidKt.atomicMoveTo(file2, fileStorageConnection2.file)) {
                                                throw new java.io.IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                            mutex.unlock(null);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                        throw th;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        try {
                                            closeable.close();
                                        } catch (java.lang.Throwable th4) {
                                            kotlin.ExceptionsKt.addSuppressed(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) fileStorageConnection$writeScope$1.L$2;
                                kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22 = (kotlin.jvm.functions.Function2) fileStorageConnection$writeScope$1.L$1;
                                fileStorageConnection = (androidx.datastore.core.FileStorageConnection) fileStorageConnection$writeScope$1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex = mutex3;
                                function2 = function22;
                            }
                            file = new java.io.File(fileStorageConnection.file.getAbsolutePath() + ".tmp");
                            fileWriteScope = new androidx.datastore.core.FileWriteScope(file, fileStorageConnection.serializer);
                            fileStorageConnection$writeScope$1.L$0 = fileStorageConnection;
                            fileStorageConnection$writeScope$1.L$1 = mutex;
                            fileStorageConnection$writeScope$1.L$2 = file;
                            fileStorageConnection$writeScope$1.L$3 = fileWriteScope;
                            fileStorageConnection$writeScope$1.label = 2;
                            if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            file2 = file;
                            fileStorageConnection2 = fileStorageConnection;
                            closeable = fileWriteScope;
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            closeable.close();
                            th = null;
                            if (th != null) {
                            }
                        }
                    }
                    fileStorageConnection$writeScope$1.L$0 = fileStorageConnection;
                    fileStorageConnection$writeScope$1.L$1 = mutex;
                    fileStorageConnection$writeScope$1.L$2 = file;
                    fileStorageConnection$writeScope$1.L$3 = fileWriteScope;
                    fileStorageConnection$writeScope$1.label = 2;
                    if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    closeable = fileWriteScope;
                    closeable.close();
                    throw th;
                }
                fileWriteScope = new androidx.datastore.core.FileWriteScope(file, fileStorageConnection.serializer);
            } catch (java.io.IOException e) {
                e = e;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r3 != 0) {
            }
            file = new java.io.File(fileStorageConnection.file.getAbsolutePath() + ".tmp");
        } catch (java.lang.Throwable th6) {
            r3.unlock(null);
            throw th6;
        }
        fileStorageConnection$writeScope$1 = new androidx.datastore.core.FileStorageConnection$writeScope$1(this, continuation);
        java.lang.Object obj2 = fileStorageConnection$writeScope$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = fileStorageConnection$writeScope$1.label;
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    private final void checkNotClosed() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
        }
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
}
