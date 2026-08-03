package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.qN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2199qN {
    public static <K, V> java.util.Map<K, V> A00(int expectedSize) {
        return com.facebook.ads.redexgen.core.C2037nh.A0B(expectedSize);
    }

    public static <T> T[] A01(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 0);
        }
        return (T[]) java.util.Arrays.copyOf(tArr, i);
    }

    public static <T> T[] A02(java.lang.Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) java.util.Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
