package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow flow, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        java.lang.Object obj;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.Object obj3 = new java.lang.Object();
                    kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                    try {
                        kotlinx.coroutines.flow.Flow flow = this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1(intRef, this.getHighSpeedVideoFpsRangesFor, flowCollector, obj3);
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = obj3;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (flow.collect(flowKt__LimitKt$take$2$1, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        e = e2;
                        obj = obj3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, obj);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, obj);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {112}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoSizes = obj;
            this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
