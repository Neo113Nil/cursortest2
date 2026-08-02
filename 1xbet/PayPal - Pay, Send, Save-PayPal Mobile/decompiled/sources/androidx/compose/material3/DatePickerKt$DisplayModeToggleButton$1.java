package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$DisplayModeToggleButton$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.material3.DisplayMode, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1734512197, intValue, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1408)");
            }
            if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(this.getHighSpeedVideoSizes, androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0())) {
                composer2.startReplaceGroup(-101264927);
                androidx.compose.ui.graphics.vector.ImageVector edit$material3 = androidx.compose.material3.internal.Icons.Filled.INSTANCE.getEdit$material3();
                androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
                java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_switch_to_input_mode), composer2, 0);
                boolean changed = composer2.changed(this.getHighSpeedVideoFpsRanges);
                final kotlin.jvm.functions.Function1<androidx.compose.material3.DisplayMode, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                androidx.compose.material3.DatePickerKt.Camera2StreamConfigurationMap((kotlin.jvm.functions.Function0) rememberedValue, edit$material3, m4383getString2EP1pXo, this.getHighResolutionOutputSizeshNQ4ISI, false, composer2, 0, 16);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-100967048);
                androidx.compose.ui.graphics.vector.ImageVector dateRange$material3 = androidx.compose.material3.internal.Icons.Filled.INSTANCE.getDateRange$material3();
                androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                java.lang.String m4383getString2EP1pXo2 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_switch_to_calendar_mode), composer2, 0);
                boolean changed2 = composer2.changed(this.getHighSpeedVideoFpsRanges);
                final kotlin.jvm.functions.Function1<androidx.compose.material3.DisplayMode, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.material3.DatePickerKt.Camera2StreamConfigurationMap((kotlin.jvm.functions.Function0) rememberedValue2, dateRange$material3, m4383getString2EP1pXo2, this.getHighResolutionOutputSizeshNQ4ISI, false, composer2, 0, 16);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(androidx.compose.material3.DisplayMode.m3231boximpl(androidx.compose.material3.DisplayMode.INSTANCE.m3238getInputjFl4v0()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(androidx.compose.material3.DisplayMode.m3231boximpl(androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    DatePickerKt$DisplayModeToggleButton$1(int i, kotlin.jvm.functions.Function1<? super androidx.compose.material3.DisplayMode, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = modifier;
    }
}
