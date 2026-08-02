package com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"MMPPreselectedAmounts", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "formattedAmount", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "", "onPreselectedAmountClick", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MMPPreselectedAmountsWithSelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "MMPPreselectedAmountsEuroPreview", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MMPPreselectedAmountsKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MMPPreselectedAmounts(final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, androidx.compose.ui.Modifier modifier, boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1588929714);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(keyboardData) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                }
                int i6 = 16384;
                if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
                boolean z3 = false;
                if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z2 = z;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z4 = i3 != 0 ? true : z;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1588929714, i4, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmounts (MMPPreselectedAmounts.kt:52)");
                    }
                    com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = (com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter) startRestartGroup.consume(com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.getLocalMoneyAmountFormatter());
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 2, null), "mmp_amount_keypad_chips_row");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(1229711735);
                    for (final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount : keyboardData.getPreselectedAmountValues()) {
                        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(moneyAmount), keyboardData.getCurrentInput());
                        if (moneyAmountFormatter != null) {
                            startRestartGroup.startReplaceGroup(407197695);
                            invoke = com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.rememberFormattedAmount(moneyAmount, moneyAmountFormatter, z3, startRestartGroup, 384);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(407401396);
                            startRestartGroup.endReplaceGroup();
                            invoke = function1.invoke(moneyAmount);
                        }
                        com.paypal.pds.components.ButtonStyle buttonStyle = areEqual ? com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE : com.paypal.pds.components.ButtonStyle.Outline.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        boolean z5 = (57344 & i4) == i6 ? true : z3;
                        boolean changed = startRestartGroup.changed(moneyAmount);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z5 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.m15648$r8$lambda$fyvPddUTglEDORxZ_PrCEck7c(kotlin.jvm.functions.Function1.this, moneyAmount);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, invoke, weight$default, null, null, buttonStyle, small, z4, false, startRestartGroup, ((i4 << 15) & 29360128) | 1572864, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                        modifier3 = modifier3;
                        z3 = false;
                        i6 = i6;
                    }
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.$r8$lambda$lGzZN39QOD3f6Sq0Kt0wKtT_W8g(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData.this, modifier5, z2, function1, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if ((i & 3072) == 0) {
            }
            int i62 = 16384;
            if ((i & 24576) == 0) {
            }
            boolean z32 = false;
            if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        int i622 = 16384;
        if ((i & 24576) == 0) {
        }
        boolean z322 = false;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HlKVrr_pO9MUh9VpoFaAJK7Gq4g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1494479297);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1494479297, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsEuroPreview (MMPPreselectedAmounts.kt:113)");
            }
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData("0", false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount[]{com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "20"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "50"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "100")}), null, null, null, 50, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.$r8$lambda$UneG17cP06jtKcGjUJYE8WHMaFU((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.$r8$lambda$JlweB2MNulMypdWgZtWZpPi351s((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MMPPreselectedAmounts(keyboardData, null, true, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 28032, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.$r8$lambda$HlKVrr_pO9MUh9VpoFaAJK7Gq4g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JlweB2MNulMypdWgZtWZpPi351s(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$UneG17cP06jtKcGjUJYE8WHMaFU(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_EUR.concat(java.lang.String.valueOf(fiat != null ? fiat.getQuantity() : null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_qbUOibSArseDkogfN_6gRXwbaQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fyvPddUTglEDO-RxZ_Pr-CEck7c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15648$r8$lambda$fyvPddUTglEDORxZ_PrCEck7c(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        function1.invoke(com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(moneyAmount));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$jsQ5cwUI2UbftdwF0v4nn2pAzro(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(fiat != null ? fiat.getQuantity() : null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lGzZN39QOD3f6Sq0Kt0wKtT_W8g(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MMPPreselectedAmounts(keyboardData, modifier, z, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xLP0-n4IaApQxnTS81tqg7J1Kns, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15649$r8$lambda$xLP0n4IaApQxnTS81tqg7J1Kns(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1929501594);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1929501594, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsWithSelectionPreview (MMPPreselectedAmounts.kt:91)");
            }
            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData("25.00", false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount[]{com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "10"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "50"), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "100")}), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25.00"), null, null, 50, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.$r8$lambda$jsQ5cwUI2UbftdwF0v4nn2pAzro((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.$r8$lambda$_qbUOibSArseDkogfN_6gRXwbaQ((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MMPPreselectedAmounts(keyboardData, null, true, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 28032, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPPreselectedAmountsKt.m15649$r8$lambda$xLP0n4IaApQxnTS81tqg7J1Kns(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
