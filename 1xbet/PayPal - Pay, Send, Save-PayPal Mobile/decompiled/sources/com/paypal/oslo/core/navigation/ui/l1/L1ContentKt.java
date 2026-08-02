package com.paypal.oslo.core.navigation.ui.l1;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"TabbedL1Content", "", "currentDestination", "Landroidx/navigation3/runtime/NavKey;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "tabs", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "modifier", "Landroidx/compose/ui/Modifier;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L1ContentKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TabbedL1Content(final androidx.navigation3.runtime.NavKey navKey, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super androidx.navigation3.runtime.NavKey, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-527571091);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(navKey) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i5 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i5 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i5 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function23 = function22;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i3 != 0) {
                        function22 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-527571091, i5, -1, "com.paypal.oslo.core.navigation.ui.l1.TabbedL1Content (L1Content.kt:46)");
                    }
                    java.util.Iterator<com.paypal.oslo.core.navigation.ui.l1.TabDestination> it = list.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                            break;
                        } else {
                            if (it.next().getDestination().getClass() == navKey.getClass()) {
                                i4 = i7;
                                break;
                            }
                            i7++;
                        }
                    }
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i4);
                    if (valueOf.intValue() < 0) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : 0;
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    if (function22 == null) {
                        startRestartGroup.startReplaceGroup(-510618690);
                        startRestartGroup.endReplaceGroup();
                        z = true;
                    } else {
                        startRestartGroup.startReplaceGroup(-510618689);
                        z = true;
                        com.paypal.oslo.core.navigation.ui.l1.L1ComponentsKt.L1ContentHeader(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(897829980, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.l1.L1ContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.$r8$lambda$LZB1oJpPA7ABVp6ZSVAfULKd82I(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 48, 1);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination : list2) {
                        arrayList.add(new com.paypal.pds.components.TabData(tabDestination.getLabel(), tabDestination.getIcon(), null, 4, null));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                    boolean z2 = (i5 & 112) == 32 ? z : false;
                    boolean changedInstance = startRestartGroup.changedInstance(list);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.l1.L1ContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.$r8$lambda$rJeNb2bLGh0DBDM9Yiudgp3x72M(com.paypal.oslo.core.navigation.AppNavigator.this, list, ((java.lang.Integer) obj).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = function22;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.TabsKt.Tabs(arrayList2, null, intValue, m1701PaddingValuesYgX7TsA$default, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 2);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
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
                    function3.invoke(navKey, startRestartGroup, java.lang.Integer.valueOf((i5 & 14) | ((i5 >> 12) & 112)));
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function23 = function24;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.l1.L1ContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.m11652$r8$lambda$gKnnKzAxh1xRxWHrkTWMB7_8lU(androidx.navigation3.runtime.NavKey.this, appNavigator, list, modifier5, function23, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LZB1oJpPA7ABVp6ZSVAfULKd82I(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(897829980, i, -1, "com.paypal.oslo.core.navigation.ui.l1.TabbedL1Content.<anonymous>.<anonymous>.<anonymous> (L1Content.kt:58)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gKnnKzAxh1xRxWHrkTWMB7_8-lU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11652$r8$lambda$gKnnKzAxh1xRxWHrkTWMB7_8lU(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TabbedL1Content(navKey, appNavigator, list, modifier, function2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oDVZEwSsFvKVaHSFaXiFbJnaLvE(java.util.List list, int i, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.bringToTopOrPush(((com.paypal.oslo.core.navigation.ui.l1.TabDestination) list.get(i)).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rJeNb2bLGh0DBDM9Yiudgp3x72M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.util.List list, final int i) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.l1.L1ContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.$r8$lambda$oDVZEwSsFvKVaHSFaXiFbJnaLvE(list, i, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
