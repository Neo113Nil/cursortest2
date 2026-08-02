package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements kotlinx.coroutines.flow.Flow<java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
            int i;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
                        if (obj instanceof java.lang.Object) {
                            anonymousClass1.getHighSpeedVideoSizes = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
            java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = anonymousClass1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.Object emit$$forInline(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
            kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
            if (obj instanceof java.lang.Object) {
                flowCollector.emit(obj, continuation);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoFpsRangesFor = obj;
                this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
            }

            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
            this.Camera2StreamConfigurationMap = flowCollector;
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(kotlinx.coroutines.flow.Flow flow) {
        this.getHighSpeedVideoSizes = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.Flow flow = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        java.lang.Object collect = flow.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.1
            int Camera2StreamConfigurationMap;
            /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoSizes = obj;
                this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.this.collect(null, this);
            }
        };
        kotlinx.coroutines.flow.Flow flow = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        flow.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
        return kotlin.Unit.INSTANCE;
    }
}
