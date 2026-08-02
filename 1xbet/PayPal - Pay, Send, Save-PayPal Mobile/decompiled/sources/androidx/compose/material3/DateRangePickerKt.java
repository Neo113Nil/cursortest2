package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a[\u0010 \u001a\u00020\u00032\n\u0010!\u001a\u00060\"j\u0002`#2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%\u001aÄ\u0001\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u001b2:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,2!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0001022\u0006\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b6\u00107\u001a°\u0001\u00108\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020\u00152:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,2!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0001022\u0006\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u00109\u001a°\u0001\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<2\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,2!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0001022\u0006\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010=\u001ae\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010\u00152\b\u0010A\u001a\u0004\u0018\u00010\u00152:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,H\u0002¢\u0006\u0002\u0010B\u001a#\u0010G\u001a\u00020\u0001*\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0000¢\u0006\u0004\bM\u0010N\u001a.\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020UH\u0002\"\u0014\u0010C\u001a\u00020DX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F\"\u000e\u0010W\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010X\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010Y\u001a\u00020ZX\u0082\u0004¢\u0006\u0004\n\u0002\u0010[¨\u0006\\"}, d2 = {"DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "colors", "Landroidx/compose/material3/DatePickerColors;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "rememberDateRangePickerState", "initialSelectedStartDateMillis", "", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "DateRangePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "SwitchableDateEntryContent", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "displayMode", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startDateMillis", "endDateMillis", "onDisplayedMonthChange", "Lkotlin/Function1;", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "SwitchableDateEntryContent-eVtQiho", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "updateDateSelection", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateRangePickerKt {
    private static final androidx.compose.foundation.layout.PaddingValues getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 4, null);
    private static final androidx.compose.foundation.layout.PaddingValues Camera2StreamConfigurationMap = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 0.0f, 10, null);
    private static final androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 2, null);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(60.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateRangePicker(final androidx.compose.material3.DateRangePickerState dateRangePickerState, androidx.compose.ui.Modifier modifier, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.DatePickerColors datePickerColors, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, boolean z, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        int i5;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        int i6;
        boolean z2;
        int i7;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.material3.DatePickerFormatter datePickerFormatter2;
        final androidx.compose.material3.DatePickerColors datePickerColors2;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final boolean z3;
        androidx.compose.ui.focus.FocusRequester focusRequester2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.material3.DatePickerColors datePickerColors3;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        int i8;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.focus.FocusRequester focusRequester3;
        int i9;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        boolean z5;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.compose.material3.internal.CalendarModel createCalendarModel;
        androidx.compose.runtime.internal.ComposableLambda composableLambda2;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1969726368);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                }
                i11 = 128;
                i3 |= i11;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0 && startRestartGroup.changed(datePickerColors)) {
                    i10 = 2048;
                    i3 |= i10;
                }
                i10 = 1024;
                i3 |= i10;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(focusRequester) ? 8388608 : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                modifier4 = modifier;
                                datePickerFormatter2 = datePickerFormatter;
                                datePickerColors3 = datePickerColors;
                                focusRequester3 = focusRequester;
                                composableLambda = function23;
                                function26 = function24;
                                i9 = i3;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = androidx.compose.material3.DatePickerDefaults.dateFormatter$default(androidx.compose.material3.DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    datePickerFormatter2 = (androidx.compose.material3.DatePickerFormatter) rememberedValue2;
                                    i3 &= -897;
                                } else {
                                    datePickerFormatter2 = datePickerFormatter;
                                }
                                if ((i2 & 8) != 0) {
                                    datePickerColors3 = androidx.compose.material3.DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    datePickerColors3 = datePickerColors;
                                }
                                if (i4 != 0) {
                                    modifier3 = companion;
                                    z4 = true;
                                    i8 = 54;
                                    composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-803011924, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            androidx.compose.foundation.layout.PaddingValues paddingValues;
                                            androidx.compose.runtime.Composer composer3 = composer2;
                                            int intValue = num.intValue();
                                            if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-803011924, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:105)");
                                                }
                                                androidx.compose.material3.DateRangePickerDefaults dateRangePickerDefaults = androidx.compose.material3.DateRangePickerDefaults.INSTANCE;
                                                int mo3216getDisplayModejFl4v0 = androidx.compose.material3.DateRangePickerState.this.mo3216getDisplayModejFl4v0();
                                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                paddingValues = androidx.compose.material3.DateRangePickerKt.Camera2StreamConfigurationMap;
                                                dateRangePickerDefaults.m3206DateRangePickerTitleFNtVw6o(mo3216getDisplayModejFl4v0, androidx.compose.foundation.layout.PaddingKt.padding(companion2, paddingValues), datePickerColors3.getTitleContentColor(), composer3, 3120, 0);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }, startRestartGroup, 54);
                                } else {
                                    modifier3 = companion;
                                    z4 = true;
                                    i8 = 54;
                                    composableLambda = function23;
                                }
                                if (i5 != 0) {
                                    function24 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-331385278, z4, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            androidx.compose.foundation.layout.PaddingValues paddingValues;
                                            androidx.compose.runtime.Composer composer3 = composer2;
                                            int intValue = num.intValue();
                                            if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-331385278, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
                                                }
                                                androidx.compose.material3.DateRangePickerDefaults dateRangePickerDefaults = androidx.compose.material3.DateRangePickerDefaults.INSTANCE;
                                                java.lang.Long selectedStartDateMillis = androidx.compose.material3.DateRangePickerState.this.getSelectedStartDateMillis();
                                                java.lang.Long selectedEndDateMillis = androidx.compose.material3.DateRangePickerState.this.getSelectedEndDateMillis();
                                                int mo3216getDisplayModejFl4v0 = androidx.compose.material3.DateRangePickerState.this.mo3216getDisplayModejFl4v0();
                                                androidx.compose.material3.DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                paddingValues = androidx.compose.material3.DateRangePickerKt.getHighSpeedVideoFpsRangesFor;
                                                dateRangePickerDefaults.m3205DateRangePickerHeadlineqS89cEg(selectedStartDateMillis, selectedEndDateMillis, mo3216getDisplayModejFl4v0, datePickerFormatter3, androidx.compose.foundation.layout.PaddingKt.padding(companion2, paddingValues), datePickerColors3.getHeadlineContentColor(), composer3, 1597440, 0);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }, startRestartGroup, i8);
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new androidx.compose.ui.focus.FocusRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    focusRequester3 = (androidx.compose.ui.focus.FocusRequester) rememberedValue3;
                                    i9 = i3;
                                    function26 = function24;
                                    z5 = z2;
                                    modifier4 = modifier3;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1969726368, i9, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                                    }
                                    changed = startRestartGroup.changed(dateRangePickerState.getLocale());
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        if (!(dateRangePickerState instanceof androidx.compose.material3.BaseDatePickerStateImpl)) {
                                            createCalendarModel = ((androidx.compose.material3.BaseDatePickerStateImpl) dateRangePickerState).getCalendarModel();
                                        } else {
                                            createCalendarModel = androidx.compose.material3.internal.CalendarModel_androidKt.createCalendarModel(dateRangePickerState.getLocale());
                                        }
                                        rememberedValue = createCalendarModel;
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    androidx.compose.material3.internal.CalendarModel calendarModel = (androidx.compose.material3.internal.CalendarModel) rememberedValue;
                                    if (!z5) {
                                        startRestartGroup.startReplaceGroup(-2018438858);
                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1343236786, true, new androidx.compose.material3.DateRangePickerKt$DateRangePicker$5(dateRangePickerState, datePickerColors3), startRestartGroup, 54);
                                        startRestartGroup.endReplaceGroup();
                                        composableLambda2 = rememberComposableLambda;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-2018051234);
                                        startRestartGroup.endReplaceGroup();
                                        composableLambda2 = null;
                                    }
                                    int i13 = i9 >> 9;
                                    androidx.compose.material3.DatePickerKt.m3186DateEntryContainerau3_HiA(modifier4, composableLambda, function26, composableLambda2, datePickerColors3, androidx.compose.material3.TypographyKt.getValue(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4618getRangeSelectionHeaderContainerHeightD9Ej5fM() - getHighSpeedVideoFpsRanges), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(684885105, true, new androidx.compose.material3.DateRangePickerKt$DateRangePicker$6(dateRangePickerState, calendarModel, datePickerFormatter2, datePickerColors3, focusRequester3), startRestartGroup, 54), startRestartGroup, (i13 & 896) | ((i9 >> 3) & 14) | 14155776 | (i13 & 112) | ((i9 << 3) & 57344));
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    focusRequester2 = focusRequester3;
                                    function25 = function26;
                                    modifier2 = modifier4;
                                    androidx.compose.material3.DatePickerColors datePickerColors4 = datePickerColors3;
                                    z3 = z5;
                                    datePickerColors2 = datePickerColors4;
                                } else {
                                    modifier4 = modifier3;
                                    focusRequester3 = focusRequester;
                                    i9 = i3;
                                    function26 = function24;
                                }
                            }
                            z5 = z2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            changed = startRestartGroup.changed(dateRangePickerState.getLocale());
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            if (!(dateRangePickerState instanceof androidx.compose.material3.BaseDatePickerStateImpl)) {
                            }
                            rememberedValue = createCalendarModel;
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            androidx.compose.material3.internal.CalendarModel calendarModel2 = (androidx.compose.material3.internal.CalendarModel) rememberedValue;
                            if (!z5) {
                            }
                            int i132 = i9 >> 9;
                            androidx.compose.material3.DatePickerKt.m3186DateEntryContainerau3_HiA(modifier4, composableLambda, function26, composableLambda2, datePickerColors3, androidx.compose.material3.TypographyKt.getValue(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4618getRangeSelectionHeaderContainerHeightD9Ej5fM() - getHighSpeedVideoFpsRanges), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(684885105, true, new androidx.compose.material3.DateRangePickerKt$DateRangePicker$6(dateRangePickerState, calendarModel2, datePickerFormatter2, datePickerColors3, focusRequester3), startRestartGroup, 54), startRestartGroup, (i132 & 896) | ((i9 >> 3) & 14) | 14155776 | (i132 & 112) | ((i9 << 3) & 57344));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            focusRequester2 = focusRequester3;
                            function25 = function26;
                            modifier2 = modifier4;
                            androidx.compose.material3.DatePickerColors datePickerColors42 = datePickerColors3;
                            z3 = z5;
                            datePickerColors2 = datePickerColors42;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            datePickerFormatter2 = datePickerFormatter;
                            datePickerColors2 = datePickerColors;
                            composableLambda = function23;
                            function25 = function24;
                            z3 = z2;
                            focusRequester2 = focusRequester;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.material3.DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27 = composableLambda;
                            final androidx.compose.ui.focus.FocusRequester focusRequester4 = focusRequester2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material3.DateRangePickerKt.$r8$lambda$CnYLsFYEBjWd94MxKfuNvo2XUYc(androidx.compose.material3.DateRangePickerState.this, modifier2, datePickerFormatter3, datePickerColors2, function27, function25, z3, focusRequester4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function24 = function22;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function24 = function22;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final androidx.compose.material3.DateRangePickerState m3215rememberDateRangePickerStateIlFM19s(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, kotlin.ranges.IntRange intRange, int i, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.runtime.Composer composer, int i2, int i3) {
        final java.lang.Long l4 = (i3 & 1) != 0 ? null : l;
        final java.lang.Long l5 = (i3 & 2) != 0 ? null : l2;
        final java.lang.Long l6 = (i3 & 4) != 0 ? l4 : l3;
        final kotlin.ranges.IntRange yearRange = (i3 & 8) != 0 ? androidx.compose.material3.DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        final int m3239getPickerjFl4v0 = (i3 & 16) != 0 ? androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0() : i;
        androidx.compose.material3.SelectableDates allDates = (i3 & 32) != 0 ? androidx.compose.material3.DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2012087461, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:283)");
        }
        final java.util.Locale defaultLocale = androidx.compose.material3.CalendarLocale_androidKt.defaultLocale(composer, 0);
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.material3.DateRangePickerStateImpl, java.lang.Object> Saver = androidx.compose.material3.DateRangePickerStateImpl.INSTANCE.Saver(allDates, defaultLocale);
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(l4)) || (i2 & 6) == 4;
        boolean z2 = (((i2 & 112) ^ 48) > 32 && composer.changed(l5)) || (i2 & 48) == 32;
        boolean z3 = (((i2 & 896) ^ 384) > 256 && composer.changed(l6)) || (i2 & 384) == 256;
        boolean changedInstance = composer.changedInstance(yearRange);
        boolean z4 = (((i2 & 57344) ^ 24576) > 16384 && composer.changed(m3239getPickerjFl4v0)) || (i2 & 24576) == 16384;
        boolean z5 = (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(allDates)) || (i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        boolean changedInstance2 = composer.changedInstance(defaultLocale);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z5 | z2 | z | z3 | changedInstance | z4 | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            final androidx.compose.material3.SelectableDates selectableDates2 = allDates;
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.DateRangePickerKt.m3209$r8$lambda$Bz8_U8Wz3oGiMgWShX4_mb0gW4(l4, l5, l6, yearRange, m3239getPickerjFl4v0, selectableDates2, defaultLocale);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.DateRangePickerStateImpl dateRangePickerStateImpl = (androidx.compose.material3.DateRangePickerStateImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) Saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        dateRangePickerStateImpl.setSelectableDates(allDates);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return dateRangePickerStateImpl;
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.DateRangePickerState m3212DateRangePickerStateHVP43zI$default(java.util.Locale locale, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, kotlin.ranges.IntRange intRange, int i, androidx.compose.material3.SelectableDates selectableDates, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        if ((i2 & 8) != 0) {
            l3 = l;
        }
        if ((i2 & 16) != 0) {
            intRange = androidx.compose.material3.DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 32) != 0) {
            i = androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0();
        }
        if ((i2 & 64) != 0) {
            selectableDates = androidx.compose.material3.DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m3211DateRangePickerStateHVP43zI(locale, l, l2, l3, intRange, i, selectableDates);
    }

    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final androidx.compose.material3.DateRangePickerState m3211DateRangePickerStateHVP43zI(java.util.Locale locale, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, kotlin.ranges.IntRange intRange, int i, androidx.compose.material3.SelectableDates selectableDates) {
        return new androidx.compose.material3.DateRangePickerStateImpl(l, l2, l3, intRange, i, selectableDates, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(final java.lang.Long l, final java.lang.Long l2, final long j, final int i, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, final androidx.compose.material3.internal.CalendarModel calendarModel, final kotlin.ranges.IntRange intRange, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, final androidx.compose.material3.SelectableDates selectableDates, final androidx.compose.material3.DatePickerColors datePickerColors, final androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(621028059);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(intRange) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= (i2 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute(((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(621028059, i4, i5, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangePickerKt.m3210$r8$lambda$KC3ryiNp4Iu9fPQIKL2stbbQEI((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.material3.DisplayMode.m3231boximpl(i), androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) value, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-773828161, true, new kotlin.jvm.functions.Function3<androidx.compose.material3.DisplayMode, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.material3.DisplayMode displayMode, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    int getHighSpeedVideoFpsRangesFor2 = displayMode.getGetHighSpeedVideoFpsRangesFor();
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= composer3.changed(getHighSpeedVideoFpsRangesFor2) ? 4 : 2;
                    }
                    if (!composer3.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        composer3.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-773828161, intValue, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
                        }
                        if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(getHighSpeedVideoFpsRangesFor2, androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0())) {
                            composer3.startReplaceGroup(-619517270);
                            androidx.compose.material3.DateRangePickerKt.getHighSpeedVideoFpsRangesFor(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(getHighSpeedVideoFpsRangesFor2, androidx.compose.material3.DisplayMode.INSTANCE.m3238getInputjFl4v0())) {
                            composer3.startReplaceGroup(-619495944);
                            androidx.compose.material3.DateRangeInputKt.DateRangeInputContent(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-2023979101);
                            composer3.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 14) | 24576, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DateRangePickerKt.$r8$lambda$K1W_u6KctGY09nyL9nYm9BITgIg(l, l2, j, i, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(final java.lang.Long l, final java.lang.Long l2, final long j, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, final androidx.compose.material3.internal.CalendarModel calendarModel, final kotlin.ranges.IntRange intRange, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, final androidx.compose.material3.SelectableDates selectableDates, final androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-787063721);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if (!startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-787063721, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(calendarModel.getMonth(j).indexIn(intRange), 0);
            androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(coerceAtLeast, 0, startRestartGroup, 0, 2);
            boolean changed = startRestartGroup.changed(rememberLazyListState);
            boolean changed2 = startRestartGroup.changed(coerceAtLeast);
            androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1(rememberLazyListState, coerceAtLeast, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(coerceAtLeast), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.material3.DatePickerKt.WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            composer2 = startRestartGroup;
            getHighSpeedVideoSizes(rememberLazyListState, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, ((i2 << 3) & 1008) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (1879048192 & i2));
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DateRangePickerKt.m3207$r8$lambda$r2OJnZW20KNMbWbQC1QEEhU5mI(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final androidx.compose.foundation.lazy.LazyListState lazyListState, final java.lang.Long l, final java.lang.Long l2, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, final androidx.compose.material3.internal.CalendarModel calendarModel, final kotlin.ranges.IntRange intRange, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, final androidx.compose.material3.SelectableDates selectableDates, final androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.Object month;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1257365001);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if (!startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1257365001, i2, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            androidx.compose.material3.internal.CalendarDate today = calendarModel.getToday();
            boolean changed = startRestartGroup.changed(intRange);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                month = calendarModel.getMonth(intRange.getFirst(), 1);
                startRestartGroup.updateRememberedValue(month);
            } else {
                month = rememberedValue;
            }
            int i3 = i2;
            androidx.compose.material3.TextKt.ProvideTextStyle(androidx.compose.material3.TypographyKt.getValue(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), startRestartGroup, 6), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1090773432, true, new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1(l, l2, function2, lazyListState, intRange, calendarModel, (androidx.compose.material3.internal.CalendarMonth) month, datePickerFormatter, datePickerColors, today, selectableDates), startRestartGroup, 54), startRestartGroup, 48);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i3 & 57344) == 16384;
            boolean changedInstance = startRestartGroup.changedInstance(calendarModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(intRange);
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z | z2 | changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, function1, calendarModel, intRange, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(lazyListState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DateRangePickerKt.$r8$lambda$7CNg8yHcFyio3BnPo8c16Ur1U1I(androidx.compose.foundation.lazy.LazyListState.this, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.foundation.layout.PaddingValues getCalendarMonthSubheadPadding() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m3214drawRangeBackgroundmxwnekA(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.material3.SelectedRangeInfo selectedRangeInfo, long j) {
        float intBitsToFloat;
        float f = contentDrawScope.mo1418toPx0680j_4(androidx.compose.material3.DatePickerKt.getRecommendedSizeForAccessibility());
        float f2 = contentDrawScope.mo1418toPx0680j_4(androidx.compose.material3.DatePickerKt.getRecommendedSizeForAccessibility());
        float f3 = (f2 - contentDrawScope.mo1418toPx0680j_4(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4611getDateStateLayerHeightD9Ej5fM())) / 2.0f;
        float intBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - (f * 7.0f)) / 7.0f;
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(gridStartCoordinates);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int m8729getXimpl2 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(gridEndCoordinates);
        int m8730getYimpl2 = androidx.compose.ui.unit.IntOffset.m8730getYimpl(gridEndCoordinates);
        float f4 = f + intBitsToFloat2;
        float f5 = intBitsToFloat2 / 2.0f;
        float f6 = (m8729getXimpl * f4) + (selectedRangeInfo.getFirstIsSelectionStart() ? f / 2.0f : 0.0f) + f5;
        float f7 = (m8730getYimpl * f2) + f3;
        float f8 = m8729getXimpl2;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            f /= 2.0f;
        }
        float f9 = (f8 * f4) + f + f5;
        float f10 = m8730getYimpl2;
        boolean z = contentDrawScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
        if (z) {
            f6 = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - f6;
            f9 = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - f9;
        }
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        float f11 = f9;
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f7) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
        if (m8730getYimpl == m8730getYimpl2) {
            intBitsToFloat = f11 - f6;
        } else {
            intBitsToFloat = z ? -f6 : java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - f6;
        }
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope2, j, m5744constructorimpl, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        if (m8730getYimpl != m8730getYimpl2) {
            for (int i = (m8730getYimpl2 - m8730getYimpl) - 1; i > 0; i--) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope2, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits((i * f2) + f7) & 4294967295L)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32))) << 32) | (java.lang.Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            }
            androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope2, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((f10 * f2) + f3) & 4294967295L) | (java.lang.Float.floatToRawIntBits(contentDrawScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr ? 0.0f : java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32))) << 32)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(z ? f11 - java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) : f11) << 32) | (java.lang.Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
    }

    /* renamed from: $r8$lambda$-r2OJnZW20KNMbWbQC1QEEhU5mI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3207$r8$lambda$r2OJnZW20KNMbWbQC1QEEhU5mI(java.lang.Long l, java.lang.Long l2, long j, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, androidx.compose.material3.internal.CalendarModel calendarModel, kotlin.ranges.IntRange intRange, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7CNg8yHcFyio3BnPo8c16Ur1U1I(androidx.compose.foundation.lazy.LazyListState lazyListState, java.lang.Long l, java.lang.Long l2, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, androidx.compose.material3.internal.CalendarModel calendarModel, kotlin.ranges.IntRange intRange, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(lazyListState, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B8GnVpXL3wThejePwkPeD1-0zSw, reason: not valid java name */
    public static /* synthetic */ boolean m3208$r8$lambda$B8GnVpXL3wThejePwkPeD10zSw(androidx.compose.foundation.lazy.LazyListState lazyListState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!lazyListState.getCanScrollBackward()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1(lazyListState, null), 3, null);
        return true;
    }

    /* renamed from: $r8$lambda$Bz8_U8-Wz3oGiMgWShX4_mb0gW4, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.DateRangePickerStateImpl m3209$r8$lambda$Bz8_U8Wz3oGiMgWShX4_mb0gW4(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, kotlin.ranges.IntRange intRange, int i, androidx.compose.material3.SelectableDates selectableDates, java.util.Locale locale) {
        return new androidx.compose.material3.DateRangePickerStateImpl(l, l2, l3, intRange, i, selectableDates, locale, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CnYLsFYEBjWd94MxKfuNvo2XUYc(androidx.compose.material3.DateRangePickerState dateRangePickerState, androidx.compose.ui.Modifier modifier, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.DatePickerColors datePickerColors, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, boolean z, androidx.compose.ui.focus.FocusRequester focusRequester, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DateRangePicker(dateRangePickerState, modifier, datePickerFormatter, datePickerColors, function2, function22, z, focusRequester, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K1W_u6KctGY09nyL9nYm9BITgIg(java.lang.Long l, java.lang.Long l2, long j, int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, androidx.compose.material3.internal.CalendarModel calendarModel, kotlin.ranges.IntRange intRange, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.ui.focus.FocusRequester focusRequester, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighSpeedVideoSizes(l, l2, j, i, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KC3ryiN-p4Iu9fPQIKL2stbbQEI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3210$r8$lambda$KC3ryiNp4Iu9fPQIKL2stbbQEI(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$QcPLdcAgpNfYfMv0qdITlGcij6o(androidx.compose.foundation.lazy.LazyListState lazyListState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!lazyListState.getCanScrollForward()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1(lazyListState, null), 3, null);
        return true;
    }

    public static final /* synthetic */ void access$updateDateSelection(long j, java.lang.Long l, java.lang.Long l2, kotlin.jvm.functions.Function2 function2) {
        if ((l == null && l2 == null) || (l != null && l2 != null)) {
            function2.invoke(java.lang.Long.valueOf(j), null);
        } else if (l != null && j >= l.longValue()) {
            function2.invoke(l, java.lang.Long.valueOf(j));
        } else {
            function2.invoke(java.lang.Long.valueOf(j), null);
        }
    }
}
