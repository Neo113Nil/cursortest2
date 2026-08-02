package kotlin.time;

import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b-\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\u008a\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\u008a\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0082\u0080\u0004¢\u0006\u0002\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0082\u0080\u0004¢\u0006\u0002\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0082\u0080\u0004¢\u0006\u0002\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0082\u0080\u0004\u001a\u000e\u0010\u001f\u001a\u00020\u0014*\u00020\u0006H\u0083\u0088\u0004\u001a\u000e\u0010 \u001a\u00020\u0014*\u00020\u0006H\u0083\u0088\u0004\u001a\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0083\u0088\u0004\u001a&\u0010$\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0080\u0004\u001a\u0016\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0080\u0004\u001a!\u0010'\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u0012H\u0083\u0088\u0004¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010,H\u0082\u0088\u0004¢\u0006\u0004\b-\u0010.\u001a\u0018\u0010/\u001a\u0004\u0018\u00010\u0004*\u00020\u00122\u0006\u00100\u001a\u00020\u0002H\u0082\u0080\u0004\u001a\u0018\u00101\u001a\u0004\u0018\u00010\u0004*\u00020\u00122\u0006\u00100\u001a\u00020\u0002H\u0082\u0080\u0004\u001a\u000e\u0010=\u001a\u00020\u0006*\u00020\u0006H\u0083\u0088\u0004\u001a\u000e\u0010=\u001a\u00020\u0002*\u00020\u0002H\u0083\u0088\u0004\u001a\u0012\u0010J\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\u0082\u0080\u0004\u001a\u0012\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0082\u0080\u0004\u001a\u0017\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\u001a\u0017\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\u001a\u001f\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002H\u0082\u0080\u0004¢\u0006\u0002\u0010V\u001a\u0017\u0010W\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\u001a\u0017\u0010X\u001a\u00020\u00012\u0006\u0010M\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0002\u0010P\"\u001f\u00102\u001a\u00020\b*\u00020\u00048BX\u0082\u0084\b¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0019\u00107\u001a\u00020\u0006*\u00020\u00048BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0019\u0010:\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u000f\u0010>\u001a\u00020\u0002X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010?\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010@\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010A\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010B\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010C\u001a\u00020\u0006X\u0082Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010D\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010E\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010F\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010G\u001a\u00020\u0006X\u0080Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010H\u001a\u00020\u0012X\u0082Ô\b¢\u0006\u0002\n\u0000\"\u000f\u0010I\u001a\u00020\u0002X\u0082Ô\b¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"toDuration", "Lkotlin/time/Duration;", "", "unit", "Lkotlin/time/DurationUnit;", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "times", "duration", "times-mvk6XK0", "(IJ)J", "times-kIfJnKk", "(DJ)J", "parseDuration", "value", "", "strictIso", "", "throwException", "(Ljava/lang/String;ZZ)J", "parseIsoStringFormat", SpellCheckPlugin.START_INDEX_KEY, "(Ljava/lang/String;IZ)J", "parseDefaultStringFormat", "hasSign", "(Ljava/lang/String;IZZ)J", "addMillisWithoutOverflow", "other", "isInfiniteMillis", "isFiniteMillis", "sameSign", "a", "b", "parseFractionFallback", SpellCheckPlugin.END_INDEX_KEY, "fractionDigitsToNanos", "handleError", Constants.MESSAGE, "(ZLjava/lang/String;)J", "onInvalid", "block", "Lkotlin/Function0;", "onInvalid-ge6A_vg", "(JLkotlin/jvm/functions/Function0;)Lkotlin/time/Duration;", "defaultDurationUnitByShortNameOrNull", "start", "isoDurationUnitByShortNameOrNull", "fractionMultiplier", "getFractionMultiplier$annotations", "(Lkotlin/time/DurationUnit;)V", "getFractionMultiplier", "(Lkotlin/time/DurationUnit;)D", "fallbackFractionMultiplier", "getFallbackFractionMultiplier", "(Lkotlin/time/DurationUnit;)J", "shortNameLength", "getShortNameLength", "(Lkotlin/time/DurationUnit;)I", "multiplyBy10", "NANOS_IN_MILLIS", "MICROS_IN_MILLIS", "NANOS_IN_MICROS", "MAX_NANOS", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS", "MILLIS_IN_SECOND", "MILLIS_IN_MINUTE", "MILLIS_IN_HOUR", "MILLIS_IN_DAY", "INFINITY_STRING", "FRACTION_LIMIT", "nanosToMillis", "nanos", "millisToNanos", "millis", "durationOfNanos", "normalNanos", "(J)J", "durationOfMillis", "normalMillis", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Duration.kt\nkotlin/time/LongParser\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 Duration.kt\nkotlin/time/FractionalParser\n*L\n1#1,1613:1\n1#2:1614\n1284#3,12:1615\n1296#3,15:1630\n1284#3,12:1674\n1296#3,15:1689\n1656#4,3:1627\n1656#4,3:1668\n1656#4,3:1671\n1656#4,3:1686\n1656#4,3:1727\n1342#5,23:1645\n1342#5,23:1704\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1100#1:1615,12\n1100#1:1630,15\n1179#1:1674,12\n1179#1:1689,15\n1100#1:1627,3\n1109#1:1668,3\n1174#1:1671,3\n1179#1:1686,3\n1191#1:1727,3\n1109#1:1645,23\n1191#1:1704,23\n*E\n"})
/* loaded from: classes5.dex */
public final class DurationKt {
    private static final int FRACTION_LIMIT = 15;
    private static final String INFINITY_STRING = "Infinity";
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final long MICROS_IN_MILLIS = 1000;
    public static final long MILLIS_IN_DAY = 86400000;
    public static final long MILLIS_IN_HOUR = 3600000;
    public static final long MILLIS_IN_MINUTE = 60000;
    public static final long MILLIS_IN_SECOND = 1000;
    public static final long NANOS_IN_MICROS = 1000;
    public static final int NANOS_IN_MILLIS = 1000000;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long addMillisWithoutOverflow(long j, long j2) {
        return (j == 4611686018427387903L || j == -4611686018427387903L) ? (-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) ? (j2 ^ j) >= 0 ? j : Duration.INVALID_RAW_VALUE : j : (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : RangesKt.coerceIn(j + j2, -4611686018427387903L, 4611686018427387903L);
    }

    private static final DurationUnit defaultDurationUnitByShortNameOrNull(String str, int i) {
        char charAt = str.charAt(i);
        char charAt2 = i < StringsKt.getLastIndex(str) ? str.charAt(i + 1) : (char) 0;
        if (charAt == 'd') {
            return DurationUnit.DAYS;
        }
        if (charAt == 'h') {
            return DurationUnit.HOURS;
        }
        if (charAt == 's') {
            return DurationUnit.SECONDS;
        }
        if (charAt == 'u') {
            if (charAt2 == 's') {
                return DurationUnit.MICROSECONDS;
            }
            return null;
        }
        if (charAt == 'm') {
            return charAt2 == 's' ? DurationUnit.MILLISECONDS : DurationUnit.MINUTES;
        }
        if (charAt == 'n' && charAt2 == 's') {
            return DurationUnit.NANOSECONDS;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.INSTANCE.m3152fromRawValueUwyO8pc$kotlin_stdlib((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.INSTANCE.m3152fromRawValueUwyO8pc$kotlin_stdlib((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L)) : durationOfNanos(millisToNanos(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.INSTANCE.m3152fromRawValueUwyO8pc$kotlin_stdlib(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j)) : durationOfNanos(j);
    }

    private static final long fractionDigitsToNanos(long j, DurationUnit durationUnit) {
        return MathKt.roundToLong(j * getFractionMultiplier(durationUnit));
    }

    private static final long getFallbackFractionMultiplier(DurationUnit durationUnit) {
        int i = WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()];
        if (i == 5) {
            return 60000000000L;
        }
        if (i == 6) {
            return 3600000000000L;
        }
        if (i == 7) {
            return 86400000000000L;
        }
        throw new IllegalStateException(("Invalid unit: " + durationUnit + " for fallback fraction multiplier").toString());
    }

    private static final double getFractionMultiplier(DurationUnit durationUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return 1.0E-12d;
            case 2:
                return 1.0E-15d;
            case 3:
                return 1.0E-9d;
            case 4:
                return 1.0E-6d;
            case 5:
                return 6.0E-5d;
            case 6:
                return 0.0036d;
            case 7:
                return 0.0864d;
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }

    private static /* synthetic */ void getFractionMultiplier$annotations(DurationUnit durationUnit) {
    }

    private static final int getShortNameLength(DurationUnit durationUnit) {
        int i = WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? 2 : 1;
    }

    @InlineOnly
    private static final long handleError(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
    }

    public static /* synthetic */ long handleError$default(boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if (z) {
            throw new IllegalArgumentException(str);
        }
        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
    }

    @InlineOnly
    private static final boolean isFiniteMillis(long j) {
        return -4611686018427387903L < j && j < 4611686018427387903L;
    }

    @InlineOnly
    private static final boolean isInfiniteMillis(long j) {
        return j == 4611686018427387903L || j == -4611686018427387903L;
    }

    private static final DurationUnit isoDurationUnitByShortNameOrNull(String str, int i) {
        char charAt = str.charAt(i);
        if (charAt == 'D') {
            return DurationUnit.DAYS;
        }
        if (charAt == 'H') {
            return DurationUnit.HOURS;
        }
        if (charAt == 'M') {
            return DurationUnit.MINUTES;
        }
        if (charAt != 'S') {
            return null;
        }
        return DurationUnit.SECONDS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * 1000000;
    }

    @InlineOnly
    private static final int multiplyBy10(int i) {
        return (i << 3) + (i << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / 1000000;
    }

    /* renamed from: onInvalid-ge6A_vg, reason: not valid java name */
    private static final Duration m3161onInvalidge6A_vg(long j, Function0<Duration> function0) {
        return Duration.m3066equalsimpl0(j, Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib()) ? function0.invoke() : Duration.m3059boximpl(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0193, code lost:
    
        if (r10 != r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0196, code lost:
    
        r2 = (r14 * 1000000000) + r12;
        r4 = r13;
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        if (r13 >= r25.length()) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        r1 = r25.charAt(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if ('0' > r1) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        if (r1 >= ':') goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r28 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e7, code lost:
    
        return kotlin.time.Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ed, code lost:
    
        throw new java.lang.IllegalArgumentException("");
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0238 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long parseDefaultStringFormat(String str, int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        long j;
        long j2;
        long j3;
        int i4;
        char charAt;
        char charAt2;
        int length = str.length();
        boolean z6 = !z;
        if (z && str.charAt(i) == '(' && str.charAt(length - 1) == ')') {
            i2 = i + 1;
            length--;
            if (i2 == length) {
                if (z2) {
                    throw new IllegalArgumentException("No components");
                }
                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
            }
            z3 = true;
        } else {
            z3 = z6;
            i2 = i;
        }
        DurationUnit durationUnit = null;
        long j4 = 0;
        long j5 = 0;
        boolean z7 = true;
        loop0: while (i2 < length) {
            if (!z7 && z3) {
                while (i2 < str.length() && str.charAt(i2) == ' ') {
                    i2++;
                }
            }
            LongParser longParser = LongParser.INSTANCE.getDefault();
            int i5 = (longParser.allowSign && ((charAt2 = str.charAt(i2)) == '+' || charAt2 == '-')) ? i2 + 1 : i2;
            while (i5 < str.length() && str.charAt(i5) == '0') {
                i5++;
            }
            long j6 = 0;
            while (true) {
                if (i5 >= str.length()) {
                    z4 = z3;
                    break;
                }
                char charAt3 = str.charAt(i5);
                z4 = z3;
                if ('0' > charAt3 || charAt3 >= ':') {
                    break;
                }
                int i6 = charAt3 - '0';
                if (j6 > longParser.overflowThreshold) {
                    break loop0;
                }
                long j7 = j5;
                if (j6 == longParser.overflowThreshold && i6 > longParser.lastDigitMax) {
                    break loop0;
                }
                j6 = i6 + (j6 << 3) + (j6 << 1);
                i5++;
                z3 = z4;
                j5 = j7;
            }
            long j8 = j5;
            if (i5 == i2 || i5 == length) {
                if (z2) {
                    throw new IllegalArgumentException("");
                }
                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
            }
            boolean z8 = str.charAt(i5) == '.';
            if (z8) {
                int i7 = i5 + 1;
                FractionalParser fractionalParser = FractionalParser.INSTANCE;
                int min = Math.min(i5 + 7, str.length());
                int i8 = i7;
                int i9 = 0;
                while (true) {
                    if (i8 >= min) {
                        z5 = z8;
                        break;
                    }
                    char charAt4 = str.charAt(i8);
                    z5 = z8;
                    if ('0' > charAt4 || charAt4 >= ':') {
                        break;
                    }
                    i9 = (charAt4 - '0') + (i9 << 3) + (i9 << 1);
                    i8++;
                    z8 = z5;
                }
                for (int i10 = 0; i10 < 6 - (i8 - i7); i10++) {
                    i9 = (i9 << 1) + (i9 << 3);
                }
                int min2 = Math.min(i8 + 9, str.length());
                int i11 = i8;
                int i12 = 0;
                while (true) {
                    if (i11 >= min2) {
                        i4 = i11;
                        break;
                    }
                    int i13 = min2;
                    char charAt5 = str.charAt(i11);
                    i4 = i11;
                    if ('0' > charAt5 || charAt5 >= ':') {
                        break;
                    }
                    i12 = (charAt5 - '0') + (i12 << 3) + (i12 << 1);
                    i11 = i4 + 1;
                    min2 = i13;
                }
                for (int i14 = 0; i14 < 9 - (i4 - i8); i14++) {
                    i12 = (i12 << 1) + (i12 << 3);
                }
                int i15 = i4;
                while (i15 < str.length() && '0' <= (charAt = str.charAt(i15)) && charAt < ':') {
                    i15++;
                }
                if (z2) {
                    throw new IllegalArgumentException("");
                }
                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
            }
            z5 = z8;
            i3 = -1;
            j = 0;
            DurationUnit defaultDurationUnitByShortNameOrNull = defaultDurationUnitByShortNameOrNull(str, i5);
            if (defaultDurationUnitByShortNameOrNull == null) {
                String str2 = "Unknown duration unit short name: " + str.charAt(i5);
                if (z2) {
                    throw new IllegalArgumentException(str2);
                }
                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
            }
            if (durationUnit != null && durationUnit.compareTo(defaultDurationUnitByShortNameOrNull) <= 0) {
                if (z2) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
            }
            int i16 = WhenMappings.$EnumSwitchMapping$0[defaultDurationUnitByShortNameOrNull.ordinal()];
            if (i16 == 1) {
                j2 = (j6 / 1000) + j4;
                if (j2 <= MAX_NANOS_IN_MILLIS) {
                    j3 = (j6 % 1000) * 1000;
                }
                j4 = j2;
                int shortNameLength = getShortNameLength(defaultDurationUnitByShortNameOrNull) + i5;
                if (!z5) {
                }
            } else if (i16 != 2) {
                j4 = addMillisWithoutOverflow(j4, DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j6, defaultDurationUnitByShortNameOrNull));
                int shortNameLength2 = getShortNameLength(defaultDurationUnitByShortNameOrNull) + i5;
                if (!z5) {
                    i2 = shortNameLength2;
                    durationUnit = defaultDurationUnitByShortNameOrNull;
                    z3 = z4;
                    j5 = j8;
                    z7 = false;
                } else {
                    if (shortNameLength2 < length) {
                        if (z2) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                    long fractionDigitsToNanos = (defaultDurationUnitByShortNameOrNull.compareTo(DurationUnit.MINUTES) < 0 || shortNameLength2 - i3 <= 15) ? fractionDigitsToNanos(j, defaultDurationUnitByShortNameOrNull) : parseFractionFallback(str, i3, shortNameLength2 - getShortNameLength(defaultDurationUnitByShortNameOrNull), defaultDurationUnitByShortNameOrNull);
                    durationUnit = defaultDurationUnitByShortNameOrNull;
                    z3 = z4;
                    z7 = false;
                    j5 = j8 + fractionDigitsToNanos;
                    i2 = shortNameLength2;
                }
            } else {
                long j9 = 1000000;
                j2 = (j6 / j9) + j4;
                j3 = (j6 % j9) + j8;
            }
            j8 = j3;
            j4 = j2;
            int shortNameLength22 = getShortNameLength(defaultDurationUnitByShortNameOrNull) + i5;
            if (!z5) {
            }
        }
        return Duration.m3090plusLRDsOJo(toDuration(j4, DurationUnit.MILLISECONDS), toDuration(j5, DurationUnit.NANOSECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z, boolean z2) {
        int i;
        int i2;
        boolean regionMatches;
        long m3153getINFINITEUwyO8pc;
        if (str.length() == 0) {
            if (z2) {
                throw new IllegalArgumentException("The string is empty");
            }
            return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
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
                throw new IllegalArgumentException("No components");
            }
            return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
        }
        if (str.charAt(i2) == 'P') {
            m3153getINFINITEUwyO8pc = parseIsoStringFormat(str, i2 + 1, z2);
        } else {
            if (z) {
                if (z2) {
                    throw new IllegalArgumentException("");
                }
                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
            }
            regionMatches = StringsKt__StringsJVMKt.regionMatches(str, i2, INFINITY_STRING, 0, Math.max(str.length() - i2, 8), true);
            m3153getINFINITEUwyO8pc = regionMatches ? Duration.INSTANCE.m3153getINFINITEUwyO8pc() : parseDefaultStringFormat(str, i2, z3, z2);
        }
        return (i == 0 || Duration.m3066equalsimpl0(m3153getINFINITEUwyO8pc, Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib())) ? m3153getINFINITEUwyO8pc : Duration.m3105unaryMinusUwyO8pc(m3153getINFINITEUwyO8pc);
    }

    public static /* synthetic */ long parseDuration$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        return parseDuration(str, z, z2);
    }

    private static final long parseFractionFallback(String str, int i, int i2, DurationUnit durationUnit) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return MathKt.roundToLong(Double.parseDouble(substring) * getFallbackFractionMultiplier(durationUnit));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d0, code lost:
    
        if (r22.charAt(r5) == 'S') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d3, code lost:
    
        r9 = r15 * fractionDigitsToNanos((r10 * 1000000000) + r13, kotlin.time.DurationUnit.SECONDS);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c8, code lost:
    
        if (r5 == r22.length()) goto L194;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0083 A[ADDED_TO_REGION, EDGE_INSN: B:200:0x0083->B:28:0x0083 BREAK  A[LOOP:1: B:22:0x0070->B:26:0x007e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long parseIsoStringFormat(String str, int i, boolean z) {
        int i2;
        int i3;
        char c;
        long j;
        String str2;
        int i4;
        DurationUnit isoDurationUnitByShortNameOrNull;
        char charAt;
        char charAt2;
        int i5;
        char charAt3;
        String str3 = "";
        int i6 = i;
        if (i6 == str.length()) {
            if (z) {
                throw new IllegalArgumentException("");
            }
            return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
        }
        DurationUnit durationUnit = null;
        long j2 = 0;
        long j3 = 0;
        boolean z2 = false;
        while (i6 < str.length()) {
            char charAt4 = str.charAt(i6);
            if (charAt4 != 'T') {
                LongParser iso = LongParser.INSTANCE.getIso();
                if (iso.allowSign) {
                    char charAt5 = str.charAt(i6);
                    if (charAt5 == '+') {
                        i2 = i6 + 1;
                        i3 = 1;
                        while (true) {
                            if (i2 < str.length()) {
                                break;
                            }
                            break;
                            i2++;
                        }
                        j = 0;
                        while (i2 < str.length()) {
                            int i7 = charAt2 - '0';
                            if (j > iso.overflowThreshold) {
                            }
                            String str4 = str3;
                            i4 = i5;
                            while (i4 < str.length()) {
                                i4++;
                            }
                            if (i4 != str.length()) {
                            }
                            if (z) {
                            }
                        }
                        str2 = str3;
                        i4 = i2;
                        if (i4 != str.length()) {
                        }
                        if (z) {
                        }
                    } else if (charAt5 == '-') {
                        i2 = i6 + 1;
                        i3 = -1;
                        while (true) {
                            if (i2 < str.length() || str.charAt(i2) != '0') {
                                break;
                            }
                            i2++;
                        }
                        j = 0;
                        for (c = '0'; i2 < str.length() && c <= (charAt2 = str.charAt(i2)) && charAt2 < ':'; c = '0') {
                            int i72 = charAt2 - '0';
                            if (j > iso.overflowThreshold) {
                                if (j == iso.overflowThreshold) {
                                    i5 = i2;
                                    if (i72 > iso.lastDigitMax) {
                                    }
                                } else {
                                    i5 = i2;
                                }
                                j = (j << 3) + (j << 1) + i72;
                                i2 = i5 + 1;
                                str3 = str3;
                            } else {
                                i5 = i2;
                            }
                            String str42 = str3;
                            i4 = i5;
                            while (i4 < str.length() && '0' <= (charAt3 = str.charAt(i4)) && charAt3 < ':') {
                                i4++;
                            }
                            if (i4 != str.length()) {
                                if (i4 != i6 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                                    j = iso.overflowLimit;
                                    str2 = str42;
                                    long j4 = j;
                                    if (str.charAt(i4) == '.') {
                                        int i8 = i4 + 1;
                                        FractionalParser fractionalParser = FractionalParser.INSTANCE;
                                        int min = Math.min(i4 + 7, str.length());
                                        int i9 = i8;
                                        int i10 = 0;
                                        while (i9 < min) {
                                            char charAt6 = str.charAt(i9);
                                            if ('0' > charAt6 || charAt6 >= ':') {
                                                break;
                                            }
                                            i10 = (charAt6 - '0') + (i10 << 3) + (i10 << 1);
                                            i9++;
                                        }
                                        for (int i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        int min2 = Math.min(i9 + 9, str.length());
                                        int i12 = i9;
                                        int i13 = 0;
                                        while (i12 < min2) {
                                            char charAt7 = str.charAt(i12);
                                            int i14 = min2;
                                            if ('0' > charAt7 || charAt7 >= ':') {
                                                break;
                                            }
                                            i13 = (charAt7 - '0') + (i13 << 3) + (i13 << 1);
                                            i12++;
                                            min2 = i14;
                                        }
                                        int i15 = 9 - (i12 - i9);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        int i17 = i12;
                                        while (i17 < str.length() && '0' <= (charAt = str.charAt(i17)) && charAt < ':') {
                                            i17++;
                                        }
                                        if (z) {
                                            throw new IllegalArgumentException(str2);
                                        }
                                        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                                    }
                                    isoDurationUnitByShortNameOrNull = isoDurationUnitByShortNameOrNull(str, i4);
                                    if (isoDurationUnitByShortNameOrNull != null) {
                                        String str5 = "Unknown duration unit short name: " + str.charAt(i4);
                                        if (z) {
                                            throw new IllegalArgumentException(str5);
                                        }
                                        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                                    }
                                    if (durationUnit != null && durationUnit.compareTo(isoDurationUnitByShortNameOrNull) <= 0) {
                                        if (z) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                                    }
                                    if (isoDurationUnitByShortNameOrNull == DurationUnit.DAYS) {
                                        if (z2) {
                                            if (z) {
                                                throw new IllegalArgumentException(str2);
                                            }
                                            return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                                        }
                                        j2 = i3 * DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j4, isoDurationUnitByShortNameOrNull);
                                    } else {
                                        if (!z2) {
                                            if (z) {
                                                throw new IllegalArgumentException(str2);
                                            }
                                            return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                                        }
                                        long addMillisWithoutOverflow = addMillisWithoutOverflow(j2, i3 * DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j4, isoDurationUnitByShortNameOrNull));
                                        if (addMillisWithoutOverflow == Duration.INVALID_RAW_VALUE) {
                                            if (z) {
                                                throw new IllegalArgumentException(str2);
                                            }
                                            return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                                        }
                                        j2 = addMillisWithoutOverflow;
                                    }
                                    i6 = i4 + 1;
                                    str3 = str2;
                                    durationUnit = isoDurationUnitByShortNameOrNull;
                                }
                            }
                            if (z) {
                                return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                            }
                            throw new IllegalArgumentException(str42);
                        }
                        str2 = str3;
                        i4 = i2;
                        if (i4 != str.length()) {
                            if (i4 == i6 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                            }
                            long j42 = j;
                            if (str.charAt(i4) == '.') {
                            }
                            isoDurationUnitByShortNameOrNull = isoDurationUnitByShortNameOrNull(str, i4);
                            if (isoDurationUnitByShortNameOrNull != null) {
                            }
                        }
                        if (z) {
                            throw new IllegalArgumentException(str2);
                        }
                        return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                }
                i2 = i6;
                i3 = 1;
                while (true) {
                    if (i2 < str.length()) {
                    }
                    i2++;
                }
                j = 0;
                while (i2 < str.length()) {
                }
                str2 = str3;
                i4 = i2;
                if (i4 != str.length()) {
                }
                if (z) {
                }
            } else {
                if (z2 || (i6 = i6 + 1) == str.length()) {
                    if (z) {
                        throw new IllegalArgumentException(str3);
                    }
                    return Duration.INSTANCE.m3154getINVALIDUwyO8pc$kotlin_stdlib();
                }
                z2 = true;
            }
        }
        return Duration.m3090plusLRDsOJo(toDuration(j2, DurationUnit.MILLISECONDS), toDuration(j3, DurationUnit.NANOSECONDS));
    }

    @InlineOnly
    private static final boolean sameSign(long j, long j2) {
        return (j ^ j2) >= 0;
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m3162timeskIfJnKk(double d, long j) {
        return Duration.m3091timesUwyO8pc(j, d);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m3163timesmvk6XK0(int i, long j) {
        return Duration.m3092timesUwyO8pc(j, i);
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(int i, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS)) : toDuration(i, unit);
    }

    @InlineOnly
    private static final long multiplyBy10(long j) {
        return (j << 3) + (j << 1);
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if ((-convertDurationUnitOverflow) <= j && j <= convertDurationUnitOverflow) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, unit, durationUnit));
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (unit.compareTo(durationUnit2) >= 0) {
            return durationOfMillis(MathKt.getSign(j) * DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(Math.abs(RangesKt.coerceAtLeast(j, -9223372036854775807L)), unit));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j, unit, durationUnit2), -4611686018427387903L, 4611686018427387903L));
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(double d, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long roundToLong = MathKt.roundToLong(convertDurationUnit);
            if (-4611686018426999999L <= roundToLong && roundToLong < 4611686018427000000L) {
                return durationOfNanos(roundToLong);
            }
            return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
