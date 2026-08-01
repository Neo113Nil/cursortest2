package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3104jm extends AbstractRunnableC2417Wc {
    public static byte[] A01;
    public final /* synthetic */ C3103jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C3104jm(C3103jl c3103jl) {
        this.A00 = c3103jl;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2930gi c2930gi;
        AbstractC2576ay abstractC2576ay;
        C3105jn c3105jn;
        c2930gi = this.A00.A03;
        c2930gi.A0F().AKw();
        abstractC2576ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c3105jn = this.A00.A00;
        abstractC2576ay.loadUrl(append.append(c3105jn.A03()).toString());
    }
}
