package kotlinx.datetime;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0013\u001a!\u0010\u000b\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0016\u001a#\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u001a\u001a!\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001b\u001a!\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u001b\u001a)\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u001d\u001a!\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u001e\u001a)\u0010\u000b\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u001f\u001a!\u0010\u000b\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u0010\u001a)\u0010\"\u001a\u00020!*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020 ¢\u0006\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010%"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "p0", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "p1", "Lkotlin/time/Instant;", "parse", "(Lkotlin/time/Instant$Companion;Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlin/time/Instant;", "Lkotlinx/datetime/DateTimePeriod;", "Lkotlinx/datetime/TimeZone;", "minus", "(Lkotlin/time/Instant;Lkotlinx/datetime/DateTimePeriod;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "", "until", "(Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/datetime/DateTimeUnit$TimeBased;)J", "", "daysUntil", "(Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/datetime/TimeZone;)I", "monthsUntil", "yearsUntil", "(Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/DateTimePeriod;", "Lkotlinx/datetime/DateTimeUnit;", "(Lkotlin/time/Instant;Lkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "plus", "(Lkotlin/time/Instant;Lkotlinx/datetime/DateTimeUnit$TimeBased;)Lkotlin/time/Instant;", "(Lkotlin/time/Instant;ILkotlinx/datetime/DateTimeUnit$TimeBased;)Lkotlin/time/Instant;", "p2", "(Lkotlin/time/Instant;JLkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "(Lkotlin/time/Instant;JLkotlinx/datetime/DateTimeUnit$TimeBased;)Lkotlin/time/Instant;", "(Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)J", "Lkotlinx/datetime/UtcOffset;", "", "format", "(Lkotlin/time/Instant;Lkotlinx/datetime/format/DateTimeFormat;Lkotlinx/datetime/UtcOffset;)Ljava/lang/String;", "DISTANT_PAST_SECONDS", "J", "DISTANT_FUTURE_SECONDS"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/InstantKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class InstantKt__InstantKt {
    public static final kotlin.time.Instant parse(kotlin.time.Instant.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        try {
            return kotlinx.datetime.format.DateTimeComponents.toInstantUsingOffset$default(dateTimeFormat.parse(charSequence), null, 1, null);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse an instant from '");
            sb.append((java.lang.Object) charSequence);
            sb.append('\'');
            throw new kotlinx.datetime.DateTimeFormatException(sb.toString(), e);
        }
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, kotlinx.datetime.DateTimePeriod dateTimePeriod, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimePeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        if (dateTimePeriod.getGetHighSpeedVideoFpsRangesFor() != Long.MIN_VALUE) {
            return kotlinx.datetime.InstantJvmKt.plus(instant, kotlinx.datetime.DateTimePeriodKt.buildDateTimePeriod(-dateTimePeriod.getTotalMonths(), -dateTimePeriod.getDays(), -dateTimePeriod.getGetHighSpeedVideoFpsRangesFor()), timeZone);
        }
        return kotlinx.datetime.InstantKt.plus(kotlinx.datetime.InstantJvmKt.plus(instant, kotlinx.datetime.DateTimePeriodKt.buildDateTimePeriod(-dateTimePeriod.getTotalMonths(), -dateTimePeriod.getDays(), -(dateTimePeriod.getGetHighSpeedVideoFpsRangesFor() + 1)), timeZone), 1, kotlinx.datetime.DateTimeUnit.INSTANCE.getNANOSECOND());
    }

    public static final long until(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        try {
            return kotlinx.datetime.internal.MathKt.multiplyAddAndDivide(instant2.getEpochSeconds() - instant.getEpochSeconds(), 1000000000L, instant2.getNanosecondsOfSecond() - instant.getNanosecondsOfSecond(), timeBased.getNanoseconds());
        } catch (java.lang.ArithmeticException unused) {
            return instant.compareTo(instant2) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public static final int daysUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.internal.MathKt.clampToInt(kotlinx.datetime.InstantJvmKt.until(instant, instant2, kotlinx.datetime.DateTimeUnit.INSTANCE.getDAY(), timeZone));
    }

    public static final int monthsUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.internal.MathKt.clampToInt(kotlinx.datetime.InstantJvmKt.until(instant, instant2, kotlinx.datetime.DateTimeUnit.INSTANCE.getMONTH(), timeZone));
    }

    public static final int yearsUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.internal.MathKt.clampToInt(kotlinx.datetime.InstantJvmKt.until(instant, instant2, kotlinx.datetime.DateTimeUnit.INSTANCE.getYEAR(), timeZone));
    }

    public static final kotlinx.datetime.DateTimePeriod minus(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.InstantJvmKt.periodUntil(instant2, instant, timeZone);
    }

    @kotlin.Deprecated(message = "Use the minus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.minus(1, unit, timeZone)", imports = {}))
    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, -1, dateTimeUnit, timeZone);
    }

    @kotlin.Deprecated(message = "Use the plus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.plus(1, unit)", imports = {}))
    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, 1L, timeBased);
    }

    @kotlin.Deprecated(message = "Use the minus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.minus(1, unit)", imports = {}))
    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, -1L, timeBased);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, i, timeBased);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        return kotlinx.datetime.InstantKt.minus(instant, i, timeBased);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        if (j != Long.MIN_VALUE) {
            return kotlinx.datetime.InstantJvmKt.plus(instant, -j, dateTimeUnit, timeZone);
        }
        return kotlinx.datetime.InstantJvmKt.plus(kotlinx.datetime.InstantJvmKt.plus(instant, -(j + 1), dateTimeUnit, timeZone), 1, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        if (j != Long.MIN_VALUE) {
            return kotlinx.datetime.InstantJvmKt.plus(instant, -j, timeBased);
        }
        return kotlinx.datetime.InstantKt.plus(kotlinx.datetime.InstantJvmKt.plus(instant, -(j + 1), timeBased), 1, timeBased);
    }

    public static final long minus(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.InstantJvmKt.until(instant2, instant, dateTimeUnit, timeZone);
    }

    public static final long minus(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        return kotlinx.datetime.InstantKt.until(instant2, instant, timeBased);
    }

    public static /* synthetic */ java.lang.String format$default(kotlin.time.Instant instant, kotlinx.datetime.format.DateTimeFormat dateTimeFormat, kotlinx.datetime.UtcOffset utcOffset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            utcOffset = kotlinx.datetime.UtcOffset.INSTANCE.getZERO();
        }
        return kotlinx.datetime.InstantKt.format(instant, dateTimeFormat, utcOffset);
    }

    public static final java.lang.String format(final kotlin.time.Instant instant, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat, final kotlinx.datetime.UtcOffset utcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
        return kotlinx.datetime.format.DateTimeComponentsKt.format(dateTimeFormat, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.InstantKt__InstantKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.InstantKt__InstantKt.getHighSpeedVideoFpsRangesFor(kotlin.time.Instant.this, utcOffset, (kotlinx.datetime.format.DateTimeComponents) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.time.Instant instant, kotlinx.datetime.UtcOffset utcOffset, kotlinx.datetime.format.DateTimeComponents dateTimeComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeComponents, "");
        dateTimeComponents.setDateTimeOffset(instant, utcOffset);
        return kotlin.Unit.INSTANCE;
    }
}
