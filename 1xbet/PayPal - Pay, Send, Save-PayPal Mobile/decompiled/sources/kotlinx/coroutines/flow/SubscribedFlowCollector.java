package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R;\u0010\u0014\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/FlowCollector;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SubscribedFlowCollector<T> implements kotlinx.coroutines.flow.FlowCollector<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoSizes = flowCollector;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r7).onSubscription(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onSubscription(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        int i;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        kotlinx.coroutines.flow.SubscribedFlowCollector<T> subscribedFlowCollector;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) continuation;
            if ((subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.internal.SafeCollector safeCollector2 = new kotlinx.coroutines.flow.internal.SafeCollector(this.getHighSpeedVideoSizes, subscribedFlowCollector$onSubscription$1.getContext());
                    try {
                        kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                        subscribedFlowCollector$onSubscription$1.Camera2StreamConfigurationMap = this;
                        subscribedFlowCollector$onSubscription$1.getHighResolutionOutputSizeshNQ4ISI = safeCollector2;
                        subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (function2.invoke(safeCollector2, subscribedFlowCollector$onSubscription$1) != coroutine_suspended) {
                            subscribedFlowCollector = this;
                            safeCollector = safeCollector2;
                        }
                        return coroutine_suspended;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                safeCollector = (kotlinx.coroutines.flow.internal.SafeCollector) subscribedFlowCollector$onSubscription$1.getHighResolutionOutputSizeshNQ4ISI;
                subscribedFlowCollector = (kotlinx.coroutines.flow.SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    safeCollector.releaseIntercepted();
                    throw th;
                }
                safeCollector.releaseIntercepted();
                flowCollector = subscribedFlowCollector.getHighSpeedVideoSizes;
                if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
                    return kotlin.Unit.INSTANCE;
                }
                subscribedFlowCollector$onSubscription$1.Camera2StreamConfigurationMap = null;
                subscribedFlowCollector$onSubscription$1.getHighResolutionOutputSizeshNQ4ISI = null;
                subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        subscribedFlowCollector$onSubscription$1 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1(this, continuation);
        java.lang.Object obj2 = subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscribedFlowCollector$onSubscription$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        flowCollector = subscribedFlowCollector.getHighSpeedVideoSizes;
        if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighSpeedVideoSizes.emit(t, continuation);
    }
}
