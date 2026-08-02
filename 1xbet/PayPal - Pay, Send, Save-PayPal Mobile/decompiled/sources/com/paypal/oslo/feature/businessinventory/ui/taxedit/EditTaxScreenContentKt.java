package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aw\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0006*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/State;", "state", "Lkotlin/Function0;", "", "onBackClick", "Lkotlin/Function1;", "", "onLabelChange", "onPercentageChange", "onSaveClick", "onDeleteClick", "onInfoButtonClick", "EditTaxScreenContent", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/State;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;)Lcom/paypal/pds/components/textinput/ValidationAlert;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError;Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "EditTaxScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "EditTaxScreenContentWithErrorsPreview", "EditTaxScreenNewTaxPreview", "EditTaxTopBarTestTag", "Ljava/lang/String;", "EditTaxNameFieldTestTag", "EditTaxPercentageFieldTestTag", "EditTaxSaveButtonTestTag", "EditTaxDeleteButtonTestTag", "EditTaxErrorBannerTestTag"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditTaxScreenContentKt {
    public static final java.lang.String EditTaxDeleteButtonTestTag = "EditTax_DeleteButton";
    public static final java.lang.String EditTaxErrorBannerTestTag = "EditTax_ErrorBanner";
    public static final java.lang.String EditTaxNameFieldTestTag = "EditTax_NameField";
    public static final java.lang.String EditTaxPercentageFieldTestTag = "EditTax_PercentageField";
    public static final java.lang.String EditTaxSaveButtonTestTag = "EditTax_SaveButton";
    public static final java.lang.String EditTaxTopBarTestTag = "EditTax_TopBar";

    public static final void EditTaxScreenContent(final com.paypal.oslo.feature.businessinventory.ui.taxedit.State state, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str;
        java.lang.String stringResource;
        int i3;
        java.lang.String stringResource2;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1711732357);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1711732357, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContent (EditTaxScreenContent.kt:79)");
            }
            com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode = state.getPresentationMode();
            if (kotlin.jvm.internal.Intrinsics.areEqual(presentationMode, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE)) {
                str = "view_taxes";
            } else {
                if (!(presentationMode instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "select_tax";
            }
            final java.lang.String str4 = str;
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
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, EditTaxTopBarTestTag);
            if (state.isNew()) {
                startRestartGroup.startReplaceGroup(-286028215);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_create_tax_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-285919157);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_edit_tax_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(stringResource, testTag, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1218665345, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.m13076$r8$lambda$68we73O00ezAe7Ps45mh51GmPw(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, 196656, 92);
            if (state.getErrorBanner() instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show) {
                startRestartGroup.startReplaceGroup(-285666321);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), EditTaxErrorBannerTestTag);
                com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction = ((com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show) state.getErrorBanner()).getFailedAction();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    i3 = 0;
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1084642534, 0, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.makeErrorBannerTitle (EditTaxScreenContent.kt:240)");
                } else {
                    i3 = 0;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(failedAction, com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1335582294);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_saving_form_failed, startRestartGroup, i3);
                    startRestartGroup.endReplaceGroup();
                } else if (failedAction instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save) {
                    startRestartGroup.startReplaceGroup(-1546487831);
                    int i4 = com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save) failedAction).getSaveError().ordinal()];
                    if (i4 == 1) {
                        startRestartGroup.startReplaceGroup(1335588722);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_item_library_saving_tax_failed, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (i4 != 2) {
                            startRestartGroup.startReplaceGroup(1335586617);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(1335594105);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_saving_tax_failed_taxes_exceeds_limit, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(failedAction, com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(1335581342);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1335599502);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_item_library_deleting_tax_failed, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str5 = stringResource2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction2 = ((com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show) state.getErrorBanner()).getFailedAction();
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError> validationErrors = state.getValidationErrors();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-746479512, 0, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.makeErrorBannerDescription (EditTaxScreenContent.kt:263)");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(failedAction2, com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation.INSTANCE) || (failedAction2 instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save)) {
                    startRestartGroup.startReplaceGroup(969721794);
                    startRestartGroup.startReplaceGroup(-107264691);
                    java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError> set = validationErrors;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
                    java.util.Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError) it.next(), startRestartGroup));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    startRestartGroup.endReplaceGroup();
                    if (arrayList2.isEmpty()) {
                        startRestartGroup.startReplaceGroup(969927262);
                        startRestartGroup.endReplaceGroup();
                        str2 = null;
                    } else {
                        startRestartGroup.startReplaceGroup(969841640);
                        java.util.ArrayList arrayList3 = arrayList2;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$yLWUwafPxIilUR0rjrfSLDZY848((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        str2 = kotlin.collections.CollectionsKt.joinToString$default(arrayList3, r25, null, null, 0, null, (kotlin.jvm.functions.Function1) rememberedValue, 30, null);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                    str3 = str2;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(failedAction2, com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(-107267605);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(969976117);
                    startRestartGroup.endReplaceGroup();
                    str3 = null;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                com.paypal.pds.components.BannerKt.Banner(testTag2, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, str5, str3, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 112);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-285131695);
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(783719988, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.m13083$r8$lambda$xBPqMfAE6y5n_ZOxE1W8jH3pzU(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.this, str4, function02, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-217335883, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$HhN_7gwTykb_yT3JbN6b7g0uFhE(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.this, function1, function12, str4, function04, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, 27654, 6);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$O1ZIAmK0qMa2ERIO_bDVnlQ9KZQ(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.this, function0, function1, function12, function02, function03, function04, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final com.paypal.pds.components.textinput.ValidationAlert Camera2StreamConfigurationMap(final java.lang.String str, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-854100924, 0, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.toValidationAlert (EditTaxScreenContent.kt:278)");
        }
        com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
        boolean changed = composer.changed(str);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$ADLQn7BpO0A9H9QWld5XUft1k7Q(str, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.textinput.ValidationAlert invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return invoke;
    }

    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError taxFieldValidationError, androidx.compose.runtime.Composer composer) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(53882396, 0, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.toValidationErrorMessage (EditTaxScreenContent.kt:287)");
        }
        if (taxFieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.Missing) {
            composer.startReplaceGroup(241379439);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_name_validation_error_empty, composer, 0);
            composer.endReplaceGroup();
        } else if (taxFieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.TooLong) {
            composer.startReplaceGroup(241383986);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_name_validation_error_too_long, composer, 0);
            composer.endReplaceGroup();
        } else if (taxFieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.ContainsLink) {
            composer.startReplaceGroup(241388782);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_name_validation_error_link, composer, 0);
            composer.endReplaceGroup();
        } else if (taxFieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.NotUnique) {
            composer.startReplaceGroup(241393363);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_name_validation_error_duplicate, composer, 0);
            composer.endReplaceGroup();
        } else if (taxFieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError.Missing) {
            composer.startReplaceGroup(241398005);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_percentage_validation_error_empty, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(241377826);
            composer.endReplaceGroup();
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final void EditTaxScreenContentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-598673746);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-598673746, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentPreview (EditTaxScreenContent.kt:306)");
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.State state = new com.paypal.oslo.feature.businessinventory.ui.taxedit.State(new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel("tax_id_1", "State tax", "8.5"), new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel("", "", ""), false, kotlin.collections.SetsKt.emptySet(), com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$JHsZMfLzONBhfNJgdViydvVzgt0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.m13080$r8$lambda$e4tFa2hU33piGQ8ZA2KgVBm7bQ((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            EditTaxScreenContent(state, function0, function1, function12, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 1797552);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$C_zeE9NPzVQpMVtwvTJwlf90p6A(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditTaxScreenContentWithErrorsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1528238691);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1528238691, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentWithErrorsPreview (EditTaxScreenContent.kt:338)");
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.State state = new com.paypal.oslo.feature.businessinventory.ui.taxedit.State(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE, new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel("tax_id_1", "", ""), new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel("", "", ""), false, kotlin.collections.SetsKt.setOf(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.Missing, com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError.Missing), new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation.INSTANCE), com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$pBE9yVS41W0xu4hZoyZ7mjaYxAs((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$bUgyDGvnopOiaVjaFreLTrru89s((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            EditTaxScreenContent(state, function0, function1, function12, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 1797552);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$M36AnfkAp41JyPR5LVuf4YeKWWw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EditTaxScreenNewTaxPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1446974238);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1446974238, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenNewTaxPreview (EditTaxScreenContent.kt:375)");
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.State state = new com.paypal.oslo.feature.businessinventory.ui.taxedit.State(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE, new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel("", "", ""), new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel("", "", ""), true, kotlin.collections.SetsKt.emptySet(), com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$yu3Zvnscz67bcpkEkj3dewop75k((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$peemTVccnVs7gsWaReDa4yvaahU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            EditTaxScreenContent(state, function0, function1, function12, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 1797552);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContentKt.$r8$lambda$qrSspVeu6oSNCdfw5GqN0YWm2FY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$68we7-3O00ezAe7Ps45mh51GmPw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13076$r8$lambda$68we73O00ezAe7Ps45mh51GmPw(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1218665345, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContent.<anonymous>.<anonymous> (EditTaxScreenContent.kt:97)");
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

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$ADLQn7BpO0A9H9QWld5XUft1k7Q(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, true, null, null, 24, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C_zeE9NPzVQpMVtwvTJwlf90p6A(int i, androidx.compose.runtime.Composer composer, int i2) {
        EditTaxScreenContentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HhN_7gwTykb_yT3JbN6b7g0uFhE(com.paypal.oslo.feature.businessinventory.ui.taxedit.State state, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-217335883, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContent.<anonymous>.<anonymous> (EditTaxScreenContent.kt:167)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            boolean changed = composer.changed(state.getValidationErrors());
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError> validationErrors = state.getValidationErrors();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : validationErrors) {
                    if (obj instanceof com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError) {
                        arrayList.add(obj);
                    }
                }
                rememberedValue = kotlin.collections.CollectionsKt.sorted(arrayList);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), EditTaxNameFieldTestTag);
            java.lang.String label = state.getTax().getLabel();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_add_new_name_hint, composer, 0);
            composer.startReplaceGroup(1711948336);
            java.util.List list = (java.util.List) rememberedValue;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError) it.next(), composer), composer));
            }
            composer.endReplaceGroup();
            com.paypal.pds.components.TextInputKt.TextInput(label, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) arrayList2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 48, 112624);
            boolean changed2 = composer.changed(state.getValidationErrors());
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError> validationErrors2 = state.getValidationErrors();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : validationErrors2) {
                    if (obj2 instanceof com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError) {
                        arrayList3.add(obj2);
                    }
                }
                rememberedValue2 = kotlin.collections.CollectionsKt.sorted(arrayList3);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), EditTaxPercentageFieldTestTag);
            java.lang.String percentage = state.getTax().getPercentage();
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_add_new_tax_rate_hint, composer, 0);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8266getDecimalPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            composer.startReplaceGroup(1711978192);
            java.util.List list2 = (java.util.List) rememberedValue2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError) it2.next(), composer), composer));
            }
            composer.endReplaceGroup();
            com.paypal.pds.components.TextInputKt.TextInput(percentage, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function12, testTag2, stringResource2, (java.lang.String) null, "%", false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) arrayList4, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 100860288, 48, 112336);
            androidx.compose.ui.Modifier businessFlow$default = com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.businessFlow$default(com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ItemName.SalesTaxResponsibilityLink, 0, 2, null)), "tax_list", com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.ViewSalesTaxResponsibility), str, null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, businessFlow$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Information.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 24630, 12);
            com.paypal.pds.components.LinkKt.Link(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_sales_tax_is_your_responsibility_warning_button_text, composer, 0), null, function0, com.paypal.pds.components.LinkSize.Medium.INSTANCE, composer, com.paypal.pds.components.LinkSize.Medium.$stable << 9, 2);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JHsZMfLzONBhfNJgdViydvVzgt0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M36AnfkAp41JyPR5LVuf4YeKWWw(int i, androidx.compose.runtime.Composer composer, int i2) {
        EditTaxScreenContentWithErrorsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O1ZIAmK0qMa2ERIO_bDVnlQ9KZQ(com.paypal.oslo.feature.businessinventory.ui.taxedit.State state, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, androidx.compose.runtime.Composer composer, int i2) {
        EditTaxScreenContent(state, function0, function1, function12, function02, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bUgyDGvnopOiaVjaFreLTrru89s(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e4tFa2hU3-3piGQ8ZA2KgVBm7bQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13080$r8$lambda$e4tFa2hU33piGQ8ZA2KgVBm7bQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pBE9yVS41W0xu4hZoyZ7mjaYxAs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$peemTVccnVs7gsWaReDa4yvaahU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qrSspVeu6oSNCdfw5GqN0YWm2FY(int i, androidx.compose.runtime.Composer composer, int i2) {
        EditTaxScreenNewTaxPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xBPqMfAE6y5n_ZOxE1W8jH3-pzU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13083$r8$lambda$xBPqMfAE6y5n_ZOxE1W8jH3pzU(com.paypal.oslo.feature.businessinventory.ui.taxedit.State state, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(783719988, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenContent.<anonymous>.<anonymous> (EditTaxScreenContent.kt:119)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode = state.getPresentationMode();
            if (kotlin.jvm.internal.Intrinsics.areEqual(presentationMode, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE)) {
                i2 = com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_save_button;
            } else {
                if (!(presentationMode instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i2 = com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_tax_save_and_apply_button;
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(i2, composer, 0), com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.businessFlow$default(com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), EditTaxSaveButtonTestTag), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("save_button", 0, 2, null)), "tax_list", "save_tax"), str, null, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, state.getLoadingState() == com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.Saving, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            if (state.isNew()) {
                composer.startReplaceGroup(-265130088);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-266024500);
                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_delete, composer, 0), com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.businessFlow$default(com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), EditTaxDeleteButtonTestTag), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ItemName.DeleteButton, 0, 2, null)), "tax_list", com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.DeleteTax), str, null, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, state.getLoadingState() == com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.Deleting, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$yLWUwafPxIilUR0rjrfSLDZY848(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "  • ".concat(java.lang.String.valueOf(str));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yu3Zvnscz67bcpkEkj3dewop75k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.values().length];
            try {
                iArr[com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.General.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.TooManyTaxes.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
