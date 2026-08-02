package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a]\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"CustomStatementScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementViewModel;", "onNavigateBack", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CustomStatementContent", "state", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "email", "", "isSelectableDatePredicate", "Lkotlin/Function1;", "", "", "onEvent", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease", "uiState", "userEmail"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomStatementScreen(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel3;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel4;
        boolean changedInstance;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$CustomStatementScreen$1$1 rememberedValue;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1233496029);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                customStatementViewModel2 = customStatementViewModel;
                if (startRestartGroup.changedInstance(customStatementViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                customStatementViewModel2 = customStatementViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            customStatementViewModel2 = customStatementViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                modifier4 = modifier2;
            } else {
                modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
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
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel5 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i4 = i7 & (-113);
                    customStatementViewModel4 = customStatementViewModel5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1233496029, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreen (CustomStatementScreen.kt:39)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(customStatementViewModel4.getUiState(), null, startRestartGroup, 0, 1);
                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(customStatementViewModel4.getUserEmail(), null, startRestartGroup, 0, 1);
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState customStatementUiState = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState) collectAsState.getValue();
                    java.lang.String str = (java.lang.String) collectAsState2.getValue();
                    kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> isSelectableDatePredicate = customStatementViewModel4.isSelectableDatePredicate();
                    changedInstance = startRestartGroup.changedInstance(customStatementViewModel4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$CustomStatementScreen$1$1(customStatementViewModel4);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    CustomStatementContent(customStatementUiState, str, isSelectableDatePredicate, modifier4, function0, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), startRestartGroup, ((i4 << 9) & 7168) | ((i4 << 6) & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    customStatementViewModel3 = customStatementViewModel4;
                    modifier3 = modifier4;
                }
            }
            i4 = i7;
            customStatementViewModel4 = customStatementViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(customStatementViewModel4.getUiState(), null, startRestartGroup, 0, 1);
            androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(customStatementViewModel4.getUserEmail(), null, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState customStatementUiState2 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState) collectAsState3.getValue();
            java.lang.String str2 = (java.lang.String) collectAsState22.getValue();
            kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> isSelectableDatePredicate2 = customStatementViewModel4.isSelectableDatePredicate();
            changedInstance = startRestartGroup.changedInstance(customStatementViewModel4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$CustomStatementScreen$1$1(customStatementViewModel4);
            startRestartGroup.updateRememberedValue(rememberedValue);
            CustomStatementContent(customStatementUiState2, str2, isSelectableDatePredicate2, modifier4, function0, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), startRestartGroup, ((i4 << 9) & 7168) | ((i4 << 6) & 57344), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            customStatementViewModel3 = customStatementViewModel4;
            modifier3 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            customStatementViewModel3 = customStatementViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.$r8$lambda$ThSJEgrtIcmBFiFzxVKn_BWnr7c(androidx.compose.ui.Modifier.this, customStatementViewModel3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomStatementContent(final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState customStatementUiState, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> function1, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1426873304);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(customStatementUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1426873304, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementContent (CustomStatementScreen.kt:75)");
                }
                if (customStatementUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content) {
                    startRestartGroup.startReplaceGroup(-690937948);
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "custom_statement_container");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_top_nav_title, startRestartGroup, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2147277718, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.m20350$r8$lambda$DM66iMLUJEhjq2EglQ7FlE_8g(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, 221184, 78);
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementComposeKt.RenderCustomStatementContent((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content) customStatementUiState, function1, function12, null, startRestartGroup, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 >> 9) & 896), 8);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    androidx.compose.ui.Modifier modifier6 = modifier4;
                    composer2 = startRestartGroup;
                    boolean z = false;
                    if (customStatementUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading) {
                        composer2.startReplaceGroup(-690111178);
                        int i6 = (i4 >> 9) & 14;
                        modifier3 = modifier6;
                        com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.LoadingScreenComponentKt.LoadingScreenComponent(modifier3, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_loading_message, composer2, 0), composer2, i6, 0);
                        composer2.endReplaceGroup();
                    } else {
                        modifier3 = modifier6;
                        if (!(customStatementUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess)) {
                            if (!(customStatementUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError)) {
                                composer2.startReplaceGroup(-1130667919);
                                composer2.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-689487365);
                            int i7 = i4 & 458752;
                            boolean z2 = i7 == 131072;
                            java.lang.Object rememberedValue = composer2.rememberedValue();
                            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.$r8$lambda$hzj83BROl89kdf8f9KjkCA__ipM(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                            if (i7 == 131072) {
                                z = true;
                            }
                            java.lang.Object rememberedValue2 = composer2.rememberedValue();
                            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.m20349$r8$lambda$5Y9JJo_5VG5pSyqk_u7Grb5Cqw(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.ErrorScreenComponentKt.ErrorScreenComponent(function02, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer2, 0, 4);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-689811377);
                            if ((i4 & 458752) == 131072) {
                                z = true;
                            }
                            java.lang.Object rememberedValue3 = composer2.rememberedValue();
                            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.m20351$r8$lambda$JMDTiYcRtb3rWEJXEyd0S33580(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementSuccessScreenKt.CustomStatementSuccessContent(str, (kotlin.jvm.functions.Function0) rememberedValue3, function0, modifier3, composer2, ((i4 >> 3) & 14) | ((i4 >> 6) & 896) | (i4 & 7168), 0);
                            composer2.endReplaceGroup();
                        }
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.$r8$lambda$6Pl2nkfotn4Qal3p7fIDDv3U4MY(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.this, str, function1, modifier2, function0, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$5Y9JJo_5VG5pSyqk_u7Grb5-Cqw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20349$r8$lambda$5Y9JJo_5VG5pSyqk_u7Grb5Cqw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.BackToForm.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6Pl2nkfotn4Qal3p7fIDDv3U4MY(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState customStatementUiState, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomStatementContent(customStatementUiState, str, function1, modifier, function0, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D-M6-6iMLUJEhjq2EglQ7FlE_8g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20350$r8$lambda$DM66iMLUJEhjq2EglQ7FlE_8g(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2147277718, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementContent.<anonymous>.<anonymous> (CustomStatementScreen.kt:89)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JMDTiYcR-tb3rWEJXEyd0S33580, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20351$r8$lambda$JMDTiYcRtb3rWEJXEyd0S33580(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.BackToForm.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ThSJEgrtIcmBFiFzxVKn_BWnr7c(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomStatementScreen(modifier, customStatementViewModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hzj83BROl89kdf8f9KjkCA__ipM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
