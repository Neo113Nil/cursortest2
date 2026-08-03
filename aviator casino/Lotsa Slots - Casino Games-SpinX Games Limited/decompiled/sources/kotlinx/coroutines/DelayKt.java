package kotlinx.coroutines;

/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000f\u001a\u00020\u0006*\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0003\u001a\u00020\u000b*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"awaitCancellation", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delay", "", "timeMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Lkotlin/time/Duration;", "delay-VtjQ1oo", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "toDelayMillis", "toDelayMillis-LRDsOJo", "(J)J", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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
            if ((delayKt$awaitCancellation$1.label & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = delayKt$awaitCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = delayKt$awaitCancellation$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    delayKt$awaitCancellation$1.label = 1;
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
        java.lang.Object obj2 = delayKt$awaitCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = delayKt$awaitCancellation$1.label;
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
            getDelay(cancellableContinuationImpl2.getContext()).mo12371scheduleResumeAfterDelay(j, cancellableContinuationImpl2);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final java.lang.Object m12291delayVtjQ1oo(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object delay = delay(m12292toDelayMillisLRDsOJo(j), continuation);
        return delay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : kotlin.Unit.INSTANCE;
    }

    public static final kotlinx.coroutines.Delay getDelay(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        kotlinx.coroutines.Delay delay = element instanceof kotlinx.coroutines.Delay ? (kotlinx.coroutines.Delay) element : null;
        return delay == null ? kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m12292toDelayMillisLRDsOJo(long j) {
        boolean m12173isPositiveimpl = kotlin.time.Duration.m12173isPositiveimpl(j);
        if (m12173isPositiveimpl) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            return kotlin.time.Duration.m12157getInWholeMillisecondsimpl(kotlin.time.Duration.m12175plusLRDsOJo(j, kotlin.time.DurationKt.toDuration(999999L, kotlin.time.DurationUnit.NANOSECONDS)));
        }
        if (m12173isPositiveimpl) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
