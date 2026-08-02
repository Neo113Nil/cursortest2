package com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"AmountInput", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "fieldState", "Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;Landroidx/compose/runtime/Composer;II)V", "AmountInputContent", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SharedStateAmountInputContent", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease", "textFieldValueState", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmountInputKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountInput(final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-594808455);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(amountInputConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(amountInputData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(amountInputCallbacks) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                amountFieldState2 = amountFieldState;
                i3 |= startRestartGroup.changed(amountFieldState2) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState3 = i4 != 0 ? null : amountFieldState2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-594808455, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInput (AmountInput.kt:57)");
                    }
                    if (!amountInputConfig.isEditable()) {
                        startRestartGroup.startReplaceGroup(1096967626);
                        if (amountFieldState3 != null) {
                            startRestartGroup.startReplaceGroup(1096997541);
                            int i6 = i3 >> 3;
                            int i7 = i3 << 3;
                            getHighSpeedVideoFpsRangesFor(amountInputData, amountInputConfig, amountInputCallbacks, amountFieldState3, modifier4, startRestartGroup, (i6 & 14) | (i7 & 112) | (i3 & 896) | (i6 & 7168) | (57344 & i7), 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1097101980);
                            getHighResolutionOutputSizeshNQ4ISI(amountInputData, amountInputConfig, amountInputCallbacks, modifier4, startRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), 0);
                            startRestartGroup.endReplaceGroup();
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(1096609762);
                        com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$AmountInput$1$1 rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$AmountInput$1$1.getHighSpeedVideoFpsRanges;
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState4 = amountFieldState3;
                        final androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.InterceptPlatformTextInput((androidx.compose.ui.platform.PlatformTextInputInterceptor) rememberedValue, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1625242774, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.m15630$r8$lambda$ZgLpHQ7tmJ546jUs90uUUJlpjI(com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState.this, amountInputData, amountInputConfig, amountInputCallbacks, modifier5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 48);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    amountFieldState2 = amountFieldState3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.m15631$r8$lambda$_mX_wWSvK6haUxmlgYIvzljYYU(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig.this, amountInputData, amountInputCallbacks, modifier3, amountFieldState2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            amountFieldState2 = amountFieldState;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        amountFieldState2 = amountFieldState;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1 function1;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-167376627);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(amountInputData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(amountInputConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(amountInputCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-167376627, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputContent (AmountInput.kt:95)");
                }
                java.lang.String symbol = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getSymbol(amountInputData.getAmount());
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_amount_input_label, new java.lang.Object[]{symbol}, startRestartGroup, 0);
                final java.lang.String quantity = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(amountInputData.getAmount());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(quantity, androidx.compose.ui.text.TextRangeKt.TextRange(quantity.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                androidx.compose.runtime.MutableState mutableState2 = mutableState;
                mutableState.setValue(com.paypal.oslo.feature.moneymovement.ui.shared.utils.TextFieldValueExtensionsKt.withSyncedText((androidx.compose.ui.text.input.TextFieldValue) mutableState2.getValue(), quantity));
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.$r8$lambda$mwQRp6aLGATrVXpCOxbrUMegjoc(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
                androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) mutableState2.getValue();
                com.paypal.oslo.core.commonui.components.AmountDisplayStyle.DynamicCompact dynamicCompact = com.paypal.oslo.core.commonui.components.AmountDisplayStyle.DynamicCompact.INSTANCE;
                boolean autoFocus = amountInputConfig.getAutoFocus();
                boolean showCurrencySymbol = amountInputConfig.getShowCurrencySymbol();
                java.lang.String errorMessage = amountInputData.getErrorMessage();
                if (amountInputConfig.isEditable()) {
                    startRestartGroup.startReplaceGroup(141196130);
                    boolean z = (i3 & 896) == 256;
                    boolean changed2 = startRestartGroup.changed(quantity);
                    boolean z2 = (i3 & 14) == 4;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z | changed2 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.$r8$lambda$rR3mq_T2WTAaQuwtGF7sdRI05t0(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks.this, quantity, amountInputData, mutableState, (androidx.compose.ui.text.input.TextFieldValue) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(141651737);
                    startRestartGroup.endReplaceGroup();
                    function1 = null;
                }
                androidx.compose.ui.Modifier modifier4 = companion;
                com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(textFieldValue, symbol, semantics$default, function1, dynamicCompact, null, autoFocus, null, null, null, null, null, null, null, null, errorMessage, showCurrencySymbol, startRestartGroup, 24576, 0, 32672);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.$r8$lambda$9JAqtu1L0HNJ_v0EHSwArBNpRwQ(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData.this, amountInputConfig, amountInputCallbacks, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1 function1;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1719741718);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(amountInputData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(amountInputConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(amountInputCallbacks) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(amountFieldState) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1719741718, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.SharedStateAmountInputContent (AmountInput.kt:160)");
                }
                java.lang.String symbol = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getSymbol(amountInputData.getAmount());
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_amount_input_label, new java.lang.Object[]{symbol}, startRestartGroup, 0);
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.$r8$lambda$SoxT0rqJiiLg3H12vuadppaEEJE(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                androidx.compose.ui.text.input.TextFieldValue textFieldValue = amountFieldState.getTextFieldValue();
                com.paypal.oslo.core.commonui.components.AmountDisplayStyle.DynamicCompact dynamicCompact = com.paypal.oslo.core.commonui.components.AmountDisplayStyle.DynamicCompact.INSTANCE;
                boolean autoFocus = amountInputConfig.getAutoFocus();
                boolean showCurrencySymbol = amountInputConfig.getShowCurrencySymbol();
                java.lang.String errorMessage = amountInputData.getErrorMessage();
                if (!amountInputConfig.isEditable()) {
                    startRestartGroup.startReplaceGroup(1840636572);
                    startRestartGroup.endReplaceGroup();
                    function1 = null;
                } else {
                    startRestartGroup.startReplaceGroup(1840160784);
                    boolean z = (i3 & 7168) == 2048;
                    boolean z2 = (i3 & 896) == 256;
                    boolean z3 = (i3 & 14) == 4;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | z2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.$r8$lambda$CJ9Jd8Okmh07wKKY_gpUFjnDjmg(com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState.this, amountInputCallbacks, amountInputData, (androidx.compose.ui.text.input.TextFieldValue) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                }
                modifier3 = companion;
                com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(textFieldValue, symbol, semantics$default, function1, dynamicCompact, null, autoFocus, null, null, null, null, null, null, null, null, errorMessage, showCurrencySymbol, startRestartGroup, 24576, 0, 32672);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.$r8$lambda$5i4x2ntJw3cY1xNWxZJv881OU_M(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData.this, amountInputConfig, amountInputCallbacks, amountFieldState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5i4x2ntJw3cY1xNWxZJv881OU_M(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(amountInputData, amountInputConfig, amountInputCallbacks, amountFieldState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9JAqtu1L0HNJ_v0EHSwArBNpRwQ(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(amountInputData, amountInputConfig, amountInputCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CJ9Jd8Okmh07wKKY_gpUFjnDjmg(com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        amountFieldState.update(textFieldValue);
        amountInputCallbacks.onTextFieldValueChange(amountFieldState.getTextFieldValue());
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(amountInputData.getAmount()), amountFieldState.getTextFieldValue().getText())) {
            amountInputCallbacks.onAmountChange(com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.withUpdatedQuantity(amountInputData.getAmount(), textFieldValue.getText()));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SoxT0rqJiiLg3H12vuadppaEEJE(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZgLpHQ7tmJ546jUs9-0uUUJlpjI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15630$r8$lambda$ZgLpHQ7tmJ546jUs90uUUJlpjI(com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1625242774, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInput.<anonymous> (AmountInput.kt:62)");
            }
            if (amountFieldState != null) {
                composer.startReplaceGroup(-441111380);
                getHighSpeedVideoFpsRangesFor(amountInputData, amountInputConfig, amountInputCallbacks, amountFieldState, modifier, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-440999005);
                getHighResolutionOutputSizeshNQ4ISI(amountInputData, amountInputConfig, amountInputCallbacks, modifier, composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_mX_w-WSvK6haUxmlgYIvzljYYU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15631$r8$lambda$_mX_wWSvK6haUxmlgYIvzljYYU(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AmountInput(amountInputConfig, amountInputData, amountInputCallbacks, modifier, amountFieldState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mwQRp6aLGATrVXpCOxbrUMegjoc(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$rR3mq_T2WTAaQuwtGF7sdRI05t0(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        mutableState.setValue(textFieldValue);
        amountInputCallbacks.onTextFieldValueChange(textFieldValue);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue()).getText())) {
            amountInputCallbacks.onAmountChange(com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.withUpdatedQuantity(amountInputData.getAmount(), textFieldValue.getText()));
        }
        return kotlin.Unit.INSTANCE;
    }
}
