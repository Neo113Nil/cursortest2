package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r7.emit(r2, r0) == r1) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
            java.lang.Object obj;
            int i;
            java.lang.Object obj2;
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) {
                anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) continuation;
                if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    obj = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRanges;
                        anonymousClass1.getHighSpeedVideoFpsRanges = t;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector2;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object invoke = function2.invoke(t, anonymousClass1);
                        if (invoke != coroutine_suspended) {
                            obj2 = t;
                            flowCollector = flowCollector2;
                            obj = invoke;
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
                    obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector3;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        anonymousClass1.getHighSpeedVideoFpsRanges = null;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1(continuation);
            obj = anonymousClass1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.Object emit$$forInline(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1(continuation);
            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
            if (((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.invoke(obj, continuation)).booleanValue()) {
                flowCollector.emit(obj, continuation);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object getHighSpeedVideoFpsRanges;
            java.lang.Object getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.this.emit(null, this);
            }

            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
            this.getHighSpeedVideoFpsRangesFor = flowCollector;
            this.getHighSpeedVideoFpsRanges = function2;
        }
    }

    public FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function2 function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.getHighResolutionOutputSizeshNQ4ISI.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2(flowCollector, this.getHighSpeedVideoFpsRangesFor), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.1
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2(flowCollector, this.getHighSpeedVideoFpsRangesFor), continuation);
        return kotlin.Unit.INSTANCE;
    }
}
