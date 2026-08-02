package com.paypal.oslo.feature.settings.closeaccount.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1", f = "CloseYourAccountScreen.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, nl = {80}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class CloseYourAccountScreenKt$CloseYourAccountScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1$1", f = "CloseYourAccountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect closeAccountEffect = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(closeAccountEffect, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.CloseScreen.INSTANCE)) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (closeAccountEffect instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(closeAccountEffect instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect closeAccountEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination) closeAccountEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect closeAccountEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView openWebView = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView) closeAccountEffect;
            navigationScope.push(new com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination(openWebView.getUrl(), openWebView.getTitle(), com.paypal.oslo.feature.settings.constants.SettingsConstants.Analytics.CLOSE_ACCOUNT_SOURCE));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect closeAccountEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1) create(closeAccountEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getEffects(), new com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseYourAccountScreenKt$CloseYourAccountScreen$1$1(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountScreenKt$CloseYourAccountScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = closeYourAccountViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
