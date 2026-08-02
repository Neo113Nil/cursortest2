package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lkotlinx/datetime/LocalTime;", "", "p0", "Ljava/time/Month;", "p1", "p2", "Lkotlinx/datetime/LocalDateTime;", "atDate", "(Lkotlinx/datetime/LocalTime;ILjava/time/Month;I)Lkotlinx/datetime/LocalDateTime;", "", "p3", "(Lkotlinx/datetime/LocalTime;ILjava/time/Month;ILkotlin/Unit;)Lkotlinx/datetime/LocalDateTime;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/LocalTimeKt")
/* loaded from: classes3.dex */
final /* synthetic */ class LocalTimeKt__LocalTimeJvmKt {
    public static /* synthetic */ kotlinx.datetime.LocalDateTime atDate$default(kotlinx.datetime.LocalTime localTime, int i, java.time.Month month, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return kotlinx.datetime.LocalTimeKt.atDate(localTime, i, month, i2);
    }

    @kotlin.Deprecated(message = "Use kotlinx.datetime.Month", replaceWith = @kotlin.ReplaceWith(expression = "atDate(year, month.toKotlinMonth(), dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, java.time.Month month, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        return kotlinx.datetime.LocalTimeKt.atDate(localTime, i, kotlinx.datetime.ConvertersKt.toKotlinMonth(month), i2);
    }

    public static /* synthetic */ kotlinx.datetime.LocalDateTime atDate$default(kotlinx.datetime.LocalTime localTime, int i, java.time.Month month, int i2, kotlin.Unit unit, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            unit = kotlin.Unit.INSTANCE;
        }
        return kotlinx.datetime.LocalTimeKt.atDate(localTime, i, month, i2, unit);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "this.atDate(year = year, month = month.toKotlinMonth(), day = dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, java.time.Month month, int i2, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return new kotlinx.datetime.LocalDateTime(i, kotlinx.datetime.ConvertersKt.toKotlinMonth(month), i2, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }
}
