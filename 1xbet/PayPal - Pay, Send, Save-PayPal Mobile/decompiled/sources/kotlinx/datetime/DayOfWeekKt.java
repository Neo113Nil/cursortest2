package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/DayOfWeekKt__DayOfWeekJvmKt", "kotlinx/datetime/DayOfWeekKt__DayOfWeekKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayOfWeekKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
    public static final /* synthetic */ java.time.DayOfWeek DayOfWeek(int i) {
        java.time.DayOfWeek javaDayOfWeek;
        javaDayOfWeek = kotlinx.datetime.ConvertersKt.toJavaDayOfWeek(m24135DayOfWeek(i));
        return javaDayOfWeek;
    }

    /* renamed from: DayOfWeek, reason: collision with other method in class */
    public static final kotlinx.datetime.DayOfWeek m24135DayOfWeek(int i) {
        return kotlinx.datetime.DayOfWeekKt__DayOfWeekKt.DayOfWeek(i);
    }

    public static final int getIsoDayNumber(java.time.DayOfWeek dayOfWeek) {
        return kotlinx.datetime.DayOfWeekKt__DayOfWeekJvmKt.getIsoDayNumber(dayOfWeek);
    }

    public static final int getIsoDayNumber(kotlinx.datetime.DayOfWeek dayOfWeek) {
        return kotlinx.datetime.DayOfWeekKt__DayOfWeekKt.getIsoDayNumber(dayOfWeek);
    }
}
