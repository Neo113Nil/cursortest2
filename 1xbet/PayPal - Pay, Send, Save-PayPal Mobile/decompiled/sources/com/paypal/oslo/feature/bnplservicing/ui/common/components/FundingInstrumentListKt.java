package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, d2 = {"FundingInstrumentList", "", "items", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/FundingInstrumentListItem;", "selectedItemId", "", "onSelectionChange", "Lkotlin/Function1;", "onItemClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FundingInstrumentLeadingView", "imageUrl", "title", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WalletIconFallback", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddActionLeadingView", "FundingInstrumentListWithSelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "FundingInstrumentListNoSelectionPreview", "FundingInstrumentListOnlyActionsPreview", "FundingInstrumentListEmptyPreview", "bnpl-servicing_prodRelease", "showFallback", "", "selectedId"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentListKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundingInstrumentList(final java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem> list, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.ListItem listItem;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1292983188);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i3 = i4;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1292983188, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentList (FundingInstrumentList.kt:84)");
                }
                startRestartGroup.startReplaceGroup(-1311286019);
                java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (final com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem : list2) {
                    if (fundingInstrumentListItem instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) {
                        startRestartGroup.startReplaceGroup(-292929702);
                        com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument instrument = (com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) fundingInstrumentListItem;
                        listItem = new com.paypal.pds.components.ListItem(instrument.getTitle(), instrument.getDescription(), null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1395914650, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$zoeA9qDnqxUYQhs0V7Al18RLGR8(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), null, null, null, null, null, 8060, null);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (!(fundingInstrumentListItem instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action)) {
                            startRestartGroup.startReplaceGroup(1376022103);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-292497004);
                        startRestartGroup.endReplaceGroup();
                        listItem = new com.paypal.pds.components.ListItem(((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action) fundingInstrumentListItem).getTitle(), null, null, null, false, false, null, com.paypal.oslo.feature.bnplservicing.ui.common.components.ComposableSingletons$FundingInstrumentListKt.INSTANCE.getLambda$2143587677$bnpl_servicing_prodRelease(), null, null, null, null, null, 8062, null);
                    }
                    arrayList.add(listItem);
                }
                final java.util.ArrayList arrayList2 = arrayList;
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(modifier3, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i3 >> 12) & 14) | 48, 2), com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentTestTag.LIST);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                boolean changedInstance = startRestartGroup.changedInstance(arrayList2);
                boolean changedInstance2 = startRestartGroup.changedInstance(list);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$k6sq_IdG5IXMwSvBI8fXONP3WR8(arrayList2, list, str, (com.paypal.pds.components.ListItem) obj));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean changedInstance3 = startRestartGroup.changedInstance(arrayList2);
                boolean changedInstance4 = startRestartGroup.changedInstance(list);
                boolean z2 = (i3 & 7168) == 2048;
                boolean z3 = (i3 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4 | z2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$w4dWPCQHpTV8MBMmQtmUohZvytk(arrayList2, list, function1, function12, (com.paypal.pds.components.ListItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ListKt.List(arrayList2, null, null, null, function13, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 0, 0, 1518);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$4w9oCvcMaswU1weGdB1bHnSBVOw(list, str, function1, function12, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-284112552);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-284112552, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentLeadingView (FundingInstrumentList.kt:142)");
                }
                if (str != null) {
                    startRestartGroup.startReplaceGroup(1383657918);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                        startRestartGroup.startReplaceGroup(1383736534);
                        getHighSpeedVideoFpsRangesFor(modifier4, startRestartGroup, (i3 >> 6) & 14, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1383815026);
                        androidx.compose.ui.layout.ContentScale fit = androidx.compose.ui.layout.ContentScale.INSTANCE.getFit();
                        androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier4, com.paypal.pds.core.ConstantsKt.getSpacing48(), com.paypal.pds.core.ConstantsKt.getSize32());
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.m12559$r8$lambda$JAvfjVqeXYf11DIxjwWhhi2Kd4(androidx.compose.runtime.MutableState.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(str, str2, m1742sizeVpY3zN4, fit, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, (i3 & 14) | 1575936 | (i3 & 112), 48);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1384107294);
                    getHighSpeedVideoFpsRangesFor(modifier4, startRestartGroup, (i3 >> 6) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$v06HkFr0GPmTteuTn4Gtp_qfVBk(str, str2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    private static final void getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-161009749);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-161009749, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.WalletIconFallback (FundingInstrumentList.kt:163)");
            }
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier, com.paypal.pds.core.ConstantsKt.getSpacing48(), com.paypal.pds.core.ConstantsKt.getSize32()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 48, 0), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Wallet.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$NCRyRsNJ9t2_imiZqdRAp11FKTM(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1497768917);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1497768917, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.AddActionLeadingView (FundingInstrumentList.kt:183)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing48(), com.paypal.pds.core.ConstantsKt.getSize32()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 48, 0);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier modifier4 = modifier3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("+", null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleLarge.INSTANCE, startRestartGroup, 390, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$ZzvFxjFVF6N9nJQhxYi8lkgl1Y8(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0Y50xyyieG2aZcqITUrofbpaCo4(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4w9oCvcMaswU1weGdB1bHnSBVOw(java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentList(list, str, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$6qBaY04hXiX8dNIAjEtox9tQehQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-837051865);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-837051865, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListEmptyPreview (FundingInstrumentList.kt:300)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$gF_g7c4MvQs_ylOCE7T47aNxdzQ(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$bngoIADkx1wy_KLrL89BDukIRJw((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            FundingInstrumentList(emptyList, str, function1, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3462, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$6qBaY04hXiX8dNIAjEtox9tQehQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$85_tGVYS9AXhlomRAWkVasOjc9w(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentListItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JAvfjVqeXYf11DIxjwWhhi2-Kd4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12559$r8$lambda$JAvfjVqeXYf11DIxjwWhhi2Kd4(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KlbYC9TVRArCzmUWQXbGrDvbtHM(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NCRyRsNJ9t2_imiZqdRAp11FKTM(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$UTu_6YADfS3jMpNvfMvsCrlw3Ck(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-224726784);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-224726784, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListWithSelectionPreview (FundingInstrumentList.kt:202)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("chase", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem[]{new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument("paypal", "PayPal Balance", "$151.68 available", null), new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument("bofa", "Bank of America", "Checking ••8644", null), new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument("chase", "Chase Bank", "Checking ••8607", null), new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action("link-card", "Link a card"), new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action("link-bank", "Link a bank account")});
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$j1yiURNlY0QZmnqBSwCiXHp2rWA(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$85_tGVYS9AXhlomRAWkVasOjc9w((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            FundingInstrumentList(listOf, str, function1, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3456, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$UTu_6YADfS3jMpNvfMvsCrlw3Ck(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y7rOWnS5O39VYoU3eGGrHXSTToU(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentListItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZzvFxjFVF6N9nJQhxYi8lkgl1Y8(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bngoIADkx1wy_KLrL89BDukIRJw(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentListItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gF_g7c4MvQs_ylOCE7T47aNxdzQ(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j1yiURNlY0QZmnqBSwCiXHp2rWA(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$k6sq_IdG5IXMwSvBI8fXONP3WR8(java.util.List list, java.util.List list2, java.lang.String str, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem = (com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem) kotlin.collections.CollectionsKt.getOrNull(list2, list.indexOf(listItem));
        return (fundingInstrumentListItem instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) && kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) fundingInstrumentListItem).getId(), str);
    }

    /* renamed from: $r8$lambda$osk-fDkl3VtuONHHvGwmkklU-Kg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12560$r8$lambda$oskfDkl3VtuONHHvGwmkklUKg(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentListItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v06HkFr0GPmTteuTn4Gtp_qfVBk(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(str, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$w0UdpiTBT0bDhm4S8z4pMlRga6w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1060096373);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1060096373, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListOnlyActionsPreview (FundingInstrumentList.kt:274)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action[]{new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action("link-card", "Link a card"), new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action("link-bank", "Link a bank account")});
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$0Y50xyyieG2aZcqITUrofbpaCo4(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.m12560$r8$lambda$oskfDkl3VtuONHHvGwmkklUKg((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            FundingInstrumentList(listOf, str, function1, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3456, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$w0UdpiTBT0bDhm4S8z4pMlRga6w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w4dWPCQHpTV8MBMmQtmUohZvytk(java.util.List list, java.util.List list2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem = (com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem) kotlin.collections.CollectionsKt.getOrNull(list2, list.indexOf(listItem));
        if (fundingInstrumentListItem != null) {
            function12.invoke(fundingInstrumentListItem);
        }
        if (fundingInstrumentListItem instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) {
            function1.invoke(((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) fundingInstrumentListItem).getId());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$wMobqO5lHy5Yb2hY06TNtbLcziI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1421948123);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1421948123, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListNoSelectionPreview (FundingInstrumentList.kt:246)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem[]{new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument("DCU", "DCU Bank", "Checking ••6393", null), new com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Action("link-bank", "Link a bank account")});
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$KlbYC9TVRArCzmUWQXbGrDvbtHM(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$Y7rOWnS5O39VYoU3eGGrHXSTToU((com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            FundingInstrumentList(listOf, str, function1, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3456, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListKt.$r8$lambda$wMobqO5lHy5Yb2hY06TNtbLcziI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zoeA9qDnqxUYQhs0V7Al18RLGR8(com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem fundingInstrumentListItem, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1395914650, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentList.<anonymous>.<anonymous> (FundingInstrumentList.kt:92)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument instrument = (com.paypal.oslo.feature.bnplservicing.ui.common.components.FundingInstrumentListItem.Instrument) fundingInstrumentListItem;
            getHighResolutionOutputSizeshNQ4ISI(instrument.getImageUrl(), instrument.getTitle(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
