package androidx.content.core.okio;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001028\u0010\u0018\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001d\u001a\u00020\f2-\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001b¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "getHighSpeedVideoFpsRanges", "Lokio/FileSystem;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/Path;", "getHighSpeedVideoFpsRangesFor", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Landroidx/datastore/core/okio/AtomicBoolean;", "Landroidx/datastore/core/okio/AtomicBoolean;", "Lkotlinx/coroutines/sync/Mutex;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkioStorageConnection<T> implements androidx.content.core.StorageConnection<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.content.core.InterProcessCoordinator coordinator;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.Path getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okio.FileSystem getHighSpeedVideoSizes;
    private final androidx.content.core.okio.OkioSerializer<T> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.content.core.okio.AtomicBoolean Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getOutputMinFrameDuration;

    public OkioStorageConnection(okio.FileSystem fileSystem, okio.Path path, androidx.content.core.okio.OkioSerializer<T> okioSerializer, androidx.content.core.InterProcessCoordinator interProcessCoordinator, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okioSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interProcessCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = fileSystem;
        this.getHighSpeedVideoFpsRanges = path;
        this.getHighSpeedVideoFpsRangesFor = okioSerializer;
        this.coordinator = interProcessCoordinator;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = new androidx.content.core.okio.AtomicBoolean(false);
        this.getOutputMinFrameDuration = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.content.core.StorageConnection
    public final androidx.content.core.InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:52|53))|14|15|16|(2:(1:19)|20)(1:22)))|56|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[Catch: all -> 0x0082, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:22:0x0081, B:28:0x0091, B:31:0x008e, B:27:0x0089), top: B:7:0x0023, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object readScope(kotlin.jvm.functions.Function3<? super androidx.content.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.content.core.okio.OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1;
        int i;
        boolean z;
        java.lang.Throwable th;
        androidx.content.core.Closeable closeable;
        java.lang.Throwable th2;
        try {
            if (continuation instanceof androidx.content.core.okio.OkioStorageConnection$readScope$1) {
                okioStorageConnection$readScope$1 = (androidx.content.core.okio.OkioStorageConnection$readScope$1) continuation;
                if ((okioStorageConnection$readScope$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    okioStorageConnection$readScope$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = okioStorageConnection$readScope$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = okioStorageConnection$readScope$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!this.Camera2StreamConfigurationMap.get()) {
                            z = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.getOutputMinFrameDuration, null, 1, null);
                            try {
                                androidx.content.core.okio.OkioReadScope okioReadScope = new androidx.content.core.okio.OkioReadScope(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                                try {
                                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                                    okioStorageConnection$readScope$1.Camera2StreamConfigurationMap = okioReadScope;
                                    okioStorageConnection$readScope$1.getHighSpeedVideoSizes = z;
                                    okioStorageConnection$readScope$1.getHighSpeedVideoFpsRanges = 1;
                                    java.lang.Object invoke = function3.invoke(okioReadScope, boxBoolean, okioStorageConnection$readScope$1);
                                    if (invoke == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    closeable = okioReadScope;
                                    obj = invoke;
                                    function3 = z ? 1 : 0;
                                } catch (java.lang.Throwable th3) {
                                    closeable = okioReadScope;
                                    th2 = th3;
                                    function3 = z ? 1 : 0;
                                    closeable.close();
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                if (z) {
                                    kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getOutputMinFrameDuration, null, 1, null);
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
                        function3 = (kotlin.jvm.functions.Function3<? super androidx.content.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>) okioStorageConnection$readScope$1.getHighSpeedVideoSizes;
                        closeable = (androidx.content.core.Closeable) okioStorageConnection$readScope$1.Camera2StreamConfigurationMap;
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
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getOutputMinFrameDuration, null, 1, null);
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
        okioStorageConnection$readScope$1 = new androidx.content.core.okio.OkioStorageConnection$readScope$1(this, continuation);
        java.lang.Object obj2 = okioStorageConnection$readScope$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioStorageConnection$readScope$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[Catch: all -> 0x00e4, IOException -> 0x00e6, TRY_ENTER, TryCatch #2 {all -> 0x00e4, blocks: (B:20:0x00cc, B:22:0x00d4, B:23:0x00db, B:27:0x00e3), top: B:18:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3 A[Catch: all -> 0x00e4, IOException -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00e4, blocks: (B:20:0x00cc, B:22:0x00d4, B:23:0x00db, B:27:0x00e3), top: B:18:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.datastore.core.Closeable] */
    /* JADX WARN: Type inference failed for: r10v30, types: [androidx.datastore.core.Closeable] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeScope(kotlin.jvm.functions.Function2<? super androidx.content.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.okio.OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Throwable th;
        ?? r0;
        okio.Path parent;
        kotlin.jvm.functions.Function2<? super androidx.content.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22;
        kotlinx.coroutines.sync.Mutex mutex;
        okio.Path resolve;
        androidx.content.core.okio.OkioWriteScope okioWriteScope;
        okio.Path path;
        ?? r10;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.io.IOException e;
        try {
            try {
                try {
                    if (continuation instanceof androidx.content.core.okio.OkioStorageConnection$writeScope$1) {
                        okioStorageConnection$writeScope$1 = (androidx.content.core.okio.OkioStorageConnection$writeScope$1) continuation;
                        if ((okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj = okioStorageConnection$writeScope$1.getHighSpeedVideoSizes;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (!this.Camera2StreamConfigurationMap.get()) {
                                    parent = this.getHighSpeedVideoFpsRanges.parent();
                                    if (parent == null) {
                                        throw new java.lang.IllegalStateException("must have a parent path".toString());
                                    }
                                    this.getHighSpeedVideoSizes.createDirectories(parent, false);
                                    kotlinx.coroutines.sync.Mutex mutex3 = this.getOutputMinFrameDuration;
                                    okioStorageConnection$writeScope$1.Camera2StreamConfigurationMap = function2;
                                    okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor = parent;
                                    okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges = mutex3;
                                    okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                    if (mutex3.lock(null, okioStorageConnection$writeScope$1) != coroutine_suspended) {
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
                                r10 = (androidx.content.core.Closeable) okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges;
                                path = (okio.Path) okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor;
                                r0 = (kotlinx.coroutines.sync.Mutex) okioStorageConnection$writeScope$1.Camera2StreamConfigurationMap;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    r0 = r0;
                                    r10 = r10;
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    try {
                                        r10.close();
                                        th = null;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        try {
                                            if (th != null) {
                                                if (this.getHighSpeedVideoSizes.exists(path)) {
                                                    this.getHighSpeedVideoSizes.atomicMove(path, this.getHighSpeedVideoFpsRanges);
                                                }
                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                r0.unlock(null);
                                                return kotlin.Unit.INSTANCE;
                                            }
                                            throw th;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            r0.unlock(null);
                                            throw th;
                                        }
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        resolve = path;
                                        mutex2 = r0;
                                        e = e;
                                        if (this.getHighSpeedVideoSizes.exists(resolve)) {
                                            try {
                                                this.getHighSpeedVideoSizes.delete(resolve);
                                            } catch (java.io.IOException unused) {
                                            }
                                        }
                                        throw e;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    okioWriteScope = r10;
                                    mutex = r0;
                                    th = th4;
                                    resolve = path;
                                    try {
                                        try {
                                            okioWriteScope.close();
                                        } catch (java.lang.Throwable th5) {
                                            kotlin.ExceptionsKt.addSuppressed(th, th5);
                                        }
                                        throw th;
                                    } catch (java.io.IOException e3) {
                                        mutex2 = mutex;
                                        e = e3;
                                        e = e;
                                        if (this.getHighSpeedVideoSizes.exists(resolve)) {
                                        }
                                        throw e;
                                    } catch (java.lang.Throwable th6) {
                                        r0 = mutex;
                                        th = th6;
                                        r0.unlock(null);
                                        throw th;
                                    }
                                }
                            }
                            mutex = (kotlinx.coroutines.sync.Mutex) okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges;
                            parent = (okio.Path) okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor;
                            function22 = (kotlin.jvm.functions.Function2) okioStorageConnection$writeScope$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(this.getHighSpeedVideoFpsRanges.name());
                            sb.append(".tmp");
                            resolve = parent.resolve(sb.toString());
                            this.getHighSpeedVideoSizes.delete(resolve, false);
                            okioWriteScope = new androidx.content.core.okio.OkioWriteScope(this.getHighSpeedVideoSizes, resolve, this.getHighSpeedVideoFpsRangesFor);
                            okioStorageConnection$writeScope$1.Camera2StreamConfigurationMap = mutex;
                            okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor = resolve;
                            okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges = okioWriteScope;
                            okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            if (function22.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                                r0 = mutex;
                                path = resolve;
                                r10 = okioWriteScope;
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                r10.close();
                                th = null;
                                if (th != null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    okioStorageConnection$writeScope$1.Camera2StreamConfigurationMap = mutex;
                    okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRangesFor = resolve;
                    okioStorageConnection$writeScope$1.getHighSpeedVideoFpsRanges = okioWriteScope;
                    okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    if (function22.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    okioWriteScope.close();
                    throw th;
                }
                this.getHighSpeedVideoSizes.delete(resolve, false);
                okioWriteScope = new androidx.content.core.okio.OkioWriteScope(this.getHighSpeedVideoSizes, resolve, this.getHighSpeedVideoFpsRangesFor);
            } catch (java.io.IOException e4) {
                e = e4;
                if (this.getHighSpeedVideoSizes.exists(resolve)) {
                }
                throw e;
            }
            if (i != 0) {
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.getHighSpeedVideoFpsRanges.name());
            sb2.append(".tmp");
            resolve = parent.resolve(sb2.toString());
        } catch (java.lang.Throwable th8) {
            th = th8;
            r0 = function2;
        }
        okioStorageConnection$writeScope$1 = new androidx.content.core.okio.OkioStorageConnection$writeScope$1(this, continuation);
        java.lang.Object obj2 = okioStorageConnection$writeScope$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioStorageConnection$writeScope$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.content.core.Closeable
    public final void close() {
        this.Camera2StreamConfigurationMap.set(true);
        this.getHighResolutionOutputSizeshNQ4ISI.invoke();
    }
}
