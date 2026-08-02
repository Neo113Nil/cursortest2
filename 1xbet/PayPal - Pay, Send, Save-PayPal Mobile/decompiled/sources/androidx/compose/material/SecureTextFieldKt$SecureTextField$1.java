package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SecureTextFieldKt$SecureTextField$1 implements androidx.compose.foundation.text.input.TextFieldDecorator {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.TextFieldColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputFormats;
    final /* synthetic */ androidx.compose.foundation.text.input.TextFieldState getOutputMinFrameDuration;

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1564434043);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1564434043, i3, -1, "androidx.compose.material.SecureTextField.<no name provided>.Decoration (SecureTextField.kt:148)");
            }
            composer2 = startRestartGroup;
            androidx.compose.material.TextFieldDefaults.INSTANCE.TextFieldDecorationBox(this.getOutputMinFrameDuration.getText().toString(), function2, this.getHighResolutionOutputSizeshNQ4ISI, true, androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, null, composer2, ((i3 << 3) & 112) | 27648, 24576, 8192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SecureTextFieldKt$SecureTextField$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.SecureTextFieldKt$SecureTextField$1.getHighSpeedVideoSizes(androidx.compose.material.SecureTextFieldKt$SecureTextField$1.this, function2, i, (androidx.compose.runtime.Composer) obj);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material.SecureTextFieldKt$SecureTextField$1 secureTextFieldKt$SecureTextField$1, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        secureTextFieldKt$SecureTextField$1.Decoration(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    SecureTextFieldKt$SecureTextField$1(androidx.compose.foundation.text.input.TextFieldState textFieldState, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors) {
        this.getOutputMinFrameDuration = textFieldState;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = mutableInteractionSource;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.Camera2StreamConfigurationMap = function2;
        this.getInputSizeshNQ4ISI = function22;
        this.getOutputFormats = function23;
        this.getInputFormats = function24;
        this.getHighSpeedVideoSizesFor = shape;
        this.getHighSpeedVideoFpsRanges = textFieldColors;
    }
}
