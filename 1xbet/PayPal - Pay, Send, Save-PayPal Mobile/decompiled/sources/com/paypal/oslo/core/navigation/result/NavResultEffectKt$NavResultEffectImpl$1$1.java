package com.paypal.oslo.core.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1", f = "NavResultEffect.kt", i = {0}, l = {101}, m = "invokeSuspend", n = {"resultFlow"}, nl = {109}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class NavResultEffectKt$NavResultEffectImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<java.lang.Object>> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultManager getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<java.lang.Object> invoke = this.Camera2StreamConfigurationMap.invoke(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(this.getHighSpeedVideoFpsRanges));
            if (invoke == null) {
                return kotlin.Unit.INSTANCE;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
            this.getInputFormats = 1;
            if (invoke.collect(new com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultManager getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1 navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1;
            int i;
            if (continuation instanceof com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1) {
                navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1 = (com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1) continuation;
                if ((navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj2 = navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        com.paypal.oslo.core.navigation.result.NavResult navResult = (com.paypal.oslo.core.navigation.result.NavResult) obj;
                        navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (function2.invoke(navResult, navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj3 = navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    this.getHighSpeedVideoFpsRangesFor.m11580cleanupRequestDpEMydE(this.Camera2StreamConfigurationMap);
                    return kotlin.Unit.INSTANCE;
                }
            }
            navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1 = new com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1(this, continuation);
            java.lang.Object obj22 = navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = navResultEffectKt$NavResultEffectImpl$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            this.getHighSpeedVideoFpsRangesFor.m11580cleanupRequestDpEMydE(this.Camera2StreamConfigurationMap);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
            this.getHighSpeedVideoFpsRangesFor = navResultManager;
            this.Camera2StreamConfigurationMap = str;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavResultEffectKt$NavResultEffectImpl$1$1(kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.navigation.result.NavResultManager, ? super com.paypal.oslo.core.navigation.result.NavResultRequestId, ? extends kotlinx.coroutines.flow.Flow<? extends java.lang.Object>> function2, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRangesFor = navResultManager;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = function22;
    }
}
