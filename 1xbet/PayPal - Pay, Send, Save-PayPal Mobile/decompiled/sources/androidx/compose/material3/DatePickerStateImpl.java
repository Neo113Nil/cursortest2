package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R$\u0010 \u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DatePickerState;", "", "p0", "p1", "Lkotlin/ranges/IntRange;", "p2", "Landroidx/compose/material3/DisplayMode;", "p3", "Landroidx/compose/material3/SelectableDates;", "p4", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "p5", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarDate;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "getSelectedDateMillis", "()Ljava/lang/Long;", "setSelectedDateMillis", "(Ljava/lang/Long;)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerStateImpl extends androidx.compose.material3.BaseDatePickerStateImpl implements androidx.compose.material3.DatePickerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.DatePickerStateImpl.Companion INSTANCE = new androidx.compose.material3.DatePickerStateImpl.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableState<androidx.compose.material3.DisplayMode> getHighSpeedVideoSizes;
    private androidx.compose.runtime.MutableState<androidx.compose.material3.internal.CalendarDate> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r5.contains(r3.getYear()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DatePickerStateImpl(java.lang.Long l, java.lang.Long l2, kotlin.ranges.IntRange intRange, int i, androidx.compose.material3.SelectableDates selectableDates, java.util.Locale locale) {
        super(l2, intRange, selectableDates, locale);
        androidx.compose.material3.internal.CalendarDate calendarDate;
        if (l != null) {
            calendarDate = getCalendarModel().getCanonicalDate(l.longValue());
        }
        calendarDate = null;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calendarDate, null, 2, null);
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material3.DisplayMode.m3231boximpl(i), null, 2, null);
    }

    @Override // androidx.compose.material3.DatePickerState
    public final java.lang.Long getSelectedDateMillis() {
        androidx.compose.material3.internal.CalendarDate value = this.getHighSpeedVideoFpsRangesFor.getValue();
        if (value != null) {
            return java.lang.Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    public final void setSelectedDateMillis(java.lang.Long l) {
        if (l != null) {
            androidx.compose.material3.internal.CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l.longValue());
            this.getHighSpeedVideoFpsRangesFor.setValue(getYearRange().contains(canonicalDate.getYear()) ? canonicalDate : null);
        } else {
            this.getHighSpeedVideoFpsRangesFor.setValue(null);
        }
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public final int mo3193getDisplayModejFl4v0() {
        return this.getHighSpeedVideoSizes.getValue().getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public final void mo3194setDisplayModevCnGnXg(int i) {
        java.lang.Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this.getHighSpeedVideoSizes.setValue(androidx.compose.material3.DisplayMode.m3231boximpl(i));
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "locale", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DatePickerStateImpl;", "Saver", "(Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.DatePickerStateImpl, java.lang.Object> Saver(final androidx.compose.material3.SelectableDates selectableDates, final java.util.Locale locale) {
            return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.List listOf;
                    listOf = kotlin.collections.CollectionsKt.listOf(r2.getSelectedDateMillis(), java.lang.Long.valueOf(r2.getDisplayedMonthMillis()), java.lang.Integer.valueOf(r2.getYearRange().getFirst()), java.lang.Integer.valueOf(r2.getYearRange().getLast()), java.lang.Integer.valueOf(((androidx.compose.material3.DatePickerStateImpl) obj2).mo3193getDisplayModejFl4v0()));
                    return listOf;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.DatePickerStateImpl.Companion.$r8$lambda$zz86afi5XwjCiUJrf4zSiVexueY(androidx.compose.material3.SelectableDates.this, locale, (java.util.List) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material3.DatePickerStateImpl $r8$lambda$zz86afi5XwjCiUJrf4zSiVexueY(androidx.compose.material3.SelectableDates selectableDates, java.util.Locale locale, java.util.List list) {
            java.lang.Long l = (java.lang.Long) list.get(0);
            java.lang.Long l2 = (java.lang.Long) list.get(1);
            java.lang.Object obj = list.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            int intValue = ((java.lang.Integer) obj).intValue();
            java.lang.Object obj2 = list.get(3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(intValue, ((java.lang.Integer) obj2).intValue());
            java.lang.Object obj3 = list.get(4);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            return new androidx.compose.material3.DatePickerStateImpl(l, l2, intRange, androidx.compose.material3.DisplayMode.m3232constructorimpl(((java.lang.Integer) obj3).intValue()), selectableDates, locale, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DatePickerStateImpl(java.lang.Long l, java.lang.Long l2, kotlin.ranges.IntRange intRange, int i, androidx.compose.material3.SelectableDates selectableDates, java.util.Locale locale, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, intRange, i, selectableDates, locale);
    }
}
