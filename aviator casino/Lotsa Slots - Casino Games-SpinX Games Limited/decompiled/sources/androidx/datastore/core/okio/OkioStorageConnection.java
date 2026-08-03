package androidx.datastore.core.okio;

/* compiled from: OkioStorage.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0016JX\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0001\u0010\u00182B\u0010\u0019\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001a¢\u0006\u0002\b\"H\u0096@¢\u0006\u0002\u0010#J=\u0010$\u001a\u00020\r2-\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0 \u0012\u0006\u0012\u0004\u0018\u00010!0%¢\u0006\u0002\b\"H\u0096@¢\u0006\u0002\u0010'R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "checkNotClosed", "close", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OkioStorageConnection<T> implements androidx.datastore.core.StorageConnection<T> {
    private final androidx.datastore.core.okio.AtomicBoolean closed;
    private final androidx.datastore.core.InterProcessCoordinator coordinator;
    private final okio.FileSystem fileSystem;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClose;
    private final okio.Path path;
    private final androidx.datastore.core.okio.OkioSerializer<T> serializer;
    private final kotlinx.coroutines.sync.Mutex transactionMutex;

    public OkioStorageConnection(okio.FileSystem fileSystem, okio.Path path, androidx.datastore.core.okio.OkioSerializer<T> serializer, androidx.datastore.core.InterProcessCoordinator coordinator, kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new androidx.datastore.core.okio.AtomicBoolean(false);
        this.transactionMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.datastore.core.StorageConnection
    public androidx.datastore.core.InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|14|15|16|(2:(1:19)|20)(1:22)))|52|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:22:0x0083, B:28:0x0092, B:31:0x008f, B:27:0x008a), top: B:7:0x0023, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> java.lang.Object readScope(kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        ?? r0;
        int i;
        androidx.datastore.core.Closeable closeable;
        java.lang.Throwable th;
        androidx.datastore.core.okio.OkioStorageConnection<T> okioStorageConnection;
        try {
            if (continuation instanceof androidx.datastore.core.okio.OkioStorageConnection$readScope$1) {
                androidx.datastore.core.okio.OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1 = (androidx.datastore.core.okio.OkioStorageConnection$readScope$1) continuation;
                if ((okioStorageConnection$readScope$1.label & Integer.MIN_VALUE) != 0) {
                    okioStorageConnection$readScope$1.label -= Integer.MIN_VALUE;
                    r0 = okioStorageConnection$readScope$1;
                    java.lang.Object obj = r0.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = r0.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        boolean tryLock$default = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
                        try {
                            androidx.datastore.core.okio.OkioReadScope okioReadScope = new androidx.datastore.core.okio.OkioReadScope(this.fileSystem, this.path, this.serializer);
                            try {
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(tryLock$default);
                                r0.L$0 = this;
                                r0.L$1 = okioReadScope;
                                r0.Z$0 = tryLock$default;
                                r0.label = 1;
                                java.lang.Object invoke = function3.invoke(okioReadScope, boxBoolean, r0);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                okioStorageConnection = this;
                                closeable = okioReadScope;
                                obj = invoke;
                                function3 = tryLock$default ? 1 : 0;
                            } catch (java.lang.Throwable th2) {
                                r0 = this;
                                closeable = okioReadScope;
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
                        r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            okioStorageConnection = r0;
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
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(okioStorageConnection.transactionMutex, null, 1, null);
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
        r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1(this, continuation);
        java.lang.Object obj2 = r0.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5 A[Catch: all -> 0x00fc, IOException -> 0x00ff, TRY_ENTER, TryCatch #6 {IOException -> 0x00ff, blocks: (B:20:0x00d5, B:22:0x00dd, B:27:0x00ec, B:33:0x00fb, B:36:0x00f8), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[Catch: all -> 0x00fc, IOException -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x00ff, blocks: (B:20:0x00d5, B:22:0x00dd, B:27:0x00ec, B:33:0x00fb, B:36:0x00f8), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, okio.Path] */
    /* JADX WARN: Type inference failed for: r5v4, types: [okio.FileSystem] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object writeScope(kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        ?? r0;
        ?? r11;
        java.lang.Object coroutine_suspended;
        ?? r2;
        androidx.datastore.core.okio.OkioStorageConnection<T> okioStorageConnection;
        ?? r22;
        okio.Path parent;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.datastore.core.okio.OkioWriteScope okioWriteScope;
        java.lang.Throwable th;
        androidx.datastore.core.Closeable closeable;
        okio.Path path;
        androidx.datastore.core.okio.OkioStorageConnection<T> okioStorageConnection2;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            try {
                try {
                    try {
                        try {
                            if (continuation instanceof androidx.datastore.core.okio.OkioStorageConnection$writeScope$1) {
                                androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$1 = (androidx.datastore.core.okio.OkioStorageConnection$writeScope$1) continuation;
                                if ((okioStorageConnection$writeScope$1.label & Integer.MIN_VALUE) != 0) {
                                    okioStorageConnection$writeScope$1.label -= Integer.MIN_VALUE;
                                    r0 = okioStorageConnection$writeScope$1;
                                    r11 = r0.result;
                                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    r2 = r0.label;
                                    if (r2 != 0) {
                                        kotlin.ResultKt.throwOnFailure(r11);
                                        checkNotClosed();
                                        parent = this.path.parent();
                                        if (parent == null) {
                                            throw new java.lang.IllegalStateException("must have a parent path".toString());
                                        }
                                        this.fileSystem.createDirectories(parent, false);
                                        ?? r112 = this.transactionMutex;
                                        r0.L$0 = this;
                                        r0.L$1 = function2;
                                        r0.L$2 = parent;
                                        r0.L$3 = r112;
                                        r0.label = 1;
                                        if (r112.lock(null, r0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        okioStorageConnection = this;
                                        mutex = r112;
                                    } else {
                                        if (r2 != 1) {
                                            if (r2 != 2) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            closeable = (androidx.datastore.core.Closeable) r0.L$3;
                                            path = (okio.Path) r0.L$2;
                                            mutex2 = (kotlinx.coroutines.sync.Mutex) r0.L$1;
                                            okioStorageConnection2 = (androidx.datastore.core.okio.OkioStorageConnection) r0.L$0;
                                            try {
                                                kotlin.ResultKt.throwOnFailure(r11);
                                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                try {
                                                    closeable.close();
                                                    th = null;
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th != null) {
                                                    if (okioStorageConnection2.fileSystem.exists(path)) {
                                                        okioStorageConnection2.fileSystem.atomicMove(path, okioStorageConnection2.path);
                                                    }
                                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                    mutex2.unlock(null);
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
                                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) r0.L$3;
                                        parent = (okio.Path) r0.L$2;
                                        kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22 = (kotlin.jvm.functions.Function2) r0.L$1;
                                        okioStorageConnection = (androidx.datastore.core.okio.OkioStorageConnection) r0.L$0;
                                        kotlin.ResultKt.throwOnFailure(r11);
                                        mutex = mutex3;
                                        function2 = function22;
                                    }
                                    r22 = parent.resolve(okioStorageConnection.path.name() + ".tmp");
                                    okioStorageConnection.fileSystem.delete(r22, false);
                                    okioWriteScope = new androidx.datastore.core.okio.OkioWriteScope(okioStorageConnection.fileSystem, r22, okioStorageConnection.serializer);
                                    r0.L$0 = okioStorageConnection;
                                    r0.L$1 = mutex;
                                    r0.L$2 = r22;
                                    r0.L$3 = okioWriteScope;
                                    r0.label = 2;
                                    if (function2.invoke(okioWriteScope, r0) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    path = r22;
                                    closeable = okioWriteScope;
                                    okioStorageConnection2 = okioStorageConnection;
                                    mutex2 = mutex;
                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                    closeable.close();
                                    th = null;
                                    if (th != null) {
                                    }
                                }
                            }
                            r0.L$0 = okioStorageConnection;
                            r0.L$1 = mutex;
                            r0.L$2 = r22;
                            r0.L$3 = okioWriteScope;
                            r0.label = 2;
                            if (function2.invoke(okioWriteScope, r0) != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            closeable = okioWriteScope;
                            closeable.close();
                            throw th;
                        }
                        okioStorageConnection.fileSystem.delete(r22, false);
                        okioWriteScope = new androidx.datastore.core.okio.OkioWriteScope(okioStorageConnection.fileSystem, r22, okioStorageConnection.serializer);
                    } catch (java.io.IOException e) {
                        e = e;
                        if (okioStorageConnection.fileSystem.exists(r22)) {
                            try {
                                okioStorageConnection.fileSystem.delete(r22);
                            } catch (java.io.IOException unused) {
                            }
                        }
                        throw e;
                    }
                    if (r2 != 0) {
                    }
                    r22 = parent.resolve(okioStorageConnection.path.name() + ".tmp");
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r11.unlock(null);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                okioStorageConnection = r0;
                r22 = coroutine_suspended;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r11 = r2;
            r11.unlock(null);
            throw th;
        }
        r0 = new androidx.datastore.core.okio.OkioStorageConnection$writeScope$1(this, continuation);
        r11 = r0.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = r0.label;
    }

    private final void checkNotClosed() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }
}
