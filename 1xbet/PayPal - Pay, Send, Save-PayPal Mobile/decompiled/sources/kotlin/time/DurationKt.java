package kotlin.time;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b-\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\u008a\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\u008a\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0082\u0080\u0004¢\u0006\u0002\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0082\u0080\u0004¢\u0006\u0002\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0082\u0080\u0004¢\u0006\u0002\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0082\u0080\u0004\u001a\u000e\u0010\u001f\u001a\u00020\u0014*\u00020\u0006H\u0083\u0088\u0004\u001a\u000e\u0010 \u001a\u00020\u0014*\u00020\u0006H\u0083\u0088\u0004\u001a\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0083\u0088\u0004\u001a&\u0010$\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0080\u0004\u001a\u0016\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0080\u0004\u001a!\u0010'\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u0012H\u0083\u0088\u0004¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010,H\u0082\u0088\u0004¢\u0006\u0004\b-\u0010.\u001a\u0018\u0010/\u001a\u0004\u0018\u00010\u0004*\u00020\u00122\u0006\u00100\u001a\u00020\u0002H\u0082\u0080\u0004\u001a\u0018\u00101\u001a\u0004\u0018\u00010\u0004*\u00020\u00122\u0006\u00100\u001a\u00020\u0002H\u0082\u0080\u0004\u001a\u000e\u0010=\u001a\u00020\u0006*\u00020\u0006H\u0083\u0088\u0004\u001a\u000e\u0010=\u001a\u00020\u0002*\u00020\u0002H\u0083\u0088\u0004\u001a\u0012\u0010J\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\u0082\u0080\u0004\u001a\u0012\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0082\u0080\u0004\u001a\u0017\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\u001a\u0017\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\u001a\u001f\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002H\u0082\u0080\u0004¢\u0006\u0002\u0010V\u001a\u0017\u0010W\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\u001a\u0017\u0010X\u001a\u00020\u00012\u0006\u0010M\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\"\u001f\u00102\u001a\u00020\b*\u00020\u00048BX\u0082\u0084\b¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0019\u00107\u001a\u00020\u0006*\u00020\u00048BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0019\u0010:\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u000f\u0010>\u001a\u00020\u0002X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010?\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010@\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010A\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010B\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010C\u001a\u00020\u0006X\u0082Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010D\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010E\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010F\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010G\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010H\u001a\u00020\u0012X\u0082Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010I\u001a\u00020\u0002X\u0082Ô\b¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"toDuration", "Lkotlin/time/Duration;", "", "unit", "Lkotlin/time/DurationUnit;", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "times", "duration", "times-mvk6XK0", "(IJ)J", "times-kIfJnKk", "(DJ)J", "parseDuration", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "strictIso", "", "throwException", "(Ljava/lang/String;ZZ)J", "parseIsoStringFormat", "startIndex", "(Ljava/lang/String;IZ)J", "parseDefaultStringFormat", "hasSign", "(Ljava/lang/String;IZZ)J", "addMillisWithoutOverflow", "other", "isInfiniteMillis", "isFiniteMillis", "sameSign", "a", util.h.xy.cb.b.f1091, "parseFractionFallback", "endIndex", "fractionDigitsToNanos", "handleError", "message", "(ZLjava/lang/String;)J", "onInvalid", "block", "Lkotlin/Function0;", "onInvalid-ge6A_vg", "(JLkotlin/jvm/functions/Function0;)Lkotlin/time/Duration;", "defaultDurationUnitByShortNameOrNull", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "isoDurationUnitByShortNameOrNull", "fractionMultiplier", "getFractionMultiplier$annotations", "(Lkotlin/time/DurationUnit;)V", "getFractionMultiplier", "(Lkotlin/time/DurationUnit;)D", "fallbackFractionMultiplier", "getFallbackFractionMultiplier", "(Lkotlin/time/DurationUnit;)J", "shortNameLength", "getShortNameLength", "(Lkotlin/time/DurationUnit;)I", "multiplyBy10", "NANOS_IN_MILLIS", "MICROS_IN_MILLIS", "NANOS_IN_MICROS", "MAX_NANOS", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS", "MILLIS_IN_SECOND", "MILLIS_IN_MINUTE", "MILLIS_IN_HOUR", "MILLIS_IN_DAY", "INFINITY_STRING", "FRACTION_LIMIT", "nanosToMillis", "nanos", "millisToNanos", "millis", "durationOfNanos", "normalNanos", "(J)J", "durationOfMillis", "normalMillis", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    public static final long MICROS_IN_MILLIS = 1000;
    public static final long MILLIS_IN_DAY = 86400000;
    public static final long MILLIS_IN_HOUR = 3600000;
    public static final long MILLIS_IN_MINUTE = 60000;
    public static final long MILLIS_IN_SECOND = 1000;
    public static final long NANOS_IN_MICROS = 1000;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$millisToNanos(long j) {
        return j * 1000000;
    }

    public static final long toDuration(int i, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if (durationUnit.compareTo(kotlin.time.DurationUnit.SECONDS) <= 0) {
            return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(kotlin.time.DurationUnitKt.convertDurationUnitOverflow(i, durationUnit, kotlin.time.DurationUnit.NANOSECONDS) << 1);
        }
        return toDuration(i, durationUnit);
    }

    public static final long toDuration(long j, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        long convertDurationUnitOverflow = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, kotlin.time.DurationUnit.NANOSECONDS, durationUnit);
        if ((-convertDurationUnitOverflow) <= j && j <= convertDurationUnitOverflow) {
            return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(kotlin.time.DurationUnitKt.convertDurationUnitOverflow(j, durationUnit, kotlin.time.DurationUnit.NANOSECONDS) << 1);
        }
        if (durationUnit.compareTo(kotlin.time.DurationUnit.MILLISECONDS) >= 0) {
            return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(((kotlin.math.MathKt.getSign(j) * kotlin.time.DurationUnitKt.convertDurationUnitToMilliseconds(java.lang.Math.abs(kotlin.ranges.RangesKt.coerceAtLeast(j, androidx.media3.common.C.TIME_UNSET)), durationUnit)) << 1) + 1);
        }
        return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((kotlin.ranges.RangesKt.coerceIn(kotlin.time.DurationUnitKt.convertDurationUnit(j, durationUnit, kotlin.time.DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L) << 1) + 1);
    }

    public static final long toDuration(double d, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        double convertDurationUnit = kotlin.time.DurationUnitKt.convertDurationUnit(d, durationUnit, kotlin.time.DurationUnit.NANOSECONDS);
        if (java.lang.Double.isNaN(convertDurationUnit)) {
            throw new java.lang.IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long roundToLong = kotlin.math.MathKt.roundToLong(convertDurationUnit);
        if (-4611686018426999999L > roundToLong || roundToLong >= 4611686018427000000L) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.math.MathKt.roundToLong(kotlin.time.DurationUnitKt.convertDurationUnit(d, durationUnit, kotlin.time.DurationUnit.MILLISECONDS)));
        }
        return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(roundToLong << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean z, boolean z2) {
        int i;
        int i2;
        long Camera2StreamConfigurationMap;
        if (str.length() == 0) {
            if (z2) {
                throw new java.lang.IllegalArgumentException("The string is empty");
            }
            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
        }
        char charAt = str.charAt(0);
        if (charAt != '+') {
            i2 = charAt != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        boolean z3 = i2 > 0;
        if (str.length() <= i2) {
            if (z2) {
                throw new java.lang.IllegalArgumentException("No components");
            }
            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
        }
        if (str.charAt(i2) == 'P') {
            Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(str, i2 + 1, z2);
        } else {
            if (z) {
                if (z2) {
                    throw new java.lang.IllegalArgumentException("");
                }
                return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
            }
            if (kotlin.text.StringsKt.regionMatches(str, i2, "Infinity", 0, java.lang.Math.max(str.length() - i2, 8), true)) {
                Camera2StreamConfigurationMap = kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc();
            } else {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, i2, z3, z2);
            }
        }
        return (i == 0 || kotlin.time.Duration.m23947equalsimpl0(Camera2StreamConfigurationMap, kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib())) ? Camera2StreamConfigurationMap : kotlin.time.Duration.m23981unaryMinusUwyO8pc(Camera2StreamConfigurationMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bf, code lost:
    
        if (r5 == r24.length()) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
    
        if (r24.charAt(r5) != 'S') goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c9, code lost:
    
        r16 = r7;
        r15 = r20;
        r9 = r15 * getHighSpeedVideoSizes((r10 * 1000000000) + r13, kotlin.time.DurationUnit.SECONDS);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x007e A[ADDED_TO_REGION, EDGE_INSN: B:202:0x007e->B:28:0x007e BREAK  A[LOOP:1: B:22:0x006b->B:26:0x0079], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, boolean z) {
        int i2;
        int i3;
        int length;
        char c;
        long j;
        int i4;
        int i5;
        long j2;
        int i6;
        kotlin.time.DurationUnit highResolutionOutputSizeshNQ4ISI;
        char charAt;
        char charAt2;
        int i7;
        char charAt3;
        int i8 = i;
        if (i8 == str.length()) {
            if (z) {
                throw new java.lang.IllegalArgumentException("");
            }
            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
        }
        kotlin.time.DurationUnit durationUnit = null;
        long j3 = 0;
        long j4 = 0;
        boolean z2 = false;
        while (i8 < str.length()) {
            char charAt4 = str.charAt(i8);
            if (charAt4 == 'T') {
                if (z2 || (i8 = i8 + 1) == str.length()) {
                    if (z) {
                        throw new java.lang.IllegalArgumentException("");
                    }
                    return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                }
                z2 = true;
            } else {
                kotlin.time.LongParser iso = kotlin.time.LongParser.INSTANCE.getIso();
                if (iso.getHighSpeedVideoFpsRangesFor) {
                    char charAt5 = str.charAt(i8);
                    if (charAt5 == '+') {
                        i2 = i8 + 1;
                        i3 = 1;
                        while (true) {
                            length = str.length();
                            if (i2 < length) {
                                break;
                            }
                            break;
                            i2++;
                        }
                        j = 0;
                        while (i2 < str.length()) {
                            int i9 = charAt2 - '0';
                            if (j > iso.getHighSpeedVideoFpsRanges) {
                            }
                            i5 = i7;
                            while (i5 < str.length()) {
                                i5++;
                            }
                            if (i5 != str.length()) {
                            }
                            if (z) {
                            }
                        }
                        i4 = i3;
                        i5 = i2;
                        if (i5 != str.length()) {
                        }
                        if (z) {
                        }
                    } else if (charAt5 == '-') {
                        i2 = i8 + 1;
                        i3 = -1;
                        while (true) {
                            length = str.length();
                            if (i2 < length || str.charAt(i2) != '0') {
                                break;
                            }
                            i2++;
                        }
                        j = 0;
                        for (c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask; i2 < str.length() && c <= (charAt2 = str.charAt(i2)) && charAt2 < ':'; c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) {
                            int i92 = charAt2 - '0';
                            if (j > iso.getHighSpeedVideoFpsRanges) {
                                if (j == iso.getHighSpeedVideoFpsRanges) {
                                    i4 = i3;
                                    if (i92 > iso.getHighSpeedVideoSizes) {
                                        i7 = i2;
                                    }
                                } else {
                                    i4 = i3;
                                }
                                j = (j << 3) + (j << 1) + i92;
                                i2++;
                                i3 = i4;
                            } else {
                                i7 = i2;
                                i4 = i3;
                            }
                            i5 = i7;
                            while (i5 < str.length() && '0' <= (charAt3 = str.charAt(i5)) && charAt3 < ':') {
                                i5++;
                            }
                            if (i5 != str.length()) {
                                if (i5 != i8 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                                    j = iso.Camera2StreamConfigurationMap;
                                    long j5 = j;
                                    if (str.charAt(i5) != '.') {
                                        int i10 = i5 + 1;
                                        kotlin.time.FractionalParser fractionalParser = kotlin.time.FractionalParser.INSTANCE;
                                        int min = java.lang.Math.min(i5 + 7, str.length());
                                        int i11 = i10;
                                        int i12 = 0;
                                        while (i11 < min) {
                                            char charAt6 = str.charAt(i11);
                                            if ('0' > charAt6 || charAt6 >= ':') {
                                                break;
                                            }
                                            i12 = (i12 << 3) + (i12 << 1) + (charAt6 - '0');
                                            i11++;
                                        }
                                        for (int i13 = 0; i13 < 6 - (i11 - i10); i13++) {
                                            i12 = (i12 << 3) + (i12 << 1);
                                        }
                                        int min2 = java.lang.Math.min(i11 + 9, str.length());
                                        int i14 = i11;
                                        int i15 = 0;
                                        while (i14 < min2) {
                                            char charAt7 = str.charAt(i14);
                                            if ('0' > charAt7 || charAt7 >= ':') {
                                                break;
                                            }
                                            i15 = (i15 << 3) + (i15 << 1) + (charAt7 - '0');
                                            i14++;
                                        }
                                        for (int i16 = 0; i16 < 9 - (i14 - i11); i16++) {
                                            i15 = (i15 << 3) + (i15 << 1);
                                        }
                                        i5 = i14;
                                        while (i5 < str.length() && '0' <= (charAt = str.charAt(i5)) && charAt < ':') {
                                            i5++;
                                        }
                                        if (z) {
                                            throw new java.lang.IllegalArgumentException("");
                                        }
                                        return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                                    }
                                    j2 = j3;
                                    i6 = i4;
                                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, i5);
                                    if (highResolutionOutputSizeshNQ4ISI != null) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown duration unit short name: ");
                                        sb.append(str.charAt(i5));
                                        java.lang.String obj = sb.toString();
                                        if (z) {
                                            throw new java.lang.IllegalArgumentException(obj);
                                        }
                                        return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                                    }
                                    if (durationUnit != null && durationUnit.compareTo(highResolutionOutputSizeshNQ4ISI) <= 0) {
                                        if (z) {
                                            throw new java.lang.IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                                    }
                                    if (highResolutionOutputSizeshNQ4ISI == kotlin.time.DurationUnit.DAYS) {
                                        if (z2) {
                                            if (z) {
                                                throw new java.lang.IllegalArgumentException("");
                                            }
                                            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                                        }
                                        j3 = i6 * kotlin.time.DurationUnitKt.convertDurationUnitToMilliseconds(j5, highResolutionOutputSizeshNQ4ISI);
                                    } else {
                                        if (!z2) {
                                            if (z) {
                                                throw new java.lang.IllegalArgumentException("");
                                            }
                                            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                                        }
                                        long highSpeedVideoSizes = getHighSpeedVideoSizes(j2, i6 * kotlin.time.DurationUnitKt.convertDurationUnitToMilliseconds(j5, highResolutionOutputSizeshNQ4ISI));
                                        if (highSpeedVideoSizes == kotlin.time.Duration.INVALID_RAW_VALUE) {
                                            if (z) {
                                                throw new java.lang.IllegalArgumentException("");
                                            }
                                            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                                        }
                                        j3 = highSpeedVideoSizes;
                                    }
                                    i8 = i5 + 1;
                                    durationUnit = highResolutionOutputSizeshNQ4ISI;
                                }
                            }
                            if (z) {
                                return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                            }
                            throw new java.lang.IllegalArgumentException("");
                        }
                        i4 = i3;
                        i5 = i2;
                        if (i5 != str.length()) {
                            if (i5 == i8 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                            }
                            long j52 = j;
                            if (str.charAt(i5) != '.') {
                            }
                            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, i5);
                            if (highResolutionOutputSizeshNQ4ISI != null) {
                            }
                        }
                        if (z) {
                            throw new java.lang.IllegalArgumentException("");
                        }
                        return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                }
                i2 = i8;
                i3 = 1;
                while (true) {
                    length = str.length();
                    if (i2 < length) {
                    }
                    i2++;
                }
                j = 0;
                while (i2 < str.length()) {
                }
                i4 = i3;
                i5 = i2;
                if (i5 != str.length()) {
                }
                if (z) {
                }
            }
        }
        return kotlin.time.Duration.m23966plusLRDsOJo(toDuration(j3, kotlin.time.DurationUnit.MILLISECONDS), toDuration(j4, kotlin.time.DurationUnit.NANOSECONDS));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x017d, code lost:
    
        if (r12 == r1) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017f, code lost:
    
        r6 = (r5 * 1000000000) + r4;
        r4 = r14;
        r14 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long Camera2StreamConfigurationMap(java.lang.String str, int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        char c;
        boolean z4;
        int i3;
        long j;
        kotlin.time.DurationUnit durationUnit;
        kotlin.time.DurationUnit durationUnit2;
        long j2;
        long j3;
        long j4;
        boolean z5;
        long highSpeedVideoSizes;
        long j5;
        char charAt;
        char charAt2;
        char charAt3;
        int length = str.length();
        if (z && str.charAt(i) == '(' && str.charAt(length - 1) == ')') {
            i2 = i + 1;
            length--;
            if (i2 == length) {
                if (z2) {
                    throw new java.lang.IllegalArgumentException("No components");
                }
                return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
            }
            z3 = true;
        } else {
            z3 = !z;
            i2 = i;
        }
        boolean z6 = true;
        long j6 = 0;
        long j7 = 0;
        kotlin.time.DurationUnit durationUnit3 = null;
        while (i2 < length) {
            if (!z6 && z3) {
                while (i2 < str.length() && str.charAt(i2) == ' ') {
                    i2++;
                }
            }
            kotlin.time.LongParser longParser = kotlin.time.LongParser.INSTANCE.getDefault();
            int i4 = (longParser.getHighSpeedVideoFpsRangesFor && ((charAt3 = str.charAt(i2)) == '+' || charAt3 == '-')) ? i2 + 1 : i2;
            while (true) {
                int length2 = str.length();
                if (i4 >= length2 || str.charAt(i4) != '0') {
                    break;
                }
                i4++;
            }
            long j8 = j6;
            long j9 = 0;
            for (c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask; i4 < str.length() && c <= (charAt2 = str.charAt(i4)) && charAt2 < ':'; c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) {
                int i5 = charAt2 - '0';
                if (j9 <= longParser.getHighSpeedVideoFpsRanges) {
                    long j10 = j9;
                    if (j9 != longParser.getHighSpeedVideoFpsRanges || i5 <= longParser.getHighSpeedVideoSizes) {
                        j9 = i5 + (j10 << 3) + (j10 << 1);
                        i4++;
                    }
                }
                if (z2) {
                    throw new java.lang.IllegalArgumentException("");
                }
                return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
            }
            long j11 = j9;
            if (i4 == i2 || i4 == length) {
                if (z2) {
                    throw new java.lang.IllegalArgumentException("");
                }
                return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
            }
            boolean z7 = str.charAt(i4) == '.';
            if (z7) {
                int i6 = i4 + 1;
                kotlin.time.FractionalParser fractionalParser = kotlin.time.FractionalParser.INSTANCE;
                int min = java.lang.Math.min(i4 + 7, str.length());
                int i7 = i6;
                int i8 = 0;
                while (i7 < min) {
                    char charAt4 = str.charAt(i7);
                    if ('0' > charAt4 || charAt4 >= ':') {
                        break;
                    }
                    i8 = (i8 << 3) + (i8 << 1) + (charAt4 - '0');
                    i7++;
                }
                int i9 = i8;
                for (int i10 = 0; i10 < 6 - (i7 - i6); i10++) {
                    i9 = (i9 << 3) + (i9 << 1);
                }
                int min2 = java.lang.Math.min(i7 + 9, str.length());
                int i11 = i7;
                int i12 = 0;
                while (true) {
                    if (i11 >= min2) {
                        z4 = z3;
                        break;
                    }
                    char charAt5 = str.charAt(i11);
                    z4 = z3;
                    if ('0' > charAt5 || charAt5 >= ':') {
                        break;
                    }
                    i12 = (i12 << 3) + (i12 << 1) + (charAt5 - '0');
                    i11++;
                    z3 = z4;
                }
                int i13 = i12;
                for (int i14 = 0; i14 < 9 - (i11 - i7); i14++) {
                    i13 = (i13 << 3) + (i13 << 1);
                }
                while (i11 < str.length() && '0' <= (charAt = str.charAt(i11)) && charAt < ':') {
                    i11++;
                }
                if (z2) {
                    throw new java.lang.IllegalArgumentException("");
                }
                return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
            }
            z4 = z3;
            i3 = -1;
            j = 0;
            char charAt6 = str.charAt(i4);
            char charAt7 = i4 < kotlin.text.StringsKt.getLastIndex(str) ? str.charAt(i4 + 1) : (char) 0;
            if (charAt6 == 'd') {
                durationUnit = kotlin.time.DurationUnit.DAYS;
            } else if (charAt6 == 'h') {
                durationUnit = kotlin.time.DurationUnit.HOURS;
            } else if (charAt6 != 's') {
                if (charAt6 == 'u') {
                    if (charAt7 == 's') {
                        durationUnit = kotlin.time.DurationUnit.MICROSECONDS;
                    }
                    durationUnit2 = null;
                } else if (charAt6 != 'm') {
                    if (charAt6 == 'n' && charAt7 == 's') {
                        durationUnit = kotlin.time.DurationUnit.NANOSECONDS;
                    }
                    durationUnit2 = null;
                } else {
                    durationUnit = charAt7 == 's' ? kotlin.time.DurationUnit.MILLISECONDS : kotlin.time.DurationUnit.MINUTES;
                }
                if (durationUnit2 != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown duration unit short name: ");
                    sb.append(str.charAt(i4));
                    java.lang.String obj = sb.toString();
                    if (z2) {
                        throw new java.lang.IllegalArgumentException(obj);
                    }
                    return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                }
                if (durationUnit3 != null && durationUnit3.compareTo(durationUnit2) <= 0) {
                    if (z2) {
                        throw new java.lang.IllegalArgumentException("Unexpected order of duration components");
                    }
                    return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                }
                int i15 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                if (i15 == 1) {
                    j2 = j7;
                    j3 = j8 + (j11 / 1000);
                    if (j3 <= 4611686018426L) {
                        j4 = (j11 % 1000) * 1000;
                        int i16 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                        int i17 = i4 + ((i16 != 1 || i16 == 2 || i16 == 3) ? 2 : 1);
                        if (z7) {
                        }
                    }
                    j4 = j2;
                    int i162 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                    int i172 = i4 + ((i162 != 1 || i162 == 2 || i162 == 3) ? 2 : 1);
                    if (z7) {
                    }
                } else if (i15 == 2) {
                    j3 = j8 + (j11 / 1000000);
                    j4 = j7 + (j11 % 1000000);
                    int i1622 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                    int i1722 = i4 + ((i1622 != 1 || i1622 == 2 || i1622 == 3) ? 2 : 1);
                    if (z7) {
                    }
                } else {
                    j2 = j7;
                    j3 = getHighSpeedVideoSizes(j8, kotlin.time.DurationUnitKt.convertDurationUnitToMilliseconds(j11, durationUnit2));
                    j4 = j2;
                    int i16222 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                    int i17222 = i4 + ((i16222 != 1 || i16222 == 2 || i16222 == 3) ? 2 : 1);
                    if (z7) {
                        i2 = i17222;
                        z3 = z4;
                        durationUnit3 = durationUnit2;
                        j6 = j3;
                        j7 = j4;
                        z6 = false;
                    } else {
                        if (i17222 < length) {
                            if (z2) {
                                throw new java.lang.IllegalArgumentException("Fractional component must be last");
                            }
                            return kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        if (durationUnit2.compareTo(kotlin.time.DurationUnit.MINUTES) < 0 || i17222 - i3 <= 15) {
                            z5 = true;
                            highSpeedVideoSizes = getHighSpeedVideoSizes(j, durationUnit2);
                        } else {
                            int i18 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                            z5 = true;
                            int i19 = 2;
                            if (i18 != 1 && i18 != 2 && i18 != 3) {
                                i19 = 1;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
                            java.lang.String substring = str.substring(i3, i17222 - i19);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                            double parseDouble = java.lang.Double.parseDouble(substring);
                            int i20 = kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit2.ordinal()];
                            if (i20 == 5) {
                                j5 = kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE;
                            } else if (i20 == 6) {
                                j5 = kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR;
                            } else {
                                if (i20 != 7) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid unit: ");
                                    sb2.append(durationUnit2);
                                    sb2.append(" for fallback fraction multiplier");
                                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                                }
                                j5 = kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY;
                            }
                            highSpeedVideoSizes = kotlin.math.MathKt.roundToLong(parseDouble * j5);
                        }
                        long j12 = highSpeedVideoSizes + j4;
                        durationUnit3 = durationUnit2;
                        j6 = j3;
                        z3 = z4;
                        z6 = false;
                        j7 = j12;
                        i2 = i17222;
                    }
                }
            } else {
                durationUnit = kotlin.time.DurationUnit.SECONDS;
            }
            durationUnit2 = durationUnit;
            if (durationUnit2 != null) {
            }
        }
        return kotlin.time.Duration.m23966plusLRDsOJo(toDuration(j6, kotlin.time.DurationUnit.MILLISECONDS), toDuration(j7, kotlin.time.DurationUnit.NANOSECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoSizes(long j, long j2) {
        return (j == 4611686018427387903L || j == -4611686018427387903L) ? ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) ? kotlin.time.Duration.INVALID_RAW_VALUE : j : (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : kotlin.ranges.RangesKt.coerceIn(j + j2, -4611686018427387903L, 4611686018427387903L);
    }

    private static final kotlin.time.DurationUnit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i) {
        char charAt = str.charAt(i);
        if (charAt == 'D') {
            return kotlin.time.DurationUnit.DAYS;
        }
        if (charAt == 'H') {
            return kotlin.time.DurationUnit.HOURS;
        }
        if (charAt == 'M') {
            return kotlin.time.DurationUnit.MINUTES;
        }
        if (charAt != 'S') {
            return null;
        }
        return kotlin.time.DurationUnit.SECONDS;
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(j << 1);
        }
        return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(((j / 1000000) << 1) + 1);
    }

    public static final /* synthetic */ long access$nanosToMillis(long j) {
        return j / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighResolutionOutputSizeshNQ4ISI(long j) {
        if (-4611686018426L > j || j >= 4611686018427L) {
            return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((kotlin.ranges.RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L) << 1) + 1);
        }
        return kotlin.time.Duration.INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((j * 1000000) << 1);
    }

    private static final long getHighSpeedVideoSizes(long j, kotlin.time.DurationUnit durationUnit) {
        double d;
        double d2 = j;
        switch (kotlin.time.DurationKt.WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                d = 1.0E-12d;
                break;
            case 2:
                d = 1.0E-15d;
                break;
            case 3:
                d = 1.0E-9d;
                break;
            case 4:
                d = 1.0E-6d;
                break;
            case 5:
                d = 6.0E-5d;
                break;
            case 6:
                d = 0.0036d;
                break;
            case 7:
                d = 0.0864d;
                break;
            default:
                throw new java.lang.IllegalStateException("Unknown unit: ".concat(java.lang.String.valueOf(durationUnit)).toString());
        }
        return kotlin.math.MathKt.roundToLong(d2 * d);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.time.DurationUnit.values().length];
            try {
                iArr[kotlin.time.DurationUnit.MICROSECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.time.DurationUnit.NANOSECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.time.DurationUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.time.DurationUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.time.DurationUnit.DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
