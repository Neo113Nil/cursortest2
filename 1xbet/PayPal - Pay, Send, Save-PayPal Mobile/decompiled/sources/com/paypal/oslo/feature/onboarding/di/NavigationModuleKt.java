package com.paypal.oslo.feature.onboarding.di;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationModuleKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$3Vwpvd74D5wA_jM1HLFgoWpx0zI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher postOnboardingDeepLinkLauncher, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingDeepLinkLauncher, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1605887553, i, -1, "com.paypal.oslo.feature.onboarding.di.postOnboardingDeepLinkLauncherEntry.<anonymous> (NavigationModule.kt:148)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl(postOnboardingDeepLinkLauncher.getFlowId()), postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.scopedPostOnboardingViewModel(null, composer, 0, 1), null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$I2jiV20iKrc7b68N0wzmGltm4E0(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher postOnboardingDeepLinkLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingDeepLinkLauncher, "");
        return postOnboardingDeepLinkLauncher.getFlowId();
    }

    public static final /* synthetic */ void access$postOnboardingDeepLinkLauncherEntry(androidx.navigation3.runtime.EntryProviderScope entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModuleKt.$r8$lambda$I2jiV20iKrc7b68N0wzmGltm4E0((com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher.class), function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModuleKt$postOnboardingDeepLinkLauncherEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher postOnboardingDeepLinkLauncher) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1605887553, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.di.NavigationModuleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.di.NavigationModuleKt.$r8$lambda$3Vwpvd74D5wA_jM1HLFgoWpx0zI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }
}
