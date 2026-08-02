package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {51, 52}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class FlowExtKt$simpleScan$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ R Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r6.getHighSpeedVideoFpsRangesFor.collect(new androidx.paging.FlowExtKt$simpleScan$1.AnonymousClass1(r1, r6.getHighSpeedVideoSizes, r3), r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = this.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = flowCollector2;
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (flowCollector2.emit(objectRef.element, this) != coroutine_suspended) {
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
        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (r8.emit(r9, r0) != r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 flowExtKt$simpleScan$1$1$emit$1;
            int i;
            kotlin.jvm.internal.Ref.ObjectRef<R> objectRef;
            if (continuation instanceof androidx.paging.FlowExtKt$simpleScan$1$1$emit$1) {
                flowExtKt$simpleScan$1$1$emit$1 = (androidx.paging.FlowExtKt$simpleScan$1$1$emit$1) continuation;
                if ((flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    T t2 = (T) flowExtKt$simpleScan$1$1$emit$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(t2);
                        kotlin.jvm.internal.Ref.ObjectRef<R> objectRef2 = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
                        R r = objectRef2.element;
                        flowExtKt$simpleScan$1$1$emit$1.getHighSpeedVideoFpsRanges = objectRef2;
                        flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object invoke = function3.invoke(r, t, flowExtKt$simpleScan$1$1$emit$1);
                        if (invoke != coroutine_suspended) {
                            t2 = (T) invoke;
                            objectRef = objectRef2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(t2);
                        return kotlin.Unit.INSTANCE;
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowExtKt$simpleScan$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(t2);
                    objectRef.element = t2;
                    kotlinx.coroutines.flow.FlowCollector<R> flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                    T t3 = this.getHighSpeedVideoFpsRanges.element;
                    flowExtKt$simpleScan$1$1$emit$1.getHighSpeedVideoFpsRanges = null;
                    flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }
            }
            flowExtKt$simpleScan$1$1$emit$1 = new androidx.paging.FlowExtKt$simpleScan$1$1$emit$1(this, continuation);
            T t22 = (T) flowExtKt$simpleScan$1$1$emit$1.getHighSpeedVideoSizes;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            objectRef.element = t22;
            kotlinx.coroutines.flow.FlowCollector<R> flowCollector2 = this.getHighResolutionOutputSizeshNQ4ISI;
            T t32 = this.getHighSpeedVideoFpsRanges.element;
            flowExtKt$simpleScan$1$1$emit$1.getHighSpeedVideoFpsRanges = null;
            flowExtKt$simpleScan$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<R> objectRef, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector) {
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getHighSpeedVideoSizes = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.FlowExtKt$simpleScan$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new androidx.paging.FlowExtKt$simpleScan$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        flowExtKt$simpleScan$1.getOutputMinFrameDuration = obj;
        return flowExtKt$simpleScan$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$simpleScan$1(R r, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$simpleScan$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = r;
        this.getHighSpeedVideoFpsRangesFor = flow;
        this.getHighSpeedVideoSizes = function3;
    }
}
