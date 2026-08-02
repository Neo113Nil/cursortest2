package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\f\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0007\u001a'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\n\u001a'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\f\u001a'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u000e"}, d2 = {"Lkotlin/UByteArray;", "p0", "", "p1", "p2", "", "Camera2StreamConfigurationMap", "([BII)V", "Lkotlin/UShortArray;", "getHighSpeedVideoFpsRangesFor", "([SII)V", "Lkotlin/UIntArray;", "([III)V", "Lkotlin/ULongArray;", "([JII)V", "array", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UArraySortingKt {
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m23562sortArray4UcCI2c(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        Camera2StreamConfigurationMap(bArr, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m23563sortArrayAa5vz7o(short[] sArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        getHighSpeedVideoFpsRangesFor(sArr, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m23564sortArrayoBK06Vg(int[] iArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        Camera2StreamConfigurationMap(iArr, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m23561sortArraynroSd4(long[] jArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        Camera2StreamConfigurationMap(jArr, i, i2 - 1);
    }

    private static final void Camera2StreamConfigurationMap(long[] jArr, int i, int i2) {
        while (true) {
            long m23507getsVKNKU = kotlin.ULongArray.m23507getsVKNKU(jArr, (i + i2) / 2);
            int i3 = i;
            int i4 = i2;
            while (i3 <= i4) {
                while (java.lang.Long.compareUnsigned(kotlin.ULongArray.m23507getsVKNKU(jArr, i3), m23507getsVKNKU) < 0) {
                    i3++;
                }
                while (java.lang.Long.compareUnsigned(kotlin.ULongArray.m23507getsVKNKU(jArr, i4), m23507getsVKNKU) > 0) {
                    i4--;
                }
                if (i3 <= i4) {
                    long m23507getsVKNKU2 = kotlin.ULongArray.m23507getsVKNKU(jArr, i3);
                    kotlin.ULongArray.m23512setk8EXiF4(jArr, i3, kotlin.ULongArray.m23507getsVKNKU(jArr, i4));
                    kotlin.ULongArray.m23512setk8EXiF4(jArr, i4, m23507getsVKNKU2);
                    i3++;
                    i4--;
                }
            }
            int i5 = i3 - 1;
            if (i < i5) {
                Camera2StreamConfigurationMap(jArr, i, i5);
            }
            if (i3 >= i2) {
                return;
            } else {
                i = i3;
            }
        }
    }

    private static final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
        int i3;
        while (true) {
            byte m23459getw2LRezQ = kotlin.UByteArray.m23459getw2LRezQ(bArr, (i + i2) / 2);
            int i4 = i;
            int i5 = i2;
            while (i4 <= i5) {
                while (true) {
                    i3 = m23459getw2LRezQ & 255;
                    if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m23459getw2LRezQ(bArr, i4) & 255, i3) >= 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m23459getw2LRezQ(bArr, i5) & 255, i3) > 0) {
                    i5--;
                }
                if (i4 <= i5) {
                    byte m23459getw2LRezQ2 = kotlin.UByteArray.m23459getw2LRezQ(bArr, i4);
                    kotlin.UByteArray.m23464setVurrAj0(bArr, i4, kotlin.UByteArray.m23459getw2LRezQ(bArr, i5));
                    kotlin.UByteArray.m23464setVurrAj0(bArr, i5, m23459getw2LRezQ2);
                    i4++;
                    i5--;
                }
            }
            int i6 = i4 - 1;
            if (i < i6) {
                Camera2StreamConfigurationMap(bArr, i, i6);
            }
            if (i4 >= i2) {
                return;
            } else {
                i = i4;
            }
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(short[] sArr, int i, int i2) {
        int i3;
        while (true) {
            short m23531getMh2AYeg = kotlin.UShortArray.m23531getMh2AYeg(sArr, (i + i2) / 2);
            int i4 = i;
            int i5 = i2;
            while (i4 <= i5) {
                while (true) {
                    short m23531getMh2AYeg2 = kotlin.UShortArray.m23531getMh2AYeg(sArr, i4);
                    i3 = m23531getMh2AYeg & kotlin.UShort.MAX_VALUE;
                    if (kotlin.jvm.internal.Intrinsics.compare(m23531getMh2AYeg2 & kotlin.UShort.MAX_VALUE, i3) >= 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.m23531getMh2AYeg(sArr, i5) & kotlin.UShort.MAX_VALUE, i3) > 0) {
                    i5--;
                }
                if (i4 <= i5) {
                    short m23531getMh2AYeg3 = kotlin.UShortArray.m23531getMh2AYeg(sArr, i4);
                    kotlin.UShortArray.m23536set01HTLdE(sArr, i4, kotlin.UShortArray.m23531getMh2AYeg(sArr, i5));
                    kotlin.UShortArray.m23536set01HTLdE(sArr, i5, m23531getMh2AYeg3);
                    i4++;
                    i5--;
                }
            }
            int i6 = i4 - 1;
            if (i < i6) {
                getHighSpeedVideoFpsRangesFor(sArr, i, i6);
            }
            if (i4 >= i2) {
                return;
            } else {
                i = i4;
            }
        }
    }

    private static final void Camera2StreamConfigurationMap(int[] iArr, int i, int i2) {
        while (true) {
            int m23483getpVg5ArA = kotlin.UIntArray.m23483getpVg5ArA(iArr, (i + i2) / 2);
            int i3 = i;
            int i4 = i2;
            while (i3 <= i4) {
                while (java.lang.Integer.compareUnsigned(kotlin.UIntArray.m23483getpVg5ArA(iArr, i3), m23483getpVg5ArA) < 0) {
                    i3++;
                }
                while (java.lang.Integer.compareUnsigned(kotlin.UIntArray.m23483getpVg5ArA(iArr, i4), m23483getpVg5ArA) > 0) {
                    i4--;
                }
                if (i3 <= i4) {
                    int m23483getpVg5ArA2 = kotlin.UIntArray.m23483getpVg5ArA(iArr, i3);
                    kotlin.UIntArray.m23488setVXSXFK8(iArr, i3, kotlin.UIntArray.m23483getpVg5ArA(iArr, i4));
                    kotlin.UIntArray.m23488setVXSXFK8(iArr, i4, m23483getpVg5ArA2);
                    i3++;
                    i4--;
                }
            }
            int i5 = i3 - 1;
            if (i < i5) {
                Camera2StreamConfigurationMap(iArr, i, i5);
            }
            if (i3 >= i2) {
                return;
            } else {
                i = i3;
            }
        }
    }
}
