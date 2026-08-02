package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$YearPicker$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.DatePickerColors Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.ranges.IntRange getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.material3.SelectableDates getInputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        float f;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1301915789, intValue, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2070)");
            }
            androidx.compose.material3.internal.CalendarModel calendarModel = this.getHighResolutionOutputSizeshNQ4ISI;
            final int year = calendarModel.getMonth(calendarModel.getToday()).getYear();
            final int year2 = this.getHighResolutionOutputSizeshNQ4ISI.getMonth(this.getHighSpeedVideoFpsRanges).getYear();
            androidx.compose.foundation.lazy.grid.LazyGridState rememberLazyGridState = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(java.lang.Math.max(0, (year2 - this.getHighSpeedVideoSizesFor.getFirst()) - 3), 0, composer2, 0, 2);
            androidx.compose.foundation.lazy.grid.GridCells.Fixed fixed = new androidx.compose.foundation.lazy.grid.GridCells.Fixed(3);
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getContainerColor(), null, 2, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical spaceEvenly = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceEvenly();
            androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
            f = androidx.compose.material3.DatePickerKt.getHighSpeedVideoSizesFor;
            androidx.compose.foundation.lazy.grid.GridCells.Fixed fixed2 = fixed;
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = arrangement.m1602spacedBy0680j_4(f);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical horizontalOrVertical = spaceEvenly;
            boolean changedInstance = composer2.changedInstance(this.getHighSpeedVideoSizesFor);
            boolean changedInstance2 = composer2.changedInstance(this.getHighResolutionOutputSizeshNQ4ISI);
            boolean changed = composer2.changed(year2);
            boolean changed2 = composer2.changed(year);
            boolean changed3 = composer2.changed(this.getHighSpeedVideoSizes);
            boolean changed4 = composer2.changed(this.getInputSizeshNQ4ISI);
            boolean changed5 = composer2.changed(this.Camera2StreamConfigurationMap);
            final kotlin.ranges.IntRange intRange = this.getHighSpeedVideoSizesFor;
            final androidx.compose.material3.internal.CalendarModel calendarModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            final androidx.compose.material3.SelectableDates selectableDates = this.getInputSizeshNQ4ISI;
            final androidx.compose.material3.DatePickerColors datePickerColors = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changedInstance | changedInstance2 | changed | changed2 | changed3 | changed4 | changed5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DatePickerKt$YearPicker$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.ranges.IntRange.this, calendarModel2, year2, year, function1, selectableDates, datePickerColors, (androidx.compose.foundation.lazy.grid.LazyGridScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(fixed2, m1286backgroundbw27NRU$default, rememberLazyGridState, null, false, m1602spacedBy0680j_4, horizontalOrVertical, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 1769472, 0, 920);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.ranges.IntRange intRange, androidx.compose.material3.internal.CalendarModel calendarModel, int i, int i2, kotlin.jvm.functions.Function1 function1, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope) {
        androidx.compose.foundation.lazy.grid.LazyGridScope.items$default(lazyGridScope, kotlin.collections.CollectionsKt.count(intRange), null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(674613074, true, new androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1(intRange, calendarModel, i, i2, function1, selectableDates, datePickerColors)), 14, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    DatePickerKt$YearPicker$1(androidx.compose.material3.internal.CalendarModel calendarModel, long j, kotlin.ranges.IntRange intRange, androidx.compose.ui.Modifier modifier, androidx.compose.material3.DatePickerColors datePickerColors, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.material3.SelectableDates selectableDates) {
        this.getHighResolutionOutputSizeshNQ4ISI = calendarModel;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizesFor = intRange;
        this.getHighSpeedVideoFpsRangesFor = modifier;
        this.Camera2StreamConfigurationMap = datePickerColors;
        this.getHighSpeedVideoSizes = function1;
        this.getInputSizeshNQ4ISI = selectableDates;
    }
}
