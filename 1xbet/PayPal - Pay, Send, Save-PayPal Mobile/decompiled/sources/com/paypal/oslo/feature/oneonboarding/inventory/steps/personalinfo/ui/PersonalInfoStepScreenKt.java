package com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001aC\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a2\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002"}, d2 = {"PersonalInfoStepProgressValue", "", "PersonalInfoStepProgressStart", "PersonalInfoStepProgressEnd", "PersonalInfoStepCurrentSegment", "PersonalInfoStepTotalSegments", "PersonalInfoStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/ui/navigation/PersonalInfoDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "addressAttacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressViewComponentAttacher;", "nameAttacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/ui/navigation/PersonalInfoDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressViewComponentAttacher;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;Landroidx/compose/runtime/Composer;II)V", "handleAddressSearchResult", "result", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/AddressSearchNavResult;", "onAddressSelected", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "onManualEntryRequested", "Lkotlin/Function0;", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "currentAddress", "isManualAddressMode", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalInfoStepScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalInfoStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressViewComponentAttacher addressViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressViewComponentAttacher addressViewComponentAttacher2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressViewComponentAttacher stepAddressViewComponentAttacher = addressViewComponentAttacher;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-378522190);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(personalInfoDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (32768 & i) == 0 ? startRestartGroup.changed(stepAddressViewComponentAttacher) : startRestartGroup.changedInstance(stepAddressViewComponentAttacher) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            int i9 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if (i5 == 0) {
                if ((196608 & i) == 0) {
                    i9 = (262144 & i) == 0 ? startRestartGroup.changed(nameViewComponentAttacher) : startRestartGroup.changedInstance(nameViewComponentAttacher) ? 131072 : 65536;
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    nameViewComponentAttacher2 = nameViewComponentAttacher;
                    modifier3 = modifier2;
                    addressViewComponentAttacher2 = stepAddressViewComponentAttacher;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        stepAddressViewComponentAttacher = com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressViewComponentAttacher.INSTANCE;
                    }
                    final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressViewComponentAttacher addressViewComponentAttacher3 = stepAddressViewComponentAttacher;
                    com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher3 = i5 != 0 ? com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.StepNameViewComponentAttacher.INSTANCE : nameViewComponentAttacher;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-378522190, i6, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreen (PersonalInfoStepScreen.kt:86)");
                    }
                    final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1);
                    com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) collectAsState.getValue();
                    com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content = oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content ? (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) oneOnboardingUiState : null;
                    com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = personalInfoDestination.getIntentId();
                    boolean changedInstance = startRestartGroup.changedInstance(personalInfoDestination);
                    boolean changedInstance2 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.$r8$lambda$7kU1vpmDdpGcr_eMzV4YUO44L6w(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination.this, oneOnboardingFlowViewModel);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final java.lang.String extractCountryCodeOrCloseFlow = com.paypal.oslo.feature.oneonboarding.inventory.steps.common.ExtractCountryCodeKt.extractCountryCodeOrCloseFlow(intentId, (kotlin.jvm.functions.Function0) rememberedValue);
                    if (extractCountryCodeOrCloseFlow != null) {
                        final com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.domain.PersonalInfoStepComponentConfig stepComponentConfig = personalInfoDestination.getStepComponentConfig();
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressViewComponentConfig addressConfig = stepComponentConfig.getAddressConfig();
                            i7 = 2;
                            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(addressConfig != null ? addressConfig.getPrefilledValue() : null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            i7 = 2;
                        }
                        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, i7, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1(mutableState, mutableState2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m16785invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16785invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                        boolean changedInstance3 = startRestartGroup.changedInstance(oneOnboardingNavigator);
                        boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
                        boolean changed2 = startRestartGroup.changed(extractCountryCodeOrCloseFlow);
                        boolean changedInstance4 = startRestartGroup.changedInstance(personalInfoDestination);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if ((changedInstance3 | changed | changed2 | changedInstance4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.m16781$r8$lambda$VFFjmY6fREj3pzbRSacYRAkCh0(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.this, rememberNavResultRequestId, extractCountryCodeOrCloseFlow, personalInfoDestination);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                        final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, content != null ? new com.paypal.oslo.feature.oneonboarding.api.domain.Progress(10, new com.paypal.oslo.feature.oneonboarding.api.domain.Range(0, 10), new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress(0, 2)) : null, 2, null);
                        final androidx.compose.ui.Modifier modifier5 = modifier4;
                        final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher4 = nameViewComponentAttacher3;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(personalInfoDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1893342641, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.m16780$r8$lambda$8kBs5hhUeJNchNkVirWNRoV4Y(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.domain.PersonalInfoStepComponentConfig.this, extractCountryCodeOrCloseFlow, function0, oneOnboardingFlowViewModel, topBarConfig, personalInfoDestination, modifier5, addressViewComponentAttacher3, nameViewComponentAttacher4, mutableState, mutableState2, collectAsState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, composer2, 54), composer2, (i6 & 112) | 3072 | (i6 & 896), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        addressViewComponentAttacher2 = addressViewComponentAttacher3;
                        nameViewComponentAttacher2 = nameViewComponentAttacher3;
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            final androidx.compose.ui.Modifier modifier6 = modifier4;
                            final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher5 = nameViewComponentAttacher3;
                            endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.m16782$r8$lambda$VKVb2I8IVVxOfHW18jqqV11Img(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier6, addressViewComponentAttacher3, nameViewComponentAttacher5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.$r8$lambda$HRfB20w4puaOOJF7ouDZhTzc8yg(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier3, addressViewComponentAttacher2, nameViewComponentAttacher2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= i9;
            i6 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        int i92 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if (i5 == 0) {
        }
        i3 |= i92;
        i6 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void handleAddressSearchResult(com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult addressSearchNavResult, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSearchNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome outcome = addressSearchNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.AddressSelected) {
            function1.invoke(((com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.AddressSelected) outcome).getAddress());
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.ManualEntryRequested)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function0.invoke();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7kU1vpmDdpGcr_eMzV4YUO44L6w(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Unexpected intent type for address search", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intentId", personalInfoDestination.getIntentId().toString())), null, null, 12, null);
        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.closeFlow$default(oneOnboardingFlowViewModel, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$8kBs5hhUeJNc-hN-kVirWNRoV4Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16780$r8$lambda$8kBs5hhUeJNchNkVirWNRoV4Y(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.domain.PersonalInfoStepComponentConfig personalInfoStepComponentConfig, java.lang.String str, kotlin.jvm.functions.Function0 function0, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressViewComponentAttacher addressViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1893342641, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreen.<anonymous> (PersonalInfoStepScreen.kt:155)");
            }
            com.paypal.oslo.core.i18n.domain.model.Address address = (com.paypal.oslo.core.i18n.domain.model.Address) mutableState.getValue();
            boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.m16784$r8$lambda$_n_ao5EJyTVBl5MBwURWis_wfY(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.i18n.domain.model.Address) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.$r8$lambda$qvPoXG376UJx9xz8MOgIwrYgunI(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.$r8$lambda$tu7Zct943taweyem2dPf_4Ma7Yc(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.m16783$r8$lambda$XVjs4mpAOPD5Y1NB2LUM5U2Q(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changedInstance3 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.$r8$lambda$xyDGeovNie6x5gczvm_h2g8lSxE(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenContentKt.m16779PersonalInfoStepScreenContentuFCkooE(personalInfoStepComponentConfig, address, str, booleanValue, function0, function1, function02, function12, function03, topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue5, personalInfoDestination.getIntentId(), modifier, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiStateExtensionsKt.contextualInfoById((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) state.getValue()), addressViewComponentAttacher, nameViewComponentAttacher, composer, 1769472, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HRfB20w4puaOOJF7ouDZhTzc8yg(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressViewComponentAttacher addressViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalInfoStepScreen(personalInfoDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, addressViewComponentAttacher, nameViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VFFjmY6fREj3-pzbRSacYRAkCh0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16781$r8$lambda$VFFjmY6fREj3pzbRSacYRAkCh0(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination) {
        oneOnboardingNavigator.getAppNavigator().m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.$r8$lambda$ws_eqVeqdW3QYg_PVrcrGRr3reM(str2, personalInfoDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VK-Vb2I8IVVxOfHW18jqqV11Img, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16782$r8$lambda$VKVb2I8IVVxOfHW18jqqV11Img(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressViewComponentAttacher addressViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalInfoStepScreen(personalInfoDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, addressViewComponentAttacher, nameViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X-V-js4mpAOPD5Y1NB2LUM5U-2Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16783$r8$lambda$XVjs4mpAOPD5Y1NB2LUM5U2Q(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_n_ao5E-JyTVBl5MBwURWis_wfY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16784$r8$lambda$_n_ao5EJyTVBl5MBwURWis_wfY(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        mutableState.setValue(address);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qvPoXG376UJx9xz8MOgIwrYgunI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tu7Zct943taweyem2dPf_4Ma7Yc(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(collectedItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ws_eqVeqdW3QYg_PVrcrGRr3reM(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.navigation.PersonalInfoDestination personalInfoDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination(str, com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(personalInfoDestination.getIntentId()).getName(), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xyDGeovNie6x5gczvm_h2g8lSxE(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepBack();
        return kotlin.Unit.INSTANCE;
    }
}
