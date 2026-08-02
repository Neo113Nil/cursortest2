package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¸\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoSizes;

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(kotlin.jvm.functions.Function2 function2, kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.getHighSpeedVideoSizes = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1 anonymousClass1;
        int i;
        boolean z;
        java.lang.Object obj;
        T t2;
        kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoSizes;
                    anonymousClass1.getHighSpeedVideoFpsRanges = this;
                    anonymousClass1.Camera2StreamConfigurationMap = t;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object invoke = function2.invoke(t, anonymousClass1);
                    if (invoke != coroutine_suspended) {
                        obj = invoke;
                        t2 = t;
                        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) anonymousClass1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (z) {
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                }
                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) anonymousClass1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj2);
                t2 = obj3;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                obj = obj2;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    z = false;
                } else {
                    kotlinx.coroutines.flow.FlowCollector flowCollector = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.getHighResolutionOutputSizeshNQ4ISI;
                    anonymousClass1.getHighSpeedVideoFpsRanges = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
                    anonymousClass1.Camera2StreamConfigurationMap = null;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 2;
                }
                if (z) {
                }
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1(continuation);
        java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
        z = true;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        if (z) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {132, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "emit", n = {"this", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoSizes = obj;
            this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
