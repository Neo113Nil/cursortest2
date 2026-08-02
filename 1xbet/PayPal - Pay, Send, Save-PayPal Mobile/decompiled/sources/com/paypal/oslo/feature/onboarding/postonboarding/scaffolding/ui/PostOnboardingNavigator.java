package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "", "replaceTop", "", "navigateTo", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;Z)V", "Landroidx/navigation3/runtime/NavKey;", "destination", "closeFlowAndNavigateTo$onboarding_prodRelease", "(Landroidx/navigation3/runtime/NavKey;)V", "popLauncher$onboarding_prodRelease", "handleCelebrationHalfSheet$onboarding_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "navigateBack", "()V", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/navigation/PostOnboardingStepDestination;", "determineNavKeyDestination$onboarding_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/navigation/PostOnboardingStepDestination;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getAppNavigator", "()Lcom/paypal/oslo/core/navigation/AppNavigator;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostOnboardingNavigator {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.navigation.AppNavigator appNavigator;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PostOnboardingNavigator(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.appNavigator = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.api.steps.domain.StepId[]{com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(com.paypal.oslo.feature.onboarding.postonboarding.close.navigation.CloseNavigationKt.getCloseFlowStepId()), com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(com.paypal.oslo.feature.onboarding.postonboarding.close.navigation.CloseNavigationKt.getCloseThenDeeplinkStepId())});
    }

    public final com.paypal.oslo.core.navigation.AppNavigator getAppNavigator() {
        return this.appNavigator;
    }

    public static /* synthetic */ void navigateTo$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        postOnboardingNavigator.navigateTo(step, z);
    }

    public final void navigateTo(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, final boolean replaceTop) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.contains(com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(step.m16524getStepIdeVUBM90()))) {
            closeFlowAndNavigateTo$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.postonboarding.close.domain.CloseDestinationResolver.INSTANCE.resolve(step));
        } else if (com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(step.m16524getStepIdeVUBM90(), com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetNavigationKt.getCelebrationHalfSheetStepId())) {
            handleCelebrationHalfSheet$onboarding_prodRelease(step);
        } else {
            final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.PostOnboardingStepDestination determineNavKeyDestination$onboarding_prodRelease = determineNavKeyDestination$onboarding_prodRelease(step);
            this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.$r8$lambda$ycyXOdtSQyT5ylNwXGEWvvkLRqk(replaceTop, determineNavKeyDestination$onboarding_prodRelease, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public static /* synthetic */ void closeFlowAndNavigateTo$onboarding_prodRelease$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navKey = null;
        }
        postOnboardingNavigator.closeFlowAndNavigateTo$onboarding_prodRelease(navKey);
    }

    public final void closeFlowAndNavigateTo$onboarding_prodRelease(final androidx.navigation3.runtime.NavKey destination) {
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.m16126$r8$lambda$KBipqxThcMYY9xCfNNtSshJ_Zw(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, destination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ void popLauncher$onboarding_prodRelease$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navKey = null;
        }
        postOnboardingNavigator.popLauncher$onboarding_prodRelease(navKey);
    }

    public final void popLauncher$onboarding_prodRelease(final androidx.navigation3.runtime.NavKey destination) {
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.$r8$lambda$TvtJ_EI6oUgyq9zggcmU8ZLDe2g(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, destination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void handleCelebrationHalfSheet$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        final androidx.navigation3.runtime.NavKey deriveDestinationFromFlowData = com.paypal.oslo.feature.onboarding.postonboarding.close.domain.CloseDestinationResolverKt.deriveDestinationFromFlowData(step);
        final com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination = new com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination(step);
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.$r8$lambda$PrInPuXlZYm89U8G9bRThzHJ928(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, deriveDestinationFromFlowData, celebrationHalfSheetDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateBack() {
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.$r8$lambda$PoEl9tEK1MrYHAQZVtvxPxuSPEc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.PostOnboardingStepDestination determineNavKeyDestination$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.lang.String m16524getStepIdeVUBM90 = step.m16524getStepIdeVUBM90();
        return com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionNavigationKt.getIntentSelectionStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationNavigationKt.getCelebrationStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroNavigationKt.getActivationIntroStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationNavigationKt.getPushNotificationStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiNavigationKt.getAddFiStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankNavigationKt.getAddBankStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcNavigationKt.getAddNfcStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.PasskeyEnrollmentNavigationKt.getPasskeyEnrollmentStepId()) ? new com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination(step) : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16524getStepIdeVUBM90, com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationNavigationKt.getEmailConfirmationStepId()) ? new com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination(step) : new com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination(step);
    }

    /* renamed from: $r8$lambda$KBipqxT-hcMYY9xCfNNtSshJ_Zw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16126$r8$lambda$KBipqxThcMYY9xCfNNtSshJ_Zw(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigatorKt.popPostOnboardingDestinations(navigationScope, postOnboardingNavigator.appNavigator.getBackStack(), navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PoEl9tEK1MrYHAQZVtvxPxuSPEc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (postOnboardingNavigator.appNavigator.getBackStack().size() > 1) {
            navigationScope.goBack();
        } else if (postOnboardingNavigator.appNavigator.getBackStack().isEmpty()) {
            navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        } else {
            navigationScope.replaceStack(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PrInPuXlZYm89U8G9bRThzHJ928(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigatorKt.popPostOnboardingDestinations(navigationScope, postOnboardingNavigator.appNavigator.getBackStack(), navKey);
        navigationScope.push(celebrationHalfSheetDestination);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TvtJ_EI6oUgyq9zggcmU8ZLDe2g(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (postOnboardingNavigator.appNavigator.getBackStack().size() <= 1) {
            androidx.navigation3.runtime.NavKey[] navKeyArr = new androidx.navigation3.runtime.NavKey[1];
            if (navKey == null) {
                navKey = com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE;
            }
            navKeyArr[0] = navKey;
            navigationScope.replaceStack(navKeyArr);
        } else {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ycyXOdtSQyT5ylNwXGEWvvkLRqk(boolean z, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.PostOnboardingStepDestination postOnboardingStepDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (z) {
            navigationScope.replaceTop(postOnboardingStepDestination);
        } else {
            navigationScope.push(postOnboardingStepDestination);
        }
        return kotlin.Unit.INSTANCE;
    }
}
