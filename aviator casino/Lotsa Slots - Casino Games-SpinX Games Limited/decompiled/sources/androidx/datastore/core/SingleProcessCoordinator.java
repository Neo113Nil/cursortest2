package androidx.datastore.core;

/* compiled from: SingleProcessCoordinator.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J2\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0096@¢\u0006\u0002\u0010\u0018J8\u0010\u0019\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001aH\u0096@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", com.ironsource.T5.c.c, "", "(Ljava/lang/String;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "version", "Landroidx/datastore/core/AtomicInt;", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleProcessCoordinator implements androidx.datastore.core.InterProcessCoordinator {
    private final java.lang.String filePath;
    private final kotlinx.coroutines.sync.Mutex mutex;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateNotifications;
    private final androidx.datastore.core.AtomicInt version;

    public SingleProcessCoordinator(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.version = new androidx.datastore.core.AtomicInt(0);
        this.updateNotifications = kotlinx.coroutines.flow.FlowKt.flow(new androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> java.lang.Object lock(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object invoke;
        try {
            if (continuation instanceof androidx.datastore.core.SingleProcessCoordinator$lock$1) {
                singleProcessCoordinator$lock$1 = (androidx.datastore.core.SingleProcessCoordinator$lock$1) continuation;
                if ((singleProcessCoordinator$lock$1.label & Integer.MIN_VALUE) != 0) {
                    singleProcessCoordinator$lock$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = singleProcessCoordinator$lock$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessCoordinator$lock$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        singleProcessCoordinator$lock$1.L$0 = function1;
                        singleProcessCoordinator$lock$1.L$1 = mutex;
                        singleProcessCoordinator$lock$1.label = 1;
                        if (mutex.lock(null, singleProcessCoordinator$lock$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) singleProcessCoordinator$lock$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) singleProcessCoordinator$lock$1.L$1;
                        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function12 = (kotlin.jvm.functions.Function1) singleProcessCoordinator$lock$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        function1 = function12;
                    }
                    singleProcessCoordinator$lock$1.L$0 = mutex;
                    singleProcessCoordinator$lock$1.L$1 = null;
                    singleProcessCoordinator$lock$1.label = 2;
                    invoke = function1.invoke(singleProcessCoordinator$lock$1);
                    if (invoke != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinx.coroutines.sync.Mutex mutex4 = mutex;
                    obj = invoke;
                    mutex2 = mutex4;
                    mutex2.unlock(null);
                    return obj;
                }
            }
            singleProcessCoordinator$lock$1.L$0 = mutex;
            singleProcessCoordinator$lock$1.L$1 = null;
            singleProcessCoordinator$lock$1.label = 2;
            invoke = function1.invoke(singleProcessCoordinator$lock$1);
            if (invoke != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.sync.Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        singleProcessCoordinator$lock$1 = new androidx.datastore.core.SingleProcessCoordinator$lock$1(this, continuation);
        java.lang.Object obj2 = singleProcessCoordinator$lock$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessCoordinator$lock$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> java.lang.Object tryLock(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        boolean z;
        if (continuation instanceof androidx.datastore.core.SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (androidx.datastore.core.SingleProcessCoordinator$tryLock$1) continuation;
            if ((singleProcessCoordinator$tryLock$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = singleProcessCoordinator$tryLock$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessCoordinator$tryLock$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.sync.Mutex mutex2 = this.mutex;
                    boolean tryLock = mutex2.tryLock(null);
                    try {
                        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(tryLock);
                        singleProcessCoordinator$tryLock$1.L$0 = mutex2;
                        singleProcessCoordinator$tryLock$1.Z$0 = tryLock;
                        singleProcessCoordinator$tryLock$1.label = 1;
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
                    z = singleProcessCoordinator$tryLock$1.Z$0;
                    mutex = (kotlinx.coroutines.sync.Mutex) singleProcessCoordinator$tryLock$1.L$0;
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
        singleProcessCoordinator$tryLock$1 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1(this, continuation);
        java.lang.Object obj2 = singleProcessCoordinator$tryLock$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessCoordinator$tryLock$1.label;
        if (i != 0) {
        }
        if (z) {
        }
        return obj2;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object incrementAndGetVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(this.version.incrementAndGet());
    }
}
