package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0002\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/format/DateTimeFormat;", "format", "", "(Lkotlinx/datetime/UtcOffset;Lkotlinx/datetime/format/DateTimeFormat;)Ljava/lang/String;", "UtcOffset", "()Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "asTimeZone", "(Lkotlinx/datetime/UtcOffset;)Lkotlinx/datetime/FixedOffsetTimeZone;", "getIsoUtcOffsetFormat", "()Lkotlinx/datetime/format/DateTimeFormat;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtcOffsetKt {
    public static final java.lang.String format(kotlinx.datetime.UtcOffset utcOffset, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        return dateTimeFormat.format(utcOffset);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use UtcOffset.ZERO instead", replaceWith = @kotlin.ReplaceWith(expression = "UtcOffset.ZERO", imports = {}))
    public static final kotlinx.datetime.UtcOffset UtcOffset() {
        return kotlinx.datetime.UtcOffset.INSTANCE.getZERO();
    }

    public static final kotlinx.datetime.FixedOffsetTimeZone asTimeZone(kotlinx.datetime.UtcOffset utcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
        return new kotlinx.datetime.FixedOffsetTimeZone(utcOffset);
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> getIsoUtcOffsetFormat() {
        return kotlinx.datetime.UtcOffset.Formats.INSTANCE.getISO();
    }
}
