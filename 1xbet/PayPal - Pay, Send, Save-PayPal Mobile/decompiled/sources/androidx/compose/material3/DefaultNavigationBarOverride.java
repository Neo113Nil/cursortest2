package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/DefaultNavigationBarOverride;", "Landroidx/compose/material3/NavigationBarOverride;", "<init>", "()V", "Landroidx/compose/material3/NavigationBarOverrideScope;", "", "NavigationBar", "(Landroidx/compose/material3/NavigationBarOverrideScope;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultNavigationBarOverride implements androidx.compose.material3.NavigationBarOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultNavigationBarOverride INSTANCE = new androidx.compose.material3.DefaultNavigationBarOverride();

    private DefaultNavigationBarOverride() {
    }

    @Override // androidx.compose.material3.NavigationBarOverride
    public final void NavigationBar(final androidx.compose.material3.NavigationBarOverrideScope navigationBarOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(882141204);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(navigationBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(882141204, i2, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar (NavigationBar.kt:139)");
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(navigationBarOverrideScope.getModifier(), null, navigationBarOverrideScope.getContainerColor(), navigationBarOverrideScope.getContentColor(), navigationBarOverrideScope.getTonalElevation(), 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1991263321, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultNavigationBarOverride$NavigationBar$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    float f;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (!composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1991263321, intValue, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar.<anonymous> (NavigationBar.kt:146)");
                        }
                        androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.material3.NavigationBarOverrideScope.this.getWindowInsets());
                        f = androidx.compose.material3.NavigationBarKt.getHighSpeedVideoFpsRangesFor;
                        androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(windowInsetsPadding, 0.0f, f, 1, null));
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.material3.NavigationBarKt.getNavigationBarItemHorizontalPadding());
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = androidx.compose.material3.NavigationBarOverrideScope.this.getContent();
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, composer4, 54);
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, selectableGroup);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        content.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer4, 6);
                        composer4.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), startRestartGroup, 12582912, 98);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultNavigationBarOverride$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultNavigationBarOverride.$r8$lambda$DGOb_9v4jKoo3EX4A9N945hMg28(androidx.compose.material3.DefaultNavigationBarOverride.this, navigationBarOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DGOb_9v4jKoo3EX4A9N945hMg28(androidx.compose.material3.DefaultNavigationBarOverride defaultNavigationBarOverride, androidx.compose.material3.NavigationBarOverrideScope navigationBarOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultNavigationBarOverride.NavigationBar(navigationBarOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
