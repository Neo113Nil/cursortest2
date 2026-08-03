package kotlinx.coroutines;

/* compiled from: Timeout.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\n\u001aT\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u000b\u001a\u00020\f2'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001aG\u0010\u000e\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@¢\u0006\u0002\u0010\n\u001aI\u0010\u000e\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u000b\u001a\u00020\f2'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@¢\u0006\u0004\b\u000f\u0010\n\u001a\\\u0010\u0010\u001a\u0004\u0018\u00010\b\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0001*\u0002H\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00010\u00132'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001aH\u0000¨\u0006\u001b"}, d2 = {"withTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeout", "Lkotlin/time/Duration;", "withTimeout-KLykuaI", "withTimeoutOrNull", "withTimeoutOrNull-KLykuaI", "setupTimeout", "U", "coroutine", "Lkotlinx/coroutines/TimeoutCoroutine;", "(Lkotlinx/coroutines/TimeoutCoroutine;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "TimeoutCancellationException", "Lkotlinx/coroutines/TimeoutCancellationException;", "time", "delay", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeoutKt {
    public static final <T> java.lang.Object withTimeout(long j, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        if (j <= 0) {
            throw new kotlinx.coroutines.TimeoutCancellationException("Timed out immediately");
        }
        java.lang.Object obj = setupTimeout(new kotlinx.coroutines.TimeoutCoroutine(j, continuation), function2);
        if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return obj;
    }

    /* renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> java.lang.Object m12301withTimeoutKLykuaI(long j, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return withTimeout(kotlinx.coroutines.DelayKt.m12292toDelayMillisLRDsOJo(j), function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, kotlinx.coroutines.TimeoutCoroutine] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object withTimeoutOrNull(long j, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) continuation;
            if ((timeoutKt$withTimeoutOrNull$1.label & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = timeoutKt$withTimeoutOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = timeoutKt$withTimeoutOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (j <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        timeoutKt$withTimeoutOrNull$1.L$0 = function2;
                        timeoutKt$withTimeoutOrNull$1.L$1 = objectRef2;
                        timeoutKt$withTimeoutOrNull$1.J$0 = j;
                        timeoutKt$withTimeoutOrNull$1.label = 1;
                        ?? r4 = (T) new kotlinx.coroutines.TimeoutCoroutine(j, timeoutKt$withTimeoutOrNull$1);
                        objectRef2.element = r4;
                        java.lang.Object obj2 = setupTimeout(r4, function2);
                        if (obj2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(timeoutKt$withTimeoutOrNull$1);
                        }
                        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
                    } catch (kotlinx.coroutines.TimeoutCancellationException e) {
                        e = e;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = timeoutKt$withTimeoutOrNull$1.J$0;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (kotlinx.coroutines.TimeoutCancellationException e2) {
                        e = e2;
                    }
                }
                if (e.coroutine != objectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        timeoutKt$withTimeoutOrNull$1 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1(continuation);
        java.lang.Object obj3 = timeoutKt$withTimeoutOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timeoutKt$withTimeoutOrNull$1.label;
        if (i != 0) {
        }
        if (e.coroutine != objectRef.element) {
        }
    }

    /* renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> java.lang.Object m12302withTimeoutOrNullKLykuaI(long j, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return withTimeoutOrNull(kotlinx.coroutines.DelayKt.m12292toDelayMillisLRDsOJo(j), function2, continuation);
    }

    private static final <U, T extends U> java.lang.Object setupTimeout(kotlinx.coroutines.TimeoutCoroutine<U, ? super T> timeoutCoroutine, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.JobKt.disposeOnCompletion(timeoutCoroutine, kotlinx.coroutines.DelayKt.getDelay(timeoutCoroutine.uCont.get$context()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.get$context()));
        return kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(timeoutCoroutine, timeoutCoroutine, function2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlinx.coroutines.TimeoutCancellationException TimeoutCancellationException(long j, kotlinx.coroutines.Delay delay, kotlinx.coroutines.Job job) {
        java.lang.String str;
        kotlinx.coroutines.DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics = delay instanceof kotlinx.coroutines.DelayWithTimeoutDiagnostics ? (kotlinx.coroutines.DelayWithTimeoutDiagnostics) delay : null;
        if (delayWithTimeoutDiagnostics != null) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            str = delayWithTimeoutDiagnostics.m12293timeoutMessageLRDsOJo(kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.MILLISECONDS));
        }
        str = "Timed out waiting for " + j + " ms";
        return new kotlinx.coroutines.TimeoutCancellationException(str, job);
    }
}
