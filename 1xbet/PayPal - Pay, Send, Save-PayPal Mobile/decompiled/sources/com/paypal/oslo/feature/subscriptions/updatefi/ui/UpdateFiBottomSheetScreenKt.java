package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"UpdateFiBottomSheetScreen", "", "destination", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/UpdateFIBottomSheetDestination;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/shared/navigation/UpdateFIBottomSheetDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease", "uiState", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateFiBottomSheetScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdateFiBottomSheetScreen(final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFIBottomSheetDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFiViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1699987822);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(updateFIBottomSheetDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(updateFiViewModel) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1699987822, i3, -1, "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreen (UpdateFiBottomSheetScreen.kt:52)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(updateFiViewModel.getUiState(), null, startRestartGroup, 0, 1);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_updatefi_about_payment_method_title, startRestartGroup, 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(updateFiViewModel);
                com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$1$1(updateFiViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                java.lang.String addFiRequestId = updateFiViewModel.getAddFiRequestId();
                boolean changedInstance2 = startRestartGroup.changedInstance(updateFiViewModel);
                com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$2$1(updateFiViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19978invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19978invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(addFiRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(updateFiViewModel);
                boolean z = (i3 & 112) == 32;
                boolean changed = startRestartGroup.changed(stringResource);
                boolean changedInstance4 = startRestartGroup.changedInstance(updateFIBottomSheetDestination);
                com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (((changed | changedInstance3 | z) || changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    obj = null;
                    modifier3 = modifier2;
                    composer3 = startRestartGroup;
                    rememberedValue4 = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1(updateFiViewModel, appNavigator, stringResource, updateFIBottomSheetDestination, null);
                    composer3.updateRememberedValue(rememberedValue4);
                } else {
                    modifier3 = modifier2;
                    composer3 = startRestartGroup;
                    obj = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer3, 6);
                com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState updateFiUiState = (com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState) collectAsState.getValue();
                boolean changedInstance5 = composer3.changedInstance(updateFiViewModel);
                com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$4$1 rememberedValue5 = composer3.rememberedValue();
                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$4$1(updateFiViewModel);
                    composer3.updateRememberedValue(rememberedValue5);
                }
                composer2 = composer3;
                modifier2 = modifier3;
                com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiHalfSheetKt.UpdateFiHalfSheet(updateFiUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, obj), composer3, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt.m19977$r8$lambda$Xg4COVKIThnS78ZMpxd0BucLkE(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination.this, appNavigator, updateFiViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$Xg4COVKIThnS78ZM-pxd0BucLkE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19977$r8$lambda$Xg4COVKIThnS78ZMpxd0BucLkE(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UpdateFiBottomSheetScreen(updateFIBottomSheetDestination, appNavigator, updateFiViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
