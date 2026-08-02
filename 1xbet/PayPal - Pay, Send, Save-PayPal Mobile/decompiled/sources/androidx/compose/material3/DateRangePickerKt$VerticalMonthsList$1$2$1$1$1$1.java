package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.DatePickerFormatter getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.internal.CalendarMonth getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.DatePickerColors getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-577031469, intValue, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
            }
            java.lang.String formatMonthYear = this.getHighSpeedVideoFpsRanges.formatMonthYear(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.getStartUtcTimeMillis()), this.Camera2StreamConfigurationMap.getLocale());
            if (formatMonthYear == null) {
                formatMonthYear = "-";
            }
            java.lang.String str = formatMonthYear;
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.DateRangePickerKt.getCalendarMonthSubheadPadding());
            boolean changedInstance = composer2.changedInstance(this.getHighResolutionOutputSizeshNQ4ISI);
            final java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1.Camera2StreamConfigurationMap(list, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(padding, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), this.getHighSpeedVideoSizes.getSubheadContentColor(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262136);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list);
        return kotlin.Unit.INSTANCE;
    }

    DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.internal.CalendarMonth calendarMonth, androidx.compose.material3.internal.CalendarModel calendarModel, java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list, androidx.compose.material3.DatePickerColors datePickerColors) {
        this.getHighSpeedVideoFpsRanges = datePickerFormatter;
        this.getHighSpeedVideoFpsRangesFor = calendarMonth;
        this.Camera2StreamConfigurationMap = calendarModel;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoSizes = datePickerColors;
    }
}
