package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"OnboardingBridgeScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "destination", "Lcom/paypal/oslo/feature/taptopay/api/navigation/OnboardingTapToPayDestination;", "isDeviceScreenLockEnabledUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taptopay/api/navigation/OnboardingTapToPayDestination;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;Landroidx/compose/runtime/Composer;I)V", "launchPpdc", "ppdcRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "toolBarConfig", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardToolBarConfig;", "launchPpdc-Mpu6F-A", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardToolBarConfig;)V", "taptopay_prodRelease", "hasNavigated", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingBridgeScreenKt {
    public static final void OnboardingBridgeScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination, final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase isDeviceScreenLockEnabledUseCase, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.Unit unit;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingTapToPayDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDeviceScreenLockEnabledUseCase, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(85124421);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onboardingTapToPayDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(isDeviceScreenLockEnabledUseCase) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(85124421, i2, -1, "com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreen (OnboardingBridgeScreen.kt:58)");
            }
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId4 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changed = startRestartGroup.changed(mutableState);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changedInstance = startRestartGroup.changedInstance(onboardingTapToPayDestination);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changed | z | changed2) || changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                unit = unit2;
                str = rememberNavResultRequestId4;
                str2 = rememberNavResultRequestId3;
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1(appNavigator, rememberNavResultRequestId, mutableState, onboardingTapToPayDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                i3 = i4;
                unit = unit2;
                str = rememberNavResultRequestId4;
                str2 = rememberNavResultRequestId3;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(onboardingTapToPayDestination);
            boolean changedInstance3 = startRestartGroup.changedInstance(isDeviceScreenLockEnabledUseCase);
            boolean z2 = i3 == 4;
            boolean changed3 = startRestartGroup.changed(str2);
            boolean changed4 = startRestartGroup.changed(rememberNavResultRequestId2);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | changedInstance3 | z2 | changed3) || changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                str3 = rememberNavResultRequestId2;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$2$1(onboardingTapToPayDestination, isDeviceScreenLockEnabledUseCase, appNavigator, str2, rememberNavResultRequestId2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                str3 = rememberNavResultRequestId2;
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20152invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20152invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            boolean changedInstance4 = startRestartGroup.changedInstance(onboardingTapToPayDestination);
            boolean z3 = i3 == 4;
            boolean changed5 = startRestartGroup.changed(str2);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changedInstance4 | z3 | changed5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1(onboardingTapToPayDestination, appNavigator, str2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue5;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20153invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20153invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str3, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
            java.lang.String str4 = str;
            boolean z4 = i3 == 4;
            boolean changed6 = startRestartGroup.changed(str4);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((z4 | changed6) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$4$1(appNavigator, str4, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue7;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$$inlined$NavResultEffect-rtGRyWw$3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20154invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20154invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str5) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str5);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
            boolean z5 = i3 == 4;
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1(appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) rememberedValue9;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager4 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$$inlined$NavResultEffect-rtGRyWw$4
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20155invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20155invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str5) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str5);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str4, resolveNavResultManager4, function24, (kotlin.jvm.functions.Function2) rememberedValue10, startRestartGroup, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt.m20149$r8$lambda$DM7xfMuP2zTAhoRDiPOk0aEUA(com.paypal.oslo.core.navigation.AppNavigator.this, onboardingTapToPayDestination, isDeviceScreenLockEnabledUseCase, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8Nk1hxVQpZmSfIrD0wTwoOuww2A(com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig debitCardToolBarConfig, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, "ONBOARDING", debitCardToolBarConfig));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DM7x-fMuP2zTAho-RDiPOk0aEUA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20149$r8$lambda$DM7xfMuP2zTAhoRDiPOk0aEUA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase isDeviceScreenLockEnabledUseCase, int i, androidx.compose.runtime.Composer composer, int i2) {
        OnboardingBridgeScreen(appNavigator, onboardingTapToPayDestination, isDeviceScreenLockEnabledUseCase, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
