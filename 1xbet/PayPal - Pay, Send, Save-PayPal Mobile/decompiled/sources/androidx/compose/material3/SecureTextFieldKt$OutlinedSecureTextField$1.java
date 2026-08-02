package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SecureTextFieldKt$OutlinedSecureTextField$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.foundation.text.input.InputTransformation Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> accessartificialFrame;
    final /* synthetic */ int coroutineBoundary;
    final /* synthetic */ char coroutineCreation;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.TextFieldColors getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.KeyboardOptions getOutputFormats;
    final /* synthetic */ androidx.compose.material3.TextFieldLabelPosition getOutputMinFrameDuration;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.compose.foundation.text.input.KeyboardActionHandler getOutputSizes;
    final /* synthetic */ androidx.compose.ui.Modifier getOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> getOutputStallDuration;
    final /* synthetic */ androidx.compose.ui.text.TextStyle getOutputStallDurationlomOqCM;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ androidx.compose.ui.graphics.Shape isOutputSupportedFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> isOutputSupportedForhNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState toString;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1147500080, intValue, -1, "androidx.compose.material3.OutlinedSecureTextField.<anonymous> (SecureTextField.kt:327)");
            }
            androidx.compose.ui.Modifier modifier = this.getOutputSizeshNQ4ISI;
            if (this.getInputSizeshNQ4ISI != null && !(this.getOutputMinFrameDuration instanceof androidx.compose.material3.TextFieldLabelPosition.Above)) {
                composer2.startReplaceGroup(1530411723);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SecureTextFieldKt$OutlinedSecureTextField$1$$ExternalSyntheticLambda0
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
                composer2.startReplaceGroup(1530795410);
                composer2.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = modifier.then(companion);
            boolean z = this.getHighSpeedVideoSizesFor;
            androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
            androidx.compose.ui.Modifier m1724defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1724defaultMinSizeVpY3zN4(androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics(then, z, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3587getMinWidthD9Ej5fM(), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3586getMinHeightD9Ej5fM());
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(this.getHighSpeedVideoSizes.m3896cursorColorvNxB06k$material3(this.getHighSpeedVideoSizesFor), null);
            androidx.compose.material3.OutlinedTextFieldDefaults outlinedTextFieldDefaults = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE;
            androidx.compose.foundation.text.input.TextFieldState textFieldState = this.toString;
            boolean z2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine singleLine = androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.INSTANCE;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition = this.getOutputMinFrameDuration;
            kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getOutputMinFrameDurationlomOqCM;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getInputFormats;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.accessartificialFrame;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.getValidOutputFormatsForInputhNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = this.isOutputSupportedForhNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = this.unwrapAs;
            boolean z3 = this.getHighSpeedVideoSizesFor;
            androidx.compose.material3.TextFieldColors textFieldColors = this.getHighSpeedVideoSizes;
            androidx.compose.foundation.layout.PaddingValues paddingValues = this.getHighSpeedVideoFpsRanges;
            final boolean z4 = this.getHighSpeedVideoFpsRangesFor;
            final boolean z5 = this.getHighSpeedVideoSizesFor;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.material3.TextFieldColors textFieldColors2 = this.getHighSpeedVideoSizes;
            final androidx.compose.ui.graphics.Shape shape = this.isOutputSupportedFor;
            androidx.compose.foundation.text.BasicSecureTextFieldKt.m1983BasicSecureTextFieldegD4TGM(this.toString, m1724defaultMinSizeVpY3zN4, this.getHighSpeedVideoFpsRangesFor, false, this.Camera2StreamConfigurationMap, this.getOutputStallDurationlomOqCM, this.getOutputFormats, this.getOutputSizes, this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, solidColor, outlinedTextFieldDefaults.decorator(textFieldState, z2, singleLine, null, mutableInteractionSource, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z3, textFieldColors, paddingValues, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1406782897, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SecureTextFieldKt$OutlinedSecureTextField$1.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (!composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1406782897, intValue2, -1, "androidx.compose.material3.OutlinedSecureTextField.<anonymous>.<anonymous> (SecureTextField.kt:376)");
                        }
                        androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3581Container4EFweAY(z4, z5, mutableInteractionSource2, null, textFieldColors2, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 3456, 14155776, 0), this.coroutineBoundary, this.coroutineCreation, composer2, 0, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    SecureTextFieldKt$OutlinedSecureTextField$1(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, boolean z, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.foundation.text.input.TextFieldState textFieldState, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.text.input.InputTransformation inputTransformation, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function27, int i, char c, androidx.compose.ui.graphics.Shape shape) {
        this.getOutputSizeshNQ4ISI = modifier;
        this.getInputSizeshNQ4ISI = function3;
        this.getOutputMinFrameDuration = textFieldLabelPosition;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoSizes = textFieldColors;
        this.toString = textFieldState;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource;
        this.getOutputMinFrameDurationlomOqCM = function2;
        this.getInputFormats = function22;
        this.accessartificialFrame = function23;
        this.getValidOutputFormatsForInputhNQ4ISI = function24;
        this.isOutputSupportedForhNQ4ISI = function25;
        this.unwrapAs = function26;
        this.getHighSpeedVideoFpsRanges = paddingValues;
        this.Camera2StreamConfigurationMap = inputTransformation;
        this.getOutputStallDurationlomOqCM = textStyle;
        this.getOutputFormats = keyboardOptions;
        this.getOutputSizes = keyboardActionHandler;
        this.getOutputStallDuration = function27;
        this.coroutineBoundary = i;
        this.coroutineCreation = c;
        this.isOutputSupportedFor = shape;
    }
}
