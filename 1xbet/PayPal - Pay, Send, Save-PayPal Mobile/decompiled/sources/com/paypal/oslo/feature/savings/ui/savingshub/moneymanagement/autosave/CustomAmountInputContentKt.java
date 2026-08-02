package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002\u001a#\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002"}, d2 = {"MaxAmountInputLength", "", "MaxAmountLimit", "", "CustomAmountInputContent", "", "goalTitle", "", "initialAmount", "onBack", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "type", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/CustomAmountInputType;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/CustomAmountInputType;Landroidx/compose/runtime/Composer;II)V", "validateCustomAmount", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/CustomAmountValidationError;", "amount", "CustomAmountTopBar", "title", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "savings_prodRelease", "currentAmount", "Landroidx/compose/ui/text/input/TextFieldValue;", "validationError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CustomAmountInputContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void CustomAmountInputContent(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType customAmountInputType, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType customAmountInputType2;
        java.lang.String str3;
        int i4;
        final androidx.compose.runtime.MutableState mutableState;
        int i5;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1316974835);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(customAmountInputType == null ? -1 : customAmountInputType.ordinal()) ? 16384 : 8192;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            customAmountInputType2 = i6 != 0 ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType.MANAGE_AUTOSAVE : customAmountInputType;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1316974835, i7, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContent (CustomAmountInputContent.kt:79)");
            }
            java.lang.String str4 = str2;
            if (str4.length() == 0) {
                str4 = "0";
            }
            java.lang.String str5 = str4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(str5, androidx.compose.ui.text.TextRangeKt.TextRange(str5.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue2;
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError customAmountValidationError = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError) mutableState3.getValue();
            int i8 = customAmountValidationError == null ? -1 : com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.WhenMappings.$EnumSwitchMapping$1[customAmountValidationError.ordinal()];
            if (i8 != -1) {
                if (i8 == 1) {
                    startRestartGroup.startReplaceGroup(-528289248);
                    int i9 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.WhenMappings.$EnumSwitchMapping$0[customAmountInputType2.ordinal()];
                    if (i9 == 1) {
                        startRestartGroup.startReplaceGroup(-1402513009);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_please_enter_amount, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (i9 != 2) {
                            startRestartGroup.startReplaceGroup(-1402514910);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-1402509189);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_validation_minimum, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i8 != 2) {
                        startRestartGroup.startReplaceGroup(-1402517413);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1402503211);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_validation_maximum, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                str3 = stringResource2;
            } else {
                startRestartGroup.startReplaceGroup(-527846166);
                startRestartGroup.endReplaceGroup();
                str3 = null;
            }
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
            getHighSpeedVideoFpsRanges(str, function0, startRestartGroup, (i7 & 14) | ((i7 >> 3) & 112));
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.runtime.MutableState mutableState4 = mutableState2;
            java.lang.String text = ((androidx.compose.ui.text.input.TextFieldValue) mutableState4.getValue()).getText();
            com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(text.length() != 0 ? text : "0", "USD", null, com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact.INSTANCE, null, null, null, com.paypal.pds.core.Typography.DisplayLarge.INSTANCE, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, null, null, null, null, null, false, startRestartGroup, 113249328, 0, 32372);
            if (str3 != null) {
                startRestartGroup.startReplaceGroup(1942096476);
                i4 = 0;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(str3, null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 2);
                startRestartGroup.endReplaceGroup();
            } else {
                i4 = 0;
                startRestartGroup.startReplaceGroup(1942318467);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i4));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) mutableState4.getValue();
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState3;
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.$r8$lambda$12zt1Wro6jfSsWoptgUHDkSQv3A(androidx.compose.runtime.MutableState.this, mutableState, (androidx.compose.ui.text.input.TextFieldValue) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                mutableState = mutableState3;
            }
            final androidx.compose.runtime.MutableState mutableState5 = mutableState;
            com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) rememberedValue3, fillMaxWidth$default2, false, true, 7, startRestartGroup, 221616, 8);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            int i10 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.WhenMappings.$EnumSwitchMapping$0[customAmountInputType2.ordinal()];
            if (i10 != 1) {
                i5 = 2;
                if (i10 != 2) {
                    startRestartGroup.startReplaceGroup(1099851461);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1099856717);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_save, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                i5 = 2;
                startRestartGroup.startReplaceGroup(1099853411);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_done, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str6 = stringResource;
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, i5, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            boolean z = (i7 & 7168) == 2048;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.$r8$lambda$RGC91x3ZOKWalamPZsszXLHxYoo(kotlin.jvm.functions.Function1.this, mutableState2, mutableState5);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, str6, m1710paddingqDBjuR0$default, null, null, primary, large, true, false, startRestartGroup, 14352384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            customAmountInputType2 = customAmountInputType;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType customAmountInputType3 = customAmountInputType2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.m19048$r8$lambda$devqDrg0So8zELfiht_CuLpKjk(str, str2, function0, function1, customAmountInputType3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-236301355);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-236301355, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountTopBar (CustomAmountInputContent.kt:218)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-510518203, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.m19049$r8$lambda$xFkTP2mM4GdPI7vKqdpFmPCQhk(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, (i2 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.$r8$lambda$H3ebZejU8mJxM_mUqB_I1gLh8b8(str, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-devqDrg0So8zELfiht_CuLpKjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19048$r8$lambda$devqDrg0So8zELfiht_CuLpKjk(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType customAmountInputType, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomAmountInputContent(str, str2, function0, function1, customAmountInputType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$12zt1Wro6jfSsWoptgUHDkSQv3A(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        mutableState.setValue(textFieldValue);
        mutableState2.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H3ebZejU8mJxM_mUqB_I1gLh8b8(java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$RGC91x3ZOKWalamPZsszXLHxYoo(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError customAmountValidationError;
        androidx.compose.runtime.MutableState mutableState3 = mutableState;
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(((androidx.compose.ui.text.input.TextFieldValue) mutableState3.getValue()).getText());
        if (doubleOrNull == null || doubleOrNull.doubleValue() <= 0.0d) {
            customAmountValidationError = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError.getHighSpeedVideoFpsRanges;
        } else {
            customAmountValidationError = doubleOrNull.doubleValue() >= 100000.0d ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError.getHighResolutionOutputSizeshNQ4ISI : null;
        }
        mutableState2.setValue(customAmountValidationError);
        if (customAmountValidationError == null) {
            function1.invoke(((androidx.compose.ui.text.input.TextFieldValue) mutableState3.getValue()).getText());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xFkTP2mM4GdPI7-vKqdpFmPCQhk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19049$r8$lambda$xFkTP2mM4GdPI7vKqdpFmPCQhk(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-510518203, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountTopBar.<anonymous> (CustomAmountInputContent.kt:222)");
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType.CREATE_GOAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType.MANAGE_AUTOSAVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError.values().length];
            try {
                iArr2[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError.getHighSpeedVideoFpsRanges.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
