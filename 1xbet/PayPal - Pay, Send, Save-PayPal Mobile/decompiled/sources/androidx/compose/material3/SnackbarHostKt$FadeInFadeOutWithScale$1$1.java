package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 implements kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.FadeInFadeOutState<androidx.compose.material3.SnackbarData> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SnackbarData getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.SnackbarData getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.ui.Modifier m6141graphicsLayerAp8cVGQ;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function22 = function2;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer2.changedInstance(function22) ? 4 : 2;
        }
        int i = intValue;
        if (!composer2.shouldExecute((i & 19) != 18, i & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1952400805, i, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, composer2, 6);
            boolean changed = composer2.changed(this.getHighSpeedVideoFpsRangesFor);
            boolean changedInstance = composer2.changedInstance(this.Camera2StreamConfigurationMap);
            final androidx.compose.material3.SnackbarData snackbarData = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.material3.FadeInFadeOutState<androidx.compose.material3.SnackbarData> fadeInFadeOutState = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1.getHighSpeedVideoSizes(androidx.compose.material3.SnackbarData.this, fadeInFadeOutState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.State access$animatedOpacity = androidx.compose.material3.SnackbarHostKt.access$animatedOpacity(value, areEqual, (kotlin.jvm.functions.Function0) rememberedValue, composer2, 0, 0);
            androidx.compose.runtime.State access$animatedScale = androidx.compose.material3.SnackbarHostKt.access$animatedScale(androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial, composer2, 6), areEqual, composer2, 0);
            m6141graphicsLayerAp8cVGQ = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m6141graphicsLayerAp8cVGQ(androidx.compose.ui.Modifier.INSTANCE, (r41 & 1) != 0 ? 1.0f : ((java.lang.Number) access$animatedScale.getValue()).floatValue(), (r41 & 2) != 0 ? 1.0f : ((java.lang.Number) access$animatedScale.getValue()).floatValue(), (r41 & 4) == 0 ? ((java.lang.Number) access$animatedOpacity.getValue()).floatValue() : 1.0f, (r41 & 8) != 0 ? 0.0f : 0.0f, (r41 & 16) != 0 ? 0.0f : 0.0f, (r41 & 32) != 0 ? 0.0f : 0.0f, (r41 & 64) != 0 ? 0.0f : 0.0f, (r41 & 128) != 0 ? 0.0f : 0.0f, (r41 & 256) == 0 ? 0.0f : 0.0f, (r41 & 512) != 0 ? 8.0f : 0.0f, (r41 & 1024) != 0 ? androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ() : 0L, (r41 & 2048) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : null, (r41 & 4096) != 0 ? false : false, (r41 & 8192) != 0 ? null : null, (r41 & 16384) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r41 & 32768) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r41 & 65536) != 0 ? androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6080getAutoNrFUSI() : 0);
            boolean changed2 = composer2.changed(areEqual);
            boolean changed3 = composer2.changed(this.getHighSpeedVideoFpsRangesFor);
            boolean changed4 = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.material3.SnackbarData snackbarData2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if ((changed2 | changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1.Camera2StreamConfigurationMap(areEqual, str, snackbarData2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m6141graphicsLayerAp8cVGQ, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function22.invoke(composer2, java.lang.Integer.valueOf(i & 14));
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(boolean z, java.lang.String str, final androidx.compose.material3.SnackbarData snackbarData, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SnackbarData.this));
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SnackbarData snackbarData) {
        snackbarData.dismiss();
        return true;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(final androidx.compose.material3.SnackbarData snackbarData, androidx.compose.material3.FadeInFadeOutState fadeInFadeOutState) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(snackbarData, fadeInFadeOutState.Camera2StreamConfigurationMap)) {
            kotlin.collections.CollectionsKt.removeAll((java.util.List) fadeInFadeOutState.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    boolean areEqual;
                    areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.material3.FadeInFadeOutAnimationItem) obj).getHighSpeedVideoFpsRanges, androidx.compose.material3.SnackbarData.this);
                    return java.lang.Boolean.valueOf(areEqual);
                }
            });
            androidx.compose.runtime.RecomposeScope recomposeScope = fadeInFadeOutState.getHighSpeedVideoSizes;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    SnackbarHostKt$FadeInFadeOutWithScale$1$1(androidx.compose.material3.SnackbarData snackbarData, androidx.compose.material3.SnackbarData snackbarData2, androidx.compose.material3.FadeInFadeOutState<androidx.compose.material3.SnackbarData> fadeInFadeOutState, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = snackbarData;
        this.getHighSpeedVideoFpsRanges = snackbarData2;
        this.Camera2StreamConfigurationMap = fadeInFadeOutState;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
