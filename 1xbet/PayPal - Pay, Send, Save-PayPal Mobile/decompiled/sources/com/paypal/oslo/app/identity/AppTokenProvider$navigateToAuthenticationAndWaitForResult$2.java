package com.paypal.oslo.app.identity;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError$NotFound;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2", f = "AppTokenProvider.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {"resultFlow"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class AppTokenProvider$navigateToAuthenticationAndWaitForResult$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError.NotFound, ? extends com.paypal.oslo.core.identity.domain.model.Token>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.app.identity.AppTokenProvider getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                appNavigator = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = this.getHighSpeedVideoFpsRanges;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2.getHighSpeedVideoFpsRanges(str, userAccessTokenType, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                appNavigator2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                final kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = appNavigator2.getNavResultManager().m11582getScopedResultFlowInternalDpEMydE(this.getHighSpeedVideoFpsRangesFor);
                if (m11582getScopedResultFlowInternalDpEMydE == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.app.LoggerKt.log, "Authentication result flow was null, request may not be registered", null, null, 6, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11582getScopedResultFlowInternalDpEMydE);
                this.Camera2StreamConfigurationMap = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    /* renamed from: com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                        if (obj instanceof com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult) {
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                            anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                        java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                        java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "AppTokenProvider.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                        /* renamed from: com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            int getHighSpeedVideoFpsRanges;
                            java.lang.Object getHighSpeedVideoFpsRangesFor;
                            java.lang.Object getHighSpeedVideoSizes;
                            int getHighSpeedVideoSizesFor;
                            /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getOutputMinFrameDuration = obj;
                                this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                                return com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.Camera2StreamConfigurationMap = flowCollector;
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
            arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.core.identity.domain.model.Token> result = ((com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult) obj).getResult();
            if (result instanceof arrow.core.Either.Right) {
                com.paypal.oslo.core.identity.domain.model.Token token = (com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) result).getValue();
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.app.LoggerKt.log, "User authentication completed successfully", null, null, 6, null);
                return arrow.core.EitherKt.right(token);
            }
            if (result instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "User cancelled authentication or authentication failed", null, null, 6, null);
                return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        } catch (java.util.concurrent.CancellationException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Authentication flow was cancelled", null, null, 6, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.app.LoggerKt.log.e("Unexpected error while waiting for authentication result", e);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(str, com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.INSTANCE, userAccessTokenType.getAuthenticationContext(), (com.paypal.oslo.feature.identity.api.Intent) null, (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError.NotFound, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        return ((com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppTokenProvider$navigateToAuthenticationAndWaitForResult$2(com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider, java.lang.String str, com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appTokenProvider;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = userAccessTokenType;
    }
}
