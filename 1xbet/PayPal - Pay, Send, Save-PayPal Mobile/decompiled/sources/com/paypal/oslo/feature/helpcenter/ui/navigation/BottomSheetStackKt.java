package com.paypal.oslo.feature.helpcenter.ui.navigation;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"BottomSheetStack", "", "stackState", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "page", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackEntry;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomSheetStackKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fd  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheetStack(final com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Integer valueOf;
        kotlin.jvm.functions.Function0 function02;
        float f;
        ?? r10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetStackState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1490452698);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bottomSheetStackState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    str3 = str2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        str2 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1490452698, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStack (BottomSheetStack.kt:55)");
                    }
                    boolean canGoBack = bottomSheetStackState.getCanGoBack();
                    int i6 = i3 & 14;
                    boolean z = i6 == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.$r8$lambda$tIbEmUhRLlUj7fE5pjBhlZs9bRg(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(canGoBack, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 0);
                    float mo1415toDpu2uoSUM = ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1415toDpu2uoSUM(bottomSheetStackState.getMaxContentHeight());
                    final androidx.compose.runtime.saveable.SaveableStateHolder rememberSaveableStateHolder = androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
                    final androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> entries = bottomSheetStackState.getEntries();
                    androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> snapshotStateList = entries;
                    com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry = (com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) snapshotStateList);
                    boolean z2 = stackEntry != null && (stackEntry.getReady() ^ true);
                    if (z2) {
                        com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry2 = (com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry) kotlin.collections.CollectionsKt.getOrNull(snapshotStateList, kotlin.collections.CollectionsKt.getLastIndex(snapshotStateList) - 1);
                        if (stackEntry2 != null) {
                            valueOf = java.lang.Integer.valueOf(stackEntry2.getId());
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            java.lang.Integer num = valueOf;
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            if (bottomSheetStackState.getCanGoBack()) {
                                startRestartGroup.startReplaceGroup(-1238504242);
                                startRestartGroup.endReplaceGroup();
                                function02 = null;
                            } else {
                                startRestartGroup.startReplaceGroup(-1238561282);
                                boolean z3 = i6 == 4;
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.m14811$r8$lambda$TQdC37jr3XLrzIEVNYV0kIa3_o(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                            }
                            int i7 = i3 >> 9;
                            com.paypal.oslo.feature.helpcenter.ui.components.BottomSheetTopBarKt.BottomSheetTopBar(str2, function02, function0, startRestartGroup, ((i3 << 3) & 896) | (i7 & 14));
                            androidx.compose.ui.Modifier m1728heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), mo1415toDpu2uoSUM, 0.0f, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1728heightInVpY3zN4$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            str3 = str2;
                            androidx.compose.animation.CrossfadeKt.Crossfade(num, (androidx.compose.ui.Modifier) null, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, "page", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1682337700, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.m14810$r8$lambda$4Z2w9wqPBYDsk88LDCQcaK5WSA(androidx.compose.runtime.snapshots.SnapshotStateList.this, bottomSheetStackState, rememberSaveableStateHolder, function3, (java.lang.Integer) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, 27648, 6);
                            if (!z2) {
                                startRestartGroup.startReplaceGroup(1186743379);
                                f = 0.0f;
                                androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.ui.Modifier.INSTANCE, 0.0f);
                                r10 = 0;
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, alpha);
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
                                function3.invoke(stackEntry, startRestartGroup, java.lang.Integer.valueOf(i7 & 112));
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            } else {
                                f = 0.0f;
                                r10 = 0;
                                startRestartGroup.startReplaceGroup(1186859660);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (!z2) {
                                startRestartGroup.startReplaceGroup(1186949777);
                                androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null));
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), r10);
                                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r10));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, matchParentSize);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1187221740);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                        }
                        valueOf = null;
                        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                        androidx.compose.ui.Modifier modifier42 = modifier3;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        java.lang.Integer num2 = valueOf;
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        if (bottomSheetStackState.getCanGoBack()) {
                        }
                        int i72 = i3 >> 9;
                        com.paypal.oslo.feature.helpcenter.ui.components.BottomSheetTopBarKt.BottomSheetTopBar(str2, function02, function0, startRestartGroup, ((i3 << 3) & 896) | (i72 & 14));
                        androidx.compose.ui.Modifier m1728heightInVpY3zN4$default2 = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), mo1415toDpu2uoSUM, 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
                        int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1728heightInVpY3zN4$default2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, maybeCachedBoxMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        str3 = str2;
                        androidx.compose.animation.CrossfadeKt.Crossfade(num2, (androidx.compose.ui.Modifier) null, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, "page", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1682337700, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.m14810$r8$lambda$4Z2w9wqPBYDsk88LDCQcaK5WSA(androidx.compose.runtime.snapshots.SnapshotStateList.this, bottomSheetStackState, rememberSaveableStateHolder, function3, (java.lang.Integer) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 27648, 6);
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    } else {
                        if (stackEntry != null) {
                            valueOf = java.lang.Integer.valueOf(stackEntry.getId());
                            androidx.compose.ui.Modifier fillMaxWidth$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode52 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier52 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                            androidx.compose.ui.Modifier modifier422 = modifier3;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor52 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            java.lang.Integer num22 = valueOf;
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl52 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl52, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl52, currentCompositionLocalMap52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl52, java.lang.Integer.valueOf(hashCode52), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl52, materializeModifier52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance22 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (bottomSheetStackState.getCanGoBack()) {
                            }
                            int i722 = i3 >> 9;
                            com.paypal.oslo.feature.helpcenter.ui.components.BottomSheetTopBarKt.BottomSheetTopBar(str2, function02, function0, startRestartGroup, ((i3 << 3) & 896) | (i722 & 14));
                            androidx.compose.ui.Modifier m1728heightInVpY3zN4$default22 = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), mo1415toDpu2uoSUM, 0.0f, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy42 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
                            int hashCode222 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1728heightInVpY3zN4$default22);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl222 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl222, maybeCachedBoxMeasurePolicy42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl222, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl222, java.lang.Integer.valueOf(hashCode222), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl222, materializeModifier222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance42 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            str3 = str2;
                            androidx.compose.animation.CrossfadeKt.Crossfade(num22, (androidx.compose.ui.Modifier) null, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, "page", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1682337700, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.m14810$r8$lambda$4Z2w9wqPBYDsk88LDCQcaK5WSA(androidx.compose.runtime.snapshots.SnapshotStateList.this, bottomSheetStackState, rememberSaveableStateHolder, function3, (java.lang.Integer) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, 27648, 6);
                            if (!z2) {
                            }
                            if (!z2) {
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier422;
                        }
                        valueOf = null;
                        androidx.compose.ui.Modifier fillMaxWidth$default222 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy222 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode522 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier522 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
                        androidx.compose.ui.Modifier modifier4222 = modifier3;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor522 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        java.lang.Integer num222 = valueOf;
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl522 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl522, columnMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl522, currentCompositionLocalMap522, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl522, java.lang.Integer.valueOf(hashCode522), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl522, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl522, materializeModifier522, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance222 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        if (bottomSheetStackState.getCanGoBack()) {
                        }
                        int i7222 = i3 >> 9;
                        com.paypal.oslo.feature.helpcenter.ui.components.BottomSheetTopBarKt.BottomSheetTopBar(str2, function02, function0, startRestartGroup, ((i3 << 3) & 896) | (i7222 & 14));
                        androidx.compose.ui.Modifier m1728heightInVpY3zN4$default222 = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), mo1415toDpu2uoSUM, 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy422 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
                        int hashCode2222 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1728heightInVpY3zN4$default222);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2222 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2222, maybeCachedBoxMeasurePolicy422, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2222, currentCompositionLocalMap2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2222, java.lang.Integer.valueOf(hashCode2222), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2222, materializeModifier2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance422 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        str3 = str2;
                        androidx.compose.animation.CrossfadeKt.Crossfade(num222, (androidx.compose.ui.Modifier) null, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, "page", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1682337700, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.m14810$r8$lambda$4Z2w9wqPBYDsk88LDCQcaK5WSA(androidx.compose.runtime.snapshots.SnapshotStateList.this, bottomSheetStackState, rememberSaveableStateHolder, function3, (java.lang.Integer) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 27648, 6);
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier4222;
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.$r8$lambda$4XQzx7sHsjcsEVGE_EsgJj4U5S8(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.this, function0, modifier5, str3, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4XQzx7sHsjcsEVGE_EsgJj4U5S8(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BottomSheetStack(bottomSheetStackState, function0, modifier, str, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4Z2w-9wqPBYDsk88LDCQcaK5WSA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14810$r8$lambda$4Z2w9wqPBYDsk88LDCQcaK5WSA(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, final com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, final kotlin.jvm.functions.Function3 function3, java.lang.Integer num, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object obj;
        if ((i & 6) == 0) {
            i |= composer.changed(num) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1682337700, i, -1, "com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStack.<anonymous>.<anonymous>.<anonymous> (BottomSheetStack.kt:93)");
            }
            if (num != null) {
                composer.startReplaceGroup(-548959447);
                java.util.Iterator<T> it = snapshotStateList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int id = ((com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry) obj).getId();
                    if (num != null && id == num.intValue()) {
                        break;
                    }
                }
                final com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry = (com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry) obj;
                if (stackEntry != null) {
                    composer.startReplaceGroup(-548850451);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    boolean changed = composer.changed(bottomSheetStackState);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.$r8$lambda$DQXHLcnMk0zEPEKQD_c8la7VG8o(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.this, (androidx.compose.ui.unit.IntSize) obj2);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(fillMaxWidth$default, (kotlin.jvm.functions.Function1) rememberedValue);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, onSizeChanged);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    saveableStateHolder.SaveableStateProvider(num, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1158941993, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.m14812$r8$lambda$bqpdriwmBbxS3UhJt9D5WRD4tY(kotlin.jvm.functions.Function3.this, stackEntry, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, composer, 54), composer, (i & 14) | 48);
                    composer.endNode();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-548334394);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-548316538);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DQXHLcnMk0zEPEKQD_c8la7VG8o(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, androidx.compose.ui.unit.IntSize intSize) {
        bottomSheetStackState.updateMaxHeight((int) (intSize.m8776unboximpl() & 4294967295L));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TQdC37jr3XLrzI-EVNYV0kIa3_o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14811$r8$lambda$TQdC37jr3XLrzIEVNYV0kIa3_o(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState) {
        bottomSheetStackState.pop();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bqpdriwmBbxS3UhJt9D5WR-D4tY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14812$r8$lambda$bqpdriwmBbxS3UhJt9D5WRD4tY(kotlin.jvm.functions.Function3 function3, com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1158941993, i, -1, "com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStack.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetStack.kt:103)");
            }
            function3.invoke(stackEntry, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tIbEmUhRLlUj7fE5pjBhlZs9bRg(com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState) {
        bottomSheetStackState.pop();
        return kotlin.Unit.INSTANCE;
    }
}
