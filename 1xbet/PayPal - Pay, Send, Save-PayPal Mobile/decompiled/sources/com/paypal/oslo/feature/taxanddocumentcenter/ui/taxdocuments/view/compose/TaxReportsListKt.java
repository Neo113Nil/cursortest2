package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"RenderTaxReportsList", "", "reports", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;", "onReportCardClick", "Lkotlin/Function1;", "onReportLinkClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportsListKt {
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0151, code lost:
    
        if (r9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
    
        if (r13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderTaxReportsList(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-941328658);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i5 = 32;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = 256;
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i4;
            int i8 = 1;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-941328658, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.RenderTaxReportsList (TaxReportsList.kt:37)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), "tax_reports_list");
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
                startRestartGroup.startReplaceGroup(-1507906077);
                int i9 = 0;
                for (java.lang.Object obj3 : list) {
                    if (i9 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj3;
                    int i10 = (i3 & 112) == i5 ? i8 : 0;
                    boolean changedInstance = startRestartGroup.changedInstance(taxReport);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((i10 | (changedInstance ? 1 : 0)) == 0) {
                        obj = rememberedValue;
                    }
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsListKt.$r8$lambda$W4Z27aaza81GOkFrvdb7LOK_T8k(kotlin.jvm.functions.Function1.this, taxReport);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function0);
                    obj = function0;
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj;
                    int i11 = (i3 & 896) == i6 ? i8 : 0;
                    boolean changedInstance2 = startRestartGroup.changedInstance(taxReport);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((i11 | (changedInstance2 ? 1 : 0)) == 0) {
                        obj2 = rememberedValue2;
                    }
                    kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsListKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsListKt.$r8$lambda$5hPoPf5dVoMY4ukQfGS6GjaF_x8(kotlin.jvm.functions.Function1.this, taxReport);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function03);
                    obj2 = function03;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    int i12 = i9;
                    int i13 = i8;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.RenderTaxReportCard(taxReport, function02, (kotlin.jvm.functions.Function0) obj2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i8, null), startRestartGroup, 3072, 0);
                    if (i12 < kotlin.collections.CollectionsKt.getLastIndex(list)) {
                        startRestartGroup.startReplaceGroup(-1817608091);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1817534094);
                        startRestartGroup.endReplaceGroup();
                    }
                    i9 = i12 + 1;
                    i8 = i13;
                    modifier4 = modifier5;
                    i5 = 32;
                    i6 = 256;
                }
                modifier3 = modifier4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsListKt.m20384$r8$lambda$1dVNRXJ0ATAnAAwXstHgE8MQg(list, function1, function12, modifier6, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        int i82 = 1;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$1d-VNRXJ0ATAn-AAwXstHgE8MQg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20384$r8$lambda$1dVNRXJ0ATAnAAwXstHgE8MQg(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderTaxReportsList(list, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5hPoPf5dVoMY4ukQfGS6GjaF_x8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        function1.invoke(taxReport);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W4Z27aaza81GOkFrvdb7LOK_T8k(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        function1.invoke(taxReport);
        return kotlin.Unit.INSTANCE;
    }
}
