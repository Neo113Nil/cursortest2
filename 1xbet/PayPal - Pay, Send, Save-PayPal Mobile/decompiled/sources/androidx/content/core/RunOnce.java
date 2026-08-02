package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitComplete", "runIfNeeded", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CompletableDeferred;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RunOnce {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    protected abstract java.lang.Object doRun(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public final java.lang.Object awaitComplete(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object await = this.getHighResolutionOutputSizeshNQ4ISI.await(continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        if (r8.lock(null, r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:26:0x005f, B:28:0x0067, B:31:0x006d), top: B:25:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[Catch: all -> 0x008a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:26:0x005f, B:28:0x0067, B:31:0x006d), top: B:25:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object runIfNeeded(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            if (continuation instanceof androidx.content.core.RunOnce$runIfNeeded$1) {
                runOnce$runIfNeeded$1 = (androidx.content.core.RunOnce$runIfNeeded$1) continuation;
                if ((runOnce$runIfNeeded$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    runOnce$runIfNeeded$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = runOnce$runIfNeeded$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = runOnce$runIfNeeded$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighResolutionOutputSizeshNQ4ISI.isCompleted()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        mutex = this.getHighSpeedVideoSizes;
                        runOnce$runIfNeeded$1.getHighSpeedVideoFpsRangesFor = mutex;
                        runOnce$runIfNeeded$1.getHighSpeedVideoSizes = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) runOnce$runIfNeeded$1.getHighSpeedVideoFpsRangesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                this.getHighResolutionOutputSizeshNQ4ISI.complete(kotlin.Unit.INSTANCE);
                                mutex2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th) {
                                kotlinx.coroutines.sync.Mutex mutex3 = mutex2;
                                th = th;
                                mutex = mutex3;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) runOnce$runIfNeeded$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                    }
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isCompleted()) {
                        runOnce$runIfNeeded$1.getHighSpeedVideoFpsRangesFor = mutex;
                        runOnce$runIfNeeded$1.getHighSpeedVideoSizes = 2;
                        if (doRun(runOnce$runIfNeeded$1) != coroutine_suspended) {
                            mutex2 = mutex;
                            this.getHighResolutionOutputSizeshNQ4ISI.complete(kotlin.Unit.INSTANCE);
                            mutex2.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.isCompleted()) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
        runOnce$runIfNeeded$1 = new androidx.content.core.RunOnce$runIfNeeded$1(this, continuation);
        java.lang.Object obj2 = runOnce$runIfNeeded$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runOnce$runIfNeeded$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }
}
