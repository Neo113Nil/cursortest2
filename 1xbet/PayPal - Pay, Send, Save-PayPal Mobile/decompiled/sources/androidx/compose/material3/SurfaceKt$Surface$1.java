package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SurfaceKt$Surface$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.foundation.BorderStroke Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.Modifier getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getHighSpeedVideoSizesFor;
    final /* synthetic */ float getOutputFormats;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        Camera2StreamConfigurationMap(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, int i) {
        long highSpeedVideoFpsRangesFor;
        androidx.compose.ui.Modifier highSpeedVideoFpsRanges;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(421772006, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
        }
        androidx.compose.ui.Modifier modifier = this.getHighSpeedVideoSizes;
        androidx.compose.ui.graphics.Shape shape = this.getHighSpeedVideoSizesFor;
        highSpeedVideoFpsRangesFor = androidx.compose.material3.SurfaceKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, composer, 0);
        highSpeedVideoFpsRanges = androidx.compose.material3.SurfaceKt.getHighSpeedVideoFpsRanges(modifier, shape, highSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(this.getOutputFormats));
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SurfaceKt$Surface$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.material3.SurfaceKt$Surface$1.getHighSpeedVideoSizes((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    return highSpeedVideoSizes;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(highSpeedVideoFpsRanges, false, (kotlin.jvm.functions.Function1) rememberedValue);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        androidx.compose.material3.SurfaceKt$Surface$1$3$1 rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.SurfaceKt$Surface$1$3$1
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return kotlin.Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics, unit, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue2);
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true);
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, pointerInput);
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
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        function2.invoke(composer, 0);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    SurfaceKt$Surface$1(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, long j, float f, androidx.compose.foundation.BorderStroke borderStroke, float f2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.getHighSpeedVideoSizes = modifier;
        this.getHighSpeedVideoSizesFor = shape;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = borderStroke;
        this.getOutputFormats = f2;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
