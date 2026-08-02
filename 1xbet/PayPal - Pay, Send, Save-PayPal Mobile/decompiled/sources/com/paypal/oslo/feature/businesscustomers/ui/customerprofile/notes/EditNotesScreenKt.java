package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010H\u0001¢\u0006\u0002\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0001¢\u0006\u0002\u0010\u0017\u001aA\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010 \u001a\u00020\u0001*\u00020!H\u0007¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"EditNotesScreenErrorBannerTestTag", "", "EditNotesScreenNotesSectionTestTag", "EditNotesScreenUpdateButtonTestTag", "EditNotesScreenClearButtonTestTag", "EditNotesScreen", "", "viewModel", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesViewModel;", "onNavigateBack", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EditNotesContent", "uiState", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "EditNotesTopBar", "isAddMode", "", "onBackClick", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EditNotesLayout", "onClearClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EditNotesContentEditModePreview", "(Landroidx/compose/runtime/Composer;I)V", "EditNotesContentPreview", "toErrorMessage", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesError;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesError;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "business-customers_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditNotesScreenKt {
    public static final java.lang.String EditNotesScreenClearButtonTestTag = "EditNotesScreen_ClearButton";
    public static final java.lang.String EditNotesScreenErrorBannerTestTag = "EditNotesScreen_ErrorBanner";
    public static final java.lang.String EditNotesScreenNotesSectionTestTag = "EditNotesScreen_NotesSection";
    public static final java.lang.String EditNotesScreenUpdateButtonTestTag = "EditNotesScreen_UpdateButton";

    public static final void EditNotesScreen(final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(749296275);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(editNotesViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(749296275, i2, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreen (EditNotesScreen.kt:67)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(editNotesViewModel.getUiState(), null, startRestartGroup, 0, 1);
            boolean changedInstance = startRestartGroup.changedInstance(editNotesViewModel);
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$EditNotesScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$EditNotesScreen$1$1(editNotesViewModel, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(editNotesViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i2 & 14);
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState) collectAsState.getValue();
            boolean changedInstance2 = startRestartGroup.changedInstance(editNotesViewModel);
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$EditNotesScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$EditNotesScreen$2$1(editNotesViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EditNotesContent(editNotesUiState, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.m12844$r8$lambda$u9ZE18S2PX2uwT2DYdoOIbteGY(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditNotesContent(final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        boolean z;
        final com.paypal.pds.components.BottomSheetController bottomSheetController;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-523660750);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(editNotesUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-523660750, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesContent (EditNotesScreen.kt:88)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController3 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController3);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | z2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$Lr9Y0vNLmEnrkx1virvHHPE7W2Q(com.paypal.pds.components.BottomSheetController.this, bottomSheetController2, editNotesUiState, function1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed = startRestartGroup.changed(function0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$T8OuhGI0mf_4GtyJxAOMmz0daM0(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            EditNotesTopBar(editNotesUiState.isAddMode(), function0, startRestartGroup, 0);
            if (i4 == 4) {
                bottomSheetController = bottomSheetController3;
                z = true;
            } else {
                z = false;
                bottomSheetController = bottomSheetController3;
            }
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((z | changedInstance3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$C77xRYooHzyBwydqSq1shBX7wME(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.this, bottomSheetController);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EditNotesLayout(editNotesUiState, function1, (kotlin.jvm.functions.Function0) rememberedValue5, null, startRestartGroup, i3 & 126, 8);
            startRestartGroup.endNode();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_unsaved_changes_header, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_unsaved_changes_message, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_unsaved_changes_exit_button, startRestartGroup, 0);
            boolean z4 = i5 == 32;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$fRGpkQ2hb5naJGqlPspift5tB0c(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            boolean z5 = false;
            com.paypal.pds.components.BottomSheetController bottomSheetController4 = bottomSheetController;
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.businesscustomers.ui.common.ConfirmationModalKt.ConfirmationModal(bottomSheetController2, stringResource, stringResource2, stringResource3, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, null, composer2, com.paypal.pds.components.BottomSheetController.$stable, 368);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_clear_notes_header, composer2, 0);
            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_clear_notes_message, composer2, 0);
            java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_clear_notes_clear_button, composer2, 0);
            if (i5 == 32) {
                z5 = true;
            }
            java.lang.Object rememberedValue7 = composer2.rememberedValue();
            if (z5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$zewVmQ9YzAKeaJ4tyu7IyBIsI1M(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.businesscustomers.ui.common.ConfirmationModalKt.ConfirmationModal(bottomSheetController4, stringResource4, stringResource5, stringResource6, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue7, null, composer2, com.paypal.pds.components.BottomSheetController.$stable, 368);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$Ebt9ZgJ0hXd2netNL6N62ba2Uig(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditNotesTopBar(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(764530970);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(764530970, i2, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesTopBar (EditNotesScreen.kt:151)");
            }
            if (z) {
                i3 = com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_profile_notes_add;
            } else {
                i3 = com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_profile_notes_edit;
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, startRestartGroup, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-356501846, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$K4ViNXAlYbAOuW3IH82x7SpMUw4(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$TCw4njGhoPfcgDjCqU6WEPx851s(z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditNotesLayout(final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-464629706);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(editNotesUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-464629706, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesLayout (EditNotesScreen.kt:170)");
            }
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            com.paypal.pds.components.DockKt.Dock(modifier, rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1568500217, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$tNCMF4TGMLV0Q7LZD1H9hBgJkPU(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.this, function1, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1926892550, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$V77gI8XQwS7fLPK1WVhxSHeRNps(androidx.compose.foundation.ScrollState.this, editNotesUiState, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 9) & 14) | 27648, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.m12842$r8$lambda$hUeJLqqEA4lQLaYus1PaP88TUA(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.this, function1, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditNotesContentEditModePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1740211300);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1740211300, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesContentEditModePreview (EditNotesScreen.kt:250)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.getCustomerNotesLoremIpsum(), com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.getCustomerNotesLoremIpsum(), false, false, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.UpdateFailed, 24, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$BFcMTZgXa4bb9uBkWZr7l4srrTo((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EditNotesContent(editNotesUiState, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.m12843$r8$lambda$kx8lpR20meANgBb2uJWl_caquE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditNotesContentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1822473993);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1822473993, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesContentPreview (EditNotesScreen.kt:266)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, "", "", false, false, null, 56, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$SR4D8R9j9aXyc6ceehdCqIelkPI((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EditNotesContent(editNotesUiState, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$8VI85_4ymKp21Bk3YFqRL39oo6g(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.String toErrorMessage(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError editNotesError, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String makeNotesAreTooLongErrorText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesError, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-738036199, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.toErrorMessage (EditNotesScreen.kt:280)");
        }
        int i2 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.WhenMappings.$EnumSwitchMapping$0[editNotesError.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-583180329);
            makeNotesAreTooLongErrorText = com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.makeNotesAreTooLongErrorText(composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-583178158);
            makeNotesAreTooLongErrorText = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_error_update, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-583181598);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-583174191);
            makeNotesAreTooLongErrorText = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_error_clear, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return makeNotesAreTooLongErrorText;
    }

    /* renamed from: $r8$lambda$6wtgMp-mln99VC0lLZeMwo4Ekz8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12840$r8$lambda$6wtgMpmln99VC0lLZeMwo4Ekz8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.UpdateClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8VI85_4ymKp21Bk3YFqRL39oo6g(int i, androidx.compose.runtime.Composer composer, int i2) {
        EditNotesContentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BDBjXKZMzzdqyYxN7oOQybKDcks(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BFcMTZgXa4bb9uBkWZr7l4srrTo(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C77xRYooHzyBwydqSq1shBX7wME(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        if (!kotlin.text.StringsKt.isBlank(editNotesUiState.getNotes())) {
            bottomSheetController.showSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D8Y0_Gl4r_LoaDV_6d4RUSRB-dA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12841$r8$lambda$D8Y0_Gl4r_LoaDV_6d4RUSRBdA(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ebt9ZgJ0hXd2netNL6N62ba2Uig(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        EditNotesContent(editNotesUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K4ViNXAlYbAOuW3IH82x7SpMUw4(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-356501846, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesTopBar.<anonymous> (EditNotesScreen.kt:160)");
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$Lr9Y0vNLmEnrkx1virvHHPE7W2Q(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, kotlin.jvm.functions.Function1 function1) {
        if (bottomSheetController.getVisible()) {
            bottomSheetController.hideSheet();
        } else if (bottomSheetController2.getVisible()) {
            bottomSheetController2.hideSheet();
        } else if (editNotesUiState.getHasUnsavedChanges()) {
            bottomSheetController2.showSheet();
        } else {
            function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ExitForm.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SR4D8R9j9aXyc6ceehdCqIelkPI(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T8OuhGI0mf_4GtyJxAOMmz0daM0(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TCw4njGhoPfcgDjCqU6WEPx851s(boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        EditNotesTopBar(z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V77gI8XQwS7fLPK1WVhxSHeRNps(androidx.compose.foundation.ScrollState scrollState, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1926892550, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesLayout.<anonymous> (EditNotesScreen.kt:221)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), scrollState, false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError error = editNotesUiState.getError();
            if (error == null) {
                composer.startReplaceGroup(838768167);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(838768168);
                java.lang.String errorMessage = toErrorMessage(error, composer, 0);
                com.paypal.pds.components.BannerStyle.Negative negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                com.paypal.pds.components.BannerTrailingElement bannerTrailingElement = com.paypal.pds.components.BannerTrailingElement.Close;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, EditNotesScreenErrorBannerTestTag);
                com.paypal.pds.components.BannerStyle.Negative negative2 = negative;
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.$r8$lambda$BDBjXKZMzzdqyYxN7oOQybKDcks(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.BannerKt.Banner(testTag, negative2, errorMessage, (java.lang.String) null, bannerTrailingElement, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, composer, 24630, 40);
                composer.endReplaceGroup();
            }
            java.lang.String notes = editNotesUiState.getNotes();
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.m12841$r8$lambda$D8Y0_Gl4r_LoaDV_6d4RUSRBdA(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.EditNotesItem(notes, (kotlin.jvm.functions.Function1) rememberedValue2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, EditNotesScreenNotesSectionTestTag), composer, 384, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fRGpkQ2hb5naJGqlPspift5tB0c(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ExitForm.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hUeJLqqEA4lQ-LaYus1PaP88TUA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12842$r8$lambda$hUeJLqqEA4lQLaYus1PaP88TUA(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EditNotesLayout(editNotesUiState, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kx8lpR20meANg-Bb2uJWl_caquE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12843$r8$lambda$kx8lpR20meANgBb2uJWl_caquE(int i, androidx.compose.runtime.Composer composer, int i2) {
        EditNotesContentEditModePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tNCMF4TGMLV0Q7LZD1H9hBgJkPU(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState editNotesUiState, final kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1568500217, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesLayout.<anonymous> (EditNotesScreen.kt:177)");
            }
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, navigationBarsPadding);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_update_button, composer, 0);
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            boolean z = (editNotesUiState.isSubmitting() || editNotesUiState.isClearing()) ? false : true;
            boolean isSubmitting = editNotesUiState.isSubmitting();
            androidx.compose.ui.Modifier tracked = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.tracked(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), EditNotesScreenUpdateButtonTestTag), new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item("update_button", "customer_profile", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.UpdateCustomerNote, null, 8, null));
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.m12840$r8$lambda$6wtgMpmln99VC0lLZeMwo4Ekz8(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, tracked, null, null, null, large, z, isSubmitting, composer, 1572864, 56);
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_clear_button, composer, 0), com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.tracked(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), EditNotesScreenClearButtonTestTag), new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.EditCustomerNote.ClearNotesButton, "customer_profile", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.ClearCustomerNote, null, 8, null)), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, (editNotesUiState.isSubmitting() || editNotesUiState.isClearing()) ? false : true, editNotesUiState.isClearing(), composer, 1769472, 24);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u9ZE18S2PX2uwT2DYdoOIbte-GY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12844$r8$lambda$u9ZE18S2PX2uwT2DYdoOIbteGY(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        EditNotesScreen(editNotesViewModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zewVmQ9YzAKeaJ4tyu7IyBIsI1M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearNotesClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.NotesTooLong.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.UpdateFailed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.ClearFailed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
