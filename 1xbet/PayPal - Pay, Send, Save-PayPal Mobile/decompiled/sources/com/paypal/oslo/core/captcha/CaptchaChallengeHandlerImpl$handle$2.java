package com.paypal.oslo.core.captcha;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/core/captcha/CaptchaChallengeResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2", f = "CaptchaChallengeHandlerImpl.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"resultFlow"}, nl = {85}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class CaptchaChallengeHandlerImpl$handle$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.captcha.CaptchaChallengeResult>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.captcha.CaptchaChallengeInput getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appNavigator = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput = this.getHighSpeedVideoSizes;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.captcha.ui.navigation.result.CaptchaNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2.getHighSpeedVideoFpsRangesFor(str, captchaChallengeInput, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            appNavigator2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            final kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = appNavigator2.getNavResultManager().m11582getScopedResultFlowInternalDpEMydE(this.getHighResolutionOutputSizeshNQ4ISI);
            if (m11582getScopedResultFlowInternalDpEMydE == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA result flow was null, request may not be registered", null, null, 6, null);
                return com.paypal.oslo.core.captcha.CaptchaChallengeResult.Cancelled.INSTANCE;
            }
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11582getScopedResultFlowInternalDpEMydE);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getInputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getInputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                    if (obj instanceof com.paypal.oslo.core.captcha.ui.navigation.result.CaptchaNavResult) {
                                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                        anonymousClass1.Camera2StreamConfigurationMap = 0;
                                        anonymousClass1.getInputFormats = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                    java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getInputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "CaptchaChallengeHandlerImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        int Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        java.lang.Object getHighSpeedVideoSizes;
                        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                        int getInputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getHighSpeedVideoSizesFor = obj;
                            this.getInputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
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
        com.paypal.oslo.core.captcha.ui.navigation.result.CaptchaNavResult captchaNavResult = (com.paypal.oslo.core.captcha.ui.navigation.result.CaptchaNavResult) obj;
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA challenge completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(captchaNavResult.getResult().getClass()).getSimpleName())), null, 4, null);
        return captchaNavResult.getResult();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.core.captcha.ui.CaptchaDestination(str, captchaChallengeInput));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.captcha.CaptchaChallengeResult> continuation) {
        return ((com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptchaChallengeHandlerImpl$handle$2(com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl captchaChallengeHandlerImpl, java.lang.String str, com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl$handle$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = captchaChallengeHandlerImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = captchaChallengeInput;
    }
}
