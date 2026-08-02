package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1", f = "UserVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationScreenKt$UserVerificationScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getInputFormats;
    final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState> getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone signupWithPhone;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputStallDurationlomOqCM != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState access$UserVerificationScreen$lambda$3 = com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt.access$UserVerificationScreen$lambda$3(this.getOutputFormats);
        if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success) {
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success success = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success) access$UserVerificationScreen$lambda$3;
            this.getInputFormats.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(success.getAuthOptions(), com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt.access$UserVerificationScreen$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI), success.getDisplayName(), this.getOutputMinFrameDuration, null, this.getHighSpeedVideoFpsRanges, 16, null));
            this.getOutputSizeshNQ4ISI.resetState();
        } else if (!(access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ForgotEmail)) {
            if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                this.getOutputSizeshNQ4ISI.resetState();
            } else if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail) {
                final java.lang.String m15922constructorimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail) access$UserVerificationScreen$lambda$3).getEmailCredential().getEmail());
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.EmailOtpVerificationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1.getHighSpeedVideoFpsRanges(m15922constructorimpl, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                this.getOutputSizeshNQ4ISI.resetState();
            } else if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getInputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                this.getOutputSizeshNQ4ISI.resetState();
            } else if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp) {
                com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp) access$UserVerificationScreen$lambda$3).getPublicCredential();
                if (publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) {
                    signupWithPhone = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(((com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) publicCredential).getEmail()), null, 2, null);
                } else {
                    if (!(publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential = (com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential) publicCredential;
                    signupWithPhone = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(phoneCredential.getPhoneNumber()), com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequestKt.toInternationalDialingCode(phoneCredential), null, 4, null);
                }
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                this.getOutputSizeshNQ4ISI.resetState();
            } else if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted) {
                com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted signUpCompleted = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted) access$UserVerificationScreen$lambda$3;
                this.getInputFormats.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess(signUpCompleted.getRequestId(), signUpCompleted.getUserAccessTokenData(), com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType.SIGN_UP_COMPLETION_FLOW));
                this.getOutputSizeshNQ4ISI.resetState();
            } else if (access$UserVerificationScreen$lambda$3 instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                this.getOutputSizeshNQ4ISI.resetState();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState userVerificationUiState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModelKt.toSignupIntent((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential) userVerificationUiState), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination(str, com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getSERIALIZABLE_ACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow("manual_signup_from_email", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState userVerificationUiState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection suggestedEmailCorrection = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection) userVerificationUiState;
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.EmailSuggestionModalDestination(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(suggestedEmailCorrection.getSuggestedEmail()), com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(suggestedEmailCorrection.getOriginalEmail()), null, 4, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState userVerificationUiState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber confirmPhoneNumber = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber) userVerificationUiState;
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(confirmPhoneNumber.getPhoneCredential().getPhoneNumber()), confirmPhoneNumber.getCountryCode(), com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequestKt.toInternationalDialingCode(confirmPhoneNumber.getPhoneCredential()), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getSERIALIZABLE_ACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow("manual_signup_from_phone", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), signupIntent, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1(this.getInputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserVerificationScreenKt$UserVerificationScreen$3$1(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState> state, androidx.compose.runtime.State<java.lang.String> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$3$1> continuation) {
        super(2, continuation);
        this.getInputFormats = loginFlowController;
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoFpsRanges = authIntent;
        this.getOutputSizeshNQ4ISI = userVerificationViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getInputSizeshNQ4ISI = str4;
        this.getHighSpeedVideoSizesFor = str5;
        this.getOutputFormats = state;
        this.getHighResolutionOutputSizeshNQ4ISI = state2;
    }
}
