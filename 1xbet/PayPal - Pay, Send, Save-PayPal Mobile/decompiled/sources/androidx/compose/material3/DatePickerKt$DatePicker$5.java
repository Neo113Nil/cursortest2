package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$DatePicker$5 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.DatePickerColors getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.DatePickerState getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1483431603, intValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:206)");
            }
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.DatePickerKt.getDatePickerModeTogglePadding());
            int mo3193getDisplayModejFl4v0 = this.getHighSpeedVideoSizes.mo3193getDisplayModejFl4v0();
            boolean changed = composer2.changed(this.getHighSpeedVideoSizes);
            final androidx.compose.material3.DatePickerState datePickerState = this.getHighSpeedVideoSizes;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DatePickerKt$DatePicker$5.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.DatePickerState.this, (androidx.compose.material3.DisplayMode) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.DatePickerKt.m3190DisplayModeToggleButtoniUJLfQg(padding, mo3193getDisplayModejFl4v0, (kotlin.jvm.functions.Function1) rememberedValue, this.getHighSpeedVideoFpsRangesFor, composer2, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.DatePickerState datePickerState, androidx.compose.material3.DisplayMode displayMode) {
        datePickerState.mo3194setDisplayModevCnGnXg(displayMode.getGetHighSpeedVideoFpsRangesFor());
        return kotlin.Unit.INSTANCE;
    }

    DatePickerKt$DatePicker$5(androidx.compose.material3.DatePickerState datePickerState, androidx.compose.material3.DatePickerColors datePickerColors) {
        this.getHighSpeedVideoSizes = datePickerState;
        this.getHighSpeedVideoFpsRangesFor = datePickerColors;
    }
}
