package com.paypal.oslo.feature.bnplservicing.ui.plandetails.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\u0007\u001a[\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"PlanSummaryItems", "", "items", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "onTooltipClick", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PlanSummary", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "downloadModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/DownloadModel;", "planSummaryAlertModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryAlertModel;", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/DownloadModel;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryAlertModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PlanSummaryFullPreview", "(Landroidx/compose/runtime/Composer;I)V", "PlanSummaryPartialPreview", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanSummaryKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem> list, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function13;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function14;
        int i3;
        androidx.compose.runtime.Composer composer3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function15;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1667849337);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            int i6 = 0;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$lsL5n_706ZCQdwV8siqZOBnwwvc((com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1667849337, i4, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItems (PlanSummary.kt:62)");
                }
                int i7 = 0;
                for (java.lang.Object obj : list) {
                    if (i7 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem2 = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem) obj;
                    if (!kotlin.text.StringsKt.isBlank(planSummaryItem2.getValue())) {
                        startRestartGroup.startReplaceGroup(-893248119);
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_ITEM_ROW_TAG_PREFIX.concat(java.lang.String.valueOf(i7)));
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i6));
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
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function16 = function13;
                        androidx.compose.runtime.Composer composer4 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(planSummaryItem2.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_ITEM_TITLE_TAG_PREFIX.concat(java.lang.String.valueOf(i7))), null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2044);
                        if (planSummaryItem2.getTooltipDescription() != null) {
                            composer4.startReplaceGroup(-1130695431);
                            boolean changed = composer4.changed(planSummaryItem2);
                            java.lang.Object rememberedValue2 = composer4.rememberedValue();
                            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function15 = function16;
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$y6kIwFPVpflx37AVzxYFuWXYEJI(kotlin.jvm.functions.Function1.this, planSummaryItem2);
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue2);
                            } else {
                                function15 = function16;
                            }
                            function14 = function15;
                            planSummaryItem = planSummaryItem2;
                            composer4 = composer4;
                            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Info.INSTANCE, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_TOOLTIP_BUTTON_TAG_PREFIX.concat(java.lang.String.valueOf(i7))), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, null, null, false, false, composer4, 27654, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(-1130695432);
                            composer4.endReplaceGroup();
                            planSummaryItem = planSummaryItem2;
                            function14 = function16;
                        }
                        androidx.compose.runtime.Composer composer5 = composer4;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer5, 0);
                        i3 = 0;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(planSummaryItem.getValue(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_ITEM_VALUE_TAG_PREFIX.concat(java.lang.String.valueOf(i7))), null, null, null, null, false, 0, 0, null, null, composer5, 0, 0, 2044);
                        composer4.endNode();
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                    } else {
                        function14 = function13;
                        i3 = i6;
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(-892060974);
                        composer3.endReplaceGroup();
                    }
                    i7++;
                    startRestartGroup = composer3;
                    function13 = function14;
                    i6 = i3;
                }
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function17 = function13;
                composer2 = startRestartGroup;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function12 = function17;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$wYkHcohEtN_MHGJ9fecmR1OYmQg(list, function12, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        int i62 = 0;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanSummary(final java.lang.String str, final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem> list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel planSummaryAlertModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel2;
        int i5;
        final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel planSummaryAlertModel2;
        int i6;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-398114522);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                downloadModel2 = downloadModel;
                i3 |= startRestartGroup.changed(downloadModel2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    planSummaryAlertModel2 = planSummaryAlertModel;
                    i3 |= startRestartGroup.changedInstance(planSummaryAlertModel2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function12 = function1;
                        i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            function13 = function12;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel3 = i4 != 0 ? null : downloadModel2;
                            if (i5 != 0) {
                                planSummaryAlertModel2 = null;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.m12667$r8$lambda$jB5Fdap9obQCvliT9w25r40FA((com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-398114522, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummary (PlanSummary.kt:116)");
                            }
                            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.m12666$r8$lambda$PpG02CeLLQPT4_z6vAyDmC7sd0((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(modifier3, true, (kotlin.jvm.functions.Function1) rememberedValue2), com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_ROOT_TAG);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                            if (!kotlin.text.StringsKt.isBlank(str)) {
                                startRestartGroup.startReplaceGroup(-1758150169);
                                z = true;
                                com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.Modifier.INSTANCE, str, null, null, startRestartGroup, ((i3 << 3) & 112) | 6, 12);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                z = true;
                                startRestartGroup.startReplaceGroup(-1758048954);
                                startRestartGroup.endReplaceGroup();
                            }
                            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel planSummaryAlertModel3 = planSummaryAlertModel2;
                            kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function14 = function12;
                            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel4 = downloadModel3;
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_CARD_TAG), com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1621417854, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$NbBrGfIueLNFNoCoaUbB1M_1UY0(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel.this, list, function12, downloadModel3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306422, 500);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            downloadModel2 = downloadModel4;
                            function13 = function14;
                            planSummaryAlertModel2 = planSummaryAlertModel3;
                            modifier2 = modifier4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel5 = downloadModel2;
                            final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel planSummaryAlertModel4 = planSummaryAlertModel2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$sqcqm9k9aYiXs6bmsd_zRbN20Zg(str, list, modifier2, downloadModel5, planSummaryAlertModel4, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                planSummaryAlertModel2 = planSummaryAlertModel;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function12 = function1;
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            downloadModel2 = downloadModel;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            planSummaryAlertModel2 = planSummaryAlertModel;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        downloadModel2 = downloadModel;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        planSummaryAlertModel2 = planSummaryAlertModel;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NbBrGfIueLNFNoCoaUbB1M_1UY0(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel planSummaryAlertModel, java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel, androidx.compose.runtime.Composer composer, int i) {
        java.util.List list2;
        kotlin.jvm.functions.Function1 function12;
        androidx.compose.runtime.Composer composer2;
        int i2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1621417854, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummary.<anonymous>.<anonymous> (PlanSummary.kt:134)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            if (planSummaryAlertModel == null) {
                composer.startReplaceGroup(616381477);
                composer.endReplaceGroup();
                list2 = list;
                function12 = function1;
                composer2 = composer;
                i2 = 0;
            } else {
                composer.startReplaceGroup(616381478);
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(com.paypal.pds.core.RichTextKt.toRichText(planSummaryAlertModel.getAlertMessage(), planSummaryAlertModel.getSpanList()), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_ALERT_TAG), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, planSummaryAlertModel.getOnLinkClick(), null, null, composer, 432, 0, 7160);
                composer.endReplaceGroup();
                list2 = list;
                function12 = function1;
                composer2 = composer;
                i2 = 0;
            }
            getHighSpeedVideoFpsRangesFor(list2, function12, composer2, i2, i2);
            if (downloadModel == null) {
                composer2.startReplaceGroup(617120672);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(617120673);
                com.paypal.pds.components.ButtonKt.Button(downloadModel.getAction(), downloadModel.getLabel(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.PLAN_SUMMARY_DOWNLOAD_BUTTON), com.paypal.pds.core.Icon.ChevronDown.INSTANCE, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, composer, 200064, 464);
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

    /* renamed from: $r8$lambda$PpG02CeLLQPT-4_z6vAyDmC7sd0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12666$r8$lambda$PpG02CeLLQPT4_z6vAyDmC7sd0(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TWu6Ne76jnWBYUye_ycUjJ4LW8o(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(791430955);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(791430955, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryFullPreview (PlanSummary.kt:208)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.DOWNLOAD_BUTTON_LABEL, (kotlin.jvm.functions.Function0) rememberedValue);
            java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem> test_items = com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.INSTANCE.getTEST_ITEMS();
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel test_alert_config = com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.INSTANCE.getTEST_ALERT_CONFIG();
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$_dFeqw1w2fFUCt0MlGG4GY_nJSA((com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PlanSummary(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.TITLE, test_items, m1706padding3ABfNKs, downloadModel, test_alert_config, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 196998, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$TWu6Ne76jnWBYUye_ycUjJ4LW8o(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_MQLKQ_ity2S9zmU25mA4FgWKac(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1193992713);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1193992713, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryPartialPreview (PlanSummary.kt:226)");
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem> partial_test_items = com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.INSTANCE.getPARTIAL_TEST_ITEMS();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PlanSummary(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.TITLE, partial_test_items, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryTestTag.DOWNLOAD_BUTTON_LABEL, (kotlin.jvm.functions.Function0) rememberedValue), null, null, startRestartGroup, 390, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryKt.$r8$lambda$_MQLKQ_ity2S9zmU25mA4FgWKac(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_dFeqw1w2fFUCt0MlGG4GY_nJSA(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planSummaryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jB5F-dap-9obQCvliT9w25r40FA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12667$r8$lambda$jB5Fdap9obQCvliT9w25r40FA(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planSummaryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lsL5n_706ZCQdwV8siqZOBnwwvc(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planSummaryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sqcqm9k9aYiXs6bmsd_zRbN20Zg(java.lang.String str, java.util.List list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.DownloadModel downloadModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryAlertModel planSummaryAlertModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanSummary(str, list, modifier, downloadModel, planSummaryAlertModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wYkHcohEtN_MHGJ9fecmR1OYmQg(java.util.List list, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y6kIwFPVpflx37AVzxYFuWXYEJI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem) {
        function1.invoke(planSummaryItem);
        return kotlin.Unit.INSTANCE;
    }
}
