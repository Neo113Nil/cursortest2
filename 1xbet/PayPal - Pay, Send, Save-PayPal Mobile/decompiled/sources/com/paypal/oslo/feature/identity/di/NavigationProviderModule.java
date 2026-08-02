package com.paypal.oslo.feature.identity.di;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0014\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/di/NavigationProviderModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/identity/logincontroller/domain/LoginFlowController;", "loginFlowController", "Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;", "loginEffectResolver", "Ljavax/inject/Provider;", "Landroidx/navigation3/runtime/NavKey;", "postLoginSuccessDestinationProvider", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller$identity_prodRelease", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/logincontroller/domain/LoginFlowController;Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;Ljavax/inject/Provider;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationProviderModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.di.NavigationProviderModule INSTANCE = new com.paypal.oslo.feature.identity.di.NavigationProviderModule();

    private NavigationProviderModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller$identity_prodRelease(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, final com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, @com.paypal.oslo.feature.identity.api.di.PostLoginSuccessDestination final javax.inject.Provider<androidx.navigation3.runtime.NavKey> postLoginSuccessDestinationProvider, @dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginEffectResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoginSuccessDestinationProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$cul4NLLjZSLr2UXDeJloQDRyMrc(context, navigator, loginEffectResolver, loginFlowController, postLoginSuccessDestinationProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-yuAK4fBeDnTbD5WCt8QvIMODi8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15134$r8$lambda$yuAK4fBeDnTbD5WCt8QvIMODi8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination loginAndDevicesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginAndDevicesDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-828319844, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:301)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$OLrCMRm5q8BdEZytZMeE1BAKxWU(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.deviceauth.ui.LoginAndDevicesScreenKt.LoginAndDevicesScreen((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1AaEEbTCN-UiyGowdB5s542c9cs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15135$r8$lambda$1AaEEbTCNUiyGowdB5s542c9cs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination stepupSecurityQuestionDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupSecurityQuestionDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1770772341, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:439)");
        }
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt.SecurityQuestionScreen(stepupSecurityQuestionDestination.getRequestId(), stepupSecurityQuestionDestination.getChallengeData(), stepupSecurityQuestionDestination.getChallengeContext(), stepupSecurityQuestionDestination.getLatestChallenges(), appNavigator, loginFlowController, null, stepupSecurityQuestionDestination.isFromStepup(), stepupSecurityQuestionDestination.isSwitchingChallenge(), null, composer, 0, 576);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Rk3O3QdtPrWxfpyddoLw8QWFc8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination stepupCreditCardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupCreditCardDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2087004071, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:454)");
        }
        com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt.StepupCreditCardScreen(stepupCreditCardDestination.getRequestId(), stepupCreditCardDestination.getChallengeData(), stepupCreditCardDestination.getChallengeContext(), appNavigator, loginFlowController, null, stepupCreditCardDestination.getLatestChallenges(), stepupCreditCardDestination.isFromStepup(), stepupCreditCardDestination.isSwitchingChallenge(), null, composer, 0, 544);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2dHTr3ZWXJaL0IqOGSdb94iirnY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination createPasswordDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasswordDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(createPasswordDestination) : composer.changedInstance(createPasswordDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-521942975, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:576)");
            }
            com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt.PasswordRecoveryScreen(createPasswordDestination.getPublicCredential(), appNavigator, null, createPasswordDestination.getNonce(), createPasswordDestination.getPartialToken(), null, composer, 0, 36);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4474B2UX4jDS6Eqo1GKkS9P0_TM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$464CX1kVSGQzwTWv9MRbYHvpUMc(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(str))));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4t1y8CuyCYg9rYEYB472RpewDGo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$rg5t3lm4wCaZ1yMhmCrh_agkm8c((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4wMX_d96YTYcbIZ8kmFtv2837pA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$_eABg1P4V08PBkxg5RgmwCO9kvU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5vMGInGRfIZswdmummErfwy1T3s(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyEnrollmentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1268292829, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:327)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$4t1y8CuyCYg9rYEYB472RpewDGo(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance = composer.changedInstance(passkeyEnrollmentDestination);
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$IGOzvsagVrbLAcjzDjoXc_hoqZU(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination.this, appNavigator);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$bk19GstQ3O5N3NcCNsLjD7VZj88(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.PasskeyEnrollmentScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5vQ1Ah85AXCsFuc4AWaFexabcpo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination accountSwitchLoadingScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSwitchLoadingScreenDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-946401836, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:537)");
        }
        java.lang.String targetId = accountSwitchLoadingScreenDestination.getTargetId();
        int targetType = accountSwitchLoadingScreenDestination.getTargetType();
        java.lang.String targetName = accountSwitchLoadingScreenDestination.getTargetName();
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt.AccountSwitchLoadingScreen(targetId, targetType, targetName, (com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$62Kj6MFz6QApdTmYruiI6QE5s0U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$q5ErqsCQSGJhEYOcDVIqmd5RwVg(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7Xo3jYXOqS7F337lr1SRazvrlko(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15149$r8$lambda$aIeoCge6bebx8bwCuT4xOGOULA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8alFc5v4CzVn4fpn7xRZNKdN44o(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$WJJOjUaLmneWXjPN03xLfvBTntw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8nALtoOJu8apYGs_REl3c8RY8rQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$GVk7IrSBFhHJg2Gk8y919SnwYa8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9KdkLuvZ_JGFEMb5sFRuf6Fu5OA(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination authenticateDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        final com.paypal.oslo.feature.identity.api.model.PostLoginIntent postLoginIntent = authenticateDestination.getPostLoginIntent();
        if (postLoginIntent instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$464CX1kVSGQzwTWv9MRbYHvpUMc(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!(postLoginIntent instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15141$r8$lambda$M3j4LbRSSaWluBwq4MJE8Fj3LM(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AbtoYLxmqL0wbiaFJ4p4yYX4cdU(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(str))));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BCfzskESGvDB3P2et7W0X16dX9E(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOnboardingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-37145318, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:512)");
        }
        com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.MerchantOnboardingWebViewScreen(merchantOnboardingDestination, appNavigator, null, composer, i & 14, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BfwcsrVmx93vDmiGN6o7SoC0oSE(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination accountSwitchErrorScreenDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination(accountSwitchErrorScreenDestination.getTargetId(), accountSwitchErrorScreenDestination.getTargetType(), accountSwitchErrorScreenDestination.getTargetName()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CgQTTecE1TNmWx-oUdp3kULH4Vk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15136$r8$lambda$CgQTTecE1TNmWxoUdp3kULH4Vk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15153$r8$lambda$leqDK6fCvB5BaN0YYhuKkpnRk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CsjF4ppN1oXH9PDSbPKMZoxKREs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15155$r8$lambda$o2oNUk6_lEjexvNsaGH6lZdxI(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FPsrxelthe7gx0IWy1kuVD00YRA(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination userVerificationScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userVerificationScreenDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(userVerificationScreenDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1694177479, i2, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:255)");
            }
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt.UserVerificationScreen(userVerificationScreenDestination.getRequestId(), loginFlowController, appNavigator, null, userVerificationScreenDestination.getAuthIntent(), userVerificationScreenDestination.getLinkAccountType(), null, composer, 0, 72);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fmp1R7ViBHjsWv3XT5BVrLlWrng(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GVk7IrSBFhHJg2Gk8y919SnwYa8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HOhB-KJPGl1qByJbRb9OE9gNvz0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15137$r8$lambda$HOhBKJPGl1qByJbRb9OE9gNvz0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination verificationMethodsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMethodsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1193874692, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:384)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$efJTrTvuLcp_FAMPjPDkbwwzewY(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.deviceauth.ui.VerificationMethodsScreenKt.VerificationMethodsScreen((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I9ZmyvE-sTW2CmP-rPkV7Y_eVDM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15138$r8$lambda$I9ZmyvEsTW2CmPrPkV7Y_eVDM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination accountSwitchBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSwitchBottomSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1117757652, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:496)");
        }
        com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchBottomSheetScreenKt.UserAccountSwitchBottomSheetScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IGOzvsagVrbLAcjzDjoXc_hoqZU(final com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        if (passkeyEnrollmentDestination.getReturnResultOnSuccess()) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$wkTc9dx5aQLwW43kSWTg25QK_Pg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$kcqAGROdWsrpDcJsRxM9f8Hz2SA(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IRfENePPrz_T6TItDuwah2eBzL4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination unifiedAlertDeeplinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertDeeplinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1508126385, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:601)");
        }
        java.lang.String docId = unifiedAlertDeeplinkDestination.getDocId();
        java.lang.String expiryTime = unifiedAlertDeeplinkDestination.getExpiryTime();
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink deeplink = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink(docId, expiryTime != null ? kotlin.text.StringsKt.toLongOrNull(expiryTime) : null);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$4wMX_d96YTYcbIZ8kmFtv2837pA(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertScreenKt.UnifiedAlertRouterScreen(deeplink, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JF7faUYNMtyk--oaYQu1st668qU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15139$r8$lambda$JF7faUYNMtykoaYQu1st668qU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LSJYD5_T9E8M4cb252P-GWXgFBY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15140$r8$lambda$LSJYD5_T9E8M4cb252PGWXgFBY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination stepupDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1526611308, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:404)");
        }
        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.StepupScreen(stepupDestination.getRequestId(), stepupDestination.getChallengeResult(), appNavigator, null, stepupDestination.getExhaustedChallengeType(), stepupDestination.getValidationError(), null, composer, 0, 72);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M2FfHKaMYgl9u5NU5dCDHNbTAhg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$dRvYV21c06RWCbRLkZifBjXN4p8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M3j4LbRSSaWluBwq4MJ-E8Fj3LM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15141$r8$lambda$M3j4LbRSSaWluBwq4MJE8Fj3LM(com.paypal.oslo.feature.identity.api.model.PostLoginIntent postLoginIntent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(((com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation) postLoginIntent).getPostLoginDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MVSJwmm_CegBI7R3sKrFu9qmCys(javax.inject.Provider provider, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination addUserAccountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addUserAccountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(722043389, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:502)");
        }
        java.lang.Object obj = provider.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.AddUserAccountScreen(appNavigator, addUserAccountDestination.getLinkProfileOptions(), (androidx.navigation3.runtime.NavKey) obj, null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MoOfspuIEpI_k7DtorNqkwPK9oM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OLrCMRm5q8BdEZytZMeE1BAKxWU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$4474B2UX4jDS6Eqo1GKkS9P0_TM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O_bh4p_9VCybuY09JIt3ZJGdVWI(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination passwordScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordScreenDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(passwordScreenDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-826191988, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:278)");
            }
            com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordLoginScreenKt.PasswordLoginScreen(passwordScreenDestination.getPublicCredential(), passwordScreenDestination.getRequestId(), loginFlowController, passwordScreenDestination.getDisplayName(), passwordScreenDestination.getAuthIntent(), null, composer, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OxjBT-Xjjq5uwDWY4HtE8J2EzQc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15142$r8$lambda$OxjBTXjjq5uwDWY4HtE8J2EzQc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$sQ0Vy88I470dFlKREGD2qdBJqI0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PBI71TKeySD7JrCfVl7INBO3uSE(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination authenticateDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        final com.paypal.oslo.feature.identity.api.model.PostLoginIntent postLoginIntent = authenticateDestination.getPostLoginIntent();
        if (kotlin.jvm.internal.Intrinsics.areEqual(postLoginIntent, com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.INSTANCE)) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$AbtoYLxmqL0wbiaFJ4p4yYX4cdU(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!(postLoginIntent instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$_xtN7HfagIe5foYTNCsFofyQFYU(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QZVsa6q1tPgpn-6v3aHauSz2v1w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15143$r8$lambda$QZVsa6q1tPgpn6v3aHauSz2v1w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination accountSwitchErrorScreenDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$BfwcsrVmx93vDmiGN6o7SoC0oSE(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SZcvo-MVQByYHM1rS784R9Xog1c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15144$r8$lambda$SZcvoMVQByYHM1rS784R9Xog1c(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15139$r8$lambda$JF7faUYNMtykoaYQu1st668qU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UTrd0IdKRgepdjew5Zc4AB9-QMA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15145$r8$lambda$UTrd0IdKRgepdjew5Zc4AB9QMA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15157$r8$lambda$tljESd4KTYXnmnK9eq4hk3A_zo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V2DMF90DCb0khoSvdmy5I07BF1o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination stepupSnaDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupSnaDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-545159443, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:469)");
        }
        com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt.StepupSnaScreen(stepupSnaDestination.getRequestId(), stepupSnaDestination.getChallengeData(), stepupSnaDestination.getChallengeContext(), appNavigator, loginFlowController, null, stepupSnaDestination.getLatestChallenges(), null, composer, 0, 160);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VBmwdnNIVwhpEUlRDIxpdy5ay4k(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination authenticateDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.view.OnBackPressedDispatcher onBackPressedDispatcher) {
        com.paypal.oslo.feature.identity.api.model.PostLoginIntent postLoginIntent = authenticateDestination.getPostLoginIntent();
        if (postLoginIntent instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15158$r8$lambda$zxp7MckUSS4Z9lb5qB8YpGpuA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!(postLoginIntent instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (appNavigator.getBackStack().size() > 1) {
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15148$r8$lambda$Ze2aNi8tQbCOdKYGs4qlqY17WU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
            } else if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WJJOjUaLmneWXjPN03xLfvBTntw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WTWswXAa-8sVBflSg9hBYuTsbZQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15146$r8$lambda$WTWswXAa8sVBflSg9hBYuTsbZQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination passkeyListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyListDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1020429495, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:363)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15144$r8$lambda$SZcvoMVQByYHM1rS784R9Xog1c(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$M2FfHKaMYgl9u5NU5dCDHNbTAhg(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt.PasskeyListScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XnObGbGu58S4Fqe-sEl0BlvsKMY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15147$r8$lambda$XnObGbGu58S4FqesEl0BlvsKMY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YkEm7l0KivwzB_wxE1UxANyUmVQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination unifiedAlertDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(172944205, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:588)");
        }
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground foreground = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground(unifiedAlertDestination.getAlertData(), unifiedAlertDestination.getSource());
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15156$r8$lambda$qanwabImtYMclMM8m1P428O7c0(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertScreenKt.UnifiedAlertRouterScreen(foreground, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ze2aNi8tQbCOdKYGs-4qlqY17WU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15148$r8$lambda$Ze2aNi8tQbCOdKYGs4qlqY17WU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_eABg1P4V08PBkxg5RgmwCO9kvU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_xtN7HfagIe5foYTNCsFofyQFYU(com.paypal.oslo.feature.identity.api.model.PostLoginIntent postLoginIntent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(((com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation) postLoginIntent).getPostSignUpFlowDestination());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aIeoCge6bebx8bwCuT4xOGOU-LA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15149$r8$lambda$aIeoCge6bebx8bwCuT4xOGOULA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination((java.lang.String) null, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cul4NLLjZSLr2UXDeJloQDRyMrc(android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, final com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, final javax.inject.Provider provider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-5331947, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15152$r8$lambda$hsJ7BdIBO25th3OU1mtnoqtLk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination authenticateDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(authenticateDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination authenticateDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 127, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-98029294, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$qFPikcEMBMj2l4q_ObI5cVzDwQU(com.paypal.oslo.core.navigation.AppNavigator.this, loginEffectResolver, (com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination inContextAuthenticateDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(inContextAuthenticateDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination inContextAuthenticateDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(863629990, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$yxhWE8A_HQ8QWvhR_WJgOx5uyFo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination checkoutAuthenticationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(checkoutAuthenticationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination checkoutAuthenticationDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1694177479, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$FPsrxelthe7gx0IWy1kuVD00YRA(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this, appNavigator, (com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination userVerificationScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(userVerificationScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination userVerificationScreenDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1395084953, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15154$r8$lambda$nnMmxPyq9sMBrTJw2iT4l1dCmU(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this, (com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination rememberedLoginScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(rememberedLoginScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination rememberedLoginScreenDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-826191988, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$O_bh4p_9VCybuY09JIt3ZJGdVWI(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this, (com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination passwordScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(passwordScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination passwordScreenDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1550137632, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$tXL7ywj6Q7831c94YJhn5hxCcfE(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this, (com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination otpVerificationScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(otpVerificationScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination otpVerificationScreenDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-828319844, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15134$r8$lambda$yuAK4fBeDnTbD5WCt8QvIMODi8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination loginAndDevicesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(loginAndDevicesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination loginAndDevicesDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1406662269, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$dh0SHd4T0XPDcksceJeE8BRuLOI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination passkeyManagementDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(passkeyManagementDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination passkeyManagementDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1268292829, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$5vMGInGRfIZswdmummErfwy1T3s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(passkeyEnrollmentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination) {
                return l2Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l2Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1020429495, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15146$r8$lambda$WTWswXAa8sVBflSg9hBYuTsbZQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination passkeyListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(passkeyListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination passkeyListDestination) {
                return l2Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15136$r8$lambda$CgQTTecE1TNmWxoUdp3kULH4Vk(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 83, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15133getLambda$81359344$identity_prodRelease = com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m15133getLambda$81359344$identity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination howPasskeysWorkBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(howPasskeysWorkBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination howPasskeysWorkBottomSheetDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) m15133getLambda$81359344$identity_prodRelease);
        final java.util.Map l2Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1193874692, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15137$r8$lambda$HOhBKJPGl1qByJbRb9OE9gNvz0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination verificationMethodsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationMethodsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination verificationMethodsDestination) {
                return l2Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        final java.util.Map l2Metadata$default12 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(160692657, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15150$r8$lambda$dkw86H6H_Xief8em2LYa9CrSFY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination changePasswordDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(changePasswordDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$28
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination changePasswordDestination) {
                return l2Metadata$default12;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        final java.util.Map l2Metadata$default13 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1526611308, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15140$r8$lambda$LSJYD5_T9E8M4cb252PGWXgFBY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination stepupDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(stepupDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$30
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination stepupDestination) {
                return l2Metadata$default13;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance14);
        final java.util.Map l2Metadata$default14 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1999428879, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$c4RCmt64Ehw_D6zOjsszH8re6XY(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this, appNavigator, (com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination stepupOtpVerificationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(stepupOtpVerificationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$32
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination stepupOtpVerificationDestination) {
                return l2Metadata$default14;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance15);
        final java.util.Map l2Metadata$default15 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15132getLambda$1936298095$identity_prodRelease = com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m15132getLambda$1936298095$identity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination contactUsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(contactUsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$34
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination contactUsDestination) {
                return l2Metadata$default15;
            }
        }, (kotlin.jvm.functions.Function3) m15132getLambda$1936298095$identity_prodRelease);
        final java.util.Map l2Metadata$default16 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1770772341, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15135$r8$lambda$1AaEEbTCNUiyGowdB5s542c9cs(com.paypal.oslo.core.navigation.AppNavigator.this, loginFlowController, (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination stepupSecurityQuestionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(stepupSecurityQuestionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$36
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination stepupSecurityQuestionDestination) {
                return l2Metadata$default16;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance16);
        final java.util.Map l2Metadata$default17 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2087004071, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$1Rk3O3QdtPrWxfpyddoLw8QWFc8(com.paypal.oslo.core.navigation.AppNavigator.this, loginFlowController, (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination stepupCreditCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(stepupCreditCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$38
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination stepupCreditCardDestination) {
                return l2Metadata$default17;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance17);
        final java.util.Map l2Metadata$default18 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-545159443, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$V2DMF90DCb0khoSvdmy5I07BF1o(com.paypal.oslo.core.navigation.AppNavigator.this, loginFlowController, (com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination stepupSnaDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(stepupSnaDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$40
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination stepupSnaDestination) {
                return l2Metadata$default18;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance18);
        final java.util.Map l2Metadata$default19 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1115891964, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$pTOlvNXlzYJUi1Ok4gfR_3V1dk0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$41
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination stepupWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(stepupWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$42
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination stepupWebViewDestination) {
                return l2Metadata$default19;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance19);
        final java.util.Map bottomSheetMetadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_account_switch_switch_account), false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$8nALtoOJu8apYGs_REl3c8RY8rQ(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 82, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1117757652, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15138$r8$lambda$I9ZmyvEsTW2CmPrPkV7Y_eVDM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination accountSwitchBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountSwitchBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$44
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination accountSwitchBottomSheetDestination) {
                return bottomSheetMetadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance20);
        final java.util.Map l2Metadata$default20 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(722043389, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$MVSJwmm_CegBI7R3sKrFu9qmCys(javax.inject.Provider.this, appNavigator, (com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination addUserAccountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addUserAccountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$46
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.AddUserAccountDestination addUserAccountDestination) {
                return l2Metadata$default20;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance21);
        final java.util.Map l2Metadata$default21 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-37145318, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$BCfzskESGvDB3P2et7W0X16dX9E(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(merchantOnboardingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$48
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination) {
                return l2Metadata$default21;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance22);
        final java.util.Map l2Metadata$default22 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1425759896, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$zmdf8WJWMRj8egdFNF4ePx9dpIc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$49
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination unlinkAccountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(unlinkAccountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$50
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination unlinkAccountDestination) {
                return l2Metadata$default22;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance23);
        final java.util.Map l2Metadata$default23 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance24 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-946401836, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$5vQ1Ah85AXCsFuc4AWaFexabcpo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$51
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination accountSwitchLoadingScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountSwitchLoadingScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$52
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination accountSwitchLoadingScreenDestination) {
                return l2Metadata$default23;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance24);
        final java.util.Map l2Metadata$default24 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance25 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1710201191, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15151$r8$lambda$fD272TUpFs9aX6Pt3B0zkR1Q1g(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$53
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination accountSwitchErrorScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountSwitchErrorScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$54
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination accountSwitchErrorScreenDestination) {
                return l2Metadata$default24;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance25);
        final java.util.Map l2Metadata$default25 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance26 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-155940067, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$o6QM9GZj4ydWx60rv7laIj1y2w4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$55
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination passwordRecoveryScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(passwordRecoveryScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$56
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination passwordRecoveryScreenDestination) {
                return l2Metadata$default25;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance26);
        final java.util.Map l2Metadata$default26 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance27 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-521942975, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$2dHTr3ZWXJaL0IqOGSdb94iirnY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$57
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination createPasswordDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(createPasswordDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$58
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination createPasswordDestination) {
                return l2Metadata$default26;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance27);
        final java.util.Map l2Metadata$default27 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance28 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(172944205, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$YkEm7l0KivwzB_wxE1UxANyUmVQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$59
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination unifiedAlertDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(unifiedAlertDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$60
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination unifiedAlertDestination) {
                return l2Metadata$default27;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance28);
        final java.util.Map l2Metadata$default28 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance29 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1508126385, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$IRfENePPrz_T6TItDuwah2eBzL4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$61
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination unifiedAlertDeeplinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(unifiedAlertDeeplinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$62
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination unifiedAlertDeeplinkDestination) {
                return l2Metadata$default28;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance29);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hsJ7BdIBO2-5th3-OU1mtnoqtLk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15152$r8$lambda$hsJ7BdIBO25th3OU1mtnoqtLk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination authenticateDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticateDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-5331947, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:132)");
        }
        androidx.view.OnBackPressedDispatcherOwner current = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composer, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
        final androidx.view.OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
        com.paypal.oslo.feature.identity.api.Intent intent = authenticateDestination.getIntent();
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = authenticateDestination.getAuthenticationContext();
        com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkAccountType = authenticateDestination.getLinkAccountType();
        boolean changedInstance = composer.changedInstance(authenticateDestination);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$9KdkLuvZ_JGFEMb5sFRuf6Fu5OA(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination.this, appNavigator, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(authenticateDestination);
        boolean changed2 = composer.changed(appNavigator);
        boolean changedInstance3 = composer.changedInstance(onBackPressedDispatcher);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$VBmwdnNIVwhpEUlRDIxpdy5ay4k(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination.this, appNavigator, onBackPressedDispatcher);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changedInstance4 = composer.changedInstance(authenticateDestination);
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance4 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$PBI71TKeySD7JrCfVl7INBO3uSE(com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination.this, appNavigator, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt.Authenticate(appNavigator, intent, function1, authenticationContext, function0, (kotlin.jvm.functions.Function1) rememberedValue3, linkAccountType, null, null, null, composer, 0, 896);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zxp7MckUSS4Z9lb5q-B8Yp-GpuA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15158$r8$lambda$zxp7MckUSS4Z9lb5qB8YpGpuA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult(arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qFPikcEMBMj2l4q_ObI5cVzDwQU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination inContextAuthenticateDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inContextAuthenticateDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-98029294, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:203)");
        }
        com.paypal.oslo.feature.identity.api.Intent intent = com.paypal.oslo.feature.identity.api.Intent.LOGIN;
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = inContextAuthenticateDestination.getAuthenticationContext();
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOption = inContextAuthenticateDestination.getAuthOption();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$62Kj6MFz6QApdTmYruiI6QE5s0U(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15142$r8$lambda$OxjBTXjjq5uwDWY4HtE8J2EzQc(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$CsjF4ppN1oXH9PDSbPKMZoxKREs(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt.Authenticate(appNavigator, intent, function1, authenticationContext, function0, (kotlin.jvm.functions.Function1) rememberedValue3, null, loginEffectResolver, authOption, null, composer, 48, 576);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q5ErqsCQSGJhEYOcDVIqmd5RwVg(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(str))));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o2oNUk6_lE-jexvNsa-GH6lZdxI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15155$r8$lambda$o2oNUk6_lEjexvNsaGH6lZdxI(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(str))));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sQ0Vy88I470dFlKREGD2qdBJqI0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult(arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nnMmxPyq9sMBr-TJw2iT4l1dCmU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15154$r8$lambda$nnMmxPyq9sMBrTJw2iT4l1dCmU(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.rememberedlogin.navigation.RememberedLoginScreenDestination rememberedLoginScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginScreenDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(rememberedLoginScreenDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1395084953, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:269)");
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.RememberedLoginScreen(rememberedLoginScreenDestination.getRequestId(), loginFlowController, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tXL7ywj6Q7831c94YJhn5hxCcfE(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination otpVerificationScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpVerificationScreenDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1550137632, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:290)");
        }
        com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationScreenKt.OtpVerificationScreen(otpVerificationScreenDestination.getRequestId(), otpVerificationScreenDestination.getPublicCredential(), otpVerificationScreenDestination.getOtpChallengeData(), loginFlowController, null, null, composer, 0, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dh0SHd4T0XPDcksceJeE8BRuLOI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination passkeyManagementDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyManagementDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1406662269, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:311)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$8alFc5v4CzVn4fpn7xRZNKdN44o(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$7Xo3jYXOqS7F337lr1SRazvrlko(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$lYSV8ZyU1x3qCmrIK2UKREN5zRg(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.PasskeyManagementScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lYSV8ZyU1x3qCmrIK2UKREN5zRg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$MoOfspuIEpI_k7DtorNqkwPK9oM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rg5t3lm4wCaZ1yMhmCrh_agkm8c(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult(com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult.Outcome.Back.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bk19GstQ3O5N3NcCNsLjD7VZj88(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$Fmp1R7ViBHjsWv3XT5BVrLlWrng((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kcqAGROdWsrpDcJsRxM9f8Hz2SA(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.PasskeyListDestination(passkeyEnrollmentDestination.getSource()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wkTc9dx5aQLwW43kSWTg25QK_Pg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult(com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult.Outcome.Success.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dRvYV21c06RWCbRLkZifBjXN4p8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$leqDK6fCvB5BaN0YYhu-K-kpnRk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15153$r8$lambda$leqDK6fCvB5BaN0YYhuKkpnRk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$efJTrTvuLcp_FAMPjPDkbwwzewY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15147$r8$lambda$XnObGbGu58S4FqesEl0BlvsKMY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dkw86H6H-_Xief8em2LYa9CrSFY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15150$r8$lambda$dkw86H6H_Xief8em2LYa9CrSFY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination changePasswordDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePasswordDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(160692657, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:392)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15145$r8$lambda$UTrd0IdKRgepdjew5Zc4AB9QMA(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.ChangePasswordScreen((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tljESd4KTYXnmnK9eq4hk3A-_zo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15157$r8$lambda$tljESd4KTYXnmnK9eq4hk3A_zo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.ChangePasswordNavResult(false, 1, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c4RCmt64Ehw_D6zOjsszH8re6XY(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination stepupOtpVerificationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupOtpVerificationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1999428879, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:416)");
        }
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt.StepupOtpVerificationScreen(stepupOtpVerificationDestination.getRequestId(), stepupOtpVerificationDestination.getChallengeData(), stepupOtpVerificationDestination.getChallengeContext(), loginFlowController, appNavigator, null, stepupOtpVerificationDestination.getLatestChallenges(), stepupOtpVerificationDestination.isFromStepup(), stepupOtpVerificationDestination.isSwitchingChallenge(), null, composer, 0, 544);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pTOlvNXlzYJUi1Ok4gfR_3V1dk0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination stepupWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(stepupWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1115891964, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:482)");
            }
            com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt.StepupWebView(stepupWebViewDestination.getChallengeData(), appNavigator, null, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zmdf8WJWMRj8egdFNF4ePx9dpIc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.UnlinkAccountDestination unlinkAccountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlinkAccountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1425759896, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:523)");
        }
        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.UnlinkAccountScreen(appNavigator, unlinkAccountDestination.getPartyId(), unlinkAccountDestination.getFullName(), unlinkAccountDestination.getEmailAddress(), unlinkAccountDestination.getProfilePicture(), null, null, composer, 0, 96);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fD-272TUpFs9aX6Pt3B0zkR1Q1g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15151$r8$lambda$fD272TUpFs9aX6Pt3B0zkR1Q1g(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination accountSwitchErrorScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSwitchErrorScreenDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1710201191, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:551)");
        }
        boolean changed = composer.changed(appNavigator);
        boolean changedInstance = composer.changedInstance(accountSwitchErrorScreenDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.di.NavigationProviderModule.m15143$r8$lambda$QZVsa6q1tPgpn6v3aHauSz2v1w(com.paypal.oslo.core.navigation.AppNavigator.this, accountSwitchErrorScreenDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchErrorScreenKt.AccountSwitchErrorScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o6QM9GZj4ydWx60rv7laIj1y2w4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.passwordrecovery.navigation.PasswordRecoveryScreenDestination passwordRecoveryScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordRecoveryScreenDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(passwordRecoveryScreenDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-155940067, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:567)");
            }
            com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryScreenKt.PasswordRecoveryScreen(passwordRecoveryScreenDestination.getPublicCredential(), appNavigator, null, null, null, null, composer, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qanwabImtYMclMM8m1P-428O7c0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15156$r8$lambda$qanwabImtYMclMM8m1P428O7c0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.di.NavigationProviderModule$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.di.NavigationProviderModule.$r8$lambda$wONyFRkQZU5KcF2x9XQWubP_r6I((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wONyFRkQZU5KcF2x9XQWubP_r6I(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yxhWE8A_HQ8QWvhR_WJgOx5uyFo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination checkoutAuthenticationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(863629990, i, -1, "com.paypal.oslo.feature.identity.di.NavigationProviderModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:242)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt.CheckoutAuthenticationScreen(appNavigator, checkoutAuthenticationDestination.getCheckoutAuthenticationContext(), (com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
