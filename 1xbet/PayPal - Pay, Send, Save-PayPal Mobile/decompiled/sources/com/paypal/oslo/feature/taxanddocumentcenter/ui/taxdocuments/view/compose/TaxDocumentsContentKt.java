package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001ai\u0010\f\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aX\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportSection;", "taxReportSections", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "", "onSectionInfoClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;", "onReportCardClick", "onReportLinkClick", "RenderTaxDocumentsContent", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p0", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportSection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsContentKt {
    public static final void RenderTaxDocumentsContent(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection> list, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1154422763);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1154422763, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.RenderTaxDocumentsContent (TaxDocumentsContent.kt:43)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt.$r8$lambda$kW2DkFwBRtbOqvTqDDKa13M5hV8(list, function2, function1, function12, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(background, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 0, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt.m20369$r8$lambda$5RKIJWrYHFMTCt71TcRX7ojzM8(list, function2, function1, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(105719021);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(taxReportSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(105719021, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionItem (TaxDocumentsContent.kt:79)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(taxReportSection);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt.$r8$lambda$_sK4oFk2A05Tvad74bKxfFY5J2E(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection.this, function1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, (kotlin.jvm.functions.Function0) rememberedValue, function12, function13, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), startRestartGroup, i2 & 8078, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt.m20372$r8$lambda$iQjOvainnL7YpcP5rTrKh_eB00(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection.this, function1, function12, function13, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$5RKIJWr-YHFMTCt71TcRX7ojzM8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20369$r8$lambda$5RKIJWrYHFMTCt71TcRX7ojzM8(java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderTaxDocumentsContent(list, function2, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7JQbAWLd2V-SVUTmyADrKUgiNBE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20370$r8$lambda$7JQbAWLd2VSVUTmyADrKUgiNBE(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection, final kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1164310419, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.RenderTaxDocumentsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxDocumentsContent.kt:52)");
            }
            boolean changed = composer.changed(function2);
            boolean changedInstance = composer.changedInstance(taxReportSection);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt.m20371$r8$lambda$M3p0l_Tk7GWXPXU1rYLTy4v_ok(kotlin.jvm.functions.Function2.this, taxReportSection, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            getHighResolutionOutputSizeshNQ4ISI(taxReportSection, (kotlin.jvm.functions.Function1) rememberedValue, function1, function12, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M3p0l_Tk7GWXPXU1r-YLTy4v_ok, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20371$r8$lambda$M3p0l_Tk7GWXPXU1rYLTy4v_ok(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function2.invoke(taxReportSection.getSectionTitle(), str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_sK4oFk2A05Tvad74bKxfFY5J2E(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection, kotlin.jvm.functions.Function1 function1) {
        java.lang.String message;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo sectionToolTipInfo = taxReportSection.getSectionToolTipInfo();
        if (sectionToolTipInfo != null && (message = sectionToolTipInfo.getMessage()) != null) {
            function1.invoke(message);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iQj-OvainnL7YpcP5rTrKh_eB00, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20372$r8$lambda$iQjOvainnL7YpcP5rTrKh_eB00(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(taxReportSection, function1, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kW2DkFwBRtbOqvTqDDKa13M5hV8(java.util.List list, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection) it.next();
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, taxReportSection.getSectionType(), null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1164310419, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsContentKt.m20370$r8$lambda$7JQbAWLd2VSVUTmyADrKUgiNBE(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection.this, function2, function1, function12, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
