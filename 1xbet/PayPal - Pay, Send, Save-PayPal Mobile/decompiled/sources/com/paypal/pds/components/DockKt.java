package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001aY\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"Dock", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "footerLabel", "", "footerSlots", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DockLazyListMidPreview", "(Landroidx/compose/runtime/Composer;I)V", "DockScrollMidPreview", "pds_release", "elevated", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DockKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dock(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.ScrollableState scrollableState, java.lang.String str, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.foundation.gestures.ScrollableState scrollableState2;
        int i4;
        java.lang.String str2;
        int i5;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        int i6;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        androidx.compose.ui.Modifier.Companion companion;
        final java.lang.String str3;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1899252783);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            scrollableState2 = scrollableState;
            i3 |= startRestartGroup.changedInstance(scrollableState2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function23 = function2;
                    i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function24 = function22;
                        i3 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            str3 = str2;
                            function25 = function23;
                            function26 = function24;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            final androidx.compose.foundation.gestures.ScrollableState scrollableState3 = i8 != 0 ? null : scrollableState2;
                            java.lang.String str4 = i4 != 0 ? null : str2;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$1219513027$pds_release = i5 != 0 ? com.paypal.pds.components.ComposableSingletons$DockKt.INSTANCE.getLambda$1219513027$pds_release() : function23;
                            if (i6 != 0) {
                                function24 = com.paypal.pds.components.ComposableSingletons$DockKt.INSTANCE.m21795getLambda$1819256316$pds_release();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1899252783, i3, -1, "com.paypal.pds.components.Dock (Dock.kt:68)");
                            }
                            boolean changed = startRestartGroup.changed(scrollableState3);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return java.lang.Boolean.valueOf(com.paypal.pds.components.DockKt.$r8$lambda$2UoNNkdfhdBQJMfFtA1PUoKYxGw(androidx.compose.foundation.gestures.ScrollableState.this));
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue;
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), 0.0f, 1, null), "content");
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
                            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                            function24.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 12) & 14));
                            startRestartGroup.endNode();
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            if (((java.lang.Boolean) state.getValue()).booleanValue()) {
                                startRestartGroup.startReplaceGroup(1244749852);
                                companion2 = androidx.compose.ui.draw.ShadowKt.m5613shadows4CzXII$default(androidx.compose.ui.draw.ShadowKt.m5613shadows4CzXII$default(androidx.compose.ui.draw.ShadowKt.m5613shadows4CzXII$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), null, false, com.paypal.pds.core.Color.BorderUtilityBadge.INSTANCE.getValue(startRestartGroup, 6), com.paypal.pds.core.Color.BorderUtilityBadge.INSTANCE.getValue(startRestartGroup, 6), 6, null), com.paypal.pds.core.ConstantsKt.getSpacing4(), null, false, com.paypal.pds.core.Color.BorderUtilityBadge.INSTANCE.getValue(startRestartGroup, 6), com.paypal.pds.core.Color.BorderUtilityBadge.INSTANCE.getValue(startRestartGroup, 6), 6, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), null, false, com.paypal.pds.core.Color.BorderUtilityBadge.INSTANCE.getValue(startRestartGroup, 6), com.paypal.pds.core.Color.BorderUtilityBadge.INSTANCE.getValue(startRestartGroup, 6), 6, null);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1245475407);
                                startRestartGroup.endReplaceGroup();
                                companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(fillMaxWidth$default.then(companion2), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), "footer");
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
                            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
                            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (str4 == null) {
                                startRestartGroup.startReplaceGroup(-2027680300);
                                startRestartGroup.endReplaceGroup();
                                function27 = function24;
                                function28 = lambda$1219513027$pds_release;
                            } else {
                                startRestartGroup.startReplaceGroup(-2027680299);
                                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                                function27 = function24;
                                function28 = lambda$1219513027$pds_release;
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str4, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.pds.components.DockTags.FOOTER_LABEL), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, bodySmall, startRestartGroup, 432, 6, 1000);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                            function28.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & 14));
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function26 = function27;
                            scrollableState2 = scrollableState3;
                            str3 = str4;
                            function25 = function28;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final androidx.compose.foundation.gestures.ScrollableState scrollableState4 = scrollableState2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.DockKt.$r8$lambda$8JNHzzAh3VQYCzgKEn0oPeQSMVQ(androidx.compose.ui.Modifier.this, scrollableState4, str3, function25, function26, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function24 = function22;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function24 = function22;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str2 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function23 = function2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function24 = function22;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        scrollableState2 = scrollableState;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function23 = function2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function24 = function22;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ boolean $r8$lambda$2UoNNkdfhdBQJMfFtA1PUoKYxGw(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
        if (scrollableState != null) {
            return scrollableState.getCanScrollBackward() || scrollableState.getCanScrollForward();
        }
        return false;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2pHrlAnGRTtRpukmiMWwmQNPt34(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(745963403, i, -1, "com.paypal.pds.components.DockLazyListMidPreview.<anonymous> (Dock.kt:173)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.DockKt.$r8$lambda$qOt6eIa4nvbqFR6yW6wkKjV7TXc((androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 805306374, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8JNHzzAh3VQYCzgKEn0oPeQSMVQ(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.ScrollableState scrollableState, java.lang.String str, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Dock(modifier, scrollableState, str, function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A0wmoWxWihe19NeJGRGdpfxgK4U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1261128436);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1261128436, updateChangedFlags, -1, "com.paypal.pds.components.DockScrollMidPreview (Dock.kt:192)");
            }
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            final float spacing48 = com.paypal.pds.core.ConstantsKt.getSpacing48();
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.Dp m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(spacing48);
            boolean changed = startRestartGroup.changed(density);
            boolean changed2 = startRestartGroup.changed(rememberScrollState);
            com.paypal.pds.components.DockKt$DockScrollMidPreview$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.DockKt$DockScrollMidPreview$1$1(density, rememberScrollState, 12, spacing48, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(12, m8599boximpl, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 54);
            Dock(null, rememberScrollState, "Additional copy", com.paypal.pds.components.ComposableSingletons$DockKt.INSTANCE.getLambda$1716033871$pds_release(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(506791632, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.DockKt.$r8$lambda$vbG55Y6gnUzuBkAdu_AKYM0Una8(androidx.compose.foundation.ScrollState.this, spacing48, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 28032, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.DockKt.$r8$lambda$A0wmoWxWihe19NeJGRGdpfxgK4U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qOt6eIa4nvbqFR6yW6wkKjV7TXc(androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, 50, null, null, com.paypal.pds.components.ComposableSingletons$DockKt.INSTANCE.getLambda$932391593$pds_release(), 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ubprVqYBj8faBiIsGEgEz4x8yW8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1713140025);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1713140025, updateChangedFlags, -1, "com.paypal.pds.components.DockLazyListMidPreview (Dock.kt:148)");
            }
            final androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(12, 0, startRestartGroup, 6, 2);
            Dock(null, rememberLazyListState, "Additional copy", com.paypal.pds.components.ComposableSingletons$DockKt.INSTANCE.m21794getLambda$1108382134$pds_release(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(745963403, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.DockKt.$r8$lambda$2pHrlAnGRTtRpukmiMWwmQNPt34(androidx.compose.foundation.lazy.LazyListState.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 28032, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.DockKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.DockKt.$r8$lambda$ubprVqYBj8faBiIsGEgEz4x8yW8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vbG55Y6gnUzuBkAdu_AKYM0Una8(androidx.compose.foundation.ScrollState scrollState, float f, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(506791632, i, -1, "com.paypal.pds.components.DockScrollMidPreview.<anonymous> (Dock.kt:228)");
            }
            java.lang.Object obj = null;
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            composer.startReplaceGroup(-1133208193);
            int i2 = 0;
            while (i2 < 50) {
                androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw("Item #".concat(java.lang.String.valueOf(i2)), androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 54, 2), f), (androidx.compose.ui.text.TextStyle) null, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, composer, 0, 1020);
                i2++;
                obj = obj;
            }
            composer.endReplaceGroup();
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
