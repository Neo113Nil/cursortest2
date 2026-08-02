package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1", f = "ActiveOffersScreen.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, nl = {96}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ActiveOffersScreenKt$ActiveOffersScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1$1", f = "ActiveOffersScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect activeOffersUiEffect = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect) this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (activeOffersUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateClose) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(activeOffersUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateToScreen)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect activeOffersUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateToScreen) activeOffersUiEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect activeOffersUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1) create(activeOffersUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveOffersScreenKt$ActiveOffersScreen$1$1(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel activeOffersViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.ActiveOffersScreenKt$ActiveOffersScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activeOffersViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
