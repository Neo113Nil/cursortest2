package com.paypal.oslo.feature.identity.stepup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/identity/api/navigation/result/StepupNavResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1", f = "StepupChallengeHandlerImpl.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, nl = {185}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appNavigator = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            final kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = appNavigator.getNavResultManager().m11582getScopedResultFlowInternalDpEMydE(this.getHighSpeedVideoSizes);
            if (m11582getScopedResultFlowInternalDpEMydE == null) {
                return null;
            }
            this.Camera2StreamConfigurationMap = 1;
            obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1
                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getOutputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getOutputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                    if (obj instanceof com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult) {
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                        anonymousClass1.getOutputFormats = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getInputFormats;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getOutputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "StepupChallengeHandlerImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        int getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        java.lang.Object getHighSpeedVideoSizes;
                        /* synthetic */ java.lang.Object getInputFormats;
                        int getOutputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getInputFormats = obj;
                            this.getOutputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighSpeedVideoSizes = flowCollector;
                    }
                }
            }, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult> continuation) {
        return ((com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1(com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl stepupChallengeHandlerImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2$navResult$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = stepupChallengeHandlerImpl;
        this.getHighSpeedVideoSizes = str;
    }
}
