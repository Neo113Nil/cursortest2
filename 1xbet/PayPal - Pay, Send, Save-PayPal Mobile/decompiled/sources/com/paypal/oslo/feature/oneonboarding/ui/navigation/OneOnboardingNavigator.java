package com.paypal.oslo.feature.oneonboarding.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B6\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012#\u0010\t\u001a\u001f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R1\u0010&\u001a\u001f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "", "Ljava/lang/Class;", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/StepComponentNavigator;", "Lkotlin/jvm/JvmSuppressWildcards;", "stepNavigators", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/util/Map;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "step", "", "clearBackStack", "", "navigateTo", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;Z)V", "", "stepsToPopBack", "navigateBack", "(I)V", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "result", "setResultAndCloseFlow", "(Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;)V", "showExitConfirmation", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "determineNavKeyDestination$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;)Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getAppNavigator", "()Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingNavigator {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.navigation.AppNavigator appNavigator;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?>> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public OneOnboardingNavigator(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.appNavigator = appNavigator;
        this.Camera2StreamConfigurationMap = map;
    }

    public final com.paypal.oslo.core.navigation.AppNavigator getAppNavigator() {
        return this.appNavigator;
    }

    public static /* synthetic */ void navigateTo$default(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        oneOnboardingNavigator.navigateTo(intentId, stepComponentConfig, z);
    }

    public final void navigateTo(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig step, final boolean clearBackStack) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        final com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination determineNavKeyDestination$one_onboarding_prodRelease = determineNavKeyDestination$one_onboarding_prodRelease(intentId, step);
        if (determineNavKeyDestination$one_onboarding_prodRelease == null) {
            return;
        }
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.m17164$r8$lambda$BcSm6wMZ44yfUbjbxUvwD7XPY(clearBackStack, determineNavKeyDestination$one_onboarding_prodRelease, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ void navigateBack$default(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        oneOnboardingNavigator.navigateBack(i);
    }

    public final void navigateBack(final int stepsToPopBack) {
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.m17163$r8$lambda$1z554GnSkj9zje6s47KNuQvzCM(stepsToPopBack, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void setResultAndCloseFlow(final com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.$r8$lambda$MrAK62a6gyJqi7HAy0Ns_CczqAE(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void showExitConfirmation(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        final com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination exitConfirmationDestination = new com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination(intentId);
        this.appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.m17165$r8$lambda$zuElQE6ezOVJAIUvxCdKXASFjI(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination determineNavKeyDestination$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?> stepComponentNavigator = this.Camera2StreamConfigurationMap.get(step.getClass());
        if (stepComponentNavigator == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "No navigator registered for step type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("step_id", step.mo16702getIdfHLlpbY()), kotlin.TuplesKt.to("intent_id", intentId.getValue())), null, null, 12, null);
            return null;
        }
        if (!(stepComponentNavigator instanceof com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator)) {
            stepComponentNavigator = null;
        }
        com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination navigate = stepComponentNavigator != null ? stepComponentNavigator.navigate(intentId, step) : null;
        if (navigate == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Navigator returned null destination", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("step_id", step.mo16702getIdfHLlpbY()), kotlin.TuplesKt.to("intent_id", intentId.getValue())), null, null, 12, null);
        }
        return navigate;
    }

    /* renamed from: $r8$lambda$1z554GnS-kj9zje6s47KNuQvzCM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17163$r8$lambda$1z554GnSkj9zje6s47KNuQvzCM(int i, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        for (int i2 = 0; i2 < i; i2++) {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BcSm6-wMZ44yf-UbjbxUvwD7XPY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17164$r8$lambda$BcSm6wMZ44yfUbjbxUvwD7XPY(boolean z, com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination oneOnboardingDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (z) {
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination.class));
        }
        navigationScope.push(oneOnboardingDestination);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MrAK62a6gyJqi7HAy0Ns_CczqAE(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(oneOnboardingFlowNavResult);
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zuElQE6ezOVJAIUvxC-dKXASFjI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17165$r8$lambda$zuElQE6ezOVJAIUvxCdKXASFjI(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination exitConfirmationDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(exitConfirmationDestination);
        return kotlin.Unit.INSTANCE;
    }
}
