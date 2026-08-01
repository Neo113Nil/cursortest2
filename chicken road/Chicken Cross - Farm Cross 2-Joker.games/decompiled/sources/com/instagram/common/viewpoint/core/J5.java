package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class J5 extends AbstractRunnableC2417Wc {
    public static byte[] A02;
    public final /* synthetic */ C2706d4 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public J5(C2706d4 c2706d4, C4A c4a) {
        this.A00 = c2706d4;
        this.A01 = c4a;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C1967Ek c1967Ek;
        C1967Ek c1967Ek2;
        c1967Ek = this.A00.A0D;
        if (c1967Ek.getState() != EnumC2872fm.A02) {
            return;
        }
        c1967Ek2 = this.A00.A0D;
        if (c1967Ek2.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}
