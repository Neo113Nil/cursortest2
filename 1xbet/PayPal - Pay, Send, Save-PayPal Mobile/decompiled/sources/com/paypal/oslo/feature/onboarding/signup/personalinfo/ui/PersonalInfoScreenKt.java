package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames.PERSONAL_INFO_SCREEN, "", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "stepCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/PersonalInfoViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/PersonalInfoViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/PersonalInfoUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalInfoScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalInfoScreen(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel personalInfoViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1508988742);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(pageConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(topBarConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(stepCallbacks) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(personalInfoViewModel) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1508988742, i4, -1, "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreen (PersonalInfoScreen.kt:49)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(personalInfoViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                boolean showAddressModal = ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState) collectAsStateWithLifecycle.getValue()).getShowAddressModal();
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean changedInstance = startRestartGroup.changedInstance(personalInfoViewModel);
                boolean z = (i4 & 7168) == 2048;
                boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (((z | changed | changedInstance) || changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i5 = i4;
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1(personalInfoViewModel, appNavigator, rememberNavResultRequestId, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                } else {
                    i5 = i4;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(showAddressModal), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                boolean changedInstance2 = startRestartGroup.changedInstance(personalInfoViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$2$1(personalInfoViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m16384invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16384invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                boolean changedInstance3 = startRestartGroup.changedInstance(personalInfoViewModel);
                int i7 = i5;
                boolean z2 = (i7 & 896) == 256;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | z2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$3$1(personalInfoViewModel, stepCallbacks, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(personalInfoViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i7 >> 12) & 14);
                com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData = ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState) collectAsStateWithLifecycle.getValue()).getPersonalData();
                com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForPersonalInfo = personalInfoViewModel.createCallbackMapForPersonalInfo(pageConfig);
                kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack = stepCallbacks.getOnNavigateBack();
                boolean changedInstance4 = startRestartGroup.changedInstance(personalInfoViewModel);
                boolean changedInstance5 = startRestartGroup.changedInstance(pageConfig);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance4 | changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt.$r8$lambda$D7UYc0fRmJFGSMi8xZQVPTo6lNc(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.this, pageConfig);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt.PageLayout(pageConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks((kotlin.jvm.functions.Function0) rememberedValue5, onNavigateBack, null, 4, null), personalData, createCallbackMapForPersonalInfo, modifier4, ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState) collectAsStateWithLifecycle.getValue()).getComponentStates(), topBarConfig, false, startRestartGroup, (i7 & 14) | ((i7 >> 3) & 57344) | ((i7 << 15) & 3670016), 128);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt.m16383$r8$lambda$BJZLoKgUwYnrkxG42Xnp10rB90(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig.this, topBarConfig, stepCallbacks, appNavigator, personalInfoViewModel, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$BJZLo-KgUwYnrkxG42Xnp10rB90, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16383$r8$lambda$BJZLoKgUwYnrkxG42Xnp10rB90(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel personalInfoViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalInfoScreen(pageConfig, topBarConfig, stepCallbacks, appNavigator, personalInfoViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D7UYc0fRmJFGSMi8xZQVPTo6lNc(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig) {
        personalInfoViewModel.validateFields(pageConfig);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState access$PersonalInfoScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState) state.getValue();
    }
}
