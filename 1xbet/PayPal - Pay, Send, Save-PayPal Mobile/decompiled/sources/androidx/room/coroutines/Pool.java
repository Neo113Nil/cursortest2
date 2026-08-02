package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0012\u0010\u0016R\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0018\u0010\u000f\u001a\u00060\u001bj\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\u001a\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)"}, d2 = {"Landroidx/room/coroutines/Pool;", "", "", "p0", "Lkotlin/Function0;", "Landroidx/sqlite/SQLiteConnection;", "p1", "p2", "<init>", "(ILkotlin/jvm/functions/Function0;I)V", "Lkotlin/time/Duration;", "", "Landroidx/room/coroutines/ConnectionWithLock;", "getHighSpeedVideoSizes", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/room/coroutines/ConnectionWithLock;)V", "Camera2StreamConfigurationMap", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "(Ljava/lang/StringBuilder;)V", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getOutputMinFrameDuration", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/getHighSpeedVideoFpsRanges;", "getInputFormats", "Ljava/util/concurrent/locks/ReentrantLock;", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizesFor", "Z", "", "[Landroidx/room/coroutines/ConnectionWithLock;", "Lkotlinx/coroutines/sync/Semaphore;", "Lkotlinx/coroutines/sync/Semaphore;", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Pool {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.collections.ArrayDeque<androidx.room.coroutines.ConnectionWithLock> getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function0<androidx.database.SQLiteConnection> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.room.coroutines.ConnectionWithLock[] getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Semaphore getOutputMinFrameDuration;
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.locks.ReentrantLock getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public Pool(int i, kotlin.jvm.functions.Function0<? extends androidx.database.SQLiteConnection> function0, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = function0;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
        this.getInputFormats = new androidx.room.coroutines.ConnectionWithLock[i];
        this.getOutputMinFrameDuration = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(i, 0, 2, null);
        this.getInputSizeshNQ4ISI = new kotlin.collections.ArrayDeque<>(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|(2:10|11)|12|13|(1:(1:32)(2:16|(2:18|19)))(2:33|34)|21|22|23|24|(1:26)(9:27|12|13|(0)(0)|21|22|23|24|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r11 = r11;
        r10 = r10;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005d -> B:12:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.room.coroutines.ConnectionWithLock> continuation) {
        androidx.room.coroutines.Pool$acquireWithTimeout$1 pool$acquireWithTimeout$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        androidx.room.coroutines.Pool$acquireWithTimeout$1 pool$acquireWithTimeout$12;
        java.lang.Throwable th;
        androidx.room.coroutines.Pool$acquireWithTimeout$2 pool$acquireWithTimeout$2;
        if (continuation instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1) {
            pool$acquireWithTimeout$1 = (androidx.room.coroutines.Pool$acquireWithTimeout$1) continuation;
            if ((pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = pool$acquireWithTimeout$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    pool$acquireWithTimeout$2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2(objectRef2, this, null);
                    pool$acquireWithTimeout$1.getHighResolutionOutputSizeshNQ4ISI = function0;
                    pool$acquireWithTimeout$1.getHighSpeedVideoSizes = objectRef2;
                    pool$acquireWithTimeout$1.getHighSpeedVideoFpsRanges = j;
                    pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.TimeoutKt.m24066withTimeoutKLykuaI(j, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = pool$acquireWithTimeout$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) pool$acquireWithTimeout$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (kotlin.jvm.functions.Function0) pool$acquireWithTimeout$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        objectRef = objectRef3;
                        function0 = function02;
                        pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                        th = th2;
                    }
                    objectRef = objectRef3;
                    function0 = function02;
                    pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                    th = null;
                    if (th instanceof kotlinx.coroutines.TimeoutCancellationException) {
                        try {
                            function0.invoke();
                        } catch (java.lang.Throwable th3) {
                            androidx.room.coroutines.ConnectionWithLock connectionWithLock = (androidx.room.coroutines.ConnectionWithLock) objectRef.element;
                            if (connectionWithLock != null) {
                                getHighResolutionOutputSizeshNQ4ISI(connectionWithLock);
                            }
                            throw th3;
                        }
                    } else {
                        if (th != null) {
                            throw th;
                        }
                        if (objectRef.element != 0) {
                            return objectRef.element;
                        }
                    }
                    pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef22 = new kotlin.jvm.internal.Ref.ObjectRef();
                    pool$acquireWithTimeout$2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2(objectRef22, this, null);
                    pool$acquireWithTimeout$1.getHighResolutionOutputSizeshNQ4ISI = function0;
                    pool$acquireWithTimeout$1.getHighSpeedVideoSizes = objectRef22;
                    pool$acquireWithTimeout$1.getHighSpeedVideoFpsRanges = j;
                    pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.TimeoutKt.m24066withTimeoutKLykuaI(j, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function02 = function0;
                    objectRef3 = objectRef22;
                    objectRef = objectRef3;
                    function0 = function02;
                    pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                    th = null;
                    if (th instanceof kotlinx.coroutines.TimeoutCancellationException) {
                    }
                    pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef222 = new kotlin.jvm.internal.Ref.ObjectRef();
                    pool$acquireWithTimeout$2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2(objectRef222, this, null);
                    pool$acquireWithTimeout$1.getHighResolutionOutputSizeshNQ4ISI = function0;
                    pool$acquireWithTimeout$1.getHighSpeedVideoSizes = objectRef222;
                    pool$acquireWithTimeout$1.getHighSpeedVideoFpsRanges = j;
                    pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.TimeoutKt.m24066withTimeoutKLykuaI(j, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) == coroutine_suspended) {
                    }
                }
            }
        }
        pool$acquireWithTimeout$1 = new androidx.room.coroutines.Pool$acquireWithTimeout$1(this, continuation);
        java.lang.Object obj2 = pool$acquireWithTimeout$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pool$acquireWithTimeout$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:13:0x0045, B:15:0x0049, B:17:0x0051, B:19:0x0057, B:20:0x007a, B:24:0x0086, B:25:0x0092), top: B:12:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #0 {all -> 0x0093, blocks: (B:13:0x0045, B:15:0x0049, B:17:0x0051, B:19:0x0057, B:20:0x007a, B:24:0x0086, B:25:0x0092), top: B:12:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super androidx.room.coroutines.ConnectionWithLock> continuation) {
        androidx.room.coroutines.Pool$acquire$1 pool$acquire$1;
        int i;
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        try {
            try {
                if (continuation instanceof androidx.room.coroutines.Pool$acquire$1) {
                    pool$acquire$1 = (androidx.room.coroutines.Pool$acquire$1) continuation;
                    if ((pool$acquire$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                        pool$acquire$1.Camera2StreamConfigurationMap -= 2147483648;
                        java.lang.Object obj = pool$acquire$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = pool$acquire$1.Camera2StreamConfigurationMap;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.sync.Semaphore semaphore = this.getOutputMinFrameDuration;
                            pool$acquire$1.Camera2StreamConfigurationMap = 1;
                            if (semaphore.acquire(pool$acquire$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
                        reentrantLock.lock();
                        if (!this.getHighSpeedVideoSizesFor) {
                            androidx.database.SQLite.throwSQLiteException(21, "Connection pool is closed");
                            throw new kotlin.KotlinNothingValueException();
                        }
                        if (this.getInputSizeshNQ4ISI.isEmpty() && this.getHighSpeedVideoFpsRangesFor < this.getHighSpeedVideoSizes) {
                            androidx.room.coroutines.ConnectionWithLock connectionWithLock = new androidx.room.coroutines.ConnectionWithLock(this.getHighSpeedVideoFpsRanges.invoke(), null, this.Camera2StreamConfigurationMap, 2, null);
                            androidx.room.coroutines.ConnectionWithLock[] connectionWithLockArr = this.getInputFormats;
                            int i2 = this.getHighSpeedVideoFpsRangesFor;
                            this.getHighSpeedVideoFpsRangesFor = i2 + 1;
                            connectionWithLockArr[i2] = connectionWithLock;
                            this.getInputSizeshNQ4ISI.addLast(connectionWithLock);
                        }
                        return this.getInputSizeshNQ4ISI.removeLast();
                    }
                }
                if (!this.getHighSpeedVideoSizesFor) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
            reentrantLock.lock();
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDuration.release();
            throw th;
        }
        pool$acquire$1 = new androidx.room.coroutines.Pool$acquire$1(this, continuation);
        java.lang.Object obj2 = pool$acquire$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pool$acquire$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.room.coroutines.ConnectionWithLock p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            this.getInputSizeshNQ4ISI.addLast(p0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            this.getOutputMinFrameDuration.release();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void Camera2StreamConfigurationMap() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            this.getHighSpeedVideoSizesFor = true;
            for (androidx.room.coroutines.ConnectionWithLock connectionWithLock : this.getInputFormats) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void Camera2StreamConfigurationMap(java.lang.StringBuilder p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            int size = this.getInputSizeshNQ4ISI.size();
            for (int i = 0; i < size; i++) {
                createListBuilder.add(this.getInputSizeshNQ4ISI.get(i));
            }
            java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('\t');
            sb.append(super.toString());
            sb.append(" (");
            p0.append(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("capacity=");
            sb2.append(this.getHighSpeedVideoSizes);
            sb2.append(", ");
            p0.append(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append("permits=");
            sb3.append(this.getOutputMinFrameDuration.getAvailablePermits());
            sb3.append(", ");
            p0.append(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append("queue=(size=");
            sb4.append(build.size());
            sb4.append(")[");
            sb4.append(kotlin.collections.CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null));
            sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            p0.append(sb4.toString());
            p0.append(")\n");
            androidx.room.coroutines.ConnectionWithLock[] connectionWithLockArr = this.getInputFormats;
            int length = connectionWithLockArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                androidx.room.coroutines.ConnectionWithLock connectionWithLock = connectionWithLockArr[i3];
                i2++;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append("\t\t[");
                sb5.append(i2);
                sb5.append("] - ");
                sb5.append(connectionWithLock != null ? connectionWithLock.toString() : null);
                p0.append(sb5.toString());
                p0.append('\n');
                if (connectionWithLock != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                    if (connectionWithLock.getHighSpeedVideoFpsRanges != null || connectionWithLock.getHighSpeedVideoSizes != null) {
                        p0.append("\t\tStatus: Acquired connection\n");
                        kotlin.coroutines.CoroutineContext coroutineContext = connectionWithLock.getHighSpeedVideoFpsRanges;
                        if (coroutineContext != null) {
                            p0.append("\t\tCoroutine: ".concat(java.lang.String.valueOf(coroutineContext)));
                            p0.append('\n');
                        }
                        java.lang.Throwable th = connectionWithLock.getHighSpeedVideoSizes;
                        if (th != null) {
                            p0.append("\t\tAcquired:\n");
                            java.util.Iterator it = kotlin.collections.CollectionsKt.drop(kotlin.text.StringsKt.lines(kotlin.ExceptionsKt.stackTraceToString(th)), 1).iterator();
                            while (it.hasNext()) {
                                p0.append("\t\t".concat(java.lang.String.valueOf((java.lang.String) it.next())));
                                p0.append('\n');
                            }
                        }
                    } else {
                        p0.append("\t\tStatus: Free connection\n");
                    }
                    if (connectionWithLock.Camera2StreamConfigurationMap != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\t\tPrepared Statement Cache Size: ");
                        sb6.append(connectionWithLock.Camera2StreamConfigurationMap.size());
                        p0.append(sb6.toString());
                        p0.append('\n');
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
