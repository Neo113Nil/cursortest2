package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/MonthKt__MonthJvmKt", "kotlinx/datetime/MonthKt__MonthKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MonthKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
    public static final /* synthetic */ java.time.Month Month(int i) {
        java.time.Month javaMonth;
        javaMonth = kotlinx.datetime.ConvertersKt.toJavaMonth(m24142Month(i));
        return javaMonth;
    }

    /* renamed from: Month, reason: collision with other method in class */
    public static final kotlinx.datetime.Month m24142Month(int i) {
        return kotlinx.datetime.MonthKt__MonthKt.Month(i);
    }

    public static final int getNumber(java.time.Month month) {
        return kotlinx.datetime.MonthKt__MonthJvmKt.getNumber(month);
    }

    public static final int getNumber(kotlinx.datetime.Month month) {
        return kotlinx.datetime.MonthKt__MonthKt.getNumber(month);
    }
}
