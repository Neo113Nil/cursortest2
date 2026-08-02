package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0002\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"RenderTaxReportCard", "", "report", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;", "onClick", "Lkotlin/Function0;", "onReportLinkClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxReportCardContent", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "reportAvailabilityMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ReportLink", "text", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportCardKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderTaxReportCard(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.SelectionCardModel create;
        int i5;
        java.lang.Object obj;
        androidx.compose.ui.Modifier modifier4;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1651624625);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(taxReport) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i7 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1651624625, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.RenderTaxReportCard (TaxReportCard.kt:62)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), "tax_report_card_".concat(java.lang.String.valueOf(taxReport.getId())));
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
                if (taxReport.getReportInlineNote() != null) {
                    startRestartGroup.startReplaceGroup(406123191);
                    create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(taxReport.getId(), (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1996020042, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.m20377$r8$lambda$umAIPVX3SyXDxzkoIwt63iCnYY(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54)), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(406520642);
                    startRestartGroup.endReplaceGroup();
                    create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(taxReport.getId(), (r18 & 2) != 0 ? null : taxReport.getTitle(), (r18 & 4) != 0 ? null : taxReport.getDescription(), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                }
                com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(create);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "selection_card_".concat(java.lang.String.valueOf(taxReport.getId())));
                com.paypal.pds.components.SelectionCardConfig.Vertical vertical2 = vertical;
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.m20375$r8$lambda$FX89iwmE_UCh5cx50MOMgoA(kotlin.jvm.functions.Function0.this, (com.paypal.pds.components.SelectionCardModel) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical2, listOf, (kotlin.jvm.functions.Function2) rememberedValue, testTag2, null, false, null, startRestartGroup, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 80);
                if (taxReport.getReportOutlineNote() != null) {
                    startRestartGroup.startReplaceGroup(407190676);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    i5 = 1;
                    obj = null;
                    modifier4 = modifier2;
                    i6 = i4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ContextualAlertKt.ContextualAlert(taxReport.getReportOutlineNote().getMessage(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "report_outline_note_".concat(java.lang.String.valueOf(taxReport.getId()))), com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Neutral.$stable << 6, 0);
                    composer2.endReplaceGroup();
                } else {
                    i5 = 1;
                    obj = null;
                    modifier4 = modifier2;
                    i6 = i4;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(407537597);
                    composer2.endReplaceGroup();
                }
                if (taxReport.getReportLink() != null) {
                    composer2.startReplaceGroup(407677748);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                    getHighResolutionOutputSizeshNQ4ISI(taxReport.getReportLink().getText(), function02, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i5, obj), "report_link_".concat(java.lang.String.valueOf(taxReport.getId()))), composer2, (i6 >> 3) & 112, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(407993917);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.m20376$r8$lambda$S1LGguRacG1o4aZSx587gL5UNc(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport.this, function0, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final java.lang.String str2, java.lang.String str3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final java.lang.String str4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(964887703);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            str4 = str3;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(964887703, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardContent (TaxReportCard.kt:140)");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            if (str3 != null) {
                sb.append(", ");
                sb.append(str3);
            }
            final java.lang.String obj = sb.toString();
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed = startRestartGroup.changed(obj);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.$r8$lambda$B7nDpyEOx7aBl3urSnzPqSDJDaU(obj, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, (i3 & 14) | 432, 6, 1016);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 432, 6, 1016);
            str4 = str3;
            if (str4 == null) {
                startRestartGroup = startRestartGroup;
                startRestartGroup.startReplaceGroup(1646359736);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup = startRestartGroup;
                startRestartGroup.startReplaceGroup(1646359737);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing2()), startRestartGroup, 0);
                com.paypal.pds.components.BadgeEmphasis badgeEmphasis = com.paypal.pds.components.BadgeEmphasis.Default;
                com.paypal.pds.components.BadgeStyle.Info info = com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
                com.paypal.pds.components.BadgeSize.Medium medium = com.paypal.pds.components.BadgeSize.Medium.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "report_inline_note_badge");
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.$r8$lambda$u7k1crsvsZP1SJStGP1ATq9hQsU((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.BadgeKt.Badge(str3, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue2), info, badgeEmphasis, medium, null, null, startRestartGroup, ((i3 >> 6) & 14) | 1797504, 0);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.$r8$lambda$L4b9h9f8BklRXg0LDNvlwhmTQ50(str, str2, str4, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1828691874);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1828691874, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.ReportLink (TaxReportCard.kt:202)");
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(modifier4, null, null, false, null, null, function0, startRestartGroup, ((i3 >> 6) & 14) | ((i3 << 15) & 3670016), 31), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 1, null), "report_link"), com.paypal.pds.core.Color.ContentLink.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LinkSmall.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportCardKt.m20374$r8$lambda$01N27U8Y_FP5KpXjFoh2nbkBOE(str, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$01N27U8Y_F-P5KpXjFoh2nbkBOE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20374$r8$lambda$01N27U8Y_FP5KpXjFoh2nbkBOE(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B7nDpyEOx7aBl3urSnzPqSDJDaU(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$F-X89iwm-E-_UCh5cx50M-OMgoA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20375$r8$lambda$FX89iwmE_UCh5cx50MOMgoA(kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L4b9h9f8BklRXg0LDNvlwhmTQ50(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, str2, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S1LG-guRacG1o4aZSx587gL5UNc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20376$r8$lambda$S1LGguRacG1o4aZSx587gL5UNc(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderTaxReportCard(taxReport, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u7k1crsvsZP1SJStGP1ATq9hQsU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$umAIP-VX3SyXDxzkoIwt63iCnYY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20377$r8$lambda$umAIPVX3SyXDxzkoIwt63iCnYY(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1996020042, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.RenderTaxReportCard.<anonymous>.<anonymous> (TaxReportCard.kt:74)");
            }
            getHighSpeedVideoFpsRanges(taxReport.getTitle(), taxReport.getDescription(), taxReport.getReportInlineNote().getMessage(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
