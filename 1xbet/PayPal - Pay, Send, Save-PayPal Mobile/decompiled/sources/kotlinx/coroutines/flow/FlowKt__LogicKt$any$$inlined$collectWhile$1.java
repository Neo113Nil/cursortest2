package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¸\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FlowKt__LogicKt$any$$inlined$collectWhile$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoSizes;

    public FlowKt__LogicKt$any$$inlined$collectWhile$1(kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoSizes = booleanRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1 anonymousClass1;
        int i;
        kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1<T> flowKt__LogicKt$any$$inlined$collectWhile$1;
        boolean booleanValue;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1) continuation;
            if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRanges;
                    anonymousClass1.getHighSpeedVideoFpsRanges = this;
                    anonymousClass1.Camera2StreamConfigurationMap = 1;
                    obj = function2.invoke(t, anonymousClass1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LogicKt$any$$inlined$collectWhile$1 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__LogicKt$any$$inlined$collectWhile$1 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1) anonymousClass1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                if (booleanValue) {
                    flowKt__LogicKt$any$$inlined$collectWhile$1.getHighSpeedVideoSizes.element = true;
                }
                if (booleanValue) {
                    return kotlin.Unit.INSTANCE;
                }
                throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__LogicKt$any$$inlined$collectWhile$1);
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        if (booleanValue) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1", f = "Logic.kt", i = {0}, l = {132}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
            this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.this.emit(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
