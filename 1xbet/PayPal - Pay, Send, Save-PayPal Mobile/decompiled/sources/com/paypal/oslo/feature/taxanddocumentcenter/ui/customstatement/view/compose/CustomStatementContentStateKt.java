package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"RenderCustomStatementUiContentState", "", "state", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "isSelectableDatePredicate", "Lkotlin/Function1;", "", "", "onEvent", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementContentStateKt {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderCustomStatementUiContentState(final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content, final kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1617660886);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1617660886, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.RenderCustomStatementUiContentState (CustomStatementContentState.kt:47)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), "custom_statement_content");
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
                androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing64(), 7, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.util.List<java.lang.Integer> transactionTypeLabels = content.getTransactionTypeLabels();
                int selectedTransactionTypeIndex = content.getSelectedTransactionTypeIndex();
                int i6 = i4 & 896;
                boolean z = i6 == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.$r8$lambda$j5qy5eTSbBG9bOVBsxQHZfstnD4(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.TransactionTypeSection(transactionTypeLabels, selectedTransactionTypeIndex, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                java.util.List<java.lang.Integer> dateFilterLabels = content.getDateFilterLabels();
                int selectedDateFilterIndex = content.getSelectedDateFilterIndex();
                boolean z2 = i6 == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.$r8$lambda$q3l2BKiBNh_icNjmHSUr2ElP6pQ(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.FilterByDateSection(dateFilterLabels, selectedDateFilterIndex, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
                java.time.LocalDate fromDate = content.getFromDate();
                java.time.LocalDate toDate = content.getToDate();
                boolean z3 = i6 == 256;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.m20332$r8$lambda$jBpLXX8lc6TnrOzhK48gpqnByc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean z4 = i6 == 256;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.$r8$lambda$w3svQ2fezCdT1STLiFdP9IJpFy0(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.ChooseDateRangeSection(fromDate, toDate, function0, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
                java.util.List<java.lang.Integer> formatLabels = content.getFormatLabels();
                int selectedFormatIndex = content.getSelectedFormatIndex();
                boolean z5 = i6 == 256;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.$r8$lambda$Um4rciwINeiaotU3OmIm16R2Ae8(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormSectionsKt.FormatSection(formatLabels, selectedFormatIndex, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 0);
                startRestartGroup.endNode();
                boolean z6 = i6 == 256;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.m20333$r8$lambda$ynRVLLBi1MFkeVtf0SWNtZJnaw(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementFormComponentsKt.RequestStatementButton((kotlin.jvm.functions.Function0) rememberedValue6, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE), startRestartGroup, 0, 0);
                startRestartGroup.endNode();
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker = content.getActiveDatePicker();
                java.time.LocalDate fromDate2 = content.getFromDate();
                java.time.LocalDate toDate2 = content.getToDate();
                boolean z7 = i6 == 256;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.m20330$r8$lambda$BGjov0ZXgZ3763Cf6U8rU0dedY(kotlin.jvm.functions.Function1.this, (java.time.LocalDate) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue7;
                boolean z8 = i6 == 256;
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (z8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.$r8$lambda$IdhpQd6SL3apxAU9FQt6s8sP37M(kotlin.jvm.functions.Function1.this, (java.time.LocalDate) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue8;
                boolean z9 = i6 == 256;
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (z9 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.m20331$r8$lambda$D3EOrA8pCSTthuig5vRnh1ud0c(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.RenderDatePicker(activeDatePicker, fromDate2, toDate2, function1, function13, function14, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, (i4 << 6) & 7168);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.CustomStatementContentStateKt.$r8$lambda$ruf7S5irZlvjpWHP7rGzM9CoaGw(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content.this, function1, function12, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$BGjov0ZXgZ3-763Cf6U8rU0dedY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20330$r8$lambda$BGjov0ZXgZ3763Cf6U8rU0dedY(kotlin.jvm.functions.Function1 function1, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm(localDate));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D3E-OrA8pCSTthuig5vRnh1ud0c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20331$r8$lambda$D3EOrA8pCSTthuig5vRnh1ud0c(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DatePickerDismiss.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IdhpQd6SL3apxAU9FQt6s8sP37M(kotlin.jvm.functions.Function1 function1, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm(localDate));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Um4rciwINeiaotU3OmIm16R2Ae8(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j5qy5eTSbBG9bOVBsxQHZfstnD4(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect(i));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jBpLXX8lc6TnrOzhK48gpq-nByc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20332$r8$lambda$jBpLXX8lc6TnrOzhK48gpqnByc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q3l2BKiBNh_icNjmHSUr2ElP6pQ(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ruf7S5irZlvjpWHP7rGzM9CoaGw(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderCustomStatementUiContentState(content, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w3svQ2fezCdT1STLiFdP9IJpFy0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ynRVLLBi1MFkeVtf0SWNt-ZJnaw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20333$r8$lambda$ynRVLLBi1MFkeVtf0SWNtZJnaw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
