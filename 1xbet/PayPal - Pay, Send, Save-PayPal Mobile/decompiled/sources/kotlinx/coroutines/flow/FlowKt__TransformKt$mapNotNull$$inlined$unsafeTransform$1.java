package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
            java.lang.Object obj;
            int i;
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) {
                anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) continuation;
                if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                    obj = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoSizes;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector2;
                        anonymousClass1.getHighSpeedVideoSizes = 1;
                        java.lang.Object invoke = function2.invoke(t, anonymousClass1);
                        if (invoke != coroutine_suspended) {
                            obj = invoke;
                            flowCollector = flowCollector2;
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
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector3;
                    if (obj != null) {
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                        anonymousClass1.getHighSpeedVideoSizes = 2;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1(continuation);
            obj = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = anonymousClass1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            if (obj != null) {
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final java.lang.Object emit$$forInline(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1(continuation);
            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object invoke = this.getHighSpeedVideoSizes.invoke(obj, continuation);
            if (invoke != null) {
                flowCollector.emit(invoke, continuation);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {50, 51}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
                this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.this.emit(null, this);
            }

            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoSizes = function2;
        }
    }

    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function2 function2) {
        this.Camera2StreamConfigurationMap = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.Camera2StreamConfigurationMap.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2(flowCollector, this.getHighResolutionOutputSizeshNQ4ISI), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.1
            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoFpsRangesFor = obj;
                this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.Camera2StreamConfigurationMap.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2(flowCollector, this.getHighResolutionOutputSizeshNQ4ISI), continuation);
        return kotlin.Unit.INSTANCE;
    }
}
