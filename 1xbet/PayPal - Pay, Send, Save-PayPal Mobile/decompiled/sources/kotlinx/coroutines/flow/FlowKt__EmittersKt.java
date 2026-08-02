package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u001ar\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0004\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001ar\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0004\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0080\b¢\u0006\u0004\b\u000f\u0010\u000e\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001a_\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022:\u0010\f\u001a6\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0014\u0010\u000e\u001aR\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0017\u0010\u0016\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001af\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042:\u0010\f\u001a6\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "transform", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "unsafeTransform", "Lkotlin/Function2;", "onStart", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "", "onCompletion", "onEmpty", "ensureActive", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "p1", "getHighSpeedVideoFpsRanges", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__EmittersKt {
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transform(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1(flow, function3, null));
    }

    public static final void ensureActive(kotlinx.coroutines.flow.FlowCollector<?> flowCollector) {
        if (flowCollector instanceof kotlinx.coroutines.flow.ThrowingCollector) {
            throw ((kotlinx.coroutines.flow.ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) {
                flowKt__EmittersKt$invokeSafely$1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) continuation;
                if ((flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = flowKt__EmittersKt$invokeSafely$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRanges = th;
                        flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (function3.invoke(flowCollector, th, flowKt__EmittersKt$invokeSafely$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (java.lang.Throwable) flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            if (th != null && th != th2) {
                kotlin.ExceptionsKt.addSuppressed(th2, th);
            }
            throw th2;
        }
        flowKt__EmittersKt$invokeSafely$1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1(continuation);
        java.lang.Object obj2 = flowKt__EmittersKt$invokeSafely$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__EmittersKt$invokeSafely$1.getHighSpeedVideoFpsRangesFor;
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> unsafeTransform(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, function3);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onStart(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(function2, flow);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onCompletion(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, function3);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onEmpty(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, function2);
    }
}
