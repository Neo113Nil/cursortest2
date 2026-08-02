package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"AppBarRow", "", "overflowIndicator", "Lkotlin/Function1;", "Landroidx/compose/material3/AppBarMenuState;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "maxItemCount", "", "content", "Landroidx/compose/material3/AppBarRowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "material3", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/compose/material3/AppBarRowScopeImpl;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppBarRowKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppBarRow(final kotlin.jvm.functions.Function3<? super androidx.compose.material3.AppBarMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.ui.Modifier modifier, int i, final kotlin.jvm.functions.Function1<? super androidx.compose.material3.AppBarRowScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1891322548);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                } else {
                    companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        i6 = Integer.MAX_VALUE;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1891322548, i4, -1, "androidx.compose.material3.AppBarRow (AppBarRow.kt:56)");
                    }
                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i4 >> 9) & 14);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.AppBarRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.material3.AppBarRowKt.$r8$lambda$e55peZeIOS5lu3pJejaSxYEfV9c(androidx.compose.runtime.State.this);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new androidx.compose.material3.AppBarMenuState();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.material3.AppBarMenuState appBarMenuState = (androidx.compose.material3.AppBarMenuState) rememberedValue2;
                    androidx.compose.material3.AppBarOverflowState rememberAppBarOverflowState = androidx.compose.material3.AppBarDslKt.rememberAppBarOverflowState(startRestartGroup, 0);
                    boolean changed = startRestartGroup.changed(rememberAppBarOverflowState);
                    boolean z = (i4 & 896) == 256;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new androidx.compose.material3.OverflowMeasurePolicy(rememberAppBarOverflowState, i6, false);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts = androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.jvm.functions.Function2[]{androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(68955781, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.AppBarRowKt$AppBarRow$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            androidx.compose.runtime.Composer composer3 = composer2;
                            int intValue = num.intValue();
                            if (composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(68955781, intValue, -1, "androidx.compose.material3.AppBarRow.<anonymous> (AppBarRow.kt:71)");
                                }
                                java.util.List<androidx.compose.material3.AppBarItem> items = androidx.compose.material3.AppBarRowKt.access$AppBarRow$lambda$2(state).getItems();
                                int size = items.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    items.get(i8).AppbarContent(composer3, 0);
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-815780026, true, new androidx.compose.material3.AppBarRowKt$AppBarRow$2(function3, appBarMenuState, rememberAppBarOverflowState, state), startRestartGroup, 54)}));
                    androidx.compose.material3.OverflowMeasurePolicy overflowMeasurePolicy = (androidx.compose.material3.OverflowMeasurePolicy) rememberedValue3;
                    boolean changed2 = startRestartGroup.changed(overflowMeasurePolicy);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.createMeasurePolicy(overflowMeasurePolicy);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue4;
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                final int i8 = i6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.AppBarRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.AppBarRowKt.$r8$lambda$aiWZoFi9eINgblH1czGDblGJKMA(kotlin.jvm.functions.Function3.this, modifier3, i8, function1, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i3 & 8) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            final int i82 = i6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i3 & 8) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        final int i822 = i6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aiWZoFi9eINgblH1czGDblGJKMA(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.Modifier modifier, int i, kotlin.jvm.functions.Function1 function1, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        AppBarRow(function3, modifier, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.material3.AppBarRowScopeImpl $r8$lambda$e55peZeIOS5lu3pJejaSxYEfV9c(androidx.compose.runtime.State state) {
        androidx.compose.material3.AppBarRowScopeImpl appBarRowScopeImpl = new androidx.compose.material3.AppBarRowScopeImpl(new androidx.compose.material3.AppBarScopeImpl());
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(appBarRowScopeImpl);
        return appBarRowScopeImpl;
    }

    public static final /* synthetic */ androidx.compose.material3.AppBarRowScopeImpl access$AppBarRow$lambda$2(androidx.compose.runtime.State state) {
        return (androidx.compose.material3.AppBarRowScopeImpl) state.getValue();
    }
}
