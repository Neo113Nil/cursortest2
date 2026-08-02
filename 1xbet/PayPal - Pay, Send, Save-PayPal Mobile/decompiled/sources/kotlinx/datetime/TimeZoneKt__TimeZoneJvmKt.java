package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\t\u001a#\u0010\f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000e\u001a#\u0010\u0010\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/datetime/TimeZone;", "Lkotlin/time/Instant;", "p0", "Lkotlinx/datetime/UtcOffset;", "offsetAt", "(Lkotlinx/datetime/TimeZone;Lkotlin/time/Instant;)Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/LocalDateTime;", "toLocalDateTime", "(Lkotlin/time/Instant;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/LocalDateTime;", "(Lkotlin/time/Instant;Lkotlinx/datetime/UtcOffset;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/OverloadMarker;", "p1", "toInstant", "(Lkotlinx/datetime/LocalDateTime;Lkotlinx/datetime/TimeZone;Lkotlinx/datetime/OverloadMarker;)Lkotlin/time/Instant;", "(Lkotlinx/datetime/LocalDateTime;Lkotlinx/datetime/UtcOffset;Lkotlinx/datetime/OverloadMarker;)Lkotlin/time/Instant;", "Lkotlinx/datetime/LocalDate;", "atStartOfDayIn", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/TimeZone;Lkotlinx/datetime/OverloadMarker;)Lkotlin/time/Instant;", "Ljava/time/ZoneId;", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/time/ZoneId;)Z", "getHighSpeedVideoFpsRanges"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/TimeZoneKt")
/* loaded from: classes17.dex */
final /* synthetic */ class TimeZoneKt__TimeZoneJvmKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(java.time.ZoneId zoneId) {
        try {
            return zoneId.getRules().isFixedOffset();
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            return false;
        }
    }

    public static final kotlinx.datetime.UtcOffset offsetAt(kotlinx.datetime.TimeZone timeZone, kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return new kotlinx.datetime.UtcOffset(timeZone.getZoneId().getRules().getOffset(kotlin.time.jdk8.InstantConversionsJDK8Kt.toJavaInstant(instant)));
    }

    public static final kotlinx.datetime.LocalDateTime toLocalDateTime(kotlin.time.Instant instant, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        try {
            return new kotlinx.datetime.LocalDateTime(java.time.LocalDateTime.ofInstant(kotlin.time.jdk8.InstantConversionsJDK8Kt.toJavaInstant(instant), timeZone.getZoneId()));
        } catch (java.time.DateTimeException e) {
            throw new kotlinx.datetime.DateTimeArithmeticException(e);
        }
    }

    public static final kotlinx.datetime.LocalDateTime toLocalDateTime(kotlin.time.Instant instant, kotlinx.datetime.UtcOffset utcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
        try {
            return new kotlinx.datetime.LocalDateTime(java.time.LocalDateTime.ofInstant(kotlin.time.jdk8.InstantConversionsJDK8Kt.toJavaInstant(instant), utcOffset.getZoneOffset()));
        } catch (java.time.DateTimeException e) {
            throw new kotlinx.datetime.DateTimeArithmeticException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.time.ZonedDateTime] */
    public static final kotlin.time.Instant toInstant(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.OverloadMarker overloadMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overloadMarker, "");
        java.time.Instant instant = localDateTime.getValue().atZone(timeZone.getZoneId()).toInstant();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant, "");
        return kotlin.time.jdk8.InstantConversionsJDK8Kt.toKotlinInstant(instant);
    }

    public static final kotlin.time.Instant toInstant(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.UtcOffset utcOffset, kotlinx.datetime.OverloadMarker overloadMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overloadMarker, "");
        java.time.Instant instant = localDateTime.getValue().toInstant(utcOffset.getZoneOffset());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant, "");
        return kotlin.time.jdk8.InstantConversionsJDK8Kt.toKotlinInstant(instant);
    }

    public static final kotlin.time.Instant atStartOfDayIn(kotlinx.datetime.LocalDate localDate, kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.OverloadMarker overloadMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overloadMarker, "");
        java.time.Instant instant = localDate.getValue().atStartOfDay(timeZone.getZoneId()).toInstant();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant, "");
        return kotlin.time.jdk8.InstantConversionsJDK8Kt.toKotlinInstant(instant);
    }

    public static /* synthetic */ kotlin.time.Instant atStartOfDayIn$default(kotlinx.datetime.LocalDate localDate, kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.OverloadMarker overloadMarker, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            overloadMarker = kotlinx.datetime.OverloadMarker.INSTANCE.getINSTANCE$kotlinx_datetime();
        }
        return kotlinx.datetime.TimeZoneKt.atStartOfDayIn(localDate, timeZone, overloadMarker);
    }

    public static /* synthetic */ kotlin.time.Instant toInstant$default(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.OverloadMarker overloadMarker, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            overloadMarker = kotlinx.datetime.OverloadMarker.INSTANCE.getINSTANCE$kotlinx_datetime();
        }
        return kotlinx.datetime.TimeZoneKt.toInstant(localDateTime, timeZone, overloadMarker);
    }

    public static /* synthetic */ kotlin.time.Instant toInstant$default(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.UtcOffset utcOffset, kotlinx.datetime.OverloadMarker overloadMarker, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            overloadMarker = kotlinx.datetime.OverloadMarker.INSTANCE.getINSTANCE$kotlinx_datetime();
        }
        return kotlinx.datetime.TimeZoneKt.toInstant(localDateTime, utcOffset, overloadMarker);
    }
}
