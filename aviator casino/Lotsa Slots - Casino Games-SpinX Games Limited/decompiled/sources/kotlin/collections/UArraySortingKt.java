package kotlin.collections;

/* compiled from: UArraySorting.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m11261partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte m10877getw2LRezQ = kotlin.UByteArray.m10877getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m10877getw2LRezQ & 255;
                if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m10877getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m10877getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte m10877getw2LRezQ2 = kotlin.UByteArray.m10877getw2LRezQ(bArr, i);
                kotlin.UByteArray.m10882setVurrAj0(bArr, i, kotlin.UByteArray.m10877getw2LRezQ(bArr, i2));
                kotlin.UByteArray.m10882setVurrAj0(bArr, i2, m10877getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m11265quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int m11261partition4UcCI2c = m11261partition4UcCI2c(bArr, i, i2);
        int i3 = m11261partition4UcCI2c - 1;
        if (i < i3) {
            m11265quickSort4UcCI2c(bArr, i, i3);
        }
        if (m11261partition4UcCI2c < i2) {
            m11265quickSort4UcCI2c(bArr, m11261partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m11262partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short m11140getMh2AYeg = kotlin.UShortArray.m11140getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int m11140getMh2AYeg2 = kotlin.UShortArray.m11140getMh2AYeg(sArr, i) & kotlin.UShort.MAX_VALUE;
                i3 = m11140getMh2AYeg & kotlin.UShort.MAX_VALUE;
                if (kotlin.jvm.internal.Intrinsics.compare(m11140getMh2AYeg2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.m11140getMh2AYeg(sArr, i2) & kotlin.UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short m11140getMh2AYeg3 = kotlin.UShortArray.m11140getMh2AYeg(sArr, i);
                kotlin.UShortArray.m11145set01HTLdE(sArr, i, kotlin.UShortArray.m11140getMh2AYeg(sArr, i2));
                kotlin.UShortArray.m11145set01HTLdE(sArr, i2, m11140getMh2AYeg3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m11266quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int m11262partitionAa5vz7o = m11262partitionAa5vz7o(sArr, i, i2);
        int i3 = m11262partitionAa5vz7o - 1;
        if (i < i3) {
            m11266quickSortAa5vz7o(sArr, i, i3);
        }
        if (m11262partitionAa5vz7o < i2) {
            m11266quickSortAa5vz7o(sArr, m11262partitionAa5vz7o, i2);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m11263partitionoBK06Vg(int[] iArr, int i, int i2) {
        int compare;
        int compare2;
        int m10956getpVg5ArA = kotlin.UIntArray.m10956getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (compare < 0) {
                i++;
            }
            while (compare2 > 0) {
                i2--;
            }
            if (i <= i2) {
                int m10956getpVg5ArA2 = kotlin.UIntArray.m10956getpVg5ArA(iArr, i);
                kotlin.UIntArray.m10961setVXSXFK8(iArr, i, kotlin.UIntArray.m10956getpVg5ArA(iArr, i2));
                kotlin.UIntArray.m10961setVXSXFK8(iArr, i2, m10956getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m11267quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int m11263partitionoBK06Vg = m11263partitionoBK06Vg(iArr, i, i2);
        int i3 = m11263partitionoBK06Vg - 1;
        if (i < i3) {
            m11267quickSortoBK06Vg(iArr, i, i3);
        }
        if (m11263partitionoBK06Vg < i2) {
            m11267quickSortoBK06Vg(iArr, m11263partitionoBK06Vg, i2);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: partition--nroSd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m11260partitionnroSd4(long[] jArr, int i, int i2) {
        int compare;
        int compare2;
        long m11035getsVKNKU = kotlin.ULongArray.m11035getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (compare < 0) {
                i++;
            }
            while (compare2 > 0) {
                i2--;
            }
            if (i <= i2) {
                long m11035getsVKNKU2 = kotlin.ULongArray.m11035getsVKNKU(jArr, i);
                kotlin.ULongArray.m11040setk8EXiF4(jArr, i, kotlin.ULongArray.m11035getsVKNKU(jArr, i2));
                kotlin.ULongArray.m11040setk8EXiF4(jArr, i2, m11035getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m11264quickSortnroSd4(long[] jArr, int i, int i2) {
        int m11260partitionnroSd4 = m11260partitionnroSd4(jArr, i, i2);
        int i3 = m11260partitionnroSd4 - 1;
        if (i < i3) {
            m11264quickSortnroSd4(jArr, i, i3);
        }
        if (m11260partitionnroSd4 < i2) {
            m11264quickSortnroSd4(jArr, m11260partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m11269sortArray4UcCI2c(byte[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m11265quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m11270sortArrayAa5vz7o(short[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m11266quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m11271sortArrayoBK06Vg(int[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m11267quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m11268sortArraynroSd4(long[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m11264quickSortnroSd4(array, i, i2 - 1);
    }
}
