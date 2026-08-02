package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen;

@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a \u0010\u0003\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0012\u001ay\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172#\u0010\u0019\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00062)\u0010\u001e\u001a%\u0012\u0004\u0012\u00020 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0004\u0012\u00020\u00010\u001f¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, d2 = {"InitialStateContent", "", "(Landroidx/compose/runtime/Composer;I)V", "LoadingStateContent", "cameraPreview", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ProcessingStateContent", "showFlash", "", "showSuccessFrame", "showCheckmark", "(ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PreviewStateContent", "capturedImage", "Landroid/graphics/Bitmap;", "onConfirm", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DocumentCaptureContent", "uiState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureEvent;", "cameraPreviewProvider", "Lkotlin/Function3;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "", "capturingUIProvider", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Capturing;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "verification-capture_prodRelease", "alpha", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentCaptureScreenContentKt {
    public static final void InitialStateContent(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-285263324);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-285263324, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.InitialStateContent (DocumentCaptureScreenContent.kt:47)");
            }
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1286backgroundbw27NRU$default);
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
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$fnWTSlLB9UP0boKbp2ZHCm_sCzo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadingStateContent(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-821721741);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-821721741, i2, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.LoadingStateContent (DocumentCaptureScreenContent.kt:67)");
            }
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1286backgroundbw27NRU$default);
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
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf(i2 & 14));
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$6wb7keDtFnCrrKetJ_4tlSzfHQQ(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProcessingStateContent(final boolean z, final boolean z2, final boolean z3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(330903674);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(330903674, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateContent (DocumentCaptureScreenContent.kt:101)");
            }
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1286backgroundbw27NRU$default);
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
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & 14));
            if (z) {
                startRestartGroup.startReplaceGroup(-940895117);
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(0.0f, androidx.compose.animation.core.AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, "flash", null, startRestartGroup, 3126, 20).getValue().floatValue()), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU(), null, 2, null), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-940530898);
                startRestartGroup.endReplaceGroup();
            }
            if (z2) {
                startRestartGroup.startReplaceGroup(-940409998);
                com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt.ScanRegionOverlay(null, false, true, z3, null, null, startRestartGroup, ((i3 << 3) & 7168) | 384, 51);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-940321586);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$PBdsamSPDLM5YwiWcUSmuP_4oiY(z, z2, z3, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewStateContent(final android.graphics.Bitmap bitmap, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1489824443);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1489824443, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.PreviewStateContent (DocumentCaptureScreenContent.kt:143)");
            }
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1286backgroundbw27NRU$default);
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
            androidx.compose.foundation.ImageKt.m1335Image5hnEew(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "Captured document", androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, null, 0, startRestartGroup, 25008, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            com.paypal.pds.components.ButtonKt.Button(function0, "Confirm", androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), 2, null), null, null, null, null, false, false, startRestartGroup, ((i3 >> 3) & 14) | 48, 504);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.m20643$r8$lambda$_YHk4bZ9DeHxZFpWLU6mYe6TF0(bitmap, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DocumentCaptureContent(final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState documentCaptureUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function5<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType, ? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, final kotlin.jvm.functions.Function4<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing, ? super kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(233656424);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(documentCaptureUiState) : startRestartGroup.changedInstance(documentCaptureUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(233656424, i2, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureContent (DocumentCaptureScreenContent.kt:192)");
            }
            if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial) {
                startRestartGroup.startReplaceGroup(-1283087027);
                InitialStateContent(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.WaitingForCamera) {
                startRestartGroup.startReplaceGroup(-1282986835);
                InitialStateContent(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading) {
                startRestartGroup.startReplaceGroup(-1282895571);
                InitialStateContent(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                startRestartGroup.startReplaceGroup(-1282801827);
                function4.invoke(documentCaptureUiState, function1, startRestartGroup, java.lang.Integer.valueOf(((i2 >> 3) & 896) | (i2 & 126)));
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) {
                startRestartGroup.startReplaceGroup(-1282680927);
                ProcessingStateContent(true, true, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1282186641, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$QFlvOJZKmFIAyO_VYTv_hqbDPnE(kotlin.jvm.functions.Function5.this, documentCaptureUiState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 3510);
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) {
                startRestartGroup.startReplaceGroup(-1282235395);
                android.graphics.Bitmap image = ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) documentCaptureUiState).getResult().getImage();
                z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$LChvas002mVKxvPl9aeZV2EJ5D8(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                PreviewStateContent(image, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success) {
                startRestartGroup.startReplaceGroup(-1281978963);
                com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result = ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success) documentCaptureUiState).getResult();
                if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) {
                    startRestartGroup.startReplaceGroup(-1281906051);
                    android.graphics.Bitmap image2 = result.getImage();
                    z = (i2 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$FKWlSDkwYECU5sNWW6FSOL_PMIU(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    PreviewStateContent(image2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1281665150);
                    InitialStateContent(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error) {
                startRestartGroup.startReplaceGroup(-1281478468);
                InitialStateContent(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1205535838);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenContentKt.$r8$lambda$dnDt_jvP67MQEuorNXlUZ68EaGE(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.this, function1, function5, function4, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6wb7keDtFnCrrKetJ_4tlSzfHQQ(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        LoadingStateContent(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FKWlSDkwYECU5sNWW6FSOL_PMIU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.ConfirmPreview.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LChvas002mVKxvPl9aeZV2EJ5D8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.ConfirmPreview.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PBdsamSPDLM5YwiWcUSmuP_4oiY(boolean z, boolean z2, boolean z3, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProcessingStateContent(z, z2, z3, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QFlvOJZKmFIAyO_VYTv_hqbDPnE(kotlin.jvm.functions.Function5 function5, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState documentCaptureUiState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1282186641, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureContent.<anonymous> (DocumentCaptureScreenContent.kt:216)");
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing processing = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) documentCaptureUiState;
            function5.invoke(processing.getDocumentType(), processing.getDocumentSide(), 0, composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_YHk4bZ9DeHx-ZFpWLU6mYe6TF0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20643$r8$lambda$_YHk4bZ9DeHxZFpWLU6mYe6TF0(android.graphics.Bitmap bitmap, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PreviewStateContent(bitmap, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dnDt_jvP67MQEuorNXlUZ68EaGE(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState documentCaptureUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function4 function4, int i, androidx.compose.runtime.Composer composer, int i2) {
        DocumentCaptureContent(documentCaptureUiState, function1, function5, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fnWTSlLB9UP0boKbp2ZHCm_sCzo(int i, androidx.compose.runtime.Composer composer, int i2) {
        InitialStateContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
