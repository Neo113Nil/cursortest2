package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u000b\u0010\t\u001a\u0019\u0010\u000e\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u000e\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0014\u001a\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0016\u001a\u00020!H\u0086\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0016\u001a\u00020!H\u0086\u0002¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010)\u001a\u00020\u0000*\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0086\u0004¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020\u0000*\u00020\u00012\u0006\u0010&\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010)\u001a\u00020\u0004*\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010)\u001a\u00020\u0000*\u00020!2\u0006\u0010&\u001a\u00020!H\u0086\u0004¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b0\u00101\u001a\u0011\u00100\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b0\u00102\u001a\u001c\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0086\u0004¢\u0006\u0004\b4\u00105\u001a\u001c\u00104\u001a\u00020\u0004*\u00020\u00042\u0006\u00104\u001a\u000206H\u0086\u0004¢\u0006\u0004\b4\u00107\u001a\u001c\u0010:\u001a\u00020\f*\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0086\u0004¢\u0006\u0004\b8\u00109\u001a\u001c\u0010:\u001a\u00020\f*\u00020\u00012\u0006\u0010&\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010:\u001a\u00020\u0010*\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b=\u0010>\u001a\u001c\u0010:\u001a\u00020\f*\u00020!2\u0006\u0010&\u001a\u00020!H\u0086\u0004¢\u0006\u0004\b?\u0010@\u001a\u0019\u0010D\u001a\u00020\u0001*\u00020\u00012\u0006\u0010A\u001a\u00020\u0001¢\u0006\u0004\bB\u0010C\u001a\u0019\u0010D\u001a\u00020\u0005*\u00020\u00052\u0006\u0010A\u001a\u00020\u0005¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010D\u001a\u00020\u0015*\u00020\u00152\u0006\u0010A\u001a\u00020\u0015¢\u0006\u0004\bG\u0010H\u001a\u0019\u0010D\u001a\u00020!*\u00020!2\u0006\u0010A\u001a\u00020!¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010M\u001a\u00020\u0001*\u00020\u00012\u0006\u0010K\u001a\u00020\u0001¢\u0006\u0004\bL\u0010C\u001a\u0019\u0010M\u001a\u00020\u0005*\u00020\u00052\u0006\u0010K\u001a\u00020\u0005¢\u0006\u0004\bN\u0010F\u001a\u0019\u0010M\u001a\u00020\u0015*\u00020\u00152\u0006\u0010K\u001a\u00020\u0015¢\u0006\u0004\bO\u0010H\u001a\u0019\u0010M\u001a\u00020!*\u00020!2\u0006\u0010K\u001a\u00020!¢\u0006\u0004\bP\u0010J\u001a!\u0010S\u001a\u00020\u0001*\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0001¢\u0006\u0004\bQ\u0010R\u001a!\u0010S\u001a\u00020\u0005*\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0005¢\u0006\u0004\bT\u0010U\u001a!\u0010S\u001a\u00020\u0015*\u00020\u00152\u0006\u0010A\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u0015¢\u0006\u0004\bV\u0010W\u001a!\u0010S\u001a\u00020!*\u00020!2\u0006\u0010A\u001a\u00020!2\u0006\u0010K\u001a\u00020!¢\u0006\u0004\bX\u0010Y\u001a\u001f\u0010S\u001a\u00020\u0001*\u00020\u00012\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010Z¢\u0006\u0004\b\\\u0010]\u001a\u001f\u0010S\u001a\u00020\u0005*\u00020\u00052\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00050Z¢\u0006\u0004\b^\u0010_"}, d2 = {"Lkotlin/ranges/UIntProgression;", "Lkotlin/UInt;", "first", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ULong;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "(Lkotlin/ranges/UIntProgression;)Lkotlin/UInt;", "(Lkotlin/ranges/ULongProgression;)Lkotlin/ULong;", "last", "lastOrNull", "Lkotlin/ranges/UIntRange;", "Lkotlin/random/Random;", "random", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)Lkotlin/UInt;", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)Lkotlin/ULong;", "Lkotlin/UByte;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "(Lkotlin/ranges/UIntProgression;)Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/ULongProgression;)Lkotlin/ranges/ULongProgression;", "", "step", "(Lkotlin/ranges/UIntProgression;I)Lkotlin/ranges/UIntProgression;", "", "(Lkotlin/ranges/ULongProgression;J)Lkotlin/ranges/ULongProgression;", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "minimumValue", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "maximumValue", "coerceAtMost-J1ME1BU", "coerceAtMost", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "coerceIn-WZ9TVnA", "(III)I", "coerceIn", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "Lkotlin/ranges/ClosedRange;", "range", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes17.dex */
class URangesKt___URangesKt {
    public static final int first(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(uIntProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return uIntProgression.getFirst();
    }

    public static final long first(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(uLongProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return uLongProgression.getFirst();
    }

    public static final kotlin.UInt firstOrNull(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return kotlin.UInt.m23469boximpl(uIntProgression.getFirst());
    }

    public static final kotlin.ULong firstOrNull(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return kotlin.ULong.m23493boximpl(uLongProgression.getFirst());
    }

    public static final int last(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(uIntProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return uIntProgression.getLast();
    }

    public static final long last(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(uLongProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return uLongProgression.getLast();
    }

    public static final kotlin.UInt lastOrNull(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return kotlin.UInt.m23469boximpl(uIntProgression.getLast());
    }

    public static final kotlin.ULong lastOrNull(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return kotlin.ULong.m23493boximpl(uLongProgression.getLast());
    }

    public static final int random(kotlin.ranges.UIntRange uIntRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        try {
            return kotlin.random.URandomKt.nextUInt(random, uIntRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(kotlin.ranges.ULongRange uLongRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        try {
            return kotlin.random.URandomKt.nextULong(random, uLongRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange uIntRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return kotlin.UInt.m23469boximpl(kotlin.random.URandomKt.nextUInt(random, uIntRange));
    }

    public static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange uLongRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return kotlin.ULong.m23493boximpl(kotlin.random.URandomKt.nextULong(random, uLongRange));
    }

    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m23873contains68kG9v0(kotlin.ranges.UIntRange uIntRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "");
        return uIntRange.m23847containsWZ4Q5Ns(kotlin.UInt.m23470constructorimpl(b & 255));
    }

    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m23875containsULbyJY(kotlin.ranges.ULongRange uLongRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLongRange.m23855containsVKZWuLQ(kotlin.ULong.m23494constructorimpl(b & 255));
    }

    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m23874containsGab390E(kotlin.ranges.ULongRange uLongRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLongRange.m23855containsVKZWuLQ(kotlin.ULong.m23494constructorimpl(i & 4294967295L));
    }

    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m23877containsfz5IDCE(kotlin.ranges.UIntRange uIntRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "");
        return kotlin.ULong.m23494constructorimpl(j >>> 32) == 0 && uIntRange.m23847containsWZ4Q5Ns(kotlin.UInt.m23470constructorimpl((int) j));
    }

    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m23876containsZsK3CEQ(kotlin.ranges.UIntRange uIntRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "");
        return uIntRange.m23847containsWZ4Q5Ns(kotlin.UInt.m23470constructorimpl(s & kotlin.UShort.MAX_VALUE));
    }

    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m23878containsuhHAxoY(kotlin.ranges.ULongRange uLongRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLongRange.m23855containsVKZWuLQ(kotlin.ULong.m23494constructorimpl(s & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m23881downToKr8caGY(byte b, byte b2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m23845fromClosedRangeNkh28Cs(kotlin.UInt.m23470constructorimpl(b & 255), kotlin.UInt.m23470constructorimpl(b2 & 255), -1);
    }

    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m23880downToJ1ME1BU(int i, int i2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m23845fromClosedRangeNkh28Cs(i, i2, -1);
    }

    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongProgression m23882downToeb3DHEI(long j, long j2) {
        return kotlin.ranges.ULongProgression.INSTANCE.m23853fromClosedRange7ftBX0g(j, j2, -1L);
    }

    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m23879downTo5PvTz6A(short s, short s2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m23845fromClosedRangeNkh28Cs(kotlin.UInt.m23470constructorimpl(s & kotlin.UShort.MAX_VALUE), kotlin.UInt.m23470constructorimpl(s2 & kotlin.UShort.MAX_VALUE), -1);
    }

    public static final kotlin.ranges.UIntProgression reversed(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "");
        return kotlin.ranges.UIntProgression.INSTANCE.m23845fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    public static final kotlin.ranges.ULongProgression reversed(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "");
        return kotlin.ranges.ULongProgression.INSTANCE.m23853fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    public static final kotlin.ranges.UIntProgression step(kotlin.ranges.UIntProgression uIntProgression, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.UIntProgression.Companion companion = kotlin.ranges.UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.m23845fromClosedRangeNkh28Cs(first, last, i);
    }

    public static final kotlin.ranges.ULongProgression step(kotlin.ranges.ULongProgression uLongProgression, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "");
        kotlin.ranges.RangesKt.checkStepIsPositive(j > 0, java.lang.Long.valueOf(j));
        kotlin.ranges.ULongProgression.Companion companion = kotlin.ranges.ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.m23853fromClosedRange7ftBX0g(first, last, j);
    }

    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m23885untilKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b2 & 255, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(kotlin.UInt.m23470constructorimpl(b & 255), kotlin.UInt.m23470constructorimpl(kotlin.UInt.m23470constructorimpl(r3) - 1), null);
    }

    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m23884untilJ1ME1BU(int i, int i2) {
        return java.lang.Integer.compareUnsigned(i2, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(i, kotlin.UInt.m23470constructorimpl(i2 - 1), null);
    }

    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongRange m23886untileb3DHEI(long j, long j2) {
        return java.lang.Long.compareUnsigned(j2, 0L) <= 0 ? kotlin.ranges.ULongRange.INSTANCE.getEMPTY() : new kotlin.ranges.ULongRange(j, kotlin.ULong.m23494constructorimpl(j2 - kotlin.ULong.m23494constructorimpl(1L)), null);
    }

    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m23883until5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s2 & kotlin.UShort.MAX_VALUE, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(kotlin.UInt.m23470constructorimpl(s & kotlin.UShort.MAX_VALUE), kotlin.UInt.m23470constructorimpl(kotlin.UInt.m23470constructorimpl(r3) - 1), null);
    }

    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m23860coerceAtLeastJ1ME1BU(int i, int i2) {
        return java.lang.Integer.compareUnsigned(i, i2) < 0 ? i2 : i;
    }

    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m23862coerceAtLeasteb3DHEI(long j, long j2) {
        return java.lang.Long.compareUnsigned(j, j2) < 0 ? j2 : j;
    }

    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m23861coerceAtLeastKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m23859coerceAtLeast5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & kotlin.UShort.MAX_VALUE, 65535 & s2) < 0 ? s2 : s;
    }

    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m23864coerceAtMostJ1ME1BU(int i, int i2) {
        return java.lang.Integer.compareUnsigned(i, i2) > 0 ? i2 : i;
    }

    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m23866coerceAtMosteb3DHEI(long j, long j2) {
        return java.lang.Long.compareUnsigned(j, j2) > 0 ? j2 : j;
    }

    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m23865coerceAtMostKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m23863coerceAtMost5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & kotlin.UShort.MAX_VALUE, 65535 & s2) > 0 ? s2 : s;
    }

    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m23869coerceInWZ9TVnA(int i, int i2, int i3) {
        if (java.lang.Integer.compareUnsigned(i2, i3) <= 0) {
            return java.lang.Integer.compareUnsigned(i, i2) < 0 ? i2 : java.lang.Integer.compareUnsigned(i, i3) > 0 ? i3 : i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(i3));
        sb.append(" is less than minimum ");
        sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(i2));
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m23871coerceInsambcqE(long j, long j2, long j3) {
        if (java.lang.Long.compareUnsigned(j2, j3) <= 0) {
            return java.lang.Long.compareUnsigned(j, j2) < 0 ? j2 : java.lang.Long.compareUnsigned(j, j3) > 0 ? j3 : j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((java.lang.Object) kotlin.ULong.m23498toStringimpl(j3));
        sb.append(" is less than minimum ");
        sb.append((java.lang.Object) kotlin.ULong.m23498toStringimpl(j2));
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m23870coerceInb33U2AM(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (kotlin.jvm.internal.Intrinsics.compare(i, i2) <= 0) {
            int i3 = b & 255;
            return kotlin.jvm.internal.Intrinsics.compare(i3, i) < 0 ? b2 : kotlin.jvm.internal.Intrinsics.compare(i3, i2) > 0 ? b3 : b;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((java.lang.Object) kotlin.UByte.m23450toStringimpl(b3));
        sb.append(" is less than minimum ");
        sb.append((java.lang.Object) kotlin.UByte.m23450toStringimpl(b2));
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m23868coerceInVKSA0NQ(short s, short s2, short s3) {
        int i = s2 & kotlin.UShort.MAX_VALUE;
        int i2 = s3 & kotlin.UShort.MAX_VALUE;
        if (kotlin.jvm.internal.Intrinsics.compare(i, i2) <= 0) {
            int i3 = 65535 & s;
            return kotlin.jvm.internal.Intrinsics.compare(i3, i) < 0 ? s2 : kotlin.jvm.internal.Intrinsics.compare(i3, i2) > 0 ? s3 : s;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((java.lang.Object) kotlin.UShort.m23522toStringimpl(s3));
        sb.append(" is less than minimum ");
        sb.append((java.lang.Object) kotlin.UShort.m23522toStringimpl(s2));
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m23872coerceInwuiCnnA(int i, kotlin.ranges.ClosedRange<kotlin.UInt> closedRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((kotlin.UInt) kotlin.ranges.RangesKt.coerceIn(kotlin.UInt.m23469boximpl(i), (kotlin.ranges.ClosedFloatingPointRange<kotlin.UInt>) closedRange)).getCamera2StreamConfigurationMap();
        }
        if (!closedRange.isEmpty()) {
            return java.lang.Integer.compareUnsigned(i, closedRange.getStart().getCamera2StreamConfigurationMap()) < 0 ? closedRange.getStart().getCamera2StreamConfigurationMap() : java.lang.Integer.compareUnsigned(i, closedRange.getEndInclusive().getCamera2StreamConfigurationMap()) > 0 ? closedRange.getEndInclusive().getCamera2StreamConfigurationMap() : i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m23867coerceInJPwROB0(long j, kotlin.ranges.ClosedRange<kotlin.ULong> closedRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((kotlin.ULong) kotlin.ranges.RangesKt.coerceIn(kotlin.ULong.m23493boximpl(j), (kotlin.ranges.ClosedFloatingPointRange<kotlin.ULong>) closedRange)).getGetHighSpeedVideoFpsRanges();
        }
        if (!closedRange.isEmpty()) {
            return java.lang.Long.compareUnsigned(j, closedRange.getStart().getGetHighSpeedVideoFpsRanges()) < 0 ? closedRange.getStart().getGetHighSpeedVideoFpsRanges() : java.lang.Long.compareUnsigned(j, closedRange.getEndInclusive().getGetHighSpeedVideoFpsRanges()) > 0 ? closedRange.getEndInclusive().getGetHighSpeedVideoFpsRanges() : j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
