package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldKt$TextField$1 implements androidx.compose.foundation.text.input.TextFieldDecorator {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.TextFieldColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.OutputTransformation getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldLineLimits getOutputFormats;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getOutputMinFrameDuration;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState getOutputStallDuration;

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer;
        java.lang.String obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1516988351);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1516988351, i3, -1, "androidx.compose.material.TextField.<no name provided>.Decoration (TextField.kt:226)");
            }
            if (this.getInputFormats == null) {
                obj = this.getOutputStallDuration.getText().toString();
            } else {
                androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getOutputStallDuration;
                androidx.compose.foundation.text.input.TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    androidx.compose.foundation.text.input.OutputTransformation outputTransformation = this.getInputFormats;
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
            composer2 = startRestartGroup;
            androidx.compose.material.TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, function2, this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.INSTANCE), androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, null, composer2, ((i3 << 3) & 112) | 24576, 24576, 8192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TextFieldKt$TextField$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material.TextFieldKt$TextField$1.getHighSpeedVideoSizes(androidx.compose.material.TextFieldKt$TextField$1.this, function2, i, (androidx.compose.runtime.Composer) obj2);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material.TextFieldKt$TextField$1 textFieldKt$TextField$1, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        textFieldKt$TextField$1.Decoration(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldKt$TextField$1(androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.TextFieldLineLimits textFieldLineLimits, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors) {
        this.getInputFormats = outputTransformation;
        this.getOutputStallDuration = textFieldState;
        this.getOutputFormats = textFieldLineLimits;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
        this.getHighSpeedVideoSizes = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizesFor = function22;
        this.getInputSizeshNQ4ISI = function23;
        this.getOutputMinFrameDurationlomOqCM = function24;
        this.getOutputMinFrameDuration = shape;
        this.getHighSpeedVideoFpsRanges = textFieldColors;
    }
}
