package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a]\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000128\u0010\n\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\u001ab\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\n\u001a\u00020\r23\b\u0002\u0010\u0012\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\u0004\b\u0013\u0010\u0014\u001ah\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012C\u0010\n\u001a?\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0015¢\u0006\u0002\b\t¢\u0006\u0004\b\u0016\u0010\u0017\u001a0\u0010\u0018\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u0011*\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "catch", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Function2;", "name", "cause", "", "p1", "retry", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "retryWhen", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__ErrorsKt {
    public static /* synthetic */ kotlinx.coroutines.flow.Flow retry$default(kotlinx.coroutines.flow.Flow flow, long j, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            function2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1(null);
        }
        return kotlinx.coroutines.flow.FlowKt.retry(flow, j, function2);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> retry(kotlinx.coroutines.flow.Flow<? extends T> flow, long j, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("Expected positive amount of retries, but had ".concat(java.lang.String.valueOf(j)).toString());
        }
        return kotlinx.coroutines.flow.FlowKt.retryWhen(flow, new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3(j, function2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super java.lang.Throwable> continuation) {
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        int i;
        java.lang.Throwable th;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Throwable th2;
        kotlinx.coroutines.Job job;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) continuation;
            if ((flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = flowKt__ErrorsKt$catchImpl$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ErrorsKt$catchImpl$2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2<>(flowCollector, objectRef2);
                        flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoSizes = objectRef2;
                        flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (flow.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return null;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (java.lang.Throwable) objectRef.element;
                if (!getHighSpeedVideoFpsRanges(th, th2) || ((job = (kotlinx.coroutines.Job) flowKt__ErrorsKt$catchImpl$1.getGetInputFormats().get(kotlinx.coroutines.Job.INSTANCE)) != null && job.isCancelled() && getHighSpeedVideoFpsRanges(th, job.getCancellationException()))) {
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof java.util.concurrent.CancellationException) {
                    kotlin.ExceptionsKt.addSuppressed(th2, th);
                    throw th2;
                }
                kotlin.ExceptionsKt.addSuppressed(th, th2);
                throw th;
            }
        }
        flowKt__ErrorsKt$catchImpl$1 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1(continuation);
        java.lang.Object obj2 = flowKt__ErrorsKt$catchImpl$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ErrorsKt$catchImpl$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        th2 = (java.lang.Throwable) objectRef.element;
        if (getHighSpeedVideoFpsRanges(th, th2)) {
        }
        throw th;
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m24104catch(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, function3);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> retryWhen(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function4) {
        return new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(flow, function4);
    }

    private static final boolean getHighSpeedVideoFpsRanges(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == null) {
            return false;
        }
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            th2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(th2);
        }
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            th = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(th);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(th2, th);
    }
}
