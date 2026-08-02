package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "Landroidx/datastore/core/AtomicInt;", "getHighSpeedVideoFpsRanges", "Landroidx/datastore/core/AtomicInt;", "Lkotlinx/coroutines/flow/Flow;", "", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleProcessCoordinator implements androidx.content.core.InterProcessCoordinator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.content.core.AtomicInt getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateNotifications;

    public SingleProcessCoordinator(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.content.core.AtomicInt(0);
        this.updateNotifications = kotlinx.coroutines.flow.FlowKt.flow(new androidx.content.core.SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object lock(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        int i;
        kotlin.jvm.functions.Function1 function12;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof androidx.content.core.SingleProcessCoordinator$lock$1) {
                singleProcessCoordinator$lock$1 = (androidx.content.core.SingleProcessCoordinator$lock$1) continuation;
                if ((singleProcessCoordinator$lock$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    singleProcessCoordinator$lock$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = singleProcessCoordinator$lock$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessCoordinator$lock$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoSizes;
                        singleProcessCoordinator$lock$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        singleProcessCoordinator$lock$1.getHighSpeedVideoFpsRanges = mutex2;
                        singleProcessCoordinator$lock$1.getHighSpeedVideoSizes = 1;
                        if (mutex2.lock(null, singleProcessCoordinator$lock$1) != coroutine_suspended) {
                            function12 = function1;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z = (kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object>) ((kotlinx.coroutines.sync.Mutex) singleProcessCoordinator$lock$1.getHighResolutionOutputSizeshNQ4ISI);
                        kotlin.ResultKt.throwOnFailure(obj);
                        function1 = z;
                        return obj;
                    }
                    kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) singleProcessCoordinator$lock$1.getHighSpeedVideoFpsRanges;
                    function12 = (kotlin.jvm.functions.Function1) singleProcessCoordinator$lock$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    singleProcessCoordinator$lock$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                    singleProcessCoordinator$lock$1.getHighSpeedVideoFpsRanges = null;
                    singleProcessCoordinator$lock$1.getHighSpeedVideoSizes = 2;
                    obj = function12.invoke(singleProcessCoordinator$lock$1);
                    function1 = mutex;
                }
            }
            if (i != 0) {
            }
            singleProcessCoordinator$lock$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
            singleProcessCoordinator$lock$1.getHighSpeedVideoFpsRanges = null;
            singleProcessCoordinator$lock$1.getHighSpeedVideoSizes = 2;
            obj = function12.invoke(singleProcessCoordinator$lock$1);
            function1 = mutex;
        } finally {
            function1.unlock(null);
        }
        singleProcessCoordinator$lock$1 = new androidx.content.core.SingleProcessCoordinator$lock$1(this, continuation);
        java.lang.Object obj2 = singleProcessCoordinator$lock$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessCoordinator$lock$1.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object tryLock(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        boolean z;
        if (continuation instanceof androidx.content.core.SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (androidx.content.core.SingleProcessCoordinator$tryLock$1) continuation;
            if ((singleProcessCoordinator$tryLock$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = singleProcessCoordinator$tryLock$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessCoordinator$tryLock$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoSizes;
                    boolean tryLock = mutex2.tryLock(null);
                    try {
                        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(tryLock);
                        singleProcessCoordinator$tryLock$1.getHighSpeedVideoSizes = mutex2;
                        singleProcessCoordinator$tryLock$1.getHighResolutionOutputSizeshNQ4ISI = tryLock;
                        singleProcessCoordinator$tryLock$1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object invoke = function2.invoke(boxBoolean, singleProcessCoordinator$tryLock$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        obj = invoke;
                        z = tryLock;
                    } catch (java.lang.Throwable th2) {
                        mutex = mutex2;
                        th = th2;
                        z = tryLock;
                        if (z) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = singleProcessCoordinator$tryLock$1.getHighResolutionOutputSizeshNQ4ISI;
                    mutex = (kotlinx.coroutines.sync.Mutex) singleProcessCoordinator$tryLock$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        if (z) {
                            mutex.unlock(null);
                        }
                        throw th;
                    }
                }
                if (z) {
                    mutex.unlock(null);
                }
                return obj;
            }
        }
        singleProcessCoordinator$tryLock$1 = new androidx.content.core.SingleProcessCoordinator$tryLock$1(this, continuation);
        java.lang.Object obj2 = singleProcessCoordinator$tryLock$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessCoordinator$tryLock$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (z) {
        }
        return obj2;
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final java.lang.Object incrementAndGetVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet());
    }
}
