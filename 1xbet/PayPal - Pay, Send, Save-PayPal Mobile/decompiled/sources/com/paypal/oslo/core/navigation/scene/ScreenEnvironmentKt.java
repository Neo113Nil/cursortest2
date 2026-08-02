package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/navigation3/runtime/NavEntry;", "Landroidx/navigation3/runtime/NavKey;", "navEntry", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "Landroidx/compose/runtime/Composable;", "content", "ScreenEnvironment", "(Landroidx/navigation3/runtime/NavEntry;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "ScreenContent", "(Landroidx/navigation3/runtime/NavEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenEnvironmentKt {
    public static final void ScreenEnvironment(final androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1575163943);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(navEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1575163943, i2, -1, "com.paypal.oslo.core.navigation.scene.ScreenEnvironment (ScreenEnvironment.kt:42)");
            }
            if (com.paypal.oslo.core.navigation.NavEntryExtensionsKt.isDarkThemeForced(navEntry)) {
                startRestartGroup.startReplaceGroup(1103904447);
                com.paypal.pds.core.ThemeKt.Theme(true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(82917169, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.$r8$lambda$g7oKuWEmB2O9hVcK5EjYSxUQsjs(androidx.navigation3.runtime.NavEntry.this, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1103985388);
                com.paypal.pds.core.ThemeKt.rememberCurrentTheme(startRestartGroup, 0).invoke(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-322661918, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.$r8$lambda$8jSfzpxnLdTN9DUnYW18Pgxl14Y(androidx.navigation3.runtime.NavEntry.this, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.$r8$lambda$zpN1oQHln4d2NSSXCGlxbRPRjv8(androidx.navigation3.runtime.NavEntry.this, function3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1037271602, 0, -1, "com.paypal.oslo.core.navigation.scene.ScreenEnvironment.screenContent (ScreenEnvironment.kt:44)");
        }
        composer.startMovableGroup(-385596076, navEntry);
        function3.invoke(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.screenMarker(androidx.compose.ui.Modifier.INSTANCE, navEntry), composer, 0);
        composer.endMovableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void ScreenContent(final androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1287205419);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(navEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1287205419, i2, -1, "com.paypal.oslo.core.navigation.scene.ScreenContent (ScreenEnvironment.kt:61)");
            }
            androidx.compose.ui.Modifier screenVisibility = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.screenVisibility(androidx.compose.ui.Modifier.INSTANCE);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, screenVisibility);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            navEntry.Content(startRestartGroup, i2 & 14);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.$r8$lambda$qpZ6XpA_oxuA3GQQFMHH8VoDS1k(androidx.navigation3.runtime.NavEntry.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8jSfzpxnLdTN9DUnYW18Pgxl14Y(androidx.navigation3.runtime.NavEntry navEntry, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-322661918, i, -1, "com.paypal.oslo.core.navigation.scene.ScreenEnvironment.<anonymous> (ScreenEnvironment.kt:54)");
            }
            getHighSpeedVideoFpsRanges(navEntry, function3, composer);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g7oKuWEmB2O9hVcK5EjYSxUQsjs(androidx.navigation3.runtime.NavEntry navEntry, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(82917169, i, -1, "com.paypal.oslo.core.navigation.scene.ScreenEnvironment.<anonymous> (ScreenEnvironment.kt:49)");
            }
            getHighSpeedVideoFpsRanges(navEntry, function3, composer);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qpZ6XpA_oxuA3GQQFMHH8VoDS1k(androidx.navigation3.runtime.NavEntry navEntry, int i, androidx.compose.runtime.Composer composer, int i2) {
        ScreenContent(navEntry, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zpN1oQHln4d2NSSXCGlxbRPRjv8(androidx.navigation3.runtime.NavEntry navEntry, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        ScreenEnvironment(navEntry, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
