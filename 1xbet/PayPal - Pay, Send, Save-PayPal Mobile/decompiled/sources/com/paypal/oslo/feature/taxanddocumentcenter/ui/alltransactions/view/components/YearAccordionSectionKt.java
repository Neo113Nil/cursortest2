package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0001¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"YearAccordionSection", "", "years", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/YearAccordionItem;", "modifier", "Landroidx/compose/ui/Modifier;", "onYearHeaderClick", "Lkotlin/Function1;", "", "onDownloadYearClick", "onDownloadMonthClick", "Lkotlin/Function2;", "", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "YearHeader", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "", "(IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "YearBody", "yearItem", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/YearAccordionItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MonthRow", "monthItem", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/MonthItem;", "isLast", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/MonthItem;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YearAccordionSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void YearAccordionSection(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1279701821);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
            }
            i4 = i3;
            int i6 = 1;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1279701821, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSection (YearAccordionSection.kt:52)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                startRestartGroup.startReplaceGroup(-886218049);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) it.next();
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    int i7 = i4;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i6, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), yearAccordionItem.isExpanded() ? com.paypal.pds.core.Color.BorderRoleEmphasisPositive.INSTANCE : com.paypal.pds.core.Color.BorderMuted.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 54, 0), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "year_card_".concat(java.lang.String.valueOf(yearAccordionItem.getYear())));
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(yearAccordionItem);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$5Wq4532B9axS5WxdNVWdmVDIgmk((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                    boolean z = (i7 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.m20304$r8$lambda$umN6GNCifirNh7UuOpBomfyJKQ(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.AccordionKt.Accordion(listOf, function13, fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue2, false, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$YearAccordionSectionKt.INSTANCE.getLambda$195790445$tax_and_document_center_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-918219069, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.m20303$r8$lambda$pihVn0Zdt19WW0diNGkNM4sCDY(kotlin.jvm.functions.Function1.this, function2, (com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, 1794480, 128);
                    startRestartGroup.endNode();
                    it = it;
                    modifier3 = modifier4;
                    i6 = 1;
                    i4 = i7;
                }
                androidx.compose.ui.Modifier modifier5 = modifier3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$XtXwjDKV98CHKOvWacIu7SttnBE(list, modifier6, function1, function12, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i3;
        int i62 = 1;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void YearHeader(final int i, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2005857912);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2005857912, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearHeader (YearAccordionSection.kt:101)");
                }
                com.paypal.pds.core.Color color = z ? com.paypal.pds.core.Color.ContentBase.INSTANCE : com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), "year_header_".concat(java.lang.String.valueOf(i)));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(java.lang.String.valueOf(i), null, color, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, 1018);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$b4jkrmMuXBsZgKaMaupf2d1YzQs(i, z, modifier5, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void YearBody(final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearAccordionItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1957218356);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(yearAccordionItem) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1957218356, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearBody (YearAccordionSection.kt:122)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "year_body_".concat(java.lang.String.valueOf(yearAccordionItem.getYear())));
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
            int i4 = i3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_download_all_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getStart()), "download_all_".concat(java.lang.String.valueOf(yearAccordionItem.getYear()))), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, startRestartGroup, ((i3 >> 3) & 14) | 1769472, 408);
            composer2.startReplaceGroup(1118646176);
            int i5 = 0;
            for (java.lang.Object obj : yearAccordionItem.getMonths()) {
                if (i5 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem monthItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem) obj;
                boolean z = i5 == kotlin.collections.CollectionsKt.getLastIndex(yearAccordionItem.getMonths());
                int i6 = i4;
                boolean z2 = (i6 & 896) == 256;
                boolean changed = composer2.changed(monthItem);
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if ((z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$kNbco5M0rp2ecJJqfTEe2OtnN9w(kotlin.jvm.functions.Function1.this, monthItem);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                MonthRow(monthItem, z, (kotlin.jvm.functions.Function0) rememberedValue, composer2, 0);
                if (!z) {
                    composer2.startReplaceGroup(1063449495);
                    com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1063488896);
                    composer2.endReplaceGroup();
                }
                i5++;
                i4 = i6;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$itHsaP190vbTl3GZQMu8z1bi7_o(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem.this, function0, function1, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void MonthRow(final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem monthItem, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        float spacing16;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-410034549);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(monthItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-410034549, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.MonthRow (YearAccordionSection.kt:159)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            float spacing162 = com.paypal.pds.core.ConstantsKt.getSpacing16();
            if (!z) {
                spacing16 = com.paypal.pds.core.ConstantsKt.getSpacing16();
            } else {
                spacing16 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(fillMaxWidth$default, 0.0f, spacing162, 0.0f, spacing16, 5, null), "month_row_".concat(java.lang.String.valueOf(monthItem.getTitle())));
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(monthItem.getTitle(), androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, 1020);
            com.paypal.pds.core.Icon.ArrowDownTray arrowDownTray = com.paypal.pds.core.Icon.ArrowDownTray.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_download_button, startRestartGroup, 0);
            java.lang.String title = monthItem.getTitle();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(stringResource);
            sb.append(" ");
            sb.append(title);
            composer2 = startRestartGroup;
            com.paypal.pds.components.IconKt.Icon(arrowDownTray, sb.toString(), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, false, null, null, function0, startRestartGroup, ((i2 << 12) & 3670016) | 6, 31), "download_month_".concat(java.lang.String.valueOf(monthItem.getTitle()))), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentFaint.INSTANCE, composer2, 27654, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.m20302$r8$lambda$2NpOwlZ7UpwbpyAZiT1rJwg59w(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem.this, z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2NpOwlZ7UpwbpyAZi-T1rJwg59w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20302$r8$lambda$2NpOwlZ7UpwbpyAZiT1rJwg59w(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem monthItem, boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        MonthRow(monthItem, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$5Wq4532B9axS5WxdNVWdmVDIgmk(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearAccordionItem, "");
        return yearAccordionItem.isExpanded();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XtXwjDKV98CHKOvWacIu7SttnBE(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        YearAccordionSection(list, modifier, function1, function12, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZWgN8XXEBuEvHsO0GCnc5NE6tpM(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function2.invoke(java.lang.Integer.valueOf(yearAccordionItem.getYear()), str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b4jkrmMuXBsZgKaMaupf2d1YzQs(int i, boolean z, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        YearHeader(i, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$itHsaP190vbTl3GZQMu8z1bi7_o(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        YearBody(yearAccordionItem, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kNbco5M0rp2ecJJqfTEe2OtnN9w(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem monthItem) {
        function1.invoke(monthItem.getTitle());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pihVn0Zdt19WW0diNGkNM4-sCDY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20303$r8$lambda$pihVn0Zdt19WW0diNGkNM4sCDY(final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function2 function2, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearAccordionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-918219069, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YearAccordionSection.kt:84)");
        }
        boolean changed = composer.changed(function1);
        boolean changedInstance = composer.changedInstance(yearAccordionItem);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$qcpsu0zuCMUh_nrQabpnU_TbdAI(kotlin.jvm.functions.Function1.this, yearAccordionItem);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed2 = composer.changed(function2);
        boolean changedInstance2 = composer.changedInstance(yearAccordionItem);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.$r8$lambda$ZWgN8XXEBuEvHsO0GCnc5NE6tpM(kotlin.jvm.functions.Function2.this, yearAccordionItem, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        YearBody(yearAccordionItem, function0, (kotlin.jvm.functions.Function1) rememberedValue2, composer, (i >> 3) & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qcpsu0zuCMUh_nrQabpnU_TbdAI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem) {
        function1.invoke(java.lang.Integer.valueOf(yearAccordionItem.getYear()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$umN6GNCifirNh7UuOpBomfyJK-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20304$r8$lambda$umN6GNCifirNh7UuOpBomfyJKQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearAccordionItem, "");
        function1.invoke(java.lang.Integer.valueOf(yearAccordionItem.getYear()));
        return kotlin.Unit.INSTANCE;
    }
}
