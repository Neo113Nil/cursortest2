package com.paypal.oslo.feature.wallet.banks.ui.consent;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "sectionHeader", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "banks", "Lkotlin/Function1;", "", "onClick", "Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;", "topBarConfig", "NeoBankSelectionScreen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;Landroidx/compose/runtime/Composer;I)V", "NeoBankSelectionScreenPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NeoBankSelectionScreenKt {
    public static final void NeoBankSelectionScreen(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> list, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletTopBarConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1487342);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(walletTopBarConfig) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1487342, i3, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreen (NeoBankSelectionScreen.kt:50)");
            }
            androidx.compose.ui.Modifier systemBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, systemBarsPadding);
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
            com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.WalletTopBar(walletTopBarConfig, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), startRestartGroup, (i3 >> 15) & 14, 0);
            com.paypal.pds.components.HeaderKt.Header(str, (androidx.compose.ui.Modifier) null, str2, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (i3 & 14) | ((i3 << 3) & 896), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), composer2, 0);
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, null, str3, null, composer2, i3 & 896, 11);
            int i4 = (i3 >> 9) & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1369364187, i4, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.toLisItem (NeoBankSelectionScreen.kt:82)");
            }
            composer2.startReplaceGroup(1698993588);
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails : list2) {
                arrayList.add(new com.paypal.pds.components.ListItem(instantBankConfirmationBankDetails.getBankName(), null, instantBankConfirmationBankDetails.getExternalBankId(), null, false, false, com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt.INSTANCE.m20850getLambda$597979952$wallet_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(551852335, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt.$r8$lambda$mSrCYGvjeFbc5z3bflOxVBlEAww(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), null, null, null, null, null, 7994, null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            composer2.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            boolean z = (57344 & i3) == 16384;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt.$r8$lambda$vz8dXIFt1EBNNoNarnOZ8hAt1iY(kotlin.jvm.functions.Function1.this, (com.paypal.pds.components.ListItem) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ListKt.List(arrayList2, null, null, null, null, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue, null, composer2, 0, 0, 1534);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt.$r8$lambda$qyMm0rhRBiP_lVqWSdymyVXdidU(str, str2, str3, list, function1, walletTopBarConfig, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NeoBankSelectionScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1829227371);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1829227371, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenPreview (NeoBankSelectionScreen.kt:102)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails("Bank of America CashPro", "", "", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType) null, 504, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(com.paypal.oslo.feature.wallet.banks.ui.consent.ComposableSingletons$NeoBankSelectionScreenKt.INSTANCE.getLambda$795118900$wallet_prodRelease(), null, null, 6, null);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_neo_banks_title, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_neo_banks_description, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_choose_your_bank, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt.$r8$lambda$8p9Rj3RxwtXhXJV0MMj193BE3Mk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            NeoBankSelectionScreen(stringResource, stringResource2, stringResource3, listOf, (kotlin.jvm.functions.Function1) rememberedValue, walletTopBarConfig, startRestartGroup, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt.$r8$lambda$Gxly25uaJdeIqs947P4KSEfcQSI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8p9Rj3RxwtXhXJV0MMj193BE3Mk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Gxly25uaJdeIqs947P4KSEfcQSI(int i, androidx.compose.runtime.Composer composer, int i2) {
        NeoBankSelectionScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mSrCYGvjeFbc5z3bflOxVBlEAww(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(551852335, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.toLisItem.<anonymous>.<anonymous> (NeoBankSelectionScreen.kt:86)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.BankLogo(instantBankConfirmationBankDetails.getInlineLogoUrl(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qyMm0rhRBiP_lVqWSdymyVXdidU(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        NeoBankSelectionScreen(str, str2, str3, list, function1, walletTopBarConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vz8dXIFt1EBNNoNarnOZ8hAt1iY(kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        java.lang.String data = listItem.getData();
        function1.invoke(data != null ? data : "");
        return kotlin.Unit.INSTANCE;
    }
}
