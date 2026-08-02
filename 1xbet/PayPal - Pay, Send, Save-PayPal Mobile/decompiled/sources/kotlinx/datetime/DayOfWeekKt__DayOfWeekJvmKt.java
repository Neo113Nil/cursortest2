package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Ljava/time/DayOfWeek;", "DayOfWeek", "(I)Ljava/time/DayOfWeek;", "getIsoDayNumber", "(Ljava/time/DayOfWeek;)I", "getHighResolutionOutputSizeshNQ4ISI"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/DayOfWeekKt")
/* loaded from: classes3.dex */
final /* synthetic */ class DayOfWeekKt__DayOfWeekJvmKt {
    public static final int getIsoDayNumber(java.time.DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        return kotlinx.datetime.DayOfWeekKt.getIsoDayNumber(kotlinx.datetime.ConvertersKt.toKotlinDayOfWeek(dayOfWeek));
    }
}
