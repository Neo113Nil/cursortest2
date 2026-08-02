package com.paypal.oslo.feature.oneonboarding.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "oneOnboardingNavigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideOneOnboardingFlowEntryProviderInstaller", "(Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.oneonboarding.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideOneOnboardingFlowEntryProviderInstaller(final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.di.NavigationModule.$r8$lambda$RGWhc6nXUcYORZPrWOIC769y_ZE(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$KmBTE6jm7de4BjUU1OzhrRgpn0Q(com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination oneOnboardingFlowDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowDestination, "");
        return oneOnboardingFlowDestination.getIntentId().getValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RGWhc6nXUcYORZPrWOIC769y_ZE(final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.di.NavigationModule.$r8$lambda$KmBTE6jm7de4BjUU1OzhrRgpn0Q((com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination.class), function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.oneonboarding.di.NavigationModule$provideOneOnboardingFlowEntryProviderInstaller$lambda$0$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination oneOnboardingFlowDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(616902587, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.oneonboarding.di.NavigationModule.m16677$r8$lambda$lTHXyx7pV7r4FPAEp9hqE2eS8Q(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.this, (com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.passwordStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.phoneStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.signUpWithGoogleStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.personalInfoStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.cipw9StepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.savingsCIPW9StepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.accountCreationSubmissionStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.submissionStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.termsStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.termsSheetStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.exitConfirmationNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.ciptaxStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.cipPersonalInfoStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.docUploadStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.cryptoTermsStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.terminalStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        com.paypal.oslo.feature.oneonboarding.di.StepNavEntriesKt.moduleLauncherStepNavEntry(entryProviderScope, oneOnboardingNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lTHXyx7pV7r4FPAE-p9hqE2eS8Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16677$r8$lambda$lTHXyx7pV7r4FPAEp9hqE2eS8Q(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination oneOnboardingFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(616902587, i, -1, "com.paypal.oslo.feature.oneonboarding.di.NavigationModule.provideOneOnboardingFlowEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:45)");
        }
        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(oneOnboardingFlowDestination.getIntentId(), oneOnboardingNavigator, null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
