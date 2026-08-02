package com.paypal.oslo.feature.onboarding.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "providePostOnboardingFlowEntryProviderInstaller", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.onboarding.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModule.m16068$r8$lambda$RtzuZnadzu5tqMEm3AsmBTbavw(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePostOnboardingFlowEntryProviderInstaller(final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModule.$r8$lambda$qLd086LJNhfdCQrEYDPaZ7o43fs(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$0MvjCqo-8yQSae0zrYpHIvIp5ws, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16067$r8$lambda$0MvjCqo8yQSae0zrYpHIvIp5ws(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination welcomeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomeDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(666640383, i, -1, "com.paypal.oslo.feature.onboarding.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:68)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.di.NavigationModule.$r8$lambda$r5izkoj1S0BkK42bZ4HFQOu4q7Y(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.WelcomeScreen((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RtzuZnadzu5-tqMEm3AsmBTbavw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16068$r8$lambda$RtzuZnadzu5tqMEm3AsmBTbavw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, true, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(666640383, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModule.m16067$r8$lambda$0MvjCqo8yQSae0zrYpHIvIp5ws(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination welcomeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(welcomeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination welcomeDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(754324572, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModule.$r8$lambda$lS2wwqagF1CHisqv5OjhpVbdNAw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination signupFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(signupFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination signupFlowDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt.phoneOtpVerificationModalEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.onboarding.signup.di.EmailVerificationEntriesKt.emailOtpVerificationModalEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.onboarding.signup.di.EmailVerificationEntriesKt.emailSuggestionModalEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt.addressSearchModalEntry(entryProviderScope, appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lS2wwqagF1CHisqv5OjhpVbdNAw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.onboarding.api.navigation.SignupFlowDestination signupFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupFlowDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(754324572, i, -1, "com.paypal.oslo.feature.onboarding.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:99)");
        }
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.m16439SignupFlowScreenRr4ikrY(appNavigator, signupFlowDestination.m15911getCountryCodeALGuh4w(), signupFlowDestination.getIntent(), null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pUFCzuVcI9fa9hfwIW_U554H3Sk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation(new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getExistingUserAppOnboardingFlowId(), null, 2, null), new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getPostOnboardingFlowId(), null, 2, null)), new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("Welcome_screen", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), (com.paypal.oslo.feature.identity.api.Intent) null, (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qLd086LJNhfdCQrEYDPaZ7o43fs(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.postOnboardingFlowEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.di.NavigationModuleKt.access$postOnboardingDeepLinkLauncherEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.dummyStepScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.intentSelectionScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.celebrationScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.celebrationHalfSheetScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.activationIntroScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.pushNotificationScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.addFiScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.addNfcScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.addBankScreenEntry(entryProviderScope, postOnboardingNavigator);
        com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.onboardingPasskeyScreenEntry(entryProviderScope, postOnboardingNavigator);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r5izkoj1S0BkK42bZ4HFQOu4q7Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModule.$r8$lambda$pUFCzuVcI9fa9hfwIW_U554H3Sk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
