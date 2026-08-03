package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0576Ao implements com.facebook.ads.redexgen.core.SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public com.facebook.ads.redexgen.core.InterfaceC2252rY A00;
    public com.facebook.ads.redexgen.core.InterfaceC2240rI A01;
    public com.facebook.ads.redexgen.core.C2228r5 A02;
    public final com.facebook.ads.redexgen.core.InterfaceC2241rJ A04;
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A05;
    public final java.util.LinkedHashMap<java.lang.Integer, java.lang.Runnable> A06 = new java.util.LinkedHashMap<>();
    public final com.facebook.ads.redexgen.core.InterfaceC2240rI A03 = new com.facebook.ads.redexgen.core.C0577Ap(this);

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C0576Ao(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.InterfaceC2252rY interfaceC2252rY, com.facebook.ads.redexgen.core.InterfaceC2241rJ interfaceC2241rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2252rY;
        this.A04 = interfaceC2241rJ;
    }

    public static com.facebook.ads.redexgen.core.C0576Ao A01() {
        return new com.facebook.ads.redexgen.core.C0576Ao(new com.facebook.ads.redexgen.core.ViewpointQeConfig(), new com.facebook.ads.redexgen.core.C0579Ar(), null);
    }

    private void A05(com.facebook.ads.redexgen.core.AbstractC2243rL abstractC2243rL, com.facebook.ads.redexgen.core.InterfaceC2248rQ interfaceC2248rQ, com.facebook.ads.redexgen.core.InterfaceC0574Al interfaceC0574Al, com.facebook.ads.redexgen.core.ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = com.facebook.ads.redexgen.core.C2228r5.A01(this.A05, abstractC2243rL, interfaceC2248rQ, interfaceC0574Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2249rU c2249rU) {
        com.facebook.ads.redexgen.core.C2228r5 c2228r5 = this.A02;
        if (c2228r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2249rU != null) {
                c2228r5.A07(dspViewableNode, c2249rU);
            } else {
                c2228r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2249rU c2249rU, com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        com.facebook.ads.redexgen.core.C2228r5 c2228r5 = this.A02;
        if (c2228r5 != null && dspViewableNode != null && c2245rN != null) {
            if (this.A05.A00 && c2249rU != null) {
                c2245rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2245rN.A08 + c2249rU;
                c2228r5.A08(dspViewableNode, c2249rU, c2245rN);
            } else {
                c2228r5.A09(dspViewableNode, c2245rN);
            }
        }
    }

    public final void A08(android.view.View view) {
        A06(view != null ? com.facebook.ads.redexgen.core.ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(android.view.View view, com.facebook.ads.redexgen.core.C2245rN<?, ?> c2245rN) {
        A07(view != null ? com.facebook.ads.redexgen.core.ViewpointViewNode.A00(view) : null, null, c2245rN);
    }

    public final void A0A(com.facebook.ads.redexgen.core.AbstractC2243rL abstractC2243rL, android.view.View view) {
        if (abstractC2243rL != null && view != null) {
            A05(abstractC2243rL, new com.facebook.ads.redexgen.core.C0578Aq(view, this.A00), new com.facebook.ads.redexgen.core.C03681u(null), null);
        }
    }
}
