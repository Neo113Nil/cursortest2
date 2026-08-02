package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldKt$OutlinedTextField$3 implements androidx.compose.foundation.text.input.TextFieldDecorator {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.TextFieldColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldLineLimits getInputFormats;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputFormats;
    final /* synthetic */ androidx.compose.foundation.text.input.OutputTransformation getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputSizeshNQ4ISI;

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer;
        java.lang.String obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1251830469);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1251830469, i4, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration (OutlinedTextField.kt:219)");
            }
            if (this.getOutputMinFrameDuration == null) {
                obj = this.getOutputMinFrameDurationlomOqCM.getText().toString();
            } else {
                androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getOutputMinFrameDurationlomOqCM;
                androidx.compose.foundation.text.input.TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    androidx.compose.foundation.text.input.OutputTransformation outputTransformation = this.getOutputMinFrameDuration;
                    if (startEdit == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        textFieldBuffer = null;
                    } else {
                        textFieldBuffer = startEdit;
                    }
                    outputTransformation.transformOutput(textFieldBuffer);
                    obj = startEdit.asCharSequence().toString();
                } catch (java.lang.Throwable th) {
                    textFieldState.finishEditing();
                    throw th;
                }
            }
            java.lang.String str = obj;
            androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
            androidx.compose.ui.text.input.VisualTransformation none = androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone();
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.INSTANCE);
            final boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoSizes;
            final boolean z2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.getOutputFormats;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.getHighSpeedVideoSizesFor;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = this.getOutputSizeshNQ4ISI;
            final androidx.compose.ui.graphics.Shape shape = this.getInputSizeshNQ4ISI;
            final androidx.compose.material.TextFieldColors textFieldColors = this.getHighSpeedVideoFpsRanges;
            composer2 = startRestartGroup;
            i3 = i;
            textFieldDefaults.OutlinedTextFieldDecorationBox(str, function2, z, areEqual, none, mutableInteractionSource, z2, function22, function23, function24, function25, shape, textFieldColors, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(413830957, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3.Camera2StreamConfigurationMap(z, z2, mutableInteractionSource, textFieldColors, shape, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), composer2, ((i4 << 3) & 112) | 24576, 221184, 8192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3.Camera2StreamConfigurationMap(androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3.this, function2, i3, (androidx.compose.runtime.Composer) obj2);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3 outlinedTextFieldKt$OutlinedTextField$3, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        outlinedTextFieldKt$OutlinedTextField$3.Decoration(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(boolean z, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.TextFieldColors textFieldColors, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(413830957, i, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration.<anonymous> (OutlinedTextField.kt:247)");
            }
            androidx.compose.material.TextFieldDefaults.INSTANCE.m2808BorderBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, 12582912, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    OutlinedTextFieldKt$OutlinedTextField$3(androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.TextFieldLineLimits textFieldLineLimits, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors) {
        this.getOutputMinFrameDuration = outputTransformation;
        this.getOutputMinFrameDurationlomOqCM = textFieldState;
        this.getInputFormats = textFieldLineLimits;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = mutableInteractionSource;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getOutputFormats = function22;
        this.getHighSpeedVideoSizesFor = function23;
        this.getOutputSizeshNQ4ISI = function24;
        this.getInputSizeshNQ4ISI = shape;
        this.getHighSpeedVideoFpsRanges = textFieldColors;
    }
}
