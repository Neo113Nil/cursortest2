package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/DefaultShortNavigationBarOverride;", "Landroidx/compose/material3/ShortNavigationBarOverride;", "<init>", "()V", "Landroidx/compose/material3/ShortNavigationBarOverrideScope;", "", "ShortNavigationBar", "(Landroidx/compose/material3/ShortNavigationBarOverrideScope;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultShortNavigationBarOverride implements androidx.compose.material3.ShortNavigationBarOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultShortNavigationBarOverride INSTANCE = new androidx.compose.material3.DefaultShortNavigationBarOverride();

    private DefaultShortNavigationBarOverride() {
    }

    @Override // androidx.compose.material3.ShortNavigationBarOverride
    public final void ShortNavigationBar(final androidx.compose.material3.ShortNavigationBarOverrideScope shortNavigationBarOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(256157474);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(shortNavigationBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(256157474, i2, -1, "androidx.compose.material3.DefaultShortNavigationBarOverride.ShortNavigationBar (ShortNavigationBar.kt:122)");
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(shortNavigationBarOverrideScope.getModifier(), null, shortNavigationBarOverrideScope.getContainerColor(), shortNavigationBarOverrideScope.getContentColor(), 0.0f, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(236236519, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultShortNavigationBarOverride$ShortNavigationBar$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.compose.material3.CenteredContentMeasurePolicy centeredContentMeasurePolicy;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (!composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(236236519, intValue, -1, "androidx.compose.material3.DefaultShortNavigationBarOverride.ShortNavigationBar.<anonymous> (ShortNavigationBar.kt:124)");
                        }
                        androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.ShortNavigationBarOverrideScope.this.getWindowInsets()), 0.0f, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.m4832getContainerHeightD9Ej5fM(), 1, null));
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = androidx.compose.material3.ShortNavigationBarOverrideScope.this.getContent();
                        int arrangement = androidx.compose.material3.ShortNavigationBarOverrideScope.this.getArrangement();
                        if (androidx.compose.material3.ShortNavigationBarArrangement.m3740equalsimpl0(arrangement, androidx.compose.material3.ShortNavigationBarArrangement.INSTANCE.m3745getEqualWeightLnnQw40())) {
                            centeredContentMeasurePolicy = new androidx.compose.material3.EqualWeightContentMeasurePolicy();
                        } else if (androidx.compose.material3.ShortNavigationBarArrangement.m3740equalsimpl0(arrangement, androidx.compose.material3.ShortNavigationBarArrangement.INSTANCE.m3744getCenteredLnnQw40())) {
                            centeredContentMeasurePolicy = new androidx.compose.material3.CenteredContentMeasurePolicy();
                        } else {
                            throw new java.lang.IllegalArgumentException("Invalid ItemsArrangement value.");
                        }
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, centeredContentMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        content.invoke(composer4, 0);
                        composer4.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), startRestartGroup, 12582912, 114);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultShortNavigationBarOverride$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultShortNavigationBarOverride.$r8$lambda$9xpIuSlBbSNvseUapolH8Yph8aY(androidx.compose.material3.DefaultShortNavigationBarOverride.this, shortNavigationBarOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9xpIuSlBbSNvseUapolH8Yph8aY(androidx.compose.material3.DefaultShortNavigationBarOverride defaultShortNavigationBarOverride, androidx.compose.material3.ShortNavigationBarOverrideScope shortNavigationBarOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultShortNavigationBarOverride.ShortNavigationBar(shortNavigationBarOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
