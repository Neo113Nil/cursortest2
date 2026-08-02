package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.g8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1323g8 implements InterfaceC0676Pi {
    public static byte[] A01;
    public final /* synthetic */ C02006g A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C1323g8(C02006g c02006g) {
        this.A00 = c02006g;
    }

    private final void A02(C0677Pj c0677Pj) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Pi
    public final void AD2(C0677Pj c0677Pj) {
        A02(c0677Pj);
        throw null;
    }
}
