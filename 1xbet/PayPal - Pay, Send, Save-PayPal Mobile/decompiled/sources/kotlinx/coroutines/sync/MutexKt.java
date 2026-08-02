package kotlinx.coroutines.sync;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aA\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/Mutex;", "Mutex", "(Z)Lkotlinx/coroutines/sync/Mutex;", "T", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Lkotlin/Function0;", "action", "withLock", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/internal/Symbol;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MutexKt {
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoSizes = new kotlinx.coroutines.internal.Symbol("NO_OWNER");
    private static final kotlinx.coroutines.internal.Symbol Camera2StreamConfigurationMap = new kotlinx.coroutines.internal.Symbol("ALREADY_LOCKED_BY_OWNER");

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean z) {
        return new kotlinx.coroutines.sync.MutexImpl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.sync.MutexKt$withLock$1 mutexKt$withLock$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.sync.MutexKt$withLock$1) {
                mutexKt$withLock$1 = (kotlinx.coroutines.sync.MutexKt$withLock$1) continuation;
                if ((mutexKt$withLock$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    mutexKt$withLock$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj2 = mutexKt$withLock$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mutexKt$withLock$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        mutexKt$withLock$1.getHighSpeedVideoFpsRanges = mutex;
                        mutexKt$withLock$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                        mutexKt$withLock$1.getHighSpeedVideoFpsRangesFor = function0;
                        mutexKt$withLock$1.Camera2StreamConfigurationMap = 1;
                        if (mutex.lock(obj, mutexKt$withLock$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (kotlin.jvm.functions.Function0) mutexKt$withLock$1.getHighSpeedVideoFpsRangesFor;
                        obj = mutexKt$withLock$1.getHighResolutionOutputSizeshNQ4ISI;
                        mutex = (kotlinx.coroutines.sync.Mutex) mutexKt$withLock$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return function0.invoke();
                }
            }
            return function0.invoke();
        } finally {
            mutex.unlock(obj);
        }
        mutexKt$withLock$1 = new kotlinx.coroutines.sync.MutexKt$withLock$1(continuation);
        java.lang.Object obj22 = mutexKt$withLock$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mutexKt$withLock$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        mutex.lock(obj, continuation);
        try {
            return function0.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }
}
