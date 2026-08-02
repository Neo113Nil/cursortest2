package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aB\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0080H¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u0010H\u0080H¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"T", "Landroidx/camera/camera2/pipe/core/CoroutineMutex;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Deferred;", "withLockAsync", "(Landroidx/camera/camera2/pipe/core/CoroutineMutex;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/Job;", "withLockLaunch", "(Landroidx/camera/camera2/pipe/core/CoroutineMutex;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/sync/Mutex;", "Landroidx/camera/camera2/pipe/core/Token;", "acquireToken", "(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireTokenAndSuspend", "tryAcquireToken", "(Lkotlinx/coroutines/sync/Mutex;)Landroidx/camera/camera2/pipe/core/Token;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutexesKt {
    public static final <T> kotlinx.coroutines.Deferred<T> withLockAsync(androidx.camera.camera2.pipe.core.CoroutineMutex coroutineMutex, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.Deferred<T> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineMutex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1(coroutineMutex, function2, null), 1, null);
        return async$default;
    }

    public static final kotlinx.coroutines.Job withLockLaunch(androidx.camera.camera2.pipe.core.CoroutineMutex coroutineMutex, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineMutex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1(coroutineMutex, function2, null), 1, null);
        return launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object acquireToken(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Token> continuation) {
        androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1 mutexesKt$acquireToken$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1) {
            mutexesKt$acquireToken$1 = (androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1) continuation;
            if ((mutexesKt$acquireToken$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mutexesKt$acquireToken$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mutexesKt$acquireToken$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mutexesKt$acquireToken$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutexesKt$acquireToken$1.Camera2StreamConfigurationMap = mutex;
                    mutexesKt$acquireToken$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(mutex, null, mutexesKt$acquireToken$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) mutexesKt$acquireToken$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
            }
        }
        mutexesKt$acquireToken$1 = new androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1(continuation);
        java.lang.Object obj2 = mutexesKt$acquireToken$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mutexesKt$acquireToken$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object acquireTokenAndSuspend(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Token> continuation) {
        androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1 mutexesKt$acquireTokenAndSuspend$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1) {
            mutexesKt$acquireTokenAndSuspend$1 = (androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1) continuation;
            if ((mutexesKt$acquireTokenAndSuspend$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mutexesKt$acquireTokenAndSuspend$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mutexesKt$acquireTokenAndSuspend$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mutexesKt$acquireTokenAndSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutexesKt$acquireTokenAndSuspend$1.getHighSpeedVideoFpsRanges = mutex;
                    mutexesKt$acquireTokenAndSuspend$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (access$lockAndSuspend(mutex, mutexesKt$acquireTokenAndSuspend$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) mutexesKt$acquireTokenAndSuspend$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
            }
        }
        mutexesKt$acquireTokenAndSuspend$1 = new androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1(continuation);
        java.lang.Object obj2 = mutexesKt$acquireTokenAndSuspend$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mutexesKt$acquireTokenAndSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
    }

    public static final androidx.camera.camera2.pipe.core.Token tryAcquireToken(kotlinx.coroutines.sync.Mutex mutex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "");
        if (kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(mutex, null, 1, null)) {
            return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
        }
        return null;
    }

    public static final /* synthetic */ java.lang.Object access$lockAndSuspend(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation continuation) {
        androidx.camera.camera2.pipe.core.MutexesKt$lockAndSuspend$lockFn$1 mutexesKt$lockAndSuspend$lockFn$1 = androidx.camera.camera2.pipe.core.MutexesKt$lockAndSuspend$lockFn$1.getHighSpeedVideoSizes;
        if ((!(mutexesKt$lockAndSuspend$lockFn$1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(mutexesKt$lockAndSuspend$lockFn$1, mutex, continuation) : ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexesKt$lockAndSuspend$lockFn$1, 2)).invoke(mutex, continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            intercepted.resumeWith(kotlin.Result.m23436constructorimpl(unit));
        }
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$lockWithoutOwner(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation continuation) {
        java.lang.Object lock = mutex.lock(null, continuation);
        return lock == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? lock : kotlin.Unit.INSTANCE;
    }
}
