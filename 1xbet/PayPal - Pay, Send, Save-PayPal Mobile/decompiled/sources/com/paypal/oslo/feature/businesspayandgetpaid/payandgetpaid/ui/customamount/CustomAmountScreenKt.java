package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ay\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aS\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.AddTaxTestTag, "", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.PrimaryButtonTestTag, "CustomAmountScreen", "", "viewModel", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel;", "selectTaxRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "onCloseClick", "Lkotlin/Function0;", "onTaxClick", "Lkotlin/Function1;", "onAddToRequestClick", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "onUpdateClick", "onRemoveClick", "CustomAmountScreen-o3ECnlE", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CustomAmountFooterButtons", "uiState", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel$UiState;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel$UiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "business-pay-and-get-paid_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomAmountScreenKt {
    public static final java.lang.String AddTaxTestTag = "AddTaxTestTag";
    public static final java.lang.String PrimaryButtonTestTag = "PrimaryButtonTestTag";

    /* renamed from: CustomAmountScreen-o3ECnlE, reason: not valid java name */
    public static final void m13168CustomAmountScreeno3ECnlE(final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function13, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmountViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1026524442);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(customAmountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1026524442, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreen (CustomAmountScreen.kt:78)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(customAmountViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            boolean changedInstance = startRestartGroup.changedInstance(customAmountViewModel);
            boolean z = (i2 & 896) == 256;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$1$1(customAmountViewModel, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(customAmountViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i2 & 14);
            boolean changedInstance2 = startRestartGroup.changedInstance(customAmountViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$2$1(customAmountViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreeno3ECnlE$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen-o3ECnlE$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13169invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13169invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, ((i2 >> 3) & 14) | 3072);
            final androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
            composer2 = startRestartGroup;
            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2))));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, imePadding);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) collectAsStateWithLifecycle.getValue()).isEditMode()) {
                i3 = com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_custom_amount_edit_title;
            } else {
                i3 = com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_custom_amount_title;
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, composer2, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1198760980, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.$r8$lambda$5Bn3T_Vm8MqdSWr7netFHz8Y9_I(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), null, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
            boolean showError = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) collectAsStateWithLifecycle.getValue()).getShowError();
            boolean changed = composer2.changed(collectAsStateWithLifecycle);
            boolean changed2 = composer2.changed(rememberScrollState);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$2$1 rememberedValue4 = composer2.rememberedValue();
            if ((changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$2$1(rememberScrollState, collectAsStateWithLifecycle, null);
                composer2.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(showError), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
            com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1632854497, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.$r8$lambda$_uedkZs6vJiVeDyIJYbRxclBtFs(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this, function12, function13, function02, collectAsStateWithLifecycle, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1786627552, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.m13164$r8$lambda$2w4CJoLm9lVq6hzmUguX5kJqjc(androidx.compose.foundation.ScrollState.this, function0, customAmountViewModel, collectAsStateWithLifecycle, focusManager, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, 27648, 4);
            composer2.endNode();
            if (((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) collectAsStateWithLifecycle.getValue()).getShowDiscardChangesDialog()) {
                composer2.startReplaceGroup(-1016421931);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_add_amount_discard_header, composer2, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_add_amount_discard_body, composer2, 0);
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1166293479, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.m13166$r8$lambda$bs7CTvwbenXuREYUxsRoyxZP8(kotlin.jvm.functions.Function0.this, customAmountViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54);
                boolean changedInstance3 = composer2.changedInstance(customAmountViewModel);
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$5$1 rememberedValue5 = composer2.rememberedValue();
                if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$5$1(customAmountViewModel);
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.pds.components.DialogKt.Dialog(stringResource, null, stringResource2, rememberComposableLambda, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue5), composer2, 3072, 2);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1015461892);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.m13163$r8$lambda$0YjYYi5IFB2SehYURpr76OYwUk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this, str, function0, function1, function12, function13, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState uiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1539899872);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(customAmountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(uiState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1539899872, i4, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountFooterButtons (CustomAmountScreen.kt:256)");
            }
            final android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
            if (uiState.isEditMode()) {
                i3 = com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_Update;
            } else {
                i3 = com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_update_total;
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), PrimaryButtonTestTag);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, startRestartGroup, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(resources);
            boolean changedInstance2 = startRestartGroup.changedInstance(customAmountViewModel);
            boolean z = (i4 & 112) == 32;
            boolean z2 = (i4 & 7168) == 2048;
            boolean z3 = (i4 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.$r8$lambda$2STn3vwf4JxGfRBPTIMulHQpgQQ(resources, customAmountViewModel, uiState, function12, function1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, testTag, null, null, primary, null, false, false, composer2, 196992, 472);
            if (uiState.isEditMode()) {
                composer2.startReplaceGroup(-609187812);
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_remove, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, composer2, ((i4 >> 12) & 14) | 196992, 472);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-608960830);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.$r8$lambda$5JfK4JQI0iAi_3OTfs8wLqs3DSE(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this, uiState, function1, function12, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0YjYYi5IFB2Seh-YURpr76OYwUk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13163$r8$lambda$0YjYYi5IFB2SehYURpr76OYwUk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        m13168CustomAmountScreeno3ECnlE(customAmountViewModel, str, function0, function1, function12, function13, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2STn3vwf4JxGfRBPTIMulHQpgQQ(android.content.res.Resources resources, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState uiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        java.lang.String string = resources.getString(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_custom_amount_amount_required);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = resources.getString(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_name_link_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = resources.getString(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_validation_name_too_long);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = resources.getString(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_validation_amount_must_be_positive);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
        java.lang.String string5 = resources.getString(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_validation_amount_exceeds_max);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
        if (customAmountViewModel.validateForm(string, string2, string3, string4, string5)) {
            java.lang.String string6 = resources.getString(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_amount);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem createLineItem = customAmountViewModel.createLineItem(string6);
            if (createLineItem != null) {
                if (uiState.isEditMode()) {
                    function1.invoke(createLineItem);
                } else {
                    function12.invoke(createLineItem);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* renamed from: $r8$lambda$2w4CJo-Lm9lVq6hzmUguX5kJqjc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13164$r8$lambda$2w4CJoLm9lVq6hzmUguX5kJqjc(androidx.compose.foundation.ScrollState scrollState, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, final androidx.compose.runtime.State state, final androidx.compose.ui.focus.FocusManager focusManager, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        ?? r14;
        com.paypal.pds.components.textinput.VisualTransformation visualTransformation;
        java.util.List emptyList;
        java.util.List emptyList2;
        java.lang.String str;
        java.lang.String str2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1786627552, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreen.<anonymous>.<anonymous> (CustomAmountScreen.kt:137)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, scrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            if (((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getShowError()) {
                composer.startReplaceGroup(1770886470);
                r14 = 0;
                com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_generic_title, composer, 0), (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.Close, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, 24624, 40);
                composer.endReplaceGroup();
            } else {
                r14 = 0;
                composer.startReplaceGroup(1771340620);
                composer.endReplaceGroup();
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_amount, composer, r14);
            java.lang.String amount = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getAmount();
            boolean changedInstance = composer.changedInstance(customAmountViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$4$1$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$4$1$1$1(customAmountViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue;
            java.lang.String currencyCode = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getCurrencyCode();
            if (currencyCode != null) {
                java.util.Currency currency = java.util.Currency.getInstance(currencyCode);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
                visualTransformation = new com.paypal.pds.components.textinput.VisualTransformation.Currency(currency, r14, 2, null);
            } else {
                visualTransformation = com.paypal.pds.components.textinput.VisualTransformation.None.INSTANCE;
            }
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            if (kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getAmountError())) {
                composer.startReplaceGroup(1772418769);
                composer.endReplaceGroup();
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            } else {
                composer.startReplaceGroup(1772043886);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed = composer.changed(state);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.$r8$lambda$ZwktN0qHUyETxHBOeDNOJo4AeKs(androidx.compose.runtime.State.this, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                emptyList = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue2));
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.TextInputKt.TextInput(amount, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) kFunction, fillMaxWidth$default, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, visualTransformation, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) emptyList, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 100663680, (com.paypal.pds.components.textinput.VisualTransformation.$stable << 6) | 48, 108272);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            java.lang.String name2 = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getName();
            boolean changedInstance2 = composer.changedInstance(customAmountViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$4$1$4$1 rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$4$1$4$1(customAmountViewModel);
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue3;
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_custom_amount_name, composer, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            if (kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getNameError())) {
                composer.startReplaceGroup(1773334385);
                composer.endReplaceGroup();
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            } else {
                composer.startReplaceGroup(1772961424);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion2 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed2 = composer.changed(state);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.m13165$r8$lambda$S_X1qr5LGuA3daylGD6KPj6cs(androidx.compose.runtime.State.this, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                emptyList2 = kotlin.collections.CollectionsKt.listOf(companion2.invoke((kotlin.jvm.functions.Function1) rememberedValue4));
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.TextInputKt.TextInput(name2, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) kFunction2, fillMaxWidth$default2, stringResource2, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) emptyList2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 48, 112624);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, AddTaxTestTag), 0.0f, 1, null);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax selectedTax = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getSelectedTax();
            if (selectedTax != null) {
                java.math.BigDecimal value = selectedTax.getValue();
                java.lang.String label = selectedTax.getLabel();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(value);
                sb.append(" ");
                sb.append(label);
                str = sb.toString();
            } else {
                str = null;
            }
            if (str == null) {
                composer.startReplaceGroup(-2020985595);
                str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_custom_amount_no_tax, composer, 0);
            } else {
                composer.startReplaceGroup(-2020988137);
                str2 = str;
            }
            composer.endReplaceGroup();
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tax, composer, 0);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.m13167$r8$lambda$unFiT4HAhHeAS12q4iZne34EXM((java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean changedInstance3 = composer.changedInstance(focusManager);
            boolean changed3 = composer.changed(function1);
            boolean changed4 = composer.changed(state);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if ((changedInstance3 | changed3 | changed4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.$r8$lambda$ZRm7r4JkKn64SRnQ_dsWLfWEZp4(androidx.compose.ui.focus.FocusManager.this, function1, state);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            com.paypal.pds.components.TextInputKt.ClickableTextInput(str2, function12, fillMaxWidth$default3, (kotlin.jvm.functions.Function0) rememberedValue6, stringResource3, null, null, false, true, null, null, null, false, null, null, null, null, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.ComposableSingletons$CustomAmountScreenKt.INSTANCE.m13162getLambda$1672761636$business_pay_and_get_paid_prodRelease(), composer, 113246640, 12582912, 130656);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5Bn3T_Vm8MqdSWr7netFHz8Y9_I(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1198760980, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreen.<anonymous>.<anonymous> (CustomAmountScreen.kt:112)");
            }
            boolean changedInstance = composer.changedInstance(customAmountViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$1$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$3$1$1$1(customAmountViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5JfK4JQI0iAi_3OTfs8wLqs3DSE(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState uiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(customAmountViewModel, uiState, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S_X1-qr5LGu-A3daylGD6KPj6cs, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m13165$r8$lambda$S_X1qr5LGuA3daylGD6KPj6cs(androidx.compose.runtime.State state, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getNameError(), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZRm7r4JkKn64SRnQ_dsWLfWEZp4(androidx.compose.ui.focus.FocusManager focusManager, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.State state) {
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax selectedTax = ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getSelectedTax();
        function1.invoke(selectedTax != null ? selectedTax.getId() : null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$ZwktN0qHUyETxHBOeDNOJo4AeKs(androidx.compose.runtime.State state, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue()).getAmountError(), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_uedkZs6vJiVeDyIJYbRxclBtFs(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1632854497, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreen.<anonymous>.<anonymous> (CustomAmountScreen.kt:128)");
            }
            Camera2StreamConfigurationMap(customAmountViewModel, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue(), function1, function12, function0, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bs7CTvwben-XuREYUxsRoy-xZP8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13166$r8$lambda$bs7CTvwbenXuREYUxsRoyxZP8(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1166293479, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreen.<anonymous> (CustomAmountScreen.kt:230)");
            }
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_discard, composer, 0), function0, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_cancel, composer, 0);
            boolean changedInstance = composer.changedInstance(customAmountViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$4$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt$CustomAmountScreen$4$1$1(customAmountViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem(stringResource, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, 108, null);
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(buttonGroupItemArr, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, composer, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$unFiT4-HAhHeAS12q4iZne34EXM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13167$r8$lambda$unFiT4HAhHeAS12q4iZne34EXM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState access$CustomAmountScreen_o3ECnlE$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) state.getValue();
    }
}
