package com.paypal.oslo.feature.identity.passwordrecovery.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1", f = "PasswordRecoveryScreen.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, nl = {156}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.LifecycleOwner getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.view.FlowExtKt.flowWithLifecycle(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), this.getHighSpeedVideoFpsRanges.getLifecycle(), androidx.lifecycle.Lifecycle.State.STARTED), new com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1$1", f = "PasswordRecoveryScreen.kt", i = {0}, l = {141}, m = "invokeSuspend", n = {"effect"}, nl = {146}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect passwordRecoveryUiEffect = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (passwordRecoveryUiEffect instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.NavigateBack) {
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                    return kotlin.Unit.INSTANCE;
                }
                if (!(passwordRecoveryUiEffect instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.SavePasswordToManagerAndNavigateToNextScreen)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.SavePasswordToManagerAndNavigateToNextScreen savePasswordToManagerAndNavigateToNextScreen = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.SavePasswordToManagerAndNavigateToNextScreen) passwordRecoveryUiEffect;
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passwordRecoveryUiEffect);
                this.Camera2StreamConfigurationMap = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.saveCredential(savePasswordToManagerAndNavigateToNextScreen.getCredential(), savePasswordToManagerAndNavigateToNextScreen.getPassword(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.Outcome.UserCanceled.INSTANCE));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.Outcome.Success.INSTANCE));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect passwordRecoveryUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1) create(passwordRecoveryUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider saveCredentialProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = saveCredentialProvider;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1(com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel passwordRecoveryViewModel, androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider saveCredentialProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt$PasswordRecoveryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = passwordRecoveryViewModel;
        this.getHighSpeedVideoFpsRanges = lifecycleOwner;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = saveCredentialProvider;
    }
}
