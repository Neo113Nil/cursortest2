package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function4 getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoSizes;

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function4 function4) {
        this.getHighSpeedVideoSizes = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = function4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0079 -> B:14:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0092 -> B:11:0x0095). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        long j;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
        int i2;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        java.lang.Throwable th;
        java.lang.Object catchImpl;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = anonymousClass1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = this;
                    kotlinx.coroutines.flow.Flow flow = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.getHighSpeedVideoSizes;
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector;
                    anonymousClass1.getHighSpeedVideoFpsRanges = null;
                    anonymousClass1.getHighSpeedVideoSizes = j;
                    anonymousClass1.Camera2StreamConfigurationMap = 0;
                    anonymousClass1.getHighSpeedVideoSizesFor = 1;
                    catchImpl = kotlinx.coroutines.flow.FlowKt.catchImpl(flow, flowCollector, anonymousClass1);
                    if (catchImpl != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    i2 = anonymousClass1.Camera2StreamConfigurationMap;
                    j = anonymousClass1.getHighSpeedVideoSizes;
                    flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    th = (java.lang.Throwable) obj;
                    if (th != null) {
                    }
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                    if (i2 == 0) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Throwable th2 = (java.lang.Throwable) anonymousClass1.getHighSpeedVideoFpsRanges;
                    flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        j++;
                        i2 = 1;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                        if (i2 == 0) {
                            return kotlin.Unit.INSTANCE;
                        }
                        flowCollector = flowCollector2;
                        kotlinx.coroutines.flow.Flow flow2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.getHighSpeedVideoSizes;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector;
                        anonymousClass1.getHighSpeedVideoFpsRanges = null;
                        anonymousClass1.getHighSpeedVideoSizes = j;
                        anonymousClass1.Camera2StreamConfigurationMap = 0;
                        anonymousClass1.getHighSpeedVideoSizesFor = 1;
                        catchImpl = kotlinx.coroutines.flow.FlowKt.catchImpl(flow2, flowCollector, anonymousClass1);
                        if (catchImpl != coroutine_suspended) {
                            flowCollector2 = flowCollector;
                            i2 = 0;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                            obj = catchImpl;
                            th = (java.lang.Throwable) obj;
                            if (th != null) {
                                kotlin.jvm.functions.Function4 function4 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector2;
                                anonymousClass1.getHighSpeedVideoFpsRanges = th;
                                anonymousClass1.getHighSpeedVideoSizes = j;
                                anonymousClass1.getHighSpeedVideoSizesFor = 2;
                                java.lang.Object invoke = function4.invoke(flowCollector2, th, boxLong, anonymousClass1);
                                if (invoke != coroutine_suspended) {
                                    obj = invoke;
                                    th2 = th;
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        throw th2;
                                    }
                                }
                            }
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                            if (i2 == 0) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {113, 115}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getOutputMinFrameDuration = obj;
            this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
