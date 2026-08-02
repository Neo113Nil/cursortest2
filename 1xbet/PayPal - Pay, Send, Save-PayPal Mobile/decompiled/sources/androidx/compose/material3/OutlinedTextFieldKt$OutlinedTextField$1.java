package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OutlinedTextFieldKt$OutlinedTextField$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> ArtificialStackFrames;
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState CoroutineDebuggingKt;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> accessartificialFrame;
    final /* synthetic */ androidx.compose.ui.graphics.Shape coroutineBoundary;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> coroutineCreation;
    final /* synthetic */ androidx.compose.foundation.text.input.InputTransformation getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.TextFieldColors getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ androidx.compose.material3.TextFieldLabelPosition getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputFormats;
    final /* synthetic */ androidx.compose.foundation.text.KeyboardOptions getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.ui.Modifier getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldLineLimits getOutputSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> getOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.text.TextStyle getOutputStallDuration;
    final /* synthetic */ androidx.compose.foundation.text.input.KeyboardActionHandler getOutputStallDurationlomOqCM;
    final /* synthetic */ boolean getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.ScrollState isOutputSupportedFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> isOutputSupportedForhNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.OutputTransformation toString;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> unwrapAs;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-416142558, intValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:240)");
            }
            androidx.compose.ui.Modifier modifier = this.getOutputMinFrameDurationlomOqCM;
            if (this.getOutputFormats != null && !(this.getInputSizeshNQ4ISI instanceof androidx.compose.material3.TextFieldLabelPosition.Above)) {
                composer2.startReplaceGroup(-2027097767);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                companion = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion2, true, (kotlin.jvm.functions.Function1) rememberedValue), 0.0f, androidx.compose.material3.internal.TextFieldImplKt.minimizedLabelHalfHeight(composer2, 0), 0.0f, 0.0f, 13, null);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-2026714080);
                composer2.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = modifier.then(companion);
            boolean z = this.getHighSpeedVideoSizesFor;
            androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
            androidx.compose.ui.Modifier m1724defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1724defaultMinSizeVpY3zN4(androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics(then, z, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3587getMinWidthD9Ej5fM(), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3586getMinHeightD9Ej5fM());
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(this.getHighSpeedVideoFpsRangesFor.m3896cursorColorvNxB06k$material3(this.getHighSpeedVideoSizesFor), null);
            androidx.compose.material3.OutlinedTextFieldDefaults outlinedTextFieldDefaults = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE;
            androidx.compose.foundation.text.input.TextFieldState textFieldState = this.CoroutineDebuggingKt;
            boolean z2 = this.Camera2StreamConfigurationMap;
            androidx.compose.foundation.text.input.TextFieldLineLimits textFieldLineLimits = this.getOutputSizes;
            androidx.compose.foundation.text.input.OutputTransformation outputTransformation = this.toString;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoFpsRanges;
            androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition = this.getInputSizeshNQ4ISI;
            kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.getOutputFormats;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.unwrapAs;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getInputFormats;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.coroutineCreation;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.isOutputSupportedForhNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = this.ArtificialStackFrames;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = this.accessartificialFrame;
            boolean z3 = this.getHighSpeedVideoSizesFor;
            androidx.compose.material3.TextFieldColors textFieldColors = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.foundation.layout.PaddingValues paddingValues = this.getHighSpeedVideoSizes;
            final boolean z4 = this.Camera2StreamConfigurationMap;
            final boolean z5 = this.getHighSpeedVideoSizesFor;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.material3.TextFieldColors textFieldColors2 = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.ui.graphics.Shape shape = this.coroutineBoundary;
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(this.CoroutineDebuggingKt, m1724defaultMinSizeVpY3zN4, this.Camera2StreamConfigurationMap, this.getValidOutputFormatsForInputhNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM, this.getOutputSizes, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, solidColor, this.toString, outlinedTextFieldDefaults.decorator(textFieldState, z2, textFieldLineLimits, outputTransformation, mutableInteractionSource, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z3, textFieldColors, paddingValues, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-98391231, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (!composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-98391231, intValue2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:291)");
                        }
                        androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3581Container4EFweAY(z4, z5, mutableInteractionSource2, null, textFieldColors2, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 0, 14155776, 0), this.isOutputSupportedFor, composer2, 0, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    OutlinedTextFieldKt$OutlinedTextField$1(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, boolean z, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.foundation.text.input.TextFieldState textFieldState, boolean z2, androidx.compose.foundation.text.input.TextFieldLineLimits textFieldLineLimits, androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z3, androidx.compose.foundation.text.input.InputTransformation inputTransformation, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function27, androidx.compose.foundation.ScrollState scrollState, androidx.compose.ui.graphics.Shape shape) {
        this.getOutputMinFrameDurationlomOqCM = modifier;
        this.getOutputFormats = function3;
        this.getInputSizeshNQ4ISI = textFieldLabelPosition;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoFpsRangesFor = textFieldColors;
        this.CoroutineDebuggingKt = textFieldState;
        this.Camera2StreamConfigurationMap = z2;
        this.getOutputSizes = textFieldLineLimits;
        this.toString = outputTransformation;
        this.getHighSpeedVideoFpsRanges = mutableInteractionSource;
        this.unwrapAs = function2;
        this.getInputFormats = function22;
        this.coroutineCreation = function23;
        this.isOutputSupportedForhNQ4ISI = function24;
        this.ArtificialStackFrames = function25;
        this.accessartificialFrame = function26;
        this.getHighSpeedVideoSizes = paddingValues;
        this.getValidOutputFormatsForInputhNQ4ISI = z3;
        this.getHighResolutionOutputSizeshNQ4ISI = inputTransformation;
        this.getOutputStallDuration = textStyle;
        this.getOutputMinFrameDuration = keyboardOptions;
        this.getOutputStallDurationlomOqCM = keyboardActionHandler;
        this.getOutputSizeshNQ4ISI = function27;
        this.isOutputSupportedFor = scrollState;
        this.coroutineBoundary = shape;
    }
}
