package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1", f = "Authenticate.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, nl = {152}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AuthenticateKt$Authenticate$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.api.Intent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputFormats;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1$1", f = "Authenticate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.api.Intent getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getInputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getOutputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect authenticateUiEffect = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect) this.getOutputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (authenticateUiEffect instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification) {
                if (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()] == 1) {
                    authIntent = com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LINK_ACCOUNT;
                } else {
                    authIntent = com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN;
                }
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str = this.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType = this.Camera2StreamConfigurationMap;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1.getHighSpeedVideoSizes(str, authIntent, linkProfileOptionType, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (authenticateUiEffect instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                appNavigator2.m11575navigateForResultInternaluBl809w(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (authenticateUiEffect instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod) {
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod navigateDirectlyToAuthMethod = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod) authenticateUiEffect;
                com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired authMethodRequired = new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(navigateDirectlyToAuthMethod.getAvailableMethods(), navigateDirectlyToAuthMethod.getPublicCredential(), navigateDirectlyToAuthMethod.getDisplayName(), this.getHighSpeedVideoFpsRanges, null, null, 48, null);
                com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver = this.getHighSpeedVideoFpsRangesFor;
                final androidx.navigation3.runtime.NavKey resolve = loginEffectResolver != null ? loginEffectResolver.resolve(authMethodRequired) : null;
                if (resolve != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1.getHighSpeedVideoSizes(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            } else if (authenticateUiEffect instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess) {
                this.getInputFormats.invoke(((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess) authenticateUiEffect).getToken());
            } else if (authenticateUiEffect instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess) {
                this.getOutputMinFrameDuration.invoke(((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess) authenticateUiEffect).getToken());
            } else {
                if (!(authenticateUiEffect instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthCancelled)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getInputSizeshNQ4ISI.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination(str, authIntent, linkProfileOptionType));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(navKey);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination(str));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect authenticateUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1) create(authenticateUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.identity.api.Intent.values().length];
                try {
                    iArr[com.paypal.oslo.feature.identity.api.Intent.LINK_ACCOUNT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.identity.api.Intent intent, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = intent;
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = loginEffectResolver;
            this.getInputFormats = function1;
            this.getOutputMinFrameDuration = function12;
            this.getInputSizeshNQ4ISI = function0;
            this.Camera2StreamConfigurationMap = linkProfileOptionType;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizesFor.getUiEffect(), new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AuthenticateKt$Authenticate$5$1(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel, com.paypal.oslo.feature.identity.api.Intent intent, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = authenticateViewModel;
        this.Camera2StreamConfigurationMap = intent;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = loginEffectResolver;
        this.getInputFormats = function1;
        this.getOutputFormats = function12;
        this.getInputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = linkProfileOptionType;
    }
}
