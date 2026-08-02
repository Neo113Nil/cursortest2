package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R%\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/L0OnlyScene;", "Landroidx/navigation3/scene/Scene;", "Landroidx/navigation3/runtime/NavKey;", "", "key", "", "Landroidx/navigation3/runtime/NavEntry;", "previousEntries", "l0Entry", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "topBarConfig", "Lkotlin/Function0;", "", "onBack", "<init>", "(Ljava/lang/Object;Ljava/util/List;Landroidx/navigation3/runtime/NavEntry;Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Ljava/util/List;", "getPreviousEntries", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Landroidx/navigation3/runtime/NavEntry;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "entries", "getEntries", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class L0OnlyScene implements androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> entries;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.ui.TopBarConfig Camera2StreamConfigurationMap;
    private final androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    private final java.lang.Object key;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> previousEntries;

    public L0OnlyScene(java.lang.Object obj, java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> list, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry, com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.key = obj;
        this.previousEntries = list;
        this.getHighSpeedVideoFpsRangesFor = navEntry;
        this.Camera2StreamConfigurationMap = topBarConfig;
        this.getHighSpeedVideoSizes = function0;
        this.entries = kotlin.collections.CollectionsKt.listOf(navEntry);
        this.content = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(150697332, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.L0OnlyScene$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.core.navigation.scene.L0OnlyScene.$r8$lambda$8n1fGu3pqvsByZUjN3YaSp75344(com.paypal.oslo.core.navigation.scene.L0OnlyScene.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
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

    /* renamed from: $r8$lambda$5u422B-UFxni_poftOS7PXX_xeA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11610$r8$lambda$5u422BUFxni_poftOS7PXX_xeA(final com.paypal.oslo.core.navigation.scene.L0OnlyScene l0OnlyScene, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1154886554, i, -1, "com.paypal.oslo.core.navigation.scene.L0OnlyScene.content.<anonymous>.<anonymous> (OsloScene.kt:863)");
            }
            com.paypal.oslo.core.navigation.scene.effect.GlowEffectKt.L0BackgroundWithGlow(modifier, false, 0.0f, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1889593616, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.L0OnlyScene$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.L0OnlyScene.$r8$lambda$J9TIKOH1xLYOfJ8m51zd7LSFIf4(com.paypal.oslo.core.navigation.scene.L0OnlyScene.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, (i & 14) | 24576, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8n1fGu3pqvsByZUjN3YaSp75344(final com.paypal.oslo.core.navigation.scene.L0OnlyScene l0OnlyScene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(150697332, i, -1, "com.paypal.oslo.core.navigation.scene.L0OnlyScene.content.<anonymous> (OsloScene.kt:862)");
            }
            com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.ScreenEnvironment(l0OnlyScene.getHighSpeedVideoFpsRangesFor, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1154886554, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.core.navigation.scene.L0OnlyScene$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.core.navigation.scene.L0OnlyScene.m11610$r8$lambda$5u422BUFxni_poftOS7PXX_xeA(com.paypal.oslo.core.navigation.scene.L0OnlyScene.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bc2SHuTFrk10qjIEDzFoUsQsUuI(androidx.compose.foundation.layout.ColumnScope columnScope, com.paypal.oslo.core.navigation.scene.L0OnlyScene l0OnlyScene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(773951482, i, -1, "com.paypal.oslo.core.navigation.scene.L0OnlyScene.content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OsloScene.kt:883)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScope, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            com.paypal.oslo.core.navigation.scene.ScreenEnvironmentKt.ScreenContent(l0OnlyScene.getHighSpeedVideoFpsRangesFor, composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J9TIKOH1xLYOfJ8m51zd7LSFIf4(final com.paypal.oslo.core.navigation.scene.L0OnlyScene l0OnlyScene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1889593616, i, -1, "com.paypal.oslo.core.navigation.scene.L0OnlyScene.content.<anonymous>.<anonymous>.<anonymous> (OsloScene.kt:864)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            final androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.core.ThemeKt.Theme(true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1270590429, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.L0OnlyScene$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.L0OnlyScene.m11611$r8$lambda$JiYKyBUbce3jeW8UzlOxXHqEU(com.paypal.oslo.core.navigation.scene.L0OnlyScene.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 54);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.core.navigation.scene.LocalL0VisibilityKt.getLocalL0Visibility().provides(java.lang.Boolean.TRUE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(773951482, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.L0OnlyScene$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.L0OnlyScene.$r8$lambda$Bc2SHuTFrk10qjIEDzFoUsQsUuI(androidx.compose.foundation.layout.ColumnScope.this, l0OnlyScene, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JiYKyBUbce3jeW-8UzlOxXHq-EU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11611$r8$lambda$JiYKyBUbce3jeW8UzlOxXHqEU(com.paypal.oslo.core.navigation.scene.L0OnlyScene l0OnlyScene, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.core.navigation.ui.TopBarConfig copy;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1270590429, i, -1, "com.paypal.oslo.core.navigation.scene.L0OnlyScene.content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OsloScene.kt:868)");
            }
            copy = r8.copy((r30 & 1) != 0 ? r8.leftIcon : null, (r30 & 2) != 0 ? r8.leftIconColor : null, (r30 & 4) != 0 ? r8.leftIconContentDescription : null, (r30 & 8) != 0 ? r8.leftSectionContentDescription : null, (r30 & 16) != 0 ? r8.title : null, (r30 & 32) != 0 ? r8.showLeftSection : false, (r30 & 64) != 0 ? r8.accountSwitchAvatarSource : null, (r30 & 128) != 0 ? r8.showNotificationIcon : false, (r30 & 256) != 0 ? r8.notificationCount : 0, (r30 & 512) != 0 ? r8.showCloseButton : true, (r30 & 1024) != 0 ? r8.onLeftSectionClick : null, (r30 & 2048) != 0 ? r8.onAccountSwitchClick : null, (r30 & 4096) != 0 ? r8.onNotificationClick : null, (r30 & 8192) != 0 ? l0OnlyScene.Camera2StreamConfigurationMap.onCloseClick : l0OnlyScene.getHighSpeedVideoSizes);
            com.paypal.oslo.core.navigation.ui.TopBarKt.TopBar(copy, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
