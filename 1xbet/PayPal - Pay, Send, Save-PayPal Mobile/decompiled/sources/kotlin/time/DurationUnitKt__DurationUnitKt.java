package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/time/DurationUnit;", "unit", "convertDurationUnitToMilliseconds", "(JLkotlin/time/DurationUnit;)J", "", "shortName", "(Lkotlin/time/DurationUnit;)Ljava/lang/String;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes3.dex */
class DurationUnitKt__DurationUnitKt extends kotlin.time.DurationUnitKt__DurationUnitJvmKt {
    public static final java.lang.String shortName(kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        switch (kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "d";
            case 2:
                return "h";
            case 3:
                return "m";
            case 4:
                return lib.android.paypal.com.magnessdk.g.n2;
            case 5:
                return "ms";
            case 6:
                return "ns";
            case 7:
                return "us";
            default:
                throw new java.lang.IllegalStateException("Unknown unit: ".concat(java.lang.String.valueOf(durationUnit)).toString());
        }
    }

    public static final long convertDurationUnitToMilliseconds(long j, kotlin.time.DurationUnit durationUnit) {
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        int i = kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()];
        if (i == 1) {
            j2 = 86400000;
        } else if (i == 2) {
            j2 = 3600000;
        } else if (i == 3) {
            j2 = 60000;
        } else if (i == 4) {
            j2 = 1000;
        } else {
            if (i != 5) {
                throw new java.lang.IllegalStateException("Wrong unit for millisMultiplier: ".concat(java.lang.String.valueOf(durationUnit)).toString());
            }
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            return kotlin.ranges.RangesKt.coerceAtMost(j2, 4611686018427387903L);
        }
        if (j2 == 1) {
            return kotlin.ranges.RangesKt.coerceAtMost(j, 4611686018427387903L);
        }
        int numberOfLeadingZeros = (128 - java.lang.Long.numberOfLeadingZeros(j)) - java.lang.Long.numberOfLeadingZeros(j2);
        if (numberOfLeadingZeros < 63) {
            return j * j2;
        }
        if (numberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return kotlin.ranges.RangesKt.coerceAtMost(j * j2, 4611686018427387903L);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.time.DurationUnit.values().length];
            try {
                iArr[kotlin.time.DurationUnit.DAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.time.DurationUnit.HOURS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MINUTES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.time.DurationUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MILLISECONDS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.time.DurationUnit.NANOSECONDS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MICROSECONDS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
