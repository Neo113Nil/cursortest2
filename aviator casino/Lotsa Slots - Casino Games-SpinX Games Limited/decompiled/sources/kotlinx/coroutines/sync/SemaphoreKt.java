package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a3\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\t\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "", "acquiredPermits", "withPermit", "T", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSegment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "id", "", "prev", "MAX_SPIN_CYCLES", "PERMIT", "Lkotlinx/coroutines/internal/Symbol;", "TAKEN", "BROKEN", "CANCELLED", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemaphoreKt {
    private static final kotlinx.coroutines.internal.Symbol BROKEN;
    private static final kotlinx.coroutines.internal.Symbol CANCELLED;
    private static final int MAX_SPIN_CYCLES;
    private static final kotlinx.coroutines.internal.Symbol PERMIT;
    private static final int SEGMENT_SIZE;
    private static final kotlinx.coroutines.internal.Symbol TAKEN;

    public static /* synthetic */ kotlinx.coroutines.sync.Semaphore Semaphore$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return Semaphore(i, i2);
    }

    public static final kotlinx.coroutines.sync.Semaphore Semaphore(int i, int i2) {
        return new kotlinx.coroutines.sync.SemaphoreImpl(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object withPermit(kotlinx.coroutines.sync.Semaphore semaphore, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 semaphoreKt$withPermit$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.sync.SemaphoreKt$withPermit$1) {
                semaphoreKt$withPermit$1 = (kotlinx.coroutines.sync.SemaphoreKt$withPermit$1) continuation;
                if ((semaphoreKt$withPermit$1.label & Integer.MIN_VALUE) != 0) {
                    semaphoreKt$withPermit$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = semaphoreKt$withPermit$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = semaphoreKt$withPermit$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        semaphoreKt$withPermit$1.L$0 = semaphore;
                        semaphoreKt$withPermit$1.L$1 = function0;
                        semaphoreKt$withPermit$1.label = 1;
                        if (semaphore.acquire(semaphoreKt$withPermit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (kotlin.jvm.functions.Function0) semaphoreKt$withPermit$1.L$1;
                        semaphore = (kotlinx.coroutines.sync.Semaphore) semaphoreKt$withPermit$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return function0.invoke();
                }
            }
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            semaphore.release();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
        semaphoreKt$withPermit$1 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1(continuation);
        java.lang.Object obj2 = semaphoreKt$withPermit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = semaphoreKt$withPermit$1.label;
        if (i != 0) {
        }
    }

    private static final <T> java.lang.Object withPermit$$forInline(kotlinx.coroutines.sync.Semaphore semaphore, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        semaphore.acquire(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            semaphore.release();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.sync.SemaphoreSegment createSegment(long j, kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment) {
        return new kotlinx.coroutines.sync.SemaphoreSegment(j, semaphoreSegment, 0);
    }

    static {
        int systemProp$default;
        int systemProp$default2;
        systemProp$default = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (java.lang.Object) null);
        MAX_SPIN_CYCLES = systemProp$default;
        PERMIT = new kotlinx.coroutines.internal.Symbol("PERMIT");
        TAKEN = new kotlinx.coroutines.internal.Symbol("TAKEN");
        BROKEN = new kotlinx.coroutines.internal.Symbol("BROKEN");
        CANCELLED = new kotlinx.coroutines.internal.Symbol("CANCELLED");
        systemProp$default2 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (java.lang.Object) null);
        SEGMENT_SIZE = systemProp$default2;
    }
}
