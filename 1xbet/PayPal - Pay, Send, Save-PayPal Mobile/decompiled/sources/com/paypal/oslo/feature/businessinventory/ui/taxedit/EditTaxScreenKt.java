package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"EditTaxScreen", "", "viewModel", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/EditTaxViewModel;", "onNavigateBack", "Lkotlin/Function0;", "onNavigateBackWithResult", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/EditTaxViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "makeNavigateBackMaybe", "currentTax", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/TaxUiModel;", "initialTax", "dismissConfirmationModalController", "Lcom/paypal/pds/components/BottomSheetController;", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/TaxUiModel;Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/TaxUiModel;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "DeleteConfirmationModal", "controller", "onConfirmDeleteClick", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DismissConfirmationModal", "isNewTax", "", "onConfirmDismissClick", "(ZLcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TaxInformationModal", "(Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/Composer;I)V", "business-inventory_prodRelease", "state", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditTaxScreenKt {
    public static final void EditTaxScreen(final com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editTaxViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1810411410);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(editTaxViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1810411410, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreen (EditTaxScreen.kt:31)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(editTaxViewModel.getState(), null, startRestartGroup, 0, 1);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController3 = (com.paypal.pds.components.BottomSheetController) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.BottomSheetController[]{bottomSheetController, bottomSheetController2, bottomSheetController3});
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final java.util.List list = (java.util.List) rememberedValue4;
            final com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel tax = ((com.paypal.oslo.feature.businessinventory.ui.taxedit.State) collectAsState.getValue()).getTax();
            final com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel initialTax = ((com.paypal.oslo.feature.businessinventory.ui.taxedit.State) collectAsState.getValue()).getInitialTax();
            int i4 = (com.paypal.pds.components.BottomSheetController.$stable << 6) | ((i3 << 6) & 7168);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-37007069, i4, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.makeNavigateBackMaybe (EditTaxScreen.kt:109)");
            }
            boolean z = (((i4 & 14) ^ 6) > 4 && startRestartGroup.changed(tax)) || (i4 & 6) == 4;
            boolean z2 = (((i4 & 112) ^ 48) > 32 && startRestartGroup.changed(initialTax)) || (i4 & 48) == 32;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$pKwSYMgPCGP8bn9MiOMHJu3hyHw(com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel.this, initialTax, bottomSheetController2, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean changed = startRestartGroup.changed(function02);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$OpZzCsKlTjNNwK9FvX6_p1U3_Q0(list, function02);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0, 1);
            boolean changedInstance2 = startRestartGroup.changedInstance(editTaxViewModel);
            boolean z3 = (i3 & 112) == 32;
            boolean z4 = (i3 & 896) == 256;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z3 | z4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$EditTaxScreen$2$1(editTaxViewModel, function0, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(editTaxViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, startRestartGroup, i3 & 14);
            com.paypal.oslo.feature.businessinventory.ui.taxedit.State state = (com.paypal.oslo.feature.businessinventory.ui.taxedit.State) collectAsState.getValue();
            boolean changedInstance3 = startRestartGroup.changedInstance(editTaxViewModel);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.m13086$r8$lambda$KgOaiEG7pW0ojOrM8sJgsbIUas(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue8;
            boolean changedInstance4 = startRestartGroup.changedInstance(editTaxViewModel);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$LNdEVJu6DChhDhyYKN4PuB26_JU(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue9;
            boolean changedInstance5 = startRestartGroup.changedInstance(editTaxViewModel);
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$szYGF6SIM6VwrCOjiN9nBrlMp2U(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue10;
            boolean changedInstance6 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$7U1zrP1IQ33fRKoy1KPZ7hkjmbo(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue11;
            boolean changedInstance7 = startRestartGroup.changedInstance(bottomSheetController3);
            java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance7 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.m13089$r8$lambda$o9yRt_ibY_bxo9PzGovYC6O5wQ(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.EditTaxScreenContent(state, function02, function12, function13, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue12, startRestartGroup, 0);
            boolean changedInstance8 = startRestartGroup.changedInstance(editTaxViewModel);
            java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$NbM91FbVESYE2NYqChIKpCg0vvQ(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            getHighSpeedVideoFpsRanges(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue13, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
            getHighSpeedVideoSizes(((com.paypal.oslo.feature.businessinventory.ui.taxedit.State) collectAsState.getValue()).isNew(), bottomSheetController2, function0, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | ((i3 << 3) & 896));
            getHighSpeedVideoFpsRangesFor(bottomSheetController3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.m13085$r8$lambda$GVzquUmVASINfnPR65SDOd7FnU(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1535358272);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1535358272, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.DeleteConfirmationModal (EditTaxScreen.kt:123)");
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.ConfirmationModalKt.ConfirmationModal(bottomSheetController, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_delete_tax_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_delete_tax_message, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_delete, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_cancel, startRestartGroup, 0), function0, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (i2 & 14) | ((i2 << 12) & 458752), 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.$r8$lambda$WUqmG1lg9uScAmUSFyVzHGO_kEM(com.paypal.pds.components.BottomSheetController.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final boolean z, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(55768761);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(55768761, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.DismissConfirmationModal (EditTaxScreen.kt:139)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-745017509);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_dismiss_tax_edit_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-744902716);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_dismiss_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str = stringResource;
            if (z) {
                startRestartGroup.startReplaceGroup(-744768455);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_dismiss_tax_edit_message, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-744651678);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_dismiss_message, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.ConfirmationModalKt.ConfirmationModal(bottomSheetController, str, stringResource2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_confirmation_dialog_dismiss_button_text, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_cancel, startRestartGroup, 0), function0, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | ((i2 >> 3) & 14) | ((i2 << 9) & 458752), 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.m13088$r8$lambda$_g4tfG2uvo6e76VVqSt7cxoTV0(z, bottomSheetController, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-762844973);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-762844973, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxInformationModal (EditTaxScreen.kt:165)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_information_title, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_information_message, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_information_button_text, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.ConfirmationModalKt.ConfirmationModal(bottomSheetController, stringResource, stringResource2, stringResource3, null, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 221184 | (i2 & 14), 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.m13087$r8$lambda$VkBYdPn1FvzIyDUVLbUufSNfnQ(com.paypal.pds.components.BottomSheetController.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7U1zrP1IQ33fRKoy1KPZ7hkjmbo(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GVzquUmVA-SINfnPR65SDOd7FnU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13085$r8$lambda$GVzquUmVASINfnPR65SDOd7FnU(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        EditTaxScreen(editTaxViewModel, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KgOaiEG7pW0ojOrM8sJgsbIU-as, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13086$r8$lambda$KgOaiEG7pW0ojOrM8sJgsbIUas(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        editTaxViewModel.publishEvent(new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LNdEVJu6DChhDhyYKN4PuB26_JU(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        editTaxViewModel.publishEvent(new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NbM91FbVESYE2NYqChIKpCg0vvQ(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel) {
        editTaxViewModel.publishEvent(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.DeleteTaxConfirmed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OpZzCsKlTjNNwK9FvX6_p1U3_Q0(java.util.List list, kotlin.jvm.functions.Function0 function0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.paypal.pds.components.BottomSheetController) obj).getVisible()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            function0.invoke();
        } else {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((com.paypal.pds.components.BottomSheetController) it.next()).hideSheet();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VkBYdPn1-FvzIyDUVLbUufSNfnQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13087$r8$lambda$VkBYdPn1FvzIyDUVLbUufSNfnQ(com.paypal.pds.components.BottomSheetController bottomSheetController, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(bottomSheetController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WUqmG1lg9uScAmUSFyVzHGO_kEM(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(bottomSheetController, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_g4tfG2uvo6e7-6VVqSt7cxoTV0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13088$r8$lambda$_g4tfG2uvo6e76VVqSt7cxoTV0(boolean z, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(z, bottomSheetController, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o9yRt_ibY_bxo9Pz-GovYC6O5wQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13089$r8$lambda$o9yRt_ibY_bxo9PzGovYC6O5wQ(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pKwSYMgPCGP8bn9MiOMHJu3hyHw(com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel, com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel2, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(taxUiModel, taxUiModel2)) {
            bottomSheetController.showSheet();
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$szYGF6SIM6VwrCOjiN9nBrlMp2U(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel) {
        editTaxViewModel.publishEvent(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.SaveClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
