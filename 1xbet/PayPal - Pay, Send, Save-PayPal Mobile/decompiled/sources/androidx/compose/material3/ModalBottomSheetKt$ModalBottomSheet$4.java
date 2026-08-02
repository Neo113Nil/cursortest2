package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheetKt$ModalBottomSheet$4 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.foundation.layout.WindowInsets> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.Modifier getOutputFormats;
    final /* synthetic */ androidx.compose.material3.ModalBottomSheetProperties getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ float getOutputSizes;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getOutputStallDuration;
    final /* synthetic */ long getOutputStallDurationlomOqCM;
    final /* synthetic */ float isOutputSupportedForhNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SheetState toString;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1010026864, intValue, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:185)");
            }
            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4.getHighSpeedVideoFpsRanges((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(imePadding, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            long j = this.getOutputStallDurationlomOqCM;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
            androidx.compose.material3.SheetState sheetState = this.toString;
            androidx.compose.material3.ModalBottomSheetProperties modalBottomSheetProperties = this.getOutputMinFrameDuration;
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.getInputFormats;
            kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoSizesFor;
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function1 = this.getOutputSizeshNQ4ISI;
            androidx.compose.ui.Modifier modifier = this.getOutputFormats;
            float f = this.getOutputSizes;
            boolean z = this.getOutputStallDuration;
            androidx.compose.ui.graphics.Shape shape = this.getOutputMinFrameDurationlomOqCM;
            long j2 = this.Camera2StreamConfigurationMap;
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI;
            float f2 = this.isOutputSupportedForhNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.foundation.layout.WindowInsets> function22 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.getHighSpeedVideoFpsRangesFor;
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
            androidx.compose.material3.ModalBottomSheetKt.getHighSpeedVideoFpsRangesFor(j, function0, sheetState.getTargetValue() != androidx.compose.material3.SheetValue.Hidden, modalBottomSheetProperties.getShouldDismissOnClickOutside(), composer2, 0);
            androidx.compose.material3.ModalBottomSheetKt.m3471ModalBottomSheetContent7e2Q(boxScopeInstance, animatable, coroutineScope, function0, function1, modifier, sheetState, f, z, shape, j2, j3, f2, function2, function22, function3, composer2, (androidx.compose.animation.core.Animatable.$stable << 3) | 6, 0, 0);
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

    /* JADX WARN: Multi-variable type inference failed */
    ModalBottomSheetKt$ModalBottomSheet$4(long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.material3.SheetState sheetState, androidx.compose.material3.ModalBottomSheetProperties modalBottomSheetProperties, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, float f, boolean z, androidx.compose.ui.graphics.Shape shape, long j2, long j3, float f2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> function22, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getOutputStallDurationlomOqCM = j;
        this.getHighSpeedVideoSizes = function0;
        this.toString = sheetState;
        this.getOutputMinFrameDuration = modalBottomSheetProperties;
        this.getInputFormats = animatable;
        this.getHighSpeedVideoSizesFor = coroutineScope;
        this.getOutputSizeshNQ4ISI = function1;
        this.getOutputFormats = modifier;
        this.getOutputSizes = f;
        this.getOutputStallDuration = z;
        this.getOutputMinFrameDurationlomOqCM = shape;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = j3;
        this.isOutputSupportedForhNQ4ISI = f2;
        this.getInputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRanges = function22;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
