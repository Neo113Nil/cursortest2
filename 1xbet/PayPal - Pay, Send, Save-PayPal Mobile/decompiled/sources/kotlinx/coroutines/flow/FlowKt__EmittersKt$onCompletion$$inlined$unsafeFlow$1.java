package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3 getHighSpeedVideoFpsRangesFor;

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function3 function3) {
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        java.lang.Object highSpeedVideoFpsRanges;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector2;
        kotlin.jvm.functions.Function3 function3;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) {
                anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
                if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            kotlinx.coroutines.flow.Flow flow = this.getHighSpeedVideoFpsRanges;
                            anonymousClass1.Camera2StreamConfigurationMap = this;
                            anonymousClass1.getHighSpeedVideoSizes = flowCollector;
                            anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                            if (flow.collect(flowCollector, anonymousClass1) != coroutine_suspended) {
                                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                            kotlinx.coroutines.flow.ThrowingCollector throwingCollector = new kotlinx.coroutines.flow.ThrowingCollector(th);
                            kotlin.jvm.functions.Function3 function32 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.getHighSpeedVideoFpsRangesFor;
                            anonymousClass1.Camera2StreamConfigurationMap = th;
                            anonymousClass1.getHighSpeedVideoSizes = null;
                            anonymousClass1.getHighSpeedVideoFpsRangesFor = 2;
                            highSpeedVideoFpsRanges = kotlinx.coroutines.flow.FlowKt__EmittersKt.getHighSpeedVideoFpsRanges(throwingCollector, function32, th, anonymousClass1);
                            if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            java.lang.Throwable th3 = (java.lang.Throwable) anonymousClass1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        safeCollector2 = (kotlinx.coroutines.flow.internal.SafeCollector) anonymousClass1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            safeCollector2.releaseIntercepted();
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            safeCollector2.releaseIntercepted();
                            throw th;
                        }
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoSizes;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        kotlinx.coroutines.flow.ThrowingCollector throwingCollector2 = new kotlinx.coroutines.flow.ThrowingCollector(th);
                        kotlin.jvm.functions.Function3 function322 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.getHighSpeedVideoFpsRangesFor;
                        anonymousClass1.Camera2StreamConfigurationMap = th;
                        anonymousClass1.getHighSpeedVideoSizes = null;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = 2;
                        highSpeedVideoFpsRanges = kotlinx.coroutines.flow.FlowKt__EmittersKt.getHighSpeedVideoFpsRanges(throwingCollector2, function322, th, anonymousClass1);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th;
                    }
                    safeCollector = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector, anonymousClass1.getGetInputFormats());
                    function3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.getHighSpeedVideoFpsRangesFor;
                    anonymousClass1.Camera2StreamConfigurationMap = safeCollector;
                    anonymousClass1.getHighSpeedVideoSizes = null;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 3;
                    if (function3.invoke(safeCollector, null, anonymousClass1) != coroutine_suspended) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            function3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.getHighSpeedVideoFpsRangesFor;
            anonymousClass1.Camera2StreamConfigurationMap = safeCollector;
            anonymousClass1.getHighSpeedVideoSizes = null;
            anonymousClass1.getHighSpeedVideoFpsRangesFor = 3;
            if (function3.invoke(safeCollector, null, anonymousClass1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th6) {
            th = th6;
            safeCollector2 = safeCollector;
            safeCollector2.releaseIntercepted();
            throw th;
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        safeCollector = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector, anonymousClass1.getGetInputFormats());
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {110, 117, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
            this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
