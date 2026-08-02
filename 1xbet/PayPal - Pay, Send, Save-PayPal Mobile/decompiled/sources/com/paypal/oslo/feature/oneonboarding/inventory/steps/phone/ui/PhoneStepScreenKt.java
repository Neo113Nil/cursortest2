package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a9\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"PhoneStepProgressValue", "", "PhoneStepProgressStart", "PhoneStepProgressEnd", "PhoneStepCurrentSegment", "PhoneStepTotalSegments", "PhoneStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/navigation/PhoneDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "phoneStepViewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneStepViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/navigation/PhoneDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneStepViewModel;Landroidx/compose/runtime/Composer;II)V", "toLocalizedString", "", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "handlePhoneCollected", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneStepComponentConfig;", "dialingCode", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "phoneNumber", "handlePhoneCollected-rijLsF8", "(Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneStepComponentConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneStepScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination phoneDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel2;
        int i4;
        final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel4;
        boolean changedInstance;
        boolean changedInstance2;
        boolean changedInstance3;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$1$1 rememberedValue;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2;
        boolean changedInstance4;
        boolean changedInstance5;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$2$1 rememberedValue3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2017659485);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(phoneDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    phoneStepViewModel2 = phoneStepViewModel;
                    if (startRestartGroup.changedInstance(phoneStepViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    phoneStepViewModel2 = phoneStepViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                phoneStepViewModel2 = phoneStepViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier4 = modifier2;
                } else {
                    modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        i5 = i4 & (-57345);
                        phoneStepViewModel4 = (com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2017659485, i5, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreen (PhoneStepScreen.kt:77)");
                        }
                        final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, new com.paypal.oslo.feature.oneonboarding.api.domain.Progress(1, new com.paypal.oslo.feature.oneonboarding.api.domain.Range(0, 2), new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress(0, 2)), 2, null);
                        final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1);
                        final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig stepComponentConfig = phoneDestination.getStepComponentConfig();
                        final com.paypal.oslo.core.navigation.AppNavigator appNavigator = oneOnboardingNavigator.getAppNavigator();
                        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        changedInstance = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
                        changedInstance2 = startRestartGroup.changedInstance(stepComponentConfig);
                        changedInstance3 = startRestartGroup.changedInstance(phoneStepViewModel4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$1$1(oneOnboardingFlowViewModel, stepComponentConfig, phoneStepViewModel4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m16812invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16812invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                        com.paypal.oslo.feature.oneonboarding.api.domain.Phone prefilledValue = stepComponentConfig.getPrefilledValue();
                        changedInstance4 = startRestartGroup.changedInstance(phoneStepViewModel4);
                        changedInstance5 = startRestartGroup.changedInstance(stepComponentConfig);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(changedInstance4 | changedInstance5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$2$1(phoneStepViewModel4, stepComponentConfig, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(prefilledValue, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                        final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel5 = phoneStepViewModel4;
                        int i8 = i5;
                        final androidx.compose.ui.Modifier modifier5 = modifier4;
                        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(phoneDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1474712994, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.$r8$lambda$chEBwRjD7yuIDvklKm0rmo9Nd0o(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, phoneDestination, stepComponentConfig, appNavigator, rememberNavResultRequestId, topBarConfig, oneOnboardingFlowViewModel, modifier5, collectAsState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i8 & 112) | 3072 | (i8 & 896), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        phoneStepViewModel3 = phoneStepViewModel4;
                        modifier3 = modifier4;
                    }
                }
                i5 = i4;
                phoneStepViewModel4 = phoneStepViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig2 = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, new com.paypal.oslo.feature.oneonboarding.api.domain.Progress(1, new com.paypal.oslo.feature.oneonboarding.api.domain.Range(0, 2), new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress(0, 2)), 2, null);
                final androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1);
                final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig stepComponentConfig2 = phoneDestination.getStepComponentConfig();
                final com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = oneOnboardingNavigator.getAppNavigator();
                final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                changedInstance = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
                changedInstance2 = startRestartGroup.changedInstance(stepComponentConfig2);
                changedInstance3 = startRestartGroup.changedInstance(phoneStepViewModel4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2 | changedInstance3)) {
                }
                rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$1$1(oneOnboardingFlowViewModel, stepComponentConfig2, phoneStepViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                com.paypal.oslo.feature.oneonboarding.api.domain.Phone prefilledValue2 = stepComponentConfig2.getPrefilledValue();
                changedInstance4 = startRestartGroup.changedInstance(phoneStepViewModel4);
                changedInstance5 = startRestartGroup.changedInstance(stepComponentConfig2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(changedInstance4 | changedInstance5)) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$PhoneStepScreen$2$1(phoneStepViewModel4, stepComponentConfig2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(prefilledValue2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel52 = phoneStepViewModel4;
                int i82 = i5;
                final androidx.compose.ui.Modifier modifier52 = modifier4;
                com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(phoneDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1474712994, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.$r8$lambda$chEBwRjD7yuIDvklKm0rmo9Nd0o(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, phoneDestination, stepComponentConfig2, appNavigator2, rememberNavResultRequestId2, topBarConfig2, oneOnboardingFlowViewModel, modifier52, collectAsState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i82 & 112) | 3072 | (i82 & 896), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                phoneStepViewModel3 = phoneStepViewModel4;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                phoneStepViewModel3 = phoneStepViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.$r8$lambda$gEqtSRrQzMCjsPQ6jhRVNIw3b9Y(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier3, phoneStepViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String toLocalizedString(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberError, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(461974586, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.toLocalizedString (PhoneStepScreen.kt:171)");
        }
        switch (com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.WhenMappings.$EnumSwitchMapping$0[phoneNumberError.ordinal()]) {
            case 1:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_number_error_invalid_country_or_region_code;
                break;
            case 2:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_invalid_for_region_error;
                break;
            case 3:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_too_short_error;
                break;
            case 4:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_too_long_error;
                break;
            case 5:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_invalid_length_error;
                break;
            case 6:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_metadata_fetch_failure_error;
                break;
            case 7:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_unknown_error;
                break;
            case 8:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_alpha_character_error;
                break;
            case 9:
                i2 = com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_unknown_error;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    /* renamed from: handlePhoneCollected-rijLsF8, reason: not valid java name */
    public static final void m16811handlePhoneCollectedrijLsF8(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        if (str2 == null || str == null) {
            return;
        }
        oneOnboardingFlowViewModel.contributeCollectedItem(new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem(phoneStepComponentConfig.getPhoneView().mo16702getIdfHLlpbY(), phoneStepComponentConfig.getPhoneView().getVariant(), new com.paypal.oslo.feature.oneonboarding.api.domain.Phone(com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16618constructorimpl(str), com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16664constructorimpl(str3), (kotlin.jvm.internal.DefaultConstructorMarker) null), str2, null));
        oneOnboardingFlowViewModel.stepForward();
    }

    /* renamed from: $r8$lambda$-dwB3a776z2vq5Me6iM41YEwLtw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16808$r8$lambda$dwB3a776z2vq5Me6iM41YEwLtw(final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination phoneDestination, com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        final java.lang.String dialingCode = phoneStepViewModel.getDialingCode();
        final java.lang.String m16815getCountryCodeiSWX8ZM = phoneStepViewModel.m16815getCountryCodeiSWX8ZM();
        if (dialingCode != null && m16815getCountryCodeiSWX8ZM != null) {
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.$r8$lambda$IAeHThNa1ZXwNFcZBKYBKwfXRzE(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, m16815getCountryCodeiSWX8ZM, dialingCode, phoneDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5oLDbHalB-0dlKG78r5A_bDGX1Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16809$r8$lambda$5oLDbHalB0dlKG78r5A_bDGX1Y(final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination phoneDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        phoneStepViewModel.validatePhone(phoneDestination.getIntentId(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.m16808$r8$lambda$dwB3a776z2vq5Me6iM41YEwLtw(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, appNavigator, str, phoneDestination, (com.paypal.oslo.core.i18n.domain.model.PhoneNumber) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$73jumkYeh1BW_DYYxWEHZcEOu8Q(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IAeHThNa1ZXwNFcZBKYBKwfXRzE(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination phoneDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(phoneStepViewModel.getPhoneInputState().getRaw()), str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15961constructorimpl(java.lang.Integer.parseInt(str2)), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getSERIALIZABLE_ACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow(com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(phoneDestination.getIntentId()).getName(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$chEBwRjD7yuIDvklKm0rmo9Nd0o(final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination phoneDestination, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String localizedString;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1474712994, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreen.<anonymous> (PhoneStepScreen.kt:119)");
            }
            java.lang.String dialingCode = phoneStepViewModel.getDialingCode();
            if (dialingCode == null) {
                dialingCode = "";
            }
            java.lang.String formatted = phoneStepViewModel.getPhoneInputState().getFormatted();
            com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneError = phoneStepViewModel.getPhoneError();
            if (phoneError == null) {
                composer.startReplaceGroup(-45409012);
                composer.endReplaceGroup();
                localizedString = null;
            } else {
                composer.startReplaceGroup(-140012139);
                localizedString = toLocalizedString(phoneError, composer, 0);
                composer.endReplaceGroup();
            }
            java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfoById = com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiStateExtensionsKt.contextualInfoById((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) state.getValue());
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = phoneDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(phoneStepViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.$r8$lambda$mBcKnxtsiY60QCg7gIOT7oB6mLw(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(phoneStepViewModel);
            boolean changedInstance3 = composer.changedInstance(phoneDestination);
            boolean changed = composer.changed(appNavigator);
            boolean changed2 = composer.changed(str);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changedInstance3 | changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.m16809$r8$lambda$5oLDbHalB0dlKG78r5A_bDGX1Y(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, phoneDestination, appNavigator, str);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance4 = composer.changedInstance(phoneStepViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.m16810$r8$lambda$gHwr5zeb52DYmQqPnpmGH41wH8(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel.this, (com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changedInstance5 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenKt.$r8$lambda$73jumkYeh1BW_DYYxWEHZcEOu8Q(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.PhoneStepScreenContent(phoneStepComponentConfig, dialingCode, formatted, localizedString, function1, function0, function12, topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue4, intentId, modifier, contextualInfoById, composer, 0, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gEqtSRrQzMCjsPQ6jhRVNIw3b9Y(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneDestination phoneDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PhoneStepScreen(phoneDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, phoneStepViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gHwr5zeb52DYmQq-PnpmGH41wH8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16810$r8$lambda$gHwr5zeb52DYmQqPnpmGH41wH8(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult phoneNumberHintResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberHintResult, "");
        phoneStepViewModel.handlePhoneNumberHintResult(phoneNumberHintResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mBcKnxtsiY60QCg7gIOT7oB6mLw(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        phoneStepViewModel.updatePhoneNumber(str);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_COUNTRY_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_PHONE_NUMBER_FOR_REGION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_SHORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_LONG.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_LENGTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.METADATA_FETCH_FAILURE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.UNKNOWN_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.ALPHA_CHARACTER_ERROR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.NOT_IMPLEMENTED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
