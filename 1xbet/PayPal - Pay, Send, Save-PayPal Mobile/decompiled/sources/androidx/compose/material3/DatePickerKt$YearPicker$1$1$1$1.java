package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$YearPicker$1$1$1$1 implements kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.DatePickerColors Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.SelectableDates getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.ranges.IntRange getOutputFormats;

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
        int intValue = num.intValue();
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue2 = num2.intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= composer2.changed(intValue) ? 32 : 16;
        }
        if (!composer2.shouldExecute((intValue2 & 145) != 144, intValue2 & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(674613074, intValue2, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2088)");
            }
            final int first = intValue + this.getOutputFormats.getFirst();
            java.lang.String localString$default = androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(first, 0, 0, false, this.getHighResolutionOutputSizeshNQ4ISI.getLocale(), 7, null);
            androidx.compose.ui.Modifier m1734requiredSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1734requiredSizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4620getSelectionYearContainerWidthD9Ej5fM(), androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4619getSelectionYearContainerHeightD9Ej5fM());
            boolean z = first == this.getHighSpeedVideoSizes;
            boolean z2 = first == this.getHighSpeedVideoFpsRanges;
            boolean changed = composer2.changed(this.getHighSpeedVideoFpsRangesFor);
            boolean changed2 = composer2.changed(first);
            final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, first);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            boolean isSelectableYear = this.getHighSpeedVideoSizesFor.isSelectableYear(first);
            androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String format = java.lang.String.format(androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_navigate_to_year_description), composer2, 0), java.util.Arrays.copyOf(new java.lang.Object[]{localString$default}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            androidx.compose.material3.DatePickerKt.getHighResolutionOutputSizeshNQ4ISI(localString$default, m1734requiredSizeVpY3zN4, z, z2, (kotlin.jvm.functions.Function0) rememberedValue, isSelectableYear, format, this.Camera2StreamConfigurationMap, composer2, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    DatePickerKt$YearPicker$1$1$1$1(kotlin.ranges.IntRange intRange, androidx.compose.material3.internal.CalendarModel calendarModel, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors) {
        this.getOutputFormats = intRange;
        this.getHighResolutionOutputSizeshNQ4ISI = calendarModel;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizesFor = selectableDates;
        this.Camera2StreamConfigurationMap = datePickerColors;
    }
}
