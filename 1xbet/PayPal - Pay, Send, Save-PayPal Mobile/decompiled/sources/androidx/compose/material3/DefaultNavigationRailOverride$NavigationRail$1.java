package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultNavigationRailOverride$NavigationRail$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.NavigationRailOverrideScope getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        float f;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1027527987, intValue, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail.<anonymous> (NavigationRail.kt:149)");
            }
            androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1747widthInVpY3zN4$default(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), this.getHighSpeedVideoSizes.getWindowInsets()), androidx.compose.material3.tokens.NavigationRailCollapsedTokens.INSTANCE.m4856getNarrowContainerWidthD9Ej5fM(), 0.0f, 2, null), 0.0f, androidx.compose.material3.NavigationRailKt.getNavigationRailVerticalPadding(), 1, null));
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultNavigationRailOverride$NavigationRail$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DefaultNavigationRailOverride$NavigationRail$1.getHighSpeedVideoFpsRanges((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(selectableGroup, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.material3.NavigationRailKt.getNavigationRailVerticalPadding());
            androidx.compose.material3.NavigationRailOverrideScope navigationRailOverrideScope = this.getHighSpeedVideoSizes;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, centerHorizontally, composer2, 54);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, semantics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> header = navigationRailOverrideScope.getHeader();
            if (header != null) {
                composer2.startReplaceGroup(-548298554);
                header.invoke(columnScopeInstance, composer2, 6);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                f = androidx.compose.material3.NavigationRailKt.getHighSpeedVideoSizes;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(companion, f), composer2, 6);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-548182273);
                composer2.endReplaceGroup();
            }
            navigationRailOverrideScope.getContent().invoke(columnScopeInstance, composer2, 6);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    DefaultNavigationRailOverride$NavigationRail$1(androidx.compose.material3.NavigationRailOverrideScope navigationRailOverrideScope) {
        this.getHighSpeedVideoSizes = navigationRailOverrideScope;
    }
}
