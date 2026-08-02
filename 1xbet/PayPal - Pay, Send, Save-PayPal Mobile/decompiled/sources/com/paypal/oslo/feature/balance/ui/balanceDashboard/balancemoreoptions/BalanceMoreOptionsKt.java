package com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a=\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001ao\u0010\u0000\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001aB\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u000fH\u0000\u001a\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¨\u0006&"}, d2 = {"BalanceMoreOptions", "", "onOptionSelect", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/balance/domain/model/moreoptions/BalanceMoreOption;", "modifier", "Landroidx/compose/ui/Modifier;", "options", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "BalanceMoreOptionItem", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "onClick", "Lkotlin/Function0;", "iconOnTop", "", "(Lcom/paypal/oslo/feature/balance/domain/model/moreoptions/BalanceMoreOption;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "onSetAsPreferredClick", "onAddCashAtStoresClick", "onCashCheckClick", "onViewCurrenciesClick", "onFileTaxesClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "getIconForOption", "Lcom/paypal/pds/core/Icon;", "BalanceMoreOptionsDefaultPreview", "(Landroidx/compose/runtime/Composer;I)V", "BalanceMoreOptionsCustomPreview", "BalanceMoreOptionsDisabledPreview", "BalanceMoreOptionsEmptyPreview", "getFilteredBalanceMoreOptions", "isPreferredPaymentModeEnabled", "isAddCashStoresEnabled", "isCashInCheckEnabled", "isFileTaxesEnabled", "hasMultipleCurrencies", "isViewCurrenciesEnabled", "getDefaultOptions", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceMoreOptionsKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceMoreOptions(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list2;
        final java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1216045370);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(function1) ? 4 : 2) | i : i;
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
                list2 = list;
                i4 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    list3 = list2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list4 = i3 != 0 ? null : list2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1216045370, i4, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptions (BalanceMoreOptions.kt:65)");
                    }
                    boolean changed = startRestartGroup.changed(list4);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = list4 == null ? getHighSpeedVideoFpsRangesFor() : list4;
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    java.util.List list5 = (java.util.List) rememberedValue;
                    boolean changed2 = startRestartGroup.changed(list5);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        if (list5.isEmpty()) {
                            arrayList = kotlin.collections.CollectionsKt.emptyList();
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj : list5) {
                                if (((com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj).getEnabled()) {
                                    arrayList2.add(obj);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        rememberedValue2 = arrayList;
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final java.util.List list6 = (java.util.List) rememberedValue2;
                    if (!list6.isEmpty()) {
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 2, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.MoreOptions.SECTION);
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
                        list3 = list4;
                        com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_more_options_title, startRestartGroup, 0), null, null, startRestartGroup, 0, 13);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.MoreOptions.CARD), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(988310306, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$STVshloVRqFiqznSr7iSnc0fsdw(list6, function1, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier5 = modifier3;
                            final java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list7 = list4;
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.m12139$r8$lambda$Jt_ieJdd6Rq7pxXjNEfFL9yEvw(kotlin.jvm.functions.Function1.this, modifier5, list7, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier6 = modifier2;
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$BagrWPgvUK00zxAarte44eCCLBw(kotlin.jvm.functions.Function1.this, modifier6, list3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                    return;
                }
                return;
            }
            list2 = list;
            if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        list2 = list;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        androidx.compose.ui.Modifier modifier;
        androidx.compose.ui.Modifier item;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1524450808);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(balanceMoreOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1524450808, i3, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionItem (BalanceMoreOptions.kt:125)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(balanceMoreOption.getTitleResId(), startRestartGroup, 0);
                java.lang.Integer descriptionResId = balanceMoreOption.getDescriptionResId();
                if (descriptionResId == null) {
                    startRestartGroup.startReplaceGroup(70381018);
                    startRestartGroup.endReplaceGroup();
                    str = null;
                } else {
                    startRestartGroup.startReplaceGroup(70381019);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(descriptionResId.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    str = stringResource2;
                }
                com.paypal.pds.core.Icon highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(balanceMoreOption);
                com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item view_currencies_button = kotlin.jvm.internal.Intrinsics.areEqual(balanceMoreOption.getId(), "view_currencies") ? com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.INSTANCE.getVIEW_CURRENCIES_BUTTON() : null;
                java.lang.String str2 = kotlin.jvm.internal.Intrinsics.areEqual(balanceMoreOption.getId(), "view_currencies") ? "view_currencies" : null;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                if (view_currencies_button != null && (item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(fillMaxWidth$default, view_currencies_button)) != null) {
                    fillMaxWidth$default = item;
                }
                if (str2 == null || (modifier = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(fillMaxWidth$default, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toUserIntent(str2))) == null) {
                    modifier = fillMaxWidth$default;
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(modifier, null, null, false, null, null, function0, startRestartGroup, (i3 << 15) & 3670016, 31), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12()), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.MoreOptions.INSTANCE.item(balanceMoreOption.getId()));
                androidx.compose.ui.Alignment.Companion companion = androidx.compose.ui.Alignment.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), z4 ? companion.getTop() : companion.getCenterVertically(), startRestartGroup, 0);
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
                com.paypal.pds.components.IconKt.Icon(highSpeedVideoFpsRangesFor, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27696, 4);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                if (str != null) {
                    startRestartGroup.startReplaceGroup(1000014001);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1000262900);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z3 = z4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$yaLv2ZrncNGDNfMq1nyP8Du6vZs(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption.this, function0, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceMoreOptions(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list2;
        androidx.compose.runtime.Composer composer2;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(594523255);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function05) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                list2 = list;
            } else {
                list2 = list;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(list2) ? 1048576 : 524288;
                }
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                list3 = list2;
            } else {
                androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                list3 = i4 != 0 ? null : list2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(594523255, i3, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptions (BalanceMoreOptions.kt:205)");
                }
                boolean z = (i3 & 14) == 4;
                boolean z2 = (i3 & 112) == 32;
                boolean z3 = (i3 & 896) == 256;
                boolean z4 = (i3 & 7168) == 2048;
                boolean z5 = (57344 & i3) == 16384;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (((z | z2 | z3 | z4) || z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i5 = i3;
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.m12137$r8$lambda$56wGVg2Wpz7A7fLBqGvtEw0YPU(kotlin.jvm.functions.Function0.this, function02, function03, function04, function05, (com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    rememberedValue = function1;
                } else {
                    i5 = i3;
                }
                composer2 = startRestartGroup;
                BalanceMoreOptions((kotlin.jvm.functions.Function1) rememberedValue, modifier3, list3, startRestartGroup, (i5 >> 12) & 1008, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                final java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> list4 = list3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.m12140$r8$lambda$RLOfhjS3DWPBhTvCPqQZLfugdA(kotlin.jvm.functions.Function0.this, function02, function03, function04, function05, modifier4, list4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final com.paypal.pds.core.Icon getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        java.lang.String id = balanceMoreOption.getId();
        switch (id.hashCode()) {
            case -1135709623:
                if (id.equals("view_currencies")) {
                    return com.paypal.pds.core.Icon.Wallet.INSTANCE;
                }
                break;
            case -899524239:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED)) {
                    return com.paypal.pds.core.Icon.Star.INSTANCE;
                }
                break;
            case 1889818256:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.ADD_CASH_AT_STORES)) {
                    return com.paypal.pds.core.Icon.MapPin.INSTANCE;
                }
                break;
            case 1975800060:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.CASH_CHECK)) {
                    return com.paypal.pds.core.Icon.Checkbook.INSTANCE;
                }
                break;
            case 2144721174:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.FILE_TAXES)) {
                    return com.paypal.pds.core.Icon.Document.INSTANCE;
                }
                break;
        }
        return com.paypal.pds.core.Icon.NoIcon.INSTANCE;
    }

    public static /* synthetic */ java.util.List getFilteredBalanceMoreOptions$default(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        if ((i & 32) != 0) {
            z6 = true;
        }
        return getFilteredBalanceMoreOptions(z, z2, z3, z4, z7, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> getFilteredBalanceMoreOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : highSpeedVideoFpsRangesFor) {
            java.lang.String id = ((com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj).getId();
            switch (id.hashCode()) {
                case -1135709623:
                    if (id.equals("view_currencies")) {
                        if (z6 && z5) {
                        }
                    }
                    arrayList.add(obj);
                    break;
                case -899524239:
                    if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED)) {
                        z7 = z;
                        if (z7) {
                            break;
                        } else {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        arrayList.add(obj);
                    }
                case 1889818256:
                    if (!id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.ADD_CASH_AT_STORES)) {
                        arrayList.add(obj);
                        break;
                    } else {
                        z7 = z2;
                        if (z7) {
                        }
                    }
                    break;
                case 1975800060:
                    if (!id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.CASH_CHECK)) {
                        arrayList.add(obj);
                        break;
                    } else {
                        z7 = z3;
                        if (z7) {
                        }
                    }
                    break;
                case 2144721174:
                    if (!id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.FILE_TAXES)) {
                        arrayList.add(obj);
                        break;
                    } else {
                        z7 = z4;
                        if (z7) {
                        }
                    }
                    break;
                default:
                    arrayList.add(obj);
                    break;
            }
        }
        return arrayList;
    }

    private static final java.util.List<com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption> getHighSpeedVideoFpsRangesFor() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption[]{new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED, com.paypal.oslo.feature.balance.R.string.feature_balance_option_set_as_preferred_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_option_set_as_preferred_description), false, 8, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.ADD_CASH_AT_STORES, com.paypal.oslo.feature.balance.R.string.feature_balance_add_cash_stores, null, false, 12, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.CASH_CHECK, com.paypal.oslo.feature.balance.R.string.feature_balance_cash_check, null, false, 12, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption("view_currencies", com.paypal.oslo.feature.balance.R.string.feature_balance_view_currencies, null, false, 12, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.FILE_TAXES, com.paypal.oslo.feature.balance.R.string.feature_balance_file_taxes, null, false, 12, null)});
    }

    /* renamed from: $r8$lambda$56wGVg2Wpz7A7fLBqG-vtEw0YPU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12137$r8$lambda$56wGVg2Wpz7A7fLBqGvtEw0YPU(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMoreOption, "");
        java.lang.String id = balanceMoreOption.getId();
        switch (id.hashCode()) {
            case -1135709623:
                if (id.equals("view_currencies")) {
                    function04.invoke();
                    break;
                }
                break;
            case -899524239:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED)) {
                    function0.invoke();
                    break;
                }
                break;
            case 1889818256:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.ADD_CASH_AT_STORES)) {
                    function02.invoke();
                    break;
                }
                break;
            case 1975800060:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.CASH_CHECK)) {
                    function03.invoke();
                    break;
                }
                break;
            case 2144721174:
                if (id.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.FILE_TAXES)) {
                    function05.invoke();
                    break;
                }
                break;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8NRD5DPjEuM9D__xBqInVemzPgc(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMoreOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9FL1sF8UzCbsu4ywhFVsmUekAnk(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMoreOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BaLuK2cCI1nHj20_nVFezdZTj4E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(971971874);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(971971874, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsDisabledPreview (BalanceMoreOptions.kt:298)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$8NRD5DPjEuM9D__xBqInVemzPgc((com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceMoreOptions((kotlin.jvm.functions.Function1) rememberedValue, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption[]{new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED, com.paypal.oslo.feature.balance.R.string.feature_balance_option_set_as_preferred_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_option_set_as_preferred_description), false, 8, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.ADD_CASH_AT_STORES, com.paypal.oslo.feature.balance.R.string.feature_balance_add_cash_stores, null, false, 4, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.CASH_CHECK, com.paypal.oslo.feature.balance.R.string.feature_balance_cash_check, null, false, 12, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption("view_currencies", com.paypal.oslo.feature.balance.R.string.feature_balance_view_currencies, null, false, 4, null)}), startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$BaLuK2cCI1nHj20_nVFezdZTj4E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BagrWPgvUK00zxAarte44eCCLBw(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BalanceMoreOptions(function1, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IiuVfBrwJJM3K-t9KYfiUqp8IAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12138$r8$lambda$IiuVfBrwJJM3Kt9KYfiUqp8IAA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1680499949);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1680499949, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsDefaultPreview (BalanceMoreOptions.kt:261)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$SYFQtptxNQRCq90gDZtjAzlWx60((com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceMoreOptions((kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 6, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.m12138$r8$lambda$IiuVfBrwJJM3Kt9KYfiUqp8IAA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Jt_ieJdd6Rq7pxXjNEf-FL9yEvw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12139$r8$lambda$Jt_ieJdd6Rq7pxXjNEfFL9yEvw(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BalanceMoreOptions(function1, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MW2m4fV8gjrCb2_XUVTgLuIy7kM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-728195251);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-728195251, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsCustomPreview (BalanceMoreOptions.kt:272)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$9FL1sF8UzCbsu4ywhFVsmUekAnk((com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceMoreOptions((kotlin.jvm.functions.Function1) rememberedValue, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption[]{new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED, com.paypal.oslo.feature.balance.R.string.feature_balance_option_set_as_preferred_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_option_set_as_preferred_description), false, 8, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption("view_currencies", com.paypal.oslo.feature.balance.R.string.feature_balance_view_currencies, null, false, 12, null), new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.FILE_TAXES, com.paypal.oslo.feature.balance.R.string.feature_balance_file_taxes, null, false, 12, null)}), startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$MW2m4fV8gjrCb2_XUVTgLuIy7kM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MnIFyEqep2sZwvxbg4Pbp5AszkI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-204434617);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-204434617, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsEmptyPreview (BalanceMoreOptions.kt:330)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$uOd8untgzsVIS3PENYxYYy3Qz_s((com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BalanceMoreOptions((kotlin.jvm.functions.Function1) rememberedValue, null, kotlin.collections.CollectionsKt.emptyList(), startRestartGroup, 390, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$MnIFyEqep2sZwvxbg4Pbp5AszkI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RLOfh-jS3DWPBhTvCPqQZLfugdA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12140$r8$lambda$RLOfhjS3DWPBhTvCPqQZLfugdA(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BalanceMoreOptions(function0, function02, function03, function04, function05, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$STVshloVRqFiqznSr7iSnc0fsdw(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(988310306, i, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptions.<anonymous>.<anonymous> (BalanceMoreOptions.kt:103)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            composer.startReplaceGroup(-934925220);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption = (com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) it.next();
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(balanceMoreOption);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionsKt.$r8$lambda$vsbzsuEG1crl5lqY86MqvUgKJ3Q(kotlin.jvm.functions.Function1.this, balanceMoreOption);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                getHighSpeedVideoFpsRangesFor(balanceMoreOption, (kotlin.jvm.functions.Function0) rememberedValue, kotlin.jvm.internal.Intrinsics.areEqual(balanceMoreOption.getId(), com.paypal.oslo.feature.balance.ui.balanceDashboard.balancemoreoptions.BalanceMoreOptionIds.SET_AS_PREFERRED), composer, 0, 0);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$SYFQtptxNQRCq90gDZtjAzlWx60(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMoreOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uOd8untgzsVIS3PENYxYYy3Qz_s(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMoreOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vsbzsuEG1crl5lqY86MqvUgKJ3Q(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption) {
        function1.invoke(balanceMoreOption);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yaLv2ZrncNGDNfMq1nyP8Du6vZs(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption, kotlin.jvm.functions.Function0 function0, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(balanceMoreOption, function0, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
