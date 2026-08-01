package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C17414z {
    public static byte[] A02;
    public static final C17414z A03;
    public static final C17414z A04;
    public final int A00;
    public final int A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28};
    }

    static {
        A01();
        A03 = new C17414z(-1, -1);
        A04 = new C17414z(0, 0);
    }

    public C17414z(int i, int i2) {
        AbstractC17143y.A07((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.A01 = i;
        this.A00 = i2;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17414z)) {
            return false;
        }
        C17414z c17414z = (C17414z) obj;
        return this.A01 == c17414z.A01 && this.A00 == c17414z.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}
