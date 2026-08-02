package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aS\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u001e¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\"\u001a\u00020\u0001*\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010\"\u001a\u00020\u0004*\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\"\u0010$"}, d2 = {"", "Lkotlinx/datetime/DateTimePeriod;", "toDateTimePeriod", "(Ljava/lang/String;)Lkotlinx/datetime/DateTimePeriod;", "Lkotlinx/datetime/DatePeriod;", "toDatePeriod", "(Ljava/lang/String;)Lkotlinx/datetime/DatePeriod;", "", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(II)J", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(IIIJ)J", "totalMonths", "days", "totalNanoseconds", "buildDateTimePeriod", "(JIJ)Lkotlinx/datetime/DateTimePeriod;", "years", "months", "hours", "minutes", "seconds", "nanoseconds", "DateTimePeriod", "(IIIIIIJ)Lkotlinx/datetime/DateTimePeriod;", "Lkotlin/time/Duration;", "toDateTimePeriod-LRDsOJo", "(J)Lkotlinx/datetime/DateTimePeriod;", "other", "plus", "(Lkotlinx/datetime/DateTimePeriod;Lkotlinx/datetime/DateTimePeriod;)Lkotlinx/datetime/DateTimePeriod;", "(Lkotlinx/datetime/DatePeriod;Lkotlinx/datetime/DatePeriod;)Lkotlinx/datetime/DatePeriod;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateTimePeriodKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @kotlin.ReplaceWith(expression = "DateTimePeriod.parse(this)", imports = {}))
    public static final kotlinx.datetime.DateTimePeriod toDateTimePeriod(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlinx.datetime.DateTimePeriod.INSTANCE.parse(str);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @kotlin.ReplaceWith(expression = "DatePeriod.parse(this)", imports = {}))
    public static final kotlinx.datetime.DatePeriod toDatePeriod(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlinx.datetime.DatePeriod.Companion.parse(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoFpsRangesFor(int i, int i2) {
        long j = (i * 12) + i2;
        long j2 = j / 12;
        if (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask <= j2 && j2 <= androidx.collection.SieveCacheKt.NodeLinkMask) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The total number of years in ");
        sb.append(i);
        sb.append(" years and ");
        sb.append(i2);
        sb.append(" months overflows an Int");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    private static final long getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3, long j) {
        try {
            return kotlinx.datetime.internal.MathKt.multiplyAndAdd((((i * 60) + i2) * 60) + (j / 1000000000) + i3, 1000000000L, j % 1000000000);
        } catch (java.lang.ArithmeticException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The total number of nanoseconds in ");
            sb.append(i);
            sb.append(" hours, ");
            sb.append(i2);
            sb.append(" minutes, ");
            sb.append(i3);
            sb.append(" seconds, and ");
            sb.append(j);
            sb.append(" nanoseconds overflows a Long");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static /* synthetic */ kotlinx.datetime.DateTimePeriod buildDateTimePeriod$default(long j, int i, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return buildDateTimePeriod(j, i, j2);
    }

    public static final kotlinx.datetime.DateTimePeriod buildDateTimePeriod(long j, int i, long j2) {
        if (j2 != 0) {
            return new kotlinx.datetime.DateTimePeriodImpl(j, i, j2);
        }
        return new kotlinx.datetime.DatePeriod(j, i);
    }

    public static /* synthetic */ kotlinx.datetime.DateTimePeriod DateTimePeriod$default(int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, java.lang.Object obj) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = 0;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        if ((i7 & 64) != 0) {
            j = 0;
        }
        return DateTimePeriod(i, i2, i3, i4, i5, i6, j);
    }

    public static final kotlinx.datetime.DateTimePeriod DateTimePeriod(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        return buildDateTimePeriod(getHighSpeedVideoFpsRangesFor(i, i2), i3, getHighResolutionOutputSizeshNQ4ISI(i4, i5, i6, j));
    }

    /* renamed from: toDateTimePeriod-LRDsOJo, reason: not valid java name */
    public static final kotlinx.datetime.DateTimePeriod m24133toDateTimePeriodLRDsOJo(long j) {
        return buildDateTimePeriod$default(0L, 0, kotlin.time.Duration.m23955getInWholeNanosecondsimpl(j), 3, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Adding periods is not a well-defined operation. See https://github.com/Kotlin/kotlinx-datetime/issues/381")
    public static final kotlinx.datetime.DateTimePeriod plus(kotlinx.datetime.DateTimePeriod dateTimePeriod, kotlinx.datetime.DateTimePeriod dateTimePeriod2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimePeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimePeriod2, "");
        return buildDateTimePeriod(kotlinx.datetime.internal.MathJvmKt.safeAdd(dateTimePeriod.getGetHighSpeedVideoFpsRanges(), dateTimePeriod2.getGetHighSpeedVideoFpsRanges()), kotlinx.datetime.internal.MathJvmKt.safeAdd(dateTimePeriod.getGetHighSpeedVideoSizes(), dateTimePeriod2.getGetHighSpeedVideoSizes()), kotlinx.datetime.internal.MathJvmKt.safeAdd(dateTimePeriod.getGetHighSpeedVideoFpsRangesFor(), dateTimePeriod2.getGetHighSpeedVideoFpsRangesFor()));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Adding periods is not a well-defined operation. See https://github.com/Kotlin/kotlinx-datetime/issues/381")
    public static final kotlinx.datetime.DatePeriod plus(kotlinx.datetime.DatePeriod datePeriod, kotlinx.datetime.DatePeriod datePeriod2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datePeriod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datePeriod2, "");
        return new kotlinx.datetime.DatePeriod(kotlinx.datetime.internal.MathJvmKt.safeAdd(datePeriod.getGetHighSpeedVideoFpsRanges(), datePeriod2.getGetHighSpeedVideoFpsRanges()), kotlinx.datetime.internal.MathJvmKt.safeAdd(datePeriod.getGetHighSpeedVideoSizes(), datePeriod2.getGetHighSpeedVideoSizes()));
    }
}
