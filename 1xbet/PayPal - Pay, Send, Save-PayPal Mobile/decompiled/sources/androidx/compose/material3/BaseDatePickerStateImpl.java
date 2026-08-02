package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\n\u001a\u00060\bj\u0002`\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00068G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR$\u0010(\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/material3/BaseDatePickerStateImpl;", "", "", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "locale", "<init>", "(Ljava/lang/Long;Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/internal/CalendarModel;", "<set-?>", "selectableDates$delegate", "Landroidx/compose/runtime/MutableState;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "setSelectableDates", "(Landroidx/compose/material3/SelectableDates;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarMonth;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "monthMillis", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "displayedMonthMillis"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;
    private final androidx.compose.material3.internal.CalendarModel calendarModel;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.material3.internal.CalendarMonth> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Locale locale;

    /* renamed from: selectableDates$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState selectableDates;
    private final kotlin.ranges.IntRange yearRange;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r6.contains(r5.getYear()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseDatePickerStateImpl(java.lang.Long l, kotlin.ranges.IntRange intRange, androidx.compose.material3.SelectableDates selectableDates, java.util.Locale locale) {
        androidx.compose.material3.internal.CalendarMonth month;
        this.yearRange = intRange;
        this.locale = locale;
        androidx.compose.material3.internal.CalendarModel createCalendarModel = androidx.compose.material3.internal.CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = createCalendarModel;
        this.selectableDates = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(selectableDates, null, 2, null);
        if (l != null) {
            month = createCalendarModel.getMonth(l.longValue());
        }
        month = createCalendarModel.getMonth(createCalendarModel.getToday());
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
    }

    public final kotlin.ranges.IntRange getYearRange() {
        return this.yearRange;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final androidx.compose.material3.internal.CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final androidx.compose.material3.SelectableDates getSelectableDates() {
        return (androidx.compose.material3.SelectableDates) this.selectableDates.getValue();
    }

    public final void setSelectableDates(androidx.compose.material3.SelectableDates selectableDates) {
        this.selectableDates.setValue(selectableDates);
    }

    public final long getDisplayedMonthMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getStartUtcTimeMillis();
    }

    public final void setDisplayedMonthMillis(long j) {
        androidx.compose.material3.internal.CalendarMonth month = this.calendarModel.getMonth(j);
        if (this.yearRange.contains(month.getYear())) {
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(month);
        }
    }
}
