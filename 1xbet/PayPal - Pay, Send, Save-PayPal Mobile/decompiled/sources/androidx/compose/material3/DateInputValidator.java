package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u001a\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R$\u0010+\u001a\u0004\u0018\u00010*8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010*8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/compose/material3/internal/CalendarDate;", "dateToValidate", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "locale", "validate-XivgLIo", "(Landroidx/compose/material3/internal/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "validate", "getHighSpeedVideoSizesFor", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Landroidx/compose/material3/SelectableDates;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/internal/DateInputFormat;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/material3/DatePickerFormatter;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "getOutputFormats", "getInputFormats", "", "currentStartDateMillis", "Ljava/lang/Long;", "getCurrentStartDateMillis", "()Ljava/lang/Long;", "setCurrentStartDateMillis", "(Ljava/lang/Long;)V", "currentEndDateMillis", "getCurrentEndDateMillis", "setCurrentEndDateMillis"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateInputValidator {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.material3.DatePickerFormatter getHighSpeedVideoSizes;
    private java.lang.Long currentEndDateMillis;
    private java.lang.Long currentStartDateMillis;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.DateInputFormat getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.ranges.IntRange Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.material3.SelectableDates getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.String getInputFormats;

    public DateInputValidator(kotlin.ranges.IntRange intRange, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.internal.DateInputFormat dateInputFormat, androidx.compose.material3.DatePickerFormatter datePickerFormatter, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.Camera2StreamConfigurationMap = intRange;
        this.getHighSpeedVideoFpsRangesFor = selectableDates;
        this.getHighSpeedVideoFpsRanges = dateInputFormat;
        this.getHighSpeedVideoSizes = datePickerFormatter;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizesFor = str2;
        this.getOutputMinFrameDuration = str3;
        this.getInputFormats = str4;
    }

    public final java.lang.Long getCurrentStartDateMillis() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentStartDateMillis(java.lang.Long l) {
        this.currentStartDateMillis = l;
    }

    public final java.lang.Long getCurrentEndDateMillis() {
        return this.currentEndDateMillis;
    }

    public final void setCurrentEndDateMillis(java.lang.Long l) {
        this.currentEndDateMillis = l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r1 <= (r11 != null ? r11.longValue() : Long.MAX_VALUE)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        return r8.getInputFormats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r9 < (r11 != null ? r11.longValue() : Long.MIN_VALUE)) goto L30;
     */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String m3141validateXivgLIo(androidx.compose.material3.internal.CalendarDate dateToValidate, int inputIdentifier, java.util.Locale locale) {
        if (dateToValidate == null) {
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String upperCase = this.getHighSpeedVideoFpsRanges.getPatternWithDelimiters().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return androidx.compose.material3.internal.Strings_androidKt.formatString(str, upperCase);
        }
        if (!this.Camera2StreamConfigurationMap.contains(dateToValidate.getYear())) {
            return androidx.compose.material3.internal.Strings_androidKt.formatString(this.getHighSpeedVideoSizesFor, androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(this.Camera2StreamConfigurationMap.getFirst(), 0, 0, false, locale, 7, null), androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(this.Camera2StreamConfigurationMap.getLast(), 0, 0, false, locale, 7, null));
        }
        androidx.compose.material3.SelectableDates selectableDates = this.getHighSpeedVideoFpsRangesFor;
        if (!selectableDates.isSelectableYear(dateToValidate.getYear()) || !selectableDates.isSelectableDate(dateToValidate.getUtcTimeMillis())) {
            return androidx.compose.material3.internal.Strings_androidKt.formatString(this.getOutputMinFrameDuration, androidx.compose.material3.DatePickerFormatter.formatDate$default(this.getHighSpeedVideoSizes, java.lang.Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null));
        }
        if (androidx.compose.material3.InputIdentifier.m3401equalsimpl0(inputIdentifier, androidx.compose.material3.InputIdentifier.INSTANCE.m3407getStartDateInputJ2x2o4M())) {
            long utcTimeMillis = dateToValidate.getUtcTimeMillis();
            java.lang.Long l = this.currentEndDateMillis;
        }
        if (androidx.compose.material3.InputIdentifier.m3401equalsimpl0(inputIdentifier, androidx.compose.material3.InputIdentifier.INSTANCE.m3405getEndDateInputJ2x2o4M())) {
            long utcTimeMillis2 = dateToValidate.getUtcTimeMillis();
            java.lang.Long l2 = this.currentStartDateMillis;
        }
        return "";
    }
}
