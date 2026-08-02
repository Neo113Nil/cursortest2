package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldDefaults$decorator$2 implements androidx.compose.foundation.text.input.TextFieldDecorator {
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.TextFieldColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ boolean getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldLineLimits getOutputFormats;
    final /* synthetic */ androidx.compose.material3.TextFieldLabelPosition getOutputMinFrameDuration;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState getOutputStallDuration;
    final /* synthetic */ androidx.compose.foundation.text.input.OutputTransformation getOutputStallDurationlomOqCM;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> toString;

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer;
        java.lang.CharSequence asCharSequence;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-94654579);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-94654579, i3, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:179)");
            }
            if (this.getOutputStallDurationlomOqCM == null) {
                asCharSequence = this.getOutputStallDuration.getText();
            } else {
                androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getOutputStallDuration;
                androidx.compose.foundation.text.input.TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    androidx.compose.foundation.text.input.OutputTransformation outputTransformation = this.getOutputStallDurationlomOqCM;
                    if (startEdit == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        textFieldBuffer = null;
                    } else {
                        textFieldBuffer = startEdit;
                    }
                    outputTransformation.transformOutput(textFieldBuffer);
                    asCharSequence = startEdit.asCharSequence();
                } catch (java.lang.Throwable th) {
                    textFieldState.finishEditing();
                    throw th;
                }
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.internal.TextFieldType.Filled, asCharSequence, function2, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getOutputSizes, this.getInputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.toString, kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.INSTANCE), this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, composer2, ((i3 << 6) & 896) | 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TextFieldDefaults$decorator$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.TextFieldDefaults$decorator$2.getHighSpeedVideoFpsRanges(androidx.compose.material3.TextFieldDefaults$decorator$2.this, function2, i, (androidx.compose.runtime.Composer) obj);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material3.TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        textFieldDefaults$decorator$2.Decoration(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldDefaults$decorator$2(androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.TextFieldLineLimits textFieldLineLimits, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.material3.TextFieldColors textFieldColors, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27) {
        this.getOutputStallDurationlomOqCM = outputTransformation;
        this.getOutputStallDuration = textFieldState;
        this.getOutputFormats = textFieldLineLimits;
        this.getOutputMinFrameDuration = textFieldLabelPosition;
        this.getHighSpeedVideoSizesFor = function3;
        this.getOutputSizes = function2;
        this.getInputSizeshNQ4ISI = function22;
        this.getValidOutputFormatsForInputhNQ4ISI = function23;
        this.getOutputMinFrameDurationlomOqCM = function24;
        this.getOutputSizeshNQ4ISI = function25;
        this.toString = function26;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getInputFormats = z2;
        this.Camera2StreamConfigurationMap = interactionSource;
        this.getHighSpeedVideoSizes = paddingValues;
        this.getHighSpeedVideoFpsRanges = textFieldColors;
        this.getHighSpeedVideoFpsRangesFor = function27;
    }
}
