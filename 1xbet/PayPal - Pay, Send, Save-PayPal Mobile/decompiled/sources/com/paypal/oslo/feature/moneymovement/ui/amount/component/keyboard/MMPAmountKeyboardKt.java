package com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"MMPAmountKeyboard", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/input/TextFieldValue;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "preselectedAmountValues", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "selectedChipAmount", "onValueChange", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;Landroidx/compose/ui/text/input/TextFieldValue;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MMPAmountKeyboardWithQuickAmountsPreview", "(Landroidx/compose/runtime/Composer;I)V", "MMPAmountKeyboardWithoutQuickAmountsAndDecimalPreview", "MMPAmountKeyboardWithSelectedChipPreview", "money-movement_prodRelease", "textFieldValue"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MMPAmountKeyboardKt {
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MMPAmountKeyboard(final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount> list, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount> list2;
        final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        float f;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1053407404);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(keyboardConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(keyboardCallbacks) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(moneyAmount) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        list2 = list;
                        moneyAmount2 = moneyAmount;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount> emptyList = i4 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount3 = i5 != 0 ? null : moneyAmount;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1053407404, i6, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboard (MMPAmountKeyboard.kt:67)");
                        }
                        final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_keyboard_description, startRestartGroup, 0);
                        androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                        boolean changed = startRestartGroup.changed(stringResource);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.$r8$lambda$69IkiRUx_LlIN6B6nPkBChQXgfo(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(background, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), "mmp_amount_keyboard");
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
                        if (keyboardConfig.getShowPreselectedAmountChips() && !emptyList.isEmpty()) {
                            startRestartGroup.startReplaceGroup(-1396168205);
                            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData(textFieldValue.getText(), false, emptyList, moneyAmount3, null, null, 50, null);
                            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), "mmp_preselected_amounts");
                            boolean isEnabled = keyboardConfig.isEnabled();
                            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> formattedAmount = keyboardCallbacks.getFormattedAmount();
                            boolean z2 = (i6 & 3670016) == 1048576;
                            boolean z3 = (i6 & 896) == 256;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if ((z2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.$r8$lambda$RAap2qS_7CeHx_oMJexHwG20ogc(kotlin.jvm.functions.Function1.this, keyboardCallbacks, (java.lang.String) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            f = 0.0f;
                            z = false;
                            i7 = i6;
                            com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.MMPPreselectedAmounts(keyboardData, testTag2, isEnabled, formattedAmount, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            i7 = i6;
                            f = 0.0f;
                            z = false;
                            startRestartGroup.startReplaceGroup(-1395263904);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), "mmp_numpad");
                        boolean showDecimalKey = keyboardConfig.getShowDecimalKey();
                        int maxInputLength = keyboardConfig.getMaxInputLength();
                        boolean isEnabled2 = keyboardConfig.isEnabled();
                        int i9 = i7;
                        boolean z4 = (i9 & 3670016) == 1048576 ? true : z;
                        if ((i9 & 896) == 256) {
                            z = true;
                        }
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z4 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.$r8$lambda$BzeLejy0ruASnP_MeNa6aCz8BpA(kotlin.jvm.functions.Function1.this, keyboardCallbacks, (androidx.compose.ui.text.input.TextFieldValue) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) rememberedValue3, testTag3, isEnabled2, showDecimalKey, maxInputLength, startRestartGroup, ((i9 >> 3) & 14) | 384, 0);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        list2 = emptyList;
                        moneyAmount2 = moneyAmount3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.m15645$r8$lambda$J5_k3rk7CADqFu5VfKicckhuR0(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.this, textFieldValue, keyboardCallbacks, modifier2, list2, moneyAmount2, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((1572864 & i) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MMPAmountKeyboard(final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1063046828);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(keyboardConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(keyboardData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(keyboardCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1063046828, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboard (MMPAmountKeyboard.kt:136)");
                }
                boolean changed = startRestartGroup.changed(keyboardData.getCurrentInput());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(keyboardData.getCurrentInput(), androidx.compose.ui.text.TextRangeKt.TextRange(keyboardData.getCurrentInput().length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue();
                java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount> preselectedAmountValues = keyboardData.getPreselectedAmountValues();
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount selectedChipAmount = keyboardData.getSelectedChipAmount();
                boolean changed2 = startRestartGroup.changed(mutableState);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.m15642$r8$lambda$X73e2A5tO0xtcaTiJGAE7oVE4(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.text.input.TextFieldValue) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MMPAmountKeyboard(keyboardConfig, textFieldValue, keyboardCallbacks, modifier3, preselectedAmountValues, selectedChipAmount, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, i3 & 8078, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.m15644$r8$lambda$HD_iCQqV9kGlkggn38QWvRQys(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.this, keyboardData, keyboardCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-X73e2A5tO0xt-caTiJGAE7oVE4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15642$r8$lambda$X73e2A5tO0xtcaTiJGAE7oVE4(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        mutableState.setValue(textFieldValue);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2R8O8D3cqFOKggTL2mnXrDBQX10(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-948006490);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-948006490, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardWithQuickAmountsPreview (MMPAmountKeyboard.kt:165)");
            }
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(true, true, 0, false, 12, null);
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData("0", false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount[]{com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "10"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "50"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "100")}), null, null, null, 58, null);
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion companion = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.$r8$lambda$CejmHLXfGn_iJpWOoxhkbGhh_no((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MMPAmountKeyboard(keyboardConfig, keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.create$default(companion, null, null, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue, null, 95, null), null, startRestartGroup, 6, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.$r8$lambda$2R8O8D3cqFOKggTL2mnXrDBQX10(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$69IkiRUx_LlIN6B6nPkBChQXgfo(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BH2ujDmGwr3V9mSXl3eRQj-cIE4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15643$r8$lambda$BH2ujDmGwr3V9mSXl3eRQjcIE4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1540631520);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1540631520, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardWithoutQuickAmountsAndDecimalPreview (MMPAmountKeyboard.kt:190)");
            }
            MMPAmountKeyboard(new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(false, false, 0, false, 12, null), new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData("0", false, kotlin.collections.CollectionsKt.emptyList(), null, null, null, 58, null), com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.create$default(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.INSTANCE, null, null, null, null, null, null, null, 127, null), null, startRestartGroup, 54, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.m15643$r8$lambda$BH2ujDmGwr3V9mSXl3eRQjcIE4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BzeLejy0ruASnP_MeNa6aCz8BpA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        function1.invoke(textFieldValue);
        keyboardCallbacks.getOnAmountChange().invoke(textFieldValue.getText());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$CejmHLXfGn_iJpWOoxhkbGhh_no(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(fiat != null ? fiat.getQuantity() : null));
    }

    /* renamed from: $r8$lambda$HD-_iCQqV9kGlkggn38-QWvRQys, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15644$r8$lambda$HD_iCQqV9kGlkggn38QWvRQys(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MMPAmountKeyboard(keyboardConfig, keyboardData, keyboardCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$J5_k3rk7CADqFu5-VfKicckhuR0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15645$r8$lambda$J5_k3rk7CADqFu5VfKicckhuR0(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, androidx.compose.ui.text.input.TextFieldValue textFieldValue, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, androidx.compose.ui.Modifier modifier, java.util.List list, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MMPAmountKeyboard(keyboardConfig, textFieldValue, keyboardCallbacks, modifier, list, moneyAmount, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RAap2qS_7CeHx_oMJexHwG20ogc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new androidx.compose.ui.text.input.TextFieldValue(str, androidx.compose.ui.text.TextRangeKt.TextRange(str.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        keyboardCallbacks.getOnAmountChange().invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ueknH7OD5lxNxahF9H6f-1HuMmE, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15646$r8$lambda$ueknH7OD5lxNxahF9H6f1HuMmE(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(fiat != null ? fiat.getQuantity() : null));
    }

    /* renamed from: $r8$lambda$vR-PP2p1hYOtz_tJl8I2S5EYV7c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15647$r8$lambda$vRPP2p1hYOtz_tJl8I2S5EYV7c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1471978753);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1471978753, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardWithSelectedChipPreview (MMPAmountKeyboard.kt:208)");
            }
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(true, true, 0, false, 12, null);
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData("25", false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount[]{com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "10"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "50"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "100")}), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25"), null, null, 50, null);
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion companion = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.m15646$r8$lambda$ueknH7OD5lxNxahF9H6f1HuMmE((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MMPAmountKeyboard(keyboardConfig, keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.create$default(companion, null, null, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue, null, 95, null), null, startRestartGroup, 6, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.m15647$r8$lambda$vRPP2p1hYOtz_tJl8I2S5EYV7c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
