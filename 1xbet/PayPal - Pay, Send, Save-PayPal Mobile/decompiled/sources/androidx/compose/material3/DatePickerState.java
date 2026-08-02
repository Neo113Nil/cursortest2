package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0012\u001a\u00020\r8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "", "", "getSelectedDateMillis", "()Ljava/lang/Long;", "setSelectedDateMillis", "(Ljava/lang/Long;)V", "selectedDateMillis", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "displayedMonthMillis", "Landroidx/compose/material3/DisplayMode;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "getLocale", "()Ljava/util/Locale;", "locale"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DatePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo3193getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    java.util.Locale getLocale();

    androidx.compose.material3.SelectableDates getSelectableDates();

    java.lang.Long getSelectedDateMillis();

    kotlin.ranges.IntRange getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo3194setDisplayModevCnGnXg(int i);

    void setDisplayedMonthMillis(long j);

    void setSelectedDateMillis(java.lang.Long l);
}
