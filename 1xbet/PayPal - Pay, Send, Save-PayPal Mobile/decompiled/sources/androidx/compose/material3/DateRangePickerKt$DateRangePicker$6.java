package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DateRangePickerKt$DateRangePicker$6 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.DateRangePickerState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.DatePickerColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.DatePickerFormatter getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(684885105, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:154)");
            }
            java.lang.Long selectedStartDateMillis = this.Camera2StreamConfigurationMap.getSelectedStartDateMillis();
            java.lang.Long selectedEndDateMillis = this.Camera2StreamConfigurationMap.getSelectedEndDateMillis();
            long displayedMonthMillis = this.Camera2StreamConfigurationMap.getDisplayedMonthMillis();
            int mo3216getDisplayModejFl4v0 = this.Camera2StreamConfigurationMap.mo3216getDisplayModejFl4v0();
            boolean changed = composer2.changed(this.Camera2StreamConfigurationMap);
            final androidx.compose.material3.DateRangePickerState dateRangePickerState = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.material3.DateRangePickerKt$DateRangePicker$6.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.DateRangePickerState.this, (java.lang.Long) obj, (java.lang.Long) obj2);
                        return highSpeedVideoFpsRangesFor;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            boolean changed2 = composer2.changed(this.Camera2StreamConfigurationMap);
            final androidx.compose.material3.DateRangePickerState dateRangePickerState2 = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$6$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangePickerKt$DateRangePicker$6.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.DateRangePickerState.this, ((java.lang.Long) obj).longValue());
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.material3.DateRangePickerKt.getHighSpeedVideoSizes(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo3216getDisplayModejFl4v0, function2, (kotlin.jvm.functions.Function1) rememberedValue2, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getYearRange(), this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.getSelectableDates(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, composer2, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.DateRangePickerState dateRangePickerState, java.lang.Long l, java.lang.Long l2) {
        try {
            dateRangePickerState.setSelection(l, l2);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.DateRangePickerState dateRangePickerState, long j) {
        dateRangePickerState.setDisplayedMonthMillis(j);
        return kotlin.Unit.INSTANCE;
    }

    DateRangePickerKt$DateRangePicker$6(androidx.compose.material3.DateRangePickerState dateRangePickerState, androidx.compose.material3.internal.CalendarModel calendarModel, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.Camera2StreamConfigurationMap = dateRangePickerState;
        this.getHighSpeedVideoFpsRangesFor = calendarModel;
        this.getHighSpeedVideoSizes = datePickerFormatter;
        this.getHighSpeedVideoFpsRanges = datePickerColors;
        this.getHighResolutionOutputSizeshNQ4ISI = focusRequester;
    }
}
