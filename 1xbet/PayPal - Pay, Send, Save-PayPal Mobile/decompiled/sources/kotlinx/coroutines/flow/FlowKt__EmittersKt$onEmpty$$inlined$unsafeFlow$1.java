package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoSizes;

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function2 function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoSizes = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = anonymousClass1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    booleanRef2.element = true;
                    kotlinx.coroutines.flow.Flow flow = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1 flowKt__EmittersKt$onEmpty$1$1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1(booleanRef2, flowCollector);
                    anonymousClass1.Camera2StreamConfigurationMap = this;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector;
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = booleanRef2;
                    anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                    if (flow.collect(flowKt__EmittersKt$onEmpty$1$1, anonymousClass1) != coroutine_suspended) {
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = this;
                        flowCollector2 = flowCollector;
                        booleanRef = booleanRef2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safeCollector = (kotlinx.coroutines.flow.internal.SafeCollector) anonymousClass1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        safeCollector.releaseIntercepted();
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) anonymousClass1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                if (booleanRef.element) {
                    kotlinx.coroutines.flow.internal.SafeCollector safeCollector2 = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector2, anonymousClass1.getContext());
                    try {
                        kotlin.jvm.functions.Function2 function2 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.getHighSpeedVideoSizes;
                        anonymousClass1.Camera2StreamConfigurationMap = safeCollector2;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                        anonymousClass1.getHighSpeedVideoFpsRanges = 2;
                        if (function2.invoke(safeCollector2, anonymousClass1) != coroutine_suspended) {
                            safeCollector = safeCollector2;
                            safeCollector.releaseIntercepted();
                        }
                        return coroutine_suspended;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (booleanRef.element) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {110, 118}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoSizes = obj;
            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
