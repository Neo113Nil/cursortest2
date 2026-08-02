package io.ktor.util.date;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/util/date/GMTDate;", "", "milliseconds", "plus", "(Lio/ktor/util/date/GMTDate;J)Lio/ktor/util/date/GMTDate;", "minus", "Lkotlin/time/Duration;", "duration", "plus-HG0u8IE", "minus-HG0u8IE", "truncateToSeconds", "(Lio/ktor/util/date/GMTDate;)Lio/ktor/util/date/GMTDate;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateKt {
    public static final io.ktor.util.date.GMTDate plus(io.ktor.util.date.GMTDate gMTDate, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        return io.ktor.util.date.DateJvmKt.GMTDate(java.lang.Long.valueOf(gMTDate.getTimestamp() + j));
    }

    public static final io.ktor.util.date.GMTDate minus(io.ktor.util.date.GMTDate gMTDate, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        return io.ktor.util.date.DateJvmKt.GMTDate(java.lang.Long.valueOf(gMTDate.getTimestamp() - j));
    }

    /* renamed from: plus-HG0u8IE, reason: not valid java name */
    public static final io.ktor.util.date.GMTDate m23402plusHG0u8IE(io.ktor.util.date.GMTDate gMTDate, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        return io.ktor.util.date.DateJvmKt.GMTDate(java.lang.Long.valueOf(gMTDate.getTimestamp() + kotlin.time.Duration.m23953getInWholeMillisecondsimpl(j)));
    }

    /* renamed from: minus-HG0u8IE, reason: not valid java name */
    public static final io.ktor.util.date.GMTDate m23401minusHG0u8IE(io.ktor.util.date.GMTDate gMTDate, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        return io.ktor.util.date.DateJvmKt.GMTDate(java.lang.Long.valueOf(gMTDate.getTimestamp() - kotlin.time.Duration.m23953getInWholeMillisecondsimpl(j)));
    }

    public static final io.ktor.util.date.GMTDate truncateToSeconds(io.ktor.util.date.GMTDate gMTDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        return io.ktor.util.date.DateJvmKt.GMTDate(gMTDate.getSeconds(), gMTDate.getMinutes(), gMTDate.getHours(), gMTDate.getDayOfMonth(), gMTDate.getMonth(), gMTDate.getYear());
    }
}
