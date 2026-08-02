package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\u008b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+J+\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\bH\u0007¢\u0006\u0004\b5\u00106J=\u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u0001092\u0006\u00100\u001a\u0002012\u0006\u0010(\u001a\u00020)2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\bH\u0007¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0001¢\u0006\u0004\bC\u0010DR\u0018\u0010$\u001a\u00020\u0005*\u00020%8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010E\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010I\u001a\u00020J¢\u0006\n\n\u0002\u0010M\u001a\u0004\bK\u0010LR\u0011\u0010N\u001a\u00020O8G¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010R\u001a\u00020S¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u000e\u0010V\u001a\u00020+X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020+X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020+X\u0086T¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "dateTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-bSRYm20", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultDatePickerColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "yearSelectionSkeleton", "", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "DatePickerTitle", "", "displayMode", "Landroidx/compose/material3/DisplayMode;", "modifier", "Landroidx/compose/ui/Modifier;", "contentColor", "DatePickerTitle-FNtVw6o", "(ILandroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "DatePickerHeadline", "selectedDateMillis", "", "DatePickerHeadline-ISIPfiY", "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "rememberSnapFlingBehavior$material3", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "YearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "AllDates", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "YearMonthSkeleton", "YearAbbrMonthDaySkeleton", "YearMonthWeekdayDaySkeleton", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final java.lang.String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final java.lang.String YearMonthSkeleton = "yMMMM";
    public static final java.lang.String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final androidx.compose.material3.DatePickerDefaults INSTANCE = new androidx.compose.material3.DatePickerDefaults();
    private static final kotlin.ranges.IntRange getHighSpeedVideoFpsRangesFor = new kotlin.ranges.IntRange(1900, 2100);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4653getLevel0D9Ej5fM();
    private static final androidx.compose.material3.SelectableDates Camera2StreamConfigurationMap = new androidx.compose.material3.SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    public final androidx.compose.material3.DatePickerColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-275219611, i, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:447)");
        }
        androidx.compose.material3.DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColors;
    }

    /* renamed from: colors-bSRYm20, reason: not valid java name */
    public final androidx.compose.material3.DatePickerColors m3173colorsbSRYm20(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.runtime.Composer composer, int i, int i2, int i3, int i4) {
        long j25;
        long j26;
        long m6032getUnspecified0d7_KjU = (i4 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j;
        long m6032getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j2;
        long m6032getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3;
        long m6032getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4;
        long m6032getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j5;
        long m6032getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j6;
        long m6032getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j7;
        long m6032getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j8;
        long m6032getUnspecified0d7_KjU9 = (i4 & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j9;
        long m6032getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j10;
        long m6032getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j11;
        long m6032getUnspecified0d7_KjU12 = (i4 & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j12;
        long m6032getUnspecified0d7_KjU13 = (i4 & 4096) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j13;
        long m6032getUnspecified0d7_KjU14 = (i4 & 8192) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j14;
        long m6032getUnspecified0d7_KjU15 = (i4 & 16384) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j15;
        long m6032getUnspecified0d7_KjU16 = (i4 & 32768) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j16;
        long m6032getUnspecified0d7_KjU17 = (i4 & 65536) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j17;
        long m6032getUnspecified0d7_KjU18 = (i4 & 131072) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j18;
        long m6032getUnspecified0d7_KjU19 = (i4 & 262144) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j19;
        long m6032getUnspecified0d7_KjU20 = (i4 & 524288) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j20;
        long m6032getUnspecified0d7_KjU21 = (i4 & 1048576) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j21;
        long m6032getUnspecified0d7_KjU22 = (i4 & 2097152) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j22;
        long m6032getUnspecified0d7_KjU23 = (i4 & 4194304) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j23;
        long m6032getUnspecified0d7_KjU24 = (i4 & 8388608) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j24;
        androidx.compose.material3.TextFieldColors textFieldColors2 = (i4 & 16777216) != 0 ? null : textFieldColors;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            j26 = m6032getUnspecified0d7_KjU15;
            j25 = m6032getUnspecified0d7_KjU6;
            androidx.compose.runtime.ComposerKt.traceEventStart(1991626358, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:516)");
        } else {
            j25 = m6032getUnspecified0d7_KjU6;
            j26 = m6032getUnspecified0d7_KjU15;
        }
        androidx.compose.material3.DatePickerColors m3144copytNwlRmA = getDefaultDatePickerColors(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i3 >> 12) & 112).m3144copytNwlRmA(m6032getUnspecified0d7_KjU, m6032getUnspecified0d7_KjU2, m6032getUnspecified0d7_KjU3, m6032getUnspecified0d7_KjU4, m6032getUnspecified0d7_KjU5, j25, m6032getUnspecified0d7_KjU7, m6032getUnspecified0d7_KjU8, m6032getUnspecified0d7_KjU9, m6032getUnspecified0d7_KjU10, m6032getUnspecified0d7_KjU11, m6032getUnspecified0d7_KjU12, m6032getUnspecified0d7_KjU13, m6032getUnspecified0d7_KjU14, j26, m6032getUnspecified0d7_KjU16, m6032getUnspecified0d7_KjU17, m6032getUnspecified0d7_KjU18, m6032getUnspecified0d7_KjU19, m6032getUnspecified0d7_KjU20, m6032getUnspecified0d7_KjU21, m6032getUnspecified0d7_KjU23, m6032getUnspecified0d7_KjU22, m6032getUnspecified0d7_KjU24, textFieldColors2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3144copytNwlRmA;
    }

    public final androidx.compose.material3.DatePickerColors getDefaultDatePickerColors(androidx.compose.material3.ColorScheme colorScheme, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1180555308, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:546)");
        }
        androidx.compose.material3.DatePickerColors defaultDatePickerColorsCached = colorScheme.getDefaultDatePickerColorsCached();
        if (defaultDatePickerColorsCached != null) {
            composer.startReplaceGroup(642290457);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(642416503);
            defaultDatePickerColorsCached = new androidx.compose.material3.DatePickerColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor()), colorScheme.getOnSurfaceVariant(), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.DividerTokens.INSTANCE.getColor()), androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, (i & 14) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3(defaultDatePickerColorsCached);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColorsCached;
    }

    public static /* synthetic */ androidx.compose.material3.DatePickerFormatter dateFormatter$default(androidx.compose.material3.DatePickerDefaults datePickerDefaults, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = YearMonthSkeleton;
        }
        if ((i & 2) != 0) {
            str2 = YearAbbrMonthDaySkeleton;
        }
        if ((i & 4) != 0) {
            str3 = YearMonthWeekdayDaySkeleton;
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    public final androidx.compose.material3.DatePickerFormatter dateFormatter(java.lang.String yearSelectionSkeleton, java.lang.String selectedDateSkeleton, java.lang.String selectedDateDescriptionSkeleton) {
        return new androidx.compose.material3.DatePickerFormatterImpl(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /* renamed from: DatePickerTitle-FNtVw6o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3172DatePickerTitleFNtVw6o(final int i, androidx.compose.ui.Modifier modifier, long j, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j2;
        final androidx.compose.ui.Modifier modifier3;
        final long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-390880814);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j2 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(this) ? 2048 : 1024;
            }
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        j2 = colors(startRestartGroup, (i4 >> 9) & 14).getTitleContentColor();
                        i4 &= -897;
                    }
                }
                long j4 = j2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-390880814, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)");
                }
                if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(-1974299164);
                    androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                    androidx.compose.material3.TextKt.m3985TextNvy7gAk(androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_title), startRestartGroup, 0), companion, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, i4 & 1008, 0, 262136);
                    startRestartGroup.endReplaceGroup();
                } else if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3238getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(-1974291869);
                    androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
                    androidx.compose.material3.TextKt.m3985TextNvy7gAk(androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_title), startRestartGroup, 0), companion, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, i4 & 1008, 0, 262136);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1073325776);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
                j3 = j4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DatePickerDefaults$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.DatePickerDefaults.$r8$lambda$vSptwFA9Th_g3H73fhPdtwK4qdc(androidx.compose.material3.DatePickerDefaults.this, i, modifier3, j3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a0  */
    /* renamed from: DatePickerHeadline-ISIPfiY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3171DatePickerHeadlineISIPfiY(final java.lang.Long l, final int i, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.ui.Modifier modifier, long j, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j2;
        androidx.compose.runtime.Composer composer2;
        long j3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        long j4;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        java.lang.String str;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1913724796);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i6 = 16384;
                        i4 |= i6;
                    }
                } else {
                    j2 = j;
                }
                i6 = 8192;
                i4 |= i6;
            } else {
                j2 = j;
            }
            if ((i3 & 32) == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(this) ? 131072 : 65536;
            }
            if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    i5 = i4;
                    modifier4 = modifier2;
                    j3 = j2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i3 & 16) != 0) {
                        j4 = colors(startRestartGroup, (i4 >> 15) & 14).getHeadlineContentColor();
                        i4 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    i5 = i4;
                    modifier4 = companion;
                    j3 = j4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1913724796, i5, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)");
                }
                java.util.Locale defaultLocale = androidx.compose.material3.CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
                java.lang.String formatDate$default = androidx.compose.material3.DatePickerFormatter.formatDate$default(datePickerFormatter, l, defaultLocale, false, 4, null);
                java.lang.String formatDate = datePickerFormatter.formatDate(l, defaultLocale, true);
                if (formatDate != null) {
                    startRestartGroup.startReplaceGroup(843542258);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(380185931);
                    if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843549871);
                        androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                        formatDate = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_no_selection_description), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3238getInputjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843552842);
                        androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
                        formatDate = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_no_input_description), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(380407362);
                        startRestartGroup.endReplaceGroup();
                        formatDate = "";
                    }
                    startRestartGroup.endReplaceGroup();
                }
                if (formatDate$default != null) {
                    startRestartGroup.startReplaceGroup(843557408);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(380507587);
                    if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843560257);
                        androidx.compose.material3.internal.Strings.Companion companion4 = androidx.compose.material3.internal.Strings.INSTANCE;
                        formatDate$default = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_headline), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3238getInputjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843562784);
                        androidx.compose.material3.internal.Strings.Companion companion5 = androidx.compose.material3.internal.Strings.INSTANCE;
                        formatDate$default = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_headline), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(380705954);
                        startRestartGroup.endReplaceGroup();
                        formatDate$default = "";
                    }
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3239getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(843570444);
                    androidx.compose.material3.internal.Strings.Companion companion6 = androidx.compose.material3.internal.Strings.INSTANCE;
                    str = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_headline_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (androidx.compose.material3.DisplayMode.m3234equalsimpl0(i, androidx.compose.material3.DisplayMode.INSTANCE.m3238getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(843573323);
                    androidx.compose.material3.internal.Strings.Companion companion7 = androidx.compose.material3.internal.Strings.INSTANCE;
                    str = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_headline_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(381043234);
                    startRestartGroup.endReplaceGroup();
                    str = "";
                }
                final java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{formatDate}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                boolean changed = startRestartGroup.changed(format);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerDefaults$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DatePickerDefaults.m3170$r8$lambda$fblXEPSdNAwp4x5maqUAPW1cKA(format, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                java.lang.String str2 = formatDate$default;
                composer2 = startRestartGroup;
                androidx.compose.material3.TextKt.m3985TextNvy7gAk(str2, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier4, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, (i5 >> 6) & 896, 24576, 245752);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                j3 = j2;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final long j5 = j3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DatePickerDefaults$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.DatePickerDefaults.m3169$r8$lambda$HlAVQkCqdlaTG8YZy5zoJjYhD4(androidx.compose.material3.DatePickerDefaults.this, l, i, datePickerFormatter, modifier3, j5, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final androidx.compose.foundation.gestures.FlingBehavior rememberSnapFlingBehavior$material3(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            decayAnimationSpec = androidx.compose.animation.core.DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:741)");
        }
        androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects, composer, 6);
        boolean changed = composer.changed(decayAnimationSpec);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider$default = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            rememberedValue = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.snapFlingBehavior(new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public final float calculateApproachOffset(float velocity, float decayOffset) {
                    return 0.0f;
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public final float calculateSnapOffset(float velocity) {
                    return androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider.this.calculateSnapOffset(velocity);
                }
            }, decayAnimationSpec, value);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior = (androidx.compose.foundation.gestures.TargetedFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public final kotlin.ranges.IntRange getYearRange() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m3174getTonalElevationD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:770)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.material3.SelectableDates getAllDates() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: $r8$lambda$-HlAVQkCqdlaTG8YZy5zoJjYhD4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3169$r8$lambda$HlAVQkCqdlaTG8YZy5zoJjYhD4(androidx.compose.material3.DatePickerDefaults datePickerDefaults, java.lang.Long l, int i, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.ui.Modifier modifier, long j, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        datePickerDefaults.m3171DatePickerHeadlineISIPfiY(l, i, datePickerFormatter, modifier, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fblXEPSdN-Awp4x5maqUAPW1cKA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3170$r8$lambda$fblXEPSdNAwp4x5maqUAPW1cKA(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vSptwFA9Th_g3H73fhPdtwK4qdc(androidx.compose.material3.DatePickerDefaults datePickerDefaults, int i, androidx.compose.ui.Modifier modifier, long j, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        datePickerDefaults.m3172DatePickerTitleFNtVw6o(i, modifier, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }
}
