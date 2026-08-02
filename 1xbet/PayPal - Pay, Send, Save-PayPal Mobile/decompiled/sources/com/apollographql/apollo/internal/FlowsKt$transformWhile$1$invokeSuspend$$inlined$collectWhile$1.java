package com.apollographql.apollo.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¸\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/internal/FlowsKt$collectWhile$collector$1;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/apollographql/apollo/internal/FlowsKt$collectWhile$collector$1"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3 getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.AnonymousClass1 anonymousClass1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.AnonymousClass1) {
            anonymousClass1 = (com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = anonymousClass1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function3 function3 = this.getHighSpeedVideoSizes;
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                    anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                    obj = function3.invoke(flowCollector, t, anonymousClass1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new com.apollographql.apollo.internal.AbortFlowException(this);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        anonymousClass1 = new com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.AnonymousClass1(continuation);
        obj = anonymousClass1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    public FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(kotlin.jvm.functions.Function3 function3, kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.getHighSpeedVideoSizes = function3;
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", i = {}, l = {35}, m = "emit", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = obj;
            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
            return com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.this.emit(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
