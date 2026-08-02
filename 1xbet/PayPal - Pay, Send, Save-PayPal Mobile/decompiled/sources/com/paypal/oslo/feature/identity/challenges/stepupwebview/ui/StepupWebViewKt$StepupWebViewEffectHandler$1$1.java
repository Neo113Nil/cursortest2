package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1", f = "StepupWebView.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, nl = {150}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupWebViewKt$StepupWebViewEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1$1", f = "StepupWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect stepupWebViewEffect = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (stepupWebViewEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.NavigateBack) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "StepupWebView navigating back - Cancelled", null, null, 6, null);
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(stepupWebViewEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted challengeCompleted = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted) stepupWebViewEffect;
                if (challengeCompleted.getSuccess()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "StepupWebView challenge completed - Success", null, null, 6, null);
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    java.lang.String failureReason = challengeCompleted.getFailureReason();
                    if (failureReason == null) {
                        failureReason = "";
                    }
                    com.paypal.android.logger.Logger.d$default(logger, "StepupWebView challenge completed - Failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("failureReason", failureReason)), null, 4, null);
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect stepupWebViewEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            java.lang.String failureReason = ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted) stepupWebViewEffect).getFailureReason();
            if (failureReason == null) {
                failureReason = "";
            }
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.left(new com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed(failureReason))));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.stepup.StepupError.UserCanceled.INSTANCE)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.stepup.StepupSuccess(null, 1, null))));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect stepupWebViewEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1) create(stepupWebViewEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupWebViewKt$StepupWebViewEffectHandler$1$1(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel stepupWebViewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt$StepupWebViewEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = stepupWebViewViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
