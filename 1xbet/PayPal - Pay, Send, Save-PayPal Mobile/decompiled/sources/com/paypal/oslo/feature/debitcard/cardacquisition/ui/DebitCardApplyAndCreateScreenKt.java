package com.paypal.oslo.feature.debitcard.cardacquisition.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"DebitCardApplyAndCreateScreen", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "shouldIssuePhysical", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/viewmodel/DebitCardApplyAndCreateViewModel;", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZLcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/viewmodel/DebitCardApplyAndCreateViewModel;Landroidx/compose/runtime/Composer;II)V", "DebitCardApplyAndCreateScreenContent", "state", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitProgressState;", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitProgressState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DebitProgressScreenLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "DebitProgressScreenSuccessPreview", "debit-card_prodRelease", "uiState", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardApplyAndCreateScreen(final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final boolean z, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel3;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.ui.Modifier modifier5;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-395326622);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardProductName.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel;
                    if (startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    debitCardApplyAndCreateViewModel3 = debitCardApplyAndCreateViewModel2;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier6 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i4 &= -57345;
                        debitCardApplyAndCreateViewModel3 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        debitCardApplyAndCreateViewModel3 = debitCardApplyAndCreateViewModel2;
                    }
                    modifier4 = modifier6;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-395326622, i4, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreen (DebitCardApplyAndCreateScreen.kt:67)");
                }
                int i7 = i4;
                final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel4 = debitCardApplyAndCreateViewModel3;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardApplyAndCreateViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean changedInstance = startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel4);
                int i8 = i7 & 14;
                boolean z2 = i8 == 4;
                int i9 = i7 & 112;
                boolean z3 = i9 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$1$1(debitCardApplyAndCreateViewModel4, debitCardProductName, z, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(debitCardProductName, java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i7 & 126);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel4);
                int i10 = i7 & 896;
                boolean z4 = i10 == 256;
                boolean z5 = i8 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z5 | z4 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$2$1(debitCardApplyAndCreateViewModel4, appNavigator, debitCardProductName, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue()).getClass());
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1(collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial.INSTANCE) || (debitCardApplyAndCreateUiState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning)) {
                    modifier5 = modifier4;
                    startRestartGroup.startReplaceGroup(-372175371);
                    DebitCardApplyAndCreateScreenContent(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Loading(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_confirming_info, startRestartGroup, 0)), modifier5, startRestartGroup, (i7 >> 6) & 112, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-371763660);
                    DebitCardApplyAndCreateScreenContent(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Success(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_your_card_ready, startRestartGroup, 0)), modifier4, startRestartGroup, (i7 >> 6) & 112, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier5 = modifier4;
                } else {
                    if (!(debitCardApplyAndCreateUiState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error)) {
                        startRestartGroup.startReplaceGroup(-1951673397);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-371337751);
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState2 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(debitCardApplyAndCreateUiState2, "");
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error) debitCardApplyAndCreateUiState2;
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                    if (errorType == null) {
                        errorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = errorType;
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    int retryCount = error.getRetryCount();
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getUserIntent();
                    boolean changedInstance3 = startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel4);
                    boolean z6 = i8 == 4;
                    boolean z7 = i9 == 32;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changedInstance3 | z6 | z7) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.$r8$lambda$k12vsWrPb4EQB2PNVGm90jS5Uk0(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.this, debitCardProductName, z);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean z8 = i10 == 256;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (z8 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.$r8$lambda$UtEZlIf4aCCxkoRgJ0USoR80Yr8(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    modifier5 = modifier4;
                    com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue5, userIntent, fillMaxSize$default, false, java.lang.Integer.valueOf(retryCount), null, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9, 160);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel4;
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel5 = debitCardApplyAndCreateViewModel2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.m14216$r8$lambda$4DS1WC_bFx7xSWlqHDorZxX_p0(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, z, appNavigator, modifier3, debitCardApplyAndCreateViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void DebitCardApplyAndCreateScreenContent(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState debitProgressState, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitProgressState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-956324428);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitProgressState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-956324428, i3, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenContent (DebitCardApplyAndCreateScreen.kt:208)");
            }
            boolean z = debitProgressState instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Loading;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
            com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt.AnimateProgressValue(z, mutableFloatState, 1.0f, startRestartGroup, 432, 0);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (z) {
                startRestartGroup.startReplaceGroup(1561176478);
                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitProgressWidgetKt.DebitProgressWidget(((com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Loading) debitProgressState).getText(), com.paypal.pds.components.ProgressBarStyle.Neutral.INSTANCE, mutableFloatState.getFloatValue(), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getCONFIRMING_INFO_LOADER()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getUserIntent())), startRestartGroup, 48, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(debitProgressState instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Success)) {
                    startRestartGroup.startReplaceGroup(604548585);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1561691667);
                java.lang.String message = ((com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Success) debitProgressState).getMessage();
                if (message != null) {
                    startRestartGroup.startReplaceGroup(1561691667);
                    com.paypal.oslo.feature.debitcard.shared.ui.components.DebitProgressWidgetKt.DebitProgressWidget(message, com.paypal.pds.components.ProgressBarStyle.Neutral.INSTANCE, mutableFloatState.getFloatValue(), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getCARD_READY_LOADER()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getUserIntent())), startRestartGroup, 48, 0);
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(1561691666);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.$r8$lambda$vjfADY2SV1QCxMefI5L2WXAkrAs(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DebitProgressScreenLoadingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(415241820);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(415241820, i, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitProgressScreenLoadingPreview (DebitCardApplyAndCreateScreen.kt:255)");
            }
            DebitCardApplyAndCreateScreenContent(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Loading(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_confirming_info, startRestartGroup, 0)), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.$r8$lambda$CDNu4SaCIbrMq5WoUJCpqU5AdzM(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DebitProgressScreenSuccessPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2103504547);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2103504547, i, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitProgressScreenSuccessPreview (DebitCardApplyAndCreateScreen.kt:266)");
            }
            DebitCardApplyAndCreateScreenContent(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState.Success(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_your_card_ready, startRestartGroup, 0)), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.$r8$lambda$Rjt6_EkxjHHB3yCCm2ZD1nRWzn8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4DS1WC_bFx7x-SWlqHDorZxX_p0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14216$r8$lambda$4DS1WC_bFx7xSWlqHDorZxX_p0(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardApplyAndCreateScreen(debitCardProductName, z, appNavigator, modifier, debitCardApplyAndCreateViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CDNu4SaCIbrMq5WoUJCpqU5AdzM(int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitProgressScreenLoadingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rjt6_EkxjHHB3yCCm2ZD1nRWzn8(int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitProgressScreenSuccessPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UtEZlIf4aCCxkoRgJ0USoR80Yr8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.$r8$lambda$v2_9Rma0VFGKwQtRjqH4BjuxKl4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k12vsWrPb4EQB2PNVGm90jS5Uk0(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.provisionCard$default(debitCardApplyAndCreateViewModel, debitCardProductName, z, null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v2_9Rma0VFGKwQtRjqH4BjuxKl4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vjfADY2SV1QCxMefI5L2WXAkrAs(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitProgressState debitProgressState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardApplyAndCreateScreenContent(debitProgressState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState access$DebitCardApplyAndCreateScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) state.getValue();
    }
}
