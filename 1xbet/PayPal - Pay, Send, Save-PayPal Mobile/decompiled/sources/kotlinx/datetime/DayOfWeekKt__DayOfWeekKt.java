package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Lkotlinx/datetime/DayOfWeek;", "DayOfWeek", "(I)Lkotlinx/datetime/DayOfWeek;", "getIsoDayNumber", "(Lkotlinx/datetime/DayOfWeek;)I", "getHighSpeedVideoFpsRanges"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/DayOfWeekKt")
/* loaded from: classes3.dex */
final /* synthetic */ class DayOfWeekKt__DayOfWeekKt {
    public static final int getIsoDayNumber(kotlinx.datetime.DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        return dayOfWeek.ordinal() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlinx.datetime.DayOfWeek DayOfWeek(int i) {
        if (i <= 0 || i >= 8) {
            throw new java.lang.IllegalArgumentException("Expected ISO day-of-week number in 1..7, got ".concat(java.lang.String.valueOf(i)).toString());
        }
        return (kotlinx.datetime.DayOfWeek) kotlinx.datetime.DayOfWeek.getEntries().get(i - 1);
    }
}
