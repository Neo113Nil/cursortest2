package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor;

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(kotlin.jvm.functions.Function2 function2, kotlinx.coroutines.flow.Flow flow) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.Camera2StreamConfigurationMap = flow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = anonymousClass1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.internal.SafeCollector safeCollector2 = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector, anonymousClass1.getContext());
                    try {
                        kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRangesFor;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = this;
                        anonymousClass1.getHighSpeedVideoSizes = flowCollector;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = safeCollector2;
                        anonymousClass1.Camera2StreamConfigurationMap = 1;
                        if (function2.invoke(safeCollector2, anonymousClass1) != coroutine_suspended) {
                            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                            flowCollector2 = flowCollector;
                            safeCollector = safeCollector2;
                        }
                        return coroutine_suspended;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
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
                safeCollector = (kotlinx.coroutines.flow.internal.SafeCollector) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoSizes;
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    safeCollector.releaseIntercepted();
                    throw th;
                }
                safeCollector.releaseIntercepted();
                kotlinx.coroutines.flow.Flow flow = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.Camera2StreamConfigurationMap;
                anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                anonymousClass1.getHighSpeedVideoSizes = null;
                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                anonymousClass1.Camera2StreamConfigurationMap = 2;
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        kotlinx.coroutines.flow.Flow flow2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.Camera2StreamConfigurationMap;
        anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
        anonymousClass1.getHighSpeedVideoSizes = null;
        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
        anonymousClass1.Camera2StreamConfigurationMap = 2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {112, 116}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRanges = obj;
            this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
