package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001aA\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"CryptoCelsiusClaimCodeScreen", "", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/CryptoCelsiusClaimCodeViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/CryptoCelsiusClaimCodeViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoCelsiusClaimCodeEffectHandler", "context", "Landroid/content/Context;", "provisioningRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "errorRequestId", "CryptoCelsiusClaimCodeEffectHandler-Z-z3Hpo", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/CryptoCelsiusClaimCodeViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CryptoCelsiusClaimCodeScreenRouter", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEvent;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeUiState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoCelsiusClaimCodeScreenContent", "onBackClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoCelsiusClaimCodeScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoCelsiusClaimCodeScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCelsiusClaimCodeScreen(final com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoCelsiusClaimCodeViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-167599992);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cryptoCelsiusClaimCodeViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-167599992, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreen (CryptoCelsiusClaimCodeScreen.kt:90)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(cryptoCelsiusClaimCodeViewModel.getUiState(), null, startRestartGroup, 0, 1);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(cryptoCelsiusClaimCodeViewModel);
                com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$1$1(cryptoCelsiusClaimCodeViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m13816invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13816invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                boolean z = (i4 & 112) == 32;
                com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1(appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$$inlined$NavResultEffectrtGRyWw$2 rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m13817invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13817invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                getHighSpeedVideoFpsRanges(cryptoCelsiusClaimCodeViewModel, appNavigator, context, rememberNavResultRequestId, rememberNavResultRequestId2, startRestartGroup, i4 & 126);
                com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState = (com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) collectAsState.getValue();
                boolean changedInstance2 = startRestartGroup.changedInstance(cryptoCelsiusClaimCodeViewModel);
                com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$3$1(cryptoCelsiusClaimCodeViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                getHighResolutionOutputSizeshNQ4ISI(cryptoCelsiusClaimCodeUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), appNavigator, modifier3, startRestartGroup, (i4 << 3) & 8064, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$ftHVdYzb4JZtOrSvJzkBjShN2eI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel.this, appNavigator, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final android.content.Context context, final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.Unit unit;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(565763303);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(cryptoCelsiusClaimCodeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(565763303, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeEffectHandler (CryptoCelsiusClaimCodeScreen.kt:140)");
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(cryptoCelsiusClaimCodeViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (i2 & 57344) == 16384;
            com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | changedInstance2 | z | z2) || z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                rememberedValue = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1(cryptoCelsiusClaimCodeViewModel, context, appNavigator, str, str2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                unit = unit2;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$togLu_rPSzr58zE00Gz3iegIvAc(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel.this, appNavigator, context, str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent, kotlin.Unit> function1, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(867084887);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cryptoCelsiusClaimCodeUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
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
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(867084887, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenRouter (CryptoCelsiusClaimCodeScreen.kt:170)");
                }
                int i5 = i3 & 896;
                boolean z2 = i5 == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$nNIgQ6DJdvujtvhEzId4tnZQMzQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                if (cryptoCelsiusClaimCodeUiState.isProcessing()) {
                    startRestartGroup.startReplaceGroup(44931474);
                    com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeProcessingScreenKt.CryptoCelsiusClaimCodeProcessingScreen(companion, startRestartGroup, (i3 >> 9) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (cryptoCelsiusClaimCodeUiState.getShowVerifyBuy()) {
                    startRestartGroup.startReplaceGroup(1392982026);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_verify_buy_heading, startRestartGroup, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_verify_buy_description, startRestartGroup, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_next_button, startRestartGroup, 0);
                    z = (i3 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13811$r8$lambda$bjdQaBV1x_2_SOKuWOqXPPKYv0(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusRedeemedClaimCodeConfirmationScreenKt.CryptoCelsiusRedeemedClaimCodeConfirmationScreen(stringResource, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue2, companion, stringResource2, function0, startRestartGroup, i3 & 7168, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (cryptoCelsiusClaimCodeUiState.getShowVerifySell()) {
                    startRestartGroup.startReplaceGroup(1393525704);
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_verify_buy_heading, startRestartGroup, 0);
                    java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_verify_sell_description, startRestartGroup, 0);
                    java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_next_button, startRestartGroup, 0);
                    z = (i3 & 112) == 32;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda32
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13815$r8$lambda$uG7tHQDGVMjRIg0KLuw47qeWs0(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusRedeemedClaimCodeConfirmationScreenKt.CryptoCelsiusRedeemedClaimCodeConfirmationScreen(stringResource4, stringResource6, (kotlin.jvm.functions.Function0) rememberedValue3, companion, stringResource5, function0, startRestartGroup, i3 & 7168, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (cryptoCelsiusClaimCodeUiState.getShowVerifyCryptoPro()) {
                    startRestartGroup.startReplaceGroup(1394073536);
                    java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_verify_crypto_pro_heading, startRestartGroup, 0);
                    java.lang.String stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_next_button, startRestartGroup, 0);
                    z = (i3 & 112) == 32;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$RPEXOH1PfoHFaqVurYdHArxxHH0(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusRedeemedClaimCodeConfirmationScreenKt.CryptoCelsiusRedeemedClaimCodeConfirmationScreen(stringResource7, stringResource8, (kotlin.jvm.functions.Function0) rememberedValue4, companion, null, function0, startRestartGroup, i3 & 7168, 16);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(44984098);
                    z = i5 == 256;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$3r4j0ybz95I3VmMxt5ksNOLagu8(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    modifier4 = companion;
                    composer2 = startRestartGroup;
                    CryptoCelsiusClaimCodeScreenContent(cryptoCelsiusClaimCodeUiState, function1, (kotlin.jvm.functions.Function0) rememberedValue5, modifier4, startRestartGroup, i3 & 7294, 0);
                    composer2.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                modifier4 = companion;
                composer2 = startRestartGroup;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13808$r8$lambda$PjGWWt8kaI13rL7X48A8MV95FI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState.this, function1, appNavigator, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:117:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCelsiusClaimCodeScreenContent(final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoCelsiusClaimCodeUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1516380225);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cryptoCelsiusClaimCodeUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1516380225, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContent (CryptoCelsiusClaimCodeScreen.kt:213)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button, startRestartGroup, 0), null, false, false, startRestartGroup, ((i4 >> 3) & 112) | 27654, 452);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1548659427, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13805$r8$lambda$6EnsERkSZyAGOOMLkMoONvNk2I(kotlin.jvm.functions.Function1.this, cryptoCelsiusClaimCodeUiState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), composer2, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_keep_crypto_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer2, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Shield.INSTANCE, null, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 11, null), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27702, 0);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_protection_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_protection_description, composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                composer2.endNode();
                composer2.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 11, null), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27702, 0);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_convenience_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_convenience_description, composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                composer2.endNode();
                composer2.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
                int hashCode6 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default3);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl6, java.lang.Integer.valueOf(hashCode6), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Clock.INSTANCE, null, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 11, null), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27702, 0);
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                int hashCode7 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion3);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl7, java.lang.Integer.valueOf(hashCode7), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_security_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_security_description, composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                composer2.endNode();
                composer2.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), composer2, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_higher_limits_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer2, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_higher_limits_description, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
                int hashCode8 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl8 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, rowMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, currentCompositionLocalMap8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl8, java.lang.Integer.valueOf(hashCode8), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, materializeModifier8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance4 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_download_form, composer2, 0);
                com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                com.paypal.pds.core.Icon.ArrowDownTray arrowDownTray = com.paypal.pds.core.Icon.ArrowDownTray.INSTANCE;
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                int i6 = i4 & 112;
                boolean z = i6 == 32;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$UemlYe2yvoHzxVJWrSoYIcf9stE(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, weight$default, arrowDownTray, null, secondary, medium, false, false, composer2, 1772544, 400);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                composer2.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing56()), composer2, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_terms, composer2, 0);
                com.paypal.pds.components.LinkSize.Medium medium2 = com.paypal.pds.components.LinkSize.Medium.INSTANCE;
                boolean z2 = i6 == 32;
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13812$r8$lambda$fIqVpGdK_yrtE_sAaWqvIJ9PiE(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.LinkKt.Link(stringResource2, null, (kotlin.jvm.functions.Function0) rememberedValue2, medium2, composer2, com.paypal.pds.components.LinkSize.Medium.$stable << 9, 2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer2, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_redeem_button, composer2, 0);
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean z3 = i6 == 32;
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13804$r8$lambda$1tdWn341NvJVp8QmTnqRx6JDL4(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource3, fillMaxWidth$default5, null, null, primary, large, false, false, composer2, 1769856, 408);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_cancel_button, composer2, 0);
                com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean z4 = i6 == 32;
                java.lang.Object rememberedValue4 = composer2.rememberedValue();
                if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$2Qlfj5SO2c0kflCdHJ_pIvY3Rb0(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource4, fillMaxWidth$default6, null, null, tertiary, large2, false, false, composer2, 1769856, 408);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$O4lqDL4shyhSYp1lW61lfVkjnpQ(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState.this, function1, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-DdLviIJH17iN9yj6ff3fiMVxC8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13802$r8$lambda$DdLviIJH17iN9yj6ff3fiMVxC8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(448828196);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(448828196, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContentPreview (CryptoCelsiusClaimCodeScreen.kt:578)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState(null, null, false, false, false, false, false, false, false, false, false, false, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13807$r8$lambda$GWPlzsgu5xetEZRDabe3zi2WQI((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CryptoCelsiusClaimCodeScreenContent(cryptoCelsiusClaimCodeUiState, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13802$r8$lambda$DdLviIJH17iN9yj6ff3fiMVxC8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0oxv0rkAiADs1B6q4-4J-2t3vII, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13803$r8$lambda$0oxv0rkAiADs1B6q44J2t3vII(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DistributionTermsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1tdWn341NvJVp8QmTnqRx-6JDL4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13804$r8$lambda$1tdWn341NvJVp8QmTnqRx6JDL4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.SubmitClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2Qlfj5SO2c0kflCdHJ_pIvY3Rb0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.CancelClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3r4j0ybz95I3VmMxt5ksNOLagu8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$tGu7RReknmaoQYdXQCiiRuuIFig((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4BtvSIm2WzBnfNe51sNocJdqsPI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1163569281, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCelsiusClaimCodeScreen.kt:367)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_dob_label, composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_dob_tooltip_info, composer, 0);
            boolean showDateOfBirthCoachTip = cryptoCelsiusClaimCodeUiState.getShowDateOfBirthCoachTip();
            com.paypal.pds.components.AnchorEdge.Top top = com.paypal.pds.components.AnchorEdge.Top.INSTANCE;
            com.paypal.pds.components.AnchorEdge.EdgePositioning edgePositioning = new com.paypal.pds.components.AnchorEdge.EdgePositioning(com.paypal.pds.components.AnchorEdge.Position.END, 0.0f, 2, null);
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$NaxlXWj6CJE0U8qLQ1RSAF6KM24(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CoachTipKt.CoachTip(stringResource, stringResource2, null, showDateOfBirthCoachTip, (kotlin.jvm.functions.Function1) rememberedValue, null, 0, 0, null, null, null, null, false, top, edgePositioning, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1449810272, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$5sms1QsS22QexvzgVV3xAzm5SF8(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 0, (com.paypal.pds.components.AnchorEdge.Top.$stable << 9) | 196992 | (com.paypal.pds.components.AnchorEdge.EdgePositioning.$stable << 12), 4068);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5sms1QsS22QexvzgVV3xAzm5SF8(final kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1449810272, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCelsiusClaimCodeScreen.kt:369)");
            }
            com.paypal.pds.core.Icon.QuestionCircle questionCircle = com.paypal.pds.core.Icon.QuestionCircle.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_date_of_birth_tooltip, composer, 0);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.QuestionCircle questionCircle2 = questionCircle;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$as6ru76wbKtPowaXUPfBlx_Vqrk(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(questionCircle2, (kotlin.jvm.functions.Function0) rememberedValue, modifier, tertiary, null, stringResource, null, false, false, composer, ((i2 << 6) & 896) | 3078, 464);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6EnsERkSZyAGOOMLkMoON-vNk2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13805$r8$lambda$6EnsERkSZyAGOOMLkMoONvNk2I(final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, androidx.compose.runtime.Composer composer, int i) {
        java.util.List emptyList;
        java.util.List emptyList2;
        androidx.compose.runtime.Composer composer2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1548659427, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContent.<anonymous>.<anonymous> (CryptoCelsiusClaimCodeScreen.kt:235)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CelsiusConstants.PAYPAL_CELSIUS_NAMES_URL, null, null, null, null, composer, 6, 30);
            com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter = rememberAsyncImagePainter;
            com.paypal.pds.components.ImageKt.Image(asyncImagePainter, "", androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.cryptocurrency.ui.celsius.CelsiusConstants.INSTANCE.m13801getPAYPAL_CELSIUS_NAMES_LOGO_WIDTHD9Ej5fM()), com.paypal.pds.core.ConstantsKt.getSize32()), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), com.paypal.pds.components.ImageCornerRadius.None, null, null, composer, 27696, 96);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_card_heading, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer, 0);
            com.paypal.pds.core.RichText cryptoRichText$default = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt.toCryptoRichText$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_card_description, new java.lang.Object[]{com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoDeeplinkConstants.STRETTO_CONTACT}, composer, 0), null, 1, null);
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "celsius_stretto_contact_label");
            com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13814$r8$lambda$quZYRTsjFtSewo9JayuctIfOQw(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(cryptoRichText$default, testTag, contentBase2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodyLarge, null, composer, 432, 48, 5112);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_validation_error_message, composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_invalidate_error_message, composer, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_duplicate_code_error_message, composer, 0);
            if (cryptoCelsiusClaimCodeUiState.getHasInternalDeclineError()) {
                stringResource = stringResource3;
            } else if (cryptoCelsiusClaimCodeUiState.getHasCodeInvalidatedError()) {
                stringResource = stringResource2;
            } else if (!cryptoCelsiusClaimCodeUiState.getHasClaimCodeError()) {
                stringResource = null;
            }
            java.lang.String claimCode = cryptoCelsiusClaimCodeUiState.getClaimCode();
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_input_label, composer, 0);
            if (stringResource != null) {
                composer.startReplaceGroup(873140528);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion2 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed2 = composer.changed(stringResource);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$ms_c0892U5Hq8FJfsGHoXOasufc(stringResource, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                emptyList = kotlin.collections.CollectionsKt.listOf(companion2.invoke((kotlin.jvm.functions.Function1) rememberedValue2));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(873522138);
                composer.endReplaceGroup();
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list = emptyList;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed3 = composer.changed(function1);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$O86RKZg6hQRHreuchFKgCroj0ko(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.TextInputKt.TextInput(claimCode, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue3, fillMaxWidth$default, stringResource4, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1623608872, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$Zz_NC7w2zOmvG7UlM1XnTCerNb0(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384, 1572864, 49136);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            final java.lang.String stringResource5 = cryptoCelsiusClaimCodeUiState.getHasInternalDeclineError() ? stringResource3 : !cryptoCelsiusClaimCodeUiState.getHasDateOfBirthError() ? null : androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_date_validation_error_message, composer, 0);
            java.lang.String dateOfBirth = cryptoCelsiusClaimCodeUiState.getDateOfBirth();
            java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_dob_label, composer, 0);
            if (stringResource5 != null) {
                composer.startReplaceGroup(876048886);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion3 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed4 = composer.changed(stringResource5);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$_ApV1WYq2J38XNnpEd_E7WcEnNU(stringResource5, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                emptyList2 = kotlin.collections.CollectionsKt.listOf(companion3.invoke((kotlin.jvm.functions.Function1) rememberedValue4));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(876424730);
                composer.endReplaceGroup();
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list2 = emptyList2;
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed5 = composer.changed(function1);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$hzYWuBTHQcABmi3BXuea_cD5mS4(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            java.lang.String str = stringResource5;
            com.paypal.pds.components.TextInputKt.TextInput(dateOfBirth, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue5, fillMaxWidth$default2, stringResource6, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1163569281, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$4BtvSIm2WzBnfNe51sNocJdqsPI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384, 1572864, 49136);
            if (str == null) {
                composer.startReplaceGroup(878183763);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_dob_format, composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(878523957);
                composer.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_distribution_terms, composer2, 0);
            com.paypal.pds.components.LinkSize.Medium medium = com.paypal.pds.components.LinkSize.Medium.INSTANCE;
            boolean changed6 = composer2.changed(function1);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (changed6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13803$r8$lambda$0oxv0rkAiADs1B6q44J2t3vII(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            com.paypal.pds.components.LinkKt.Link(stringResource7, null, (kotlin.jvm.functions.Function0) rememberedValue6, medium, composer, com.paypal.pds.components.LinkSize.Medium.$stable << 9, 2);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CN2mr31xQPYdayMznEK6zMX0V-o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13806$r8$lambda$CN2mr31xQPYdayMznEK6zMX0Vo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G-WPlzsgu5xetEZRDabe3zi2WQI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13807$r8$lambda$GWPlzsgu5xetEZRDabe3zi2WQI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent cryptoCelsiusClaimCodeEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoCelsiusClaimCodeEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NaxlXWj6CJE0U8qLQ1RSAF6KM24(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DateOfBirthInfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O4lqDL4shyhSYp1lW61lfVkjnpQ(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoCelsiusClaimCodeScreenContent(cryptoCelsiusClaimCodeUiState, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O86RKZg6hQRHreuchFKgCroj0ko(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ClaimCodeChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PjGWWt8kaI13rL7X48A8MV95F-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13808$r8$lambda$PjGWWt8kaI13rL7X48A8MV95FI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(cryptoCelsiusClaimCodeUiState, function1, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RPEXOH1PfoHFaqVurYdHArxxHH0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.VerifyCryptoProNextClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RlAHGZ8ky29x8bfJmGOei2PfrQI(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ClaimCodeInfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UemlYe2yvoHzxVJWrSoYIcf9stE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DownloadFormClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V9E-0gEzxIxT22t7FUZ-319tbK8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13809$r8$lambda$V9E0gEzxIxT22t7FUZ319tbK8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ClaimCodeInfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XRaJFz1ppkROfqXM7Hw-i5tMzQo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13810$r8$lambda$XRaJFz1ppkROfqXM7Hwi5tMzQo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ContactStrettoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zz_NC7w2zOmvG7UlM1XnTCerNb0(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1623608872, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCelsiusClaimCodeScreen.kt:313)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_code_input_label, composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_celsius_claim_tooltip_info, composer, 0);
            boolean showClaimCodeCoachTip = cryptoCelsiusClaimCodeUiState.getShowClaimCodeCoachTip();
            com.paypal.pds.components.AnchorEdge.Top top = com.paypal.pds.components.AnchorEdge.Top.INSTANCE;
            com.paypal.pds.components.AnchorEdge.EdgePositioning edgePositioning = new com.paypal.pds.components.AnchorEdge.EdgePositioning(com.paypal.pds.components.AnchorEdge.Position.END, 0.0f, 2, null);
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$RlAHGZ8ky29x8bfJmGOei2PfrQI(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CoachTipKt.CoachTip(stringResource, stringResource2, null, showClaimCodeCoachTip, (kotlin.jvm.functions.Function1) rememberedValue, null, 0, 0, null, null, null, null, false, top, edgePositioning, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-267670601, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.$r8$lambda$_WTuHfZiLYK17ZST8S84dAt0ALc(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 0, (com.paypal.pds.components.AnchorEdge.Top.$stable << 9) | 196992 | (com.paypal.pds.components.AnchorEdge.EdgePositioning.$stable << 12), 4068);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$_ApV1WYq2J38XNnpEd_E7WcEnNU(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_WTuHfZiLYK17ZST8S84dAt0ALc(final kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-267670601, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoCelsiusClaimCodeScreen.kt:315)");
            }
            com.paypal.pds.core.Icon.QuestionCircle questionCircle = com.paypal.pds.core.Icon.QuestionCircle.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_claim_code_tooltip, composer, 0);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.QuestionCircle questionCircle2 = questionCircle;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13809$r8$lambda$V9E0gEzxIxT22t7FUZ319tbK8(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(questionCircle2, (kotlin.jvm.functions.Function0) rememberedValue, modifier, tertiary, null, stringResource, null, false, false, composer, ((i2 << 6) & 896) | 3078, 464);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$as6ru76wbKtPowaXUPfBlx_Vqrk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DateOfBirthInfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bjdQaBV1x_2_SOKuWOqXPP-KYv0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13811$r8$lambda$bjdQaBV1x_2_SOKuWOqXPPKYv0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.VerifyBuyNextClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fIqVpGdK_yrt-E_sAaWqvIJ9PiE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13812$r8$lambda$fIqVpGdK_yrtE_sAaWqvIJ9PiE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.TermsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ftHVdYzb4JZtOrSvJzkBjShN2eI(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoCelsiusClaimCodeScreen(cryptoCelsiusClaimCodeViewModel, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hzYWuBTHQcABmi3BXuea_cD5mS4(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DateOfBirthChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$ms_c0892U5Hq8FJfsGHoXOasufc(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nNIgQ6DJdvujtvhEzId4tnZQMzQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13806$r8$lambda$CN2mr31xQPYdayMznEK6zMX0Vo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$quZYRTsjFtSewo9JayuctIf-OQw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13814$r8$lambda$quZYRTsjFtSewo9JayuctIfOQw(final kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoLinkClickHandler.INSTANCE.handleLinkClick(str2, com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoDeeplinkConstants.STRETTO_CONTACT, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.m13810$r8$lambda$XRaJFz1ppkROfqXM7Hwi5tMzQo(kotlin.jvm.functions.Function1.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tGu7RReknmaoQYdXQCiiRuuIFig(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$togLu_rPSzr58zE00Gz3iegIvAc(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(cryptoCelsiusClaimCodeViewModel, appNavigator, context, str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uG7tHQDGV-MjRIg0KLuw47qeWs0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13815$r8$lambda$uG7tHQDGVMjRIg0KLuw47qeWs0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.VerifySellNextClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
