package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1", f = "RememberedLoginScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RememberedLoginScreenKt$RememberedLoginScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1$1", f = "RememberedLoginScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getInputFormats;
        /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect rememberedLoginUiEffect = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect) this.getInputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(rememberedLoginUiEffect, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ChangeUser.INSTANCE)) {
                this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry(this.getHighSpeedVideoFpsRangesFor, true, null, 4, null));
            } else if (rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen) {
                com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen navigateToPasswordScreen = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen) rememberedLoginUiEffect;
                this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(kotlin.collections.CollectionsKt.listOf(navigateToPasswordScreen.getAuthOptions()), navigateToPasswordScreen.getPublicCredential(), navigateToPasswordScreen.getPublicCredential(), navigateToPasswordScreen.getRequestId(), navigateToPasswordScreen.getAuthOptions(), null, 32, null));
            } else if (!(rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt)) {
                if (rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt) {
                    if (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.access$RememberedLoginScreen$lambda$2(this.getHighSpeedVideoSizes) instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle) {
                        this.getInputFormats.attemptPasskeyLogin(this.Camera2StreamConfigurationMap);
                    }
                } else if (rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod) {
                    com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod navigateToAuthMethod = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod) rememberedLoginUiEffect;
                    this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(navigateToAuthMethod.getAvailableMethods(), navigateToAuthMethod.getPublicCredential(), navigateToAuthMethod.getDisplayName(), this.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) navigateToAuthMethod.getAvailableMethods()), null, 32, null));
                } else if (rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen) {
                    com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen fallbackToPasswordScreen = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen) rememberedLoginUiEffect;
                    this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE), fallbackToPasswordScreen.getPublicCredential(), fallbackToPasswordScreen.getDisplayName(), this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE, null, 32, null));
                } else if (rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth) {
                    androidx.fragment.app.FragmentActivity fragmentActivity = this.getHighSpeedVideoFpsRanges;
                    if (fragmentActivity != null) {
                        this.getInputFormats.attemptBiometricLogin(fragmentActivity);
                    } else {
                        this.getInputFormats.callVerifyCredentials$identity_prodRelease(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth) rememberedLoginUiEffect).getPublicCredential());
                    }
                } else if (rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth) {
                    this.getInputFormats.attemptPasskeyLogin(this.Camera2StreamConfigurationMap);
                } else {
                    if (!(rememberedLoginUiEffect instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getInputFormats.callVerifyCredentials$identity_prodRelease(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials) rememberedLoginUiEffect).getPublicCredential());
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect rememberedLoginUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1.AnonymousClass1) create(rememberedLoginUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getInputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, android.content.Context context, androidx.fragment.app.FragmentActivity fragmentActivity, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = loginFlowController;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getInputFormats = rememberedLoginViewModel;
            this.Camera2StreamConfigurationMap = context;
            this.getHighSpeedVideoFpsRanges = fragmentActivity;
            this.getHighSpeedVideoSizes = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getInputSizeshNQ4ISI.getUiEffect$identity_prodRelease(), new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RememberedLoginScreenKt$RememberedLoginScreen$1$1(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, android.content.Context context, androidx.fragment.app.FragmentActivity fragmentActivity, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = rememberedLoginViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = loginFlowController;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = fragmentActivity;
        this.Camera2StreamConfigurationMap = state;
    }
}
