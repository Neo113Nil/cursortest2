package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0083\u0080\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0081\u0080\u0004¢\u0006\u0004\b\u001e\u0010\u000b\u001a)\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0081\u0080\u0004¢\u0006\u0004\b\u001f\u0010\u0010\u001a)\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0081\u0080\u0004¢\u0006\u0004\b \u0010\u0015\u001a)\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0081\u0080\u0004¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m2171partitionnroSd4(long[] jArr, int i, int i2) {
        long j;
        long m1950getsVKNKU = ULongArray.m1950getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                j = m1950getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(ULongArray.m1950getsVKNKU(jArr, i) ^ Long.MIN_VALUE, j) >= 0) {
                    break;
                }
                i++;
            }
            while (Long.compare(ULongArray.m1950getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, j) > 0) {
                i2--;
            }
            if (i <= i2) {
                long m1950getsVKNKU2 = ULongArray.m1950getsVKNKU(jArr, i);
                ULongArray.m1955setk8EXiF4(jArr, i, ULongArray.m1950getsVKNKU(jArr, i2));
                ULongArray.m1955setk8EXiF4(jArr, i2, m1950getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m2172partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte m1792getw2LRezQ = UByteArray.m1792getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int m1792getw2LRezQ2 = UByteArray.m1792getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i3 = m1792getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m1792getw2LRezQ2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m1792getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte m1792getw2LRezQ3 = UByteArray.m1792getw2LRezQ(bArr, i);
                UByteArray.m1797setVurrAj0(bArr, i, UByteArray.m1792getw2LRezQ(bArr, i2));
                UByteArray.m1797setVurrAj0(bArr, i2, m1792getw2LRezQ3);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m2173partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short m2055getMh2AYeg = UShortArray.m2055getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int m2055getMh2AYeg2 = UShortArray.m2055getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = m2055getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m2055getMh2AYeg2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m2055getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short m2055getMh2AYeg3 = UShortArray.m2055getMh2AYeg(sArr, i);
                UShortArray.m2060set01HTLdE(sArr, i, UShortArray.m2055getMh2AYeg(sArr, i2));
                UShortArray.m2060set01HTLdE(sArr, i2, m2055getMh2AYeg3);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m2174partitionoBK06Vg(int[] iArr, int i, int i2) {
        int i3;
        int m1871getpVg5ArA = UIntArray.m1871getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m1871getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(UIntArray.m1871getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Integer.compare(UIntArray.m1871getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                int m1871getpVg5ArA2 = UIntArray.m1871getpVg5ArA(iArr, i);
                UIntArray.m1876setVXSXFK8(iArr, i, UIntArray.m1871getpVg5ArA(iArr, i2));
                UIntArray.m1876setVXSXFK8(iArr, i2, m1871getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m2175quickSortnroSd4(long[] jArr, int i, int i2) {
        int m2171partitionnroSd4 = m2171partitionnroSd4(jArr, i, i2);
        int i3 = m2171partitionnroSd4 - 1;
        if (i < i3) {
            m2175quickSortnroSd4(jArr, i, i3);
        }
        if (m2171partitionnroSd4 < i2) {
            m2175quickSortnroSd4(jArr, m2171partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m2176quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int m2172partition4UcCI2c = m2172partition4UcCI2c(bArr, i, i2);
        int i3 = m2172partition4UcCI2c - 1;
        if (i < i3) {
            m2176quickSort4UcCI2c(bArr, i, i3);
        }
        if (m2172partition4UcCI2c < i2) {
            m2176quickSort4UcCI2c(bArr, m2172partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m2177quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int m2173partitionAa5vz7o = m2173partitionAa5vz7o(sArr, i, i2);
        int i3 = m2173partitionAa5vz7o - 1;
        if (i < i3) {
            m2177quickSortAa5vz7o(sArr, i, i3);
        }
        if (m2173partitionAa5vz7o < i2) {
            m2177quickSortAa5vz7o(sArr, m2173partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m2178quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int m2174partitionoBK06Vg = m2174partitionoBK06Vg(iArr, i, i2);
        int i3 = m2174partitionoBK06Vg - 1;
        if (i < i3) {
            m2178quickSortoBK06Vg(iArr, i, i3);
        }
        if (m2174partitionoBK06Vg < i2) {
            m2178quickSortoBK06Vg(iArr, m2174partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m2179sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m2175quickSortnroSd4(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m2180sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m2176quickSort4UcCI2c(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m2181sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m2177quickSortAa5vz7o(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m2182sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m2178quickSortoBK06Vg(array, i, i2 - 1);
    }
}
