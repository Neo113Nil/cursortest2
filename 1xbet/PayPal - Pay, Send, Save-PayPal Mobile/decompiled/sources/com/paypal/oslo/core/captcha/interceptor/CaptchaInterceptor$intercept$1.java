package com.paypal.oslo.core.captcha.interceptor;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1", f = "CaptchaInterceptor.kt", i = {0}, l = {82}, m = "invokeSuspend", n = {"$this$flow"}, nl = {149}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class CaptchaInterceptor$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.Camera2StreamConfigurationMap.proceed(this.getHighSpeedVideoFpsRangesFor).collect(new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, flowCollector, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
    /* renamed from: com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor Camera2StreamConfigurationMap;
        final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0148, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r6, r7, r3) != r4) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x019e, code lost:
        
            if (r9.emit(r6, r3) != r4) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01de, code lost:
        
            if (r7.emit(r9, r3) != r4) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
        
            if (r8 != r4) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01fd, code lost:
        
            if (r2.emit(r1, r3) == r4) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1$emit$1 captchaInterceptor$intercept$1$1$emit$1;
            int i;
            com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata access$extractCaptchaMetadata;
            java.lang.String str;
            com.paypal.oslo.core.captcha.CaptchaChallengeHandler captchaChallengeHandler;
            java.lang.Object handle;
            com.apollographql.apollo.api.ApolloResponse<D> highSpeedVideoSizes;
            com.apollographql.apollo.api.ApolloResponse<D> highSpeedVideoSizes2;
            com.apollographql.apollo.api.ApolloResponse<D> apolloResponse2 = apolloResponse;
            if (continuation instanceof com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1$emit$1) {
                captchaInterceptor$intercept$1$1$emit$1 = (com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1$emit$1) continuation;
                if ((captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = captchaInterceptor$intercept$1$1$emit$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        access$extractCaptchaMetadata = com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.access$extractCaptchaMetadata(this.Camera2StreamConfigurationMap, apolloResponse2);
                        if (access$extractCaptchaMetadata != null) {
                            java.lang.Object obj2 = apolloResponse2.extensions.get("correlationId");
                            str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA challenge detected, delegating to handler", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, this.getHighSpeedVideoFpsRanges.getOperation().name()), kotlin.TuplesKt.to("correlationId", str)), null, 4, null);
                            captchaChallengeHandler = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                            com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput = new com.paypal.oslo.core.captcha.CaptchaChallengeInput(access$extractCaptchaMetadata.getHighSpeedVideoFpsRangesFor, access$extractCaptchaMetadata.getHighSpeedVideoSizes, access$extractCaptchaMetadata.getHighResolutionOutputSizeshNQ4ISI, str);
                            captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRanges = apolloResponse2;
                            captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$extractCaptchaMetadata);
                            captchaInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap = 1;
                            handle = captchaChallengeHandler.handle(captchaChallengeInput, captchaInterceptor$intercept$1$1$emit$1);
                        } else {
                            kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector = this.getHighSpeedVideoFpsRangesFor;
                            captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse);
                            captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$extractCaptchaMetadata);
                            captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap = 5;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 3) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String str2 = (java.lang.String) captchaInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    access$extractCaptchaMetadata = (com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata) captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    com.apollographql.apollo.api.ApolloResponse<D> apolloResponse3 = (com.apollographql.apollo.api.ApolloResponse) captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = str2;
                    apolloResponse2 = apolloResponse3;
                    handle = obj;
                    com.paypal.oslo.core.captcha.CaptchaChallengeResult captchaChallengeResult = (com.paypal.oslo.core.captcha.CaptchaChallengeResult) handle;
                    if (captchaChallengeResult instanceof com.paypal.oslo.core.captcha.CaptchaChallengeResult.Success) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA verification successful, retrying original request", null, null, 6, null);
                        kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.flow.Flow proceed = this.getHighSpeedVideoSizes.proceed(this.getHighSpeedVideoFpsRanges);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse2);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$extractCaptchaMetadata);
                        captchaInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(captchaChallengeResult);
                        captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap = 2;
                    } else if (captchaChallengeResult instanceof com.paypal.oslo.core.captcha.CaptchaChallengeResult.Failure) {
                        com.paypal.oslo.core.captcha.CaptchaChallengeResult.Failure failure = (com.paypal.oslo.core.captcha.CaptchaChallengeResult.Failure) captchaChallengeResult;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA verification failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", failure.getReason())), null, 4, null);
                        kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector3 = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor captchaInterceptor = this.Camera2StreamConfigurationMap;
                        highSpeedVideoSizes2 = com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, "CAPTCHA_VERIFICATION_FAILED", "CAPTCHA verification failed", failure.getReason(), apolloResponse2.extensions);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse2);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$extractCaptchaMetadata);
                        captchaInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(captchaChallengeResult);
                        captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap = 3;
                    } else {
                        if (!(captchaChallengeResult instanceof com.paypal.oslo.core.captcha.CaptchaChallengeResult.Cancelled)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA challenge cancelled by user", null, null, 6, null);
                        kotlinx.coroutines.flow.FlowCollector<com.apollographql.apollo.api.ApolloResponse<D>> flowCollector4 = this.getHighSpeedVideoFpsRangesFor;
                        highSpeedVideoSizes = com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, "CAPTCHA_CANCELLED", "CAPTCHA challenge was cancelled by user", null, apolloResponse2.extensions);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloResponse2);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$extractCaptchaMetadata);
                        captchaInterceptor$intercept$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        captchaInterceptor$intercept$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(captchaChallengeResult);
                        captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap = 4;
                    }
                    return coroutine_suspended;
                }
            }
            captchaInterceptor$intercept$1$1$emit$1 = new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1$1$emit$1(this, continuation);
            java.lang.Object obj3 = captchaInterceptor$intercept$1$1$emit$1.getInputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = captchaInterceptor$intercept$1$1$emit$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor captchaInterceptor, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>> flowCollector, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain) {
            this.Camera2StreamConfigurationMap = captchaInterceptor;
            this.getHighSpeedVideoFpsRanges = apolloRequest;
            this.getHighSpeedVideoFpsRangesFor = flowCollector;
            this.getHighSpeedVideoSizes = apolloInterceptorChain;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1 captchaInterceptor$intercept$1 = new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        captchaInterceptor$intercept$1.getHighSpeedVideoSizes = obj;
        return captchaInterceptor$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptchaInterceptor$intercept$1(com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor captchaInterceptor, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = apolloInterceptorChain;
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
        this.getHighSpeedVideoFpsRanges = captchaInterceptor;
    }
}
