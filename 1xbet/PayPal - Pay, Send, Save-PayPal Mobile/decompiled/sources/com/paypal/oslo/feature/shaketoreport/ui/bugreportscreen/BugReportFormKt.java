package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormData;", "formData", "Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormCallbacks;", "callbacks", "Landroidx/compose/foundation/ScrollState;", "scrollState", "", "BugReportForm", "(Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormData;Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormCallbacks;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportFormKt {
    public static final void BugReportForm(final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormData bugReportFormData, final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormCallbacks bugReportFormCallbacks, final androidx.compose.foundation.ScrollState scrollState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        com.paypal.pds.core.Color.ContentRoleBaseWarning contentRoleBaseWarning;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugReportFormData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugReportFormCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(524294254);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(bugReportFormData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(bugReportFormCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(scrollState) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(524294254, i2, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportForm (BugReportForm.kt:93)");
            }
            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)), scrollState, false, null, false, 14, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, imePadding);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_screen_title, startRestartGroup, 0), columnScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 384, 6, 1000);
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f));
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (bugReportFormData.isScreenshotAdded()) {
                i3 = com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_screenshot_attached;
            } else {
                i3 = com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_screenshot_not_attached;
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, startRestartGroup, 0);
            com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
            if (bugReportFormData.isScreenshotAdded()) {
                contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE;
            } else {
                contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), contentRoleBaseWarning, null, null, null, false, 0, 0, null, bodyMedium, startRestartGroup, 0, 6, 1016);
            if (bugReportFormData.isScreenshotAdded()) {
                startRestartGroup.startReplaceGroup(-818249652);
                com.paypal.pds.components.ButtonKt.Button(bugReportFormCallbacks.getOnViewScreenshot(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_screenshot_view, startRestartGroup, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, !bugReportFormData.isLoading(), false, startRestartGroup, 1769472, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-817926322);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FormFieldsKt.FrequencyField(bugReportFormData.getSelectedFrequency(), bugReportFormData.isLoading(), bugReportFormCallbacks.getOnFrequencyClick(), startRestartGroup, 0);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FormFieldsKt.TitleField(bugReportFormData.getTitle(), bugReportFormData.isLoading(), bugReportFormCallbacks.getOnTitleChange(), startRestartGroup, 0);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FormFieldsKt.StepsField(bugReportFormData.getStepsToReproduce(), bugReportFormData.isLoading(), bugReportFormCallbacks.getOnStepsChange(), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FormFieldsKt.EmployeeEmailField(bugReportFormData.getEmployeeEmail(), bugReportFormData.isLoading(), bugReportFormData.isEmailValid(), bugReportFormCallbacks.getOnEmployeeEmailChange(), startRestartGroup, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FormFieldsKt.SubmitButton(bugReportFormData.isLoading(), bugReportFormData.isSubmitEnabled(), bugReportFormCallbacks.getOnSubmit(), composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormKt.$r8$lambda$_f84MPLxcGVk5lxTWcd6aWIlLNo(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormData.this, bugReportFormCallbacks, scrollState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_f84MPLxcGVk5lxTWcd6aWIlLNo(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormData bugReportFormData, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormCallbacks bugReportFormCallbacks, androidx.compose.foundation.ScrollState scrollState, int i, androidx.compose.runtime.Composer composer, int i2) {
        BugReportForm(bugReportFormData, bugReportFormCallbacks, scrollState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
