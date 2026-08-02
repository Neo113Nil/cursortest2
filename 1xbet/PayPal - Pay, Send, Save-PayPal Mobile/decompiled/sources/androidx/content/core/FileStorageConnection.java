package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJP\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000e28\u0010\u0016\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f¢\u0006\u0002\b\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001b\u001a\u00020\n2-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0019¢\u0006\u0002\b\u0015H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010(\u001a\u00020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u0014\u0010\u001f\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010-"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "getHighSpeedVideoFpsRangesFor", "Ljava/io/File;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/datastore/core/Serializer;", "getHighSpeedVideoFpsRanges", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileStorageConnection<T> implements androidx.content.core.StorageConnection<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.content.core.InterProcessCoordinator coordinator;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.io.File Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.content.core.Serializer<T> getHighSpeedVideoFpsRanges;

    public FileStorageConnection(java.io.File file, androidx.content.core.Serializer<T> serializer, androidx.content.core.InterProcessCoordinator interProcessCoordinator, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interProcessCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = file;
        this.getHighSpeedVideoFpsRanges = serializer;
        this.coordinator = interProcessCoordinator;
        this.getHighSpeedVideoSizes = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.content.core.StorageConnection
    public final androidx.content.core.InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:52|53))|14|15|16|(2:(1:19)|20)(1:22)))|56|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:22:0x007f, B:28:0x008f, B:31:0x008c, B:27:0x0087), top: B:7:0x0023, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object readScope(kotlin.jvm.functions.Function3<? super androidx.content.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.content.core.FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        int i;
        boolean z;
        java.lang.Throwable th;
        androidx.content.core.Closeable closeable;
        java.lang.Throwable th2;
        try {
            if (continuation instanceof androidx.content.core.FileStorageConnection$readScope$1) {
                fileStorageConnection$readScope$1 = (androidx.content.core.FileStorageConnection$readScope$1) continuation;
                if ((fileStorageConnection$readScope$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    fileStorageConnection$readScope$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = fileStorageConnection$readScope$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileStorageConnection$readScope$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                            z = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                            try {
                                androidx.content.core.FileReadScope fileReadScope = new androidx.content.core.FileReadScope(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
                                try {
                                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                                    fileStorageConnection$readScope$1.getHighSpeedVideoFpsRanges = fileReadScope;
                                    fileStorageConnection$readScope$1.getHighSpeedVideoSizes = z;
                                    fileStorageConnection$readScope$1.Camera2StreamConfigurationMap = 1;
                                    java.lang.Object invoke = function3.invoke(fileReadScope, boxBoolean, fileStorageConnection$readScope$1);
                                    if (invoke == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    closeable = fileReadScope;
                                    obj = invoke;
                                    function3 = z ? 1 : 0;
                                } catch (java.lang.Throwable th3) {
                                    closeable = fileReadScope;
                                    th2 = th3;
                                    function3 = z ? 1 : 0;
                                    closeable.close();
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                if (z) {
                                    kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                                }
                                throw th;
                            }
                        } else {
                            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function3 = (kotlin.jvm.functions.Function3<? super androidx.content.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>) fileStorageConnection$readScope$1.getHighSpeedVideoSizes;
                        closeable = (androidx.content.core.Closeable) fileStorageConnection$readScope$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Throwable th5) {
                            th2 = th5;
                            try {
                                closeable.close();
                            } catch (java.lang.Throwable th6) {
                                kotlin.ExceptionsKt.addSuppressed(th2, th6);
                            }
                            throw th2;
                        }
                    }
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (function3 != null) {
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
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
        } catch (java.lang.Throwable th7) {
            z = function3;
            th = th7;
        }
        fileStorageConnection$readScope$1 = new androidx.content.core.FileStorageConnection$readScope$1(this, continuation);
        java.lang.Object obj2 = fileStorageConnection$readScope$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$readScope$1.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[Catch: all -> 0x0113, IOException -> 0x0115, TRY_ENTER, TryCatch #1 {all -> 0x0113, blocks: (B:19:0x00d8, B:21:0x00de, B:24:0x00e7, B:25:0x0109, B:27:0x010a, B:30:0x0112), top: B:17:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112 A[Catch: all -> 0x0113, IOException -> 0x0115, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0113, blocks: (B:19:0x00d8, B:21:0x00de, B:24:0x00e7, B:25:0x0109, B:27:0x010a, B:30:0x0112), top: B:17:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a A[Catch: all -> 0x013e, TryCatch #9 {all -> 0x013e, blocks: (B:37:0x0134, B:39:0x013a, B:40:0x013d, B:64:0x0093, B:66:0x00af), top: B:63:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.datastore.core.Closeable] */
    /* JADX WARN: Type inference failed for: r9v33, types: [androidx.datastore.core.Closeable] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeScope(kotlin.jvm.functions.Function2<? super androidx.content.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function2<? super androidx.content.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22;
        kotlinx.coroutines.sync.Mutex mutex;
        java.io.File file;
        androidx.content.core.FileWriteScope fileWriteScope;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.io.File file2;
        ?? r9;
        java.lang.Throwable th;
        java.io.IOException e;
        try {
            try {
                try {
                    if (continuation instanceof androidx.content.core.FileStorageConnection$writeScope$1) {
                        fileStorageConnection$writeScope$1 = (androidx.content.core.FileStorageConnection$writeScope$1) continuation;
                        if ((fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj = fileStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (!this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                                    java.io.File file3 = this.Camera2StreamConfigurationMap;
                                    java.io.File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new java.io.IOException("Unable to create parent directories of ".concat(java.lang.String.valueOf(file3)));
                                        }
                                    }
                                    kotlinx.coroutines.sync.Mutex mutex3 = this.getHighSpeedVideoFpsRangesFor;
                                    fileStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI = function2;
                                    fileStorageConnection$writeScope$1.getHighSpeedVideoSizes = mutex3;
                                    fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap = 1;
                                    if (mutex3.lock(null, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                                        function22 = function2;
                                        mutex = mutex3;
                                    }
                                    return coroutine_suspended;
                                }
                                throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r9 = (androidx.content.core.Closeable) fileStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges;
                                file2 = (java.io.File) fileStorageConnection$writeScope$1.getHighSpeedVideoSizes;
                                mutex2 = (kotlinx.coroutines.sync.Mutex) fileStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    r9 = r9;
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    try {
                                        r9.close();
                                        th = null;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        try {
                                            if (th != null) {
                                                if (file2.exists() && !androidx.content.core.FileMoves_androidKt.atomicMoveTo(file2, this.Camera2StreamConfigurationMap)) {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to rename ");
                                                    sb.append(file2);
                                                    sb.append(" to ");
                                                    sb.append(this.Camera2StreamConfigurationMap);
                                                    sb.append(". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                    throw new java.io.IOException(sb.toString());
                                                }
                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                mutex2.unlock(null);
                                                return kotlin.Unit.INSTANCE;
                                            }
                                            throw th;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            mutex2.unlock(null);
                                            throw th;
                                        }
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        file = file2;
                                        kotlinx.coroutines.sync.Mutex mutex4 = mutex2;
                                        e = e;
                                        mutex = mutex4;
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                        throw e;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    fileWriteScope = r9;
                                    mutex = mutex2;
                                    th = th4;
                                    file = file2;
                                    try {
                                        try {
                                            fileWriteScope.close();
                                        } catch (java.lang.Throwable th5) {
                                            kotlin.ExceptionsKt.addSuppressed(th, th5);
                                        }
                                        throw th;
                                    } catch (java.io.IOException e3) {
                                        mutex2 = mutex;
                                        e = e3;
                                        kotlinx.coroutines.sync.Mutex mutex42 = mutex2;
                                        e = e;
                                        mutex = mutex42;
                                        if (file.exists()) {
                                        }
                                        throw e;
                                    } catch (java.lang.Throwable th6) {
                                        mutex2 = mutex;
                                        th = th6;
                                        mutex2.unlock(null);
                                        throw th;
                                    }
                                }
                            }
                            mutex = (kotlinx.coroutines.sync.Mutex) fileStorageConnection$writeScope$1.getHighSpeedVideoSizes;
                            function22 = (kotlin.jvm.functions.Function2) fileStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(this.Camera2StreamConfigurationMap.getAbsolutePath());
                            sb2.append(".tmp");
                            file = new java.io.File(sb2.toString());
                            fileWriteScope = new androidx.content.core.FileWriteScope(file, this.getHighSpeedVideoFpsRanges);
                            fileStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                            fileStorageConnection$writeScope$1.getHighSpeedVideoSizes = file;
                            fileStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges = fileWriteScope;
                            fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap = 2;
                            if (function22.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                                mutex2 = mutex;
                                file2 = file;
                                r9 = fileWriteScope;
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                r9.close();
                                th = null;
                                if (th != null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    fileStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                    fileStorageConnection$writeScope$1.getHighSpeedVideoSizes = file;
                    fileStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges = fileWriteScope;
                    fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap = 2;
                    if (function22.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    fileWriteScope.close();
                    throw th;
                }
                fileWriteScope = new androidx.content.core.FileWriteScope(file, this.getHighSpeedVideoFpsRanges);
            } catch (java.io.IOException e4) {
                e = e4;
                if (file.exists()) {
                }
                throw e;
            }
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(this.Camera2StreamConfigurationMap.getAbsolutePath());
            sb22.append(".tmp");
            file = new java.io.File(sb22.toString());
        } catch (java.lang.Throwable th8) {
            kotlinx.coroutines.sync.Mutex mutex5 = mutex;
            th = th8;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        fileStorageConnection$writeScope$1 = new androidx.content.core.FileStorageConnection$writeScope$1(this, continuation);
        java.lang.Object obj2 = fileStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$writeScope$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    @Override // androidx.content.core.Closeable
    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.set(true);
        this.getHighSpeedVideoSizes.invoke();
    }
}
