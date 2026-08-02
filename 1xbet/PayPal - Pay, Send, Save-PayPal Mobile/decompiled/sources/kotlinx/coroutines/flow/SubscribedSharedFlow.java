package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R;\u0010\u0014\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedSharedFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "p0", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)V", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/SharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "", "getReplayCache", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SubscribedSharedFlow<T> implements kotlinx.coroutines.flow.SharedFlow<T> {
    private final kotlinx.coroutines.flow.SharedFlow<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = sharedFlow;
        this.Camera2StreamConfigurationMap = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) continuation;
            if ((subscribedSharedFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                subscribedSharedFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = subscribedSharedFlow$collect$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscribedSharedFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow<T> sharedFlow = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinx.coroutines.flow.SubscribedFlowCollector subscribedFlowCollector = new kotlinx.coroutines.flow.SubscribedFlowCollector(flowCollector, this.Camera2StreamConfigurationMap);
                    subscribedSharedFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (sharedFlow.collect(subscribedFlowCollector, subscribedSharedFlow$collect$1) == coroutine_suspended) {
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
        subscribedSharedFlow$collect$1 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1(this, continuation);
        java.lang.Object obj2 = subscribedSharedFlow$collect$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscribedSharedFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final java.util.List<T> getReplayCache() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getReplayCache();
    }
}
