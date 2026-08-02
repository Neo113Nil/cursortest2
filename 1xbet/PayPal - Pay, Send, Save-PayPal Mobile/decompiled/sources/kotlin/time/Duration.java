package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010$\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010&\u001a\u00020!¢\u0006\u0004\b%\u0010#J\r\u0010(\u001a\u00020!¢\u0006\u0004\b'\u0010#J\r\u0010*\u001a\u00020!¢\u0006\u0004\b)\u0010#J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u009d\u0001\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2u\u00107\u001aq\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(3\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00000/H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b8\u00109J\u0088\u0001\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2`\u00107\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(3\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00000;H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b8\u0010<Js\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2K\u00107\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00000=H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b8\u0010>J^\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010.26\u00107\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00000?H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b8\u0010@J\u0015\u0010C\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bD\u0010\u001fJ\u0015\u0010H\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bF\u0010GJ\u000f\u0010L\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ?\u0010\u000e\u001a\u00020R*\u00060Mj\u0002`N2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020I2\u0006\u0010Q\u001a\u00020!H\u0002¢\u0006\u0004\b\u000e\u0010SJ\u001f\u0010L\u001a\u00020I2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010T\u001a\u00020\u0011¢\u0006\u0004\bJ\u0010UJ\r\u0010W\u001a\u00020I¢\u0006\u0004\bV\u0010KJ\u001a\u0010Y\u001a\u00020!2\b\u0010\b\u001a\u0004\u0018\u00010XHÖ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0011\u0010a\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\b`\u0010\u0005R\u001a\u0010f\u001a\u00020\u00118AX\u0080\u0004¢\u0006\f\u0012\u0004\bd\u0010e\u001a\u0004\bb\u0010cR\u001a\u0010i\u001a\u00020\u00118AX\u0080\u0004¢\u0006\f\u0012\u0004\bh\u0010e\u001a\u0004\bg\u0010cR\u001a\u0010l\u001a\u00020\u00118AX\u0080\u0004¢\u0006\f\u0012\u0004\bk\u0010e\u001a\u0004\bj\u0010cR\u001a\u0010o\u001a\u00020\u00118AX\u0080\u0004¢\u0006\f\u0012\u0004\bn\u0010e\u001a\u0004\bm\u0010cR\u0011\u0010q\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bp\u0010\u0005R\u0011\u0010s\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\br\u0010\u0005R\u0011\u0010u\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bt\u0010\u0005R\u0011\u0010w\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bv\u0010\u0005R\u0011\u0010y\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bx\u0010\u0005R\u0011\u0010{\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bz\u0010\u0005R\u0011\u0010}\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b|\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "constructor-impl", "(J)J", "unaryMinus-UwyO8pc", "unaryMinus", "other", "plus-LRDsOJo", "(JJ)J", "plus", "p0", "p1", "Camera2StreamConfigurationMap", "minus-LRDsOJo", "minus", "", "scale", "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "Lkotlin/time/DurationUnit;", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "truncateTo", "", "isNegative-impl", "(J)Z", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", "T", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "toLong", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "p2", "p3", "p4", "", "(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString-impl", "toIsoString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    private static final long INFINITE;
    private static final long INVALID;
    public static final long INVALID_RAW_VALUE = 9223372036854759646L;
    private static final long NEG_INFINITE;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.Duration.Companion INSTANCE = new kotlin.time.Duration.Companion(null);
    private static final long ZERO = m23942constructorimpl(0);

    /* renamed from: access$getValue-impl, reason: not valid java name */
    public static final /* synthetic */ long m23938access$getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: access$isInNanos-impl, reason: not valid java name */
    public static final /* synthetic */ boolean m23939access$isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Don't call this constructor directly.")
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23942constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23947equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m23963isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m23964isPositiveimpl(long j) {
        return j > 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(kotlin.time.Duration duration) {
        return m23982compareToLRDsOJo(duration.getGetHighResolutionOutputSizeshNQ4ISI());
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Don't call this constructor directly.")
    private /* synthetic */ Duration(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010\u001dR \u0010&\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001d\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u001f"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "", "rawValue", "Lkotlin/time/Duration;", "fromRawValue-UwyO8pc$kotlin_stdlib", "(J)J", "fromRawValue", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "convert", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "parseOrNull-FghU774", "(Ljava/lang/String;)Lkotlin/time/Duration;", "parseOrNull", "parseIsoStringOrNull-FghU774", "parseIsoStringOrNull", "ZERO", "J", "getZERO-UwyO8pc", "()J", "getZERO-UwyO8pc$annotations", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "INVALID_RAW_VALUE", "INVALID", "getINVALID-UwyO8pc$kotlin_stdlib", "getINVALID-UwyO8pc$kotlin_stdlib$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23984getDaysUwyO8pc$annotations(double d) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23985getDaysUwyO8pc$annotations(int i) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23986getDaysUwyO8pc$annotations(long j) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23987getHoursUwyO8pc$annotations(double d) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23988getHoursUwyO8pc$annotations(int i) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23989getHoursUwyO8pc$annotations(long j) {
        }

        /* renamed from: getINVALID-UwyO8pc$kotlin_stdlib$annotations, reason: not valid java name */
        public static /* synthetic */ void m23990getINVALIDUwyO8pc$kotlin_stdlib$annotations() {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23991getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23992getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23993getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23994getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23995getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23996getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23997getMinutesUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23998getMinutesUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m23999getMinutesUwyO8pc$annotations(long j) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24000getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24001getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24002getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24003getSecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24004getSecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24005getSecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getZERO-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m24006getZEROUwyO8pc$annotations() {
        }

        private Companion() {
        }

        /* renamed from: fromRawValue-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m24007fromRawValueUwyO8pc$kotlin_stdlib(long rawValue) {
            long m23942constructorimpl = kotlin.time.Duration.m23942constructorimpl(rawValue);
            if (kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()) {
                if (kotlin.time.Duration.m23939access$isInNanosimpl(m23942constructorimpl)) {
                    long m23938access$getValueimpl = kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl);
                    if (-4611686018426999999L <= m23938access$getValueimpl && m23938access$getValueimpl < 4611686018427000000L) {
                        return m23942constructorimpl;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl));
                    sb.append(" ns is out of nanoseconds range");
                    throw new java.lang.AssertionError(sb.toString());
                }
                long m23938access$getValueimpl2 = kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl);
                if (-4611686018427387903L >= m23938access$getValueimpl2 || m23938access$getValueimpl2 >= 4611686018427387903L) {
                    long m23938access$getValueimpl3 = kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl);
                    if (m23938access$getValueimpl3 != 4611686018427387903L && m23938access$getValueimpl3 != -4611686018427387903L) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl));
                        sb2.append(" ms is out of milliseconds range");
                        throw new java.lang.AssertionError(sb2.toString());
                    }
                }
                long m23938access$getValueimpl4 = kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl);
                if (-4611686018426L > m23938access$getValueimpl4 || m23938access$getValueimpl4 >= 4611686018427L) {
                    return m23942constructorimpl;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(kotlin.time.Duration.m23938access$getValueimpl(m23942constructorimpl));
                sb3.append(" ms is denormalized");
                throw new java.lang.AssertionError(sb3.toString());
            }
            return m23942constructorimpl;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m24011getZEROUwyO8pc() {
            return kotlin.time.Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m24008getINFINITEUwyO8pc() {
            return kotlin.time.Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m24010getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return kotlin.time.Duration.NEG_INFINITE;
        }

        /* renamed from: getINVALID-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m24009getINVALIDUwyO8pc$kotlin_stdlib() {
            return kotlin.time.Duration.INVALID;
        }

        public final double convert(double value, kotlin.time.DurationUnit sourceUnit, kotlin.time.DurationUnit targetUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceUnit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetUnit, "");
            return kotlin.time.DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m24012parseUwyO8pc(java.lang.String value) {
            long highResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            try {
                highResolutionOutputSizeshNQ4ISI = kotlin.time.DurationKt.getHighResolutionOutputSizeshNQ4ISI(value, false, true);
                if (kotlin.time.Duration.m23947equalsimpl0(highResolutionOutputSizeshNQ4ISI, kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib())) {
                    throw new java.lang.IllegalStateException("invariant failed".toString());
                }
                return highResolutionOutputSizeshNQ4ISI;
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid duration string format: '");
                sb.append(value);
                sb.append("'.");
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m24013parseIsoStringUwyO8pc(java.lang.String value) {
            long highResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            try {
                highResolutionOutputSizeshNQ4ISI = kotlin.time.DurationKt.getHighResolutionOutputSizeshNQ4ISI(value, true, true);
                if (kotlin.time.Duration.m23947equalsimpl0(highResolutionOutputSizeshNQ4ISI, kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib())) {
                    throw new java.lang.IllegalStateException("invariant failed".toString());
                }
                return highResolutionOutputSizeshNQ4ISI;
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid ISO duration string format: '");
                sb.append(value);
                sb.append("'.");
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m24015parseOrNullFghU774(java.lang.String value) {
            long highResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            highResolutionOutputSizeshNQ4ISI = kotlin.time.DurationKt.getHighResolutionOutputSizeshNQ4ISI(value, false, false);
            if (kotlin.time.Duration.m23947equalsimpl0(highResolutionOutputSizeshNQ4ISI, kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib())) {
                return null;
            }
            return kotlin.time.Duration.m23940boximpl(highResolutionOutputSizeshNQ4ISI);
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m24014parseIsoStringOrNullFghU774(java.lang.String value) {
            long highResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            highResolutionOutputSizeshNQ4ISI = kotlin.time.DurationKt.getHighResolutionOutputSizeshNQ4ISI(value, true, false);
            if (kotlin.time.Duration.m23947equalsimpl0(highResolutionOutputSizeshNQ4ISI, kotlin.time.Duration.INSTANCE.m24009getINVALIDUwyO8pc$kotlin_stdlib())) {
                return null;
            }
            return kotlin.time.Duration.m23940boximpl(highResolutionOutputSizeshNQ4ISI);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        long m24007fromRawValueUwyO8pc$kotlin_stdlib;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib2;
        m24007fromRawValueUwyO8pc$kotlin_stdlib = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((4611686018427387903L << 1) + 1);
        INFINITE = m24007fromRawValueUwyO8pc$kotlin_stdlib;
        m24007fromRawValueUwyO8pc$kotlin_stdlib2 = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(((-4611686018427387903L) << 1) + 1);
        NEG_INFINITE = m24007fromRawValueUwyO8pc$kotlin_stdlib2;
        INVALID = m23942constructorimpl(INVALID_RAW_VALUE);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m23981unaryMinusUwyO8pc(long j) {
        long m24007fromRawValueUwyO8pc$kotlin_stdlib;
        m24007fromRawValueUwyO8pc$kotlin_stdlib = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(((-(j >> 1)) << 1) + (((int) j) & 1));
        return m24007fromRawValueUwyO8pc$kotlin_stdlib;
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m23966plusLRDsOJo(long j, long j2) {
        long highSpeedVideoSizes;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib;
        long highResolutionOutputSizeshNQ4ISI;
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            if (i == 1) {
                return Camera2StreamConfigurationMap(j >> 1, j2 >> 1);
            }
            return Camera2StreamConfigurationMap(j2 >> 1, j >> 1);
        }
        if (i != 0) {
            highSpeedVideoSizes = kotlin.time.DurationKt.getHighSpeedVideoSizes(j >> 1, j2 >> 1);
            if (highSpeedVideoSizes == INVALID_RAW_VALUE) {
                throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            if (highSpeedVideoSizes != 4611686018427387903L && highSpeedVideoSizes != -4611686018427387903L) {
                highResolutionOutputSizeshNQ4ISI = kotlin.time.DurationKt.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
                return highResolutionOutputSizeshNQ4ISI;
            }
            m24007fromRawValueUwyO8pc$kotlin_stdlib = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((highSpeedVideoSizes << 1) + 1);
            return m24007fromRawValueUwyO8pc$kotlin_stdlib;
        }
        return kotlin.time.DurationKt.access$durationOfNanosNormalized((j >> 1) + (j2 >> 1));
    }

    private static final long Camera2StreamConfigurationMap(long p0, long p1) {
        long highSpeedVideoSizes;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib2;
        long access$nanosToMillis = kotlin.time.DurationKt.access$nanosToMillis(p1);
        highSpeedVideoSizes = kotlin.time.DurationKt.getHighSpeedVideoSizes(p0, access$nanosToMillis);
        if (-4611686018426L <= highSpeedVideoSizes && highSpeedVideoSizes < 4611686018427L) {
            m24007fromRawValueUwyO8pc$kotlin_stdlib2 = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((kotlin.time.DurationKt.access$millisToNanos(highSpeedVideoSizes) + (p1 - kotlin.time.DurationKt.access$millisToNanos(access$nanosToMillis))) << 1);
            return m24007fromRawValueUwyO8pc$kotlin_stdlib2;
        }
        m24007fromRawValueUwyO8pc$kotlin_stdlib = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((highSpeedVideoSizes << 1) + 1);
        return m24007fromRawValueUwyO8pc$kotlin_stdlib;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m23965minusLRDsOJo(long j, long j2) {
        return m23966plusLRDsOJo(j, m23981unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m23968timesUwyO8pc(long j, int i) {
        long m24007fromRawValueUwyO8pc$kotlin_stdlib;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib2;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib3;
        if (m23962isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m23981unaryMinusUwyO8pc(j);
            }
            throw new java.lang.IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long j2 = j >> 1;
        long j3 = i;
        long j4 = j2 * j3;
        if ((((int) j) & 1) != 0) {
            if (j4 / j3 != j2) {
                return kotlin.math.MathKt.getSign(j2) * kotlin.math.MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
            }
            m24007fromRawValueUwyO8pc$kotlin_stdlib = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((kotlin.ranges.RangesKt.coerceIn(j4, new kotlin.ranges.LongRange(-4611686018427387903L, 4611686018427387903L)) << 1) + 1);
            return m24007fromRawValueUwyO8pc$kotlin_stdlib;
        }
        if (-2147483647L <= j2 && j2 < 2147483648L) {
            m24007fromRawValueUwyO8pc$kotlin_stdlib3 = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(j4 << 1);
            return m24007fromRawValueUwyO8pc$kotlin_stdlib3;
        }
        if (j4 / j3 == j2) {
            return kotlin.time.DurationKt.access$durationOfNanosNormalized(j4);
        }
        long access$nanosToMillis = kotlin.time.DurationKt.access$nanosToMillis(j2);
        long j5 = access$nanosToMillis * j3;
        long access$nanosToMillis2 = kotlin.time.DurationKt.access$nanosToMillis((j2 - kotlin.time.DurationKt.access$millisToNanos(access$nanosToMillis)) * j3) + j5;
        if (j5 / j3 != access$nanosToMillis || (access$nanosToMillis2 ^ j5) < 0) {
            return kotlin.math.MathKt.getSign(j2) * kotlin.math.MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        m24007fromRawValueUwyO8pc$kotlin_stdlib2 = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((kotlin.ranges.RangesKt.coerceIn(access$nanosToMillis2, new kotlin.ranges.LongRange(-4611686018427387903L, 4611686018427387903L)) << 1) + 1);
        return m24007fromRawValueUwyO8pc$kotlin_stdlib2;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m23967timesUwyO8pc(long j, double d) {
        int roundToInt = kotlin.math.MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m23968timesUwyO8pc(j, roundToInt);
        }
        kotlin.time.DurationUnit durationUnit = (((int) j) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS;
        return kotlin.time.DurationKt.toDuration(m23973toDoubleimpl(j, durationUnit) * d, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m23945divUwyO8pc(long j, int i) {
        long m24007fromRawValueUwyO8pc$kotlin_stdlib;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib2;
        long m24007fromRawValueUwyO8pc$kotlin_stdlib3;
        if (i == 0) {
            if (m23964isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m23963isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new java.lang.IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if ((((int) j) & 1) != 0) {
            if (m23962isInfiniteimpl(j)) {
                return m23968timesUwyO8pc(j, kotlin.math.MathKt.getSign(i));
            }
            long j2 = j >> 1;
            long j3 = i;
            long j4 = j2 / j3;
            if (-4611686018426L <= j4 && j4 < 4611686018427L) {
                m24007fromRawValueUwyO8pc$kotlin_stdlib2 = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((kotlin.time.DurationKt.access$millisToNanos(j4) + (kotlin.time.DurationKt.access$millisToNanos(j2 - (j4 * j3)) / j3)) << 1);
                return m24007fromRawValueUwyO8pc$kotlin_stdlib2;
            }
            m24007fromRawValueUwyO8pc$kotlin_stdlib = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib((j4 << 1) + 1);
            return m24007fromRawValueUwyO8pc$kotlin_stdlib;
        }
        m24007fromRawValueUwyO8pc$kotlin_stdlib3 = INSTANCE.m24007fromRawValueUwyO8pc$kotlin_stdlib(((j >> 1) / i) << 1);
        return m24007fromRawValueUwyO8pc$kotlin_stdlib3;
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m23944divUwyO8pc(long j, double d) {
        int roundToInt = kotlin.math.MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m23945divUwyO8pc(j, roundToInt);
        }
        kotlin.time.DurationUnit durationUnit = (((int) j) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS;
        return kotlin.time.DurationKt.toDuration(m23973toDoubleimpl(j, durationUnit) / d, durationUnit);
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m23962isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m23961isFiniteimpl(long j) {
        return !m23962isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m23948getAbsoluteValueUwyO8pc(long j) {
        return m23963isNegativeimpl(j) ? m23981unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public final int m23982compareToLRDsOJo(long j) {
        return m23941compareToLRDsOJo(this.getHighResolutionOutputSizeshNQ4ISI, j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m23941compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return kotlin.jvm.internal.Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m23963isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m23972toComponentsimpl(long j, kotlin.jvm.functions.Function5<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> function5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        return function5.invoke(java.lang.Long.valueOf(m23950getInWholeDaysimpl(j)), java.lang.Integer.valueOf(m23949getHoursComponentimpl(j)), java.lang.Integer.valueOf(m23957getMinutesComponentimpl(j)), java.lang.Integer.valueOf(m23959getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m23958getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m23971toComponentsimpl(long j, kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        return function4.invoke(java.lang.Long.valueOf(m23951getInWholeHoursimpl(j)), java.lang.Integer.valueOf(m23957getMinutesComponentimpl(j)), java.lang.Integer.valueOf(m23959getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m23958getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m23970toComponentsimpl(long j, kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return function3.invoke(java.lang.Long.valueOf(m23954getInWholeMinutesimpl(j)), java.lang.Integer.valueOf(m23959getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m23958getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m23969toComponentsimpl(long j, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return function2.invoke(java.lang.Long.valueOf(m23956getInWholeSecondsimpl(j)), java.lang.Integer.valueOf(m23958getNanosecondsComponentimpl(j)));
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m23949getHoursComponentimpl(long j) {
        if (m23962isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m23951getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m23957getMinutesComponentimpl(long j) {
        if (m23962isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m23954getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m23959getSecondsComponentimpl(long j) {
        if (m23962isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m23956getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m23958getNanosecondsComponentimpl(long j) {
        long j2;
        if (m23962isInfiniteimpl(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = kotlin.time.DurationKt.access$millisToNanos((j >> 1) % 1000);
        } else {
            j2 = (j >> 1) % 1000000000;
        }
        return (int) j2;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m23973toDoubleimpl(long j, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return kotlin.time.DurationUnitKt.convertDurationUnit(j >> 1, (((int) j) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS, durationUnit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m23976toLongimpl(long j, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return kotlin.time.DurationUnitKt.convertDurationUnit(j >> 1, (((int) j) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS, durationUnit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m23974toIntimpl(long j, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        return (int) kotlin.ranges.RangesKt.coerceIn(m23976toLongimpl(j, durationUnit), androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask, androidx.collection.SieveCacheKt.NodeLinkMask);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m23950getInWholeDaysimpl(long j) {
        return m23976toLongimpl(j, kotlin.time.DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m23951getInWholeHoursimpl(long j) {
        return m23976toLongimpl(j, kotlin.time.DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m23954getInWholeMinutesimpl(long j) {
        return m23976toLongimpl(j, kotlin.time.DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m23956getInWholeSecondsimpl(long j) {
        return m23976toLongimpl(j, kotlin.time.DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m23953getInWholeMillisecondsimpl(long j) {
        return ((((int) j) & 1) == 1 && m23961isFiniteimpl(j)) ? j >> 1 : m23976toLongimpl(j, kotlin.time.DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m23952getInWholeMicrosecondsimpl(long j) {
        return m23976toLongimpl(j, kotlin.time.DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m23955getInWholeNanosecondsimpl(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return kotlin.time.DurationKt.access$millisToNanos(j2);
    }

    public final java.lang.String toString() {
        return m23977toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23977toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m23963isNegativeimpl = m23963isNegativeimpl(j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (m23963isNegativeimpl) {
            sb.append('-');
        }
        long m23948getAbsoluteValueUwyO8pc = m23948getAbsoluteValueUwyO8pc(j);
        long m23950getInWholeDaysimpl = m23950getInWholeDaysimpl(m23948getAbsoluteValueUwyO8pc);
        int m23949getHoursComponentimpl = m23949getHoursComponentimpl(m23948getAbsoluteValueUwyO8pc);
        int m23957getMinutesComponentimpl = m23957getMinutesComponentimpl(m23948getAbsoluteValueUwyO8pc);
        int m23959getSecondsComponentimpl = m23959getSecondsComponentimpl(m23948getAbsoluteValueUwyO8pc);
        int m23958getNanosecondsComponentimpl = m23958getNanosecondsComponentimpl(m23948getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m23950getInWholeDaysimpl != 0;
        boolean z2 = m23949getHoursComponentimpl != 0;
        boolean z3 = m23957getMinutesComponentimpl != 0;
        boolean z4 = (m23959getSecondsComponentimpl == 0 && m23958getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m23950getInWholeDaysimpl);
            sb.append(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH);
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m23949getHoursComponentimpl);
            sb.append(io.ktor.util.date.GMTDateParser.HOURS);
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m23957getMinutesComponentimpl);
            sb.append(io.ktor.util.date.GMTDateParser.MINUTES);
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (m23959getSecondsComponentimpl != 0 || z || z2 || z3) {
                Camera2StreamConfigurationMap(sb, m23959getSecondsComponentimpl, m23958getNanosecondsComponentimpl, 9, lib.android.paypal.com.magnessdk.g.n2, false);
            } else if (m23958getNanosecondsComponentimpl >= 1000000) {
                Camera2StreamConfigurationMap(sb, m23958getNanosecondsComponentimpl / 1000000, m23958getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m23958getNanosecondsComponentimpl >= 1000) {
                Camera2StreamConfigurationMap(sb, m23958getNanosecondsComponentimpl / 1000, m23958getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m23958getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i++;
        }
        if (m23963isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, int i, int i2, int i3, java.lang.String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            java.lang.String padStart = kotlin.text.StringsKt.padStart(java.lang.String.valueOf(i2), i3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int length = padStart.length() - 1;
            int i4 = -1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((java.lang.CharSequence) padStart, 0, i6);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            } else {
                sb.append((java.lang.CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            }
        }
        sb.append(str);
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23979toStringimpl$default(long j, kotlin.time.DurationUnit durationUnit, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m23978toStringimpl(j, durationUnit, i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m23978toStringimpl(long j, kotlin.time.DurationUnit durationUnit, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("decimals must be not negative, but was ".concat(java.lang.String.valueOf(i)).toString());
        }
        double m23973toDoubleimpl = m23973toDoubleimpl(j, durationUnit);
        if (java.lang.Double.isInfinite(m23973toDoubleimpl)) {
            return java.lang.String.valueOf(m23973toDoubleimpl);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.time.DurationJvmKt.formatToExactDecimals(m23973toDoubleimpl, kotlin.ranges.RangesKt.coerceAtMost(i, 12)));
        sb.append(kotlin.time.DurationUnitKt.shortName(durationUnit));
        return sb.toString();
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m23975toIsoStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (m23963isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m23948getAbsoluteValueUwyO8pc = m23948getAbsoluteValueUwyO8pc(j);
        long m23951getInWholeHoursimpl = m23951getInWholeHoursimpl(m23948getAbsoluteValueUwyO8pc);
        int m23957getMinutesComponentimpl = m23957getMinutesComponentimpl(m23948getAbsoluteValueUwyO8pc);
        int m23959getSecondsComponentimpl = m23959getSecondsComponentimpl(m23948getAbsoluteValueUwyO8pc);
        int m23958getNanosecondsComponentimpl = m23958getNanosecondsComponentimpl(m23948getAbsoluteValueUwyO8pc);
        if (m23962isInfiniteimpl(j)) {
            m23951getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = m23951getInWholeHoursimpl != 0;
        boolean z3 = (m23959getSecondsComponentimpl == 0 && m23958getNanosecondsComponentimpl == 0) ? false : true;
        if (m23957getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(m23951getInWholeHoursimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(m23957getMinutesComponentimpl);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
        }
        if (z3 || (!z2 && !z)) {
            Camera2StreamConfigurationMap(sb, m23959getSecondsComponentimpl, m23958getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb.toString();
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m23943divLRDsOJo(long j, long j2) {
        kotlin.time.DurationUnit durationUnit = (kotlin.time.DurationUnit) kotlin.comparisons.ComparisonsKt.maxOf((((int) j) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS, (((int) j2) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS);
        return m23973toDoubleimpl(j, durationUnit) / m23973toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m23980truncateToUwyO8pc$kotlin_stdlib(long j, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        kotlin.time.DurationUnit durationUnit2 = (((int) j) & 1) == 0 ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) <= 0 || m23962isInfiniteimpl(j)) {
            return j;
        }
        long j2 = j >> 1;
        return kotlin.time.DurationKt.toDuration(j2 - (j2 % kotlin.time.DurationUnitKt.convertDurationUnit(1L, durationUnit, durationUnit2)), durationUnit2);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m23960hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m23946equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23960hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23946equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof kotlin.time.Duration) && j == ((kotlin.time.Duration) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m23940boximpl(long j) {
        return new kotlin.time.Duration(j);
    }
}
