package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1<R> implements kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<R>> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            if (r7.emit(r8, r0) != r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
            int i;
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function2 function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        anonymousClass1.getHighSpeedVideoSizes = flowCollector2;
                        anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object invoke = function2.invoke((androidx.paging.PageEvent) obj, anonymousClass1);
                        if (invoke != coroutine_suspended) {
                            obj2 = invoke;
                            flowCollector = flowCollector2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    flowCollector = flowCollector3;
                    anonymousClass1.getHighSpeedVideoSizes = null;
                    anonymousClass1.getHighSpeedVideoFpsRanges = 2;
                }
            }
            anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
            java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = anonymousClass1.getHighSpeedVideoFpsRanges;
            if (i != 0) {
            }
            anonymousClass1.getHighSpeedVideoSizes = null;
            anonymousClass1.getHighSpeedVideoFpsRanges = 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final java.lang.Object emit$$forInline(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
            this.getHighSpeedVideoFpsRangesFor.emit(this.getHighResolutionOutputSizeshNQ4ISI.invoke((androidx.paging.PageEvent) obj, continuation), continuation);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2", f = "PagingDataTransforms.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {}, v = 1)
        /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighSpeedVideoFpsRanges;
            java.lang.Object getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                return androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2.this.emit(null, this);
            }

            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
            this.getHighSpeedVideoFpsRangesFor = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }
    }

    public PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function2 function2) {
        this.getHighSpeedVideoFpsRangesFor = flow;
        this.getHighSpeedVideoSizes = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.getHighSpeedVideoFpsRangesFor.collect(new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2(flowCollector, this.getHighSpeedVideoSizes), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.1
            int getHighSpeedVideoFpsRanges;
            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoFpsRangesFor = obj;
                this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                return androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.this.collect(null, this);
            }
        };
        this.getHighSpeedVideoFpsRangesFor.collect(new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.AnonymousClass2(flowCollector, this.getHighSpeedVideoSizes), continuation);
        return kotlin.Unit.INSTANCE;
    }
}
