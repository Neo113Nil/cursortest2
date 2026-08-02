package com.paypal.oslo.feature.onboarding.welcomeback.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "", "welcomeBackDeepLinkLauncherEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;)V", "welcomeBackEmailConfirmationScreenEntry"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeBackNavigationEntriesKt {
    public static final void welcomeBackDeepLinkLauncherEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt.m16602$r8$lambda$xZS7a0VtzM9zSlJo37EFVnaQtQ((com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt$welcomeBackDeepLinkLauncherEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher welcomeBackDeepLinkLauncher) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1119967197, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt.$r8$lambda$dEFk0PDarlGtvWMFkmXWnIk7toM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void welcomeBackEmailConfirmationScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt.$r8$lambda$B3ViZAm12i1O97JFEiANeDy_nmg((com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt$welcomeBackEmailConfirmationScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(78405575, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt.m16601$r8$lambda$P04agCw9HphZAXuYOrPMKSaHUg(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$B3ViZAm12i1O97JFEiANeDy_nmg(com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomeBackEmailConfirmationDestination, "");
        return welcomeBackEmailConfirmationDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    /* renamed from: $r8$lambda$P04agCw9HphZAXuYOrPMKSaH-Ug, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16601$r8$lambda$P04agCw9HphZAXuYOrPMKSaHUg(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomeBackEmailConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(78405575, i, -1, "com.paypal.oslo.feature.onboarding.welcomeback.di.welcomeBackEmailConfirmationScreenEntry.<anonymous> (WelcomeBackNavigationEntries.kt:44)");
        }
        com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt.WelcomeBackEmailConfirmationScreen(welcomeBackEmailConfirmationDestination, postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dEFk0PDarlGtvWMFkmXWnIk7toM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher welcomeBackDeepLinkLauncher, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomeBackDeepLinkLauncher, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1119967197, i, -1, "com.paypal.oslo.feature.onboarding.welcomeback.di.welcomeBackDeepLinkLauncherEntry.<anonymous> (WelcomeBackNavigationEntries.kt:31)");
        }
        com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackDeepLinkScreenKt.WelcomeBackDeepLinkScreen(postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.scopedPostOnboardingViewModel(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation.INSTANCE.from(welcomeBackDeepLinkLauncher), composer, 0, 0), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xZS7a0VtzM9zSlJo37EFVna-QtQ, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16602$r8$lambda$xZS7a0VtzM9zSlJo37EFVnaQtQ(com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher welcomeBackDeepLinkLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomeBackDeepLinkLauncher, "");
        return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getWelcomeBackEmailConfirmationFlowId();
    }
}
