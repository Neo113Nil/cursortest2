package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\u000b\u001a)\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u000e\u001a)\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000e\u001a)\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0011\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/time/Instant;", "Lkotlinx/datetime/TimeZone;", "p0", "Ljava/time/ZonedDateTime;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/time/Instant;Lkotlinx/datetime/TimeZone;)Ljava/time/ZonedDateTime;", "Lkotlinx/datetime/DateTimePeriod;", "p1", "plus", "(Lkotlin/time/Instant;Lkotlinx/datetime/DateTimePeriod;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "Lkotlinx/datetime/DateTimeUnit;", "(Lkotlin/time/Instant;Lkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "", "p2", "(Lkotlin/time/Instant;ILkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "minus", "", "(Lkotlin/time/Instant;JLkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)Lkotlin/time/Instant;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "(Lkotlin/time/Instant;JLkotlinx/datetime/DateTimeUnit$TimeBased;)Lkotlin/time/Instant;", "periodUntil", "(Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/DateTimePeriod;", "until", "(Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)J"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/InstantJvmKt")
/* loaded from: classes3.dex */
final /* synthetic */ class InstantJvmKt__InstantKt {
    private static final java.time.ZonedDateTime getHighResolutionOutputSizeshNQ4ISI(kotlin.time.Instant instant, kotlinx.datetime.TimeZone timeZone) {
        try {
            java.time.ZonedDateTime atZone = kotlin.time.jdk8.InstantConversionsJDK8Kt.toJavaInstant(instant).atZone(timeZone.getZoneId());
            kotlin.jvm.internal.Intrinsics.checkNotNull(atZone);
            return atZone;
        } catch (java.time.DateTimeException e) {
            throw new kotlinx.datetime.DateTimeArithmeticException(e);
        }
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, kotlinx.datetime.DateTimePeriod dateTimePeriod, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimePeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        try {
            java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(instant, timeZone);
            if (dateTimePeriod.getTotalMonths() != 0) {
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI.plusMonths(dateTimePeriod.getTotalMonths());
            }
            if (dateTimePeriod.getDays() != 0) {
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI.plusDays(dateTimePeriod.getDays());
            }
            if (dateTimePeriod.getGetHighSpeedVideoFpsRangesFor() != 0) {
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI.plusNanos(dateTimePeriod.getGetHighSpeedVideoFpsRangesFor());
            }
            java.time.Instant instant2 = highResolutionOutputSizeshNQ4ISI.toInstant();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant2, "");
            return kotlin.time.jdk8.InstantConversionsJDK8Kt.toKotlinInstant(instant2);
        } catch (java.time.DateTimeException e) {
            throw new kotlinx.datetime.DateTimeArithmeticException(e);
        }
    }

    @kotlin.Deprecated(message = "Use the plus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.plus(1, unit, timeZone)", imports = {}))
    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, 1L, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, i, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.InstantJvmKt.plus(instant, -i, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        java.time.Instant instant2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        try {
            java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(instant, timeZone);
            if (dateTimeUnit instanceof kotlinx.datetime.DateTimeUnit.TimeBased) {
                instant2 = kotlin.time.jdk8.InstantConversionsJDK8Kt.toJavaInstant(kotlinx.datetime.InstantJvmKt.plus(instant, j, (kotlinx.datetime.DateTimeUnit.TimeBased) dateTimeUnit));
                instant2.atZone(timeZone.getZoneId());
            } else if (dateTimeUnit instanceof kotlinx.datetime.DateTimeUnit.DayBased) {
                instant2 = highResolutionOutputSizeshNQ4ISI.plusDays(kotlinx.datetime.internal.MathJvmKt.safeMultiply(j, ((kotlinx.datetime.DateTimeUnit.DayBased) dateTimeUnit).getDays())).toInstant();
            } else {
                if (!(dateTimeUnit instanceof kotlinx.datetime.DateTimeUnit.MonthBased)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                instant2 = highResolutionOutputSizeshNQ4ISI.plusMonths(kotlinx.datetime.internal.MathJvmKt.safeMultiply(j, ((kotlinx.datetime.DateTimeUnit.MonthBased) dateTimeUnit).getMonths())).toInstant();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(instant2);
            return kotlin.time.jdk8.InstantConversionsJDK8Kt.toKotlinInstant(instant2);
        } catch (java.lang.Exception e) {
            if (!(e instanceof java.time.DateTimeException) && !(e instanceof java.lang.ArithmeticException)) {
                throw e;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instant ");
            sb.append(instant);
            sb.append(" cannot be represented as local date when adding ");
            sb.append(j);
            sb.append(' ');
            sb.append(dateTimeUnit);
            sb.append(" to it");
            throw new kotlinx.datetime.DateTimeArithmeticException(sb.toString(), e);
        }
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBased, "");
        try {
            kotlinx.datetime.internal.DivRemResult multiplyAndDivide = kotlinx.datetime.internal.MathKt.multiplyAndDivide(j, timeBased.getNanoseconds(), 1000000000L);
            long q = multiplyAndDivide.getQ();
            long r = multiplyAndDivide.getR();
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            kotlin.time.Instant m24018plusLRDsOJo = instant.m24018plusLRDsOJo(kotlin.time.DurationKt.toDuration(q, kotlin.time.DurationUnit.SECONDS));
            kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
            return m24018plusLRDsOJo.m24018plusLRDsOJo(kotlin.time.DurationKt.toDuration(r, kotlin.time.DurationUnit.NANOSECONDS));
        } catch (java.lang.Exception e) {
            if ((e instanceof java.time.DateTimeException) || (e instanceof java.lang.ArithmeticException)) {
                return kotlin.time.Instant.Companion.fromEpochSeconds$default(kotlin.time.Instant.INSTANCE, j > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L, 2, null);
            }
            throw e;
        }
    }

    public static final kotlinx.datetime.DateTimePeriod periodUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(instant, timeZone);
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(instant2, timeZone);
        long until = highResolutionOutputSizeshNQ4ISI.until(highResolutionOutputSizeshNQ4ISI2, java.time.temporal.ChronoUnit.MONTHS);
        java.time.ZonedDateTime plusMonths = highResolutionOutputSizeshNQ4ISI.plusMonths(until);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plusMonths, "");
        long until2 = plusMonths.until(highResolutionOutputSizeshNQ4ISI2, java.time.temporal.ChronoUnit.DAYS);
        java.time.ZonedDateTime plusDays = plusMonths.plusDays(until2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plusDays, "");
        return kotlinx.datetime.DateTimePeriodKt.buildDateTimePeriod(until, (int) until2, plusDays.until(highResolutionOutputSizeshNQ4ISI2, java.time.temporal.ChronoUnit.NANOS));
    }

    public static final long until(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        try {
            java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(instant, timeZone);
            java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(instant2, timeZone);
            if (dateTimeUnit instanceof kotlinx.datetime.DateTimeUnit.TimeBased) {
                return kotlinx.datetime.InstantKt.until(instant, instant2, (kotlinx.datetime.DateTimeUnit.TimeBased) dateTimeUnit);
            }
            if (dateTimeUnit instanceof kotlinx.datetime.DateTimeUnit.DayBased) {
                return highResolutionOutputSizeshNQ4ISI.until(highResolutionOutputSizeshNQ4ISI2, java.time.temporal.ChronoUnit.DAYS) / ((kotlinx.datetime.DateTimeUnit.DayBased) dateTimeUnit).getDays();
            }
            if (dateTimeUnit instanceof kotlinx.datetime.DateTimeUnit.MonthBased) {
                return highResolutionOutputSizeshNQ4ISI.until(highResolutionOutputSizeshNQ4ISI2, java.time.temporal.ChronoUnit.MONTHS) / ((kotlinx.datetime.DateTimeUnit.MonthBased) dateTimeUnit).getMonths();
            }
            throw new kotlin.NoWhenBranchMatchedException();
        } catch (java.lang.ArithmeticException unused) {
            return instant.compareTo(instant2) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        } catch (java.time.DateTimeException e) {
            throw new kotlinx.datetime.DateTimeArithmeticException(e);
        }
    }
}
