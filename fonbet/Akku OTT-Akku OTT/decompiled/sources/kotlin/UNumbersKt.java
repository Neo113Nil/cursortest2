package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\u0088\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\u0088\u0004¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0087\u0088\u0004¢\u0006\u0004\b\b\u0010\u0004\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\u0088\u0004¢\u0006\u0004\b\n\u0010\u0004\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0087\u0088\u0004¢\u0006\u0004\b\f\u0010\u0004\u001a\u001d\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0013H\u0087\u0088\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u0013H\u0087\u0088\u0004¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u0013H\u0087\u0088\u0004¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0015\u0010\t\u001a\u00020\u0013*\u00020\u0013H\u0087\u0088\u0004¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u000b\u001a\u00020\u0013*\u00020\u0013H\u0087\u0088\u0004¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001d\u0010\r\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u0011\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u001eH\u0087\u0088\u0004¢\u0006\u0004\b\u001f\u0010 \u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u001eH\u0087\u0088\u0004¢\u0006\u0004\b!\u0010 \u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u001eH\u0087\u0088\u0004¢\u0006\u0004\b\"\u0010 \u001a\u0015\u0010\t\u001a\u00020\u001e*\u00020\u001eH\u0087\u0088\u0004¢\u0006\u0004\b#\u0010$\u001a\u0015\u0010\u000b\u001a\u00020\u001e*\u00020\u001eH\u0087\u0088\u0004¢\u0006\u0004\b%\u0010$\u001a\u001d\u0010\r\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010\u0011\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b(\u0010'\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020)H\u0087\u0088\u0004¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020)H\u0087\u0088\u0004¢\u0006\u0004\b,\u0010+\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020)H\u0087\u0088\u0004¢\u0006\u0004\b-\u0010+\u001a\u0015\u0010\t\u001a\u00020)*\u00020)H\u0087\u0088\u0004¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010\u000b\u001a\u00020)*\u00020)H\u0087\u0088\u0004¢\u0006\u0004\b0\u0010/\u001a\u001d\u0010\r\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b1\u00102\u001a\u001d\u0010\u0011\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\u0088\u0004¢\u0006\u0004\b3\u00102¨\u00064"}, d2 = {"countOneBits", "", "Lkotlin/UInt;", "countOneBits-WZ4Q5Ns", "(I)I", "countLeadingZeroBits", "countLeadingZeroBits-WZ4Q5Ns", "countTrailingZeroBits", "countTrailingZeroBits-WZ4Q5Ns", "takeHighestOneBit", "takeHighestOneBit-WZ4Q5Ns", "takeLowestOneBit", "takeLowestOneBit-WZ4Q5Ns", "rotateLeft", "bitCount", "rotateLeft-V7xB4Y4", "(II)I", "rotateRight", "rotateRight-V7xB4Y4", "Lkotlin/ULong;", "countOneBits-VKZWuLQ", "(J)I", "countLeadingZeroBits-VKZWuLQ", "countTrailingZeroBits-VKZWuLQ", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeLowestOneBit-VKZWuLQ", "rotateLeft-JSWoG40", "(JI)J", "rotateRight-JSWoG40", "Lkotlin/UByte;", "countOneBits-7apg3OU", "(B)I", "countLeadingZeroBits-7apg3OU", "countTrailingZeroBits-7apg3OU", "takeHighestOneBit-7apg3OU", "(B)B", "takeLowestOneBit-7apg3OU", "rotateLeft-LxnNnR4", "(BI)B", "rotateRight-LxnNnR4", "Lkotlin/UShort;", "countOneBits-xj2QHRw", "(S)I", "countLeadingZeroBits-xj2QHRw", "countTrailingZeroBits-xj2QHRw", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit-xj2QHRw", "rotateLeft-olVBNx4", "(SI)S", "rotateRight-olVBNx4", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
@JvmName(name = "UNumbersKt")
/* loaded from: classes3.dex */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m1962countLeadingZeroBits7apg3OU(byte b) {
        return Integer.numberOfLeadingZeros(b & UByte.MAX_VALUE) - 24;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m1963countLeadingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m1964countLeadingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m1965countLeadingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m1966countOneBits7apg3OU(byte b) {
        return Integer.bitCount(UInt.m1811constructorimpl(b & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m1967countOneBitsVKZWuLQ(long j) {
        return Long.bitCount(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m1968countOneBitsWZ4Q5Ns(int i) {
        return Integer.bitCount(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m1969countOneBitsxj2QHRw(short s) {
        return Integer.bitCount(UInt.m1811constructorimpl(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m1970countTrailingZeroBits7apg3OU(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m1971countTrailingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m1972countTrailingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m1973countTrailingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m1974rotateLeftJSWoG40(long j, int i) {
        return ULong.m1890constructorimpl(Long.rotateLeft(j, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m1975rotateLeftLxnNnR4(byte b, int i) {
        return UByte.m1734constructorimpl(NumbersKt__NumbersKt.rotateLeft(b, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m1976rotateLeftV7xB4Y4(int i, int i2) {
        return UInt.m1811constructorimpl(Integer.rotateLeft(i, i2));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m1977rotateLeftolVBNx4(short s, int i) {
        return UShort.m1997constructorimpl(NumbersKt__NumbersKt.rotateLeft(s, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m1978rotateRightJSWoG40(long j, int i) {
        return ULong.m1890constructorimpl(Long.rotateRight(j, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m1979rotateRightLxnNnR4(byte b, int i) {
        return UByte.m1734constructorimpl(NumbersKt__NumbersKt.rotateRight(b, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m1980rotateRightV7xB4Y4(int i, int i2) {
        return UInt.m1811constructorimpl(Integer.rotateRight(i, i2));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m1981rotateRightolVBNx4(short s, int i) {
        return UShort.m1997constructorimpl(NumbersKt__NumbersKt.rotateRight(s, i));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m1982takeHighestOneBit7apg3OU(byte b) {
        return UByte.m1734constructorimpl((byte) Integer.highestOneBit(b & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m1983takeHighestOneBitVKZWuLQ(long j) {
        return ULong.m1890constructorimpl(Long.highestOneBit(j));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m1984takeHighestOneBitWZ4Q5Ns(int i) {
        return UInt.m1811constructorimpl(Integer.highestOneBit(i));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m1985takeHighestOneBitxj2QHRw(short s) {
        return UShort.m1997constructorimpl((short) Integer.highestOneBit(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m1986takeLowestOneBit7apg3OU(byte b) {
        return UByte.m1734constructorimpl((byte) Integer.lowestOneBit(b & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m1987takeLowestOneBitVKZWuLQ(long j) {
        return ULong.m1890constructorimpl(Long.lowestOneBit(j));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m1988takeLowestOneBitWZ4Q5Ns(int i) {
        return UInt.m1811constructorimpl(Integer.lowestOneBit(i));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m1989takeLowestOneBitxj2QHRw(short s) {
        return UShort.m1997constructorimpl((short) Integer.lowestOneBit(s & UShort.MAX_VALUE));
    }
}
