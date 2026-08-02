package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"MissingPpdcResultFallbackDelayMs", "", "PpdcAcquisitionBridgeScreen", "", "coordinator", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease", "hasNavigated", "", "hasHandledResult"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PpdcAcquisitionBridgeScreenKt {
    public static final void PpdcAcquisitionBridgeScreen(final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupFlowCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1949246692);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(setupFlowCoordinator) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1949246692, i2, -1, "com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreen (PpdcAcquisitionBridgeScreen.kt:52)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$$ExternalSyntheticLambda0
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
            java.lang.Object[] objArr2 = new java.lang.Object[0];
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changed = startRestartGroup.changed(mutableState);
            boolean z = (i2 & 112) == 32;
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changed3 = startRestartGroup.changed(mutableState2);
            boolean changedInstance = startRestartGroup.changedInstance(setupFlowCoordinator);
            com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed | z | changed2 | changed3 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$1$1(appNavigator, rememberNavResultRequestId, setupFlowCoordinator, mutableState, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            boolean changed4 = startRestartGroup.changed(mutableState2);
            boolean changedInstance2 = startRestartGroup.changedInstance(setupFlowCoordinator);
            boolean changedInstance3 = startRestartGroup.changedInstance(context);
            com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changed4 | changedInstance2 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$2$1(setupFlowCoordinator, context, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$PpdcAcquisitionBridgeScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20157invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20157invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.bridge.PpdcAcquisitionBridgeScreenKt.$r8$lambda$mCB0_Csw6hprVff0Rcmj76PkrOg(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mCB0_Csw6hprVff0Rcmj76PkrOg(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        PpdcAcquisitionBridgeScreen(setupFlowCoordinator, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
