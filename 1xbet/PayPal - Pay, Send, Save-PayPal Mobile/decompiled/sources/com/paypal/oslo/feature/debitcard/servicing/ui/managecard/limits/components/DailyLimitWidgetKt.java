package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0002\u0010\f\u001a?\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0018²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, d2 = {"DailyLimitWidget", "", "title", "", "rowDataList", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/limits/model/DailyLimit;", "onItemClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "testTags", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "DailyLimitListItemView", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "showDescription", "", "testTag", "onListItemClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DailyLimitRowListItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "DailyLimitWidgetPreview", "debit-card_prodRelease", "selectedLimit"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DailyLimitWidgetKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DailyLimitWidget(final java.lang.String str, final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.util.List<java.lang.String> list2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final java.util.List<java.lang.String> list3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.util.List<java.lang.String> list4;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-967364675);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i5 |= 24576;
            } else if ((i & 24576) == 0) {
                list3 = list2;
                i5 |= startRestartGroup.changedInstance(list3) ? 16384 : 8192;
                i4 = i5;
                if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    if (i3 != 0) {
                        list3 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-967364675, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidget (DailyLimitWidget.kt:80)");
                    }
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    java.util.List<java.lang.String> list5 = list3;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), str, null, null, startRestartGroup, ((i4 << 3) & 112) | 6, 12);
                    androidx.compose.runtime.Composer composer3 = startRestartGroup;
                    int i7 = 256;
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), 1, null), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24()), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 384, 0), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 48, 0), com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getDAILY_LIMITS_WIDGET()), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1706padding3ABfNKs);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(501964780);
                    int i8 = 0;
                    for (java.lang.Object obj : list) {
                        if (i8 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) obj;
                        java.lang.String title = dailyLimit.getTitle();
                        java.lang.String amount = dailyLimit.getAmount();
                        boolean showDescription = dailyLimit.getShowDescription();
                        if (i8 < 0 || i8 >= list5.size()) {
                            list4 = list5;
                            str2 = "";
                        } else {
                            list4 = list5;
                            str2 = list4.get(i8);
                        }
                        java.lang.String str3 = str2;
                        boolean z = (i4 & 896) == i7;
                        boolean changed = composer3.changed(dailyLimit);
                        java.lang.Object rememberedValue = composer3.rememberedValue();
                        if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.m14425$r8$lambda$5WDvCqPj_4EXdvlF6gfwnDwQ(kotlin.jvm.functions.Function1.this, dailyLimit);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.Composer composer4 = composer3;
                        DailyLimitListItemView(title, amount, showDescription, str3, (kotlin.jvm.functions.Function0) rememberedValue, composer4, 0, 0);
                        i8++;
                        list5 = list4;
                        i7 = 256;
                        composer3 = composer4;
                    }
                    java.util.List<java.lang.String> list6 = list5;
                    composer2 = composer3;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    list3 = list6;
                    modifier2 = modifier4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.m14427$r8$lambda$X6m3LITvjPQZy45uplzoPhLOL4(str, list, function1, modifier2, list3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            list3 = list2;
            i4 = i5;
            if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        list3 = list2;
        i4 = i5;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DailyLimitListItemView(final java.lang.String str, final java.lang.String str2, final boolean z, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final java.lang.String str4;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer composer3;
        int i6;
        java.lang.String str5;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item other_cash_withdrawals_info_icon;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(594339079);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str4 = str3;
            i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function03 = function02;
                } else {
                    java.lang.String str6 = i7 != 0 ? "" : str4;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(594339079, i5, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitListItemView (DailyLimitWidget.kt:137)");
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    java.lang.String str7 = str6;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, i5 & 14, 0, 2046);
                    com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
                    com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                    if (z) {
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(-826416076);
                        i6 = 0;
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_info_icon_content_description, composer3, 0);
                        composer3.endReplaceGroup();
                        str5 = stringResource;
                    } else {
                        composer3 = startRestartGroup;
                        i6 = 0;
                        composer3.startReplaceGroup(-826255961);
                        composer3.endReplaceGroup();
                        str5 = null;
                    }
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    composer3.startReplaceGroup(1220277313);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_purchases, composer3, i6))) {
                        other_cash_withdrawals_info_icon = com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getPURCHASE_INFO_ICON();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_atm, composer3, i6))) {
                        other_cash_withdrawals_info_icon = com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getATM_WITHDRAWALS_INFO_ICON();
                    } else {
                        other_cash_withdrawals_info_icon = com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getOTHER_CASH_WITHDRAWALS_INFO_ICON();
                    }
                    composer3.endReplaceGroup();
                    com.paypal.pds.components.IconButtonKt.IconButton(info, function04, androidx.compose.ui.draw.AlphaKt.alpha(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(companion2, other_cash_withdrawals_info_icon), z ? 1.0f : 0.0f).then(str7.length() > 0 ? androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str7) : androidx.compose.ui.Modifier.INSTANCE), tertiary, small, str5, null, z, false, composer3, ((i5 >> 9) & 112) | 27654 | ((i5 << 15) & 29360128), 320);
                    composer3.endNode();
                    composer2 = composer3;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, null, null, null, null, false, 0, 0, null, null, composer3, (i5 >> 3) & 14, 0, 2046);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                    str4 = str7;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.m14428$r8$lambda$fvbVjA9Oex9WKJ8Wa6oY0Yndw(str, str2, z, str4, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str4 = str3;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$5WDvCqPj_4EXdv--lF6g-fwnDwQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14425$r8$lambda$5WDvCqPj_4EXdvlF6gfwnDwQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit) {
        function1.invoke(dailyLimit);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LDJAXyUQo7T-3tcEEL_Ses6yhKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14426$r8$lambda$LDJAXyUQo7T3tcEEL_Ses6yhKk(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyLimit, "");
        mutableState.setValue(dailyLimit);
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$M05AP3uFJQ2DQgCAN8CbkGkEHJE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-827808936);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-827808936, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetPreview (DailyLimitWidget.kt:211)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit[]{new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PURCHASES, "$3,000.00", "Purchase limit applies in stores and when you enter your card details online.", false, 8, null), new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit("Other cash withdrawals", "$5,000.00", "Cash withdrawal limit applies to ATM transactions and other cash withdrawals.", false, 8, null), new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit("ATM withdrawals", "$5,000.00", "Cash withdrawal limit applies to ATM transactions and other cash withdrawals.", false)});
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.m14426$r8$lambda$LDJAXyUQo7T3tcEEL_Ses6yhKk(com.paypal.pds.components.BottomSheetController.this, mutableState, (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            DailyLimitWidget("Daily limits", listOf, (kotlin.jvm.functions.Function1) rememberedValue3, null, null, startRestartGroup, 6, 24);
            com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) mutableState.getValue();
            if (dailyLimit == null) {
                startRestartGroup.startReplaceGroup(447351140);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(447351141);
                java.lang.String title = dailyLimit.getTitle();
                java.lang.String description = dailyLimit.getDescription();
                boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.$r8$lambda$n4ixk30RhoU_WOH1hEIj1YG2wlM(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.SingleActionModalBottomSheetKt.SingleActionModalBottomSheet(title, description, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, bottomSheetController, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 9) | 384, 48);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.$r8$lambda$M05AP3uFJQ2DQgCAN8CbkGkEHJE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X6m3L-ITvjPQZy45uplzoPhLOL4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14427$r8$lambda$X6m3LITvjPQZy45uplzoPhLOL4(java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.util.List list2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DailyLimitWidget(str, list, function1, modifier, list2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eKrzn8fhEpZeWePo2B0ufhvTaoM(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fvbVjA9Oex9W-KJ8Wa6-oY0Yndw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14428$r8$lambda$fvbVjA9Oex9WKJ8Wa6oY0Yndw(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DailyLimitListItemView(str, str2, z, str3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n4ixk30RhoU_WOH1hEIj1YG2wlM(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rvQYIrUgTj68YwlL1IubrOyL-vc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14429$r8$lambda$rvQYIrUgTj68YwlL1IubrOyLvc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1716044735);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1716044735, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitRowListItemPreview (DailyLimitWidget.kt:185)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
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
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PURCHASES, "$3,000.00", "", false, 8, null));
            startRestartGroup.startReplaceGroup(505520078);
            for (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit : listOf) {
                java.lang.String title = dailyLimit.getTitle();
                java.lang.String amount = dailyLimit.getAmount();
                boolean showDescription = dailyLimit.getShowDescription();
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.$r8$lambda$eKrzn8fhEpZeWePo2B0ufhvTaoM(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                DailyLimitListItemView(title, amount, showDescription, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 8);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.limits.components.DailyLimitWidgetKt.m14429$r8$lambda$rvQYIrUgTj68YwlL1IubrOyLvc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
