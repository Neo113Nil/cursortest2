package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlin.jvm.functions.Function3 getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoSizes;

    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(java.lang.Object obj, kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function3 function3) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r8.collect(r5, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = anonymousClass1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = this.getHighSpeedVideoFpsRanges;
                    T t = objectRef2.element;
                    anonymousClass1.Camera2StreamConfigurationMap = this;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector;
                    anonymousClass1.getHighSpeedVideoFpsRanges = objectRef2;
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (flowCollector.emit(t, anonymousClass1) != coroutine_suspended) {
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
                        flowCollector2 = flowCollector;
                        objectRef = objectRef2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) anonymousClass1.getHighSpeedVideoFpsRanges;
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) anonymousClass1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow flow = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.getHighSpeedVideoSizes;
                kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1(objectRef, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.getHighResolutionOutputSizeshNQ4ISI, flowCollector2);
                anonymousClass1.Camera2StreamConfigurationMap = null;
                anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                anonymousClass1.getHighSpeedVideoFpsRanges = null;
                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.Flow flow2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.getHighSpeedVideoSizes;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$12 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1(objectRef, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.getHighResolutionOutputSizeshNQ4ISI, flowCollector2);
        anonymousClass1.Camera2StreamConfigurationMap = null;
        anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
        anonymousClass1.getHighSpeedVideoFpsRanges = null;
        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {110, 111}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoSizes = obj;
            this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
