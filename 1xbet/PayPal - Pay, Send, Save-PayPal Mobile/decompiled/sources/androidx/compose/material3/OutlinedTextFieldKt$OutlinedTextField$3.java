package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OutlinedTextFieldKt$OutlinedTextField$3 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String ArtificialStackFrames;
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.text.input.VisualTransformation CoroutineDebuggingKt;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> coroutineBoundary;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.TextFieldColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.KeyboardActions getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.KeyboardOptions getOutputFormats;
    final /* synthetic */ androidx.compose.ui.text.TextStyle getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.ui.Modifier getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputSizes;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputSizeshNQ4ISI;
    final /* synthetic */ int getOutputStallDuration;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputStallDurationlomOqCM;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> isOutputSupportedFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> isOutputSupportedForhNQ4ISI;
    final /* synthetic */ boolean toString;
    final /* synthetic */ boolean unwrapAs;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1874034984, intValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:405)");
            }
            androidx.compose.ui.Modifier modifier = this.getOutputMinFrameDurationlomOqCM;
            if (this.getHighSpeedVideoSizesFor != null) {
                composer2.startReplaceGroup(-903490605);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$$ExternalSyntheticLambda0
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
                composer2.startReplaceGroup(-903106918);
                composer2.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = modifier.then(companion);
            boolean z = this.Camera2StreamConfigurationMap;
            androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
            androidx.compose.ui.Modifier m1724defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1724defaultMinSizeVpY3zN4(androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics(then, z, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3587getMinWidthD9Ej5fM(), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3586getMinHeightD9Ej5fM());
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(this.getHighSpeedVideoFpsRanges.m3896cursorColorvNxB06k$material3(this.Camera2StreamConfigurationMap), null);
            java.lang.String str = this.ArtificialStackFrames;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getOutputSizeshNQ4ISI;
            boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
            boolean z3 = this.toString;
            androidx.compose.ui.text.TextStyle textStyle = this.getOutputMinFrameDuration;
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = this.getOutputFormats;
            androidx.compose.foundation.text.KeyboardActions keyboardActions = this.getHighSpeedVideoSizes;
            boolean z4 = this.unwrapAs;
            int i = this.getInputSizeshNQ4ISI;
            int i2 = this.getOutputStallDuration;
            androidx.compose.ui.text.input.VisualTransformation visualTransformation = this.CoroutineDebuggingKt;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.graphics.SolidColor solidColor2 = solidColor;
            final java.lang.String str2 = this.ArtificialStackFrames;
            final boolean z5 = this.getHighResolutionOutputSizeshNQ4ISI;
            final boolean z6 = this.unwrapAs;
            final androidx.compose.ui.text.input.VisualTransformation visualTransformation2 = this.CoroutineDebuggingKt;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = this.getHighSpeedVideoFpsRangesFor;
            final boolean z7 = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoSizesFor;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getOutputSizes;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.getInputFormats;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.coroutineBoundary;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = this.getOutputStallDurationlomOqCM;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = this.isOutputSupportedFor;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function27 = this.isOutputSupportedForhNQ4ISI;
            final androidx.compose.material3.TextFieldColors textFieldColors = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.ui.graphics.Shape shape = this.getValidOutputFormatsForInputhNQ4ISI;
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(str, function1, m1724defaultMinSizeVpY3zN4, z2, z3, textStyle, keyboardOptions, keyboardActions, z4, i, i2, visualTransformation, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, mutableInteractionSource, solidColor2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1189274459, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function28, androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function29 = function28;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= composer4.changedInstance(function29) ? 4 : 2;
                    }
                    int i3 = intValue2;
                    if (!composer4.shouldExecute((i3 & 19) != 18, i3 & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1189274459, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:439)");
                        }
                        androidx.compose.material3.OutlinedTextFieldDefaults outlinedTextFieldDefaults = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE;
                        java.lang.String str3 = str2;
                        boolean z8 = z5;
                        boolean z9 = z6;
                        androidx.compose.ui.text.input.VisualTransformation visualTransformation3 = visualTransformation2;
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        boolean z10 = z7;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function2;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function22;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function212 = function23;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function213 = function24;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function214 = function25;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function215 = function26;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function216 = function27;
                        androidx.compose.material3.TextFieldColors textFieldColors2 = textFieldColors;
                        final boolean z11 = z5;
                        final boolean z12 = z7;
                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        final androidx.compose.material3.TextFieldColors textFieldColors3 = textFieldColors;
                        final androidx.compose.ui.graphics.Shape shape2 = shape;
                        outlinedTextFieldDefaults.DecorationBox(str3, function29, z8, z9, visualTransformation3, mutableInteractionSource3, z10, function210, function211, function212, function213, function214, function215, function216, textFieldColors2, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-656940872, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num3) {
                                androidx.compose.runtime.Composer composer6 = composer5;
                                int intValue3 = num3.intValue();
                                if (!composer6.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                    composer6.skipToGroupEnd();
                                } else {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-656940872, intValue3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:456)");
                                    }
                                    androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.m3581Container4EFweAY(z11, z12, mutableInteractionSource4, null, textFieldColors3, shape2, 0.0f, 0.0f, composer6, 100663296, 200);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }, composer4, 54), composer4, (i3 << 3) & 112, 14155776, 32768);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 0, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    OutlinedTextFieldKt$OutlinedTextField$3(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z, androidx.compose.material3.TextFieldColors textFieldColors, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, boolean z2, boolean z3, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z4, int i, int i2, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27, androidx.compose.ui.graphics.Shape shape) {
        this.getOutputMinFrameDurationlomOqCM = modifier;
        this.getHighSpeedVideoSizesFor = function2;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = textFieldColors;
        this.ArtificialStackFrames = str;
        this.getOutputSizeshNQ4ISI = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.toString = z3;
        this.getOutputMinFrameDuration = textStyle;
        this.getOutputFormats = keyboardOptions;
        this.getHighSpeedVideoSizes = keyboardActions;
        this.unwrapAs = z4;
        this.getInputSizeshNQ4ISI = i;
        this.getOutputStallDuration = i2;
        this.CoroutineDebuggingKt = visualTransformation;
        this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
        this.getOutputSizes = function22;
        this.getInputFormats = function23;
        this.coroutineBoundary = function24;
        this.getOutputStallDurationlomOqCM = function25;
        this.isOutputSupportedFor = function26;
        this.isOutputSupportedForhNQ4ISI = function27;
        this.getValidOutputFormatsForInputhNQ4ISI = shape;
    }
}
