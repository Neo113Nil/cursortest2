package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "Ljava/time/Month;", "p1", "p2", "p3", "p4", "p5", "p6", "Lkotlinx/datetime/LocalDateTime;", "LocalDateTime", "(ILjava/time/Month;IIIII)Lkotlinx/datetime/LocalDateTime;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/LocalDateTimeKt")
/* loaded from: classes3.dex */
final /* synthetic */ class LocalDateTimeKt__LocalDateTimeJvmKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year = year, month = month.toKotlinMonth(), day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime LocalDateTime(int i, java.time.Month month, int i2, int i3, int i4, int i5, int i6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        return new kotlinx.datetime.LocalDateTime(i, kotlinx.datetime.ConvertersKt.toKotlinMonth(month), i2, i3, i4, i5, i6);
    }
}
