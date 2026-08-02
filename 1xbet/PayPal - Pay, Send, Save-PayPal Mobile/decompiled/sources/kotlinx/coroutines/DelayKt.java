package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0006\u001a\u00020\u000f*\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"", "awaitCancellation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "delay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "duration", "delay-VtjQ1oo", "toDelayMillis-LRDsOJo", "(J)J", "toDelayMillis", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/Delay;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitCancellation(kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) continuation;
            if ((delayKt$awaitCancellation$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = delayKt$awaitCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = delayKt$awaitCancellation$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    delayKt$awaitCancellation$1.getHighSpeedVideoSizes = 1;
                    kotlinx.coroutines.DelayKt$awaitCancellation$1 delayKt$awaitCancellation$12 = delayKt$awaitCancellation$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(delayKt$awaitCancellation$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    java.lang.Object result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(delayKt$awaitCancellation$12);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        delayKt$awaitCancellation$1 = new kotlinx.coroutines.DelayKt$awaitCancellation$1(continuation);
        java.lang.Object obj2 = delayKt$awaitCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = delayKt$awaitCancellation$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public static final java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (j <= 0) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (j < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl2.getContext()).scheduleResumeAfterDelay(j, cancellableContinuationImpl2);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final java.lang.Object m24057delayVtjQ1oo(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object delay = delay(m24058toDelayMillisLRDsOJo(j), continuation);
        return delay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : kotlin.Unit.INSTANCE;
    }

    public static final kotlinx.coroutines.Delay getDelay(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        kotlinx.coroutines.Delay delay = element instanceof kotlinx.coroutines.Delay ? (kotlinx.coroutines.Delay) element : null;
        return delay == null ? kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m24058toDelayMillisLRDsOJo(long j) {
        boolean m23964isPositiveimpl = kotlin.time.Duration.m23964isPositiveimpl(j);
        if (m23964isPositiveimpl) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            return kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.Duration.m23966plusLRDsOJo(j, kotlin.time.DurationKt.toDuration(999999L, kotlin.time.DurationUnit.NANOSECONDS)));
        }
        if (m23964isPositiveimpl) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
