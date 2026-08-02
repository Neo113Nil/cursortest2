package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1", f = "RewardsLandingScreen.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, nl = {115}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RewardsLandingScreenKt$RewardsLandingScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1$1", f = "RewardsLandingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect rewardsLandingUiEffect = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(rewardsLandingUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect.NavigateToScreen)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Navigating to screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destination", ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect.NavigateToScreen) rewardsLandingUiEffect).getDestination())), null, 4, null);
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect rewardsLandingUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect.NavigateToScreen) rewardsLandingUiEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect rewardsLandingUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1.AnonymousClass1) create(rewardsLandingUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsLandingScreenKt$RewardsLandingScreen$2$1(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel rewardsLandingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.RewardsLandingScreenKt$RewardsLandingScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = rewardsLandingViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
