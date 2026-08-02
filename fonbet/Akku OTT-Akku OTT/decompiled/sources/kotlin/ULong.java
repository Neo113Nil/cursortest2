package kotlin;

import androidx.collection.f;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\bA\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\u008a\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0087\u008a\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0087\u008a\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\u008a\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\u008a\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\u008a\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\u008a\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\u008a\u0004¢\u0006\u0004\b \u0010\u0018J\u0019\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\u008a\u0004¢\u0006\u0004\b!\u0010\u001aJ\u0019\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\u008a\u0004¢\u0006\u0004\b\"\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\b#\u0010\u001eJ\u0019\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\u008a\u0004¢\u0006\u0004\b%\u0010\u0018J\u0019\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\u008a\u0004¢\u0006\u0004\b&\u0010\u001aJ\u0019\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\u008a\u0004¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\b(\u0010\u001eJ\u0019\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\u008a\u0004¢\u0006\u0004\b*\u0010\u0018J\u0019\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\u008a\u0004¢\u0006\u0004\b+\u0010\u001aJ\u0019\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\u008a\u0004¢\u0006\u0004\b,\u0010\u001cJ\u0019\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\b-\u0010\u001eJ\u0019\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\u008a\u0004¢\u0006\u0004\b/\u0010\u0018J\u0019\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\u008a\u0004¢\u0006\u0004\b0\u0010\u001aJ\u0019\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\u008a\u0004¢\u0006\u0004\b1\u0010\u001cJ\u0019\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\b2\u0010\u001eJ\u0019\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\u0088\u0004¢\u0006\u0004\b4\u0010\u0018J\u0019\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\u0088\u0004¢\u0006\u0004\b5\u0010\u001aJ\u0019\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\u0088\u0004¢\u0006\u0004\b6\u0010\u001cJ\u0019\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u0088\u0004¢\u0006\u0004\b7\u0010\u001eJ\u0019\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\u0088\u0004¢\u0006\u0004\b9\u0010:J\u0019\u00108\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0087\u0088\u0004¢\u0006\u0004\b;\u0010<J\u0019\u00108\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0087\u0088\u0004¢\u0006\u0004\b=\u0010\u0013J\u0019\u00108\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u0088\u0004¢\u0006\u0004\b>\u0010\u001eJ\u0011\u0010?\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\b@\u0010\u0005J\u0011\u0010A\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\bB\u0010\u0005J\u0019\u0010C\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008a\u0004¢\u0006\u0004\bH\u0010FJ\u0019\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\u008c\u0004¢\u0006\u0004\bK\u0010\u001cJ\u0019\u0010L\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\u008c\u0004¢\u0006\u0004\bM\u0010\u001cJ\u0019\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008c\u0004¢\u0006\u0004\bO\u0010\u001eJ\u0019\u0010P\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008c\u0004¢\u0006\u0004\bQ\u0010\u001eJ\u0019\u0010R\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\u008c\u0004¢\u0006\u0004\bS\u0010\u001eJ\u0011\u0010T\u001a\u00020\u0000H\u0087\u0088\u0004¢\u0006\u0004\bU\u0010\u0005J\u0011\u0010V\u001a\u00020WH\u0087\u0088\u0004¢\u0006\u0004\bX\u0010YJ\u0011\u0010Z\u001a\u00020[H\u0087\u0088\u0004¢\u0006\u0004\b\\\u0010]J\u0011\u0010^\u001a\u00020\tH\u0087\u0088\u0004¢\u0006\u0004\b_\u0010`J\u0011\u0010a\u001a\u00020\u0003H\u0087\u0088\u0004¢\u0006\u0004\bb\u0010\u0005J\u0011\u0010c\u001a\u00020\u000bH\u0087\u0088\u0004¢\u0006\u0004\bd\u0010YJ\u0011\u0010e\u001a\u00020\u000eH\u0087\u0088\u0004¢\u0006\u0004\bf\u0010]J\u0011\u0010g\u001a\u00020\u0011H\u0087\u0088\u0004¢\u0006\u0004\bh\u0010`J\u0011\u0010i\u001a\u00020\u0000H\u0087\u0088\u0004¢\u0006\u0004\bj\u0010\u0005J\u0011\u0010k\u001a\u00020lH\u0087\u0088\u0004¢\u0006\u0004\bm\u0010nJ\u0011\u0010o\u001a\u00020pH\u0087\u0088\u0004¢\u0006\u0004\bq\u0010rJ\u0011\u0010s\u001a\u00020tH\u0097\u0080\u0004¢\u0006\u0004\bu\u0010vJ\u0014\u0010w\u001a\u00020x2\b\u0010\n\u001a\u0004\u0018\u00010yHÖ\u0083\u0004J\n\u0010z\u001a\u00020\tHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0084\b¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006|"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "plus", "plus-7apg3OU", "(JB)J", "plus-xj2QHRw", "(JS)J", "plus-WZ4Q5Ns", "(JI)J", "plus-VKZWuLQ", "(JJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(JB)B", "mod-xj2QHRw", "(JS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-s-VKNKU", "dec", "dec-s-VKNKU", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "and", "and-VKZWuLQ", "or", "or-VKZWuLQ", "xor", "xor-VKZWuLQ", "inv", "inv-s-VKNKU", "toByte", "", "toByte-impl", "(J)B", "toShort", "", "toShort-impl", "(J)S", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(J)F", "toDouble", "", "toDouble-impl", "(J)D", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005X\u0086Ô\b¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0005X\u0086Ô\b¢\u0006\u0004\n\u0002\u0010\u0006R\u000f\u0010\b\u001a\u00020\tX\u0086Ô\b¢\u0006\u0002\n\u0000R\u000f\u0010\n\u001a\u00020\tX\u0086Ô\b¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/ULong$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/ULong;", "J", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m1883andVKZWuLQ(long j, long j2) {
        return m1890constructorimpl(j & j2);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m1884boximpl(long j) {
        return new ULong(j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1885compareTo7apg3OU(long j, byte b) {
        return Long.compare(j ^ Long.MIN_VALUE, m1890constructorimpl(b & 255) ^ Long.MIN_VALUE);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m1886compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(getData(), j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1888compareToWZ4Q5Ns(long j, int i) {
        return Long.compare(j ^ Long.MIN_VALUE, m1890constructorimpl(i & KeyboardMap.kValueMask) ^ Long.MIN_VALUE);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m1889compareToxj2QHRw(long j, short s) {
        return Long.compare(j ^ Long.MIN_VALUE, m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1890constructorimpl(long j) {
        return j;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m1891decsVKNKU(long j) {
        return m1890constructorimpl(j - 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m1892div7apg3OU(long j, byte b) {
        long m1890constructorimpl = m1890constructorimpl(b & 255);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / m1890constructorimpl;
        }
        long j2 = ((j >>> 1) / m1890constructorimpl) << 1;
        return j2 + (((j - (j2 * m1890constructorimpl)) ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1893divVKZWuLQ(long j, long j2) {
        return UnsignedKt.m2069ulongDivideeb3DHEI(j, j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m1894divWZ4Q5Ns(long j, int i) {
        long m1890constructorimpl = m1890constructorimpl(i & KeyboardMap.kValueMask);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / m1890constructorimpl;
        }
        long j2 = ((j >>> 1) / m1890constructorimpl) << 1;
        return j2 + (((j - (j2 * m1890constructorimpl)) ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m1895divxj2QHRw(long j, short s) {
        long m1890constructorimpl = m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / m1890constructorimpl;
        }
        long j2 = ((j >>> 1) / m1890constructorimpl) << 1;
        return j2 + (((j - (j2 * m1890constructorimpl)) ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1896equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1897equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m1898floorDiv7apg3OU(long j, byte b) {
        long m1890constructorimpl = m1890constructorimpl(b & 255);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / m1890constructorimpl;
        }
        long j2 = ((j >>> 1) / m1890constructorimpl) << 1;
        return j2 + (((j - (j2 * m1890constructorimpl)) ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1899floorDivVKZWuLQ(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m1900floorDivWZ4Q5Ns(long j, int i) {
        long m1890constructorimpl = m1890constructorimpl(i & KeyboardMap.kValueMask);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / m1890constructorimpl;
        }
        long j2 = ((j >>> 1) / m1890constructorimpl) << 1;
        return j2 + (((j - (j2 * m1890constructorimpl)) ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m1901floorDivxj2QHRw(long j, short s) {
        long m1890constructorimpl = m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / m1890constructorimpl;
        }
        long j2 = ((j >>> 1) / m1890constructorimpl) << 1;
        return j2 + (((j - (j2 * m1890constructorimpl)) ^ Long.MIN_VALUE) < (m1890constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1902hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m1903incsVKNKU(long j) {
        return m1890constructorimpl(j + 1);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m1904invsVKNKU(long j) {
        return m1890constructorimpl(~j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m1905minus7apg3OU(long j, byte b) {
        return m1890constructorimpl(j - m1890constructorimpl(b & 255));
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1906minusVKZWuLQ(long j, long j2) {
        return m1890constructorimpl(j - j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1907minusWZ4Q5Ns(long j, int i) {
        return m1890constructorimpl(j - m1890constructorimpl(i & KeyboardMap.kValueMask));
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m1908minusxj2QHRw(long j, short s) {
        return m1890constructorimpl(j - m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L15;
     */
    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final byte m1909mod7apg3OU(long j, byte b) {
        long m1890constructorimpl = m1890constructorimpl(b & 255);
        if (m1890constructorimpl >= 0) {
            if (j >= 0) {
                j %= m1890constructorimpl;
            } else {
                j -= (((j >>> 1) / m1890constructorimpl) << 1) * m1890constructorimpl;
                if ((j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl)) {
                    m1890constructorimpl = 0;
                }
                j -= m1890constructorimpl;
            }
        }
        return UByte.m1734constructorimpl((byte) j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1910modVKZWuLQ(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L15;
     */
    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m1911modWZ4Q5Ns(long j, int i) {
        long m1890constructorimpl = m1890constructorimpl(i & KeyboardMap.kValueMask);
        if (m1890constructorimpl >= 0) {
            if (j >= 0) {
                j %= m1890constructorimpl;
            } else {
                j -= (((j >>> 1) / m1890constructorimpl) << 1) * m1890constructorimpl;
                if ((j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl)) {
                    m1890constructorimpl = 0;
                }
                j -= m1890constructorimpl;
            }
        }
        return UInt.m1811constructorimpl((int) j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L15;
     */
    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final short m1912modxj2QHRw(long j, short s) {
        long m1890constructorimpl = m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m1890constructorimpl >= 0) {
            if (j >= 0) {
                j %= m1890constructorimpl;
            } else {
                j -= (((j >>> 1) / m1890constructorimpl) << 1) * m1890constructorimpl;
                if ((j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl)) {
                    m1890constructorimpl = 0;
                }
                j -= m1890constructorimpl;
            }
        }
        return UShort.m1997constructorimpl((short) j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m1913orVKZWuLQ(long j, long j2) {
        return m1890constructorimpl(j | j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m1914plus7apg3OU(long j, byte b) {
        return m1890constructorimpl(m1890constructorimpl(b & 255) + j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1915plusVKZWuLQ(long j, long j2) {
        return m1890constructorimpl(j + j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1916plusWZ4Q5Ns(long j, int i) {
        return m1890constructorimpl(m1890constructorimpl(i & KeyboardMap.kValueMask) + j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m1917plusxj2QHRw(long j, short s) {
        return m1890constructorimpl(m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m1918rangeToVKZWuLQ(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m1919rangeUntilVKZWuLQ(long j, long j2) {
        return URangesKt.m2989untileb3DHEI(j, j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m1920rem7apg3OU(long j, byte b) {
        long m1890constructorimpl = m1890constructorimpl(b & 255);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl) ? j : j - m1890constructorimpl;
        }
        if (j >= 0) {
            return j % m1890constructorimpl;
        }
        long j2 = j - ((((j >>> 1) / m1890constructorimpl) << 1) * m1890constructorimpl);
        if ((j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl)) {
            m1890constructorimpl = 0;
        }
        return j2 - m1890constructorimpl;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1921remVKZWuLQ(long j, long j2) {
        return UnsignedKt.m2070ulongRemaindereb3DHEI(j, j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m1922remWZ4Q5Ns(long j, int i) {
        long m1890constructorimpl = m1890constructorimpl(i & KeyboardMap.kValueMask);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl) ? j : j - m1890constructorimpl;
        }
        if (j >= 0) {
            return j % m1890constructorimpl;
        }
        long j2 = j - ((((j >>> 1) / m1890constructorimpl) << 1) * m1890constructorimpl);
        if ((j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl)) {
            m1890constructorimpl = 0;
        }
        return j2 - m1890constructorimpl;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m1923remxj2QHRw(long j, short s) {
        long m1890constructorimpl = m1890constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m1890constructorimpl < 0) {
            return (j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl) ? j : j - m1890constructorimpl;
        }
        if (j >= 0) {
            return j % m1890constructorimpl;
        }
        long j2 = j - ((((j >>> 1) / m1890constructorimpl) << 1) * m1890constructorimpl);
        if ((j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m1890constructorimpl)) {
            m1890constructorimpl = 0;
        }
        return j2 - m1890constructorimpl;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m1924shlsVKNKU(long j, int i) {
        return m1890constructorimpl(j << i);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m1925shrsVKNKU(long j, int i) {
        return m1890constructorimpl(j >>> i);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m1926times7apg3OU(long j, byte b) {
        return f.a(b & 255, j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1927timesVKZWuLQ(long j, long j2) {
        return m1890constructorimpl(j * j2);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m1928timesWZ4Q5Ns(long j, int i) {
        return f.a(i & KeyboardMap.kValueMask, j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m1929timesxj2QHRw(long j, short s) {
        return f.a(s & WebSocketProtocol.PAYLOAD_SHORT_MAX, j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1930toByteimpl(long j) {
        return (byte) j;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1931toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1932toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1933toIntimpl(long j) {
        return (int) j;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1934toLongimpl(long j) {
        return j;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1935toShortimpl(long j) {
        return (short) j;
    }

    @IntrinsicConstEvaluation
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1936toStringimpl(long j) {
        return UnsignedKt.ulongToString(j, 10);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1937toUBytew2LRezQ(long j) {
        return UByte.m1734constructorimpl((byte) j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1938toUIntpVg5ArA(long j) {
        return UInt.m1811constructorimpl((int) j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1939toULongsVKNKU(long j) {
        return j;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1940toUShortMh2AYeg(long j) {
        return UShort.m1997constructorimpl((short) j);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m1941xorVKZWuLQ(long j, long j2) {
        return m1890constructorimpl(j ^ j2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object other) {
        return m1896equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m1902hashCodeimpl(this.data);
    }

    @IntrinsicConstEvaluation
    public String toString() {
        return m1936toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m1887compareToVKZWuLQ(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }
}
