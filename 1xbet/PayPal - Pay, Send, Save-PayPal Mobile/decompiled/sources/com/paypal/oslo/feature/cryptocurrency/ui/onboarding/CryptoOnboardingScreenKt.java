package com.paypal.oslo.feature.cryptocurrency.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/CryptoOnboardingViewModel;", "viewModel", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "CryptoOnboardingScreen", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/CryptoOnboardingViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "effect", "handleNavigationEffect", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOnboardingScreenKt {
    public static final void CryptoOnboardingScreen(final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel cryptoOnboardingViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoOnboardingViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1086922284);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(cryptoOnboardingViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1086922284, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreen (CryptoOnboardingScreen.kt:33)");
            }
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighResolutionOutputSizeshNQ4ISI = cryptoOnboardingViewModel.getGetHighResolutionOutputSizeshNQ4ISI();
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(cryptoOnboardingViewModel);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$1$1(cryptoOnboardingViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13963invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13963invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            boolean z2 = false;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changed = startRestartGroup.changed(mutableState);
            if (i3 == 32) {
                z2 = true;
            }
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changedInstance2 = startRestartGroup.changedInstance(getHighResolutionOutputSizeshNQ4ISI);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changed | z2 | changed2 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1(mutableState, appNavigator, rememberNavResultRequestId, getHighResolutionOutputSizeshNQ4ISI, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt.m13962$r8$lambda$lU5Q8LJ0SWoWeeDRvtCUjwp4HQ(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleNavigationEffect(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect cryptoOnboardingEffect, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoOnboardingEffect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoOnboardingEffect, com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToHub.INSTANCE)) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt.$r8$lambda$YwjO9oRH0jxpXfvnJfq9JezOqCk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoOnboardingEffect, com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToError.INSTANCE)) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt.$r8$lambda$w9eshWCroC2FDZ45VoRrXtiVoXI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(cryptoOnboardingEffect, com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.GoBack.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt.$r8$lambda$vjHeWSe8ofbWf3do_a5VmQoeeUw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YwjO9oRH0jxpXfvnJfq9JezOqCk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lU5Q8LJ0SWoWeeD-RvtCUjwp4HQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13962$r8$lambda$lU5Q8LJ0SWoWeeDRvtCUjwp4HQ(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel cryptoOnboardingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        CryptoOnboardingScreen(cryptoOnboardingViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vjHeWSe8ofbWf3do_a5VmQoeeUw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w9eshWCroC2FDZ45VoRrXtiVoXI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }
}
