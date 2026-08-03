package androidx.datastore.core;

/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0005H¤@¢\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "()V", "didRun", "Lkotlinx/coroutines/CompletableDeferred;", "", "runMutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRun", "runIfNeeded", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RunOnce {
    private final kotlinx.coroutines.sync.Mutex runMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> didRun = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    protected abstract java.lang.Object doRun(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public final java.lang.Object awaitComplete(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object await = this.didRun.await(continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:25:0x006b, B:27:0x0073, B:30:0x0079), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:25:0x006b, B:27:0x0073, B:30:0x0079), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object runIfNeeded(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.datastore.core.RunOnce runOnce;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        androidx.datastore.core.RunOnce runOnce2;
        try {
            if (continuation instanceof androidx.datastore.core.RunOnce$runIfNeeded$1) {
                runOnce$runIfNeeded$1 = (androidx.datastore.core.RunOnce$runIfNeeded$1) continuation;
                if ((runOnce$runIfNeeded$1.label & Integer.MIN_VALUE) != 0) {
                    runOnce$runIfNeeded$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = runOnce$runIfNeeded$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = runOnce$runIfNeeded$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.didRun.isCompleted()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        mutex = this.runMutex;
                        runOnce$runIfNeeded$1.L$0 = this;
                        runOnce$runIfNeeded$1.L$1 = mutex;
                        runOnce$runIfNeeded$1.label = 1;
                        if (mutex.lock(null, runOnce$runIfNeeded$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        runOnce = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) runOnce$runIfNeeded$1.L$1;
                            runOnce2 = (androidx.datastore.core.RunOnce) runOnce$runIfNeeded$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                runOnce2.didRun.complete(kotlin.Unit.INSTANCE);
                                mutex2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) runOnce$runIfNeeded$1.L$1;
                        runOnce = (androidx.datastore.core.RunOnce) runOnce$runIfNeeded$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    if (runOnce.didRun.isCompleted()) {
                        runOnce$runIfNeeded$1.L$0 = runOnce;
                        runOnce$runIfNeeded$1.L$1 = mutex;
                        runOnce$runIfNeeded$1.label = 2;
                        if (runOnce.doRun(runOnce$runIfNeeded$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        runOnce2 = runOnce;
                        runOnce2.didRun.complete(kotlin.Unit.INSTANCE);
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            if (runOnce.didRun.isCompleted()) {
            }
        } catch (java.lang.Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        runOnce$runIfNeeded$1 = new androidx.datastore.core.RunOnce$runIfNeeded$1(this, continuation);
        java.lang.Object obj2 = runOnce$runIfNeeded$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runOnce$runIfNeeded$1.label;
        if (i != 0) {
        }
    }
}
