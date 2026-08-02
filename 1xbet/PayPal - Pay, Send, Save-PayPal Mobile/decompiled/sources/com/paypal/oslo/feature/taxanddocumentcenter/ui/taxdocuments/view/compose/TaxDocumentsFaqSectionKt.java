package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"TaxDocumentsFaqSection", "", "faqItems", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "hasMoreItems", "", "onFaqClick", "Lkotlin/Function1;", "onViewMoreClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxDocumentsFaqSectionError", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsFaqSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxDocumentsFaqSection(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> list, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.SelectionCardModel create;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1900550211);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i3 = i6;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1900550211, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSection (TaxDocumentsFaqSection.kt:59)");
                }
                boolean changed = startRestartGroup.changed(list);
                java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem : list2) {
                        create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(faqItem.getId(), (r18 & 2) != 0 ? null : faqItem.getQuestion(), (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                        arrayList.add(create);
                    }
                    rememberedValue = arrayList;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.util.List list3 = (java.util.List) rememberedValue;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null)), "tax_documents_faq_section");
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "faq_section_title"), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_faq_section_title, startRestartGroup, 0), null, null, startRestartGroup, 6, 12);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                if (!list3.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1082436200);
                    com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
                    boolean changedInstance = startRestartGroup.changedInstance(list);
                    boolean z2 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionKt.$r8$lambda$AROn4Hevdd0OSwoRPO4wB3CQhjo(list, function1, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    i4 = 0;
                    i5 = i3;
                    com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical, list3, (kotlin.jvm.functions.Function2) rememberedValue2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "faq_selection_card"), null, false, null, startRestartGroup, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable | 3072, 112);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup = startRestartGroup;
                } else {
                    i4 = 0;
                    i5 = i3;
                    startRestartGroup.startReplaceGroup(-1081910533);
                    startRestartGroup.endReplaceGroup();
                }
                if (z) {
                    startRestartGroup.startReplaceGroup(-1081789292);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, i4);
                    androidx.compose.runtime.Composer composer3 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_faq_view_more, startRestartGroup, i4), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "faq_view_more_button"), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i5 >> 9) & 14) | 1769856, 408);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1081352037);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionKt.m20373$r8$lambda$iJB2ZkvkeqWoFmUXzxBcgG7BA(list, z, function1, function0, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i6;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TaxDocumentsFaqSectionError(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-835199284);
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
            modifier3 = modifier2;
        } else {
            androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-835199284, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionError (TaxDocumentsFaqSection.kt:132)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null)), "tax_documents_faq_section_error");
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
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "faq_section_title"), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_faq_section_title, startRestartGroup, 0), null, null, startRestartGroup, 6, 12);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "faq_section_error_card"), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ComposableSingletons$TaxDocumentsFaqSectionKt.INSTANCE.m20364getLambda$1219650064$tax_and_document_center_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306374, 502);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsFaqSectionKt.$r8$lambda$gJpHMXseZ5PB3qo1maVUyGbMF1A(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AROn4Hevdd0OSwoRPO4wB3CQhjo(java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem) obj).getId(), selectionCardModel.getId())) {
                break;
            }
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem) obj;
        if (faqItem != null) {
            function1.invoke(faqItem);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gJpHMXseZ5PB3qo1maVUyGbMF1A(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxDocumentsFaqSectionError(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iJB2Zk-vkeqWoFm-UXzxBcgG7BA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20373$r8$lambda$iJB2ZkvkeqWoFmUXzxBcgG7BA(java.util.List list, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxDocumentsFaqSection(list, z, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
