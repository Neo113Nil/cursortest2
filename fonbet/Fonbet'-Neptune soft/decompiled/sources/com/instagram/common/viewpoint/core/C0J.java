package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0J extends AbstractC00400a {
    public static byte[] A00;
    public static final BZ A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{9, 34, 43, 56, 7, 43, 62, 41, 34, 47, 56, 100, 36, 37, 36, 47, 98, 99};
    }

    static {
        A01();
        A01 = new C0J();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0J() {
        new AbstractC00811p(r0) { // from class: com.facebook.ads.redexgen.X.0a
            public final String A00;

            {
                this.A00 = (String) AbstractC1495jA.A04(r2);
            }

            public final String toString() {
                return this.A00;
            }
        };
        final String A002 = A00(0, 18, 12);
    }

    @Override // com.instagram.common.viewpoint.core.BZ
    public final int A08(CharSequence sequence, int start) {
        int length = sequence.length();
        AbstractC1495jA.A01(start, length);
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.BZ
    public final boolean A09(char c) {
        return false;
    }
}
