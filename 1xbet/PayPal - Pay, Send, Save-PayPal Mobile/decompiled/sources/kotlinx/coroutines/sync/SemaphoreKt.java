package kotlinx.coroutines.sync;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/Semaphore;", "Semaphore", "(II)Lkotlinx/coroutines/sync/Semaphore;", "T", "Lkotlin/Function0;", "action", "withPermit", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlinx/coroutines/internal/Symbol;", "getOutputMinFrameDuration", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SemaphoreKt {
    private static final int Camera2StreamConfigurationMap;
    private static final int getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRanges;
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRangesFor;
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoSizes;
    private static final kotlinx.coroutines.internal.Symbol getOutputMinFrameDuration;

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
                if ((semaphoreKt$withPermit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    semaphoreKt$withPermit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = semaphoreKt$withPermit$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = semaphoreKt$withPermit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        semaphoreKt$withPermit$1.Camera2StreamConfigurationMap = semaphore;
                        semaphoreKt$withPermit$1.getHighSpeedVideoFpsRangesFor = function0;
                        semaphoreKt$withPermit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (semaphore.acquire(semaphoreKt$withPermit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (kotlin.jvm.functions.Function0) semaphoreKt$withPermit$1.getHighSpeedVideoFpsRangesFor;
                        semaphore = (kotlinx.coroutines.sync.Semaphore) semaphoreKt$withPermit$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return function0.invoke();
                }
            }
            return function0.invoke();
        } finally {
            semaphore.release();
        }
        semaphoreKt$withPermit$1 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1(continuation);
        java.lang.Object obj2 = semaphoreKt$withPermit$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = semaphoreKt$withPermit$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    static {
        int systemProp$default;
        int systemProp$default2;
        systemProp$default = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (java.lang.Object) null);
        Camera2StreamConfigurationMap = systemProp$default;
        getHighSpeedVideoFpsRangesFor = new kotlinx.coroutines.internal.Symbol("PERMIT");
        getOutputMinFrameDuration = new kotlinx.coroutines.internal.Symbol("TAKEN");
        getHighSpeedVideoFpsRanges = new kotlinx.coroutines.internal.Symbol("BROKEN");
        getHighSpeedVideoSizes = new kotlinx.coroutines.internal.Symbol(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        systemProp$default2 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (java.lang.Object) null);
        getHighResolutionOutputSizeshNQ4ISI = systemProp$default2;
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment access$createSegment(long j, kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment) {
        return new kotlinx.coroutines.sync.SemaphoreSegment(j, semaphoreSegment, 0);
    }
}
