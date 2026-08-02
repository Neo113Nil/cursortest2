package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Ljava/time/Month;", "Month", "(I)Ljava/time/Month;", "getNumber", "(Ljava/time/Month;)I", "getHighSpeedVideoFpsRangesFor"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/MonthKt")
/* loaded from: classes3.dex */
final /* synthetic */ class MonthKt__MonthJvmKt {
    public static final int getNumber(java.time.Month month) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        return kotlinx.datetime.MonthKt.getNumber(kotlinx.datetime.ConvertersKt.toKotlinMonth(month));
    }
}
