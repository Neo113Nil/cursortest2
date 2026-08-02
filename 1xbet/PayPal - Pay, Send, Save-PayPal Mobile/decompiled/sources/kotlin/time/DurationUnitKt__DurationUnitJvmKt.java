package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\n\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Lkotlin/time/DurationUnit;", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "(Lkotlin/time/DurationUnit;)Ljava/util/concurrent/TimeUnit;", "toDurationUnit", "(Ljava/util/concurrent/TimeUnit;)Lkotlin/time/DurationUnit;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "sourceUnit", "targetUnit", "convertDurationUnit", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "convertDurationUnitOverflow", "(JLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)J"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes3.dex */
public class DurationUnitKt__DurationUnitJvmKt {
    public static final java.util.concurrent.TimeUnit toTimeUnit(kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        return durationUnit.getTimeUnit();
    }

    public static final kotlin.time.DurationUnit toDurationUnit(java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        switch (kotlin.time.DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return kotlin.time.DurationUnit.NANOSECONDS;
            case 2:
                return kotlin.time.DurationUnit.MICROSECONDS;
            case 3:
                return kotlin.time.DurationUnit.MILLISECONDS;
            case 4:
                return kotlin.time.DurationUnit.SECONDS;
            case 5:
                return kotlin.time.DurationUnit.MINUTES;
            case 6:
                return kotlin.time.DurationUnit.HOURS;
            case 7:
                return kotlin.time.DurationUnit.DAYS;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final double convertDurationUnit(double d, kotlin.time.DurationUnit durationUnit, kotlin.time.DurationUnit durationUnit2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit2, "");
        long convert = durationUnit2.getTimeUnit().convert(1L, durationUnit.getTimeUnit());
        return convert > 0 ? d * convert : d / durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
    }

    public static final long convertDurationUnitOverflow(long j, kotlin.time.DurationUnit durationUnit, kotlin.time.DurationUnit durationUnit2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit2, "");
        return durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
    }

    public static final long convertDurationUnit(long j, kotlin.time.DurationUnit durationUnit, kotlin.time.DurationUnit durationUnit2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit2, "");
        return durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.util.concurrent.TimeUnit.values().length];
            try {
                iArr[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
