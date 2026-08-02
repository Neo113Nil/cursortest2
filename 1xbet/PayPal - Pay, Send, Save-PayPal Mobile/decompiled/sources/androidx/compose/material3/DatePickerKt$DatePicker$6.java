package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$DatePicker$6 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.DatePickerState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.DatePickerFormatter getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.DatePickerColors getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1346903698, intValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:220)");
            }
            java.lang.Long selectedDateMillis = this.getHighResolutionOutputSizeshNQ4ISI.getSelectedDateMillis();
            long displayedMonthMillis = this.getHighResolutionOutputSizeshNQ4ISI.getDisplayedMonthMillis();
            int mo3193getDisplayModejFl4v0 = this.getHighResolutionOutputSizeshNQ4ISI.mo3193getDisplayModejFl4v0();
            boolean changed = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.compose.material3.DatePickerState datePickerState = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DatePickerKt$DatePicker$6.getHighSpeedVideoFpsRanges(androidx.compose.material3.DatePickerState.this, (java.lang.Long) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.compose.material3.DatePickerState datePickerState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DatePickerKt$DatePicker$6.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.DatePickerState.this, ((java.lang.Long) obj).longValue());
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.material3.DatePickerKt.getHighResolutionOutputSizeshNQ4ISI(selectedDateMillis, displayedMonthMillis, mo3193getDisplayModejFl4v0, function1, (kotlin.jvm.functions.Function1) rememberedValue2, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.getYearRange(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.getSelectableDates(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, composer2, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.DatePickerState datePickerState, long j) {
        datePickerState.setDisplayedMonthMillis(j);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material3.DatePickerState datePickerState, java.lang.Long l) {
        datePickerState.setSelectedDateMillis(l);
        return kotlin.Unit.INSTANCE;
    }

    DatePickerKt$DatePicker$6(androidx.compose.material3.DatePickerState datePickerState, androidx.compose.material3.internal.CalendarModel calendarModel, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighResolutionOutputSizeshNQ4ISI = datePickerState;
        this.Camera2StreamConfigurationMap = calendarModel;
        this.getHighSpeedVideoFpsRanges = datePickerFormatter;
        this.getHighSpeedVideoFpsRangesFor = datePickerColors;
        this.getHighSpeedVideoSizes = focusRequester;
    }
}
