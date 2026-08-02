package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class FlowExtKt$simpleRunningReduce$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            obj2 = androidx.paging.FlowExtKt.getHighSpeedVideoFpsRangesFor;
            objectRef.element = (T) obj2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.collect(new androidx.paging.FlowExtKt$simpleRunningReduce$1.AnonymousClass1(objectRef, this.getHighSpeedVideoSizes, flowCollector), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (r8.emit(r9, r0) != r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        
            if (r8 != r1) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 flowExtKt$simpleRunningReduce$1$1$emit$1;
            int i;
            java.lang.Object obj;
            kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
            if (continuation instanceof androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1) {
                flowExtKt$simpleRunningReduce$1$1$emit$1 = (androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1) continuation;
                if ((flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    T t2 = (T) flowExtKt$simpleRunningReduce$1$1$emit$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(t2);
                        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2 = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object obj2 = objectRef2.element;
                        obj = androidx.paging.FlowExtKt.getHighSpeedVideoFpsRangesFor;
                        if (obj2 != obj) {
                            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
                            T t3 = this.getHighSpeedVideoFpsRangesFor.element;
                            flowExtKt$simpleRunningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges = objectRef2;
                            flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap = 1;
                            t = (T) function3.invoke(t3, t, flowExtKt$simpleRunningReduce$1$1$emit$1);
                        }
                        t2 = t;
                        objectRef = objectRef2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(t2);
                            return kotlin.Unit.INSTANCE;
                        }
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowExtKt$simpleRunningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(t2);
                    }
                    objectRef.element = t2;
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                    T t4 = this.getHighSpeedVideoFpsRangesFor.element;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges = null;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap = 2;
                }
            }
            flowExtKt$simpleRunningReduce$1$1$emit$1 = new androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1(this, continuation);
            T t22 = (T) flowExtKt$simpleRunningReduce$1$1$emit$1.getHighSpeedVideoSizes;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            objectRef.element = t22;
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = this.getHighResolutionOutputSizeshNQ4ISI;
            T t42 = this.getHighSpeedVideoFpsRangesFor.element;
            flowExtKt$simpleRunningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.Camera2StreamConfigurationMap = 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
            this.getHighSpeedVideoFpsRangesFor = objectRef;
            this.getHighSpeedVideoSizes = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.FlowExtKt$simpleRunningReduce$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new androidx.paging.FlowExtKt$simpleRunningReduce$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        flowExtKt$simpleRunningReduce$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$simpleRunningReduce$1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$simpleRunningReduce$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoSizes = function3;
    }
}
