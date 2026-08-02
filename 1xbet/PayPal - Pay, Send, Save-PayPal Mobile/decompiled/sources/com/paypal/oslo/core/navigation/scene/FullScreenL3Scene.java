package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R%\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u001b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/FullScreenL3Scene;", "Landroidx/navigation3/scene/Scene;", "Landroidx/navigation3/runtime/NavKey;", "", "key", "", "Landroidx/navigation3/runtime/NavEntry;", "previousEntries", "l3Entry", "Lkotlin/Function0;", "", "onBack", "<init>", "(Ljava/lang/Object;Ljava/util/List;Landroidx/navigation3/runtime/NavEntry;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Ljava/util/List;", "getPreviousEntries", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Landroidx/navigation3/runtime/NavEntry;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "entries", "getEntries", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FullScreenL3Scene implements androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> entries;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object key;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> previousEntries;

    public FullScreenL3Scene(java.lang.Object obj, java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> list, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.key = obj;
        this.previousEntries = list;
        this.getHighSpeedVideoFpsRangesFor = navEntry;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.entries = kotlin.collections.CollectionsKt.listOf(navEntry);
        this.content = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1991578434, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.FullScreenL3Scene$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.core.navigation.scene.FullScreenL3Scene.$r8$lambda$DRKhP3ZlIq4rJmSLAniXBVkgj_g(com.paypal.oslo.core.navigation.scene.FullScreenL3Scene.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
    }

    @Override // androidx.navigation3.scene.Scene
    public final /* bridge */ java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return super.getMetadata();
    }

    @Override // androidx.navigation3.scene.Scene
    /* renamed from: getKey, reason: from getter */
    public final java.lang.Object getGetInputFormats() {
        return this.key;
    }

    @Override // androidx.navigation3.scene.Scene
    public final java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> getPreviousEntries() {
        return this.previousEntries;
    }

    @Override // androidx.navigation3.scene.Scene
    public final java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> getEntries() {
        return this.entries;
    }

    @Override // androidx.navigation3.scene.Scene
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0nQ3rk09sqbj_0aOyCTUQMc5ips(com.paypal.oslo.core.navigation.scene.FullScreenL3Scene fullScreenL3Scene, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-641141580, i, -1, "com.paypal.oslo.core.navigation.scene.FullScreenL3Scene.content.<anonymous>.<anonymous> (OsloScene.kt:810)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, background);
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
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.Boolean bool = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(fullScreenL3Scene.getHighSpeedVideoFpsRangesFor.getMetadata(), com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_ENABLED());
            if (bool == null || bool.booleanValue()) {
                composer.startReplaceGroup(1607242356);
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.RenderNavigationBarFromMetadata(fullScreenL3Scene.getHighSpeedVideoFpsRangesFor.getMetadata(), fullScreenL3Scene.getHighResolutionOutputSizeshNQ4ISI, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1607456907);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), composer, 0);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier consumeWindowInsets = androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.WindowInsets_androidKt.getStatusBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, consumeWindowInsets);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.ScreenContent(fullScreenL3Scene.getHighSpeedVideoFpsRangesFor, composer, 0);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DRKhP3ZlIq4rJmSLAniXBVkgj_g(final com.paypal.oslo.core.navigation.scene.FullScreenL3Scene fullScreenL3Scene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1991578434, i, -1, "com.paypal.oslo.core.navigation.scene.FullScreenL3Scene.content.<anonymous> (OsloScene.kt:809)");
            }
            com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.ScreenEnvironment(fullScreenL3Scene.getHighSpeedVideoFpsRangesFor, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-641141580, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.core.navigation.scene.FullScreenL3Scene$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.core.navigation.scene.FullScreenL3Scene.$r8$lambda$0nQ3rk09sqbj_0aOyCTUQMc5ips(com.paypal.oslo.core.navigation.scene.FullScreenL3Scene.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
