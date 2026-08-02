package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ae\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001a\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"MaxItemCount", "", "BottomSlotVerticalOffset", "RecentActivitySection", "", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/transactionitem/TransactionItemUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recentactivites/RecentActivitiesSectionUiState;", "onSeeAllClick", "Lkotlin/Function0;", "onTryAgainClick", "onActivityClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "items", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecentActivitySectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecentActivitySectionLargeFontPreview", "RecentActivitySectionSmallScreenPreview", "RecentActivitySectionErrorPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RecentActivitySectionKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecentActivitySection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-935909430);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(accountSummarySectionUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-935909430, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySection (RecentActivitySection.kt:56)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionTestTags.SECTION);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.AccountSummarySection(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_header), function0, testTag, accountSummarySectionUiState.getIsRedirectionButtonVisible(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_accessibility_see_all, new java.lang.Object[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_header, startRestartGroup, 0)}, startRestartGroup, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Item.INSTANCE.getSEE_ALL_ACTIVITY()), accountSummarySectionUiState.getIsVisible(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(272632084, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$P9jrH68P7jtev9kW650pqyzr8Gk(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.this, function1, function02, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 12582912, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$Sr2daszYfjtAWQYEXoHFAs462uc(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.this, function0, function02, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1050003085);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1050003085, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.Content (RecentActivitySection.kt:94)");
                }
                com.paypal.pds.components.CardKt.Card(modifier3, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(12576985, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$vX6Zc3aOludJw9Strl3CzFtxH88(list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 805306368 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.m18250$r8$lambda$x20bkc3ZCb9jS3OfCncOlhz8k(list, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bjf1Q7LF1dbshSRAgaEQooHjNVs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1355340627);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1355340627, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionErrorPreview (RecentActivitySection.kt:248)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error error = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda16
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$bwkPiztIKmqzAhdCOLi6ihpxZb0((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            RecentActivitySection(error, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$Bjf1Q7LF1dbshSRAgaEQooHjNVs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ct4kWSeebtmzLIbw4Qza4cuZEZU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel) {
        function1.invoke(transactionItemUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IUePOT5GBFzrUf2k6caswar4Kbg(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1125763372, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecentActivitySection.kt:108)");
            }
            androidx.compose.ui.Alignment.Horizontal end = androidx.compose.ui.Alignment.INSTANCE.getEnd();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), end, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(transactionItemUiModel.getAmount().asString(composer, 0), null, transactionItemUiModel.getAmountTextColor(), null, null, null, false, 0, 0, null, null, composer, 0, 0, 2042);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString additionalDetails = transactionItemUiModel.getAdditionalDetails();
            if (additionalDetails == null) {
                composer.startReplaceGroup(875210278);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(875210279);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(additionalDetails.asString(composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, null, composer, 384, 0, 2042);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$P9jrH68P7jtev9kW650pqyzr8Gk(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(272632084, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySection.<anonymous> (RecentActivitySection.kt:69)");
            }
            if (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) {
                composer.startReplaceGroup(199343084);
                getHighSpeedVideoFpsRanges((java.util.List) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) accountSummarySectionUiState).getData(), function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionTestTags.CONTENT), composer, 384, 0);
                composer.endReplaceGroup();
            } else if (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error) {
                composer.startReplaceGroup(199592727);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt.AccountSummarySectionPartialError(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_partial_error_description), function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionTestTags.ERROR), composer, 384, 0);
                composer.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty.INSTANCE)) {
                composer.startReplaceGroup(6449901);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivityEmptyStateKt.RecentActivityEmptyState(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionTestTags.EMPTY), composer, 6, 0);
                composer.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden.INSTANCE)) {
                    composer.startReplaceGroup(6428856);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(6455320);
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

    /* renamed from: $r8$lambda$SX-5VumSSuF2Jum1bfOlJG0z8HI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18247$r8$lambda$SX5VumSSuF2Jum1bfOlJG0z8HI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1953628450);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1953628450, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionSmallScreenPreview (RecentActivitySection.kt:224)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Junk Foods"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 20 ∙ Purchase"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$189.00"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("3%"), null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null)));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda12
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$qPiVN5HHKo7cQ_sbmjFQBExznfw((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            RecentActivitySection(ready, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.m18247$r8$lambda$SX5VumSSuF2Jum1bfOlJG0z8HI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Sr2daszYfjtAWQYEXoHFAs462uc(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RecentActivitySection(accountSummarySectionUiState, function0, function02, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TfC0GFxfmvBD7M5erEqnB8RE7O8(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1830623693, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecentActivitySection.kt:106)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.ActivityMerchantImage(transactionItemUiModel.getImageUrl(), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UQwkuCw2v_w9cylLzcngZH_sAQg(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1759483282, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecentActivitySection.kt:122)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString detailedDescription = transactionItemUiModel.getDetailedDescription();
            if (detailedDescription == null) {
                composer.startReplaceGroup(985655457);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(985655458);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(detailedDescription.asString(composer, 0), androidx.compose.foundation.layout.OffsetKt.m1679offsetVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(-6.0f), 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, null, composer, 432, 0, 2040);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$V5ouM2BnLMe3ca0NVCXp_aDHGds(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1980335371);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1980335371, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionLargeFontPreview (RecentActivitySection.kt:191)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Not So Whole Foods"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 25 ∙ Purchase"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("A lot of interest, regardless"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$172.00"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.BDMC_US_CASHBACK_PERCENTAGE), null, 160, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Amazon"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 24 ∙ Refund"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("-$200.00"), com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, null, 200, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda22
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$pBWqfQPZntCmhc54PLHOH_sybnI((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            RecentActivitySection(ready, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$V5ouM2BnLMe3ca0NVCXp_aDHGds(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XPxAnOZW8YnqwivIk9dIw6VJ-Lo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18248$r8$lambda$XPxAnOZW8YnqwivIk9dIw6VJLo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1625341029);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1625341029, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionPreview (RecentActivitySection.kt:151)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Whole Foods"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 27 ∙ Purchase"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$175.00"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("1.5%"), null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Temu"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 27 ∙ Refund"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("-$240.00"), com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, null, 200, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Apple"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 26 ∙ Purchase"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("No interest if paid in full"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$100.65"), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("3%"), null, 160, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda7
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$b1sMaOrsJvSt0QQqh5hcbUr2Ef4((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            RecentActivitySection(ready, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.m18248$r8$lambda$XPxAnOZW8YnqwivIk9dIw6VJLo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b1sMaOrsJvSt0QQqh5hcbUr2Ef4(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bwkPiztIKmqzAhdCOLi6ihpxZb0(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pBWqfQPZntCmhc54PLHOH_sybnI(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qPiVN5HHKo7cQ_sbmjFQBExznfw(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vX6Zc3aOludJw9Strl3CzFtxH88(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(12576985, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.Content.<anonymous> (RecentActivitySection.kt:99)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            composer.startReplaceGroup(-42825831);
            for (final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel transactionItemUiModel : kotlin.collections.CollectionsKt.take(list, 3)) {
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionTestTags.TRANSACTION_ITEM);
                com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(transactionItemUiModel.getTitle().asString(composer, 0), transactionItemUiModel.getDescription().asString(composer, 0), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1125763372, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$IUePOT5GBFzrUf2k6caswar4Kbg(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1830623693, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$TfC0GFxfmvBD7M5erEqnB8RE7O8(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1759483282, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$UQwkuCw2v_w9cylLzcngZH_sAQg(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), null, null, null, null, 7740, null);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(transactionItemUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recentactivity.RecentActivitySectionKt.$r8$lambda$Ct4kWSeebtmzLIbw4Qza4cuZEZU(kotlin.jvm.functions.Function1.this, transactionItemUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListKt.ListItemView(listItem, testTag, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, false, composer, com.paypal.pds.components.ListItem.$stable | 48, 116);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x20-bkc3ZCb9jS3OfCncOlhz8-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18250$r8$lambda$x20bkc3ZCb9jS3OfCncOlhz8k(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
