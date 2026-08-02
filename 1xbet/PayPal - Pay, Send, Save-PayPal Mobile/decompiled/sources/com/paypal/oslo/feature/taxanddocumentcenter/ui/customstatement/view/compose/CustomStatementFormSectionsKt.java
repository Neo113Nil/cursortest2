package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\n\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\n\u0010\b\u001a?\u0010\u0011\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0014\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\b"}, d2 = {"", "", "optionLabelResIds", "selectedIndex", "Lkotlin/Function1;", "", "onTransactionTypeSelect", "TransactionTypeSection", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onDateFilterSelect", "FilterByDateSection", "Ljava/time/LocalDate;", "fromDate", "toDate", "Lkotlin/Function0;", "onFromDateClick", "onToDateClick", "ChooseDateRangeSection", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onFormatSelect", "FormatSection"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementFormSectionsKt {
    public static final void TransactionTypeSection(final java.util.List<java.lang.Integer> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-464685127);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-464685127, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.TransactionTypeSection (CustomStatementFormSections.kt:39)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_transaction_type_label, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(114204915);
            java.util.List<java.lang.Integer> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(androidx.compose.ui.res.StringResources_androidKt.stringResource(((java.lang.Number) it.next()).intValue(), startRestartGroup, 0));
            }
            startRestartGroup.endReplaceGroup();
            int i4 = i3 << 9;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.m20336FilterSectionnYkSgmE(stringResource, "transaction_type_label", "transaction_type_radio_group", arrayList, i, function1, com.paypal.pds.core.ConstantsKt.getSpacing16(), startRestartGroup, (57344 & i4) | 432 | (i4 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.$r8$lambda$6ITXQcH5h0It_V8lJEuW0oIoGkU(list, i, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FilterByDateSection(final java.util.List<java.lang.Integer> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1700943270);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1700943270, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.FilterByDateSection (CustomStatementFormSections.kt:63)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_filter_by_date_label, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1776070036);
            java.util.List<java.lang.Integer> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(androidx.compose.ui.res.StringResources_androidKt.stringResource(((java.lang.Number) it.next()).intValue(), startRestartGroup, 0));
            }
            startRestartGroup.endReplaceGroup();
            int i4 = i3 << 9;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.m20336FilterSectionnYkSgmE(stringResource, "filter_by_date_label", "filter_by_date_radio_group", arrayList, i, function1, com.paypal.pds.core.ConstantsKt.getSpacing32(), startRestartGroup, (57344 & i4) | 432 | (i4 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.m20339$r8$lambda$MhkhDK2Fcpw30NYymuYneSuQMs(list, i, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ChooseDateRangeSection(final java.time.LocalDate localDate, final java.time.LocalDate localDate2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1148249039);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(localDate2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1148249039, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.ChooseDateRangeSection (CustomStatementFormSections.kt:90)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.m20337SectionWithLabelTN_CM5M(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_choose_date_range_label, startRestartGroup, 0), "choose_date_range_label", com.paypal.pds.core.ConstantsKt.getSpacing32(), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1615562005, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.$r8$lambda$gto3M_zFbijJ8s9AtoIEeOgdJfk(localDate, function0, localDate2, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 24624, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.$r8$lambda$Yzo8ZBuPRUnHBhZvcLkWX3mJuJQ(localDate, localDate2, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FormatSection(final java.util.List<java.lang.Integer> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1843155348);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1843155348, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.FormatSection (CustomStatementFormSections.kt:133)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_format_label, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1745775118);
            java.util.List<java.lang.Integer> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(androidx.compose.ui.res.StringResources_androidKt.stringResource(((java.lang.Number) it.next()).intValue(), startRestartGroup, 0));
            }
            startRestartGroup.endReplaceGroup();
            int i4 = i3 << 9;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.m20336FilterSectionnYkSgmE(stringResource, "format_label", "format_radio_group", arrayList, i, function1, com.paypal.pds.core.ConstantsKt.getSpacing32(), startRestartGroup, (57344 & i4) | 432 | (i4 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.m20338$r8$lambda$92SwzpMznuoYogMimrG3NqjkuE(list, i, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ITXQcH5h0It_V8lJEuW0oIoGkU(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TransactionTypeSection(list, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$92SwzpMzn-uoYogMimrG3NqjkuE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20338$r8$lambda$92SwzpMznuoYogMimrG3NqjkuE(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FormatSection(list, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MhkhDK2Fcpw30NYymuYn-eSuQMs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20339$r8$lambda$MhkhDK2Fcpw30NYymuYneSuQMs(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FilterByDateSection(list, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yzo8ZBuPRUnHBhZvcLkWX3mJuJQ(java.time.LocalDate localDate, java.time.LocalDate localDate2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ChooseDateRangeSection(localDate, localDate2, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gto3M_zFbijJ8s9AtoIEeOgdJfk(java.time.LocalDate localDate, kotlin.jvm.functions.Function0 function0, java.time.LocalDate localDate2, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1615562005, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.ChooseDateRangeSection.<anonymous> (CustomStatementFormSections.kt:96)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "date_range_inputs");
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.ClickableDateInput(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.formatDateOrEmpty(localDate), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_from_label, composer, 0), function0, "from_date_input", androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer, 3072, 0);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.ClickableDateInput(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.formatDateOrEmpty(localDate2), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_custom_statement_to_label, composer, 0), function02, "to_date_input", androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer, 3072, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
